Dim VB_feedback_init
Dim VB_feedback_Inputs
Dim VB_feedback_Outputs



Function VB_feedback( argArray)
    Dim retVal
    
    If IsEmpty(argArray(0)) Then
        ' do compute
        retVal = VB_feedback_compute(argArray)
    ElseIf True Then
        ' do register
        VB_feedback_init = -1
        retVal = VB_feedback_register()

    ElseIf argArray(0) = "compute" Then
        ' do compute
        retVal = VB_feedback_compute(argArray)
    
    Else
        ' bad call
        retVal = Empty

    End If

    VB_feedback = retVal

End Function

Function VB_feedback_register()

    Redim argStr(5)
    ' Outputs

    argStr(0) = "ArgumentType = Output ; Type = Parameter ; ArgumentName = Torque ; BasicType = Vector"
    
    ' Inputs
    argStr(1) = "ArgumentType = Input ; ArgumentName = time ; Name = Epoch "
    argStr(2) = "ArgumentType = Input ; ArgumentName = alt ; Type = Altitude ; Derivative = Yes "
    argStr(3) = "ArgumentType = Input ; ArgumentName = erratt ; Type = Altitude ; RefName = Body ; RefSource = Satellite/BOBSAT1"
    argStr(4) = "ArgumentType = Input ; ArgumentName = IMx ; Type = Inertia "

    VB_feedback_register = argStr

End Function

' COMPUTE SECTION

Function VB_feedback_compute( stateData )

    If VB_feedback_init < 0 Then

        ' get interface classes if register was called
        Set VB_feedback_Inputs = g_GetPluginArrayInterface("VB_feedback_Inputs")
        Set VB_feedback_Outputs = g_GetPluginArrayInterface("VB_feedback_Outputs")

        VB_feedback_init = 1

    End If

    ' get input values

    Dim att, erratt, IMtx

    att = stateData(VB_feedback_Inputs.att)
    erratt = stateData(VB_feedback_Inputs.erratt)
    IMtx = stateData(VB_feedback_Inputs.IMtx)

    ' create return array of correct size
    Redim returnValue(1)

    ' vec that is returned is an array of 3 doubles
    Redim torque(3)

    Dim k, c
    k = 2.0
    c = 0.8

    Redim temp(3)
    temp(0) = (k * erratt(0) * erratt(3) ) + ( c * att(4) )
    temp(1) = (k * erratt(1) * erratt(3) ) + ( c * att(5) )
    temp(2) = (k * erratt(2) * erratt(3) ) + ( c * att(6) )

    torque(0) = -1 * IMtx(0) * temp(0) + -1 * IMtx(3) * temp(1) + -1 * IMtx(6) * temp(2)
    torque(0) = -1 * IMtx(1) * temp(0) + -1 * IMtx(4) * temp(1) + -1 * IMtx(7) * temp(2)
    torque(0) = -1 * IMtx(2) * temp(0) + -1 * IMtx(5) * temp(1) + -1 * IMtx(8) * temp(2)

    returnValue(VB_feedback_Outputs.Torque) = torque
    VB_feedback_compute = returnValue

End Function
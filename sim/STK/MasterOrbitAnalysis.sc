stk.v.13.0
WrittenBy    STK_v13.0.0
BEGIN Scenario
    Name		 MasterOrbitAnalysis

    BEGIN Epoch

        Epoch		 17 Nov 2024 20:00:00.000000000
        SmartEpoch		
        BEGIN EVENT
            Epoch		 17 Nov 2024 20:00:00.000000000
            EventEpoch		
            BEGIN EVENT
                Type		 EVENT_LINKTO
                Name		 AnalysisStartTime
            END EVENT
            EpochState		 Implicit
        END EVENT


    END Epoch

    BEGIN Interval

        Start		 17 Nov 2024 20:00:00.000000000
        Stop		 18 Nov 2025 20:00:00.000000000
        SmartInterval		
        BEGIN EVENTINTERVAL
            BEGIN Interval
                Start		 17 Nov 2024 20:00:00.000000000
                Stop		 18 Nov 2025 20:00:00.000000000
            END Interval
            IntervalState		 Explicit
        END EVENTINTERVAL

        EpochUsesAnalStart		 No
        AnimStartUsesAnalStart		 No
        AnimStopUsesAnalStop		 Yes

    END Interval

    BEGIN EOPFile

        EOPFilename		 EOP-v1.1.txt

    END EOPFile

    BEGIN GlobalPrefs
        SatelliteNoOrbWarning		 No
        MissilePerigeeWarning		 No
        MissileStopTimeWarning		 No
        AircraftWGS84Warning		 Always
    END GlobalPrefs

    BEGIN CentralBody

        PrimaryBody		 Earth

    END CentralBody

    BEGIN CentralBodyTerrain

        BEGIN CentralBody
            Name		 Earth
            UseTerrainCache		 Yes
            TotalCacheSize		 402653184

            BEGIN StreamingTerrain
                UseCurrentStreamingTerrainServer		 Yes
                CurrentStreamingTerrainServerName		 https://api-ion.agi.com
                StreamingTerrainTilesetName		 Cesium World Terrain
                StreamingTerrainServerName		 assets.agi.com/stk-terrain/
                StreamingTerrainAzimuthElevationMaskEnabled		 No
                StreamingTerrainObscurationEnabled		 No
                StreamingTerrainCoverageGridObscurationEnabled		 No
            END StreamingTerrain
        END CentralBody

    END CentralBodyTerrain

    BEGIN StarCollection

        Name		 Hipparcos 2 Mag 8

    END StarCollection

    BEGIN ScenarioLicenses
        Module		 stk_mission_air
        Module		 stk_mission_level1
        Module		 stk_mission_level2
        Module		 stk_mission_level3
        Module		 stk_mission_space
    END ScenarioLicenses

    BEGIN QuickReports

        BEGIN Report
            Name		 Euler Angles
            Type		 Report
            BaseDir		 User
            Style		 Euler Angles
            AGIViewer		 Yes
            Instance		 Satellite/BOBSAT1
            BEGIN TimeData
                BEGIN Section
                    SectionNumber		 1
                    SectionType		 2
                    ShowIntervals		 No
                    BEGIN IntervalList

                        DateUnitAbrv		 UTCG

                        BEGIN Intervals

"18 Nov 2024 17:05:41.374000000" "18 Nov 2024 18:05:41.374000000"
                        END Intervals

                    END IntervalList

                    TimeType		 Interval
                    SamplingType		 FixedStep
                    Step		 1
                    TimeBound		 0
                END Section
            END TimeData
            DisplayOnLoad		 No
            FrameType		 0
            DockCircleID		 0
            DockID		 0
            WindowRectLeft		 503
            WindowRectTop		 1029
            WindowRectRight		 740
            WindowRectBottom		 1068
        END Report

        BEGIN Report
            Name		 Access
            Type		 Graph
            BaseDir		 Install
            Style		 Access
            AGIViewer		 No
            Instance		 Satellite/BOBSAT1/Sensor/Payload
            BEGIN InstanceList
                Instance		 AreaTarget/Big_Buttonwillow_Lake_197
            END InstanceList
            BEGIN TimeData
                BEGIN Section
                    SectionNumber		 1
                    SectionType		 4
                    ShowIntervals		 No
                    TimeType		 Availability
                    SamplingType		 Default
                    TimeBound		 0
                END Section
            END TimeData
            DisplayOnLoad		 No
            FrameType		 0
            DockCircleID		 0
            DockID		 0
            WindowRectLeft		 740
            WindowRectTop		 1029
            WindowRectRight		 977
            WindowRectBottom		 1085
        END Report

        BEGIN Report
            Name		 Access1
            Type		 Report
            BaseDir		 Install
            Style		 Access
            AGIViewer		 Yes
            Instance		 Satellite/BOBSAT1/Sensor/Payload
            BEGIN InstanceList
                Instance		 AreaTarget/Big_Buttonwillow_Lake_197
            END InstanceList
            BEGIN TimeData
                BEGIN Section
                    SectionNumber		 1
                    SectionType		 4
                    ShowIntervals		 No
                    TimeType		 Availability
                    SamplingType		 Default
                    TimeBound		 0
                END Section
            END TimeData
            DisplayOnLoad		 No
            FrameType		 0
            DockCircleID		 0
            DockID		 0
            WindowRectLeft		 377
            WindowRectTop		 467
            WindowRectRight		 1913
            WindowRectBottom		 1038
        END Report

        BEGIN Report
            Name		 Access2
            Type		 Report
            BaseDir		 Install
            Style		 Access
            AGIViewer		 Yes
            Instance		 Satellite/BOBSAT1/Sensor/Payload
            BEGIN InstanceList
                Instance		 AreaTarget/Big_Buttonwillow_Lake_197
            END InstanceList
            BEGIN TimeData
                BEGIN Section
                    SectionNumber		 1
                    SectionType		 4
                    ShowIntervals		 No
                    TimeType		 Availability
                    SamplingType		 Default
                    TimeBound		 0
                END Section
            END TimeData
            DisplayOnLoad		 No
            FrameType		 0
            DockCircleID		 0
            DockID		 0
            WindowRectLeft		 625
            WindowRectTop		 357
            WindowRectRight		 2161
            WindowRectBottom		 928
        END Report

        BEGIN Report
            Name		 Access3
            Type		 Report
            BaseDir		 Install
            Style		 Access
            AGIViewer		 Yes
            Instance		 Satellite/BOBSAT1/Sensor/Payload
            BEGIN InstanceList
                Instance		 AreaTarget/Big_Buttonwillow_Lake_197
            END InstanceList
            BEGIN TimeData
                BEGIN Section
                    SectionNumber		 1
                    SectionType		 4
                    ShowIntervals		 No
                    TimeType		 Availability
                    SamplingType		 Default
                    TimeBound		 0
                END Section
            END TimeData
            DisplayOnLoad		 No
            FrameType		 0
            DockCircleID		 0
            DockID		 0
            WindowRectLeft		 576
            WindowRectTop		 198
            WindowRectRight		 2112
            WindowRectBottom		 769
        END Report

        BEGIN Report
            Name		 Access4
            Type		 Report
            BaseDir		 Install
            Style		 Access
            AGIViewer		 Yes
            Instance		 Satellite/BOBSAT1/Sensor/Payload
            BEGIN InstanceList
                Instance		 AreaTarget/Big_Buttonwillow_Lake_197
            END InstanceList
            BEGIN TimeData
                BEGIN Section
                    SectionNumber		 1
                    SectionType		 4
                    ShowIntervals		 No
                    TimeType		 Availability
                    SamplingType		 Default
                    TimeBound		 0
                END Section
            END TimeData
            DisplayOnLoad		 Yes
            FrameType		 0
            DockCircleID		 0
            DockID		 0
            WindowRectLeft		 805
            WindowRectTop		 447
            WindowRectRight		 2247
            WindowRectBottom		 1066
        END Report

        BEGIN Report
            Name		 Access5
            Type		 Report
            BaseDir		 Install
            Style		 Access
            AGIViewer		 Yes
            Instance		 Satellite/BOBSAT1/Sensor/Payload
            BEGIN InstanceList
                Instance		 AreaTarget/Big_Buttonwillow_Lake_197
            END InstanceList
            BEGIN TimeData
                BEGIN Section
                    SectionNumber		 1
                    SectionType		 4
                    ShowIntervals		 No
                    TimeType		 Availability
                    SamplingType		 Default
                    TimeBound		 0
                END Section
            END TimeData
            DisplayOnLoad		 Yes
            FrameType		 0
            DockCircleID		 0
            DockID		 0
            WindowRectLeft		 501
            WindowRectTop		 143
            WindowRectRight		 1947
            WindowRectBottom		 766
        END Report

        BEGIN Report
            Name		 Access6
            Type		 Report
            BaseDir		 Install
            Style		 Access
            AGIViewer		 Yes
            Instance		 Satellite/BOBSAT1/Sensor/Payload
            BEGIN InstanceList
                Instance		 AreaTarget/Big_Buttonwillow_Lake_197
            END InstanceList
            BEGIN TimeData
                BEGIN Section
                    SectionNumber		 1
                    SectionType		 4
                    ShowIntervals		 No
                    TimeType		 Availability
                    SamplingType		 Default
                    TimeBound		 0
                END Section
            END TimeData
            DisplayOnLoad		 Yes
            FrameType		 0
            DockCircleID		 0
            DockID		 0
            WindowRectLeft		 539
            WindowRectTop		 181
            WindowRectRight		 1985
            WindowRectBottom		 804
        END Report

        BEGIN Report
            Name		 Access7
            Type		 Report
            BaseDir		 Install
            Style		 Access
            AGIViewer		 Yes
            Instance		 Satellite/BOBSAT1/Sensor/Payload
            BEGIN InstanceList
                Instance		 AreaTarget/Big_Buttonwillow_Lake_197
            END InstanceList
            BEGIN TimeData
                BEGIN Section
                    SectionNumber		 1
                    SectionType		 4
                    ShowIntervals		 No
                    TimeType		 Availability
                    SamplingType		 Default
                    TimeBound		 0
                END Section
            END TimeData
            DisplayOnLoad		 Yes
            FrameType		 0
            DockCircleID		 0
            DockID		 0
            WindowRectLeft		 490
            WindowRectTop		 98
            WindowRectRight		 2262
            WindowRectBottom		 1081
        END Report
    END QuickReports

    BEGIN Extensions

        BEGIN ScenarioEOIR
            BEGIN EOIRCloudData Earth
            END EOIRCloudData
            BEGIN EOIRTEXTUREMAPSDATA Earth
            END EOIRTEXTUREMAPSDATA
        END ScenarioEOIR

        BEGIN ClsApp
            RangeConstraint		 5000
            ApoPeriPad		 30000
            OrbitPathPad		 100000
            TimeDistPad		 30000
            OutOfDate		 2592000
            MaxApoPeriStep		 900
            ApoPeriAngle		 0.7853981633974483
            UseApogeePerigeeFilter		 Yes
            UsePathFilter		 No
            UseTimeFilter		 No
            UseOutOfDate		 Yes
            CreateSats		 No
            MaxSatsToCreate		 500
            UseModelScale		 No
            ModelScale		 0
            UseCrossRefDb		 Yes
            CollisionDB		 stkAllTLE.tce
            CollisionCrossRefDB		 stkAllTLE.sd
            ShowLine		 Yes
            AnimHighlight		 Yes
            StaticHighlight		 Yes
            UseLaunchWindow		 No
            LaunchWindowUseEntireTraj		 Yes
            LaunchWindowTrajMETStart		 0
            LaunchWindowTrajMETStop		 900
            LaunchWindowStart		 31536000
            LaunchWindowStop		 31622400
            LaunchMETOffset		 0
            LaunchWindowUseSecEphem		 No 
            LaunchWindowUseScenFolderForSecEphem		 Yes
            LaunchWindowUsePrimEphem		 No 
            LaunchWindowUseScenFolderForPrimEphem		 Yes
            LaunchWindowIntervalPtr		
            BEGIN EVENTINTERVAL
                BEGIN Interval
                    Start		 17 Nov 2025 20:00:00.000000000
                    Stop		 18 Nov 2025 20:00:00.000000000
                END Interval
                IntervalState		 Explicit
            END EVENTINTERVAL

            LaunchWindowUsePrimMTO		 No 
            GroupLaunches		 No 
            LWTimeConvergence		 0.001
            LWRelValueConvergence		 1e-08
            LWTSRTimeConvergence		 0.0001
            LWTSRRelValueConvergence		 1e-10
            LaunchWindowStep		 300
            MaxTSRStep		  1.8000000000000000e+02
            MaxTSRRelMotion		  2.0000000000000000e+01
            UseLaunchArea		 No 
            LaunchAreaOrientation		 North
            LaunchAreaAzimuth		 0
            LaunchAreaXLimits		 -10000 10000
            LaunchAreaYLimits		 -10000 10000
            LaunchAreaNumXIntrPnts		 1
            LaunchAreaNumYIntrPnts		 1
            LaunchAreaAltReference		 Ellipsoid
            TargetSameStop		 No 
            SkipSurfaceMetric		 No 
            LWAreaTSRRelValueConvergence		 1e-10
            AreaLaunchWindowStep		 300
            AreaMaxTSRStep		  3.0000000000000000e+01
            AreaMaxTSRRelMotion		 1
            ShowLaunchArea		 No 
            ShowBlackoutTracks		 No 
            ShowClearedTracks		 No 
            UseObjectForClearedColor		 No 
            BlackoutColor		 #ff0000
            ClearedColor		 #ffffff
            ShowTracksSegments		 No 
            ShowMinRangeTracks		 No 
            MinRangeTrackTimeStep		 0.5
            UsePrimStepForTracks		 Yes
            GfxTracksTimeStep		 30
            GfxAreaNumXIntrPnts		 1
            GfxAreaNumYIntrPnts		 1
            CreateLaunchMTO		 No 
            CovarianceSigmaScale		 3
            CovarianceMode		 None 
        END ClsApp

        BEGIN Units
            DistanceUnit		 Kilometers
            TimeUnit		 Seconds
            DateFormat		 GregorianUTC
            AngleUnit		 Degrees
            MassUnit		 Kilograms
            PowerUnit		 dBW
            FrequencyUnit		 Gigahertz
            SmallDistanceUnit		 Meters
            LatitudeUnit		 Degrees
            LongitudeUnit		 Degrees
            DurationUnit		 Hr:Min:Sec
            Temperature		 Kelvin
            SmallTimeUnit		 Seconds
            RatioUnit		 Decibel
            RcsUnit		 Decibel
            DopplerVelocityUnit		 MetersperSecond
            SARTimeResProdUnit		 Meter-Second
            ForceUnit		 Newtons
            PressureUnit		 Pascals
            SpecificImpulseUnit		 Seconds
            PRFUnit		 Kilohertz
            BandwidthUnit		 Megahertz
            SmallVelocityUnit		 CentimetersperSecond
            Percent		 Percentage
            AviatorDistanceUnit		 NauticalMiles
            AviatorTimeUnit		 Hours
            AviatorAltitudeUnit		 Feet
            AviatorFuelQuantityUnit		 Pounds
            AviatorRunwayLengthUnit		 Kilofeet
            AviatorBearingAngleUnit		 Degrees
            AviatorAngleOfAttackUnit		 Degrees
            AviatorAttitudeAngleUnit		 Degrees
            AviatorGUnit		 StandardSeaLevelG
            SolidAngle		 Steradians
            AviatorTSFCUnit		 TSFCLbmHrLbf
            AviatorPSFCUnit		 PSFCLbmHrHp
            AviatorForceUnit		 Pounds
            AviatorPowerUnit		 Horsepower
            MicroDistanceUnit		 Microns
            SpectralBandwidthUnit		 Hertz
            AviatorAltTimeUnit		 Minutes
            AviatorSmallTimeUnit		 Seconds
            AviatorEnergyUnit		 kilowatt-hours
            BitsUnit		 MegaBits
            PowerLinearUnit		 Watts
            RatioLinearUnit		 Units
            RcsLinearUnit		 SquareMeters
            RadiationDose		 Rads
            MagneticFieldUnit		 nanoTesla
            VoltageUnit		 Volts
            RadiationShieldThickness		 Mils
            ParticleEnergy		 MeV
            RepeatCount		 Cycles
        END Units

        BEGIN ReportUnits
            DistanceUnit		 Kilometers
            TimeUnit		 Seconds
            DateFormat		 GregorianUTC
            AngleUnit		 Degrees
            MassUnit		 Kilograms
            PowerUnit		 dBW
            FrequencyUnit		 Gigahertz
            SmallDistanceUnit		 Meters
            LatitudeUnit		 Degrees
            LongitudeUnit		 Degrees
            DurationUnit		 Hr:Min:Sec
            Temperature		 Kelvin
            SmallTimeUnit		 Seconds
            RatioUnit		 Decibel
            RcsUnit		 Decibel
            DopplerVelocityUnit		 MetersperSecond
            SARTimeResProdUnit		 Meter-Second
            ForceUnit		 Newtons
            PressureUnit		 Pascals
            SpecificImpulseUnit		 Seconds
            PRFUnit		 Kilohertz
            BandwidthUnit		 Megahertz
            SmallVelocityUnit		 CentimetersperSecond
            Percent		 Percentage
            AviatorDistanceUnit		 NauticalMiles
            AviatorTimeUnit		 Hours
            AviatorAltitudeUnit		 Feet
            AviatorFuelQuantityUnit		 Pounds
            AviatorRunwayLengthUnit		 Kilofeet
            AviatorBearingAngleUnit		 Degrees
            AviatorAngleOfAttackUnit		 Degrees
            AviatorAttitudeAngleUnit		 Degrees
            AviatorGUnit		 StandardSeaLevelG
            SolidAngle		 Steradians
            AviatorTSFCUnit		 TSFCLbmHrLbf
            AviatorPSFCUnit		 PSFCLbmHrHp
            AviatorForceUnit		 Pounds
            AviatorPowerUnit		 Horsepower
            MicroDistanceUnit		 Microns
            SpectralBandwidthUnit		 Hertz
            AviatorAltTimeUnit		 Minutes
            AviatorSmallTimeUnit		 Seconds
            AviatorEnergyUnit		 kilowatt-hours
            BitsUnit		 MegaBits
            PowerLinearUnit		 Watts
            RatioLinearUnit		 Units
            RcsLinearUnit		 SquareMeters
            RadiationDose		 Rads
            MagneticFieldUnit		 nanoTesla
            VoltageUnit		 Volts
            RadiationShieldThickness		 Mils
            ParticleEnergy		 MeV
            RepeatCount		 Cycles
        END ReportUnits

        BEGIN ConnectReportUnits
            DistanceUnit		 Kilometers
            TimeUnit		 Seconds
            DateFormat		 GregorianUTC
            AngleUnit		 Degrees
            MassUnit		 Kilograms
            PowerUnit		 dBW
            FrequencyUnit		 Gigahertz
            SmallDistanceUnit		 Meters
            LatitudeUnit		 Degrees
            LongitudeUnit		 Degrees
            DurationUnit		 Hr:Min:Sec
            Temperature		 Kelvin
            SmallTimeUnit		 Seconds
            RatioUnit		 Decibel
            RcsUnit		 Decibel
            DopplerVelocityUnit		 MetersperSecond
            SARTimeResProdUnit		 Meter-Second
            ForceUnit		 Newtons
            PressureUnit		 Pascals
            SpecificImpulseUnit		 Seconds
            PRFUnit		 Kilohertz
            BandwidthUnit		 Megahertz
            SmallVelocityUnit		 CentimetersperSecond
            Percent		 Percentage
            AviatorDistanceUnit		 NauticalMiles
            AviatorTimeUnit		 Hours
            AviatorAltitudeUnit		 Feet
            AviatorFuelQuantityUnit		 Pounds
            AviatorRunwayLengthUnit		 Kilofeet
            AviatorBearingAngleUnit		 Degrees
            AviatorAngleOfAttackUnit		 Degrees
            AviatorAttitudeAngleUnit		 Degrees
            AviatorGUnit		 StandardSeaLevelG
            SolidAngle		 Steradians
            AviatorTSFCUnit		 TSFCLbmHrLbf
            AviatorPSFCUnit		 PSFCLbmHrHp
            AviatorForceUnit		 Pounds
            AviatorPowerUnit		 Horsepower
            MicroDistanceUnit		 Microns
            SpectralBandwidthUnit		 Hertz
            AviatorAltTimeUnit		 Minutes
            AviatorSmallTimeUnit		 Seconds
            AviatorEnergyUnit		 kilowatt-hours
            BitsUnit		 MegaBits
            PowerLinearUnit		 Watts
            RatioLinearUnit		 Units
            RcsLinearUnit		 SquareMeters
            RadiationDose		 Rads
            MagneticFieldUnit		 nanoTesla
            VoltageUnit		 Volts
            RadiationShieldThickness		 Mils
            ParticleEnergy		 MeV
            RepeatCount		 Cycles
        END ConnectReportUnits

        BEGIN ReportFavorites
            BEGIN Class
                Name		 Satellite
                BEGIN Favorite
                    Type		 Report
                    BaseDir		 User
                    Style		 Euler Angles
                END Favorite
            END Class
            BEGIN Class
                Name		 Access
                BEGIN Favorite
                    Type		 Graph
                    BaseDir		 Install
                    Style		 Access
                END Favorite
            END Class
        END ReportFavorites

        BEGIN ADFFileData
        END ADFFileData

        BEGIN GenDb

            BEGIN Database
                DbType		 Satellite
                DefDb		 stkAllTLE.sd
                UseMyDb		 Off
                MaxMatches		 2000
                Use4SOC		 On

                BEGIN FieldDefaults

                    BEGIN Field
                        Name		 "SSC Number"
                        Default		 "*"
                    END Field

                    BEGIN Field
                        Name		 "Common Name"
                        Default		 "*"
                    END Field

                END FieldDefaults

            END Database

            BEGIN Database
                DbType		 City
                DefDb		 stkCityDb.cd
                UseMyDb		 Off
                MaxMatches		 2000
                Use4SOC		 On

                BEGIN FieldDefaults

                    BEGIN Field
                        Name		 "City Name"
                        Default		 "*"
                    END Field

                END FieldDefaults

            END Database

            BEGIN Database
                DbType		 Facility
                DefDb		 stkFacility.fd
                UseMyDb		 Off
                MaxMatches		 2000
                Use4SOC		 On

                BEGIN FieldDefaults

                END FieldDefaults

            END Database
        END GenDb

        BEGIN SOCDb
            BEGIN Defaults
            END Defaults
        END SOCDb

        BEGIN Msgp4Ext
        END Msgp4Ext

        BEGIN FileLocations
        END FileLocations

        BEGIN Author
            Optimize		 No
            UseBasicGlobe		 No
            SaveEphemeris		 Yes
            SaveScenFolder		 No
            BEGIN ExternalFileTypes
                BEGIN Type
                    FileType		 Calculation Scalar
                    Include		 Yes
                END Type
                BEGIN Type
                    FileType		 Celestial Image
                    Include		 No
                END Type
                BEGIN Type
                    FileType		 Cloud
                    Include		 Yes
                END Type
                BEGIN Type
                    FileType		 Component Supporting File
                    Include		 Yes
                END Type
                BEGIN Type
                    FileType		 EOIR Texture Map File
                    Include		 Yes
                END Type
                BEGIN Type
                    FileType		 EOP
                    Include		 Yes
                END Type
                BEGIN Type
                    FileType		 External Vector Data
                    Include		 Yes
                END Type
                BEGIN Type
                    FileType		 Globe
                    Include		 Yes
                END Type
                BEGIN Type
                    FileType		 Globe Data
                    Include		 No
                END Type
                BEGIN Type
                    FileType		 Map
                    Include		 No
                END Type
                BEGIN Type
                    FileType		 Map Image
                    Include		 No
                END Type
                BEGIN Type
                    FileType		 Marker/Label
                    Include		 Yes
                END Type
                BEGIN Type
                    FileType		 Model
                    Include		 Yes
                END Type
                BEGIN Type
                    FileType		 Object Break-up File
                    Include		 No
                END Type
                BEGIN Type
                    FileType		 Planetary Ephemeris
                    Include		 No
                END Type
                BEGIN Type
                    FileType		 Python Script
                    Include		 Yes
                END Type
                BEGIN Type
                    FileType		 Report Style Script
                    Include		 Yes
                END Type
                BEGIN Type
                    FileType		 Report/Graph Style
                    Include		 Yes
                END Type
                BEGIN Type
                    FileType		 Scalar Calculation File
                    Include		 Yes
                END Type
                BEGIN Type
                    FileType		 Terrain
                    Include		 Yes
                END Type
                BEGIN Type
                    FileType		 Volume Grid Intervals File
                    Include		 Yes
                END Type
                BEGIN Type
                    FileType		 Volumetric File
                    Include		 Yes
                END Type
                BEGIN Type
                    FileType		 WTM
                    Include		 Yes
                END Type
            END ExternalFileTypes
            ReadOnly		 No
            ViewerPassword		 No
            STKPassword		 No
            ExcludeInstallFiles		 No
            BEGIN ExternalFileList
            END ExternalFileList
        END Author

        BEGIN ExportDataFile
            FileType		 Ephemeris
            IntervalType		 Ephemeris
            TimePeriodStart		 0
            TimePeriodStop		 0
            StepType		 Ephemeris
            StepSize		 60
            EphemType		 STK
            UseVehicleCentralBody		 Yes
            CentralBody		 Earth
            SatelliteID		 -200000
            CoordSys		 ICRF
            NonSatCoordSys		 Fixed
            InterpolateBoundaries		 Yes
            EphemFormat		 Current
            InterpType		 9
            InterpOrder		 5
            AttCoordSys		 Fixed
            Quaternions		 0
            ExportCovar		 Position
            AttitudeFormat		 Current
            TimePrecision		 6
            CCSDSDateFormat		 YMD
            CCSDSEphFormat		 SciNotation
            CCSDSTimeSystem		 UTC
            CCSDSRefFrame		 ICRF
            UseSatCenterAndFrame		 No
            IncludeCovariance		 No
            IncludeAcceleration		 No
            CCSDSFileFormat		 KVN
        END ExportDataFile

        BEGIN Desc
        END Desc

        BEGIN RfEnv
<?xml version = "1.0" standalone = "yes"?>
<SCOPE>
    <VAR name = "PropagationChannel">
        <SCOPE>
            <VAR name = "UseITU618Section2p5">
                <BOOL>false</BOOL>
            </VAR>
            <VAR name = "UseCloudFogModel">
                <BOOL>false</BOOL>
            </VAR>
            <VAR name = "CloudFogModel">
                <VAR name = "ITU-R_P840-7">
                    <SCOPE Class = "LinkEmbedControl">
                        <VAR name = "ReferenceType">
                            <STRING>&quot;Unlinked&quot;</STRING>
                        </VAR>
                        <VAR name = "Component">
                            <VAR name = "ITU-R_P840-7">
                                <SCOPE Class = "CloudFogLossModel">
                                    <VAR name = "Version">
                                        <STRING>&quot;1.0.0 a&quot;</STRING>
                                    </VAR>
                                    <VAR name = "IdentifierInformation">
                                        <SCOPE>
                                            <VAR name = "Identifier">
                                                <STRING>&quot;{9193E280-5073-4BE6-BD5B-45068B077C4C}&quot;</STRING>
                                            </VAR>
                                            <VAR name = "Version">
                                                <STRING>&quot;1&quot;</STRING>
                                            </VAR>
                                            <VAR name = "SdfInformation">
                                                <SCOPE>
                                                    <VAR name = "Version">
                                                        <STRING>&quot;0.0&quot;</STRING>
                                                    </VAR>
                                                    <VAR name = "Url">
                                                        <STRING>&quot;&quot;</STRING>
                                                    </VAR>
                                                </SCOPE>
                                            </VAR>
                                            <VAR name = "SourceIdentifierInformation">
                                                <SCOPE>
                                                    <VAR name = "Identifier">
                                                        <STRING>&quot;{E7BA4392-37BE-4446-A5C7-6068165B166A}&quot;</STRING>
                                                    </VAR>
                                                    <VAR name = "Version">
                                                        <STRING>&quot;1&quot;</STRING>
                                                    </VAR>
                                                    <VAR name = "SdfInformation">
                                                        <SCOPE>
                                                            <VAR name = "Version">
                                                                <STRING>&quot;0.0&quot;</STRING>
                                                            </VAR>
                                                            <VAR name = "Url">
                                                                <STRING>&quot;&quot;</STRING>
                                                            </VAR>
                                                        </SCOPE>
                                                    </VAR>
                                                </SCOPE>
                                            </VAR>
                                        </SCOPE>
                                    </VAR>
                                    <VAR name = "ComponentName">
                                        <STRING>&quot;ITU-R_P840-7&quot;</STRING>
                                    </VAR>
                                    <VAR name = "Description">
                                        <STRING>&quot;ITU-R P840-7&quot;</STRING>
                                    </VAR>
                                    <VAR name = "Type">
                                        <STRING>&quot;ITU-R P840-7&quot;</STRING>
                                    </VAR>
                                    <VAR name = "UserComment">
                                        <STRING>&quot;ITU-R P840-7&quot;</STRING>
                                    </VAR>
                                    <VAR name = "ReadOnly">
                                        <BOOL>false</BOOL>
                                    </VAR>
                                    <VAR name = "Clonable">
                                        <BOOL>true</BOOL>
                                    </VAR>
                                    <VAR name = "Category">
                                        <STRING>&quot;@Top&quot;</STRING>
                                    </VAR>
                                    <VAR name = "LiquidWaterDensityValueChoice">
                                        <STRING>&quot;Liquid Water Content Density Value&quot;</STRING>
                                    </VAR>
                                    <VAR name = "CloudCeiling">
                                        <QUANTITY Dimension = "DistanceUnit" Unit = "m">
                                            <REAL>3000.0</REAL>
                                        </QUANTITY>
                                    </VAR>
                                    <VAR name = "CloudLayerThickness">
                                        <QUANTITY Dimension = "DistanceUnit" Unit = "m">
                                            <REAL>500.0</REAL>
                                        </QUANTITY>
                                    </VAR>
                                    <VAR name = "CloudTemp">
                                        <QUANTITY Dimension = "Temperature" Unit = "K">
                                            <REAL>273.15</REAL>
                                        </QUANTITY>
                                    </VAR>
                                    <VAR name = "CloudLiqWaterDensity">
                                        <QUANTITY Dimension = "SmallDensity" Unit = "kg*m^-3">
                                            <REAL>0.0001</REAL>
                                        </QUANTITY>
                                    </VAR>
                                    <VAR name = "AnnualAveragePercentValue">
                                        <QUANTITY Dimension = "Percent" Unit = "unitValue">
                                            <REAL>0.01</REAL>
                                        </QUANTITY>
                                    </VAR>
                                    <VAR name = "MonthlyAveragePercentValue">
                                        <QUANTITY Dimension = "Percent" Unit = "unitValue">
                                            <REAL>0.01</REAL>
                                        </QUANTITY>
                                    </VAR>
                                    <VAR name = "LiqWaterAverageDataMonth">
                                        <INT>1</INT>
                                    </VAR>
                                    <VAR name = "UseRainHeightAsCloudThickness">
                                        <BOOL>false</BOOL>
                                    </VAR>
                                </SCOPE>
                            </VAR>
                        </VAR>
                    </SCOPE>
                </VAR>
            </VAR>
            <VAR name = "UseTropoScintModel">
                <BOOL>false</BOOL>
            </VAR>
            <VAR name = "TropoScintModel">
                <VAR name = "ITU-R_P618-12">
                    <SCOPE Class = "LinkEmbedControl">
                        <VAR name = "ReferenceType">
                            <STRING>&quot;Unlinked&quot;</STRING>
                        </VAR>
                        <VAR name = "Component">
                            <VAR name = "ITU-R_P618-12">
                                <SCOPE Class = "TropoScintLossModel">
                                    <VAR name = "Version">
                                        <STRING>&quot;1.0.0 a&quot;</STRING>
                                    </VAR>
                                    <VAR name = "IdentifierInformation">
                                        <SCOPE>
                                            <VAR name = "Identifier">
                                                <STRING>&quot;{3B1F34BB-6287-48B1-9049-C4C669256DEE}&quot;</STRING>
                                            </VAR>
                                            <VAR name = "Version">
                                                <STRING>&quot;1&quot;</STRING>
                                            </VAR>
                                            <VAR name = "SdfInformation">
                                                <SCOPE>
                                                    <VAR name = "Version">
                                                        <STRING>&quot;0.0&quot;</STRING>
                                                    </VAR>
                                                    <VAR name = "Url">
                                                        <STRING>&quot;&quot;</STRING>
                                                    </VAR>
                                                </SCOPE>
                                            </VAR>
                                            <VAR name = "SourceIdentifierInformation">
                                                <SCOPE>
                                                    <VAR name = "Identifier">
                                                        <STRING>&quot;{BC27045B-5A54-458E-BF17-702BCFE40CA8}&quot;</STRING>
                                                    </VAR>
                                                    <VAR name = "Version">
                                                        <STRING>&quot;1&quot;</STRING>
                                                    </VAR>
                                                    <VAR name = "SdfInformation">
                                                        <SCOPE>
                                                            <VAR name = "Version">
                                                                <STRING>&quot;0.0&quot;</STRING>
                                                            </VAR>
                                                            <VAR name = "Url">
                                                                <STRING>&quot;&quot;</STRING>
                                                            </VAR>
                                                        </SCOPE>
                                                    </VAR>
                                                </SCOPE>
                                            </VAR>
                                        </SCOPE>
                                    </VAR>
                                    <VAR name = "ComponentName">
                                        <STRING>&quot;ITU-R_P618-12&quot;</STRING>
                                    </VAR>
                                    <VAR name = "Description">
                                        <STRING>&quot;ITU-R P618-12&quot;</STRING>
                                    </VAR>
                                    <VAR name = "Type">
                                        <STRING>&quot;ITU-R P618-12&quot;</STRING>
                                    </VAR>
                                    <VAR name = "UserComment">
                                        <STRING>&quot;ITU-R P618-12&quot;</STRING>
                                    </VAR>
                                    <VAR name = "ReadOnly">
                                        <BOOL>false</BOOL>
                                    </VAR>
                                    <VAR name = "Clonable">
                                        <BOOL>true</BOOL>
                                    </VAR>
                                    <VAR name = "Category">
                                        <STRING>&quot;@Top&quot;</STRING>
                                    </VAR>
                                    <VAR name = "FadeDepthAverageTimeChoice">
                                        <STRING>&quot;Fade depth for the average year&quot;</STRING>
                                    </VAR>
                                    <VAR name = "FadeExceeded">
                                        <QUANTITY Dimension = "Percent" Unit = "unitValue">
                                            <REAL>0.001</REAL>
                                        </QUANTITY>
                                    </VAR>
                                    <VAR name = "PercentTimeRefracGrad">
                                        <QUANTITY Dimension = "Percent" Unit = "unitValue">
                                            <REAL>0.1</REAL>
                                        </QUANTITY>
                                    </VAR>
                                    <VAR name = "SurfaceTemperature">
                                        <QUANTITY Dimension = "Temperature" Unit = "K">
                                            <REAL>273.15</REAL>
                                        </QUANTITY>
                                    </VAR>
                                </SCOPE>
                            </VAR>
                        </VAR>
                    </SCOPE>
                </VAR>
            </VAR>
            <VAR name = "UseIonoFadingModel">
                <BOOL>false</BOOL>
            </VAR>
            <VAR name = "IonoFadingModel">
                <VAR name = "ITU-R_P531-13">
                    <SCOPE Class = "LinkEmbedControl">
                        <VAR name = "ReferenceType">
                            <STRING>&quot;Unlinked&quot;</STRING>
                        </VAR>
                        <VAR name = "Component">
                            <VAR name = "ITU-R_P531-13">
                                <SCOPE Class = "IonoFadingLossModel">
                                    <VAR name = "Version">
                                        <STRING>&quot;1.0.0 a&quot;</STRING>
                                    </VAR>
                                    <VAR name = "IdentifierInformation">
                                        <SCOPE>
                                            <VAR name = "Identifier">
                                                <STRING>&quot;{92EFB0C1-D8CF-4C77-A0B7-824A9E0EF370}&quot;</STRING>
                                            </VAR>
                                            <VAR name = "Version">
                                                <STRING>&quot;1&quot;</STRING>
                                            </VAR>
                                            <VAR name = "SdfInformation">
                                                <SCOPE>
                                                    <VAR name = "Version">
                                                        <STRING>&quot;0.0&quot;</STRING>
                                                    </VAR>
                                                    <VAR name = "Url">
                                                        <STRING>&quot;&quot;</STRING>
                                                    </VAR>
                                                </SCOPE>
                                            </VAR>
                                            <VAR name = "SourceIdentifierInformation">
                                                <SCOPE>
                                                    <VAR name = "Identifier">
                                                        <STRING>&quot;{1699891E-9828-41C7-ADD4-4BE20EFC34A8}&quot;</STRING>
                                                    </VAR>
                                                    <VAR name = "Version">
                                                        <STRING>&quot;1&quot;</STRING>
                                                    </VAR>
                                                    <VAR name = "SdfInformation">
                                                        <SCOPE>
                                                            <VAR name = "Version">
                                                                <STRING>&quot;0.0&quot;</STRING>
                                                            </VAR>
                                                            <VAR name = "Url">
                                                                <STRING>&quot;&quot;</STRING>
                                                            </VAR>
                                                        </SCOPE>
                                                    </VAR>
                                                </SCOPE>
                                            </VAR>
                                        </SCOPE>
                                    </VAR>
                                    <VAR name = "ComponentName">
                                        <STRING>&quot;ITU-R_P531-13&quot;</STRING>
                                    </VAR>
                                    <VAR name = "Description">
                                        <STRING>&quot;ITU-R P531-13&quot;</STRING>
                                    </VAR>
                                    <VAR name = "Type">
                                        <STRING>&quot;ITU-R P531-13&quot;</STRING>
                                    </VAR>
                                    <VAR name = "UserComment">
                                        <STRING>&quot;ITU-R P531-13&quot;</STRING>
                                    </VAR>
                                    <VAR name = "ReadOnly">
                                        <BOOL>false</BOOL>
                                    </VAR>
                                    <VAR name = "Clonable">
                                        <BOOL>true</BOOL>
                                    </VAR>
                                    <VAR name = "Category">
                                        <STRING>&quot;@Top&quot;</STRING>
                                    </VAR>
                                </SCOPE>
                            </VAR>
                        </VAR>
                    </SCOPE>
                </VAR>
            </VAR>
            <VAR name = "UseRainModel">
                <BOOL>false</BOOL>
            </VAR>
            <VAR name = "RainModel">
                <VAR name = "ITU-R_P618-13">
                    <SCOPE Class = "LinkEmbedControl">
                        <VAR name = "ReferenceType">
                            <STRING>&quot;Unlinked&quot;</STRING>
                        </VAR>
                        <VAR name = "Component">
                            <VAR name = "ITU-R_P618-13">
                                <SCOPE Class = "RainLossModel">
                                    <VAR name = "Version">
                                        <STRING>&quot;1.0.0 a&quot;</STRING>
                                    </VAR>
                                    <VAR name = "IdentifierInformation">
                                        <SCOPE>
                                            <VAR name = "Identifier">
                                                <STRING>&quot;{48EFE69A-6D1C-4103-93D1-3F82B86234E9}&quot;</STRING>
                                            </VAR>
                                            <VAR name = "Version">
                                                <STRING>&quot;1&quot;</STRING>
                                            </VAR>
                                            <VAR name = "SdfInformation">
                                                <SCOPE>
                                                    <VAR name = "Version">
                                                        <STRING>&quot;0.0&quot;</STRING>
                                                    </VAR>
                                                    <VAR name = "Url">
                                                        <STRING>&quot;&quot;</STRING>
                                                    </VAR>
                                                </SCOPE>
                                            </VAR>
                                            <VAR name = "SourceIdentifierInformation">
                                                <SCOPE>
                                                    <VAR name = "Identifier">
                                                        <STRING>&quot;{62382EA0-41C0-45F7-AA94-ACC684509D66}&quot;</STRING>
                                                    </VAR>
                                                    <VAR name = "Version">
                                                        <STRING>&quot;1&quot;</STRING>
                                                    </VAR>
                                                    <VAR name = "SdfInformation">
                                                        <SCOPE>
                                                            <VAR name = "Version">
                                                                <STRING>&quot;0.0&quot;</STRING>
                                                            </VAR>
                                                            <VAR name = "Url">
                                                                <STRING>&quot;&quot;</STRING>
                                                            </VAR>
                                                        </SCOPE>
                                                    </VAR>
                                                </SCOPE>
                                            </VAR>
                                        </SCOPE>
                                    </VAR>
                                    <VAR name = "ComponentName">
                                        <STRING>&quot;ITU-R_P618-13&quot;</STRING>
                                    </VAR>
                                    <VAR name = "Description">
                                        <STRING>&quot;ITU-R P618-13 rain model&quot;</STRING>
                                    </VAR>
                                    <VAR name = "Type">
                                        <STRING>&quot;ITU-R P618-13&quot;</STRING>
                                    </VAR>
                                    <VAR name = "UserComment">
                                        <STRING>&quot;ITU-R P618-13 rain model&quot;</STRING>
                                    </VAR>
                                    <VAR name = "ReadOnly">
                                        <BOOL>false</BOOL>
                                    </VAR>
                                    <VAR name = "Clonable">
                                        <BOOL>true</BOOL>
                                    </VAR>
                                    <VAR name = "Category">
                                        <STRING>&quot;@Top&quot;</STRING>
                                    </VAR>
                                    <VAR name = "SurfaceTemperature">
                                        <QUANTITY Dimension = "Temperature" Unit = "K">
                                            <REAL>273.15</REAL>
                                        </QUANTITY>
                                    </VAR>
                                    <VAR name = "EnableDepolarizationLoss">
                                        <BOOL>false</BOOL>
                                    </VAR>
                                    <VAR name = "EnableITU1510">
                                        <BOOL>false</BOOL>
                                    </VAR>
                                    <VAR name = "UseAnnualITU1510">
                                        <BOOL>true</BOOL>
                                    </VAR>
                                    <VAR name = "ITU1510Month">
                                        <STRING>&quot;January&quot;</STRING>
                                    </VAR>
                                </SCOPE>
                            </VAR>
                        </VAR>
                    </SCOPE>
                </VAR>
            </VAR>
            <VAR name = "UseAtmosAbsorptionModel">
                <BOOL>false</BOOL>
            </VAR>
            <VAR name = "AtmosAbsorptionModel">
                <VAR name = "ITU-R_P676-13">
                    <SCOPE Class = "LinkEmbedControl">
                        <VAR name = "ReferenceType">
                            <STRING>&quot;Unlinked&quot;</STRING>
                        </VAR>
                        <VAR name = "Component">
                            <VAR name = "ITU-R_P676-13">
                                <SCOPE Class = "AtmosphericAbsorptionModel">
                                    <VAR name = "Version">
                                        <STRING>&quot;1.0.1 a&quot;</STRING>
                                    </VAR>
                                    <VAR name = "IdentifierInformation">
                                        <SCOPE>
                                            <VAR name = "Identifier">
                                                <STRING>&quot;{8E7F6EE7-5DD3-440C-8129-9436A496F603}&quot;</STRING>
                                            </VAR>
                                            <VAR name = "Version">
                                                <STRING>&quot;1&quot;</STRING>
                                            </VAR>
                                            <VAR name = "SdfInformation">
                                                <SCOPE>
                                                    <VAR name = "Version">
                                                        <STRING>&quot;0.0&quot;</STRING>
                                                    </VAR>
                                                    <VAR name = "Url">
                                                        <STRING>&quot;&quot;</STRING>
                                                    </VAR>
                                                </SCOPE>
                                            </VAR>
                                            <VAR name = "SourceIdentifierInformation">
                                                <SCOPE>
                                                    <VAR name = "Identifier">
                                                        <STRING>&quot;{514A641E-EE86-4A59-ABB2-0969D49DBCAC}&quot;</STRING>
                                                    </VAR>
                                                    <VAR name = "Version">
                                                        <STRING>&quot;1&quot;</STRING>
                                                    </VAR>
                                                    <VAR name = "SdfInformation">
                                                        <SCOPE>
                                                            <VAR name = "Version">
                                                                <STRING>&quot;0.0&quot;</STRING>
                                                            </VAR>
                                                            <VAR name = "Url">
                                                                <STRING>&quot;&quot;</STRING>
                                                            </VAR>
                                                        </SCOPE>
                                                    </VAR>
                                                </SCOPE>
                                            </VAR>
                                        </SCOPE>
                                    </VAR>
                                    <VAR name = "ComponentName">
                                        <STRING>&quot;ITU-R_P676-13&quot;</STRING>
                                    </VAR>
                                    <VAR name = "Description">
                                        <STRING>&quot;ITU-R P676-13 gaseous absorption model&quot;</STRING>
                                    </VAR>
                                    <VAR name = "Type">
                                        <STRING>&quot;ITU-R P676-13&quot;</STRING>
                                    </VAR>
                                    <VAR name = "UserComment">
                                        <STRING>&quot;ITU-R P676-13 gaseous absorption model&quot;</STRING>
                                    </VAR>
                                    <VAR name = "ReadOnly">
                                        <BOOL>false</BOOL>
                                    </VAR>
                                    <VAR name = "Clonable">
                                        <BOOL>true</BOOL>
                                    </VAR>
                                    <VAR name = "Category">
                                        <STRING>&quot;@Top&quot;</STRING>
                                    </VAR>
                                    <VAR name = "UseApproxMethod">
                                        <BOOL>false</BOOL>
                                    </VAR>
                                    <VAR name = "UseWaterVaporFromSection2_2">
                                        <BOOL>false</BOOL>
                                    </VAR>
                                    <VAR name = "AtmosphereDataType">
                                        <STRING>&quot;Annual Global&quot;</STRING>
                                    </VAR>
                                </SCOPE>
                            </VAR>
                        </VAR>
                    </SCOPE>
                </VAR>
            </VAR>
            <VAR name = "UseUrbanTerresPropLossModel">
                <BOOL>false</BOOL>
            </VAR>
            <VAR name = "UrbanTerresPropLossModel">
                <VAR name = "Two_Ray">
                    <SCOPE Class = "LinkEmbedControl">
                        <VAR name = "ReferenceType">
                            <STRING>&quot;Unlinked&quot;</STRING>
                        </VAR>
                        <VAR name = "Component">
                            <VAR name = "Two_Ray">
                                <SCOPE Class = "UrbanTerrestrialPropagationLossModel">
                                    <VAR name = "Version">
                                        <STRING>&quot;1.0.0 a&quot;</STRING>
                                    </VAR>
                                    <VAR name = "IdentifierInformation">
                                        <SCOPE>
                                            <VAR name = "Identifier">
                                                <STRING>&quot;{0F52E0C2-D524-4A15-A7D3-D2BCD38CD9AF}&quot;</STRING>
                                            </VAR>
                                            <VAR name = "Version">
                                                <STRING>&quot;1&quot;</STRING>
                                            </VAR>
                                            <VAR name = "SdfInformation">
                                                <SCOPE>
                                                    <VAR name = "Version">
                                                        <STRING>&quot;0.0&quot;</STRING>
                                                    </VAR>
                                                    <VAR name = "Url">
                                                        <STRING>&quot;&quot;</STRING>
                                                    </VAR>
                                                </SCOPE>
                                            </VAR>
                                            <VAR name = "SourceIdentifierInformation">
                                                <SCOPE>
                                                    <VAR name = "Identifier">
                                                        <STRING>&quot;{60FA4C9B-5D74-4743-A449-66CEB6DFC97B}&quot;</STRING>
                                                    </VAR>
                                                    <VAR name = "Version">
                                                        <STRING>&quot;1&quot;</STRING>
                                                    </VAR>
                                                    <VAR name = "SdfInformation">
                                                        <SCOPE>
                                                            <VAR name = "Version">
                                                                <STRING>&quot;0.0&quot;</STRING>
                                                            </VAR>
                                                            <VAR name = "Url">
                                                                <STRING>&quot;&quot;</STRING>
                                                            </VAR>
                                                        </SCOPE>
                                                    </VAR>
                                                </SCOPE>
                                            </VAR>
                                        </SCOPE>
                                    </VAR>
                                    <VAR name = "ComponentName">
                                        <STRING>&quot;Two_Ray&quot;</STRING>
                                    </VAR>
                                    <VAR name = "Description">
                                        <STRING>&quot;Two Ray (Fourth Power Law) atmospheric absorption model&quot;</STRING>
                                    </VAR>
                                    <VAR name = "Type">
                                        <STRING>&quot;Two Ray&quot;</STRING>
                                    </VAR>
                                    <VAR name = "UserComment">
                                        <STRING>&quot;Two Ray (Fourth Power Law) atmospheric absorption model&quot;</STRING>
                                    </VAR>
                                    <VAR name = "ReadOnly">
                                        <BOOL>false</BOOL>
                                    </VAR>
                                    <VAR name = "Clonable">
                                        <BOOL>true</BOOL>
                                    </VAR>
                                    <VAR name = "Category">
                                        <STRING>&quot;@Top&quot;</STRING>
                                    </VAR>
                                    <VAR name = "SurfaceTemperature">
                                        <QUANTITY Dimension = "Temperature" Unit = "K">
                                            <REAL>273.15</REAL>
                                        </QUANTITY>
                                    </VAR>
                                    <VAR name = "LossFactor">
                                        <REAL>1.0</REAL>
                                    </VAR>
                                </SCOPE>
                            </VAR>
                        </VAR>
                    </SCOPE>
                </VAR>
            </VAR>
            <VAR name = "UseCustomA">
                <BOOL>false</BOOL>
            </VAR>
            <VAR name = "UseCustomB">
                <BOOL>false</BOOL>
            </VAR>
            <VAR name = "UseCustomC">
                <BOOL>false</BOOL>
            </VAR>
        </SCOPE>
    </VAR>
    <VAR name = "EarthTemperature">
        <QUANTITY Dimension = "Temperature" Unit = "K">
            <REAL>290.0</REAL>
        </QUANTITY>
    </VAR>
    <VAR name = "RainOutagePercent">
        <REAL>0.1</REAL>
    </VAR>
    <VAR name = "ActiveCommSystem">
        <LINKTOOBJ>
            <STRING>&quot;None&quot;</STRING>
        </LINKTOOBJ>
    </VAR>
    <VAR name = "MagneticNorthPoleLatitude">
        <QUANTITY Dimension = "AngleUnit" Unit = "rad">
            <REAL>1.387536755335492</REAL>
        </QUANTITY>
    </VAR>
    <VAR name = "MagneticNorthPoleLongitude">
        <QUANTITY Dimension = "AngleUnit" Unit = "rad">
            <REAL>-1.2042771838760873</REAL>
        </QUANTITY>
    </VAR>
</SCOPE>        END RfEnv

        BEGIN LaserEnv
<?xml version = "1.0" standalone = "yes"?>
<SCOPE>
    <VAR name = "PropagationChannel">
        <SCOPE>
            <VAR name = "EnableAtmosphericLossModel">
                <BOOL>false</BOOL>
            </VAR>
            <VAR name = "AtmosphericLossModel">
                <VAR name = "Beer-Bouguer-Lambert_Law">
                    <SCOPE Class = "LinkEmbedControl">
                        <VAR name = "ReferenceType">
                            <STRING>&quot;Unlinked&quot;</STRING>
                        </VAR>
                        <VAR name = "Component">
                            <VAR name = "Beer-Bouguer-Lambert_Law">
                                <SCOPE Class = "LaserAtmosphericAbsorptionLossModel">
                                    <VAR name = "Version">
                                        <STRING>&quot;1.0.0 a&quot;</STRING>
                                    </VAR>
                                    <VAR name = "IdentifierInformation">
                                        <SCOPE>
                                            <VAR name = "Identifier">
                                                <STRING>&quot;{D7C4C009-3BDC-4899-AA82-4E3FBFD4B7C1}&quot;</STRING>
                                            </VAR>
                                            <VAR name = "Version">
                                                <STRING>&quot;1&quot;</STRING>
                                            </VAR>
                                            <VAR name = "SdfInformation">
                                                <SCOPE>
                                                    <VAR name = "Version">
                                                        <STRING>&quot;0.0&quot;</STRING>
                                                    </VAR>
                                                    <VAR name = "Url">
                                                        <STRING>&quot;&quot;</STRING>
                                                    </VAR>
                                                </SCOPE>
                                            </VAR>
                                            <VAR name = "SourceIdentifierInformation">
                                                <SCOPE>
                                                    <VAR name = "Identifier">
                                                        <STRING>&quot;{6896684B-630D-472D-8027-385684842E74}&quot;</STRING>
                                                    </VAR>
                                                    <VAR name = "Version">
                                                        <STRING>&quot;1&quot;</STRING>
                                                    </VAR>
                                                    <VAR name = "SdfInformation">
                                                        <SCOPE>
                                                            <VAR name = "Version">
                                                                <STRING>&quot;0.0&quot;</STRING>
                                                            </VAR>
                                                            <VAR name = "Url">
                                                                <STRING>&quot;&quot;</STRING>
                                                            </VAR>
                                                        </SCOPE>
                                                    </VAR>
                                                </SCOPE>
                                            </VAR>
                                        </SCOPE>
                                    </VAR>
                                    <VAR name = "ComponentName">
                                        <STRING>&quot;Beer-Bouguer-Lambert_Law&quot;</STRING>
                                    </VAR>
                                    <VAR name = "Description">
                                        <STRING>&quot;Model atmospheric loss for laser receivers using the Beer-Bouguer-Lambert Law&quot;</STRING>
                                    </VAR>
                                    <VAR name = "Type">
                                        <STRING>&quot;Beer-Bouguer-Lambert Law&quot;</STRING>
                                    </VAR>
                                    <VAR name = "UserComment">
                                        <STRING>&quot;Model atmospheric loss for laser receivers using the Beer-Bouguer-Lambert Law&quot;</STRING>
                                    </VAR>
                                    <VAR name = "ReadOnly">
                                        <BOOL>false</BOOL>
                                    </VAR>
                                    <VAR name = "Clonable">
                                        <BOOL>true</BOOL>
                                    </VAR>
                                    <VAR name = "Category">
                                        <STRING>&quot;@Top&quot;</STRING>
                                    </VAR>
                                    <VAR name = "LayerList">
                                        <LIST>
                                            <SCOPE>
                                                <VAR name = "LayerNum">
                                                    <INT>1</INT>
                                                </VAR>
                                                <VAR name = "LayerTop">
                                                    <QUANTITY Dimension = "DistanceUnit" Unit = "m">
                                                        <REAL>100000.0</REAL>
                                                    </QUANTITY>
                                                </VAR>
                                                <VAR name = "ExtinctionCoefficient">
                                                    <QUANTITY Dimension = "UnitlessPerSmallDistance" Unit = "m^-1">
                                                        <REAL>0.0</REAL>
                                                    </QUANTITY>
                                                </VAR>
                                            </SCOPE>
                                        </LIST>
                                    </VAR>
                                    <VAR name = "EnableEvenlySpacedHeights">
                                        <BOOL>true</BOOL>
                                    </VAR>
                                    <VAR name = "MaxLayerHeight">
                                        <QUANTITY Dimension = "DistanceUnit" Unit = "m">
                                            <REAL>100000.0</REAL>
                                        </QUANTITY>
                                    </VAR>
                                </SCOPE>
                            </VAR>
                        </VAR>
                    </SCOPE>
                </VAR>
            </VAR>
            <VAR name = "EnableTropoScintLossModel">
                <BOOL>false</BOOL>
            </VAR>
            <VAR name = "TropoScintLossModel">
                <VAR name = "ITU-R_P1814">
                    <SCOPE Class = "LinkEmbedControl">
                        <VAR name = "ReferenceType">
                            <STRING>&quot;Unlinked&quot;</STRING>
                        </VAR>
                        <VAR name = "Component">
                            <VAR name = "ITU-R_P1814">
                                <SCOPE Class = "LaserTropoScintLossModel">
                                    <VAR name = "Version">
                                        <STRING>&quot;1.0.0 a&quot;</STRING>
                                    </VAR>
                                    <VAR name = "IdentifierInformation">
                                        <SCOPE>
                                            <VAR name = "Identifier">
                                                <STRING>&quot;{6B6544F9-95C6-44E5-9C55-EAC551EC9D49}&quot;</STRING>
                                            </VAR>
                                            <VAR name = "Version">
                                                <STRING>&quot;1&quot;</STRING>
                                            </VAR>
                                            <VAR name = "SdfInformation">
                                                <SCOPE>
                                                    <VAR name = "Version">
                                                        <STRING>&quot;0.0&quot;</STRING>
                                                    </VAR>
                                                    <VAR name = "Url">
                                                        <STRING>&quot;&quot;</STRING>
                                                    </VAR>
                                                </SCOPE>
                                            </VAR>
                                            <VAR name = "SourceIdentifierInformation">
                                                <SCOPE>
                                                    <VAR name = "Identifier">
                                                        <STRING>&quot;{651AF2C8-7D6D-457E-8F99-1FB796A460BF}&quot;</STRING>
                                                    </VAR>
                                                    <VAR name = "Version">
                                                        <STRING>&quot;1&quot;</STRING>
                                                    </VAR>
                                                    <VAR name = "SdfInformation">
                                                        <SCOPE>
                                                            <VAR name = "Version">
                                                                <STRING>&quot;0.0&quot;</STRING>
                                                            </VAR>
                                                            <VAR name = "Url">
                                                                <STRING>&quot;&quot;</STRING>
                                                            </VAR>
                                                        </SCOPE>
                                                    </VAR>
                                                </SCOPE>
                                            </VAR>
                                        </SCOPE>
                                    </VAR>
                                    <VAR name = "ComponentName">
                                        <STRING>&quot;ITU-R_P1814&quot;</STRING>
                                    </VAR>
                                    <VAR name = "Description">
                                        <STRING>&quot;ITU-R P1814&quot;</STRING>
                                    </VAR>
                                    <VAR name = "Type">
                                        <STRING>&quot;ITU-R P1814&quot;</STRING>
                                    </VAR>
                                    <VAR name = "UserComment">
                                        <STRING>&quot;ITU-R P1814&quot;</STRING>
                                    </VAR>
                                    <VAR name = "ReadOnly">
                                        <BOOL>false</BOOL>
                                    </VAR>
                                    <VAR name = "Clonable">
                                        <BOOL>true</BOOL>
                                    </VAR>
                                    <VAR name = "Category">
                                        <STRING>&quot;@Top&quot;</STRING>
                                    </VAR>
                                    <VAR name = "AtmosphericTurbulenceModel">
                                        <VAR name = "Constant">
                                            <SCOPE Class = "AtmosphericTurbulenceModel">
                                                <VAR name = "ConstantRefractiveIndexStructureParameter">
                                                    <REAL>1.7e-14</REAL>
                                                </VAR>
                                                <VAR name = "Type">
                                                    <STRING>&quot;Constant&quot;</STRING>
                                                </VAR>
                                            </SCOPE>
                                        </VAR>
                                    </VAR>
                                </SCOPE>
                            </VAR>
                        </VAR>
                    </SCOPE>
                </VAR>
            </VAR>
        </SCOPE>
    </VAR>
</SCOPE>        END LaserEnv

        BEGIN ComponentManager
        END ComponentManager

        BEGIN RadarCrossSection
<?xml version = "1.0" standalone = "yes"?>
<SCOPE>
    <VAR name = "Model">
        <VAR name = "Radar_Cross_Section">
            <SCOPE Class = "LinkEmbedControl">
                <VAR name = "ReferenceType">
                    <STRING>&quot;Unlinked&quot;</STRING>
                </VAR>
                <VAR name = "Component">
                    <VAR name = "Radar_Cross_Section">
                        <SCOPE Class = "RCS">
                            <VAR name = "Version">
                                <STRING>&quot;1.0.0 a&quot;</STRING>
                            </VAR>
                            <VAR name = "IdentifierInformation">
                                <SCOPE>
                                    <VAR name = "Identifier">
                                        <STRING>&quot;{87C0F62F-5022-47FC-93C2-0ECD18E00C9B}&quot;</STRING>
                                    </VAR>
                                    <VAR name = "Version">
                                        <STRING>&quot;1&quot;</STRING>
                                    </VAR>
                                    <VAR name = "SdfInformation">
                                        <SCOPE>
                                            <VAR name = "Version">
                                                <STRING>&quot;0.0&quot;</STRING>
                                            </VAR>
                                            <VAR name = "Url">
                                                <STRING>&quot;&quot;</STRING>
                                            </VAR>
                                        </SCOPE>
                                    </VAR>
                                    <VAR name = "SourceIdentifierInformation">
                                        <SCOPE>
                                            <VAR name = "Identifier">
                                                <STRING>&quot;{EF03E656-5AB7-4F70-A363-4753683F2BD4}&quot;</STRING>
                                            </VAR>
                                            <VAR name = "Version">
                                                <STRING>&quot;1&quot;</STRING>
                                            </VAR>
                                            <VAR name = "SdfInformation">
                                                <SCOPE>
                                                    <VAR name = "Version">
                                                        <STRING>&quot;0.0&quot;</STRING>
                                                    </VAR>
                                                    <VAR name = "Url">
                                                        <STRING>&quot;&quot;</STRING>
                                                    </VAR>
                                                </SCOPE>
                                            </VAR>
                                        </SCOPE>
                                    </VAR>
                                </SCOPE>
                            </VAR>
                            <VAR name = "ComponentName">
                                <STRING>&quot;Radar_Cross_Section&quot;</STRING>
                            </VAR>
                            <VAR name = "Description">
                                <STRING>&quot;Radar Cross Section&quot;</STRING>
                            </VAR>
                            <VAR name = "Type">
                                <STRING>&quot;Radar Cross Section&quot;</STRING>
                            </VAR>
                            <VAR name = "UserComment">
                                <STRING>&quot;Radar Cross Section&quot;</STRING>
                            </VAR>
                            <VAR name = "ReadOnly">
                                <BOOL>false</BOOL>
                            </VAR>
                            <VAR name = "Clonable">
                                <BOOL>true</BOOL>
                            </VAR>
                            <VAR name = "Category">
                                <STRING>&quot;@Top&quot;</STRING>
                            </VAR>
                            <VAR name = "FrequencyBandList">
                                <LIST>
                                    <SCOPE>
                                        <VAR name = "MinFrequency">
                                            <QUANTITY Dimension = "BandwidthUnit" Unit = "Hz">
                                                <REAL>2997920.0</REAL>
                                            </QUANTITY>
                                        </VAR>
                                        <VAR name = "ComputeTypeStrategy">
                                            <VAR name = "Constant Value">
                                                <SCOPE Class = "RCS Compute Strategy">
                                                    <VAR name = "ConstantValue">
                                                        <QUANTITY Dimension = "RcsUnit" Unit = "sqm">
                                                            <REAL>1.0</REAL>
                                                        </QUANTITY>
                                                    </VAR>
                                                    <VAR name = "Type">
                                                        <STRING>&quot;Constant Value&quot;</STRING>
                                                    </VAR>
                                                    <VAR name = "ComponentName">
                                                        <STRING>&quot;Constant Value&quot;</STRING>
                                                    </VAR>
                                                </SCOPE>
                                            </VAR>
                                        </VAR>
                                        <VAR name = "SwerlingCase">
                                            <STRING>&quot;0&quot;</STRING>
                                        </VAR>
                                    </SCOPE>
                                </LIST>
                            </VAR>
                        </SCOPE>
                    </VAR>
                </VAR>
            </SCOPE>
        </VAR>
    </VAR>
</SCOPE>        END RadarCrossSection

        BEGIN Gator
            RPOComponentsLoaded		 False
            RPOPythonComponentsLoaded		 False

            BEGIN PASSIVESAFETYUIVALS
                SPHERICALANALYSIS		 On
                CUSTOMINTERVAL		 Off
                SPHERICALRADIUS		  1.0000000000000000e+03
                PERAXR		  1.0000000000000000e+02
                PERAXI		  2.0000000000000000e+03
                PERAXC		  1.0000000000000000e+03
                PROPTIME		  8.6400000000000000e+04
                STEPSIZE		  6.0000000000000000e+01
                STARTTIME		  0.0000000000000000e+00
                STOPTIME		  0.0000000000000000e+00
            END PASSIVESAFETYUIVALS

        END Gator

        BEGIN Crdn
        END Crdn

        BEGIN ScenSpaceEnvironment

            BEGIN RadiationEnvironment

                NasaModelsActivity		 SolarMin
                CrresProActivity		 Quiet
                CrresRadActivity		 Average
                UseDefaultNasaEnergies		 Yes

            END RadiationEnvironment

        END ScenSpaceEnvironment

        BEGIN SpiceExt
            OutputErrorMsgsOnLoad		 No
            SpiceFile		 "asteroids.bsp"
            SpiceFile		 "jupiter.bsp"
            SpiceFile		 "mars.bsp"
            SpiceFile		 "neptune.bsp"
            SpiceFile		 "planets.bsp"
            SpiceFile		 "pluto.bsp"
            SpiceFile		 "saturn.bsp"
            SpiceFile		 "uranus.bsp"
        END SpiceExt

        BEGIN FlightScenExt
        END FlightScenExt

        BEGIN Graphics

            BEGIN Animation

                StartTime		 18 Nov 2025 20:00:00.000000000
                EndTime		 18 Nov 2025 20:00:00.000000000
                CurrentTime		 18 Nov 2024 17:05:41.248437494
                Mode		 XRealtime
                Direction		 Forward
                UpdateDelta		 0.01
                RefreshDelta		 0.010000
                XRealTimeMult		 0.0625
                RealTimeOffset		 0
                XRtStartFromPause		                Yes		
                TimeArrayIncrement		 1

            END Animation


            BEGIN DisplayFlags
                ShowLabels		 On
                ShowPassLabel		 Off
                ShowElsetNum		 Off
                ShowGndTracks		 On
                ShowGndMarkers		 On
                ShowOrbitMarkers		 On
                ShowPlanetOrbits		 Off
                ShowPlanetCBIPos		 On
                ShowPlanetCBILabel		 On
                ShowPlanetGndPos		 On
                ShowPlanetGndLabel		 On
                ShowSensors		 On
                ShowWayptMarkers		 Off
                ShowWayptTurnMarkers		 Off
                ShowOrbits		 On
                ShowDtedRegions		 Off
                ShowAreaTgtCentroids		 On
                ShowToolBar		 On
                ShowStatusBar		 On
                ShowScrollBars		 On
                AllowAnimUpdate		 On
                AccShowLine		 On
                AccAnimHigh		 On
                AccStatHigh		 On
                AccAnimLineLineWidth		  1.0000000000000000e+00
                AccAnimLineLineStyle		 0
                ShowPrintButton		 On
                ShowAnimButtons		 On
                ShowAnimModeButtons		 On
                ShowZoomMsrButtons		 On
                ShowMapCbButton		 Off
            END DisplayFlags

            BEGIN WinFonts

                Consolas,12,700,0
                Consolas,14,700,0
                Consolas,16,700,0

            END WinFonts

            BEGIN MapData

                BEGIN TerrainConverterData
                    NorthLat		  0.0000000000000000e+00
                    EastLon		  0.0000000000000000e+00
                    SouthLat		  0.0000000000000000e+00
                    WestLon		  0.0000000000000000e+00
                    ColorByRGB		 No
                    AltsFromMSL		 No
                    UseColorRamp		 Yes
                    UseRegionMinMax		 Yes
                    SizeSameAsSrc		 Yes
                    MinAltHSV		  0.0000000000000000e+00  6.9999999999999996e-01  8.0000000000000004e-01  4.0000000000000002e-01
                    MaxAltHSV		  1.0000000000000000e+06  0.0000000000000000e+00  2.0000000000000001e-01  1.0000000000000000e+00
                    SmoothColors		 Yes
                    CreateChunkTrn		 No
                    OutputFormat		 PDTTX
                END TerrainConverterData

                DisableDefKbdActions		 Off
                TextShadowStyle		 Dark
                TextShadowColor		 #000000
                BingLevelOfDetailScale		 2

                BEGIN MapStyles

                    UseStyleTime		 No

                    BEGIN Style
                        Name		 DefaultWithBing
                        Time		 31536000
                        UpdateDelta		 10

                        BEGIN MapAttributes
                            PrimaryBody		 Earth
                            SecondaryBody		 Sun
                            CenterLatitude		 0
                            CenterLongitude		 0
                            ProjectionAltitude		 63621860
                            FieldOfView		 35
                            OrthoDisplayDistance		 20000000
                            TransformTrajectory		 On
                            EquatorialRadius		 6378137
                            BackgroundColor		 #000000
                            LatLonLines		 On
                            LatSpacing		 30
                            LonSpacing		 30
                            LatLonLineColor		 #999999
                            LatLonLineStyle		 2
                            ShowOrthoDistGrid		 Off
                            OrthoGridXSpacing		 5
                            OrthoGridYSpacing		 5
                            OrthoGridColor		 #ffffff
                            ShowImageExtents		 Off
                            ImageExtentLineColor		 #ffffff
                            ImageExtentLineStyle		 0
                            ImageExtentLineWidth		 1
                            ShowImageNames		 Off
                            ImageNameFont		 0
                            Projection		 EquidistantCylindrical
                            Resolution		 VeryLow
                            CoordinateSys		 ECF
                            UseBackgroundImage		 On
                            UseBingForBackground		 Off
                            BingType		 Aerial
                            BingLogoHorizAlign		 Right
                            BingLogoVertAlign		 Bottom
                            BackgroundImageFile		 Basic.bmp
                            UseNightLights		 Off
                            NightLightsFactor		 3.5
                            UseCloudsFile		 Off
                            BEGIN ZoomLocations
                                BEGIN ZoomLocation
                                    CenterLat		 0
                                    CenterLon		 0
                                    ZoomWidth		 359.999998
                                    ZoomHeight		 180
                                END ZoomLocation
                            END ZoomLocations
                            UseVarAspectRatio		 No
                            SwapMapResolution		 Yes
                            NoneToVLowSwapDist		 2000000
                            VLowToLowSwapDist		 20000
                            LowToMediumSwapDist		 10000
                            MediumToHighSwapDist		 5000
                            HighToVHighSwapDist		 1000
                            VHighToSHighSwapDist		 100
                            BEGIN Axes
                                DisplayAxes		 no
                                CoordSys		 CBI
                                2aryCB		 Sun
                                Display+x		 yes
                                Label+x		 yes
                                Color+x		 #ffffff
                                Scale+x		 3
                                Display-x		 yes
                                Label-x		 yes
                                Color-x		 #ffffff
                                Scale-x		 3
                                Display+y		 yes
                                Label+y		 yes
                                Color+y		 #ffffff
                                Scale+y		 3
                                Display-y		 yes
                                Label-y		 yes
                                Color-y		 #ffffff
                                Scale-y		 3
                                Display+z		 yes
                                Label+z		 yes
                                Color+z		 #ffffff
                                Scale+z		 3
                                Display-z		 yes
                                Label-z		 yes
                                Color-z		 #ffffff
                                Scale-z		 3
                            END Axes

                        END MapAttributes

                        BEGIN MapList
                            BEGIN Detail
                                Alias		 RWDB2_Coastlines
                                Show		 Yes
                                Color		 #8fbc8f
                            END Detail
                            BEGIN Detail
                                Alias		 RWDB2_International_Borders
                                Show		 No
                                Color		 #8fbc8f
                            END Detail
                            BEGIN Detail
                                Alias		 RWDB2_Islands
                                Show		 No
                                Color		 #8fbc8f
                            END Detail
                            BEGIN Detail
                                Alias		 RWDB2_Lakes
                                Show		 No
                                Color		 #87cefa
                            END Detail
                            BEGIN Detail
                                Alias		 RWDB2_Provincial_Borders
                                Show		 No
                                Color		 #8fbc8f
                            END Detail
                            BEGIN Detail
                                Alias		 RWDB2_Rivers
                                Show		 No
                                Color		 #87cefa
                            END Detail
                        END MapList


                        BEGIN MapAnnotations
                        END MapAnnotations

                        BEGIN RecordMovie
                            OutputFormat		 VIDEO
                            SdfSelected		 No
                            Directory		 C:\Users\excal\Documents\GitHub\BOBSAT-1\Simulations\BOBSAT1
                            BaseName		 Frame
                            Digits		 4
                            Frame		 0
                            LastAnimTime		 0
                            OutputMode		 Normal
                            HiResAssembly		 Assemble
                            HRWidth		 6000
                            HRHeight		 4500
                            HRDPI		 600
                            UseSnapInterval		 No
                            SnapInterval		 0
                            VideoCodec		 "H264"
                            Framerate		 30
                            Bitrate		 10000000
                        END RecordMovie


                        BEGIN TimeDisplay
                            Show		 0
                            TextColor		 #ffffff
                            TextTranslucency		 0
                            ShowBackground		 0
                            BackColor		 #4d4d4d
                            BackTranslucency		 0.4
                            XPosition		 20
                            YPosition		 -20
                        END TimeDisplay

                        BEGIN LightingData
                            DisplayAltitude		 0
                            SubsolarPoint		 Off
                            SubsolarPointColor		 #ffff00
                            SubsolarPointMarkerStyle		 2

                            ShowUmbraLine		 Off
                            UmbraLineColor		 #000000
                            UmbraLineStyle		 0
                            UmbraLineWidth		 2
                            FillUmbra		 On
                            UmbraFillColor		 #000000
                            ShowSunlightLine		 Off
                            SunlightLineColor		 #ffff00
                            SunlightLineStyle		 0
                            SunlightLineWidth		 2
                            FillSunlight		 On
                            SunlightFillColor		 #ffffff
                            SunlightMinOpacity		 0
                            SunlightMaxOpacity		 0.2
                            UmbraMaxOpacity		 0.7
                            UmbraMinOpacity		 0.4
                        END LightingData

                        ShowDtedRegions		 Off

                    END Style

                    BEGIN Style
                        Name		 DefaultWithoutBing
                        Time		 31536000
                        UpdateDelta		 10

                        BEGIN MapAttributes
                            PrimaryBody		 Earth
                            SecondaryBody		 Sun
                            CenterLatitude		 0
                            CenterLongitude		 0
                            ProjectionAltitude		 63621860
                            FieldOfView		 35
                            OrthoDisplayDistance		 20000000
                            TransformTrajectory		 On
                            EquatorialRadius		 6378137
                            BackgroundColor		 #000000
                            LatLonLines		 On
                            LatSpacing		 30
                            LonSpacing		 30
                            LatLonLineColor		 #999999
                            LatLonLineStyle		 2
                            ShowOrthoDistGrid		 Off
                            OrthoGridXSpacing		 5
                            OrthoGridYSpacing		 5
                            OrthoGridColor		 #ffffff
                            ShowImageExtents		 Off
                            ImageExtentLineColor		 #ffffff
                            ImageExtentLineStyle		 0
                            ImageExtentLineWidth		 1
                            ShowImageNames		 Off
                            ImageNameFont		 0
                            Projection		 EquidistantCylindrical
                            Resolution		 VeryLow
                            CoordinateSys		 ECF
                            UseBackgroundImage		 On
                            UseBingForBackground		 Off
                            BingType		 Aerial
                            BingLogoHorizAlign		 Right
                            BingLogoVertAlign		 Bottom
                            BackgroundImageFile		 Basic.bmp
                            UseNightLights		 Off
                            NightLightsFactor		 3.5
                            UseCloudsFile		 Off
                            BEGIN ZoomLocations
                                BEGIN ZoomLocation
                                    CenterLat		 0
                                    CenterLon		 0
                                    ZoomWidth		 359.999998
                                    ZoomHeight		 180
                                END ZoomLocation
                            END ZoomLocations
                            UseVarAspectRatio		 No
                            SwapMapResolution		 Yes
                            NoneToVLowSwapDist		 2000000
                            VLowToLowSwapDist		 20000
                            LowToMediumSwapDist		 10000
                            MediumToHighSwapDist		 5000
                            HighToVHighSwapDist		 1000
                            VHighToSHighSwapDist		 100
                            BEGIN Axes
                                DisplayAxes		 no
                                CoordSys		 CBI
                                2aryCB		 Sun
                                Display+x		 yes
                                Label+x		 yes
                                Color+x		 #ffffff
                                Scale+x		 3
                                Display-x		 yes
                                Label-x		 yes
                                Color-x		 #ffffff
                                Scale-x		 3
                                Display+y		 yes
                                Label+y		 yes
                                Color+y		 #ffffff
                                Scale+y		 3
                                Display-y		 yes
                                Label-y		 yes
                                Color-y		 #ffffff
                                Scale-y		 3
                                Display+z		 yes
                                Label+z		 yes
                                Color+z		 #ffffff
                                Scale+z		 3
                                Display-z		 yes
                                Label-z		 yes
                                Color-z		 #ffffff
                                Scale-z		 3
                            END Axes

                        END MapAttributes

                        BEGIN MapList
                            BEGIN Detail
                                Alias		 RWDB2_Coastlines
                                Show		 Yes
                                Color		 #8fbc8f
                            END Detail
                            BEGIN Detail
                                Alias		 RWDB2_International_Borders
                                Show		 No
                                Color		 #8fbc8f
                            END Detail
                            BEGIN Detail
                                Alias		 RWDB2_Islands
                                Show		 No
                                Color		 #8fbc8f
                            END Detail
                            BEGIN Detail
                                Alias		 RWDB2_Lakes
                                Show		 No
                                Color		 #87cefa
                            END Detail
                            BEGIN Detail
                                Alias		 RWDB2_Provincial_Borders
                                Show		 No
                                Color		 #8fbc8f
                            END Detail
                            BEGIN Detail
                                Alias		 RWDB2_Rivers
                                Show		 No
                                Color		 #87cefa
                            END Detail
                        END MapList


                        BEGIN MapAnnotations
                        END MapAnnotations

                        BEGIN RecordMovie
                            OutputFormat		 VIDEO
                            SdfSelected		 No
                            Directory		 C:\Users\excal\Documents\GitHub\BOBSAT-1\Simulations\BOBSAT1
                            BaseName		 Frame
                            Digits		 4
                            Frame		 0
                            LastAnimTime		 0
                            OutputMode		 Normal
                            HiResAssembly		 Assemble
                            HRWidth		 6000
                            HRHeight		 4500
                            HRDPI		 600
                            UseSnapInterval		 No
                            SnapInterval		 0
                            VideoCodec		 "H264"
                            Framerate		 30
                            Bitrate		 3000000
                        END RecordMovie


                        BEGIN TimeDisplay
                            Show		 0
                            TextColor		 #ffffff
                            TextTranslucency		 0
                            ShowBackground		 0
                            BackColor		 #4d4d4d
                            BackTranslucency		 0.4
                            XPosition		 20
                            YPosition		 -20
                        END TimeDisplay

                        BEGIN LightingData
                            DisplayAltitude		 0
                            SubsolarPoint		 Off
                            SubsolarPointColor		 #ffff00
                            SubsolarPointMarkerStyle		 2

                            ShowUmbraLine		 Off
                            UmbraLineColor		 #000000
                            UmbraLineStyle		 0
                            UmbraLineWidth		 2
                            FillUmbra		 On
                            UmbraFillColor		 #000000
                            ShowSunlightLine		 Off
                            SunlightLineColor		 #ffff00
                            SunlightLineStyle		 0
                            SunlightLineWidth		 2
                            FillSunlight		 On
                            SunlightFillColor		 #ffffff
                            SunlightMinOpacity		 0
                            SunlightMaxOpacity		 0.2
                            UmbraMaxOpacity		 0.7
                            UmbraMinOpacity		 0.4
                        END LightingData

                        ShowDtedRegions		 Off

                    END Style

                END MapStyles

            END MapData

            BEGIN GfxClassPref

            END GfxClassPref


            BEGIN ConnectGraphicsOptions

                AsyncPickReturnUnique		 OFF

            END ConnectGraphicsOptions

        END Graphics

        BEGIN Overlays
        END Overlays

        BEGIN VO
        END VO

        BEGIN ScenSpaceEnvironmentGfx

            BEGIN Gfx

                BEGIN MagFieldGfx
                    Show		 No
                    ColorBy		 Magnitude
                    ColorScale		 Log
                    ColorRampStart		 #0000ff
                    ColorRampStop		 #ff0000
                    MaxTranslucency		 0.7
                    LineStyle		 0
                    LineWidth		 2
                    FieldLineRefresh		 300
                    NumLats		 8
                    NumLongs		 6
                    StartLat		 15
                    StopLat		 85
                    RefLongitude		 3.141592653589793
                    MainField		 IGRF
                    ExternalField		 None
                    IGRF_UpdateRate		 86400
                END MagFieldGfx

            END Gfx

        END ScenSpaceEnvironmentGfx

    END Extensions

    BEGIN SubObjects

        Class AreaTarget

            Bear_Reservoir_120		
            Beltz_Lake_66		
            Berenda_Slough_196		
            Big_Buttonwillow_Lake_197		
            Big_Water_Lake_238		
            Buttonwillow_Slough_257		
            California_Lakes_1		
            California_Lakes_10		
            California_Lakes_100		
            California_Lakes_101		
            California_Lakes_102		
            California_Lakes_103		
            California_Lakes_106		
            California_Lakes_107		
            California_Lakes_108		
            California_Lakes_109		
            California_Lakes_11		
            California_Lakes_111		
            California_Lakes_112		
            California_Lakes_113		
            California_Lakes_114		
            California_Lakes_116		
            California_Lakes_117		
            California_Lakes_118		
            California_Lakes_119		
            California_Lakes_12		
            California_Lakes_121		
            California_Lakes_122		
            California_Lakes_123		
            California_Lakes_124		
            California_Lakes_125		
            California_Lakes_126		
            California_Lakes_127		
            California_Lakes_128		
            California_Lakes_129		
            California_Lakes_13		
            California_Lakes_130		
            California_Lakes_131		
            California_Lakes_132		
            California_Lakes_133		
            California_Lakes_135		
            California_Lakes_136		
            California_Lakes_137		
            California_Lakes_138		
            California_Lakes_139		
            California_Lakes_14		
            California_Lakes_140		
            California_Lakes_141		
            California_Lakes_142		
            California_Lakes_143		
            California_Lakes_144		
            California_Lakes_145		
            California_Lakes_146		
            California_Lakes_147		
            California_Lakes_148		
            California_Lakes_149		
            California_Lakes_15		
            California_Lakes_150		
            California_Lakes_151		
            California_Lakes_152		
            California_Lakes_153		
            California_Lakes_154		
            California_Lakes_155		
            California_Lakes_156		
            California_Lakes_157		
            California_Lakes_158		
            California_Lakes_159		
            California_Lakes_16		
            California_Lakes_160		
            California_Lakes_161		
            California_Lakes_162		
            California_Lakes_163		
            California_Lakes_164		
            California_Lakes_165		
            California_Lakes_166		
            California_Lakes_167		
            California_Lakes_168		
            California_Lakes_169		
            California_Lakes_17		
            California_Lakes_170		
            California_Lakes_171		
            California_Lakes_172		
            California_Lakes_173		
            California_Lakes_174		
            California_Lakes_175		
            California_Lakes_176		
            California_Lakes_177		
            California_Lakes_178		
            California_Lakes_179		
            California_Lakes_18		
            California_Lakes_180		
            California_Lakes_181		
            California_Lakes_182		
            California_Lakes_183		
            California_Lakes_184		
            California_Lakes_185		
            California_Lakes_186		
            California_Lakes_187		
            California_Lakes_188		
            California_Lakes_19		
            California_Lakes_190		
            California_Lakes_191		
            California_Lakes_192		
            California_Lakes_198		
            California_Lakes_199		
            California_Lakes_2		
            California_Lakes_20		
            California_Lakes_200		
            California_Lakes_201		
            California_Lakes_202		
            California_Lakes_203		
            California_Lakes_204		
            California_Lakes_205		
            California_Lakes_206		
            California_Lakes_207		
            California_Lakes_208		
            California_Lakes_209		
            California_Lakes_21		
            California_Lakes_210		
            California_Lakes_211		
            California_Lakes_212		
            California_Lakes_213		
            California_Lakes_214		
            California_Lakes_215		
            California_Lakes_216		
            California_Lakes_217		
            California_Lakes_22		
            California_Lakes_220		
            California_Lakes_221		
            California_Lakes_222		
            California_Lakes_224		
            California_Lakes_225		
            California_Lakes_226		
            California_Lakes_227		
            California_Lakes_228		
            California_Lakes_229		
            California_Lakes_23		
            California_Lakes_230		
            California_Lakes_231		
            California_Lakes_232		
            California_Lakes_233		
            California_Lakes_235		
            California_Lakes_236		
            California_Lakes_237		
            California_Lakes_240		
            California_Lakes_241		
            California_Lakes_242		
            California_Lakes_243		
            California_Lakes_244		
            California_Lakes_245		
            California_Lakes_246		
            California_Lakes_247		
            California_Lakes_248		
            California_Lakes_249		
            California_Lakes_25		
            California_Lakes_250		
            California_Lakes_251		
            California_Lakes_252		
            California_Lakes_253		
            California_Lakes_254		
            California_Lakes_255		
            California_Lakes_256		
            California_Lakes_258		
            California_Lakes_259		
            California_Lakes_26		
            California_Lakes_260		
            California_Lakes_261		
            California_Lakes_262		
            California_Lakes_263		
            California_Lakes_264		
            California_Lakes_265		
            California_Lakes_266		
            California_Lakes_267		
            California_Lakes_268		
            California_Lakes_269		
            California_Lakes_27		
            California_Lakes_270		
            California_Lakes_271		
            California_Lakes_272		
            California_Lakes_273		
            California_Lakes_274		
            California_Lakes_275		
            California_Lakes_276		
            California_Lakes_277		
            California_Lakes_278		
            California_Lakes_279		
            California_Lakes_28		
            California_Lakes_280		
            California_Lakes_281		
            California_Lakes_282		
            California_Lakes_283		
            California_Lakes_284		
            California_Lakes_285		
            California_Lakes_286		
            California_Lakes_287		
            California_Lakes_288		
            California_Lakes_289		
            California_Lakes_29		
            California_Lakes_290		
            California_Lakes_291		
            California_Lakes_292		
            California_Lakes_293		
            California_Lakes_294		
            California_Lakes_295		
            California_Lakes_296		
            California_Lakes_297		
            California_Lakes_298		
            California_Lakes_299		
            California_Lakes_3		
            California_Lakes_300		
            California_Lakes_301		
            California_Lakes_302		
            California_Lakes_303		
            California_Lakes_304		
            California_Lakes_309		
            California_Lakes_31		
            California_Lakes_310		
            California_Lakes_311		
            California_Lakes_312		
            California_Lakes_313		
            California_Lakes_314		
            California_Lakes_315		
            California_Lakes_316		
            California_Lakes_317		
            California_Lakes_318		
            California_Lakes_33		
            California_Lakes_35		
            California_Lakes_36		
            California_Lakes_37		
            California_Lakes_38		
            California_Lakes_39		
            California_Lakes_4		
            California_Lakes_40		
            California_Lakes_41		
            California_Lakes_42		
            California_Lakes_44		
            California_Lakes_45		
            California_Lakes_46		
            California_Lakes_47		
            California_Lakes_49		
            California_Lakes_51		
            California_Lakes_52		
            California_Lakes_53		
            California_Lakes_54		
            California_Lakes_55		
            California_Lakes_56		
            California_Lakes_57		
            California_Lakes_58		
            California_Lakes_59		
            California_Lakes_6		
            California_Lakes_60		
            California_Lakes_61		
            California_Lakes_63		
            California_Lakes_64		
            California_Lakes_65		
            California_Lakes_68		
            California_Lakes_69		
            California_Lakes_7		
            California_Lakes_71		
            California_Lakes_72		
            California_Lakes_73		
            California_Lakes_74		
            California_Lakes_75		
            California_Lakes_76		
            California_Lakes_77		
            California_Lakes_78		
            California_Lakes_79		
            California_Lakes_8		
            California_Lakes_80		
            California_Lakes_81		
            California_Lakes_82		
            California_Lakes_83		
            California_Lakes_84		
            California_Lakes_85		
            California_Lakes_86		
            California_Lakes_87		
            California_Lakes_88		
            California_Lakes_89		
            California_Lakes_9		
            California_Lakes_91		
            California_Lakes_92		
            California_Lakes_93		
            California_Lakes_94		
            California_Lakes_95		
            California_Lakes_96		
            California_Lakes_98		
            California_Lakes_99		
            Cardoza_Lake_70		
            Cathey_Pond_104		
            Dawson_Lake_67		
            Don_Pedro_Reservoir_305		
            El_Nido_Reservoir_194		
            Floto_Lake_24		
            Giles_Pond_105		
            H__V__Eastman_Lake_50		
            Hensley_Lake_193		
            Kelsey_Reservoir_90		
            La_Grange_Reservoir_34		
            Lake_Honda_134		
            Lake_McClure_32_0		
            Lake_McClure_32_1		
            Lake_McClure_32_2		
            Lake_McClure_32_3		
            Lake_McClure_32_4		
            Lake_McClure_32_5		
            Lake_McClure_32_6		
            Little_Buttonwillow_Lake_195		
            Los_Banos_Reservoir_306		
            Lower_Ruth_Lake_219		
            Madera_Equalization_Reservoir_234_0		
            Madera_Equalization_Reservoir_234_1		
            Madera_Equalization_Reservoir_234_2		
            Madera_Lake_239		
            Mariposa_Lake_308_0		
            Mariposa_Lake_308_1		
            Mcmahon_30		
            Modesto_Reservoir_5		
            Olson_Pond_218		
            Owens_Reservoir_48		
            Petes_Pond_115		
            Rushing_Lake_62		
            Sierra_Vista_189		
            Stockton_Creek_97		
            Toledo_Pond_110		
            Turlock_Lake_43		
            Upper_Ruth_Lake_223		
            Yosemite_Lake_307		

        END Class

        Class CoverageDefinition

            CoverageDefinition1		

        END Class

        Class Satellite

            BOBSAT1		

        END Class

    END SubObjects

    BEGIN References
        Instance *
            *		
            CoverageDefinition/CoverageDefinition1		
        END Instance
        Instance AreaTarget/Bear_Reservoir_120
            AreaTarget/Bear_Reservoir_120		
        END Instance
        Instance AreaTarget/Beltz_Lake_66
            AreaTarget/Beltz_Lake_66		
        END Instance
        Instance AreaTarget/Berenda_Slough_196
            AreaTarget/Berenda_Slough_196		
        END Instance
        Instance AreaTarget/Big_Buttonwillow_Lake_197
            AreaTarget/Big_Buttonwillow_Lake_197		
            Satellite/BOBSAT1		
        END Instance
        Instance AreaTarget/Big_Water_Lake_238
            AreaTarget/Big_Water_Lake_238		
        END Instance
        Instance AreaTarget/Buttonwillow_Slough_257
            AreaTarget/Buttonwillow_Slough_257		
        END Instance
        Instance AreaTarget/California_Lakes_1
            AreaTarget/California_Lakes_1		
        END Instance
        Instance AreaTarget/California_Lakes_10
            AreaTarget/California_Lakes_10		
        END Instance
        Instance AreaTarget/California_Lakes_100
            AreaTarget/California_Lakes_100		
        END Instance
        Instance AreaTarget/California_Lakes_101
            AreaTarget/California_Lakes_101		
        END Instance
        Instance AreaTarget/California_Lakes_102
            AreaTarget/California_Lakes_102		
        END Instance
        Instance AreaTarget/California_Lakes_103
            AreaTarget/California_Lakes_103		
        END Instance
        Instance AreaTarget/California_Lakes_106
            AreaTarget/California_Lakes_106		
        END Instance
        Instance AreaTarget/California_Lakes_107
            AreaTarget/California_Lakes_107		
        END Instance
        Instance AreaTarget/California_Lakes_108
            AreaTarget/California_Lakes_108		
        END Instance
        Instance AreaTarget/California_Lakes_109
            AreaTarget/California_Lakes_109		
        END Instance
        Instance AreaTarget/California_Lakes_11
            AreaTarget/California_Lakes_11		
        END Instance
        Instance AreaTarget/California_Lakes_111
            AreaTarget/California_Lakes_111		
        END Instance
        Instance AreaTarget/California_Lakes_112
            AreaTarget/California_Lakes_112		
        END Instance
        Instance AreaTarget/California_Lakes_113
            AreaTarget/California_Lakes_113		
        END Instance
        Instance AreaTarget/California_Lakes_114
            AreaTarget/California_Lakes_114		
        END Instance
        Instance AreaTarget/California_Lakes_116
            AreaTarget/California_Lakes_116		
        END Instance
        Instance AreaTarget/California_Lakes_117
            AreaTarget/California_Lakes_117		
        END Instance
        Instance AreaTarget/California_Lakes_118
            AreaTarget/California_Lakes_118		
        END Instance
        Instance AreaTarget/California_Lakes_119
            AreaTarget/California_Lakes_119		
        END Instance
        Instance AreaTarget/California_Lakes_12
            AreaTarget/California_Lakes_12		
        END Instance
        Instance AreaTarget/California_Lakes_121
            AreaTarget/California_Lakes_121		
        END Instance
        Instance AreaTarget/California_Lakes_122
            AreaTarget/California_Lakes_122		
        END Instance
        Instance AreaTarget/California_Lakes_123
            AreaTarget/California_Lakes_123		
        END Instance
        Instance AreaTarget/California_Lakes_124
            AreaTarget/California_Lakes_124		
        END Instance
        Instance AreaTarget/California_Lakes_125
            AreaTarget/California_Lakes_125		
        END Instance
        Instance AreaTarget/California_Lakes_126
            AreaTarget/California_Lakes_126		
        END Instance
        Instance AreaTarget/California_Lakes_127
            AreaTarget/California_Lakes_127		
        END Instance
        Instance AreaTarget/California_Lakes_128
            AreaTarget/California_Lakes_128		
        END Instance
        Instance AreaTarget/California_Lakes_129
            AreaTarget/California_Lakes_129		
        END Instance
        Instance AreaTarget/California_Lakes_13
            AreaTarget/California_Lakes_13		
        END Instance
        Instance AreaTarget/California_Lakes_130
            AreaTarget/California_Lakes_130		
        END Instance
        Instance AreaTarget/California_Lakes_131
            AreaTarget/California_Lakes_131		
        END Instance
        Instance AreaTarget/California_Lakes_132
            AreaTarget/California_Lakes_132		
        END Instance
        Instance AreaTarget/California_Lakes_133
            AreaTarget/California_Lakes_133		
        END Instance
        Instance AreaTarget/California_Lakes_135
            AreaTarget/California_Lakes_135		
        END Instance
        Instance AreaTarget/California_Lakes_136
            AreaTarget/California_Lakes_136		
        END Instance
        Instance AreaTarget/California_Lakes_137
            AreaTarget/California_Lakes_137		
        END Instance
        Instance AreaTarget/California_Lakes_138
            AreaTarget/California_Lakes_138		
        END Instance
        Instance AreaTarget/California_Lakes_139
            AreaTarget/California_Lakes_139		
        END Instance
        Instance AreaTarget/California_Lakes_14
            AreaTarget/California_Lakes_14		
        END Instance
        Instance AreaTarget/California_Lakes_140
            AreaTarget/California_Lakes_140		
        END Instance
        Instance AreaTarget/California_Lakes_141
            AreaTarget/California_Lakes_141		
        END Instance
        Instance AreaTarget/California_Lakes_142
            AreaTarget/California_Lakes_142		
        END Instance
        Instance AreaTarget/California_Lakes_143
            AreaTarget/California_Lakes_143		
        END Instance
        Instance AreaTarget/California_Lakes_144
            AreaTarget/California_Lakes_144		
        END Instance
        Instance AreaTarget/California_Lakes_145
            AreaTarget/California_Lakes_145		
        END Instance
        Instance AreaTarget/California_Lakes_146
            AreaTarget/California_Lakes_146		
        END Instance
        Instance AreaTarget/California_Lakes_147
            AreaTarget/California_Lakes_147		
        END Instance
        Instance AreaTarget/California_Lakes_148
            AreaTarget/California_Lakes_148		
        END Instance
        Instance AreaTarget/California_Lakes_149
            AreaTarget/California_Lakes_149		
        END Instance
        Instance AreaTarget/California_Lakes_15
            AreaTarget/California_Lakes_15		
        END Instance
        Instance AreaTarget/California_Lakes_150
            AreaTarget/California_Lakes_150		
        END Instance
        Instance AreaTarget/California_Lakes_151
            AreaTarget/California_Lakes_151		
        END Instance
        Instance AreaTarget/California_Lakes_152
            AreaTarget/California_Lakes_152		
        END Instance
        Instance AreaTarget/California_Lakes_153
            AreaTarget/California_Lakes_153		
        END Instance
        Instance AreaTarget/California_Lakes_154
            AreaTarget/California_Lakes_154		
        END Instance
        Instance AreaTarget/California_Lakes_155
            AreaTarget/California_Lakes_155		
        END Instance
        Instance AreaTarget/California_Lakes_156
            AreaTarget/California_Lakes_156		
        END Instance
        Instance AreaTarget/California_Lakes_157
            AreaTarget/California_Lakes_157		
        END Instance
        Instance AreaTarget/California_Lakes_158
            AreaTarget/California_Lakes_158		
        END Instance
        Instance AreaTarget/California_Lakes_159
            AreaTarget/California_Lakes_159		
        END Instance
        Instance AreaTarget/California_Lakes_16
            AreaTarget/California_Lakes_16		
        END Instance
        Instance AreaTarget/California_Lakes_160
            AreaTarget/California_Lakes_160		
        END Instance
        Instance AreaTarget/California_Lakes_161
            AreaTarget/California_Lakes_161		
        END Instance
        Instance AreaTarget/California_Lakes_162
            AreaTarget/California_Lakes_162		
        END Instance
        Instance AreaTarget/California_Lakes_163
            AreaTarget/California_Lakes_163		
        END Instance
        Instance AreaTarget/California_Lakes_164
            AreaTarget/California_Lakes_164		
        END Instance
        Instance AreaTarget/California_Lakes_165
            AreaTarget/California_Lakes_165		
        END Instance
        Instance AreaTarget/California_Lakes_166
            AreaTarget/California_Lakes_166		
        END Instance
        Instance AreaTarget/California_Lakes_167
            AreaTarget/California_Lakes_167		
        END Instance
        Instance AreaTarget/California_Lakes_168
            AreaTarget/California_Lakes_168		
        END Instance
        Instance AreaTarget/California_Lakes_169
            AreaTarget/California_Lakes_169		
        END Instance
        Instance AreaTarget/California_Lakes_17
            AreaTarget/California_Lakes_17		
        END Instance
        Instance AreaTarget/California_Lakes_170
            AreaTarget/California_Lakes_170		
        END Instance
        Instance AreaTarget/California_Lakes_171
            AreaTarget/California_Lakes_171		
        END Instance
        Instance AreaTarget/California_Lakes_172
            AreaTarget/California_Lakes_172		
        END Instance
        Instance AreaTarget/California_Lakes_173
            AreaTarget/California_Lakes_173		
        END Instance
        Instance AreaTarget/California_Lakes_174
            AreaTarget/California_Lakes_174		
        END Instance
        Instance AreaTarget/California_Lakes_175
            AreaTarget/California_Lakes_175		
        END Instance
        Instance AreaTarget/California_Lakes_176
            AreaTarget/California_Lakes_176		
        END Instance
        Instance AreaTarget/California_Lakes_177
            AreaTarget/California_Lakes_177		
        END Instance
        Instance AreaTarget/California_Lakes_178
            AreaTarget/California_Lakes_178		
        END Instance
        Instance AreaTarget/California_Lakes_179
            AreaTarget/California_Lakes_179		
        END Instance
        Instance AreaTarget/California_Lakes_18
            AreaTarget/California_Lakes_18		
        END Instance
        Instance AreaTarget/California_Lakes_180
            AreaTarget/California_Lakes_180		
        END Instance
        Instance AreaTarget/California_Lakes_181
            AreaTarget/California_Lakes_181		
        END Instance
        Instance AreaTarget/California_Lakes_182
            AreaTarget/California_Lakes_182		
        END Instance
        Instance AreaTarget/California_Lakes_183
            AreaTarget/California_Lakes_183		
        END Instance
        Instance AreaTarget/California_Lakes_184
            AreaTarget/California_Lakes_184		
        END Instance
        Instance AreaTarget/California_Lakes_185
            AreaTarget/California_Lakes_185		
        END Instance
        Instance AreaTarget/California_Lakes_186
            AreaTarget/California_Lakes_186		
        END Instance
        Instance AreaTarget/California_Lakes_187
            AreaTarget/California_Lakes_187		
        END Instance
        Instance AreaTarget/California_Lakes_188
            AreaTarget/California_Lakes_188		
        END Instance
        Instance AreaTarget/California_Lakes_19
            AreaTarget/California_Lakes_19		
        END Instance
        Instance AreaTarget/California_Lakes_190
            AreaTarget/California_Lakes_190		
        END Instance
        Instance AreaTarget/California_Lakes_191
            AreaTarget/California_Lakes_191		
        END Instance
        Instance AreaTarget/California_Lakes_192
            AreaTarget/California_Lakes_192		
        END Instance
        Instance AreaTarget/California_Lakes_198
            AreaTarget/California_Lakes_198		
        END Instance
        Instance AreaTarget/California_Lakes_199
            AreaTarget/California_Lakes_199		
        END Instance
        Instance AreaTarget/California_Lakes_2
            AreaTarget/California_Lakes_2		
        END Instance
        Instance AreaTarget/California_Lakes_20
            AreaTarget/California_Lakes_20		
        END Instance
        Instance AreaTarget/California_Lakes_200
            AreaTarget/California_Lakes_200		
        END Instance
        Instance AreaTarget/California_Lakes_201
            AreaTarget/California_Lakes_201		
        END Instance
        Instance AreaTarget/California_Lakes_202
            AreaTarget/California_Lakes_202		
        END Instance
        Instance AreaTarget/California_Lakes_203
            AreaTarget/California_Lakes_203		
        END Instance
        Instance AreaTarget/California_Lakes_204
            AreaTarget/California_Lakes_204		
        END Instance
        Instance AreaTarget/California_Lakes_205
            AreaTarget/California_Lakes_205		
        END Instance
        Instance AreaTarget/California_Lakes_206
            AreaTarget/California_Lakes_206		
        END Instance
        Instance AreaTarget/California_Lakes_207
            AreaTarget/California_Lakes_207		
        END Instance
        Instance AreaTarget/California_Lakes_208
            AreaTarget/California_Lakes_208		
        END Instance
        Instance AreaTarget/California_Lakes_209
            AreaTarget/California_Lakes_209		
        END Instance
        Instance AreaTarget/California_Lakes_21
            AreaTarget/California_Lakes_21		
        END Instance
        Instance AreaTarget/California_Lakes_210
            AreaTarget/California_Lakes_210		
        END Instance
        Instance AreaTarget/California_Lakes_211
            AreaTarget/California_Lakes_211		
        END Instance
        Instance AreaTarget/California_Lakes_212
            AreaTarget/California_Lakes_212		
        END Instance
        Instance AreaTarget/California_Lakes_213
            AreaTarget/California_Lakes_213		
        END Instance
        Instance AreaTarget/California_Lakes_214
            AreaTarget/California_Lakes_214		
        END Instance
        Instance AreaTarget/California_Lakes_215
            AreaTarget/California_Lakes_215		
        END Instance
        Instance AreaTarget/California_Lakes_216
            AreaTarget/California_Lakes_216		
        END Instance
        Instance AreaTarget/California_Lakes_217
            AreaTarget/California_Lakes_217		
        END Instance
        Instance AreaTarget/California_Lakes_22
            AreaTarget/California_Lakes_22		
        END Instance
        Instance AreaTarget/California_Lakes_220
            AreaTarget/California_Lakes_220		
        END Instance
        Instance AreaTarget/California_Lakes_221
            AreaTarget/California_Lakes_221		
        END Instance
        Instance AreaTarget/California_Lakes_222
            AreaTarget/California_Lakes_222		
        END Instance
        Instance AreaTarget/California_Lakes_224
            AreaTarget/California_Lakes_224		
        END Instance
        Instance AreaTarget/California_Lakes_225
            AreaTarget/California_Lakes_225		
        END Instance
        Instance AreaTarget/California_Lakes_226
            AreaTarget/California_Lakes_226		
        END Instance
        Instance AreaTarget/California_Lakes_227
            AreaTarget/California_Lakes_227		
        END Instance
        Instance AreaTarget/California_Lakes_228
            AreaTarget/California_Lakes_228		
        END Instance
        Instance AreaTarget/California_Lakes_229
            AreaTarget/California_Lakes_229		
        END Instance
        Instance AreaTarget/California_Lakes_23
            AreaTarget/California_Lakes_23		
        END Instance
        Instance AreaTarget/California_Lakes_230
            AreaTarget/California_Lakes_230		
        END Instance
        Instance AreaTarget/California_Lakes_231
            AreaTarget/California_Lakes_231		
        END Instance
        Instance AreaTarget/California_Lakes_232
            AreaTarget/California_Lakes_232		
        END Instance
        Instance AreaTarget/California_Lakes_233
            AreaTarget/California_Lakes_233		
        END Instance
        Instance AreaTarget/California_Lakes_235
            AreaTarget/California_Lakes_235		
        END Instance
        Instance AreaTarget/California_Lakes_236
            AreaTarget/California_Lakes_236		
        END Instance
        Instance AreaTarget/California_Lakes_237
            AreaTarget/California_Lakes_237		
        END Instance
        Instance AreaTarget/California_Lakes_240
            AreaTarget/California_Lakes_240		
        END Instance
        Instance AreaTarget/California_Lakes_241
            AreaTarget/California_Lakes_241		
        END Instance
        Instance AreaTarget/California_Lakes_242
            AreaTarget/California_Lakes_242		
        END Instance
        Instance AreaTarget/California_Lakes_243
            AreaTarget/California_Lakes_243		
        END Instance
        Instance AreaTarget/California_Lakes_244
            AreaTarget/California_Lakes_244		
        END Instance
        Instance AreaTarget/California_Lakes_245
            AreaTarget/California_Lakes_245		
        END Instance
        Instance AreaTarget/California_Lakes_246
            AreaTarget/California_Lakes_246		
        END Instance
        Instance AreaTarget/California_Lakes_247
            AreaTarget/California_Lakes_247		
        END Instance
        Instance AreaTarget/California_Lakes_248
            AreaTarget/California_Lakes_248		
        END Instance
        Instance AreaTarget/California_Lakes_249
            AreaTarget/California_Lakes_249		
        END Instance
        Instance AreaTarget/California_Lakes_25
            AreaTarget/California_Lakes_25		
        END Instance
        Instance AreaTarget/California_Lakes_250
            AreaTarget/California_Lakes_250		
        END Instance
        Instance AreaTarget/California_Lakes_251
            AreaTarget/California_Lakes_251		
        END Instance
        Instance AreaTarget/California_Lakes_252
            AreaTarget/California_Lakes_252		
        END Instance
        Instance AreaTarget/California_Lakes_253
            AreaTarget/California_Lakes_253		
        END Instance
        Instance AreaTarget/California_Lakes_254
            AreaTarget/California_Lakes_254		
        END Instance
        Instance AreaTarget/California_Lakes_255
            AreaTarget/California_Lakes_255		
        END Instance
        Instance AreaTarget/California_Lakes_256
            AreaTarget/California_Lakes_256		
        END Instance
        Instance AreaTarget/California_Lakes_258
            AreaTarget/California_Lakes_258		
        END Instance
        Instance AreaTarget/California_Lakes_259
            AreaTarget/California_Lakes_259		
        END Instance
        Instance AreaTarget/California_Lakes_26
            AreaTarget/California_Lakes_26		
        END Instance
        Instance AreaTarget/California_Lakes_260
            AreaTarget/California_Lakes_260		
        END Instance
        Instance AreaTarget/California_Lakes_261
            AreaTarget/California_Lakes_261		
        END Instance
        Instance AreaTarget/California_Lakes_262
            AreaTarget/California_Lakes_262		
        END Instance
        Instance AreaTarget/California_Lakes_263
            AreaTarget/California_Lakes_263		
        END Instance
        Instance AreaTarget/California_Lakes_264
            AreaTarget/California_Lakes_264		
        END Instance
        Instance AreaTarget/California_Lakes_265
            AreaTarget/California_Lakes_265		
        END Instance
        Instance AreaTarget/California_Lakes_266
            AreaTarget/California_Lakes_266		
        END Instance
        Instance AreaTarget/California_Lakes_267
            AreaTarget/California_Lakes_267		
        END Instance
        Instance AreaTarget/California_Lakes_268
            AreaTarget/California_Lakes_268		
        END Instance
        Instance AreaTarget/California_Lakes_269
            AreaTarget/California_Lakes_269		
        END Instance
        Instance AreaTarget/California_Lakes_27
            AreaTarget/California_Lakes_27		
        END Instance
        Instance AreaTarget/California_Lakes_270
            AreaTarget/California_Lakes_270		
        END Instance
        Instance AreaTarget/California_Lakes_271
            AreaTarget/California_Lakes_271		
        END Instance
        Instance AreaTarget/California_Lakes_272
            AreaTarget/California_Lakes_272		
        END Instance
        Instance AreaTarget/California_Lakes_273
            AreaTarget/California_Lakes_273		
        END Instance
        Instance AreaTarget/California_Lakes_274
            AreaTarget/California_Lakes_274		
        END Instance
        Instance AreaTarget/California_Lakes_275
            AreaTarget/California_Lakes_275		
        END Instance
        Instance AreaTarget/California_Lakes_276
            AreaTarget/California_Lakes_276		
        END Instance
        Instance AreaTarget/California_Lakes_277
            AreaTarget/California_Lakes_277		
        END Instance
        Instance AreaTarget/California_Lakes_278
            AreaTarget/California_Lakes_278		
        END Instance
        Instance AreaTarget/California_Lakes_279
            AreaTarget/California_Lakes_279		
        END Instance
        Instance AreaTarget/California_Lakes_28
            AreaTarget/California_Lakes_28		
        END Instance
        Instance AreaTarget/California_Lakes_280
            AreaTarget/California_Lakes_280		
        END Instance
        Instance AreaTarget/California_Lakes_281
            AreaTarget/California_Lakes_281		
        END Instance
        Instance AreaTarget/California_Lakes_282
            AreaTarget/California_Lakes_282		
        END Instance
        Instance AreaTarget/California_Lakes_283
            AreaTarget/California_Lakes_283		
        END Instance
        Instance AreaTarget/California_Lakes_284
            AreaTarget/California_Lakes_284		
        END Instance
        Instance AreaTarget/California_Lakes_285
            AreaTarget/California_Lakes_285		
        END Instance
        Instance AreaTarget/California_Lakes_286
            AreaTarget/California_Lakes_286		
        END Instance
        Instance AreaTarget/California_Lakes_287
            AreaTarget/California_Lakes_287		
        END Instance
        Instance AreaTarget/California_Lakes_288
            AreaTarget/California_Lakes_288		
        END Instance
        Instance AreaTarget/California_Lakes_289
            AreaTarget/California_Lakes_289		
        END Instance
        Instance AreaTarget/California_Lakes_29
            AreaTarget/California_Lakes_29		
        END Instance
        Instance AreaTarget/California_Lakes_290
            AreaTarget/California_Lakes_290		
        END Instance
        Instance AreaTarget/California_Lakes_291
            AreaTarget/California_Lakes_291		
        END Instance
        Instance AreaTarget/California_Lakes_292
            AreaTarget/California_Lakes_292		
        END Instance
        Instance AreaTarget/California_Lakes_293
            AreaTarget/California_Lakes_293		
        END Instance
        Instance AreaTarget/California_Lakes_294
            AreaTarget/California_Lakes_294		
        END Instance
        Instance AreaTarget/California_Lakes_295
            AreaTarget/California_Lakes_295		
        END Instance
        Instance AreaTarget/California_Lakes_296
            AreaTarget/California_Lakes_296		
        END Instance
        Instance AreaTarget/California_Lakes_297
            AreaTarget/California_Lakes_297		
        END Instance
        Instance AreaTarget/California_Lakes_298
            AreaTarget/California_Lakes_298		
        END Instance
        Instance AreaTarget/California_Lakes_299
            AreaTarget/California_Lakes_299		
        END Instance
        Instance AreaTarget/California_Lakes_3
            AreaTarget/California_Lakes_3		
        END Instance
        Instance AreaTarget/California_Lakes_300
            AreaTarget/California_Lakes_300		
        END Instance
        Instance AreaTarget/California_Lakes_301
            AreaTarget/California_Lakes_301		
        END Instance
        Instance AreaTarget/California_Lakes_302
            AreaTarget/California_Lakes_302		
        END Instance
        Instance AreaTarget/California_Lakes_303
            AreaTarget/California_Lakes_303		
        END Instance
        Instance AreaTarget/California_Lakes_304
            AreaTarget/California_Lakes_304		
        END Instance
        Instance AreaTarget/California_Lakes_309
            AreaTarget/California_Lakes_309		
        END Instance
        Instance AreaTarget/California_Lakes_31
            AreaTarget/California_Lakes_31		
        END Instance
        Instance AreaTarget/California_Lakes_310
            AreaTarget/California_Lakes_310		
        END Instance
        Instance AreaTarget/California_Lakes_311
            AreaTarget/California_Lakes_311		
        END Instance
        Instance AreaTarget/California_Lakes_312
            AreaTarget/California_Lakes_312		
        END Instance
        Instance AreaTarget/California_Lakes_313
            AreaTarget/California_Lakes_313		
        END Instance
        Instance AreaTarget/California_Lakes_314
            AreaTarget/California_Lakes_314		
        END Instance
        Instance AreaTarget/California_Lakes_315
            AreaTarget/California_Lakes_315		
        END Instance
        Instance AreaTarget/California_Lakes_316
            AreaTarget/California_Lakes_316		
        END Instance
        Instance AreaTarget/California_Lakes_317
            AreaTarget/California_Lakes_317		
        END Instance
        Instance AreaTarget/California_Lakes_318
            AreaTarget/California_Lakes_318		
        END Instance
        Instance AreaTarget/California_Lakes_33
            AreaTarget/California_Lakes_33		
        END Instance
        Instance AreaTarget/California_Lakes_35
            AreaTarget/California_Lakes_35		
        END Instance
        Instance AreaTarget/California_Lakes_36
            AreaTarget/California_Lakes_36		
        END Instance
        Instance AreaTarget/California_Lakes_37
            AreaTarget/California_Lakes_37		
        END Instance
        Instance AreaTarget/California_Lakes_38
            AreaTarget/California_Lakes_38		
        END Instance
        Instance AreaTarget/California_Lakes_39
            AreaTarget/California_Lakes_39		
        END Instance
        Instance AreaTarget/California_Lakes_4
            AreaTarget/California_Lakes_4		
        END Instance
        Instance AreaTarget/California_Lakes_40
            AreaTarget/California_Lakes_40		
        END Instance
        Instance AreaTarget/California_Lakes_41
            AreaTarget/California_Lakes_41		
        END Instance
        Instance AreaTarget/California_Lakes_42
            AreaTarget/California_Lakes_42		
        END Instance
        Instance AreaTarget/California_Lakes_44
            AreaTarget/California_Lakes_44		
        END Instance
        Instance AreaTarget/California_Lakes_45
            AreaTarget/California_Lakes_45		
        END Instance
        Instance AreaTarget/California_Lakes_46
            AreaTarget/California_Lakes_46		
        END Instance
        Instance AreaTarget/California_Lakes_47
            AreaTarget/California_Lakes_47		
        END Instance
        Instance AreaTarget/California_Lakes_49
            AreaTarget/California_Lakes_49		
        END Instance
        Instance AreaTarget/California_Lakes_51
            AreaTarget/California_Lakes_51		
        END Instance
        Instance AreaTarget/California_Lakes_52
            AreaTarget/California_Lakes_52		
        END Instance
        Instance AreaTarget/California_Lakes_53
            AreaTarget/California_Lakes_53		
        END Instance
        Instance AreaTarget/California_Lakes_54
            AreaTarget/California_Lakes_54		
        END Instance
        Instance AreaTarget/California_Lakes_55
            AreaTarget/California_Lakes_55		
        END Instance
        Instance AreaTarget/California_Lakes_56
            AreaTarget/California_Lakes_56		
        END Instance
        Instance AreaTarget/California_Lakes_57
            AreaTarget/California_Lakes_57		
        END Instance
        Instance AreaTarget/California_Lakes_58
            AreaTarget/California_Lakes_58		
        END Instance
        Instance AreaTarget/California_Lakes_59
            AreaTarget/California_Lakes_59		
        END Instance
        Instance AreaTarget/California_Lakes_6
            AreaTarget/California_Lakes_6		
        END Instance
        Instance AreaTarget/California_Lakes_60
            AreaTarget/California_Lakes_60		
        END Instance
        Instance AreaTarget/California_Lakes_61
            AreaTarget/California_Lakes_61		
        END Instance
        Instance AreaTarget/California_Lakes_63
            AreaTarget/California_Lakes_63		
        END Instance
        Instance AreaTarget/California_Lakes_64
            AreaTarget/California_Lakes_64		
        END Instance
        Instance AreaTarget/California_Lakes_65
            AreaTarget/California_Lakes_65		
        END Instance
        Instance AreaTarget/California_Lakes_68
            AreaTarget/California_Lakes_68		
        END Instance
        Instance AreaTarget/California_Lakes_69
            AreaTarget/California_Lakes_69		
        END Instance
        Instance AreaTarget/California_Lakes_7
            AreaTarget/California_Lakes_7		
        END Instance
        Instance AreaTarget/California_Lakes_71
            AreaTarget/California_Lakes_71		
        END Instance
        Instance AreaTarget/California_Lakes_72
            AreaTarget/California_Lakes_72		
        END Instance
        Instance AreaTarget/California_Lakes_73
            AreaTarget/California_Lakes_73		
        END Instance
        Instance AreaTarget/California_Lakes_74
            AreaTarget/California_Lakes_74		
        END Instance
        Instance AreaTarget/California_Lakes_75
            AreaTarget/California_Lakes_75		
        END Instance
        Instance AreaTarget/California_Lakes_76
            AreaTarget/California_Lakes_76		
        END Instance
        Instance AreaTarget/California_Lakes_77
            AreaTarget/California_Lakes_77		
        END Instance
        Instance AreaTarget/California_Lakes_78
            AreaTarget/California_Lakes_78		
        END Instance
        Instance AreaTarget/California_Lakes_79
            AreaTarget/California_Lakes_79		
        END Instance
        Instance AreaTarget/California_Lakes_8
            AreaTarget/California_Lakes_8		
        END Instance
        Instance AreaTarget/California_Lakes_80
            AreaTarget/California_Lakes_80		
        END Instance
        Instance AreaTarget/California_Lakes_81
            AreaTarget/California_Lakes_81		
        END Instance
        Instance AreaTarget/California_Lakes_82
            AreaTarget/California_Lakes_82		
        END Instance
        Instance AreaTarget/California_Lakes_83
            AreaTarget/California_Lakes_83		
        END Instance
        Instance AreaTarget/California_Lakes_84
            AreaTarget/California_Lakes_84		
        END Instance
        Instance AreaTarget/California_Lakes_85
            AreaTarget/California_Lakes_85		
        END Instance
        Instance AreaTarget/California_Lakes_86
            AreaTarget/California_Lakes_86		
        END Instance
        Instance AreaTarget/California_Lakes_87
            AreaTarget/California_Lakes_87		
        END Instance
        Instance AreaTarget/California_Lakes_88
            AreaTarget/California_Lakes_88		
        END Instance
        Instance AreaTarget/California_Lakes_89
            AreaTarget/California_Lakes_89		
        END Instance
        Instance AreaTarget/California_Lakes_9
            AreaTarget/California_Lakes_9		
        END Instance
        Instance AreaTarget/California_Lakes_91
            AreaTarget/California_Lakes_91		
        END Instance
        Instance AreaTarget/California_Lakes_92
            AreaTarget/California_Lakes_92		
        END Instance
        Instance AreaTarget/California_Lakes_93
            AreaTarget/California_Lakes_93		
        END Instance
        Instance AreaTarget/California_Lakes_94
            AreaTarget/California_Lakes_94		
        END Instance
        Instance AreaTarget/California_Lakes_95
            AreaTarget/California_Lakes_95		
        END Instance
        Instance AreaTarget/California_Lakes_96
            AreaTarget/California_Lakes_96		
        END Instance
        Instance AreaTarget/California_Lakes_98
            AreaTarget/California_Lakes_98		
        END Instance
        Instance AreaTarget/California_Lakes_99
            AreaTarget/California_Lakes_99		
        END Instance
        Instance AreaTarget/Cardoza_Lake_70
            AreaTarget/Cardoza_Lake_70		
        END Instance
        Instance AreaTarget/Cathey_Pond_104
            AreaTarget/Cathey_Pond_104		
        END Instance
        Instance AreaTarget/Dawson_Lake_67
            AreaTarget/Dawson_Lake_67		
        END Instance
        Instance AreaTarget/Don_Pedro_Reservoir_305
            AreaTarget/Don_Pedro_Reservoir_305		
        END Instance
        Instance AreaTarget/El_Nido_Reservoir_194
            AreaTarget/El_Nido_Reservoir_194		
        END Instance
        Instance AreaTarget/Floto_Lake_24
            AreaTarget/Floto_Lake_24		
        END Instance
        Instance AreaTarget/Giles_Pond_105
            AreaTarget/Giles_Pond_105		
        END Instance
        Instance AreaTarget/H__V__Eastman_Lake_50
            AreaTarget/H__V__Eastman_Lake_50		
        END Instance
        Instance AreaTarget/Hensley_Lake_193
            AreaTarget/Hensley_Lake_193		
        END Instance
        Instance AreaTarget/Kelsey_Reservoir_90
            AreaTarget/Kelsey_Reservoir_90		
        END Instance
        Instance AreaTarget/La_Grange_Reservoir_34
            AreaTarget/La_Grange_Reservoir_34		
        END Instance
        Instance AreaTarget/Lake_Honda_134
            AreaTarget/Lake_Honda_134		
        END Instance
        Instance AreaTarget/Lake_McClure_32_0
            AreaTarget/Lake_McClure_32_0		
        END Instance
        Instance AreaTarget/Lake_McClure_32_1
            AreaTarget/Lake_McClure_32_1		
        END Instance
        Instance AreaTarget/Lake_McClure_32_2
            AreaTarget/Lake_McClure_32_2		
        END Instance
        Instance AreaTarget/Lake_McClure_32_3
            AreaTarget/Lake_McClure_32_3		
        END Instance
        Instance AreaTarget/Lake_McClure_32_4
            AreaTarget/Lake_McClure_32_4		
        END Instance
        Instance AreaTarget/Lake_McClure_32_5
            AreaTarget/Lake_McClure_32_5		
        END Instance
        Instance AreaTarget/Lake_McClure_32_6
            AreaTarget/Lake_McClure_32_6		
        END Instance
        Instance AreaTarget/Little_Buttonwillow_Lake_195
            AreaTarget/Little_Buttonwillow_Lake_195		
        END Instance
        Instance AreaTarget/Los_Banos_Reservoir_306
            AreaTarget/Los_Banos_Reservoir_306		
        END Instance
        Instance AreaTarget/Lower_Ruth_Lake_219
            AreaTarget/Lower_Ruth_Lake_219		
        END Instance
        Instance AreaTarget/Madera_Equalization_Reservoir_234_0
            AreaTarget/Madera_Equalization_Reservoir_234_0		
        END Instance
        Instance AreaTarget/Madera_Equalization_Reservoir_234_1
            AreaTarget/Madera_Equalization_Reservoir_234_1		
        END Instance
        Instance AreaTarget/Madera_Equalization_Reservoir_234_2
            AreaTarget/Madera_Equalization_Reservoir_234_2		
        END Instance
        Instance AreaTarget/Madera_Lake_239
            AreaTarget/Madera_Lake_239		
        END Instance
        Instance AreaTarget/Mariposa_Lake_308_0
            AreaTarget/Mariposa_Lake_308_0		
        END Instance
        Instance AreaTarget/Mariposa_Lake_308_1
            AreaTarget/Mariposa_Lake_308_1		
        END Instance
        Instance AreaTarget/Mcmahon_30
            AreaTarget/Mcmahon_30		
        END Instance
        Instance AreaTarget/Modesto_Reservoir_5
            AreaTarget/Modesto_Reservoir_5		
        END Instance
        Instance AreaTarget/Olson_Pond_218
            AreaTarget/Olson_Pond_218		
        END Instance
        Instance AreaTarget/Owens_Reservoir_48
            AreaTarget/Owens_Reservoir_48		
        END Instance
        Instance AreaTarget/Petes_Pond_115
            AreaTarget/Petes_Pond_115		
        END Instance
        Instance AreaTarget/Rushing_Lake_62
            AreaTarget/Rushing_Lake_62		
        END Instance
        Instance AreaTarget/Sierra_Vista_189
            AreaTarget/Sierra_Vista_189		
        END Instance
        Instance AreaTarget/Stockton_Creek_97
            AreaTarget/Stockton_Creek_97		
        END Instance
        Instance AreaTarget/Toledo_Pond_110
            AreaTarget/Toledo_Pond_110		
        END Instance
        Instance AreaTarget/Turlock_Lake_43
            AreaTarget/Turlock_Lake_43		
        END Instance
        Instance AreaTarget/Upper_Ruth_Lake_223
            AreaTarget/Upper_Ruth_Lake_223		
        END Instance
        Instance AreaTarget/Yosemite_Lake_307
            AreaTarget/Yosemite_Lake_307		
        END Instance
        Instance CoverageDefinition/CoverageDefinition1
            CoverageDefinition/CoverageDefinition1		
        END Instance
        Instance Satellite/BOBSAT1
            *		
            Satellite/BOBSAT1		
            Satellite/BOBSAT1/Sensor/Payload		
        END Instance
        Instance Satellite/BOBSAT1/Sensor/Payload
            Satellite/BOBSAT1/Sensor/Payload		
        END Instance
    END References

END Scenario

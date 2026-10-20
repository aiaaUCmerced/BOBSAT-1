50 is very similar to 100 in terms of electronics the key diff is the resolution and some basic stuff like the lense and rad hardning the size is also diff for both they have the same mech and ways of working

the github for that is here:

the full folder: https://github.com/Duck1405/hyperspectral-simera-emulator/tree/main/hyperscape50-emulator

the moon test run: https://github.com/Duck1405/hyperspectral-simera-emulator/tree/main/hyperscape50-emulator/datacubes/cube_20260527-120620_100lines_32bands

the data table for 50:

| Metric                    | Value                |
|-------------------------|--------------------|
| Cube shape                | 100 x 4096 x 32      |
| Data type                 | uint16               |
| Session/readout size      | 19,949,284 bytes     |
| Parsed cube size          | 26,214,528 bytes     |
| Readout time              | 5.35 s               |
| Capture energy            | 53.77 J / 0.01494 Wh |
| Capture energy per line   | 0.538 J/line         |
| Total measured run energy | 97.54 J / 0.02709 Wh |

Storage scaling:

| Lines | Session .bin Estimate | Parsed Cube uint16   |
|-----|---------------------|--------------------|
| 100   | 19.0 MiB / 19.9 MB    | 25.0 MiB / 26.2 MB   |
| 1000  | 190.3 MiB / 199.5 MB  | 250.0 MiB / 262.1 MB |
| 4000  | 761.0 MiB / 797.9 MB  | 1000.0 MiB / 1.05 GB |
| 12000 | 2.23 GiB / 2.39 GB    | 2.93 GiB / 3.15 GB   |

Power scaling:

| Lines | Capture Energy          |
|-----|-----------------------|
| 100   | 53.77 J / 0.01494 Wh    |
| 1000  | 537.71 J / 0.14936 Wh   |
| 4000  | 2,150.84 J / 0.59745 Wh |
| 12000 | 6,452.51 J / 1.79236 Wh |

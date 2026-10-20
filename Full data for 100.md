go to this folder path on github

simera-emulator/collected_data/emulator_data_summary.md

https://github.com/Duck1405/hyperspectral-simera-emulator/blob/main/simera-emulator/collected_data/emulator_data_summary.md

Trying out fake data: pic of fake moon: https://github.com/Duck1405/hyperspectral-simera-emulator/blob/main/simera-emulator/config/emulator_input_photos/moon\_(4096x3072).png

Results: \
test run folder: https://github.com/Duck1405/hyperspectral-simera-emulator/tree/main/simera-emulator/datacubes/cube_20260527-113042_100lines_32bands\
Power info:\
https://github.com/Duck1405/hyperspectral-simera-emulator/blob/main/simera-emulator/datacubes/cube_20260527-113042_100lines_32bands/power_samples.csv\
https://github.com/Duck1405/hyperspectral-simera-emulator/blob/main/simera-emulator/datacubes/cube_20260527-113042_100lines_32bands/telemetry_snapshots.csv

Power summary:

| Phase      | Mean Current |
|----------|------------|
| power_on   | 935 mA       |
| capture    | 1512.9 mA    |
| readout    | 935 mA       |
| parse_cube | 935 mA       |

Data Summary:

| Lines | Session .bin Estimate | Parsed Cube uint16   | Emulator Readout Time |
|:----|:--------------------|:-------------------|:--------------------|
| 100   | 19.0 MiB / 19.9 MB    | 25.0 MiB / 26.2 MB   | 5.9 s measured        |
| 500   | 95.1 MiB / 99.7 MB    | 125.0 MiB / 131.1 MB | ~29.5 s               |
| 1000  | 190.3 MiB / 199.5 MB  | 250.0 MiB / 262.1 MB | ~59 s                 |
| 4000  | 761.0 MiB / 797.9 MB  | 1000.0 MiB / 1.05 GB | ~3.9 min              |
| 12000 | 2.23 GiB / 2.39 GB    | 2.93 GiB / 3.15 GB   | ~11.8 min             |

More data simplified: (All the needed info on 100)

| Metric                           | Value              |
|:-------------------------------|:-----------------|
|                                  |                    |
|                                  |                    |
|                                  |                    |
| Capture energy per line          | 0.736 J/line       |
| Capture energy per line          | 0.000205 Wh/line   |
| Capture energy per line per band | 0.0230 J/line/band |

Whole measured run, including power-on, capture, readout, and parsing:

| Phase       | Energy                |
|:----------|:--------------------|
| Power/setup | 11.94 J               |
| Capture     | 73.65 J               |
| Readout     | 26.94 J               |
| Parse cube  | 10.93 J               |
| Total       | 123.45 J / 0.03429 Wh |

Projected capture-only energy:

| Lines | Capture Energy         |
|:----|:---------------------|
| 100   | 73.65 J / 0.0205 Wh    |
| 1000  | 736.46 J / 0.2046 Wh   |
| 4000  | 2,945.83 J / 0.8183 Wh |
| 12000 | 8,837.50 J / 2.4549 Wh |

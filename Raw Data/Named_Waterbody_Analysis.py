import pandas as pd
import matplotlib.pyplot as plt
import os

PATH = os.path.join(os.path.dirname(__file__), "Named_Waterbodies_Largest-Smallest.csv")

data = pd.read_csv(PATH)


ds = data.sort_values(by="areasqkm").reset_index()["areasqkm"]


# ds = data["areasqkm"]

plt.plot(ds[-20:])
# plt.plot(ds)
plt.xlabel("Lake")
plt.ylabel("sqkm")
plt.title("Visual of Lake Size")
plt.show()

# Average size of lake is 2.7 sq km
# top 20 lakes range from 50 - 800 sq km 
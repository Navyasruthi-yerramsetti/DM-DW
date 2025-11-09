import matplotlib.pyplot as plt
import numpy as np

# Sample data
data = [23, 45, 56, 78, 33, 45, 67, 89, 90, 34]

# Histogram
plt.hist(data, bins=5, color='skyblue')
plt.title("Histogram")
plt.show()

# Box Plot
plt.boxplot(data)
plt.title("Box Plot")
plt.show()

# Bar Chart
categories = ['A', 'B', 'C', 'D']
values = [10, 20, 15, 30]
plt.bar(categories, values, color='orange')
plt.title("Bar Chart")
plt.show()

# Pie Chart
plt.pie(values, labels=categories, autopct='%1.1f%%')
plt.title("Pie Chart")
plt.show()

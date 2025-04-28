import pandas as pd


dataset = pd.read_csv("./Salary_dataset.csv")

X = dataset[["YearsExperience"]].values 
y = dataset["Salary"].values

from sklearn.linear_model import LinearRegression
from sklearn.model_selection import train_test_split

X_train, X_test, y_train, y_test = train_test_split(X,y,test_size=0.2, random_state=0)

regression = LinearRegression()
regression.fit(X_train, y_train)

print(regression.predict([[14]]))

import pickle 
with open("model.pkl", "wb") as f:
    pickle.dump(regression, f)
    print("Model saved successfully!")
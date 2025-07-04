const express = require("express");
const exphbs = require("express-handlebars");

const app = express();

app.engine("handlebars", exphbs.engine({ defaultLayout: "main" }));
app.set("view engine", "handlebars");

app.use(express.static("public"));

app.get("/", (req, res) => {
  res.render("home", {
    title: "Hello there",
    message: "Generated with love using Handlebars",
  });
});

app.get("/users", (req, res) => {
  const users = [
    { name: "Nata", age: 69 },
    { name: "Seere", age: 45 },
    { name: "Gokesh", age: 31 },
  ];
  res.render("users", {
    title: "User List",
    users,
  });
});

const port = process.env.PORT || 3000;
app.listen(port, () => {
  console.log("Server now running");
});

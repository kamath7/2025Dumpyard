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

const port = process.env.PORT || 3000;
app.listen(port, () => {
  console.log("Server now running");
});

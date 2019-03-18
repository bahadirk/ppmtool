import React, { Component } from "react";
import "./App.css";
import Dashboard from "./components/Dashboard";
import ProjectItem from "./components/Project/ProjectItem";
import Header from "./components/Layout/Header";

class App extends Component {
  render() {
    return (
      <div className="App">
        <Header />
        <Dashboard />
        <ProjectItem />
      </div>
    );
  }
}

export default App;

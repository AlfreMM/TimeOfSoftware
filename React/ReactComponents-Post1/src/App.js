import React from 'react';
import './App.css';
import ClassComponent from './Components/classcomponent';
import FunctionComponent from './Components/functioncomponent';

const HelloWorld = () => <div>This is single line component</div>;

function App() {
  return (
    <div className="App">
      <HelloWorld/>
      <ClassComponent/>
      <FunctionComponent/>
    </div>
  );
}

export default App;
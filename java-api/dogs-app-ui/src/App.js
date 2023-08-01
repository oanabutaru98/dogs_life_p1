import { Fragment } from 'react';
import './App.css';
import DogsList from './components/DogsList';

function App() {
  return (
    <Fragment>
      <h2>This is my dogs list:</h2>
      <DogsList />
    </Fragment>
  );
}

export default App;

import React from 'react'
import HeroDetail from './HeroDetail'
import Row from 'react-bootstrap/Row'

const AllHeroes = () => {
    const heroes = [
        {"id":1,"name":"Bruce Wayne","alias":"Batman","superpower":"Martial arts","teamid":1},
        {"id":2,"name":"clark kent","alias":"Superman","superpower":"flight","teamid":1},
        {"id":3,"name":"jay garrick","alias":"The Flash","superpower":"super speed","teamid":2},
        {"id":4,"name":"alan scott","alias":"Green Lantern","superpower":"ring creation","teamid":2},
        {"id":5,"name":"helena bertenelli","alias":"The Huntress","superpower":"crossbow archery","teamid":3},
        {"id":6,"name":"dr harleen quinzel","alias":"Harley Queen","superpower":"hammer fighting","teamid":3},
        {"id":7,"name":"floyd lawton","alias":"Deadshot","superpower":"marksmaship","teamid":4},
        {"id":8,"name":"cecil adams","alias":"Count Vertigo","superpower":"drug dealing","teamid":4},
        {"id":9,"name":"damian Wayne","alias":"Robin","superpower":"swordmanship","teamid":5},
        {"id":10,"name":"dick grayson","alias":"Nightwing","superpower":"acrobatics","teamid":5}
    ]
  return (
    <Row>
      {heroes.map ( hero => (
        <div className='container' key={hero.id}>
        <HeroDetail info={hero}/>
        </div>
      ))}
    </Row>
    // heroes.map( hero => (
    //     <HeroDetail info={hero} key={hero.id.toString()}/>
    // ))
  )
}

export default AllHeroes
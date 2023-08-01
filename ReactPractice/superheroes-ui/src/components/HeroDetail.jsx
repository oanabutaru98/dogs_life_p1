import React from 'react'
import batman from '../images/batman.jpg'

const HeroDetail = () => {
  return (
    <div>
        <img src={batman} alt="batman" height="250px" />
        <p id="blue-alias">Alias: batman</p>
        <p class="green-class">Name: Bruce Wayne</p>
        <button class="green-class">Like</button>
    </div>
  )
}

export default HeroDetail
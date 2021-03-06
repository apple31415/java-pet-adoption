import React, { useState, useEffect } from 'react'
import PetAdoptionsForm from './PetAdoptionsForm'

const PetShow = (props) => {
  let petId = props.match.params.id
  const [displayForm, setDisplayForm] = useState(false)
  const [pet, setPet] = useState([])
  const [applicationStatus, setApplicationStatus] = useState("")
  const [pageFound, setPageFound] = useState(true)

  let vaccinated = pet.vaccination_status === true? "Yes" : "No"

  useEffect(() => {
    fetch(`/api/v1${props.location.pathname}`)
    .then(response => {
      if (response.ok) {
        return response
      } else {
        setPageFound(false)
      }
    })
    .then(result => result.json())
    .then(pet => {
      console.log(pet)
      setPet(pet)
    })
  }, [])
  
  
  const handleAdoptClick = () => {
    let formState = displayForm === true ? false : true
    setDisplayForm(formState)
  }

  let adoptForm;
  if (applicationStatus === "pending") adoptForm = "Your request is in process"
  else {
    adoptForm = displayForm === true ? 
    <PetAdoptionsForm pet_id={pet.id} 
      setApplicationStatus={setApplicationStatus}
      setDisplayForm={setDisplayForm}
      /> : <button className="dope-ass-button" onClick={handleAdoptClick}>Adopt Me!</button>
  }
  let response
  if(!pageFound) {
    response = (
      <h1>Page not found!</h1>
    )
  } else {
    response = (
      <div className="show-pet-container">
      <div className="show-pet-main">
        <div className="info-container" >
          <h3>Name: {pet.name}</h3>
          <p>Age: {pet.age}</p>
          <p>Vaccinated: {vaccinated}</p>
          <p>{pet.adoptionStory}</p>
        </div>
        <div className="image-container">
        <img className="pet-image" src={pet.img_url} />
        </div>
      </div>
      {adoptForm}
    </div>
    )
  }
  return response
}

export default PetShow

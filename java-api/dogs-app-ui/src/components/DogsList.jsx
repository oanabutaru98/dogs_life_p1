import { useEffect, useState } from "react";
import axios from "axios";

const DogsList = () => {
    const [dogs, setDogs] = useState([])

    useEffect(() => {
        const getAllDogs = async () => {
            const result = await axios.get("http://localhost:8080/api/v1/dogs")

            console.log(result)
        }

        getAllDogs()
    }, [])

    return (
        <div>This is my dogs list!</div>
    )
}

export default DogsList;
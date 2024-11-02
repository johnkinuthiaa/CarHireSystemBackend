import { personDetails as details} from './exp'

const paragraph =document.getElementById("details")
const{ name,Age, Gender } =details
paragraph.innerHTML +=`${name},${Age},${Gender}`

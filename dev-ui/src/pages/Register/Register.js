import { useState } from "react";
import axios from "axios";
import "./Register.css";

const Register = () => {

    const [formData, setFormData] = useState({
        firstName: "",
        lastName: "",
        userEmail: "",
        contact: "",
        gender: "",
        age: "",
        userAddress: "",
        userPass: ""
    });

    const handleChange = (e) => {
        setFormData({
            ...formData,
            [e.target.name]: e.target.value
        });
    };

    const handleSubmit = async (e) => {
        e.preventDefault();

        try {
            const response = await axios.post(
                "http://localhost:8080/users/register",
                formData
            );

            console.log("Success:", response.data);
            alert("Registration successful!");

            // Reset form after success

            setFormData({
                firstName: "",
                lastName: "",
                userEmail: "",
                contact: "",
                gender: "",
                age: "",
                userAddress: "",
                userPass: ""
            });

        } catch (error) {
            console.error("Error:", error.response?.data || error.message);
            alert("Registration failed!");
        }
    };

    return (
        <div className="container cnbdy">
            <div className="card registration-card">
                <div className="card-header">
                    <h3>Create Your Account</h3>
                </div>

                <div className="card-body p-4">
                    <form onSubmit={handleSubmit}>

                        <input
                            name="firstName"
                            placeholder="First Name"
                            value={formData.firstName}
                            onChange={handleChange}
                        />

                        <input
                            name="lastName"
                            placeholder="Last Name"
                            value={formData.lastName}
                            onChange={handleChange}
                        />

                        <input
                            name="userEmail"
                            placeholder="Email"
                            value={formData.userEmail}
                            onChange={handleChange}
                        />

                        <input
                            name="contact"
                            placeholder="Contact"
                            value={formData.contact}
                            onChange={handleChange}
                        />

                        <input
                            name="age"
                            placeholder="Age"
                            value={formData.age}
                            onChange={handleChange}
                        />

                        <textarea
                            name="userAddress"
                            placeholder="Address"
                            value={formData.userAddress}
                            onChange={handleChange}
                        ></textarea>

                        <input
                            type="password"
                            name="userPass"
                            placeholder="Password"
                            value={formData.userPass}
                            onChange={handleChange}
                        />

                        <select
                            name="gender"
                            value={formData.gender}
                            onChange={handleChange}
                        >
                            <option value="">Select Gender</option>
                            <option value="male">Male</option>
                            <option value="female">Female</option>
                        </select>

                        <button type="submit">Register</button>
                        <span className="m-auto">Already have account?<a href="#" style={{textDecoration:"none"}}> Login</a></span>

                    </form>
                </div>
            </div>
        </div>
    );
};

export default Register;
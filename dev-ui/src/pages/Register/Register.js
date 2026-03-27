import { useState } from "react";
import './Register.css';

const Register = () => {

    const [formData, setFormData] = useState({
        firstName: "",
        lastName: "",
        Email: "",
        contact: "",
        gender: "",
        age: "",
        Address: "",
        Pass: ""
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
            const response = await fetch("https://localhost:8080/users/register", {
                method: "POST",
                headers: {
                    "Content-Type": "application/json"
                },
                body: JSON.stringify(formData)
            });

            const data = await response.json();
            console.log("Success:", data);

        } catch (error) {
            console.error("Error:", error);
        }
    };

    return (
        <div className="container cnbdy">
            <div className="card registration-card">
                <div className="card-header">
                    <h3>Create Your Account</h3>
                </div>
                <div className="card-body p-4">

                    {/* ✅ use onSubmit instead */}
                    <form onSubmit={handleSubmit}>

                        <input name="firstName" placeholder="first name" onChange={handleChange} />
                        <input name="lastName" placeholder="last name" onChange={handleChange} />
                        <input name="Email" placeholder="email" onChange={handleChange} />
                        <input name="contact" placeholder="contact" onChange={handleChange} />
                        <input name="age" placeholder="age" onChange={handleChange} />
                        <textarea name="Address" placeholder="address" onChange={handleChange}></textarea>
                        <input name="Pass" placeholder="password" onChange={handleChange} />

                        <select name="gender" onChange={handleChange}>
                            <option value="">gender</option>
                            <option value="male">Male</option>
                            <option value="female">Female</option>
                        </select>

                        <button type="submit">Register</button>
                    </form>

                </div>
            </div>
        </div>
    );
};

export default Register;
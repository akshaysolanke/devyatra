import React from 'react';
import './Home.css'; 

const Home = () => {
    const destinations = [
        {
            title: "Kashi Vishwanath",
            img: "https://images.unsplash.com/photo-1627894483216-2138af692e32?w=800",
            text: "Experience the eternal city and the divine Ganga Aarti."
        },
        {
            title: "Tirumala Tirupati",
            img: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQzr2m4D4QfZFmwATH1kZbR73XlmBYlVkH4Wg&s",
            text: "Visit the world's most-visited sacred shrine of Lord Venkateswara."
        },
        {
            title: "Golden Temple",
            img: "https://upload.wikimedia.org/wikipedia/commons/thumb/9/94/The_Golden_Temple_of_Amrithsar_7.jpg/1280px-The_Golden_Temple_of_Amrithsar_7.jpg",
            text: "A symbol of brotherhood and spiritual purity at Amritsar."
        }
    ];

    return (
        <div className="home-container">

            {/* Hero Section */}
            <header className="hero-section">
                <div className="container">
                    <h1 className="hero-title">Experience the Divine from Anywhere</h1>
                    <p className="lead mb-4">A digital gateway to spiritual enlightenment and sacred destinations.</p>
                    <div className="d-flex justify-content-center gap-3">
                        <a href="#about" className="btn-pilgrim">Learn More</a>
                        <button className="btn btn-outline-light px-4 py-2 rounded-pill">View Darshan</button>
                    </div>
                </div>
            </header>

            {/* About Section */}
            <section id="about" className="text-center">
                <div className="container">
                    <div className="row justify-content-center">
                        <div className="col-md-8">
                            <h2 className="mb-4">Our Sacred Mission</h2>
                            <p className="text-muted">
                                We provide a seamless digital platform for pilgrims worldwide to register for physical visits,
                                participate in live virtual darshans, and access religious resources.
                            </p>
                        </div>
                    </div>
                </div>
            </section>

            {/* Destinations Preview */}
            <section id="destinations" className="py-5">
                <div className="container">
                    <h2 className="text-center mb-5 font-cinzel">Popular Destinations</h2>
                    <div className="row g-4">
                        {destinations.map((dest, index) => (
                            <div className="col-md-4" key={index}>
                                <div className="card border-0 shadow-sm h-100">
                                    <img
                                        src={dest.img}
                                        className="card-img-top destination-card-img"
                                        alt={dest.title}
                                    />
                                    <div className="card-body text-center">
                                        <h5 className="card-title fw-bold">{dest.title}</h5>
                                        <p className="card-text text-muted">{dest.text}</p>
                                        <button className="btn btn-sm btn-outline-warning">View Details</button>
                                    </div>
                                </div>
                            </div>
                        ))}
                    </div>
                </div>
            </section>
        </div>
    );
};

export default Home;
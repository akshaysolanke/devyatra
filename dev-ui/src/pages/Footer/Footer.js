import React from 'react';
import { Container, Row, Col, Form, Button } from 'react-bootstrap';
import { FaFacebookF, FaTwitter, FaInstagram, FaYoutube } from 'react-icons/fa'; // Optional: npm install react-icons
import './Footer.css';

const Footer = () => {
    return (
        <footer className="footer-custom pt-5 pb-3">
            <Container>
                <Row className="gy-4">
                    {/* Brand & Mission */}
                    <Col lg={4} md={6}>
                        <h4 className="footer-brand"><span className="gold-text">DEV</span>YATRA</h4>
                        <p className="footer-description">
                            Connecting the world to sacred spaces through immersive digital experiences and
                            supported physical journeys. Bringing peace to your doorstep.
                        </p>
                        <div className="social-links">
                            <a href="#!"><FaFacebookF /></a>
                            <a href="#!"><FaTwitter /></a>
                            <a href="#!"><FaInstagram /></a>
                            <a href="#!"><FaYoutube /></a>
                        </div>
                    </Col>

                    {/* Quick Links */}
                    <Col lg={2} md={6}>
                        <h5 className="footer-heading">Explore</h5>
                        <ul className="list-unstyled footer-links">
                            <li><a href="#about">About Us</a></li>
                            <li><a href="#packages">Packages</a></li>
                            <li><a href="#services">Services</a></li>
                            <li><a href="#blog">Spiritual Blog</a></li>
                        </ul>
                    </Col>

                    {/* Support */}
                    <Col lg={2} md={6}>
                        <h5 className="footer-heading">Support</h5>
                        <ul className="list-unstyled footer-links">
                            <li><a href="#faq">FAQs</a></li>
                            <li><a href="#contact">Contact Us</a></li>
                            <li><a href="#privacy">Privacy Policy</a></li>
                            <li><a href="#terms">Terms of Service</a></li>
                        </ul>
                    </Col>

                    {/* Newsletter */}
                    <Col lg={4} md={6}>
                        <h5 className="footer-heading">Stay Connected</h5>
                        <p className="footer-description">Receive updates on live prayers and new virtual tours.</p>
                        <Form className="d-flex mt-3">
                            <Form.Control
                                type="email"
                                placeholder="Your Email"
                                className="newsletter-input"
                            />
                            <Button variant="gold" className="ms-2">Join</Button>
                        </Form>
                    </Col>
                </Row>

                <hr className="footer-divider mt-5 mb-4" />

                <Row>
                    <Col className="text-center">
                        <p className="copyright-text">
                            &copy; {new Date().getFullYear()} DevYatra Online Pilgrimage. All rights reserved.
                        </p>
                    </Col>
                </Row>
            </Container>
        </footer>
    );
};

export default Footer;
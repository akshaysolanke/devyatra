import React from 'react';
import { Navbar, Nav, Container, NavDropdown, Button } from 'react-bootstrap';
import './Header.css';

const Header = () => {
    return (
        <Navbar collapseOnSelect expand="lg" className="header-custom sticky-top py-3">
            <Container>
                {/* Logo / Brand */}
                <Navbar.Brand href="#home" className="brand-logo">
                    <span className="gold-text">DEV</span>YATRA
                </Navbar.Brand>

                <Navbar.Toggle aria-controls="responsive-navbar-nav" />

                <Navbar.Collapse id="responsive-navbar-nav">
                    <Nav className="ms-auto align-items-center">
                        <Nav.Link href="#about" className="nav-item-custom">About Us</Nav.Link>

                        {/* Packages Dropdown */}
                        <NavDropdown title="Packages" id="collasible-nav-dropdown" className="nav-item-custom">
                            <NavDropdown.Item href="#virtual-vr">Virtual VR Tours</NavDropdown.Item>
                            <NavDropdown.Item href="#live-stream">Live Stream Events</NavDropdown.Item>
                            <NavDropdown.Divider />
                            <NavDropdown.Item href="#hybrid-travel">Hybrid Travel</NavDropdown.Item>
                        </NavDropdown>

                        <Nav.Link href="#services" className="nav-item-custom">Services</Nav.Link>

                        {/* Auth Buttons */}
                        <div className="auth-buttons ms-lg-4">
                            <Nav.Link href="/register" className="d-inline me-3 login-link">Login</Nav.Link>
                            <Button variant="outline-gold" className="register-btn">
                                Register
                            </Button>
                        </div>
                    </Nav>
                </Navbar.Collapse>
            </Container>
        </Navbar>
    );
};

export default Header;
import React from 'react';
import { Navbar, Nav, Container} from 'react-bootstrap';
import './Header.css';

const Header = () => {
    return (
        <Navbar collapseOnSelect expand="lg" className="header-custom sticky-top py-3">
            <Container>
                {/* Logo / Brand */}
                <Navbar.Brand href="/" className="brand-logo">
                    <span className="gold-text">DEV</span>YATRA
                </Navbar.Brand>

                <Navbar.Toggle aria-controls="responsive-navbar-nav" />

                <Navbar.Collapse id="responsive-navbar-nav">
                    <Nav className="ms-auto align-items-center">
                        <Nav.Link href="#about" className="nav-item-custom">About Us</Nav.Link>
                        <Nav.Link href="#packages" className="nav-item-custom">Packages</Nav.Link>
                        <Nav.Link href="#services" className="nav-item-custom">Services</Nav.Link>
                        <Nav.Link href="/register" className="nav-item-custom">Login</Nav.Link>
                    </Nav>
                </Navbar.Collapse>
            </Container>
        </Navbar>
    );
};

export default Header;
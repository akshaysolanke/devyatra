import { Routes, Route } from "react-router-dom";
import Home from "./pages/Home/Home";
import Header from "./pages/Header/Header";
import Footer from "./pages/Footer/Footer";
import Register from "./pages/Register/Register";
function App() {
  return (
      <div>
          <Header />
            <Routes>
                <Route path="/" element={<Home />}></Route>
                <Route path="/register" element={<Register />}></Route>
            </Routes>
          <Footer />
      </div>
  );
}

export default App;

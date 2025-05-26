import { useContext, useState } from "react";
import { UserContext } from "../contexts/UserContext";
import { useNavigate } from "react-router-dom";
import axios from "axios";
import { toast } from "react-toastify";

function Login() {
  const {user, login } = useContext(UserContext);
  const navigate = useNavigate();

  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");

  const handleSubmit = async (e) => {
    e.preventDefault();

    try {
      const response = await axios.post(
        "http://localhost:8080/users/api/users/authenticate",
        { "email":email.trim(), "password":password.trim() },
        {
          headers: {
            "Content-Type": "application/json",
          },
        }
      );

      const userData = response.data;

      if (userData) {
        login(userData); // store user in context
        toast.success("Login successful!");
        if(user?.admin)
          navigate("/admin/products")
        else
          navigate("/"); // redirect to home
      } else {
        toast.error("Authentication failed. Please try again.");
      }
    } catch (error) {
      console.error("Login error:", error);
      toast.error("Authentication failed. Please check credentials.");
    }
  };

  return (
    <div className="form-container">
      <h2>Login</h2>
      <form className="form" onSubmit={handleSubmit}>
        <input
          type="email"
          placeholder="Email"
          value={email}
          onChange={(e) => setEmail(e.target.value)}
          required
        />
        <input
          type="password"
          placeholder="Password"
          value={password}
          onChange={(e) => setPassword(e.target.value)}
          required
        />
        <button type="submit">Login</button>
      </form>
    </div>
  );
}

export default Login;

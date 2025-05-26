import { createContext, useState } from "react";

export const UserContext = createContext();

export function UserProvider({ children }) {
  const [user, setUser] = useState(null);

  const login = (userData) => {
    const isAdmin = userData.email && userData.email.includes("admin.com");
    setUser({ ...userData, admin: isAdmin });
  };

  const logout = () => {
    setUser(null); // Clear user info when logout
  };

  return (
    <UserContext.Provider value={{ user, login, logout }}>
      {children}
    </UserContext.Provider>
  );
}

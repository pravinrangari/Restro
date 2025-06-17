<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
  <title>Colorful Login</title>
  <style>
    * {
      box-sizing: border-box;
      margin: 0;
      padding: 0;
    }

    body {
      font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
      height: 100vh;
      background: linear-gradient(135deg, #ff6ec4, #7873f5, #4ADEDE);
      background-size: 600% 600%;
      animation: gradientFlow 10s ease infinite;
      display: flex;
      justify-content: center;
      align-items: center;
    }

    @keyframes gradientFlow {
      0% {background-position: 0% 50%;}
      50% {background-position: 100% 50%;}
      100% {background-position: 0% 50%;}
    }

    .login-box {
      background: rgba(255, 255, 255, 0.2);
      padding: 40px 30px;
      border-radius: 15px;
      box-shadow: 0 8px 25px rgba(0, 0, 0, 0.2);
      backdrop-filter: blur(10px);
      width: 300px;
    }

    .login-box h2 {
      color: #fff;
      text-align: center;
      margin-bottom: 25px;
    }

    .login-box label {
      display: block;
      margin-bottom: 8px;
      color: #f1f1f1;
      font-weight: 500;
    }

    .login-box input {
      width: 100%;
      padding: 10px;
      margin-bottom: 20px;
      border: none;
      border-radius: 8px;
      font-size: 1rem;
    }

    .login-box button {
      width: 100%;
      padding: 12px;
      background-color: #fff;
      color: #333;
      font-weight: bold;
      border: none;
      border-radius: 8px;
      cursor: pointer;
      transition: background 0.3s ease;
    }

    .login-box button:hover {
      background-color: #f0f0f0;
    }
  </style>
</head>
<body>
  <div class="login-box">
  <%@includefile="message.jsp" %>
    <h2>🌟 Login</h2>
    <form action="AdminLoginServlet1" method="post">
      <label for="username">Username</label>
      <input type="text" id="username" name="username" required />

      <label for="password">Password</label>
      <input type="password" id="password" name="password" required />

      <button type="submit">Submit</button>
    </form>
  </div>
</body>
</html>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">

  <!-- Always force latest IE rendering engine (even in intranet) & Chrome Frame 
       Remove this if you use the .htaccess -->
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">

  <title>Login</title>
  <meta name="description" content="">
  <meta name="author" content="Alejandro">

  <meta name="viewport" content="width=device-width; initial-scale=1.0">
</head>

<body>
Hola ! <%= request.getSession(false).getAttribute("username") %>
</body>
</html>

<%-- 
    Document   : UpdateProfile
    Created on : Mar 9, 2022, 12:08:31 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>profile</title>
    </head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" />
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js" />
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" />
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js" />
    
    <style>
        body {
    background: #03e9f4
}

.form-control:focus {
    box-shadow: none;
    border-color: #BA68C8
}

.profile-button {
    background: #BA68C8;
    box-shadow: none;
    border: none
}

.profile-button:hover {
    background: #682773
}

.profile-button:focus {
    background: #682773;
    box-shadow: none
}

.profile-button:active {
    background: #682773;
    box-shadow: none
}

.back:hover {
    color: #682773;
    cursor: pointer
}

.labels {
    font-size: 11px
}

.add-experience:hover {
    background: #BA68C8;
    color: #fff;
    cursor: pointer;
    border: solid 1px #BA68C8
}
    </style>
    <body>
        <h2><a href="home?page=${1}">Back</a></h2>
        <div class="container rounded bg-white mt-5 mb-5">
            <%
                    if (session.getAttribute("mess") != null) {
                %>
                <h2 id="h2" style="color:red">${sessionScope.mess}</h2>
                <%
                        session.removeAttribute("mess");
                    }
                %> 
    <div class="row">
        
        <div class="col-md-3 border-right">
            <div class="d-flex flex-column align-items-center text-center p-3 py-5"><img class="rounded-circle mt-5" src="https://upload.wikimedia.org/wikipedia/commons/d/d3/Microsoft_Account.svg" width="90">
                <span class="font-weight-bold">Your Profile</span>
            </div>
        </div>
        
        <div col-md-3 class=" border-right">
            <div class="p-3 py-5">
                <div class="d-flex justify-content-between align-items-center mb-3">
                    <h6 class="text-right">Edit your profile</h6>
                </div>
            <form action="updateprofile" method="post">
                <div class="row mt-2">
                    <div class="col-md-6">
                        <label class="labels">Id</label>
                        <input type="number" class="form-control" placeholder="Enter id " name="id" required>
                    </div>
                    <div class="col-md-6">
                        <label class="labels">Name</label>
                        <input type="text" class="form-control" placeholder="Enter name " name="name" required>
                    </div>
                </div>
                <div class="row mt-3">
                    <div class="col-md-12">
                        <label class="labels">Username</label>
                        <input type="text" class="form-control" placeholder="Enter username" name="acc" required>
                    </div>
                    <div class="col-md-12">
                        <label class="labels">New Password</label>
                        <input type="text" class="form-control" placeholder="Enter new password" name="pass" required>
                    </div>
                    <div class="col-md-12">
                        <label class="labels">Amount</label>
                        <input type="number" class="form-control" placeholder="Enter amount" name="amount" required>
                    </div>
                </div>
                <div class="mt-5 text-center">
                    <input class="btn btn-primary profile-button" type="submit" value="Save Profile">
                </div>
            </form>
            </div>
        </div>
            
    </div>
</div>
    </body>
</html>

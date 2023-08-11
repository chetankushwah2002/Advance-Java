

<style>
@import url('https://fonts.googleapis.com/css?family=PT+Sans');

body{
  background: #fff;
  font-family: 'PT Sans', sans-serif;
}
h2{
  padding-top: 1.5rem;
}
a{
  color: #333;
}
a:hover{
  color: #da5767;
  text-decoration: none;
}
.card{
  border: 0.40rem solid #f8f9fa;
  top: 10%;
}
.form-control{
  background-color: #f8f9fa;
  padding: 20px;
  padding: 25px 15px;
  margin-bottom: 1.3rem;
}

.form-control:focus {

    color: #000000;
    background-color: #ffffff;
    border: 3px solid #da5767;
    outline: 0;
    box-shadow: none;

}

.btn{
  padding: 0.6rem 1.2rem;
  background: #da5767;
  border: 2px solid #da5767;
}
.btn-primary:hover {

    
    background-color: #df8c96;
    border-color: #df8c96;
  transition: .3s;

}
</style>
<div class="container">
  <div class="row justify-content-center">
  <div class="col-md-5">
   <div class="card">
     <h2 class="card-title text-center">Register <a href="http://opensnippets.com">open snippets</a></h2>
      <div class="card-body py-md-4">
       <form method="POST" action="/user/update">
       <div class="form-group">
             <input type="hidden" class="form-control" name="u_id" value="${user.u_id}" id="uName" placeholder="Name">
        </div>
          <div class="form-group">
             <input type="text" class="form-control" name="u_user_name" value="${user.u_user_name}" id="uName" placeholder="Name">
        </div>
        <div class="form-group">
             <input type="text" class="form-control" name="u_mobile" value="${user.u_mobile}" id="uMobile" placeholder="Email">
                            </div>
    
   <div class="form-group">
      <input type="text" name="u_address" value="${user.u_address}" class="form-control" id="confirm-password" placeholder="confirm-password">
   </div>
   <div class="d-flex flex-row align-items-center justify-content-between">
   
                                <button class="btn btn-primary">Create Account</button>
          </div>
       </form>
     </div>
  </div>
</div>
</div>
</div>
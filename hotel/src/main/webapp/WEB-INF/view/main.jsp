<html>
  <body style="background-color: antiquewhite">
    <div style="text-align: center; vertical-align: middle; position: relative">
      <h2 class="title">Welcome</h2>
      <a class="btn" href="controller?command=roomList">Room Info</a>
      <a class="btn" href="controller?command=addRoom">Book Room</a>
      <a class="btn" href="controller?command=Logout">Logout</a>
      <br></br>
       <img src="https://digital.ihg.com/is/image/ihg/intercontinental-ningbo-7234006479-2x1?fit=fit,1&wid=2880&hei=1440&qlt=85,0&resMode=sharp2&op_usm=1.75,0.9,2,0";
          height=600px;
          weight=1000px;
          >
    </div>
  </body>
</html>
<style>
  .btn {
    display: inline-block;
    width: 190px;
    height: 40px;
    line-height: 40px;
    margin: 0 10px;
    text-align: center;
    color: #fff;
    font-size: 25px;
    text-transform: uppercase;
    cursor: pointer;
    background: linear-gradient(90deg, #03a9f4, #f441a5, #ffeb3b, #03a9f4);
    background-size: 400%;
    border-radius: 60px;
  }

  .btn:hover {
    animation: animate 8s linear infinite;
  }

  @keyframes animate {
    0% {
      background-position: 0%;
    }

    100% {
      background-position: 400%;
    }
  }

  .btn::before {
    content: "";
    position: absolute;
    top: -5px;
    left: -5px;
    right: -5px;
    bottom: -5px;
    z-index: -1;
    background: linear-gradient(90deg, #03a9f4, #f441a5, #ffeb3b, #03a9f4);
    background-size: 400%;
    border-radius: 40px;
    opacity: 0;
    transition: 0.5s;
  }

  .btn:hover::before {
    filter: blur(20px);
    opacity: 1;
    animation: animate 8s linear infinite;
  }
  h2 {
    border: 0;
    background: none;
    text-transform: uppercase;
    color: #eea443;
    font-weight: bold;
    position: relative;
    outline: none;
    padding: 10px 15px;
    box-sizing: border-box;
    width: 140px;
    height: 55px;
    margin: 10px auto;
  }

  h2::before,
  h2::after {
    box-sizing: inherit;
    position: absolute;
    content: "";
    border: 3px solid transparent;
    width: 0;
    height: 0;
  }

  h2::after {
    bottom: 0;
    right: 0;
  }

  h2::before {
    top: 0;
    left: 0;
  }

  h2:hover::before,
  h2:hover::after {
    width: 100%;
    height: 100%;
  }

  h2:hover::before {
    border-top-color: #d9e2a8;
    border-right-color: #d9e2a8;
    transition: width 0.3s ease-out, height 0.3s ease-out 0.3s;
  }

  h2:hover::after {
    border-bottom-color: #d9e2a8;
    border-left-color: #d9e2a8;
    transition: border-color 0s ease-out 0.6s, width 0.3s ease-out 0.6s,
      height 0.3s ease-out 1s;
  }
</style>

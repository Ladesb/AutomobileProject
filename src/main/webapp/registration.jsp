<!DOCTYPE html>
<html>

<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
          integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"
            integrity="sha384-aJ21OjlMXNL5UyIl/XNwTMqvzeRMZH2w8c5cRVpzpU8Y5bApTppSuUkhZXN0VxHd"
            crossorigin="anonymous"></script>
</head>

<body>
<form>
    <div class="form-group">
        <p>Bonjour ${ cli.libelle }</p>
        <label for="exampleFormControlSelect1">${ cli }</label>
        <select class="form-control" id="exampleFormControlSelect1">
            <option selected>Choississez le client</option>
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="4">4</option>
            <option value="5">5</option>
        </select>
    </div>
    <div class="form-group">
        <label for="exampleFormControlSelect1">Produit</label>
        <select class="form-control" id="exampleFormControlSelect2">
            <option selected>Choississez le produit</option>
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="4">4</option>
            <option value="5">5</option>
            <option value="6">6</option>
            <option value="7">7</option>
            <option value="8">8</option>
            <option value="9">9</option>
            <option value="10">10</option>
        </select>
    </div>
    <div class="form-row align-items-center">
        <div class="col-auto my-1">
            <button type="submit" class="btn btn-primary" onclick="myFunction()"></button>>Calculer</button>
        </div>
        <div class="col-auto my-1">
            <samp id="resultat">Retour prix</samp>
        </div>
    </div>
</form>
<script>
    function myFunction() {
        document.getElementById("resultat").value = prix;
    }
</script>
</body>

</html>
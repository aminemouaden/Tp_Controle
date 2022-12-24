# Activite-Pratique-du-Controle
<h1><i>1-Objectif :</i><h1>
<h3>Créer une application basée sur une architecture micro-service qui permet de gérer les factures contenant des produits et appartenant à un client.</h3>
<ol>
  <li>Micro-service customer-service qui permet de gérer les client</li>
  <li>Micro-service inventory-service qui permet de gérer les produits</li>
  <li>Gateway Spring cloud Gateway avec une Configuration statique du système de routage</li>
  <li>Annuaire Eureka Discrovery Service</li>
  <li>Configuration dynamique des routes de la gateway</li>
  <li>Service de facturation Billing-Service en utilisant Open Feign</li>
  <li>Client Web Angular (Clients, Produits, Factures)</li>
  <li>Déployer le serveur keycloak :</li>
  <dl>
  <dt>- Créer un Realm</dt>
  <dt>- Créer un client à sécuriser</dt>
  <dt>- Créer des utilisateurs</dt>
  <dt>- Créer des rôles</dt>
  <dt>- Affecter les rôles aux utilisateurs</dt>
  <dt>- Tester les différents modes d'authentification avec Postman en montrant les contenus de Access-Token, Refresh Token</dt>
  </dl>
  <li>Sécuriser les micro-services et le frontend angular en déployant les adaptateurs Keycloak</li>
</ol>
<h1><i>2-Architecture de l'activité pratique :</i><h1>
<img src="https://user-images.githubusercontent.com/48455549/206859150-63e5c806-86a2-4937-8791-9a7ce2464316.PNG">
<h1><i>3-Simulation :</i><h1>
<img src="https://user-images.githubusercontent.com/74361043/207727000-7a8f4d8d-0b8b-4f72-adfa-ff8e0e16793d.png"/>
<img src="https://user-images.githubusercontent.com/74361043/207727399-0b08a790-fe3f-40a3-acf3-f7f65b4db0e4.png"/>
<img src="https://user-images.githubusercontent.com/74361043/207728133-6f20942b-f7f5-48ef-bf58-f58995cde985.png">
<img src="https://user-images.githubusercontent.com/74361043/207728477-ec4974dc-f70d-406d-94b9-b12ced726991.png">
  <ul>Eureka Service</ul>
  <img src="https://user-images.githubusercontent.com/74361043/207845098-8d43032c-d999-4269-87d7-21550dcf2a16.png">
<h1><i>4-Partie Front Angular :</i><h1>
<ul>Liste des produits</ul>
<img src="https://user-images.githubusercontent.com/74361043/207729026-68fa772c-384a-4246-bdb4-5f1573f86feb.png">
<ul>Liste des clients</ul>
<img src="https://user-images.githubusercontent.com/74361043/207729271-aa8da8c7-f7a3-4bd0-9817-348e9a474264.png">
<ul>Liste des factures d'un client</ul>
<img src="https://user-images.githubusercontent.com/74361043/207729424-62d6c16f-f472-4761-b8a3-f1ca9b540eb6.png">
<ul>Details d'une facture d'un client</ul>
<img src="https://user-images.githubusercontent.com/74361043/207732271-9d842f44-6c78-4f27-bfe6-716928e6966e.png">
<h1><i>5-Keycloak :</i><h1>
<img src="https://user-images.githubusercontent.com/74361043/207732736-a905ba2c-04db-4146-a932-7fc7c31f55ae.png">
<ul>authentication with client secret</ul>
<img src="https://user-images.githubusercontent.com/74361043/207850425-4f730ad4-d065-4270-ad92-22fb7fa6f5cb.png">
<ul>authentication with password</ul>
<img src="https://user-images.githubusercontent.com/74361043/207846865-f700b1d1-fc8a-479c-96a5-87a4ac448ab9.png">
<ul>authentication with refresh token</ul>
<img src="https://user-images.githubusercontent.com/74361043/207848772-e6a144d0-7c3d-48db-a96a-9769d601ed89.png">


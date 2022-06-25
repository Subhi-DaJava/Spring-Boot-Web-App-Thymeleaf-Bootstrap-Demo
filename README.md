# Petit Projet d'exemple avec Spring-Boot, Spring Security, Thymeleaf(avec Bootstrap5 pour CSS) et MySQL

### Spring-Boot-Starters
#### Spring-Security
#### Spring-Web
#### Spring-jpa
#### Spring-data-jdbc
#### Spring-thymeleaf
#### Thymeleaf-extras-springsecurity5


### Authentification avec Username et Mot de Passe 
### Utils techniques
#### Java 8
#### Spring Boot 2.6.8 (with Spring Security, Spring Web, Spring Data JPA)
#### MySQL dernière Version
#### Maven 3.8.4


### Affichage les boutons d'Update et de Delete
#### 1.Only display the "Update" button for users with role of MANAGER OR ADMIN(Afficher uniquement le bouton "Update" pour les utilisateurs ayant le rôle(ou autorité) de MANAGER OU ADMIN)
#### 2.Only display the "Delete" button for users with role of ADMIN(Afficher uniquement le bouton "Delete" pour les utilisateurs ayant le rôle d'ADMIN)

### Spring Securité :
#### Configure Spring Security & implement Security Objects
#### WebSecurityConfig extends WebSecurityConfigurerAdapter
#### UserDetailsServiceImpl implements UserDetailsService

### Démarrage du Projet 
#### 1) Copier le lien de GitHub
#### 2) L'ouvrir avec IDE
#### 3) Configurer application.properties pour se connecter MySQL (Url, username et mot de passs)
#### 4) Insérer les données (data.sql dans le dossier script sous le dossier resources)
#### 5) Démarrer l'application sur le port http://localhost:8080 (par défaut), choisi un username, mot de passe par défaut undeuxtroisquatrecinq(en chiffre)
#### 6)

### URLs
#### 1.http://localhost:8080/employees/list --> afficher tous les employees quand un utilisateur se connecter
#### 2.http://localhost:8080/loginPage --> afficher une page personnaliser pour se connecter
#### 3.

### ROLE ou AUTHORITY
#### Un utilisateur uthentifié avec un Rôle(une autorité) EMPLOYEE qui a le droit de la liste d'Employés
#### Un utilisateur uthentifié avec un Rôle(une autorité) ADMIN qui a les droits de MAJ et Supprimer les Employés 
#### Un utilisateur uthentifié avec un Rôle(une autorité) MANAGER qui n'a le droit que MAJ les Employés

### Captures d'écran 
#### 1. Liste d'Employés, connexion avec un rôle(une autorité) EMPLOYEE
![List_Employees_User_hasAuthority_Employee_authenticated](https://user-images.githubusercontent.com/90509456/175702302-9377f3fc-df18-49ff-af7e-52fdd091d29d.jpg)
#### 2. Liste d'Employés, connexion avec un rôle(une autorité) ADMIN
![List_Employees_Admin_hasAnyAuthority_Employee_admin_authenticated](https://user-images.githubusercontent.com/90509456/175702642-efdee06d-44f1-4694-88ee-d4ced51a6d68.jpg)
#### 3. Liste d'Employés, connexion avec un rôle(une autorité) MANAGER
![List_Employees_Manager_hasAnyAuthority_Employee_Manager_authenticated](https://user-images.githubusercontent.com/90509456/175702947-dd4f800e-667a-41da-a9d1-ef6dda309f84.jpg)

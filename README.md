# Bdd Security Spring Test

## Description
This application has only been made for learning and training purposes.\
It provides a login and a register form, and also a basic profile page.\
A /admin route has been defined in the security configuration file but there is no associated page yet.

## Configuration
**This project was made using IntelliJ IDEA Ultimate Edition, and so will be the configuration described right under.**

As this application will probably not be updated that much, downloading it as a zip is possible.

### Import

The first thing to do is to import the project into IntelliJ. You have to import it as a gradle application.

### Startup configuration :wrench:

Add a new configuration for this project:
- You can name it "Launch application" for example
- The main class is `fr.learning.bdd_security.BddSecurityApplication`
- Set `On 'Update' action` to `Update classes and resources`
- Set `On frame deactivation` to `Update classes and resources`

If you want to add a new properties file:
- Name it application-*dev*.properties
- Specify `dev` in *Active profiles*


### Database :card_file_box:

This application uses **MySQL** to store the **users and the roles**.\
Everything about the **credentials or the database itself** is mentioned in the *application.properties* file.\
First create a new database called *bdd_security*.\
Then, you'll need to create **three tables**. [This gist](https://gist.github.com/ChriisX/057178f3041a6bfa5d0d1b7840043c92) provides the **sql queries that creates your tables**.\
You also have to add the following foreign key constraints on the *Role_User* table:
- id_user -> user.username
- id_role -> role.id

You may want to add some roles before trying the application. The only ones required are:
- ADMIN
- USER

(uppercase required at least for the **admin** which is used in the *SecurityConfiguration* file)

Your database is ready!\
\
If before launching your application you want to add some accounts, here are the steps you need to follow. Keep in mind that there is a register form inside of the application (it's easier to use actually).\
- Add a new user on the **user table**. Because the passwords stored in the database are encrypted, here is an encrypted sample: `$2a$10$QNwf0roPwEoqpkDK7EWP/uhF0Ow1PhMopJVcUPU.6hpqffAUlhEoW` stands for `password`
- Add a new entry on the **role_user table** if you want to give your new user a role!


## Launching in 3... 2... 1... :rocket:

You are now ready!\
Launch the application using the configuration you made.\
![alt text](http://image.noelshack.com/fichiers/2018/37/4/1536842102-capture-du-2018-09-13-14-34-24.png "Login Page")\
If I forgot anything, or something doesn't work, please tell me so I can fix the **readme**

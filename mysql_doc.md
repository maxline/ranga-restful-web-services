## Step 35 (61). MySQL with Docker
$ docker run --detach
--env MYSQL_ROOT_PASSWORD=root
--env MYSQL_USER=social-media-user
--env MYSQL_PASSWORD=root
--env MYSQL_DATABASE=social-media-database
--name mysql
--publish 3306:3306
mysql:8-oracle

stop working installed mysql server
/usr/local/bin/mysql.server stop

$ docker container ls
$ docker ps -a
CONTAINER ID   IMAGE            COMMAND                  CREATED             STATUS             PORTS                               NAMES
6f0440022927   mysql:8-oracle   "docker-entrypoint.s…"   About an hour ago   Up About an hour   0.0.0.0:3306->3306/tcp, 33060/tcp   mysql

$ docker run --name mysql-serhii -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=mydb -p 3306:3306 -d mysql:latest
$ docker exec -it mysql mysql -u root -p


## Useful SQL commands
- $ mysql -u root -p
- $ docker exec -it mysql mysql -u root -p

### Show databases
```
mysql>SHOW DATABASES;
mysql>USE social-media-database;
mysql>select database();
```

### Check Current User
```
mysql>SELECT USER();
```
### Check All Users
```
SELECT User, Host FROM mysql.user;
```

### Optional: Create a New User
```
CREATE USER 'newuser'@'%' IDENTIFIED BY 'password';
```
### View Permissions for the Current User
```
SHOW GRANTS;
```

### S2: View Permissions for a Specific User
```
SHOW GRANTS FOR 'social-media-user'@'localhost';
SHOW GRANTS FOR 'social-media-user'@'%';
```

### S3: View Permissions for all users
```
SELECT User, Host, Grant_priv, Super_priv FROM mysql.user;
SELECT User, Host, Db, Select_priv, Insert_priv, Update_priv, Delete_priv FROM mysql.db;
```

### Change the password:
```
CREATE USER 'social-media-user'@'localhost' IDENTIFIED BY 'password';
ALTER USER CURRENT_USER() IDENTIFIED BY 'password';
GRANT ALL PRIVILEGES ON *.* TO 'social-media-user'@'localhost';
FLUSH PRIVILEGES;
```
GRANT PROCESS ON *.* TO 'social-media-user'@'localhost';

GRANT ALL PRIVILEGES ON *.* TO 'social-media-user'@'127.0.0.1' IDENTIFIED BY '!Qwerty';

ALTER USER 'social-media-user'@'localhost' IDENTIFIED WITH mysql_native_password BY '!Qwerty';

```
GRANT ALL PRIVILEGES ON database_name.* TO 'social-media-user'@'localhost' IDENTIFIED BY 'yourpassword';
FLUSH PRIVILEGES;
```

### Create a Table
```
CREATE TABLE users (
id INT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(100) NOT NULL,
email VARCHAR(100) UNIQUE NOT NULL,
created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
```
### Insert Data into the Table
```
INSERT INTO users (name, email)
VALUES ('John Doe', 'john.doe@example.com');
```
### Retrieve Data
```
SELECT * FROM users;
```

----
## Mac install start/stop mysql
$ brew install mysql.
Install brew services first
$ brew tap homebrew/services
Start mysql

$ brew services start mysql
$ brew services start mysql@5.7

In order to avoid mysqld from auto restarting after killed, try execute all these 3 commands:
$ brew services stop mysql
$ sudo launchctl unload /Library/LaunchDaemons/com.mysql.mysql.plist
$ sudo launchctl unload /Library/LaunchDaemons/com.oracle.oss.mysql.mysqld.plist
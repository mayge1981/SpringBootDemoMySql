docker run --name mysql-db01 -v /var/lib/mysqldb01:/var/lib/mysql -e MYSQL_ROOT_PASSWORD=my-secret-ps -e MYSQL_DATABASE=db01 -e MYSQL_USER=db01_user -e MYSQL_PASSWORD=my-secret-ps-01 -p 3306:3306 -p 33060:33060 -d mysql:8.0.30
分别以peer1、peer2、peer3的配置参数启动eureka注册中心。

java -jar kyj-cloud-eureka-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer1
java -jar kyj-cloud-eureka-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer2
java -jar kyj-cloud-eureka-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer3
依次启动完成后，浏览器输入：http://localhost:8761

java -jar kyj-cloud-eureka.jar --spring.profiles.active=peer1
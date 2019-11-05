From openjdk:8
ADD /target/spring-boot-cus-0.0.1-SNAPSHOT.jar ./spring-boot-cus-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java" , "-jar" , "spring-boot-cus-0.0.1-SNAPSHOT.jar"]
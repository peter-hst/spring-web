FROM openjdk:17-slim

ARG JAR_FILE

ADD target/${JAR_FILE} app.jar

RUN echo ${JAR_FILE}

# 执行启动命令
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
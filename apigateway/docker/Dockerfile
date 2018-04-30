FROM java:8
VOLUME /app
ADD my.springcloudstack-api-gateway.jar my.springcloudstack-api-gateway.jar
RUN bash -c 'touch /my.springcloudstack-api-gateway.jar'
ENTRYPOINT ["java","-jar","/my.springcloudstack-api-gateway.jar"]
FROM java:8
VOLUME /app
ADD my.springcloudstack-api.jar my.springcloudstack-api.jar
RUN bash -c 'touch /my.springcloudstack-api.jar'
ENTRYPOINT ["java","-jar","/my.springcloudstack-api.jar"]
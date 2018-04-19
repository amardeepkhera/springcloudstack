FROM java:8
VOLUME /app
ADD my.springcloudstack-api.jar my.springcloudstack-api.jar
RUN bash -c 'touch /my.springcloudstack-api.jar'
EXPOSE 8090
ENTRYPOINT ["java","-jar","/my.springcloudstack-api.jar"]
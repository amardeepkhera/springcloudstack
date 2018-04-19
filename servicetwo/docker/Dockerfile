FROM java:8
VOLUME /app
ADD my.springcloudstack-servicetwo.jar my.springcloudstack-servicetwo.jar
RUN bash -c 'touch /my.springcloudstack-servicetwo.jar'
EXPOSE 9002
ENTRYPOINT ["java","-jar","/my.springcloudstack-servicetwo.jar"]
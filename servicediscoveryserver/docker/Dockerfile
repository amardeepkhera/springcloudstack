FROM java:8
VOLUME /app
ADD my.springcloudstack-servicediscoveryserver.jar my.springcloudstack-servicediscoveryserver.jar
RUN bash -c 'touch /my.springcloudstack-servicediscoveryserver.jar'
ENTRYPOINT ["java","-jar","/my.springcloudstack-servicediscoveryserver.jar"]
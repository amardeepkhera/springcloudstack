FROM java:8
VOLUME /app
ADD my.springcloudstack-servicediscoveryserver.jar my.springcloudstack-servicediscoveryserver.jar
RUN bash -c 'touch /my.springcloudstack-api-gateway.jar'
EXPOSE 8761
ENTRYPOINT ["java","-jar","/my.springcloudstack-servicediscoveryserver.jar"]
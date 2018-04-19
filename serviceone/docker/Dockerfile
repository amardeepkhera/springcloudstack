FROM java:8
VOLUME /app
ADD my.springcloudstack-serviceone.jar my.springcloudstack-serviceone.jar
RUN bash -c 'touch /my.springcloudstack-serviceone.jar'
EXPOSE 9001
ENTRYPOINT ["java","-jar","/my.springcloudstack-serviceone.jar"]
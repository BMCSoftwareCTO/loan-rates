FROM anapsix/alpine-java

COPY build/libs/financial-loan-rate-0.1.0.jar financial-loan-rate-0.1.0.jar

ENTRYPOINT ["java", "-jar", "financial-loan-rate-0.1.0.jar"]
CMD [""]

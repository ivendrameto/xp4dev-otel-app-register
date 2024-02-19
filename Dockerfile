FROM public.ecr.aws/amazoncorretto/amazoncorretto:17

RUN mkdir -m 0755 -p /application

ENV HOME=/application
ENV APP_HOME=/application

WORKDIR $APP_HOME

ADD target/*.jar /app/app.jar

CMD ["sh", "-c", "java ${JVM_ARGS} ${JVM_MEMORY_ARGS} -jar /application/app.jar"]
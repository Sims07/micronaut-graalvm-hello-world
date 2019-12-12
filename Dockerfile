FROM oracle/graalvm-ce:19.2.1 as graalvm
COPY . /home/app/graalvm-hello-world
WORKDIR /home/app/graalvm-hello-world
RUN gu install native-image
RUN native-image --no-server -cp build/libs/graalvm-hello-world-*-all.jar

FROM frolvlad/alpine-glibc
EXPOSE 8080
COPY --from=graalvm /home/app/graalvm-hello-world .
ENTRYPOINT ["./graalvm-hello-world"]

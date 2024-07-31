From openjdk:latest

WORKDIR /app

COPY First10Primes.java .

RUN javac First10Primes.java

CMD ["java", "First10Primes"]



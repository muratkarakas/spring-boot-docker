#!/bin/bash
mvn package docker:build -DskipTests

docker-compose up
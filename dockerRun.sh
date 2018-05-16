#!/bin/bash
mvn package docker:build -Dmaven.test.failure.ignore=false

docker-compose up
#!/usr/bin/env groovy

def call(){
    echo "building the application BY shared lib...."
    sh "mvn package"
}
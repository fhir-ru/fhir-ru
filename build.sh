#!/bin/bash
set -ev

#NAME="Непрерывная интеграционная сборка"
NAME="FHIR v4.0.1"

antBuild (){
  ./publish.sh -name \'$NAME\' 
  checkStatus
}

checkStatus (){
  nf=`find publish -maxdepth 1 -type f | wc -l`
  if [ "$nf" -lt "100" ] ; then
     echo "< 100 files produced: bailing!"
     exit 1
  fi
  if [ $? -eq 0 -a ! -f fhir-error-dump.txt ]
  then
    echo "Build status OK"
  else
    echo "error dump:"
    cat fhir-error-dump.txt
    exit 1
  fi
}

antBuild

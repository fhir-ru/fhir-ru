#!/bin/bash
set -ev

NAME="Непрерывная интеграционная сборка"

antBuild (){
  ./publish.sh -name \'$NAME\' -url http://hl7-fhir.github.io/
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

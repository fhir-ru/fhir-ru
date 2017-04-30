#!/bin/bash
echo "Running publication process now with args: '$@ -web'"
ant -Dargs="$* -web"

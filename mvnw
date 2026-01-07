#!/bin/sh
# Wrapper to run Maven from project root
# Changes to backend/demo and passes all arguments to the real mvnw script
cd "$(dirname "$0")/backend/demo" && ./mvnw "$@"


#!/usr/bin/env sh
set -e
SCALA_VERSION=${SCALA_VERSION:-${TRAVIS_SCALA_VERSION:-2.12.10}}

# E2E_SHADED signals we will work with the shaded version of the
# compilerplugin.
if [ "$E2E_SHADED" = "1" ]; then
  mv e2e/project/scalapb.sbt.shaded e2e/project/scalapb.sbt
fi

# -J-XX below is a workaround for XX:LoopStripMiningIter=0.
# TODO: remove after JDK>=11.0.3
sbt -J-XX:LoopStripMiningIter=0 \
    ++2.12.10 compilerPlugin/publishLocal compilerPluginShaded/publishLocal createVersionFile \
    ++$SCALA_VERSION lensesJVM/publishLocal runtimeJVM/publishLocal grpcRuntime/publishLocal
cd e2e
sbt ++$SCALA_VERSION noJava/clean clean noJava/test test


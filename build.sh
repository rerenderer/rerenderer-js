#!/usr/bin/env bash

lein cljsbuild once

cat target/js/compiled.js > index.js
cat resources/binding.js >> index.js

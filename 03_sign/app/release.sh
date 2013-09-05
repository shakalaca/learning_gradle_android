#!/bin/bash

read -p "Keystore: " STORE_FILE
read -s -p "Keystore Password: " STORE_PASS
echo
read -p "Key Alias: " KEY_ALIAS
read -s -p "Key Password: " KEY_PASS
echo
 
export ORG_GRADLE_PROJECT_storeFile="$STORE_FILE"
export ORG_GRADLE_PROJECT_storePassword="$STORE_PASS"
export ORG_GRADLE_PROJECT_keyAlias="$KEY_ALIAS"
export ORG_GRADLE_PROJECT_keyPassword="$KEY_PASS"

gradle build

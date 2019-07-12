@echo off
start nginx
tasklist /fi "imagename eq nginx.exe"
echo 'im master'

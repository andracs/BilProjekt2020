#!/bin/bash

osascript <<EOF
 tell application "System Events"
    tell process "Terminal"
        set frontmost to true
    end tell
 end tell

tell application "Terminal"
    set font size of first window to "11"
    delay 1.0
    set font size of first window to "14"
end tell
EOF

cd /Users/andrasacs/IdeaProjects/BilProjekt2020/src
sti=$(pwd)
NAME=$sti/Lotto.java
clear
echo
echo Kører scriptet på $NAME
echo
java $NAME
echo
echo
echo
echo Tryk enter for at afslutte
read var1
clear
osascript -e 'tell application "Terminal" to close first window' & exit

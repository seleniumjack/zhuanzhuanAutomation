@echo off
echo ����appium server�У��벻Ҫ�رմ˴��ڡ�
appium -a 127.0.0.1 -p 4725 -bp 4726   --selendroid-port 8091 --chromedriver-port 9516 --session-override --nodeconfig nodeconfig_2.json
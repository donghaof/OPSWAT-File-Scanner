See readme.md inside API folder

Note:If the output is not displayed in the console for a long time, try restarting the program later (to stop, press ctrl + c in the terminal window),
sometimes the server (https://api.metadefender.com/v4/file/{dataId}) processes requests for a very long time.
The program uses a loop with checking the percentage of report readiness (field root.process_info.progress_percentage == 100),
the output to the console is performed when this value is equal to 100
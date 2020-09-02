# spring-cron-predictor


```
1 2 3 4 5 6 Index
- - - - - -
* * * * * * command to be executed
- - - - - -
| | | | | | 
| | | | | ------- Day of week (MON - SUN)
| | | | --------- Month (1 - 12)
| | | ----------- Day of month (1 - 31)
| |-------------- Hour (0 - 23)
| --------------- Minute (0 - 59)
----------------- Seconds (0 - 59)
```

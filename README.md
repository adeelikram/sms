# sms
Capacitor SMS plugin

## Procedure

Just clone it in your project with

### git clone https://github.com/adeelikram/sms.git

and then open terminal in current directory and type

### npm install sms 

if project directory already have android folder then 
run:

### npx cap sync

Now open project android folder in android studio 
and import module 

### import com.getathome.sms.sms;

then in:

### this.init(savedInstanceState, new ArrayList<Class<? extends Plugin>>() {{      
###   add(sms.class);    
### }});

Now goto angular project

## Ionic Project

### import {Plugins} from "@capacitor/core"
### import {sms} = Plugins
   ......................................
   .....................................

### sumFunc(){
###    sms.makeCall({
###       number:"+xxxxxxxxxxx",
###       text:"Hello World!\n"
###     })
###  }









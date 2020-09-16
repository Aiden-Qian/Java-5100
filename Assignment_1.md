> *-Course Management System*
>
>+ Data:Id, Password, Name, File
>+ Behaviors:logIn, logOut, checkInformation, uplodeFile, downlodeFile
>
> *-Pet Adoption Platform*
>
>+ Data:Id, Password, Username, Messages
>+ Behaviors:logIn, logOut, sendMessages
>
> *-Air App*
>
>+ Data:Id, Password, Name, Date, Location, AirNumber
>+ Behaviors:logIn, logOut, searchInformation, bookTicket
>
> *-Course Registration Platform*
>
>+ Data::Id, Password, Name, Major, Semester, Classname
>+ Behaviors:logIn, logOut, registerClasses, dropOutClasses
>
> *-Food Delivery App*
>
>+ Data:Id, Password, Username, Restaurant, Food
>+ Behaviors:logIn, logOut, sendRecipt

>**Sequence of invoking behaviors on objects**
>
>```java
>CourseManagementSystem canvas
>PetAdoptionPlatform petP
>AirApp airTicket
>CourseRegisterationPlatform registerP
>FoodApp uberEats
>if People use canvas
>    canvas.logIn(Id, Password);
>    canvas.checkInformation(Name);
>    canvas.uplodeFile(File);
>    canvas.downlodeFile();
>    canvas.logOut;
>if People use petP
>    petP.logIn(Id, Password);
>    petP.sendMessages(Username,Messages);
>    petP.logOut;
>if People use airTicket
>    aitTicket.logIn(Id, Password);
>    aitTicket.searchInformation(Date, Location);
>    airTicket.bookTicket(Name, AirNumber);
>    airTicket.logOut;
>if People use registerP
>    registerP.logIn(Id, Password);
>    registerP.registerClasses(Name, Major, Semester,Classname);
>    registerP.dropOutClasses(Classname);
>    registerP.logOut;
>if People use uberEats
>    uberEats.logIn(Id, Password);
>    uberEats.sendRecipt(Username, Restaurant, Food);
>    uberEats.logOut;
>```






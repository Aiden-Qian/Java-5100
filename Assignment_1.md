> *-User*
>
>+ Data: Id,Password,Name, Address, Phone, CreditCard, EmailAddress, 
>+ Behaviors: logIn, logOut,watch, want,registerClass, removeClass, writeReview,requestCancelOrder, search,checkEmail,buy, contact, upload, delete, deliverReceipt,order
>
> *-Class*
>+ Data: Room, TeacherName, ClassName, Time, ClassId
>
> *-Course Management System*
>
>+ Data: Class
>+ Behaviors: sendEmail, uploadAssignment, deleteAssignment, updateRecording, deleteRecording, 
>
> *-Pet*
>+ Data: Breed, Age, VaccineRecord
>
> *-Pet Adoption Platform( I didn't use this kind of platform, so I'm not sure if it's correct)*
>
>+ Data: Pet
>+ Behaviors:  sendEmailToPublisher, updateInformation 
>
> *-Plane*
>+ Data: Flight, From, To, Date
>
> *-Air App*
>
>+ Data: Plane
>+ Behaviors: sendReceipt, checkOut, refund
>
> *-Course Registration Platform*
>
>+ Data: Class
>+ Behaviors: sendEmail, addInTimeSheet, removeFromTimeSheet
>
> *-Restaurant*
>+ Data: Location, Name, Category, Stars, Comments, AveragePay,Receipt
>+ Behaviors: checkRecipt,sendToCourier
>
>> *-Receipt*
>+ Data: Number,Information
>
> *-Food Delivery App*
>
>+ Data: Restaurant,Receipt
>+ Behaviors: sendReceipt, checkOut, refund, sendToCourier



>**Sequence of invoking behaviors on objects**
>
>```java
>User aiden,teacher, publisher, courier
>CourseManagementSystem canvas
>PetAdoptionPlatform petP
>AirApp airTicket
>CourseRegisterationPlatform registerP
>FoodApp uberEats
>
>teacher.logIn(Id,Password);
>teacher.upload(Assignment);
>canvas.sendEmail(aiden.EmailAdress);
>if teacher upload recording
>    teacher.upload(Recording);
>    canvas.updateRecording(Recording);
>    canvas.sendEmail(aiden.EmailAdress);
>else teacher delete recording
>    teacher.delete(Recording);
>    canvas.deleteRecording(Recording);
>    canvas.sendEmail(aiden.EmailAdress);   
>else
>    teacher.logOut();
>aiden.logIn(Id, Password);
>aiden.checkEmail(aiden.EmailAdress);
>aiden.watch(recording);
>if aiden uploadAssignment
>    aiden.upload(Assignment);
>    canvas.uploadAssignment(Assignment);
> else if aiden deleteAssignment
>    aiden.delete(Assignment);
>    canvas.deleteAssignment(Assignment);
>else
>    aiden.logout();
>
>
>if aiden use petP
>    aiden.logIn(Id,Password);
>    Pet cat=aiden.search(Breed, Age, VaccineRecord);
>    aiden.want(cat);
>    petP.sendEmailToPublisher(publisher.EmailAdress,cat);
>    publisher.checkEmail(publisher.EmailAdress);
>    publisher.contact(aiden);
>    if aiden want this cat
>        petP.updateInformation(cat);
> else
>    aiden.logOut();
>
>
>if aiden want to book a plane
>    aiden.logIn(Id, Password);
>    if there is a flight
>        Plane MH767=aiden.search(From, To, Date);
>        aiden.buy(MH767);
>        airTicket.checkOut(aiden.Name,aiden.Phone,aiden.CreditCard,aiden.EmailAddress);
>        airTicket.sendReceipt(aiden.EmailAddress);
>        if aiden change his mind
>            aiden.requestCancelOrder(MH767);
>            airTicket.refund(MH767,aiden);
>else
>    aiden.logOut();
>
>
>    aiden.login(Id,Password);
>
>
>if aiden register Classes
>    Class EnglishHistory=aiden.search(Teacher, ClassName, Time);
>    aiden.resisterClass(EnglishHistory);
>    registerP.addInTimeSheet(EnglishHistory);
>    registerP.sendEmail(aiden.EmailAdress,EnglishHistory.Room, EnglishHistory.TeacherName,EnglishHistory.Time);
> else if aiden remove Classes
>    aiden.removeClass(EnglishHistory);
>    registerP.removeFromTimeSheet(EnglishHistory);
>    registerP.sendEmail(aiden.EmailAdress);
>else
>    aiden.Logout();
>
>
>if aiden want to use uberEats
>    aiden.logIn(Id,Password);
>    Restaruant Popeyes= aiden.search(Name,Location,Category, Stars,AveragePay);
>    aiden.order(Popeyes,Receipt);
>    uberEats.checkPut(aiden.Name,aiden.Phone,aiden.Address,Receipt.Number,Receipt.Information);
>    uberEats.sendReceipt(Popeyes);
>    Popeyes.checkRecipt(Receipt.Number,Receipt.Information);
>    uberEats.sendToCourier(Popeyes,Receipt.Number);
>    courier.deliverReceipt(Receipt);
>    if aiden want to comment
>        aiden.writeReview(".....");
>    if aiden change his mind
>        aiden.requestCancelOrder(Receipt.Number);
>        uberEats.refund(Receipt.Number,aiden);
> else
>    aiden.logOut();
>```






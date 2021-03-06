public class HospitalRoom {
	public int doctor_room=0;
	public int patient_room=0;
	private final Object doctorO=new Object();
	private final Object patientO=new Object();
    //TODO: implement your code here

    public boolean doctorEnter(Doctor d) throws InterruptedException {
    	synchronized (doctorO){
    		if(doctor_room==1) {
   	    		System.out.println("Doctor "+d.name+ " is waiting to Enter, number of doctor "+doctor_room);
   	    		doctorO.wait();
   	    		return false;
   	    	}
   	    	else{
   	    		++doctor_room;
   	    		System.out.println("Doctor "+d.name+ " Entered, number of doctor "+doctor_room);
   	    		doctorO.notify();
   	    		return true;
   	    	}
   	 }
        //TODO: implement your code here
    }

    public boolean doctorLeave(Doctor d) throws InterruptedException {
    	synchronized (doctorO){
       		if(doctor_room==0) {
       			doctorO.wait();
        		return false;
        		
        	}
        	else {
        		--doctor_room;
        		System.out.println("Doctor "+d.name+ " left, number of doctor "+doctor_room);
        		doctorO.notify();
        		return true;
        	}
       	 }
        //TODO: implement your code here
    }

    public boolean patientEnter(Patient p) throws InterruptedException {
        synchronized (patientO){
        	if(patient_room==3) {
        		System.out.println("Patient "+p.name+ " is waiting to Enter, number of patient "+patient_room);
                patientO.wait();
        		return false;
        		
        	}
        	else {
        		++patient_room;
        		System.out.println("Patient "+p.name+ " Entered, number of patient "+patient_room);
                patientO.notify();
        		return true;
        	}
        }
        //TODO: implement your code here
    }

    public boolean patientLeave(Patient p) throws InterruptedException {
    	 synchronized (patientO){
    		 if(patient_room==0) {
    			 patientO.wait();
    			 return false;
    		 }else {
    			 --patient_room;
 	    		System.out.println("Patient "+p.name+ " left, number of doctor "+patient_room);
                patientO.notify();
 	    		return true;
    		 }
    			
    	 }
        //TODO: implement your code here
    }

}

class Doctor {
    public String name;
    public Doctor(String name) {
        this.name = name;
    }
}

class Patient {
    public String name;
    public Patient(String name) {
        this.name = name;
    }
}

class Main2 {
    public static void main(String[] args) {
        HospitalRoom room = new HospitalRoom();
        Doctor siva = new Doctor("siva");
        Doctor john = new Doctor("john");
        Patient p1 = new Patient("p1");
        Patient p2 = new Patient("p2");
        Patient p3= new Patient("p3");
        Patient p4 = new Patient("p4");
        Patient p5 = new Patient("p5");
        Thread doctor1 = new Thread(() -> {
            try {
                while(!room.doctorEnter(siva)) {
                	if(room.doctor_room==1) break;
                }
                Thread.sleep(500);
                while(!room.doctorLeave(siva)) {}

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread doctor2 = new Thread(() -> {
            try {
                while(!room.doctorEnter(john)) {
                	if(room.doctor_room==1) break;
                	}
                Thread.sleep(500);
                while(!room.doctorLeave(john)) {}
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread patient1 = new Thread(() -> {
            try {
                    while(!room.patientEnter(p1)) {}
                Thread.sleep(500);
                    while(!room.patientLeave(p1)) {}
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread patient2 = new Thread(() -> {
            try {
                while(!room.patientEnter(p2)) {};
                Thread.sleep(500);
                while(!room.patientLeave(p2)) {};
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread patient3 = new Thread(() -> {
            try {
                while(!room.patientEnter(p3)) {};
                Thread.sleep(500);
                while(!room.patientLeave(p3)) {};
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread patient4 = new Thread(() -> {
            try {
                while(!room.patientEnter(p4)) {};
                Thread.sleep(500);
                while(!room.patientLeave(p4)) {};
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread patient5 = new Thread(() -> {
            try {
                while(!room.patientEnter(p5)) {};
                Thread.sleep(500);
                while(!room.patientLeave(p5)) {};
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        doctor1.start();
        doctor2.start();
        patient1.start();
        patient2.start();
        patient3.start();
        patient4.start();
        patient5.start();
    }
}

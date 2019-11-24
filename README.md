# demo-timetable - Class Scheduling sample code with Constraint Programming (CP)


Ini ialah contoh penggunaan CP dalam penjanaan jadual waktu untuk sekolah (dan universiti/kolej).


Dalam contoh ini, kita mempunyai 5 aktiviti kelas, yang kita namakan seperti berikut:

C1 - Kelas Aktiviti 1   
C2 - Kelas Aktiviti 2  
C3 - Kelas Aktiviti 3  
C4 - Kelas Aktiviti 4  
C5 - Kelas Aktiviti 5  

Sebagai contoh, dalam situasi sebenar, C1 boleh jadi Aktiviti Makmal untuk matapelajaran Sains, C2 boleh jadi Kuliah untuk matapelajaran Bahasa Malaysia, C3 boleh jadi Kuliah untuk matapelajaran Sains, C4 dan seterusnya anda bolehlah bayangkan sendiri.

Di sini kita cuma akan melakukan constraint untuk resource pengajar (Teacher).  Katakan kita mempunyai tiga orang pengajar, yang kita panggil sebagai T1, T2 dan T3.

Untuk menyulitkan lagi, suatu aktiviti kelas boleh diberikan kepada lebih daripada satu pengajar.  Dalam contoh ini, setiap pengajar akan diberikan kelas seperti berikut:

Kelas C1 - diberikan bersama kepada pengajar T1 dan pengajar T2  
Kelas C2 - diberikan kepada pengajar T2  
Kelas C3 - diberikan kepada pengajar T3  
Kelas C4 - diberikan bersama kepada pengajar T3 dan T2  
Kelas C5 - diberikan kepada pengajar T1  


Untuk contoh ini, kita mempunyai 10 slot masa di mana kelas-kelas ini akan diletakkan.  Slot-slot masa ini dinyatakan sebagai integer dari 1 hingga 10.

Slot-slot masa ini boleh dirujuk sebagai suatu tempoh suatu yang mempunyai masa mula dan masa tamat.  Contohnya:

Slot 1 - dari pukul 9.00 AM hingga 10.00 AM.  
Slot 2 - dari pukul 10.00 Am hingga 11.00 AM.  
Slot 3 - dari pukul 11.00 AM hingga 12.00 PM.  
Slot 4 - dari pukul 12.00 PM hingga 1.00 PM.  
Slot 5 - dari pukul 2.00 PM hingga 3.00 PM.  
.. dan seterusnya  


Untuk setiap aktiviti, tidak kesemua slot-slot masa tersebut adalah bersesuaian dengannya.  Mungkin suatu aktiviti cuma boleh diletakkan dalam slot-slot tertentu, dan kita lakukan ini dalam contoh ini.

Kelas 1 boleh diletakkan ke dalam semua slot-slot tersebut    
Kelas 2 cuma boleh diletakkan ke dalam slot-slot ini: 5, 6, 7 dan 10.  
.. dan seterusnya  

Di sini, kita akan menggunakan CP untuk mencari manakah slot yang sesuai untuk setiap kelas-kelas C1 hingga C5.  Kita telah menyatakan slot-slot ini sebagai nilai integer.  Jadi, kita menyatakan IntVar yang mewakli unknown, iaitu nilai yang akan dicari oleh Solver, untuk setiap kelas-kelas.  


Terima Kasih.  Kalau ada masa saya sambung.

** Note ** : Contoh kod di sini adalah tidak object oriented.  Kalau kita nak projek timetable sebenar, buatlah secara object oriented.  Kita define lah semua entiti terlibat dengan java class, dan buatlah constraint sebagai properties/attributes di dalam java class.









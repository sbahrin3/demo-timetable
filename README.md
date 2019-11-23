# demo-timetable - Class Scheduling sample code with Constraint Programming (CP)


Ini ialah contoh penggunaan CP dalam penjanaan jadual waktu untuk sekolah (dan universiti/kolej).


Dalam contoh ini, kita mempunyai 10 aktiviti kelas, yang kita namakan seperti berikut:

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







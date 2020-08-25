Link APK : https://drive.google.com/drive/folders/1f-Lyq0a2NvGBw9qz59r3gEck6IiFzz6t?usp=sharing


Explicit intent digunakan untuk menjalankan komponent dari dalam sebuah aplikasi

Implicit Intent tidak memerlukan detail nama kelas yang ingin diaktifkan, model ini memungkinkan komponent dari aplikasi lain bisa merespon request intent 
yang dijalankan

Data Classes adalah sebuah kelas yang tidak bergantung pada kelas lainnya, fungsinya untuk menyimpan model data suatu object

pacelable : interface yang memungkinkan mengirimkan object dari satu activity ke activity lainnya : 
menggunakan parcelize

Beda fragment dan activity : fragment kelasnya extends (inherit) ke fragment dan tidak perlu didaftarkan ke dalam android manifest.xml, keuntungan fragament 
yaitu dapat membuat banyak tampilan tanpa berpindah activity karena bersifat modular, juga satu fragment bisa dipakai di banyak activity reusable, contoh 
dalam gmail 2 fragment bisa dipakai dalam 1 activity yang sama

oncreate() : layout interface didefinisikan dan ditransformasikan dri layout berupa file xml ke dalam sebuah object view dengan metode inflate
onViewCreated( : bekerja setelah metode onCreate(), untuk inisialiasai view dan mengatur actionnya (set-listener) 

infalte() : untuk mengubah layout xml ke dalam bentuk object viewGroup atau widget, fungsinya untuk 
menampilkan layout dari fragment

Listview : component untuk menampilkan banyak data dalam bentuk list , menggunakan adapter zuntuk menampilkan item dari data scouce(array string/ array list)
adapter pada listView : 
-ArrayAdapter: untuk mengadaptasi array object sebagai sumber data
-BaseAdapter: kelas umum untuk menimplementasikan custom adapter untuk listview dan spinner
-CusrorAdapter: kelas adapter yang biasa digunakan untuk menerima data dari cursor
-WrapperlistAdapter: untuk membungkus kelas adapter lain
 
prepare : untuk inisiasi setiap data

library : tools atau source code yang sudah dibuat oleh orang lain

unit testing : melakukan test pada logika kode di dalam aplikasi , dengan unit testing kita akan mudah mengetahui kode mana yang tidak berjalan dan dapat dengan segera memperbaikinya
tipe test : 
-Local unit test : berjalan di local JVM dan tidak mempunyai akses ke API android framework, u/menguji method/fungsi berjalan sesuai rencana,
		   denan memberi input dan melihat hasilnya apakah sesuai dengan ekspektasi
-instrumented tesst : u/memvalidasi proses interaksi pada User Interface berjalan dengan lancar
-End-to-End test : seperti instrumented test hanya lebih lengkap
, unit test android menggunakan Mocking



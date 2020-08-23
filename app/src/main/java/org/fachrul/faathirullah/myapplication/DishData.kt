package org.fachrul.faathirullah.myapplication

object DishData {
    private val dishNames = arrayOf("Mie aceh",
        "Sie itek",
        "Karee Kameng",
        "Keunamah",
        "Gulai Kepala Ikan",
        "Ayam tangkap",
        "Nasi Guri",
        "Soto Medan",
        "Kwetiauw Kerang",
        "Bihun Kari "
        )

    private val dishDetails = arrayOf(
        "Mie Aceh adalah masakan mie pedas khas Aceh di Indonesia. Mie kuning tebal dengan irisan daging sapi, daging kambing atau makanan laut (udang dan cumi) disajikan dalam sup sejenis kari yang gurih dan pedas. Mie Aceh tersedia dalam tiga jenis, Mie Aceh Goreng (digoreng dan kering), Mie Aceh Tumis (dengan sedikit kuah) dan Mie Aceh Kuah (sup). Biasanya ditaburi bawang goreng dan disajikan bersama emping, potongan bawang merah, mentimun, dan jeruk nipis.",
        "SaaT berkunjung ke Aceh, kamu akan menemukan banyak keude bu atau kedai nasi yang menyajikan sie itek. Secara harfiah, sie itek berarti kuah bebek. Tampilan masakan ini mirip dengan kari.",
        "Karee Kameng alias Kare Kambing adalah lauk yang hampir ada di setiap Keudeu Bu maupun di berbagai Perhelatan. Di banyak Keudeu Bu, Karee Kameng Favorit Aceh terpampang di depan kedai dalam kuali atau wajan besar yang selalu dipanaskan. Menurut filosopinya Memasak kari kambing di depan kedai nasi merupakan ciri khas masyakat Aceh.",
        "Keumamah adalah salah satu kuliner tradisional masyarakat Aceh yang dibuat dari bahan baku ikan, yaitu tongkol dan cakalang. Keumamah terkenal juga dengan nama ikan kayu karena keras seperti kayu. Ikan ini diawetkan dengan beberapa proses pembuatan. Mulai dari pembersihan ikan, perebusan, pengeringan dan penyimpanan. Karena itu keumamah bisa disimpan hingga bertahun-tahun dengan syarat harus tetap dalam keadaan kering atau tidak lembap.",
        "Meskipun hanya menggunakan bagian kepala ikan, makanan ini punya citarasa yang istimewa. Pasalnya kepala ikan yang memiliki daging lunak memang bisa menghasilkan kaldu sedap. Apalagi jika diolah dengan bumbu gulai Padang yang sarat rempah.",
        "Ayam Tangkap adalah masakan khas Aceh yang terbuat dari ayam yang digoreng dengan bumbu dan rempah-rempah khas.",
        "Nasi Guri adalah nasi yang dimasak dengan santan dengan tambahan bumbu dari rempah-rempah sehingga gurih dan beraroma yang berasal dari Aceh, Indonesia.",
        "Soto Medan juga menggunakan daging ayam sebagai bahan dasar. Keduanya juga menggunakan kunyit sehingga kuahnya berwarna kuning. Bedanya, soto Medan menggunakan santan sehingga tekstur kuahnya lebih kental dan berwarna kuning pekat.",
        "Ternyata dalam menggoreng kwetiaw, kerang merupakan yang pertama digoreng untuk mendapatkan tekstur yang lebih garing dan kering. Selain kwetiaw ada juga nasi goreng dan Mie Kangkung belacan yang juga dengan sentuhan kerang didalamnya.",
        "Kari merupakan salah satu menu khas yang berasal dari Asia Selatan, khususnya India. Kalau berkunjung ke India, pasti kari menjadi menu yang paling banyak disajikan di rumah makan. Nah, kalau di Indonesia sendiri, tepatnya di Kota Medan, kari ini jadi salah satu hidangan yang wajib dicoba. Di Medan, kari lebih banyak disajikan dengan bihun sehingga terkenal dengan nama kari bihun"
        )

    private val dishImages = intArrayOf(R.drawable.mie_aceh,
        R.drawable.sie_itek,
        R.drawable.karee_kameng,
        R.drawable.keunamah,
        R.drawable.gulai_kepala_kan,
        R.drawable.ayam_tangkap,
        R.drawable.nasi_guri,
        R.drawable.soto_medan,
        R.drawable.kwetiauw_kerang,
        R.drawable.bihun_kari)

    val listData: ArrayList<Dish>
        get() {
            val list = arrayListOf<Dish>()
            for (position in dishNames.indices) {
                val hero = Dish()
                hero.name = dishNames[position]
                hero.detail = dishDetails[position]
                hero.photo = dishImages[position]
                list.add(hero)
            }
            return list
        }
}
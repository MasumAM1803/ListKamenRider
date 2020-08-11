package com.masum.listkamenrider;

import java.util.ArrayList;

public class KamenRiderData {

    private static String[] kamenRiderNames = {
            "Kuuga",
            "Agito",
            "Ryuki",
            "555 (Faiz)",
            "Blade",
            "Hibiki",
            "Kabuto",
            "Den-O",
            "Kiva",
            "Decade",
            "W (Double)",
            "OOO (OZ)",
            "Fourze",
            "Wizard",
            "Gaim",
            "Drive",
            "Ghost",
            "Ex-Aid",
            "Build",
            "Zi-O"
    };

    private static String[] kamenRiderActors = {
            "Yusuke Godai",
            "Shoichi Tsugami",
            "Shinji Kido",
            "Takumi Inui",
            "Kazuma Kenzaki",
            "Hibiki",
            "Souji Tendou",
            "Ryotaro Nogami",
            "Wataru Kurenai",
            "Tsukasa Kadoya",
            "Shotaro Hidari & Phillip",
            "Eiji Hino",
            "Gentarou Kisaragi",
            "Haruto Sohma",
            "Kota Sakuraba",
            "Shinnosuke Tomari",
            "Takeru Tenkuji",
            "Emu Hojo",
            "Sento Kiryu",
            "Sougo Tokiwa",
    };

    private static String[] kamenRiderPlayed = {
            "Joe Odagiri",
            "Toshiki Kashu",
            "Takamasa Suga",
            "Kento Handa",
            "Takayuki Tsubaki",
            "Shigeki Hosokawa",
            "Hiro Mizushima",
            "Takeru Sato",
            "Koji Seto",
            "Masahiro Inoue",
            "Renn Kiriyama & Raito Sonozaki",
            "Shu Watanabe",
            "Sota Fukushi",
            "Shunya Shiraishi",
            "Gaku Sano",
            " Ryoma Takeuchi",
            "Shun Nishime",
            "Hiroki Ijima",
            "Atsuhiro Inukai",
            "So Okuno",
    };

    private static String[] kamenRiderEpisodes = {
            "49",
            "51",
            "50",
            "50",
            "49",
            "48",
            "49",
            "49",
            "48",
            "31",
            "49",
            "48",
            "48",
            "53",
            "47",
            "48",
            "50",
            "45",
            "49",
            "49",
    };

    private static String[] kamenRiderShowTimes = {
            "30 Januari 2000 -\n21 Januari 2001",
            "28 Januari 2001 -\n27 Januari 2002",
            "3 Februari 2002 -\n19 Januari 2003",
            "26 Januari 2003 -\n18 Januari 2004",
            "25 Januari 2004 -\n23 Januari 2005",
            "30 Januari 2005 -\n22 Januari 2006",
            "29 Januari 2006 -\n21 Januari 2007",
            "28 Januari 2007 -\n20 Januari 2008",
            "27 Januari 2008 -\n18 Januari 2009",
            "25 Januari 2009 -\n30 Agustus 2009",
            "6 September 2009 -\n29 Agustus 2010",
            "5 September 2010 -\n28 Agustus 2011",
            "4 September 2011 -\n26 Agustus 2012",
            "2 September 2012 -\n29 September 2013",
            "6 Oktober 2013 -\n28 september 2014",
            "5 Oktober 2014 -\n27 September 2015",
            "4 Oktober 2015 -\n25 September 2016",
            "2 Oktober 2016 -\n27 Agustus 2017",
            "3 September 2017 -\n26 Agustus 2018",
            "2 September 2018 -\n25 Agustus 2019",
    };

    private static String[] kamenRiderDetails = {
            "Kamen Rider Kuuga (仮面ライダークウガ Kamen Raidā Kūga) adalah serial tokusatsu dari waralaba Kamen Rider. " +
                    "Ini adalah serial kesepuluh dari Serial Kamen Rider dan seri pertama yang disiarkan seluruhnya di periode Heisei." +
                    "Serial ini diproduksi oleh perusahaan patungan antara Ishimori Productions dan Toei, " +
                    "dan ditampilkan di TV Asahi dari tanggal 30 Januari 2000 sampai 21 Januari 2001, menggantikan Moero!! Robocon. " +
                    "Kuuga juga merupakan serial Kamen Rider pertama yang disiarkan di format layar lebar yang disajikan dalam format kotak surat",
            "Kamen Rider Agito (仮面ライダーアギト Kamen Raidā Agito) adalah sebuah serial televisi yang ke-11 dalam francais tokusatsu Kamen Rider. " +
                    "Αgito adalah perusahaan patungan dengan Ishimori Productions dan Toei. " +
                    "Serial ini adalah ditayangkan di TV Asahi mulai tanggal 28 Januari 2001 hingga tanggal 27 Januari 2002 dan berjumlah 51 episode. " +
                    "Serial ini ditayangkan di Indonesia pada 30 Januari 2005 hingga 29 Januari 2006. " +
                    "Selain serial TV, Kamen Rider Agito telah satu kali diangkat menjadi film layar lebar: Project G4 (pemutaran perdana 22 September 2001).\n" +
                    "\n" +
                    "Agito adalah serial Kamen Rider pertama yang pilihan tiga golongan utama di Rider: Rider mistik, Rider organik, dan Rider teknologi puncak. ",
            "Kamen Rider Ryuki (仮面ライダー龍騎 Kamen Raidā Ryūki, \"Ryūki\" bermaksud \"Kesatria Naga\") adalah sebuah serial televisi yang ke-12 dalam francais tokusatsu Kamen Rider. " +
                    "Ryuki adalah perusahaan patungan dengan Ishimori Productions dan Toei, dan ditayangkan di TV Asahi mulai 3 Februari 2002 hingga 19 Januari 2003. " +
                    "Selain serial TV, Kamen Rider Ryuki telah satu kali diangkat menjadi film layar lebar: Episode Final (pemutaran perdana 17 Agustus 2002). " +
                    "Di Indonesia, serial ini ditayangkan oleh stasiun televisi RCTI pada tahun 2004 dan Indosiar pada 5 Februari 2006 hingga 21 Januari 2007.",
            "Kamen Rider 555 (仮面ライダー５５５（ファイズ） Kamen Raidā Faizu) adalah sebuah serial televisi tokusatsu berjumlah 50 episode, ditambah satu film (Paradise Lost) yang tak mempunyai hubungan cerita. " +
                    "Faiz adalah hasil produksi perusahaan patungan Ishimori Productions dengan Toei, dan ditayangkan di TV Asahi mulai 26 Januari 2003 hingga 18 Januari 2004 setelah Kamen Rider Ryuki. " +
                    "Di Indonesia, serial ini di tayangkan oleh stasiun televisi Indosiar setelah Kamen Rider Agito tamat di stasiun televisi yang sama.\n" +
                    "\n" +
                    "Sepeda motor yang dikendarai para tokoh ialah auto-vajin (faiz), side-bassher (kaixa) dan jet-sliger (faiz, kaixa, & delta). Musuh-musuh dalam seri ini ialah Smart Brain dan Orphenochs. Lagu tema pembuka berjudul \"ISSA - Just Faiz\". ",
            "Kamen Rider Blade (仮面ライダー剣（ブレイド） Kamen Raidā Bureido) adalah sebuah serial televisi yang ke-14 dalam francais tokusatsu Kamen Rider. " +
                    "Blade adalah perusahaan patungan dengan Ishimori Productions dan Toei. " +
                    "Serial ini adalah ditayangkan di TV Asahi mulai tanggal 25 Januari 2004 hingga tanggal 23 Januari 2005 dan berjumlah 49 episode. " +
                    "Di Indonesia, serial ini di tayangkan oleh stasiun televisi ANTV. " +
                    "Selain serial TV, Kamen Rider Blade telah satu kali diangkat menjadi film layar lebar: Missing Ace (pemutaran perdana 11 September 2004).",
            "Kamen Rider Hibiki (仮面ライダー響鬼（ヒビキ） Kamen Raidā Hibiki, \"Hibiki\" bermaksud \"Jurik Gema\") adalah sebuah serial televisi yang ke-15 dalam francais tokusatsu Kamen Rider. " +
                    "Hibiki adalah perusahaan patungan dengan Ishimori Productions dan Toei. " +
                    "Serial ini ditayangkan di TV Asahi mulai tanggal 30 Januari 2005 hingga tanggal 22 Januari 2006 dan berjumlah 48 episode. " +
                    "Selain serial TV, Kamen Rider Hibiki telah satu kali diangkat menjadi film layar lebar: Hibiki dan Jurik Pertempuran di 7 orang (pemutaran perdana 3 September 2005).",
            "Kamen Rider Kabuto (仮面ライダーカブト Kamen Raidā Kabuto) adalah sebuah serial televisi yang ke-16 dalam francais tokusatsu Kamen Rider. " +
                    "Kabuto adalah perusahaan patungan dengan Ishimori Productions dan Toei. " +
                    "Serial ini adalah ditayangkan di TV Asahi mulai tanggal 29 Januari 2006 hingga tanggal 21 Januari 2007 dan berjumlah 50 episode. " +
                    "Serial ini adalah juga produksi peringatan 35 tahun di Serial Kamen Rider. " +
                    "Selain serial TV, Kamen Rider Kabuto telah satu kali diangkat menjadi film layar lebar: God Speed Love (pemutaran perdana 5 Agustus 2006).",
            "Kamen Rider Den-O (仮面ライダー電王 Kamen Raidā Den'ō) adalah serial televisi yang ke-17 waralaba tokusatsu Kamen Rider. Den-O adalah produksi bersama antara Ishimori Productions dan Toei. " +
                    "Serial ini adalah ditayangkan di TV Asahi mulai tanggal 28 Januari 2007 hingga tanggal 20 Januari 2008 dan berjumlah 49 episode." +
                    "Serial ini juga ditayangkan di Trans7 mulai tanggal 7 November 2010 setiap hari Minggu pada jam 9.30 WIB. " +
                    "Selain serial TV, Kamen Rider Den-O telah tiga kali diangkat menjadi film layar lebar: I'm Born! (pemutaran perdana 4 Agustus 2007), Climax Deka (pemutaran perdana 12 April 2008) dan Battle of Onigashima (pemutaran perdana 1 Mei 2009).",
            "Kamen Rider Kiva (仮面ライダーキバ Kamen Raidā Kiba, Masked Rider Kiva) adalah judul dari Kamen Rider tahun 2008 yang diproduksi oleh Toei Company dan Ishimori Productions, pertama kali mulai tanggal 27 Januari 2008, setelah Kamen Rider Den-O selesai. " +
                    "Disiarkan oleh Super Hero Time 2008 di TV Asahi dan tamat pada episode ke-48 pada tanggal 18 Januari 2009. " +
                    "Dalam film ini Kamen Rider Kiva mempunyai kekuatan seperti Vampire yang merupakan kekuatan dasar Kiva, dengan slogan \"Wake up! Break the chains of destiny.\" (Wake up！宿命（さだめ）の鎖を解き放て Ueiku appu! Sadame no kusari o tokihanate). " +
                    "Episode pertamanya muncul bertepatan dengan ulang tahun Shotaro Ishinomori.",
            "Kamen Rider Decade (仮面ライダーディケイド Kamen Raidā Dikeido, Masked Rider DCD / Masked Rider Decade) adalah judul dari drama tokusatsu Jepang yang diputar pada awal 2009. " +
                    "Decade, adalah Kamen Rider Heisei kesepuluh, sejak Kamen Rider Kuuga pada tahun 2000. " +
                    "Mulai tayang menyusul finale Kamen Rider Kiva pada Januari 2009 di Super Hero Time bersama edisi seri waralaba Super Sentai tahun 2009, Samurai Sentai Shinkenger. " +
                    "Slogan dari seri ini adalah \"Hancurkan Semua, Hubungkan Semua!\" (全てを破壊し、全てを繋げ Subete o hakaishi, subete o tsunage!). " +
                    "Yang menarik dalam serial ini adalah karena Decade memiliki kekuatan untuk mengubah wujudnya menjadi kamen rider heisei terdahulunya, juga akan muncul beberapa kamen rider dari seri lain namun tidak semua dimainkan oleh aktor dan aktris sebenarnya.",
            "Kamen Rider Double (仮面ライダーダブル Kamen Raidā Daburu) adalah protagonis utama dari serial TV Kamen Rider W. " +
                    "Double adalah Kamen Rider yang pertama yang bertransformasi dari dua orang. " +
                    "Penampilan debutnya yang pertama adalah sebagai kameo dalam film Kamen Rider Decade: All Riders vs Dai-Shocker. " +
                    "Menurut produser, pada konsep awalnya masing-masing mereka akan memakai jas untuk berubah, tetapi produser memutuskan untuk tidak memasukkannya. " +
                    "Kamen Rider Double diperankan oleh dua orang, yaitu Hidari Shotaro yang diperankan oleh Renn Kiriyama dan Philip atau Raito Sonozaki yang diperankan oleh Masaki Suda. " +
                    "Saat mereka berubah atau Henshin tubuh mereka dan jiwa mereka pun menjadi satu tubuh di tubuhnya Shotaro dan Philip pun tidak sadarkan diri untuk sementara sebab Philip bukanlah manusia melainkan kumpulan data dan jiwa yang berkumpul membentuk tubuhnya.",
            "Kamen Rider OOO (仮面ライダーオーズ／ＯＯＯ Kamen Raidā Ōzu) adalah seri tahun 2010-2011 tokusatsu drama dari Serial Kamen Rider Toei Company Jepang, menjadi seri ke 12 pada Periode Heisei secara berturut-turut dan ke-21 secara keseluruhan. " +
                    "Mulai ditayangkan pada 5 September 2010, seminggu setelah episode terakhir Kamen Rider W, bergabung bersama Tensou Sentai Goseiger dan kemudian Kaizoku Sentai Gokaiger dalam Susunan Super Hero Time, hingga episode terakhirnya pada 28 August 2011. " +
                    "Kamen Rider OOO juga muncul sebagai cameo dalam film Kamen Rider W Forever: A to Z/The Gaia Memories of Fate. " +
                    "Dikarenakan untuk memperingati Episode ke-1000 Kamen Rider, episode ke-27 dan 28 tidak memiliki jalan cerita utama dalam serial secara keseluruhan. " +
                    "Kamen Rider OOO memiliki alih suara bahasa Inggris di Filipina.\n" +
                    "\n" +
                    "Semboyan dari Seri ini adalah \"Aku akan berubah!!!\" (俺が変身する!!! Ore ga henshin suru!!!). ",
            "Kamen Rider Fourze (仮面ライダーフォーゼ Kamen Raidā Fōze) adalah drama tokusatsu Jepang dalam Serial Kamen Rider Toei Company, menjadi seri ke-13 secara berurutan dalam Periode Heisei dan ke-22 secara keseluruhan. " +
                    "Mulai ditayangkan pada 4 September 2011, seminggu setelah episode terakhir Kamen Rider OOO, bergabung bersama Kaizoku Sentai Gokaiger dan kemudian Tokumei Sentai Go-Busters dalam susunan Super Hero Time. " +
                    "Selain untuk memperingati 40 Tahun Serial Kamen Rider Serial ini juga untuk memperingati Penerbangan Luar Angkasa, yang dimulai dengan penerbangan tahun 1961 Yuri Gagarin. " +
                    "Slogan dari Serial ini \"Hidupkan Masa Muda karena kita akan menuju Angkasa!\" (青春スイッチオンで宇宙キター！ Seishun suitchi on de uchū kitā!), berdasarkan sabuk perubahan Fourze Driver yang menggunakan bermacam-macam kekuatan dari alat yang diberi nama Astroswitches dan juga memberi kekuatan pada bentuk Kamen Rider Fourze." +
                    "Seperti dua seri sebelumnya, pemeran utama Fourze muncul pertama kali pada film musim panas seri sebelumnya, tepatnya pada Film Kamen Rider OOO Wonderful: The Shogun and the 21 Core Medals.",
            "Kamen Rider Wizard (仮面ライダーウィザード Kamen Raidā Wizādo) adalah serial ke-23 dari Serial Kamen Rider dan serial heisei ke-14. " +
                    "Kamen Rider Wizard telah tercatum sebagai merek dagang pada judul yang diajukan oleh Toei pada tanggal 21 Juni 2012. " +
                    "Ini mulai ditayangkan pada tanggal 2 September 2012, bergabung dengan Tokumei Sentai Go-Busters dan kemudian Zyuden Sentai Kyoryuger dalam line-up Super Hero Time menyusul finale Kamen Rider Fourze. " +
                    "Dengan Wizard yang telah selesai di episode 53, Kamen Rider Gaim bergabung dengan Kyoryuger sebagai bagian dari Super Hero Time. " +
                    "Tsuyoshi Kida adalah penulis skenario utama di seri ini. Tema dari seri ini adalah penyihir dan keajaiban.",
            "Kamen Rider Gaim (仮面ライダー 鎧武 (ガイム), Kamen Raida Gaimu) adalah sebuah drama Tokusatsu Jepang yang diproduksi oleh Toei Company di Serial Kamen Rider, dan juga merupakan seri kelima belas di Heisei Era dan seri kedua puluh empat secara keseluruhan. " +
                    "Toei mendaftarkan hak cipta dan merek dagangnya dari seri ini, yang dimulai pada tanggal 6 Oktober 2013 bergabung Zyuden Sentai Kyoryuger di Super Hero Time line-up tiga minggu setelah final Kamen Rider Wizard. " +
                    "Mulai 16 Februari 2014, Kamen Rider Gaim akan bergabung dalam line-up di Super Hero Time dengan Ressha Sentai ToQger. " +
                    "Tema pada seri ini adalah ksatria dan buah-buahan.",
            "Kamen Rider Drive (仮 面 ライ ダ ー ド ラ イ ブ, Kamen Raidā Doraibu) adalah sebuah drama Tokusatsu Jepang yang dibuat oleh perusahaan Toei untuk Serial Kamen Rider selanjutnya. " +
                    "Drive merupakan seri keenam belas di periode Heisei dan seri kedua puluh lima secara keseluruhan. " +
                    "Serial ini dimulai pada tanggal 5 Oktober 2014, bergabung dengan Ressha Sentai ToQger di line-up Super Hero Time setelah final Kamen Rider Gaim, dan kemudian, Shuriken Sentai Ninninger. " +
                    "Tema yang diambil pada seri ini adalah \"Polisi-Detektif\" dan \"Mobil Otomotif\".",
            "Kamen Rider Ghost (仮面ライダーゴースト Kamen Raida Gōsuto?) adalah serial televisi Jepang Tokusatsu yang berfungsi sebagai seri ke-17 dari era Heisei Serial Kamen Rider, dan seri ke-26 jika dihitung keseluruhan. " +
                    "Takuro Fukuda (penulis di Utraman Max) akan menjabat sebagai penulis skenario utama di seri Ghost ini, dengan Satoshi Morota sebagai direktur. " +
                    "Acara ini ditayangkan perdana pada TV Asahi dan afiliasi stasiun tv di seluruh Jepang pada tanggal 4 Oktober 2015, minggu berikutnya setelah final episode dari seri pendahulunya, Kamen Rider Drive dan menggantikannya pada time-slotnya. " +
                    "Seri ini akan bergabung juga dengan Shuriken Sentai Ninninger di blok pemrograman anak Super Hero Time. " +
                    "Dan pada tanggal 14 Februari 2016 Doubutsu Sentai Zyuohger akan berada di blok pemrogram anak Super Hero Time menggantikan Shuriken Sentai Ninninger. " +
                    "Tema latar di seri ini adalah supranatural, hantu, dan bola mata.",
            "Kamen Rider Ex-Aid (仮面ライダーエグゼイド Kamen Raidā Eguzeido) adalah serial televisi Jepang Tokusatsu yang berfungsi sebagai seri ke-18 dari era Heisei Serial Kamen Rider, dan seri ke-27 jika dihitung keseluruhan. " +
                    "Acara ini ditayangkan perdana pada TV Asahi dan afiliasi stasiun tv di seluruh Jepang pada tanggal 2 Oktober 2016, minggu berikutnya setelah final episode dari seri pendahulunya, Kamen Rider Ghost dan menggantikannya pada time-slotnya. " +
                    "Seri ini akan bergabung juga dengan Doubutsu Sentai Zyuohger, lalu diikuti Uchuu Sentai Kyuuranger di awal 2017 sebagai pengganti, di blok pemrograman anak Super Hero Time. " +
                    "Tema latar di seri ini adalah dokter, video game, dan kartu memori yang disebut gashat.",
            "Kamen Rider Build (仮面ライダービルド Kamen Raidā Birudo) adalah serial televisi Jepang Tokusatsu yang merupakan seri ke-19 dari era Heisei Serial Kamen Rider, dan seri ke-28 jika dihitung keseluruhan. " +
                    "Serial ini mulai diproduksi pada Juni 2017 dan mulai tayang perdana pada 3 September 2017 setelah episode terakhir dari seri sebelumnya, Kamen Rider Ex-Aid dan menggantikannya pada time-slotnya, serta ikut bergabung dengan Uchuu Sentai Kyuuranger yang kemudian digantikan oleh Kaitou Sentai Lupinranger VS Keisatsu Sentai Patranger di blok pemrograman anak Super Hero Time. " +
                    "Tagline dari serial ini adalah: \"Formula Kemenangan Sudah Ditentukan\" (勝利の法則は決まった Shōri no hōsoku wa kimatta). " +
                    "Tema latar di seri ini adalah fisika, sains, cerita misteri, dan botol eksperimen yang disebut Fullbottle. " +
                    "Tidak seperti serial Kamen Rider dari Era Heisei sebelumnya, cerita Kamen Rider Build mengambil alur di alam semesta versi tersendiri.",
            "Kamen Rider Zi-O (仮 面 ラ イ ダ ー ジ オ ウ Kamen Raidā Jiō) adalah drama tokusatsu Jepang dalam Seri Kamen Rider Toei Company. " +
                    "Ini adalah serial televisi ke dua puluh sembilan secara keseluruhan, serta seri kedua puluh dan terakhir dalam periode Heisei. " +
                    "Toei mendaftarkan merek dagang Kamen Rider Zi-O pada 5 Mei 2018. " +
                    "Pertunjukan perdana pada 2 September 2018, setelah final Kamen Rider Build, bergabung dengan Kaitou Sentai Lupinranger VS Keisatsu Sentai Patranger dan kemudian, miniseri Super Sentai Battle Terkuat, diikuti oleh Kishiryu Sentai Ryusoulger dalam susunan Super Hero Time. " +
                    "Serial ini memiliki motif perjalanan waktu / multiverse sambil memegang penghargaan untuk semua Kamen Riders era Heisei sebelumnya, dengan cara yang sama seperti Dekade Kamen Rider. " +
                    "Serial ini dan film-film terkait juga menampilkan kemunculan kembali aktor yang mengulangi karakter mereka dari seri Heisei sebelumnya.",
    };

    private static String[] kamenRiderForm = {
            "Growing, Mighty, Dragon, Pegasus, Titan, Rising Mighty, Rising Dragon, Rising Pegasus, Rising Titan, Amazing Mighty, Ultimate, Rising Ultimate",
            "Ground, Storm, Flame, Trinity, Burning, Shining",
            "Blank, Ryuki, Survive",
            "Basic, Axcel, Blaster",
            "Ace, Jack, King",
            "Basic, Kurenai Hibiki, Armed Hibiki",
            "Kabuto Mask, Kabuto, Hyper Kabuto",
            "Den-O Plat, Sword, Rod, Ax, Gun, Wing, Climax, Liner",
            "Kiva, Garulu, Bassha, Dogga, DoGaBaKi, Emperor",
            "Basic, change to another rider, Complete",
            "Cyclone Joker, Cyclone Metal, Cyclone Trigger, Heat Joket, Heat Metal, Heat Tigger, Luna Joker, Luna Metal, Luna Trigger, Fang Joker, Xtreme",
            "TaToBa, GataKiriBa, LaTorarTar, SaGohZo, ShaUTa, TaJaDor, PuToTyra",
            "Base States, Elek States, Fire States, Magnet States, Cosmic States, Rocket States",
            "Flame, Water, Hurricane, Land, Flame Dragon, Water Dragon, Hurricane Dragon, Land Dragon, All Dragon, Infinity",
            "Orange, Pine, Ichigo, Suika, Jinba (Lemon, Cherry, Peach), Kachidoki, Kiwami",
            "Type Speed, Type Wild, Type Technic, Type DeadHeat, Type Formula, Type Tridoron",
            "Ore, Musashi, Edison, Robin, Newton, Beethoven, Billy the Kid, Goemon, Ryoma, Himiko, Toucon Boost, Mugen, Ikkyu, Toucon Darwin, Shinsengumi, Tenkatoitsu",
            "Level 1, Level 2, Level 3(Gekitotsu Robots, Shakariki Sports), Level 4(Ju Ju Burger), Level 5(Dragon Knight Hunter Z), Level 10(Mighty Brothers XX), Level 20(Mighty Brothers XX), Level 99(Maximum Mighty X), Hyper Muteki",
            "RabbitTank, GorillaMond, HawkGatling, NinninComic, RocketPanda, FireHedgehog, LionCleaner, KeyDragon, KaizokuRessha, OctopusLight, PhoenixRobo, SmaphpWolf, RoseCopter, ToraUFO, KujiraJet, KirinCyclone, KumaTelevi, SameBike, SpiderCooler, BatEngine, HachiMarine, SaiDryer, GoldScorpion, UniRase, TurtleWatch, BeetleCamera, DogMic, MerryChristmas, ShikaMid, PenguinSkater, MagGhost RabbitTank Sparkling, RabbitRabbit, TankTank, Genius",
            "Zi-o, Rider Armors, Decade, Zi-O II, Zi-O Trinity, Grand Zi-O, Zi-O Ohma, Ohma Zi-O"
    };


    private static int[] kamenRiderImages = {
            R.drawable.kuuga,
            R.drawable.agito,
            R.drawable.ryuki,
            R.drawable.faiz,
            R.drawable.blade,
            R.drawable.hibiki,
            R.drawable.kabuto,
            R.drawable.deno,
            R.drawable.kiva,
            R.drawable.decade,
            R.drawable.doubles,
            R.drawable.oz,
            R.drawable.fourze,
            R.drawable.wizard,
            R.drawable.gaim,
            R.drawable.drive,
            R.drawable.ghost,
            R.drawable.exaid,
            R.drawable.build,
            R.drawable.zio
    };

    static ArrayList<KamenRider> getListData() {
        ArrayList<KamenRider> list = new ArrayList<>();
        for (int position = 0; position < kamenRiderNames.length; position++) {
            KamenRider kamenRider = new KamenRider();
            kamenRider.setActor(kamenRiderActors[position]);
            kamenRider.setPlayed(kamenRiderPlayed[position]);
            kamenRider.setEpisode(kamenRiderEpisodes[position]);
            kamenRider.setShowtime(kamenRiderShowTimes[position]);
            kamenRider.setName(kamenRiderNames[position]);
            kamenRider.setDetail(kamenRiderDetails[position]);
            kamenRider.setForm(kamenRiderForm[position]);
            kamenRider.setPhoto(kamenRiderImages[position]);
            list.add(kamenRider);
        }
        return list;
    }
}

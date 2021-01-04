package com.daskull.auradulmaraqiyah.Fragment;


import android.os.Bundle;


import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.daskull.auradulmaraqiyah.Adapter.AuradAdapter;
import com.daskull.auradulmaraqiyah.R;
import com.daskull.auradulmaraqiyah.model.Aurad;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class DoaFragment extends Fragment {

    RecyclerView recyclerViewAurad;
    ArrayList<Aurad> list;
    AuradAdapter adapter;



    public DoaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View itemView = inflater.inflate(R.layout.fragment_doa, container, false);
        recyclerViewAurad = itemView.findViewById(R.id.auradrecycler);
        list = new ArrayList<Aurad>();


        loadData();
        initView();
        return itemView;
    }


    private void initView() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerViewAurad.setLayoutManager(linearLayoutManager);
        recyclerViewAurad.setHasFixedSize(true);
    }

    private void loadData() {
        list.add(new Aurad("َاَعُوْذُ بِاللهِ مِنَ الشَّيْطَانِ الرَّجِيْمِ","Aku berlindung kepada Allah dari godaan syetan yang terkutuk"));
        list.add(new Aurad("بِسْمِ اللهِ الرَّحْمٰنِ الرَّحِيْمِ","Dengan nama Allah yang Maha pengasih lagi Maha penyayang"));
        list.add(new Aurad("اَلْحَمْدُ للهِ رَبِّ الْعَالَمِيْن","Segala puji bagi Allah Tuhan yang menciptakan alam semesta"));
        list.add(new Aurad("اَشْهَدُاَنْ لَا اِلٰهَ اِلاَّ الله","Aku bersaksi bahwa tidak ada tuhan yang sebenarnya patut disembah kecuali Allah"));
        list.add(new Aurad("وَاَشْهَدُاَنَّ مُحَمَّدًارَسُوْلُ الله","Dan aku bersaksi bahwa Nabi Muhammad utusan Allah"));
        list.add(new Aurad("اَللَّهُمَّ صَلِّ عَلىٰ سَيِّدِنَا مُحَمَّدٍ وَعَلىٰ اَلِهِ وَصَحْبِهِ وَسَلِّم","Ya-ALlah limpahkanlah rahmat-Mu kepada junjungan kami Nabi Muhammad beserta keluarganya dan sahabatnya"));
        list.add(new Aurad("سُبْحَانَ اللهِ وَبِحَمْدِهِ","Maha suci Allah dan segala puji bagi-Nya"));
        list.add(new Aurad("سُبْحَانَ اللهِ الْعَظِيْمِ","Maha suci Allah yang maha besar"));
        list.add(new Aurad("مَاشَآءَ اللهُ كَانَ وَمَا لَمْ يَشَأْلَمْ يَكُنْ","Apa saja yang dikehendaki Allah pasti akan terjadi dan apa saja yang tidak dikehendaki-Nya pasti tidak akan terjadi"));
        list.add(new Aurad("اَعْلَمْ اَنَّ للهَ عَلىٰ كُلِّ شَيْئ ٍقَدِيْر","Aku mengetahui Allah maha kuasa atas segalanya"));
        list.add(new Aurad("وَاَنَّ اللهَ قَدْ اَحَاطَ بِكُلِّ شَيْئٍ عِلْمًا","Dan sesungguhnya pengetahuan Allah melebihi segalanya"));
        list.add(new Aurad("سُبْحَانَ اللهِ وَبِحَمْدِهِ\n" +
                "اَسْتَغْفِرُاللهَ اِنَّهُ كَانَ تَوَّابًا ۳×","Maha suci Allah dan segala puji bagi-Nya Aku memohon ampun kepada Allah sesungguhnya Allah maha penerima taubat"));

        list.add(new Aurad("اَسْتَغْفِرُاللهَ الْعَظِيْم الَّذِى لاَ اِلٰهَ اِلاَّ هُوَ الْحَيُّ الْقَيُّوْم وَاَتُوْبُ اِلَيْهِ تَوْبَة عَبْدِ ظَالِمِ لِنَفْسِه لاَ يَمْلِكُ ضَرًّا وَلاَنَفْعًا وَلاَ مَوْتًا وَلَاحَيَاةً وَلاَنُشُوْرًا ۳×","Aku memohon ampun kepada Allah yang Maha Besar, tidak ada Tuhan selain Dia, yang hidup, yang berdiri sendiri, dan aku bertaubat kepada-Nya dengan taubat hamba-hambanya yang kena zholim karena dirinya sendiri yang tidak memiliki mudharat tidak memiliki manfaat, tidak memilki hidup, dan tidak memiliki mati tidak memiliki hari kebangkitan (semua tidak ada pada hamba)"));
        list.add(new Aurad("اَللَّهُمَّ اِنِّي اَصْبَحْتُ وَاَمْسَيْتُ فِى ذِمَّةٍ مِنْكَ وَجِوَارٍفَأَعُوْذُبِكَ مِنْ شَرِّخَلْقِكَ يَا عَظِيْم ۳×","Ya-Tuhanku, sesungguhnya di kaala hamba berada di waktu pagi dan petang, hamba selalu didalam pemeliharaan dan perlindungan-Mu, ya Allah dari kejahatan yang engkau ciptakan wahai tuhanku yang Maha Besar"));
        list.add(new Aurad("اَللَّهُمَّ اِنِّي اَصْبَحْتُ اَمْسَيْتُ (جيك فدا وقت فتاݞ) اُشْهِدُكَ وَاُشْهِدُ حَمَلَةَ عَرْشِكَ وَمَلاَئِكَتِكَ وَجَمِيْعِ خَلْقِكَ بِأَنَّكَ اَنْتَ اللهُ لَااِلَهَ اِلَّااَنْتَ وَحْدَكَ لَاشَرِيْكَ لَكَ وَاَنَّ مُحَمَّدًا عَبْدُكَ وَرَسُوْلُكَ ۳×","Ya-Yuhanku sesunguhnya hamba berada pada pagi (petang) ini, aku bersaksi kepada-Mu ya Allah, dan bersaksi pula kepada malaikat penjaga arasy' dan kepada semua mahluk-Mu ya Allah bahwa engkau adalah Allah, tidak ada tuhan selain Engkau ya Allah, Engkau maha Esa ya Allah , tidak ada sekutu bagi-Mu dan Nabi Muhammad adalah hamba dari Rasul-Mu ya Allah"));
        list.add(new Aurad("اَعُوْذُ باِللهِ السَّمِيْعِ الْعَلِيْمِ مِنَ الشَّيْطَانِ الرَّجِيْمِ","Aku berlindung kepada Allah yang Maha Mendengar, dan Maha Mengetahui, dari godaan syaitan yang terkutuk"));
        list.add(new Aurad("هُوَاللهُ الَّذِى لاَ اِلَهَ اِلَّا هُوَ عَالِمَ الْغَيْبِ وَالشَّهَادَة هُوَالرَّحْمٰنُ الرَّحِيْم، هُوَاللهُ الَّذِى لاَاِلَهَ اِلاَّ هُوَالْمَلِكُ الْقُدُّوْسُ السَّلاَمُ الْمُؤْمِنُ الْمُهَيْمِنُ الْعَزِيْزُ الْجَبَّارُالْمُتَكَبِّر سُبْحَانَ اللهِ عَمَّا يُشْرِكُوْن","Dialah Allah, yang tiada Tuhan selain Dia, yang mengetahui barang yang ghoib, dan yang nampak, Dia Maha pengasih dan Maha penyayang, Dialah Allah yang tidak ada sekutu bagi-Nya, raja yang memerintah semesta alam, yang Maha suci dan Maha selamat(sejahtera) dari aib dan kekurangan yang memberi keamanan yang menguasai hamba-Nya yang Maha perkasa, Maha suci dari segala yang merkea persekutukan"));
        list.add(new Aurad("هُوَاللهُ الْخَالِقُ الْبَارِئُ الْمُصَوِّرُلَهُ الْأَسْمَاءُ الْحُسْنٰى يُسَبِّحُ لَهُ مَا فِى السَّمٰوَاتِ وَالْأَرْضِ وَهُوَالْعَزِيْزُالْحَكِيْم","Dialah Allah yang menciptakan sesuatu dari tidak ada menjadi ada, dan membentuk rupa yang indah. Bagi-Nya beberapa nama yang terbaik. Seluruh isi bumi dan langit bertasbih kepada-Nya. Dia Maha perkasa lagi Maha bijaksana"));
        list.add(new Aurad("اَعُوْذُبِكَلِمَاتِ اللهِ التَّامَّاتِ مِنْ شَرِّمَاخَلَق ۳×","Aku berlindung dengan kalimah Allah, yang maha sempurna dari kejahatan yang diciptakan"));
        list.add(new Aurad("بِسْمِ اللهِ الَّذِى لَا يَضُرُّمَعَ اسْمِهِ شَيْئٌ فِى الْأَرْضِ وَلَا فِى السَّمَآءِ وَهُوَالسَّمِيْعُ الْعَلِيْم ۳×","Dengan nama Allah yang tidak ada sesuatu yang berbahaya dengan nama-Nya baik di bumi maupun di langit, Dia Maha mendengar lagi Maha mengetahui"));
        list.add(new Aurad("بِسْمِ اللهِ الرَّحْمٰنِ الرَّحِيْمِ","Dengan nama Allah yang Maha pengasih lagi Maha penyayang"));
        list.add(new Aurad("لاَ حَوْلَ وَلاَ قُوَّةَ اِلَّا باِللهِ الِعَلِيِّ الْعَظِيْمِ ۳×","Tidak ada daya dan kekuatan selain hanya Allah yang Maha tinggi dan Maha besar"));
        list.add(new Aurad("بِسْمِ اللهِ الرَّحْمٰنِ الرَّحِيْمِ","Dengan nama Allah yang Maha pengasih lagi Maha penyayang"));
        list.add(new Aurad("لَقَدْجَآءَكُمْ رَسُوْلٌ مِنْ اَنْفُسِكُمْ عَزِيْزٌ عَلَيْهِ مَاعَنِتُّمْ حَرِيْصٌ عَلَيْكُمْ بِالْمُؤْمِنِيْنَ رَؤُفٌ رَحِيْمٌ فَإِنْ تَوَلَّوافَقُلْ حَسْبِيَ اللهُ لَآاِلَهُ اِلاَّ هُوَعَلَيْهِ تَوَكَّلْتُ وَهُوَرَبُّ الْعَرْشِ الْعَظِيْمِ ۷×","Sesungguhnya telah datang kepadamu seseorang Rasul dari bangsamu sendiri, yang amat berat baginya, kesusahan kamu, serta harap akan keimananmu, lagi yang sangat kasihan dan penyayang bagi orang-orang yang briman. Jika mereka berpaling (tdiak mau beriman) hendaklah engkau katakan, Aku cukup dengan Allah, tidak ada Tuhan selain Dia dan kepada-Nya aku bertawakkal dan Dia Tuhan yang memelihara arsy yang besar"));
        list.add(new Aurad("حَسْبِيَ اللهُ وَنِعْمَ الْوَكِيْل وَلَا حَوْلَ وَلَاقُوَّةَ اِلَّا بِاللهِ الْعَلِيِّ الْعَظِيْم ۳×","Cukup aku dengan Allah, dan sebaik-baik tempat berserah diri, tidak ada daya dan kekuatan kecuali hanya kepada Allah yang Maha tinggi dan Maha besar"));
        list.add(new Aurad("حَسْبِيَ اللهُ وَنِعْمَ الْوَكِيْل عَلَيْهِ تَوَكَّلْتُ وَاِلَيْهِ اُنِيْب ۳×","Aku cukup dengan Allah sebaik-baik tempat berserah diri dang kepada-Nya aku kembali"));
        list.add(new Aurad("حَسْبِيَ اللهُ وَنِعْمَ الْوَكِيْل نِعْمَ الْمَوْلىٰ وَنِعْمَ النَّصِيْر ۳×","Aku cukup dengan Allah, sebaik-baik tempat berserah diri, sebaik-baik junjungan dan sebaik-baik yang menolong"));
        list.add(new Aurad("تَوَكَّلْتُ عَليٰ الْحَيِّ الَّذِى لَايَمُوْت","Aku berserah diri kepada Allah yang hidup yang tidak mati"));
        list.add(new Aurad("وَقُلِ الْحَمْدُلِلّٰهِ الَّذِى لَمْ يَتَّخِذْوَلَدًاوَلَمْ يَكُنْ لَهُ شَرِيْكٌ فِي الْمُلْكِ وَلَمْ يَكُنْ لَهُ وَلِيٌّ مِنَ الذُّلِ وَكَبِّرْهُ تَكْبِيْرًا ۳×","Tidak mempunyai anak, dan tidak ada sekutu bagi-Nya wali(penolong) karena mendapat hinaan dan besarkanlah Dia sebesar-besarnya"));
        list.add(new Aurad("اللهُ اَكْبَرْكَبِيْرًاوَالْحَمْدُلِلّٰهِ كَثِيْرًا وَسُبْحَانَ اللهِ بُكْرَةً وَاَصِيْلًا ۳×","Allah Maha besar, kami mengagungkan Allah dengan sebesar-besar keagungan. Segala puji bagi Allah, kami memuji Allah sebanyak-banyaknya sepanjang pagi dan petang"));
        list.add(new Aurad("فَتَعَالىَ اللهُ الْمَلِكُ الْحَقُّ لَآاِلَهَ اِلَّاهُوَرَبُّ الْعَرْشِ الْكَرِيْمِ","Maha tinggi Allah yang memiliki kerahaan yang hak. Tidak ada Tuhan selain Dia yang memelihara arsy yang mulia"));
        list.add(new Aurad("اَللهُ لَآاِلَهَ اِلاَّهُوَرَبُّ الْعَرْشِ الْعَظِيْمِ","Allah tidak ada Tuhan selain Dia, yang memelihara arsy yang agung"));
        list.add(new Aurad("اَللهُ لَآاِلَهَ اِلَّاهُوَ وَعَلىَ اللهِ فَلْيَتَوَكَّلِ الْمُؤْمِنُوْنَ","Allah tidak ada Tuhan selain Dia, dan kepada Allah semua orang mukmin berserah diri"));
        list.add(new Aurad("لَآاِلَهَ اِلَّااللهُ الْمَلِكُ الْحَقُّ الْمُبِيْنُ ۵٠×","Tidak ada Tuhan selain Allah yang memiliki kerajaan yang hak dan yang nyata "));
        list.add(new Aurad("رَبُنَّاوَرَبُّ اَبَآئِنَاالْاَوَّلِيْنَ","Yaitu Tuhan kita dan Tuhan bapak-bapak kita yang terdahulu"));
        list.add(new Aurad("لَآاِلَهَ اِلَّااللهُ الْمَلِكُ الْحَقُّ الْمُبِيْنُ","Tidak ada Tuhan selain Allah yang memiliki kerajaan yang hak dan yang nyata"));
        list.add(new Aurad("مُحَمَّدٌ رَسُوْلُ اللهِ الصَّادِقُ الْوَعْدِالْأَمِيْنُ","Muhammad utusan Allah yang benar, yang menepati janji dan kepercayaan"));
        list.add(new Aurad("اَللَّهُمَّ صَلِّ عَلىٰ سَيِّدِنَامُحَمَّدٍ","Ya Allah limpahkanlah rahmat kepada junjungan kami Nabi Muhammad SAW"));
        list.add(new Aurad("اَللَّهُمَّ صَلِّ وَسَلِّمْ وَبَارِكْ عَلىٰ سَيِّدِ نَاوَمَوْلَا نَامُحَمَّدٍ شَجَرَةِ الأَصْلِ النُّوْرَانِيَّةِ وَلَمْعَةِ الْقَبْضَةِ الرَّحْمَانِيَّةِ وَاَفْضَلِ الْخَلِيْقَةِ الإِنْسَانِيَّةِ وَاَشْرَفِ الْجِسْمَانِيَّةِ وَمَعْدِنِ الْأَسْرَارِ الرَّبَّانِيَّةِ وَخَزَائِنِ الْعُلُوْمِ الْإِصْطِفَائِيّةِ صَاحِبُ الْقَبْضَةِ الْأَصْلِيَّةِ وَالْبَهْجَةِ السَّنِيَّةِ وَالرَّتْبَةِ الْعَلِيَّةِ مَنِ انْدَرَجَتِ النَّبِيُّوْنَ تَحْتَ لِوَائِهِ فَهُمْ مِنْهُ وَاِلَيْهِ\n" +
                "وَصَلِّ وَسَلِّمْ وَبَارِكْ عَلَيْهِ وَعَلىٰ آلِهِ وَصَحْبِهِ عَدَدَمَا خَلَقْتَ وَرَزَقْتَ وَاَمَتَّ وَاَحْيَيْتَ اِلىٰ يَوْمٍ تُبْعَثُ مَنْ اَفْنَيْتَ وَسَلِّمْ تَسْلِيْمًا كَثِيْرًا وَالْحَمْدُلِلَّهِ رَبِّ الْعَلَمِيْىنَ ۳×","Ya Allah limpahkanlah rahmat serta salam sejahtera dan keberkatan kepada junjungan kami Nabi Muhammad SAW, yang merupakan sumber cahaya yang memancar dari genggaman Allah, Beliau semulia-mulia bentuk kejadian manusia, dan semulia-mulia bentuk tubuh dan penuh dengan rahasia ketuhanan, dan gudang ilmu pilihan yang memiliki genggaman yang asli dan mempunyai kebaikan yang nyata dan pangkat yang tinggi. " +
                "semua pangkat dan kedudukan nabi-nabi berada dibawah benderanya, mereka semua berasal dari dia (Nur Muhammad). Limpahkanlah rahmat serta salam dan keberkatan kepadanya dan kepada keluarga dan sahabatnya, sebanyak jumlah mahluk yang engkau ciptakan Ya Allah dan yang telah Engkau berikan rizki dan sejumlah yang telah engkau matikan dan hidupkan sampai pada hari yang engkau bangkitkan dan semua yang telah engkau binasakan." +
                "dan limpahkanlah rahmat dengan limpahan yang sebanyak-banyaknya dan segala puji bagi Allah tuhan semesta alam"));
        list.add(new Aurad("اَللَّهُمَّ صَلِّ عَلىٰ سَيِّدِنَامُحَمَّدٍ وَعَلىٰ اٰلِ سَيِّدِنَا مُحَمَّدٍ","Ya Allah limpahkanlah rahmat-Mu kepada junjungan kami Nabi Muhammad dan kepada semua keluarga beliau"));
        list.add(new Aurad("بِسْمِ اللهِ الرَّحْمٰنِ الرَّحِيْمِ","Dengan nama Allah yang Maha pengasih lagi Maha penyayang"));
        list.add(new Aurad("اَللَّهُمَّ صَلِّ عَلىٰ سَيِّدِنَا مُحَمَّدِنِالْفَاتِحِ لِمَااُغْلِقَ وَالْخَاتِمِ لِمَاسَبَقَ وَالنَّاصِرِالْحَقِّ بِالْحَقِّ الْهَادِى اِلىٰ صِرَاتِكَ الْمُسْتَقِيْمِ وَعَلىٰ آلِهِ حَقَّ قَدْرِهِ وَمِقْدَارِهِ الْعَظِيْمِ ۳×","Ya Allah limpahkanlah rahmat kepada junjungan kami Nabi Muhammad, pembuka segala sesuatu yang terkunci, penutup segala sesuatu yang terdahulu, penolong kebenaran dengan kebenaran, yang senantiasa memberi petunjuk ke jalan-Mu yang lurus ya Allah. Dan kepada keluarganya yang beriman dan yang mengikuti petunjuknya dengan penuh kebesaran"));
        list.add(new Aurad("اَللَّهُمَّ صَلِّ عَلىٰ نُوْرِالْأَنْوَارِ وَسِرِّالْأَسْرَارِ وَتِرْيَاقِ الْأَغْيَارِوَمِفْتَاحِ بَابِ الْيَسَارِسَيِّدِنَا مُحَمَّدِنِالْمُخْتَارِوَآلِهِ الْأَطْهَارِوَاَصْحَابِهِ الْأَخْيَارِعَدَدَنِعَمِ اللهِ وَاِفْضَالِهِ ۳×","Ya Allah limpahkanlah rahmat kepada yang merupakan cahaya di atas cahaya, rahasia beberpa rahasia yang seluhur-luhur orang yang mulia, kunci segala pintu kemudahan yaitu junjungan kami Muhammad SAW yang pilihan, dan keluarganya yang suci dan sahabat-sahabatnya yang mulia sebanyak nikmat Allah dan anugerah-Nya"));
        list.add(new Aurad("اَللَّهُمَّ صَلِّ وَسَلِّمْ وَبَارِكْ عَلىٰ سَيِّدِنَامُحَمَّدٍعَدَدَمَافِي عِلْمِ اللهِ صَلَاةًدَائِمَةً بِدَوَامِ مُلْكِ اللهِ ۳×","Ya Allah limpahkanlah rahmat dan salam serta barokah kepada junjungan kami Nabi Muhammad, sebanyak yang ada alam ilmu pengetahuan Allah, rahmat yang tetap selama-lamanya di dalam milik Allah"));
        list.add(new Aurad("اَللَّهُمَّ صَلِّ عَلىٰ سَيِّدِنَامُحَمَّدٍطِبِّ الْقُلُوْبِ وَدَوِائِهَا وَعَافِيَةِ الْأَبْدَانِ وَشِفَائِهَا وَنُوْرِالْأَبْصَارِوَضِيَائِهَا وَرَبِيْعِ الْقُلُوْبِ وَجِلَائِهَا وَعَلىٰ آلِهِ وَصَحْبِهِ فِى كُلِّ لَمْحَةٍ وَنَفَسٍ بِعَدَدِ كُلِّ مَعْلُوْمٍ لَكَ\n" +
                "لاَاِلِهَ اِلَّااللهُ الْحَلِيْمُ الْكَرِيْمُ\n" +
                " سُبْحَانَ رَبِّ الْعَرْشِ الْعَظِيْمِ ۳×","Ya Allah limpahkanlah rahmat kepada junjungan kami Nabi Muhammad yang menjadi dokter hati, hanya beliau yang mampu mengobatinya dan beliau dapat menyehatkan semua badan, beliau pula yang mampu menyembuhkannya semua cahaya penglihatan, yang terang benderang beliau penyejuk dan penyiram hati, beliau pula yang dapat menerangkannya dan kepada semua keluarganya dengan sahabat-sahabatnya pada setiap saat dan nafas sebaynyak yang Engkau ketahui." +
                "Tidak ada Tuhan yang patut disembah kecuali Allah yang Maha penyantun dan Maha pemurah. Maha suci Allah yang memelihara arsy yang Maha Agung"));
        list.add(new Aurad("لَااِلَهَ اِلَّااَنْتَ سُبْحَانَكَ اِنِّىْ كُنْتُ مِنَ الظَّالِمِيْنَ","Tidak ada Tuhan selain Engkau ya Allah sesungguhnya aku termasuk orang-orang yang teraniaya"));
        list.add(new Aurad("لَااِلَهَ اِلَّااللهُ الْمَلِكُ الْحَقُّ الْمُبِيْنُ","Tidak ada tuhan yang patut disembah kecuali Allah, raja yang sebenar-benarnya"));
        list.add(new Aurad("مُحَمَّدٌرَسُوْلُ اللهِ صَادِقُ الْوَعْدِالْأَمِيْنُ","Muhammad adalah utusan Allah yang benar segala janjinya dan dipercayai"));
        list.add(new Aurad("لَااِلَهَ اِلَّااللهُ الْعَزِيْزُالْغَفَّارُ\n" +
                "  مُحَمَّدٌرَسُوْلُ اللهِ النَّبِيُّ الْمُخْتَار\n" +
                "اَبُوْبَكْرٍصَاحِبُهُ فِى الْغَارِ\n" +
                "   عُمَرُمِفْتَاحُ الْأَنْصَارِ\n" +
                "عُثْمَانُ الْقَتِيْلُ فِى الدَّارِ \n" +
                "  عَلِىٌّ سَيْفُ اللهِ عَلىَ الْكُفَّارِ\n" +
                "فَعَلىٰ مُبْغِضِهِمْ لَعْنَةُ الْمَلِكِ الْجَبَّارِ\n" +
                "وَمَأْوَاهُ جَهَنَّمُ وَبِئْسَ الْقَرَارُ ۳×","Tidak ada tuhan yang patut disembah kecuali Allah yang Maha perkasa dan Maha pengampun. Nabi Muhammad utusan Allah seorang nabi pilihan. Abu Bakar Ash-Shiddiq yang menemaninya di dalam gua Tsur. Umar bin Khattab yang dapat menaklukkan kota-kota besar. Umar bin Affan yang terbunuh di dalam rumahnya. Ali bin Abi Thalib pedang Allah melawan orang-orang kafir. Orang-orang yang benci terhadap mereka ini, akan dilaknat oleh Allah. Tempat mereka (yang benci itu) adalah neraka jahannam dan ia sejelek-jelek tempat tinggal"));
        list.add(new Aurad("لَااِلَهَ اِلَّااللهُ الْمَلِكُ الْحَقُّ الْمَجِيْدُ\n" +
                "مُحَمَّدٌرَسُوْلُ اللهِ الْهَادِى الرَّشِيْدُ\n" +
                "اَبُوْبَكْرِنِالصِّدِيْقُ الصَّادِقُ الشَّدِيْدُ\n" +
                "عُمَرُبْنُ الْخَطَّابِ سُوْرٌمِنْ حَدِيْدٍ\n" +
                "عُثْمَانُ بْنُ عَفَّانِ الْقَتِيْلُ الشَّهِيْدُ\n" +
                "عَلِىُّ بْنُ اَبِى طَالِبُ ذُوالْبَأْسِ الشَّدِيْدُ\n" +
                "فَعَلىٰ مُبْغِضِهِمْ لَعْنَةُ الرَّبِ الْمَجِيْدِ ۳×","Tidak ada tuhan yang patut disembah kecuali Allah yang menjadi raja yang Maha mulia, Muhammad utusan Allah yang oandai memberi petunjuk, Abu Bakar Ash-Shiddiq orang yang pertama membenarkan kerasulan Muhammad SAW, Umar bin Khattab laksana pagar besi kekuatannya, Utsman bin Affan yang terbunuh dalam keadaan syahid, Ali bin Abi Thalib yang mendapat cobaan keras Orang-orang yang membenci kepada mereka akan dilaknat oleh Allah yang Maha mulia"));

        //======================================================================================//

        list.add(new Aurad("قَوْمٌ لَهُمْ عِنْدَرَبِّ الْعَرْشِ مَنْزِلَةُ","Ada satu kelompok buat mereka disisi Allah yang memiliki arsy yang tinggi"));
        list.add(new Aurad("وَحُرْمَةٌ وَبِشَارَةٌ وَاِكْرَامُ","Mereka diberikan penghormatan oleh Allah ditugaskan untuk menyampaikan berita-berita gembira dan dianugerahkan kemuliaan"));
        list.add(new Aurad("فَازُوْابِالصُحْبَةِ خَيْرِ الْخَلْقِ وَاتَّصِفُوْا\n" +
                "  بِوَصْفِهِ فَهُمُوالِلنَّاسِ اَعْلَامُ","Sungguh beruntung orang-orang yang berteman dengan sebaik-baik makhluk yang memiliki sifat orang-orang terpuji (Nabi Muhammad) mereka adalah bendera bagi seluruh ummat"));
        list.add(new Aurad("فَفِى اَبِى بَكْرِنِالصِّدِّيْقِ قَدْوَرَدَتْ\n" +
                "آثَارُفَضْلٍ لَهَا فِى الذِّكْرِاَحْكَامُ","Yaitu Abu Bakar Ash-Shiddiq yang datang dengan membawa beberapa kelebihan, dan selalu ingat serta berpegang teguh dengan hukum Allah yang dibawa Rasulullah"));
        list.add(new Aurad("وَبَعْدَهُ عُمَرُالْفَرُوْقُ صَاحِبُهُ\n" +
                "بِهِ تَكَمَّلَ فِى الْأَفَاقِ اِسْلَامُ","Setelah Abu Bakar wafat Umar Al-Faruqlah sahabat Rasulullah, yang menyebarkan islam keseluruh pelosok dunia"));
        list.add(new Aurad("وَهٰكَذَاالبِرُّعُثْمَانُ الشَّهِيْدُلَهُ\n" +
                "فِى اللَّيْلِ وِرْدٌبِالْقُرْآنِ قَوَّامُ","Demikian pula tentang kebaikan Utsman bin Affan, yang selalu bersaksi kepada beliau di malam hari ia selalu wirid dan selalu berpegang teguh dengan Al-Qur'an"));
        list.add(new Aurad("وَلِلْإِمَامِ عَلِىُّ الْمُرْتَضٰى مِنَحُ\n" +
                "لَهُ احْتِرَامٌ وَاِعْزَارٌوَاِكْرَامُ","Dan terhadap Ali bin Abi Thalib sebagai ikutan yang diridhoi yang memperoleh pemberiian, ia diberi kehormatan, kemuliaan dan kemurahan"));
        list.add(new Aurad("هُمُ الصَّحَابَةُ لِلْمُخْتَارِقَدْوَضَّحُوْا\n" +
                "طُرُقَ الْهُدٰى وَعَلىَ الْخَيْرَاتِ قَدْتَامُ","Mereka itu adalah sahabat-sahabat yang terpilih jelas beliau telah memberikan jaminan buat memberi petunjuk kepada kebaikan dan kesempurnaan"));
        list.add(new Aurad("عَلَيْهِمُوامِنْ سَلاَمِ اللهِ اَطْيَابُهُ\n" +
                "مَااَفْتَرَالنَّاسُ يَوْمَ الشَّكِّ اَوْصَامُو","Salam sejahtera buat mereka yang baik-baik selama orang masih berbuka pada hari syak yang akan berpuasa"));
        list.add(new Aurad("صَلُّوا عَلىٰ مَنْ اَتَتْحَقًّابَشَائِرُهُ\n" +
                "اَلْهَاشِمِىِّ الَّذِى طَابَتْ عَنَّاصِرُهُ","Rahmat bagi orang yang datang membawa kebenaran, dan menyampaikan berita gembira yaitu Nabi Muhammad SAW yang bangsawan Hasyim yang suci bersih asal kejadiannya"));
        list.add(new Aurad("هُوَالنَّبِىُّ الَّذِى تَسْعَى الْمُلُوْكُ لَهُ\n" +
                "عَلَى الرُّؤُوْسِ فَتَأْتِهِمْ مَفَاخِرُهُ","Dialah Nabi Muhammad yang mendatangi raja-raja dan pemimpin-pemimpin dengan penuh kemegahan"));
        list.add(new Aurad("هُوَ الرَّسُوْلُ الَّذِى شَاعَتْ رِسَالَتُهُ\n" +
                "فىِ الْخَلْقِ طُرًّاوَقَدْعَمَّتْ مَأَثِرُهُ","Dialah Rasulullah yang menjalankan risalahnya di seluruh alam dan mereka bekas ajarannya"));
        list.add(new Aurad("هَذَاالطَّبِيْبُ لِهَدْيِ النَّاسِ كُلِّهِمُوْا\n" +
                "يَشْفِى الْعَلِيْلَ وَلِلْمَكْسُوْرِجَابِرُهُ","Beliau adalah dokter yang mampu emberikan petunjuk kepada ummat manusia, yang dapat menyembuhkan penyakit hati, dan mampu meperbaiki rohani dan jasmani yang telah rusak"));
        list.add(new Aurad("صَلىَّ عَلَيْهِ اِلَهُ الْعَرْشِ مَاطَلَعَتْ\n" +
                "شَمْسٌ وَمَانَاحَ فَوْقَ الْغُصْنِ طَائِرُهُ","Rahmat Allah baginya yang menguasai arsy selama matahari terbit dan selama burung-burung masih dapat berkicau di dahan dan di ranting-ranting kayu"));
        list.add(new Aurad("حَمْدًاوَشُكْرًالِلْإِلَهِ الْمُنْعِمِ\n" +
                "فَصَلِّيَاوَسَلِّمَايَاخَالِقِى","Puji syukur kehadirat yang telah menganugerahkan beberapa nikmat, shalawat dan salam kami haturkan wahai Tuhanku"));
        list.add(new Aurad("عَلىَ النَّبِى مُحَمَّدٍوَالْأٰلِ \n" +
                "وَالصُّحْبِ خَيْرِالْأٰلِ وَالْأَصْحَابِ","Kpada Nabi Muhammad dan kepada keluarga dan sahabatnya yang sebaik-baik keularga dan sahabat"));
        list.add(new Aurad("ياَرَبِّ بِاسْمِكَ الْعَظِيْمِ الْأَعْظَمِ\n" +
                "وَبِالنَّبِىِّ الْهَاشِمِىِّ الأَفْحَمِ","Wahai Tuhanku dengan namamu, yang agung dan dengan nabi yang bangsa Hasyimi yang mulia"));
        list.add(new Aurad("أُمْنُنْ عَلىَ الْعَبْدِالْفَقِيْرِالطَّالِبِ\n" +
                "باِلْعِلْمِ وَالْأَعْمَالِ وَالْإِخْلَاصِ","Berikanlah Ya Allah, kepada hamba-Mu yang fakir, yang menuntut ulmu, amal yang diiringi dengan keikhlasan"));
        list.add(new Aurad("وَافْتَحْ عَلَىَّ بِالْعُلُوْمِ النَّافِعِ\n" +
                "يَارَبِّ وَانْفَعْنِى بِمَا عَلَّمْتَنِى","Bukakanlah buat hamba-Mu ini ya Allah, ilmu yang bermanfaat wahai Tuhan manfaatkanlah semua yang hamba pelajari"));
        list.add(new Aurad("وَاذْهَبْ بِناَ بِأَحْسَنِ الْمَذَاهِبِ\n" +
                "وَابْلُغْ بِهَابِأَرْفَعِ الْمَرَاتِبِ","Tunjukkanlah buat kami jalan yang sebaik-baik jalan Ya Allah, sampaikanlah kami Ya Allah kepada martabat yang tinggi"));
        list.add(new Aurad("يَارَبِّ جُدْوَآتِ بِالْمَطَالِبِ\n" +
                "لِلْعَبْدِوَالْإِخْوَانِ وَالْأَسَاتِذِ","Wahai Tuhan, sampaikanlah segala permohonan kami, baik untuk hamba-Mu sendiri, maupun untuk saudara-saudara kami dan gutu-guru kami"));
        list.add(new Aurad("وَاغْفِرْ لِمَنْ اَقَرَّبِالتَّقْصِيْرِ\n" +
                "الزَّيْن رَاجِى الزَّيْدَفِى التَّبْصِيْرِ","Ampunilah seseorang yang sangat mengharapkan pengampunan-mu Ya Allah yaitu Syekh Muhammad Zainuddin Arsyad yang benar-benar mengharapkan ampunan"));
        list.add(new Aurad("وَمُنَّ بِالْقَضَاعَنِ الْمَدِيْنِ\n" +
                "وَالْكَرْبَ فَرِّجْ اَطْلِقِ الْأَسِيْرِ","Anugerahkanlah hamba-Mu ya Allah jalan keluar untuk dapat membayar utang piutang dan lepaskanlah hamba-Mu ini ya Allah dari segala macam kesukaran, walau sedikit"));
        list.add(new Aurad("وَارْحَمْ جَمِيْعَ الْمُسْلِمِيْنَ يَارَحِيْم\n" +
                "بِصَالِحِ الْأَعْمَالِ فَاخْتِمْ يَاكَرِيْمِ","Limpahkanlah rahmat-Mu kepada semua orang islam ya Allah, yang berbuat amal sholeh anugerahkan kepada mereka ya Allah Khusnul Khotimah, wahai tuhan yang Maha pemurah"));
        list.add(new Aurad("وَانْصُرْجُيُوْسَ الْمُسْلِمِيْنَ الْقٰئِمِيْنَ\n" +
                "عَلىٰ جِهَادِالْكَافِرِيْنَ الظَّالِمِيْنَ","Bantulah tentara-tentara islam yang sedang berjuang ya Allah melawan orang-orang kafir yang aniaya"));
        list.add(new Aurad("يَارَبِّ مُدَّنَابِرِزْقٍ طَيِّبِ\n" +
                "وَرُدَّعَنَّاشَرَّكُلِّ مُعْتَدِى","Wahai Tuhan, berikanlah kami rizqi yang baik buat selama-lamanya, dan tolaklah buat kami segala kejahatan yang menjadi musuh kami"));
        list.add(new Aurad("وَادْفَعْ اِلَهَنَامِنْ كُلِّ نَازِلِ\n" +
                "عَنَّامِنَ الْبَلاَءِ رَ بِّ وَالْطُفِ","Tolaklah wahai TUhan kami, segala macam penyakit yang turun kepada kami ya Tuhan kami yang Maha Lembut"));
        list.add(new Aurad("بِحَمْدِكَ اللَّهُمَّ اخْتِم يَاحَمِيْدُ\n" +
                "عَلىَ النَّبِى فَصَلِّيَنَّ يَامَجِيْدُ","Dengan memuji engkau ya Allah kami sudahi permohonan kami ini ya Allah yang maha terpuji, Berilah keselamatan kepada Nabi kami wahai Tuhan yang Maha tinggi"));
        list.add(new Aurad("وَآلِهِ وَصَحْبِهِ وَالتَّابِعِيْنَ\n" +
                "كَذَاالسَّلَامُ لِلْجَمِيْعِ وَالْمُسْلِمِيْنَ","Dan kepada semua keluarga dan sahabatnya, dan kepada para thabi'in. Demikian pula kepada semua orang-orang islam"));
        list.add(new Aurad("بِسْمِ اللهِ اسْتَعَنْتُ وَلَهُ حَامِدًا\n" +
                "فَصَلِّ يَارَبَّنَاوَسَلِّمَنَّ عَلىٰ","Dengan nama-Mu aku memohon pertolongan, segala puji bagi-Nya berikanlah rahmat dan keselamatan wahai tuhanku"));
        list.add(new Aurad("مُحَمَّدٍجَاءَنَامُبَشِّرًامُنْذِرًا\n" +
                "وَكُلِّ آلِ وَصَحْبِ لِلنَّبِىِّ انْتَمٰى","Kepada Nabi Muhammad yang membawa berita gembira"));
        list.add(new Aurad("يَارَبَّنَاآتِنَامَطْلُوْبَنَاوَاجْعَلَا\n" +
                "سَعْيَامَرَاقِي التَّعْلِيْمَاتِ نَاجِحًا","Wahai Tuhan kami berikanlah segala permohonan kami dan jadikanlah segala perjalanan Maraqitta'limat ini lulus dan selamat"));
        list.add(new Aurad("وَباِلْعُلُوْمِ مَعَ الْأَعْمَالِ رَبِّ ارْزُقًا\n" +
                "طُلَّابَهَاوَالَّذِيْنَ فِيْهَاقَدْاَخْلَصَا","Dengan ilmu dan amal, wahai Tuhan limpahkanlah rizqi kepada pelajar dan siswa kami dan kepada orang-orang yang bekerja dengan keikhlasan"));
        list.add(new Aurad("بِتَعْلِيْمِ وَاِنْشَاءٍلَهَارَبَّنَا\n" +
                "وَاَجْزِلَنْ اَجْرَمَنْ قَدْ اَحْسَنَ الْعَمَلًا","Dengan mempelajari semua ciptaan Allah , Dengan memperoleh balasan pahala bagi orang yang berbuat kebaikan"));
        list.add(new Aurad("وَافْتَحْ عَلَيْنَافَتُوْحَ الْعَرِفِيْنَ بِكَ\n" +
                "وَمِنْ خَزَائِنِ رَحْمَةٍ عَلَيْنَاانْشُرًا","Bukakanlah kami Ya Allah kunci pengetahuan dan limpahkanlah kepada kami rahmat Ya Allah"));
        list.add(new Aurad("وَكُنْ لَنَايَااِلَهَنَامُعِيْنًاعَلىٰ\n" +
                "اُمُوْرِنَاوَاهْدِنَالِمَايَنْفَعُنَا","Berikanlah kami pertolongan Ya Akkah, kepada semua urusan kami dan berilah kami petunjuk pada jalan yang bermanfaat buat kami"));
        list.add(new Aurad("وَالْطُفْ بِنَايَالَطِيْفُ فِيْمَاقَدْجَرٰى\n" +
                "مِنَ الْقَضَاوَاعْفُ عَنَّافِيْمَاقَدْمَضٰى","Berlemah lembutlah kepada kami, wahai Tuhan kami yang Maha lembut, terhadap sesuatu yang terjadi dari qadla'-Mu Ya Allah dan maafkanlah apa yang terlanjur kami perbuat"));
        list.add(new Aurad("يَارَبِّ هَيِّئْ لَنَا مِنْ اَمْرِنَارَشَدًا\n" +
                "وَاجْعَلْ مَعُوْنَتَكَ الْحُسْنٰى لَنَا مَدَدًا","Wahai TUhan kami sempurnakanlah petunjuk-Mu buat kami sehingga urusan kami menjadi lurus, jadikanlah pertolongan-Mu Ya Allah buat kami, sehingga kami menjadi baik selamanya"));
        list.add(new Aurad("وَلَاتَكِلْنَااِلىٰ تَدْبِيْرِاَنْفُسِنَا\n" +
                "فَالنَّفْسُ تَعْجِزُعَنْ اِصْلَاحِ مَافَسَدًا","Jangan engkau serahkan kepada kami untuk mengatur diri kami adalah berjiwa lemah dan tidak mampu memperbaiki yang terlah rusak"));
        list.add(new Aurad("اَنْتَ الْعَلِيْمُ وَقَدْوَجَّهْتُ يَااَمَلِى\n" +
                "اِلىٰ رَجَائِكَ وَجْهًاسَائِلًاوَيَدًا","Engkau Maha mengetahui, Ya Allah segala cita-cita kami, sungguh hamba mengharap kehadirat-Mu Ya Allah untuk memohon kepada-Mu"));
        list.add(new Aurad("وَلِلرَّجَاءِثَوَابٌ اَنْتَ تَعْلَمُهُ\n" +
                "فَاجْعَلْ ثَوَابِى دَوَامَ السَّتْرِلِى اَبَدًا","Engkau tentu lebih mengetahui ya Allah, bahwa [ahalah yang hamba harapkan. Maka jadikanlah pahala itu buat hamba selamanya"));
        list.add(new Aurad("بِالْحَمْدِ لِلّٰهِ رَبِّ اَخْتِمَنَّ الدُّعَا\n" +
                "مُصَلِّيًاوَمُسَلِّمًاعَلٰى اَحْمَدًا","Dengan lafadz Alhamdulillah hamba hamba tutup do'a ini dengan mengucapkan shalawat dan salam kepada Nabi Muhammad SAW"));
        list.add(new Aurad("كَذَاآلِ وَصَحْبٍ اَنْجُمِ اْلإِقْتِدَأ\n" +
                "اُوْلىِ الْفَضَائِلِ وَالْمَكَارِمِ وَاْلوَافٰى","Demikian pula kepada semua keluarga dan sahabatnya yang laksana bintang yang dapat memberikan petunjuk yang mempunyai kelebihan dan kemuliaan dan kecukupan"));
        //================================================//

        list.add(new Aurad("اِلٰهِى لَسْتُ لِلْفِرْدَوْسِ اَهْلاً\n" +
                "وَلاَاَقْوٰى عَلىٰ نَارِالْجَحِيْمِ","Wahai Tuhanku hamba-Mu ini tidak pantas, menjadi penghuni surga firdaus, tetapi hamba-Mu tidak mampu menerima siksa jahim"));
        list.add(new Aurad("فَهَبْ لِى تَوْبَةً وَاغْفِرْذنُوْبِى\n" +
                "فَإِنَّكَ غَافِرُالذَّنْبِ الْعَظِيْمِ","Terimalah taubat hamba-Mu Ya Allah dan ampunilah semua dosa hamba-Mu Ya Allah, Engkau mengampuni semuda dosa besar"));
        list.add(new Aurad("اِلهِٰى عَبْدُكَ الْجَانِى اَتَاكَ\n" +
                "مُقِرًّاباِلذُّنُوْبِ وَقَدْدَعَاكَ","Wahai Tuhanku, hamba-Mu ini tetap datang membawa dosa, namun hamba-Mu selalu berdo'a memohon kehadirat-Mu Ya Allah"));
        list.add(new Aurad("فَإِنْ تَغْفِرْفَأَنْتَ لِذَاكَ اَهْلُ\n" +
                "وَاِنْ تَتْرُكْ فَمَنْ يَرْحَمْ سِوٰكَ","Kalau engkau tidak sudi memberi pengampunan sedang engkau ahli pengampunan dan kalau engkau tinggalkan hamba-Mu ini Ya Allah siapa lagi yang memberikan rahmat selain Engkau Ya Allah"));


        adapter = new AuradAdapter(list,getActivity());
        recyclerViewAurad.setAdapter(adapter);
    }

}

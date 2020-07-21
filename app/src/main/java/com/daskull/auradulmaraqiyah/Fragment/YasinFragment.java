package com.daskull.auradulmaraqiyah.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.daskull.auradulmaraqiyah.Adapter.AuradAdapter;
import com.daskull.auradulmaraqiyah.Adapter.YasinAdapter;
import com.daskull.auradulmaraqiyah.R;
import com.daskull.auradulmaraqiyah.model.Yasin;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the  factory method to
 * create an instance of this fragment.
 */
public class YasinFragment extends Fragment {
    ArrayList<Yasin> list;
    RecyclerView yasinRecycler;
    YasinAdapter adapter;
    TextView next;

    public YasinFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View itemView = inflater.inflate(R.layout.fragment_yasin, container, false);
        list = new ArrayList<Yasin>();
        yasinRecycler = itemView.findViewById(R.id.yasinrecycler);
        next = itemView.findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DoaFragment doaFragment = new DoaFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container,doaFragment)
                        .addToBackStack(null)
                        .commit();
            }
        });

        loadData();
        initView();

        return itemView;
    }

    private void initView() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        yasinRecycler.setLayoutManager(linearLayoutManager);
        yasinRecycler.setHasFixedSize(true);
    }

    private void loadData() {

        list.add(new Yasin("يٰسۤ ۚ","Ya Sin"));
        list.add(new Yasin("وَالْقُرْاٰنِ الْحَكِيْمِۙ","Demi Al-Qur'an yang penuh hikmah"));
        list.add(new Yasin("اِنَّكَ لَمِنَ الْمُرْسَلِيْنَۙ","sungguh, engkau (Muhammad) adalah salah seorang dari rasul-rasul"));
        list.add(new Yasin("عَلٰى صِرَاطٍ مُّسْتَقِيْمٍۗ","(yang berada) di atas jalan yang lurus,"));
        list.add(new Yasin("تَنْزِيْلَ الْعَزِيْزِ الرَّحِيْمِۙ","(sebagai wahyu) yang diturunkan oleh (Allah) Yang Mahaperkasa, Maha Penyayang"));
        list.add(new Yasin("لِتُنْذِرَ قَوْمًا مَّآ اُنْذِرَ اٰبَاۤؤُهُمْ فَهُمْ غٰفِلُوْنَ","agar engkau memberi peringatan kepada suatu kaum yang nenek moyangnya belum pernah diberi peringatan, karena itu mereka lalai."));
        list.add(new Yasin("لَقَدْ حَقَّ الْقَوْلُ عَلٰٓى اَكْثَرِهِمْ فَهُمْ لَا يُؤْمِنُوْنَ","Sungguh, pasti berlaku perkataan (hukuman) terhadap kebanyakan mereka, karena mereka tidak beriman"));
        list.add(new Yasin("اِنَّا جَعَلْنَا فِيْٓ اَعْنَاقِهِمْ اَغْلٰلًا فَهِيَ اِلَى الْاَذْقَانِ فَهُمْ مُّقْمَحُوْنَ","Sungguh, Kami telah memasang belenggu di leher mereka, lalu tangan mereka (diangkat) ke dagu, karena itu mereka tertengadah"));
        list.add(new Yasin("وَجَعَلْنَا مِنْۢ بَيْنِ اَيْدِيْهِمْ سَدًّا وَّمِنْ خَلْفِهِمْ سَدًّا فَاَغْشَيْنٰهُمْ فَهُمْ لَا يُبْصِرُوْنَ","Dan Kami jadikan di hadapan mereka sekat (dinding) dan di belakang mereka juga sekat, dan Kami tutup (mata) mereka sehingga mereka tidak dapat melihat"));
        list.add(new Yasin("وَسَوَاۤءٌ عَلَيْهِمْ ءَاَنْذَرْتَهُمْ اَمْ لَمْ تُنْذِرْهُمْ لَا يُؤْمِنُوْنَ","Dan sama saja bagi mereka, apakah engkau memberi peringatan kepada mereka atau engkau tidak memberi peringatan kepada mereka, mereka tidak akan beriman juga"));
        list.add(new Yasin("اِنَّمَا تُنْذِرُ مَنِ اتَّبَعَ الذِّكْرَ وَخَشِيَ الرَّحْمٰنَ بِالْغَيْبِۚ فَبَشِّرْهُ بِمَغْفِرَةٍ وَّاَجْرٍ كَرِيْمٍ","Sesungguhnya engkau hanya memberi peringatan kepada orang-orang yang mau mengikuti peringatan dan yang takut kepada Tuhan Yang Maha Pengasih, walaupun mereka tidak melihat-Nya. Maka berilah mereka kabar gembira dengan ampunan dan pahala yang mulia"));
        list.add(new Yasin("اِنَّا نَحْنُ نُحْيِ الْمَوْتٰى وَنَكْتُبُ مَا قَدَّمُوْا وَاٰثَارَهُمْۗ وَكُلَّ شَيْءٍ اَحْصَيْنٰهُ فِيْٓ اِمَامٍ مُّبِيْنٍ","Sungguh, Kamilah yang menghidupkan orang-orang yang mati, dan Kamilah yang mencatat apa yang telah mereka kerjakan dan bekas-bekas yang mereka (tinggalkan). Dan segala sesuatu Kami kumpulkan dalam Kitab yang jelas (Lauh Mahfuzh)"));
        list.add(new Yasin("وَاضْرِبْ لَهُمْ مَّثَلًا اَصْحٰبَ الْقَرْيَةِۘ اِذْ جَاۤءَهَا الْمُرْسَلُوْنَۚ","Dan buatlah suatu perumpamaan bagi mereka, yaitu penduduk suatu negeri, ketika utusan-utusan datang kepada mereka"));
        list.add(new Yasin("اِذْ اَرْسَلْنَآ اِلَيْهِمُ اثْنَيْنِ فَكَذَّبُوْهُمَا فَعَزَّزْنَا بِثَالِثٍ فَقَالُوْٓا اِنَّآ اِلَيْكُمْ مُّرْسَلُوْنَ","(yaitu) ketika Kami mengutus kepada mereka dua orang utusan, lalu mereka mendustakan keduanya; kemudian Kami kuatkan dengan (utusan) yang ketiga, maka ketiga (utusan itu) berkata, Sungguh, kami adalah orang-orang yang diutus kepadamu"));
        list.add(new Yasin("قَالُوْا مَآ اَنْتُمْ اِلَّا بَشَرٌ مِّثْلُنَاۙ وَمَآ اَنْزَلَ الرَّحْمٰنُ مِنْ شَيْءٍۙ اِنْ اَنْتُمْ اِلَّا تَكْذِبُوْنَ","Mereka (penduduk negeri) menjawab, Kamu ini hanyalah manusia seperti kami, dan (Allah) Yang Maha Pengasih tidak menurunkan sesuatu apa pun; kamu hanyalah pendusta belaka"));
        list.add(new Yasin("قَالُوْا رَبُّنَا يَعْلَمُ اِنَّآ اِلَيْكُمْ لَمُرْسَلُوْنَ","Mereka berkata, Tuhan kami mengetahui sesungguhnya kami adalah utusan-utusan(-Nya) kepada kamu"));
        list.add(new Yasin("وَمَا عَلَيْنَآ اِلَّا الْبَلٰغُ الْمُبِيْنُ","Dan kewajiban kami hanyalah menyampaikan (perintah Allah) dengan jelas"));
        list.add(new Yasin("قَالُوْٓا اِنَّا تَطَيَّرْنَا بِكُمْۚ لَىِٕنْ لَّمْ تَنْتَهُوْا لَنَرْجُمَنَّكُمْ وَلَيَمَسَّنَّكُمْ مِّنَّا عَذَابٌ اَلِيْمٌ","Mereka menjawab, Sesungguhnya kami bernasib malang karena kamu. Sungguh, jika kamu tidak berhenti (menyeru kami), niscaya kami rajam kamu dan kamu pasti akan merasakan siksaan yang pedih dari kami"));
        list.add(new Yasin("قَالُوْا طَاۤىِٕرُكُمْ مَّعَكُمْۗ اَىِٕنْ ذُكِّرْتُمْۗ بَلْ اَنْتُمْ قَوْمٌ مُّسْرِفُوْنَ","Mereka (utusan-utusan) itu berkata, Kemalangan kamu itu adalah karena kamu sendiri. Apakah karena kamu diberi peringatan? Sebenarnya kamu adalah kaum yang melampaui batas"));
        list.add(new Yasin("وَجَاۤءَ مِنْ اَقْصَا الْمَدِيْنَةِ رَجُلٌ يَّسْعٰى قَالَ يٰقَوْمِ اتَّبِعُوا الْمُرْسَلِيْنَۙ","Dan datanglah dari ujung kota, seorang laki-laki dengan bergegas dia berkata, Wahai kaumku! Ikutilah utusan-utusan itu"));
        list.add(new Yasin("اتَّبِعُوْا مَنْ لَّا يَسْـَٔلُكُمْ اَجْرًا وَّهُمْ مُّهْتَدُوْنَ","Ikutilah orang yang tidak meminta imbalan kepadamu; dan mereka adalah orang-orang yang mendapat petunjuk"));
        list.add(new Yasin("وَمَا لِيَ لَآ اَعْبُدُ الَّذِيْ فَطَرَنِيْ وَاِلَيْهِ تُرْجَعُوْنَ","Dan tidak ada alasan bagiku untuk tidak menyembah (Allah) yang telah menciptakanku dan hanya kepada-Nyalah kamu akan dikembalikan"));
        list.add(new Yasin("ءَاَتَّخِذُ مِنْ دُوْنِهٖٓ اٰلِهَةً اِنْ يُّرِدْنِ الرَّحْمٰنُ بِضُرٍّ لَّا تُغْنِ عَنِّيْ شَفَاعَتُهُمْ شَيْـًٔا وَّلَا يُنْقِذُوْنِۚ","Mengapa aku akan menyembah tuhan-tuhan selain-Nya? Jika (Allah) Yang Maha Pengasih menghendaki bencana terhadapku, pasti pertolongan mereka tidak berguna sama sekali bagi diriku dan mereka (juga) tidak dapat menyelamatkanku"));
        list.add(new Yasin("اِنِّيْٓ اِذًا لَّفِيْ ضَلٰلٍ مُّبِيْنٍ","Sesungguhnya jika aku (berbuat) begitu, pasti aku berada dalam kesesatan yang nyata"));
        list.add(new Yasin("اِنِّيْٓ اٰمَنْتُ بِرَبِّكُمْ فَاسْمَعُوْنِۗ","Sesungguhnya aku telah beriman kepada Tuhanmu; maka dengarkanlah (pengakuan keimanan)-ku"));
        list.add(new Yasin("قِيْلَ ادْخُلِ الْجَنَّةَ ۗقَالَ يٰلَيْتَ قَوْمِيْ يَعْلَمُوْنَۙ","Dikatakan (kepadanya), “Masuklah ke surga.” Dia (laki-laki itu) berkata, “Alangkah baiknya sekiranya kaumku mengetahui"));
        list.add(new Yasin("بِمَا غَفَرَ لِيْ رَبِّيْ وَجَعَلَنِيْ مِنَ الْمُكْرَمِيْنَ","apa yang menyebabkan Tuhanku memberi ampun kepadaku dan menjadikan aku termasuk orang-orang yang telah dimuliakan"));
        list.add(new Yasin("۞ وَمَآ اَنْزَلْنَا عَلٰى قَوْمِهٖ مِنْۢ بَعْدِهٖ مِنْ جُنْدٍ مِّنَ السَّمَاۤءِ وَمَا كُنَّا مُنْزِلِيْنَ","Dan setelah dia (meninggal), Kami tidak menurunkan suatu pasukan pun dari langit kepada kaumnya, dan Kami tidak perlu menurunkannya"));
        list.add(new Yasin("اِنْ كَانَتْ اِلَّا صَيْحَةً وَّاحِدَةً فَاِذَا هُمْ خَامِدُوْنَ","Tidak ada siksaan terhadap mereka melainkan dengan satu teriakan saja; maka seketika itu mereka mati"));
        list.add(new Yasin("يٰحَسْرَةً عَلَى الْعِبَادِۚ مَا يَأْتِيْهِمْ مِّنْ رَّسُوْلٍ اِلَّا كَانُوْا بِهٖ يَسْتَهْزِءُوْنَ","Alangkah besar penyesalan terhadap hamba-hamba itu, setiap datang seorang rasul kepada mereka, mereka selalu memperolok-olokkannya"));
        list.add(new Yasin("اَلَمْ يَرَوْا كَمْ اَهْلَكْنَا قَبْلَهُمْ مِّنَ الْقُرُوْنِ اَنَّهُمْ اِلَيْهِمْ لَا يَرْجِعُوْنَ","Tidakkah mereka mengetahui berapa banyak umat-umat sebelum mereka yang telah Kami binasakan. Orang-orang (yang telah Kami binasakan) itu tidak ada yang kembali kepada mereka"));
        list.add(new Yasin("وَاِنْ كُلٌّ لَّمَّا جَمِيْعٌ لَّدَيْنَا مُحْضَرُوْنَ","Dan setiap (umat), semuanya akan dihadapkan kepada Kami"));
        list.add(new Yasin("وَاٰيَةٌ لَّهُمُ الْاَرْضُ الْمَيْتَةُ ۖاَحْيَيْنٰهَا وَاَخْرَجْنَا مِنْهَا حَبًّا فَمِنْهُ يَأْكُلُوْنَ","Dan suatu tanda (kebesaran Allah) bagi mereka adalah bumi yang mati (tandus). Kami hidupkan bumi itu dan Kami keluarkan darinya biji-bijian, maka dari (biji-bijian) itu mereka makan"));
        list.add(new Yasin("وَجَعَلْنَا فِيْهَا جَنّٰتٍ مِّنْ نَّخِيْلٍ وَّاَعْنَابٍ وَّفَجَّرْنَا فِيْهَا مِنَ الْعُيُوْنِۙ","Dan Kami jadikan padanya di bumi itu kebun-kebun kurma dan anggur dan Kami pancarkan padanya beberapa mata air"));
        list.add(new Yasin("لِيَأْكُلُوْا مِنْ ثَمَرِهٖۙ وَمَا عَمِلَتْهُ اَيْدِيْهِمْ ۗ اَفَلَا يَشْكُرُوْنَ","agar mereka dapat makan dari buahnya, dan dari hasil usaha tangan mereka. Maka mengapa mereka tidak bersyukur?"));
        list.add(new Yasin("سُبْحٰنَ الَّذِيْ خَلَقَ الْاَزْوَاجَ كُلَّهَا مِمَّا تُنْۢبِتُ الْاَرْضُ وَمِنْ اَنْفُسِهِمْ وَمِمَّا لَا يَعْلَمُوْنَ","Mahasuci (Allah) yang telah menciptakan semuanya berpasang-pasangan, baik dari apa yang ditumbuhkan oleh bumi dan dari diri mereka sendiri, maupun dari apa yang tidak mereka ketahui"));
        list.add(new Yasin("وَاٰيَةٌ لَّهُمُ الَّيْلُ ۖنَسْلَخُ مِنْهُ النَّهَارَ فَاِذَا هُمْ مُّظْلِمُوْنَۙ","Dan suatu tanda (kebesaran Allah) bagi mereka adalah malam; Kami tanggalkan siang dari (malam) itu, maka seketika itu mereka (berada dalam) kegelapan"));
        list.add(new Yasin("وَالشَّمْسُ تَجْرِيْ لِمُسْتَقَرٍّ لَّهَا ۗذٰلِكَ تَقْدِيْرُ الْعَزِيْزِ الْعَلِيْمِۗ","dan matahari berjalan di tempat peredarannya. Demikianlah ketetapan (Allah) Yang Mahaperkasa, Maha Mengetahui"));
        list.add(new Yasin("وَالْقَمَرَ قَدَّرْنٰهُ مَنَازِلَ حَتّٰى عَادَ كَالْعُرْجُوْنِ الْقَدِيْمِ","Dan telah Kami tetapkan tempat peredaran bagi bulan, sehingga (setelah ia sampai ke tempat peredaran yang terakhir) kembalilah ia seperti bentuk tandan yang tua"));
        list.add(new Yasin("لَا الشَّمْسُ يَنْۢبَغِيْ لَهَآ اَنْ تُدْرِكَ الْقَمَرَ وَلَا الَّيْلُ سَابِقُ النَّهَارِ ۗوَكُلٌّ فِيْ فَلَكٍ يَّسْبَحُوْنَ","Tidaklah mungkin bagi matahari mengejar bulan dan malam pun tidak dapat mendahului siang. Masing-masing beredar pada garis edarnya"));
        list.add(new Yasin("وَاٰيَةٌ لَّهُمْ اَنَّا حَمَلْنَا ذُرِّيَّتَهُمْ فِى الْفُلْكِ الْمَشْحُوْنِۙ","Dan suatu tanda (kebesaran Allah) bagi mereka adalah bahwa Kami angkut keturunan mereka dalam kapal yang penuh muatan"));
        list.add(new Yasin("وَخَلَقْنَا لَهُمْ مِّنْ مِّثْلِهٖ مَا يَرْكَبُوْنَ","dan Kami ciptakan (juga) untuk mereka (angkutan lain) seperti apa yang mereka kendarai"));
        list.add(new Yasin("وَاِنْ نَّشَأْ نُغْرِقْهُمْ فَلَا صَرِيْخَ لَهُمْ وَلَاهُمْ يُنْقَذُوْنَۙ","Dan jika Kami menghendaki, Kami tenggelamkan mereka. Maka tidak ada penolong bagi mereka dan tidak (pula) mereka diselamatkan"));
        list.add(new Yasin("اِلَّا رَحْمَةً مِّنَّا وَمَتَاعًا اِلٰى حِيْنٍ","melainkan (Kami selamatkan mereka) karena rahmat yang besar dari Kami dan untuk memberikan kesenangan hidup sampai waktu tertentu"));
        list.add(new Yasin("وَاِذَا قِيْلَ لَهُمُ اتَّقُوْا مَا بَيْنَ اَيْدِيْكُمْ وَمَا خَلْفَكُمْ لَعَلَّكُمْ تُرْحَمُوْنَ","Dan apabila dikatakan kepada mereka, Takutlah kamu akan siksa yang di hadapanmu (di dunia) dan azab yang akan datang (akhirat) agar kamu mendapat rahmat"));
        list.add(new Yasin("وَمَا تَأْتِيْهِمْ مِّنْ اٰيَةٍ مِّنْ اٰيٰتِ رَبِّهِمْ اِلَّا كَانُوْا عَنْهَا مُعْرِضِيْنَ","Dan setiap kali suatu tanda dari tanda-tanda (kebesaran) Tuhan datang kepada mereka, mereka selalu berpaling darinya"));
        list.add(new Yasin("وَاِذَا قِيْلَ لَهُمْ اَنْفِقُوْا مِمَّا رَزَقَكُمُ اللّٰهُ ۙقَالَ الَّذِيْنَ كَفَرُوْا لِلَّذِيْنَ اٰمَنُوْٓا اَنُطْعِمُ مَنْ لَّوْ يَشَاۤءُ اللّٰهُ اَطْعَمَهٗٓ ۖاِنْ اَنْتُمْ اِلَّا فِيْ ضَلٰلٍ مُّبِيْنٍ","Dan apabila dikatakan kepada mereka, “Infakkanlah sebagian rezeki yang diberikan Allah kepadamu,” orang-orang yang kafir itu berkata kepada orang-orang yang beriman, Apakah pantas kami memberi makan kepada orang-orang yang jika Allah menghendaki Dia akan memberinya makan? Kamu benar-benar dalam kesesatan yang nyata"));
        list.add(new Yasin("وَيَقُوْلُوْنَ مَتٰى هٰذَا الْوَعْدُ اِنْ كُنْتُمْ صٰدِقِيْنَ","Dan mereka (orang-orang kafir) berkata, Kapan janji (hari berbangkit) itu (terjadi) jika kamu orang yang benar?"));
        list.add(new Yasin("مَا يَنْظُرُوْنَ اِلَّا صَيْحَةً وَّاحِدَةً تَأْخُذُهُمْ وَهُمْ يَخِصِّمُوْنَ","Mereka hanya menunggu satu teriakan, yang akan membinasakan mereka ketika mereka sedang bertengkar"));
        list.add(new Yasin("فَلَا يَسْتَطِيْعُوْنَ تَوْصِيَةً وَّلَآ اِلٰٓى اَهْلِهِمْ يَرْجِعُوْنَ","Sehingga mereka tidak mampu membuat suatu wasiat dan mereka (juga) tidak dapat kembali kepada keluarganya"));
        list.add(new Yasin("وَنُفِخَ فِى الصُّوْرِ فَاِذَا هُمْ مِّنَ الْاَجْدَاثِ اِلٰى رَبِّهِمْ يَنْسِلُوْنَ","Lalu ditiuplah sangkakala, maka seketika itu mereka keluar dari kuburnya (dalam keadaan hidup), menuju kepada Tuhannya"));
        list.add(new Yasin("قَالُوْا يٰوَيْلَنَا مَنْۢ بَعَثَنَا مِنْ مَّرْقَدِنَا ۜهٰذَا مَا وَعَدَ الرَّحْمٰنُ وَصَدَقَ الْمُرْسَلُوْنَ","Mereka berkata, “Celakalah kami! Siapakah yang membangkitkan kami dari tempat tidur kami (kubur)?” Inilah yang dijanjikan (Allah) Yang Maha Pengasih dan benarlah rasul-rasul(-Nya)"));
        list.add(new Yasin("اِنْ كَانَتْ اِلَّا صَيْحَةً وَّاحِدَةً فَاِذَا هُمْ جَمِيْعٌ لَّدَيْنَا مُحْضَرُوْنَ","Teriakan itu hanya sekali saja, maka seketika itu mereka semua dihadapkan kepada Kami (untuk dihisab)"));
        list.add(new Yasin("فَالْيَوْمَ لَا تُظْلَمُ نَفْسٌ شَيْـًٔا وَّلَا تُجْزَوْنَ اِلَّا مَا كُنْتُمْ تَعْمَلُوْنَ","Maka pada hari itu seseorang tidak akan dirugikan sedikit pun dan kamu tidak akan diberi balasan, kecuali sesuai dengan apa yang telah kamu kerjakan"));
        list.add(new Yasin("اِنَّ اَصْحٰبَ الْجَنَّةِ الْيَوْمَ فِيْ شُغُلٍ فٰكِهُوْنَ ۚ","Sesungguhnya penghuni surga pada hari itu bersenang-senang dalam kesibukan (mereka)"));
        list.add(new Yasin("هُمْ وَاَزْوَاجُهُمْ فِيْ ظِلٰلٍ عَلَى الْاَرَاۤىِٕكِ مُتَّكِـُٔوْنَ ۚ","Mereka dan pasangan-pasangannya berada dalam tempat yang teduh, bersandar di atas dipan-dipan"));
        list.add(new Yasin("لَهُمْ فِيْهَا فَاكِهَةٌ وَّلَهُمْ مَّا يَدَّعُوْنَ ۚ","Di surga itu mereka memperoleh buah-buahan dan memperoleh apa saja yang mereka inginkan"));
        list.add(new Yasin("سَلٰمٌۗ قَوْلًا مِّنْ رَّبٍّ رَّحِيْمٍ","(Kepada mereka dikatakan), “Salam,” sebagai ucapan selamat dari Tuhan Yang Maha Penyayang"));
        list.add(new Yasin("وَامْتَازُوا الْيَوْمَ اَيُّهَا الْمُجْرِمُوْنَ","Dan (dikatakan kepada orang-orang kafir), “Berpisahlah kamu (dari orang-orang mukmin) pada hari ini, wahai orang-orang yang berdosa!"));
        list.add(new Yasin("اَلَمْ اَعْهَدْ اِلَيْكُمْ يٰبَنِيْٓ اٰدَمَ اَنْ لَّا تَعْبُدُوا الشَّيْطٰنَۚ اِنَّهٗ لَكُمْ عَدُوٌّ مُّبِيْنٌ","Bukankah Aku telah memerintahkan kepadamu wahai anak cucu Adam agar kamu tidak menyembah setan? Sungguh, setan itu musuh yang nyata bagi kamu"));
        list.add(new Yasin("وَاَنِ اعْبُدُوْنِيْ ۗهٰذَا صِرَاطٌ مُّسْتَقِيْمٌ","dan hendaklah kamu menyembah-Ku. Inilah jalan yang lurus"));
        list.add(new Yasin("وَلَقَدْ اَضَلَّ مِنْكُمْ جِبِلًّا كَثِيْرًا ۗاَفَلَمْ تَكُوْنُوْا تَعْقِلُوْنَ","Dan sungguh, ia (setan itu) telah menyesatkan sebagian besar di antara kamu. Maka apakah kamu tidak mengerti?"));
        list.add(new Yasin("هٰذِهٖ جَهَنَّمُ الَّتِيْ كُنْتُمْ تُوْعَدُوْنَ","Inilah (neraka) Jahanam yang dahulu telah diperingatkan kepadamu"));
        list.add(new Yasin("اِصْلَوْهَا الْيَوْمَ بِمَا كُنْتُمْ تَكْفُرُوْنَ","Masuklah ke dalamnya pada hari ini karena dahulu kamu mengingkarinya"));
        list.add(new Yasin("اَلْيَوْمَ نَخْتِمُ عَلٰٓى اَفْوَاهِهِمْ وَتُكَلِّمُنَآ اَيْدِيْهِمْ وَتَشْهَدُ اَرْجُلُهُمْ بِمَا كَانُوْا يَكْسِبُوْنَ","Pada hari ini Kami tutup mulut mereka; tangan mereka akan berkata kepada Kami dan kaki mereka akan memberi kesaksian terhadap apa yang dahulu mereka kerjakan"));
        list.add(new Yasin("وَلَوْ نَشَاۤءُ لَطَمَسْنَا عَلٰٓى اَعْيُنِهِمْ فَاسْتَبَقُوا الصِّرَاطَ فَاَنّٰى يُبْصِرُوْنَ","Dan jika Kami menghendaki, pastilah Kami hapuskan penglihatan mata mereka; sehingga mereka berlomba-lomba (mencari) jalan. Maka bagaimana mungkin mereka dapat melihat?"));
        list.add(new Yasin("وَلَوْ نَشَاۤءُ لَمَسَخْنٰهُمْ عَلٰى مَكَانَتِهِمْ فَمَا اسْتَطَاعُوْا مُضِيًّا وَّلَا يَرْجِعُوْنَ","Dan jika Kami menghendaki, pastilah Kami ubah bentuk mereka di tempat mereka berada; sehingga mereka tidak sanggup berjalan lagi dan juga tidak sanggup kembali"));
        list.add(new Yasin("وَمَنْ نُّعَمِّرْهُ نُنَكِّسْهُ فِى الْخَلْقِۗ اَفَلَا يَعْقِلُوْنَ","Dan barangsiapa Kami panjangkan umurnya niscaya Kami kembalikan dia kepada awal kejadian(nya). Maka mengapa mereka tidak mengerti?"));
        list.add(new Yasin("وَمَا عَلَّمْنٰهُ الشِّعْرَ وَمَا يَنْۢبَغِيْ لَهٗ ۗاِنْ هُوَ اِلَّا ذِكْرٌ وَّقُرْاٰنٌ مُّبِيْنٌ ۙ","Dan Kami tidak mengajarkan syair kepadanya (Muhammad) dan bersyair itu tidaklah pantas baginya. Al-Qur'an itu tidak lain hanyalah pelajaran dan Kitab yang jelas"));
        list.add(new Yasin("لِّيُنْذِرَ مَنْ كَانَ حَيًّا وَّيَحِقَّ الْقَوْلُ عَلَى الْكٰفِرِيْنَ","agar dia (Muhammad) memberi peringatan kepada orang-orang yang hidup (hatinya) dan agar pasti ketetapan (azab) terhadap orang-orang kafir"));
        list.add(new Yasin("اَوَلَمْ يَرَوْا اَنَّا خَلَقْنَا لَهُمْ مِّمَّا عَمِلَتْ اَيْدِيْنَآ اَنْعَامًا فَهُمْ لَهَا مَالِكُوْنَ","Dan tidakkah mereka melihat bahwa Kami telah menciptakan hewan ternak untuk mereka, yaitu sebagian dari apa yang telah Kami ciptakan dengan kekuasaan Kami, lalu mereka menguasainya?"));
        list.add(new Yasin("وَذَلَّلْنٰهَا لَهُمْ فَمِنْهَا رَكُوْبُهُمْ وَمِنْهَا يَأْكُلُوْنَ","Dan Kami menundukkannya (hewan-hewan itu) untuk mereka; lalu sebagiannya untuk menjadi tunggangan mereka dan sebagian untuk mereka makan"));
        list.add(new Yasin("وَلَهُمْ فِيْهَا مَنَافِعُ وَمَشَارِبُۗ اَفَلَا يَشْكُرُوْنَ","Dan mereka memperoleh berbagai manfaat dan minuman darinya. Maka mengapa mereka tidak bersyukur?"));
        list.add(new Yasin("وَاتَّخَذُوْا مِنْ دُوْنِ اللّٰهِ اٰلِهَةً لَّعَلَّهُمْ يُنْصَرُوْنَ ۗ","Dan mereka mengambil sesembahan selain Allah agar mereka mendapat pertolongan"));
        list.add(new Yasin("لَا يَسْتَطِيْعُوْنَ نَصْرَهُمْۙ وَهُمْ لَهُمْ جُنْدٌ مُّحْضَرُوْنَ","Mereka (sesembahan) itu tidak dapat menolong mereka; padahal mereka itu menjadi tentara yang disiapkan untuk menjaga (sesembahan) itu"));
        list.add(new Yasin("فَلَا يَحْزُنْكَ قَوْلُهُمْ ۘاِنَّا نَعْلَمُ مَا يُسِرُّوْنَ وَمَا يُعْلِنُوْنَ","Maka jangan sampai ucapan mereka membuat engkau (Muhammad) bersedih hati. Sungguh, Kami mengetahui apa yang mereka rahasiakan dan apa yang mereka nyatakan"));
        list.add(new Yasin("اَوَلَمْ يَرَ الْاِنْسَانُ اَنَّا خَلَقْنٰهُ مِنْ نُّطْفَةٍ فَاِذَا هُوَ خَصِيْمٌ مُّبِيْنٌ","Dan tidakkah manusia memperhatikan bahwa Kami menciptakannya dari setetes mani, ternyata dia menjadi musuh yang nyata!"));
        list.add(new Yasin("وَضَرَبَ لَنَا مَثَلًا وَّنَسِيَ خَلْقَهٗۗ قَالَ مَنْ يُّحْيِ الْعِظَامَ وَهِيَ رَمِيْمٌ","Dan dia membuat perumpamaan bagi Kami dan melupakan asal kejadiannya; dia berkata, Siapakah yang dapat menghidupkan tulang-belulang, yang telah hancur luluh?"));
        list.add(new Yasin("قُلْ يُحْيِيْهَا الَّذِيْٓ اَنْشَاَهَآ اَوَّلَ مَرَّةٍ ۗوَهُوَ بِكُلِّ خَلْقٍ عَلِيْمٌ ۙ","Katakanlah (Muhammad), “Yang akan menghidupkannya ialah (Allah) yang menciptakannya pertama kali. Dan Dia Maha Mengetahui tentang segala makhluk"));
        list.add(new Yasin("ِۨالَّذِيْ جَعَلَ لَكُمْ مِّنَ الشَّجَرِ الْاَخْضَرِ نَارًاۙ فَاِذَآ اَنْتُمْ مِّنْهُ تُوْقِدُوْنَ","yaitu (Allah) yang menjadikan api untukmu dari kayu yang hijau, maka seketika itu kamu nyalakan (api) dari kayu itu"));
        list.add(new Yasin("اَوَلَيْسَ الَّذِيْ خَلَقَ السَّمٰوٰتِ وَالْاَرْضَ بِقٰدِرٍ عَلٰٓى اَنْ يَّخْلُقَ مِثْلَهُمْ ۗبَلٰى وَهُوَ الْخَلّٰقُ الْعَلِيْمُ","Dan bukankah (Allah) yang menciptakan langit dan bumi, mampu menciptakan kembali yang serupa itu (jasad mereka yang sudah hancur itu)? Benar, dan Dia Maha Pencipta, Maha Mengetahui"));
        list.add(new Yasin("اِنَّمَآ اَمْرُهٗٓ اِذَآ اَرَادَ شَيْـًٔاۖ اَنْ يَّقُوْلَ لَهٗ كُنْ فَيَكُوْنُ","Sesungguhnya urusan-Nya apabila Dia menghendaki sesuatu Dia hanya berkata kepadanya, “Jadilah!” Maka jadilah sesuatu itu"));
        list.add(new Yasin("فَسُبْحٰنَ الَّذِيْ بِيَدِهٖ مَلَكُوْتُ كُلِّ شَيْءٍ وَّاِلَيْهِ تُرْجَعُوْنَ","Maka Mahasuci (Allah) yang di tangan-Nya kekuasaan atas segala sesuatu dan kepada-Nya kamu dikembalikan."));



        // list.add(new Yasin("",""));


        adapter = new YasinAdapter(list,getActivity());
        yasinRecycler.setAdapter(adapter);
    }
}

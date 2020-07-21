package com.daskull.auradulmaraqiyah.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.daskull.auradulmaraqiyah.Adapter.DoaAdapter;
import com.daskull.auradulmaraqiyah.R;
import com.daskull.auradulmaraqiyah.model.Doa;
import com.daskull.auradulmaraqiyah.model.IDoaItemListener;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentKumpulanDoa extends Fragment implements IDoaItemListener {

    RecyclerView doaRecycler;
    ArrayList<Doa> doaArrayList;
    DoaAdapter adapter;

    public FragmentKumpulanDoa() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View itemView = inflater.inflate(R.layout.fragment_kumpulan_doa, container, false);
        doaRecycler = itemView.findViewById(R.id.doaRecycler);
        doaArrayList = new ArrayList<Doa>();

        loadData();
        initView();
        return itemView;
    }



    private void initView() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        doaRecycler.setLayoutManager(linearLayoutManager);
        doaRecycler.setHasFixedSize(true);
    }

    private void loadData() {
        doaArrayList.add(new Doa("Do'a Setelah Shalat","أَسْتَغْفِرُ اللهَ الْعَظِـيْمِ الَّذِيْ لَااِلَهَ اِلَّا هُوَ الْحَيُّ الْقَيُّوْمُ وَأَتُوْبُ إِلَيْهِ\n" +
                "لَاإِلَهَ إِلَّا اللهُ وَحْدَهُ لَا شَرِيْكَ لَهُ، لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ يُحْيِيْ وَيُمِيْتُ وَهُوَ عَلَى كُلِّ شَيْئٍ قَدِيْرٌ\n" +
                "للَّهُمَّ أَنْتَ السَّلاَمُ، وَمِنْكَ السَّلَامُ، وَإِلَيْكَ يَعُوْدُ السَّلَامُ فَحَيِّنَارَبَّنَا بِالسَّلَامِ وَاَدْخِلْنَا الْـجَنَّةَ دَارَ السَّلَامِ تَبَارَكْتَ رَبَّنَا وَتَعَالَيْتَ يَا ذَاالْـجَلَالِ وَاْلإِكْرَام\n" +
                "" +
                "بِسْمِ اللّٰهِ الرَّحْمٰنِ الرَّحِيْمِ\n" +
                "الْحَمْدُ لِلَّهِ رَبِّ الْعَالَمِينَ\n" +
                "الرَّحْمَٰنِ الرَّحِيم\n" +
                "مَالِكِ يَوْمِ الدِّينِ\n" +
                "إِيَّاكَ نَعْبُدُ وَإِيَّاكَ نَسْتَعِينُ\n" +
                "اهْدِنَا الصِّرَاطَ الْمُسْتَقِيمَ\n" +
                "صِرَاطَ الَّذِينَ أَنْعَمْتَ عَلَيْهِمْ غَيْرِ الْمَغْضُوبِ عَلَيْهِمْ وَلَا الضَّالِّينَ\n" +
                "أَعُوذُ بِاللَّهِ مِنَ الشَّيْطَانِ الرَّجِيمِ. بِسْمِ اللهِ الرَّحْمَنِ الرَّحِيْمِ. اَللهُ لَا إِلَهَ إِلَّا هُوَ الْحَيُّ الْقَيُّومُ لَا تَأْخُذُهُ سِنَةٌ وَّلَانَوْمٌ، لَهُ مَافِي السَّمَاوَاتِ وَمَافِي اْلأَرْضِ مَن ذَا الَّذِيْ يَشْفَعُ عِنْدَهُ إِلَّا بِإِذْنِهِ يَعْلَمُ مَابَيْنَ أَيْدِيْهِمْ وَمَاخَلْفَهُمْ وَلَا يُحِيْطُونَ بِشَيْءٍ مِّنْ عِلْمِهِ إِلَّا بِمَا شَآءَ، وَسِعَ كُرْسِيُّهُ السَّمَاوَاتِ وَاْلأَرْضَ وَلَا يَـؤدُهُ حِفْظُهُمَا وَهُوَ الْعَلِيُّ الْعَظِيْمُ\n" +
                "سُبْحَانَ اللهِ\n" +
                "الْحَمْدُلِلهِ\n" +
                "اللهُ اَكْبَرُ\n" +
                "لَااِلٰهَ اِلَّا اللهُ\n" +
                "بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيم\n" +
                "اَلْحَمْدُ لِلَّهِ رَبِّ الْعَالَمِيْنَ. حَمْدًا يُوَافِيْ نِعَمَهُ وَيُكَافِئُ مَزِيْدَهُ. يَا رَبَّنَا لَكَ الْحَمْدُ كَمَا يَنْبَغِيْ لِجَلاَلِ وَجْهِكَ الْكَرِيْمِ وَعَظِيْمِ سُلْطَانِكَ" +
                "اللهم صل على سيدنا محمد وعلى ال سيدنا محمد" +
                "اَللَّهُمَّ رَبَّنَا تَـقَـبَّلْ مِنَّا صَلاَتَنَا وَصِيَا مَنَا وَرُكُوْ عَنَا وَسُجُوْدَنَا وَقُعُوْدَنَا وَتَضَرُّ عَنَا وَتَخَشُّوْ عَنَا وَتَعَبُّدَنَا وَتَمِّمْ تَقْصِيْرَ نَا يَا اَلله يَا رَبَّ الْعَا لَمِيْنَ" +
                "رَبَّنَا ضَلَمْنَا أَنْفُسَنَا وَإِنْ لَمْ تَغْفِرْ لَنَا وَتَرْ حَمْنَا لَنَكُوْ نَنَّ مِنَ الْخَا سِرِ يْنَ" +
                "رَبَّنَا وَلاَ تَحْمِلْ عَلَيْنَا إِصْرًا كَمَا حَمَلْتَهُ عَلَى الَّذِ يْنَ مِنْ قَبْلِنَا" +
                "رَبَّنَا وَلاَ تُحَمِّلْنَا مَا لاَ طَا قَتَا لَنَا بِهِ, وَاعْفُ عَنَّا وَاغْفِرْلَنَا وَارْحَمْنَا أَنْتَ مَوْلاَ نَا فَا نْصُرْنَا عَلَى الْقَوْمِ الْكَا فِرِيْنَ" +
                "رَبَّنَا لاَ تُزِغْ قُلُوْ بَنَا بَعْدَ إِذْ هَدَ يْتَنَا وَهَبْ لَنَا مِنْ لَّدُ نْكَ رَحْمَةً إِنَّكَ أَنْتَ الْوَهَّابُ" +
                "رَبَّنَا غْفِرْلَنَا وَلِوَالِدِيْنَ وَلِجَمِيْعِ الْمُسْلِمِيْنَ وَالْمُسْلِمَاتِ وَالْمُؤْمِنِيْنَ وَالْمُؤْمِنَاتِ أَلْأَ حْيَآءِمِنْهُمْ وَاْلأَ مْوَاتِ, اِنَّكَ عَلَى قُلِّ ثَيْءٍقَدِيْرِ" +
                "رَبَّنَا آتِنَا فِي الدُّنْيَا حَسَنَةً وَفِي اْلآ خِرَةِ حَسَنَةً وَقِنَا عَذَابَ النَّارِ" +
                "اللهم اغفر لنا ذنوبناوكفرعنا سيئاتنا وتوفنا مَعَ الْأَ بْرَارِ" +
                "سُبْحَانَ رَبِّكِ رَبِّ الْعِزَةِ عَمَّا يَصِفُوْنَ، وَسَلاَمٌ عَلَى الْمُرْ سَلِيْنَ، وَالْحَمْدُ لِلهِ رَبِّ الْعَالَمِيْنَ","Segala puji bagi Allah Tuhan seru sekalian alam. Dengan puji yang sebanding dengan nikmat-Nya dan menjamin tambahannya. Ya Allah Tuhan Kami, bagi-Mu segala puji dan segala apa yang patut atas keluhuran DzatMu dan Keagungan kekuasaanMu. \"Ya Allah! Limpahkanlah rahmat dan salam atas junjungan kita Nabi Muhammad dan sanak keluarganya.\n" +
                "\n" +
                "Ya Allah terima sholat kami, puasa kami, ruku kami, sujud kami, duduk rebah kami, khusyu' kami, pengabdian kami, dan sempurnakanlah apa yang kami lakukan selama sholat ya Allah. Tuhan seru sekalian alam.\n" +
                "\n" +
                "Ya Allah, Kami telah aniaya terhadap diri kami sendiri, karena itu ya Allah jika tidak dengan limpahan ampunan-Mu dan rahmat-Mu niscaya kami akan jadi orang yang sesat. Ya Allah Tuhan kami, janganlah Engkau pikulkan atas diri kami beban yang berat sebagaimana yang pernah Engkau bebankan kepada orang yang terdahulu dari kami. Ya Allah Tuhan kami, janganlah Engkau bebankan atas diri kami apa yang di luar kesanggupan kami. Ampunilah dan limpahkanlah rahmat ampunan terhadap diri kami ya Allah. Ya Allah Tuhan kami, berilah kami pertolongan untuk melawan orang yang tidak suka kepada agamaMu.\n" +
                "\n" +
                "Ya Allah Tuhan kami, janganlah engkau sesatkan hati kami sesudah mendapat petunjuk, berilah kami karunia. Engkaulah yang maha Pemurah.\n" +
                "\n" +
                "Ya Allah Ya Tuhan kami, ampunilah dosa kami dan dosa dosa orang tua kami, dan bagi semua orang Islam laki-laki dan perempuan, orang orang mukmin laki-laki dan perempuan. Sesungguhnya Engkau dzat Yang Maha Kuasa atas segala-galanya.\n" +
                "\n" +
                "Maha suci Engkau, Tuhan segala kemuliaan. Suci dari segala apa yang dikatakan oleh orang-orang kafir. Semoga kesejahteraan atas para Rasul dan segala puji bagi Allah Tuhan seru sekalian alam.\""));
       doaArrayList.add(new Doa("Do'a Sebelum Makan","اَللَّهُمَّ بَارِكْ لَنَا فِيْمَا رَزَقْتَنَا وَقِنَا عَذَابَ النَّارِ","Ya Allah, berkahilah kami dalam rezeki yang telah Engkau berikan kepada kami dan peliharalah kami dari siksa api neraka"));
       doaArrayList.add(new Doa("Do'a Setelah Makan","اَلْحَمْدُ ِللهِ الَّذِىْ اَطْعَمَنَا وَسَقَانَا وَجَعَلَنَا مُسْلِمِيْن","Segala puji bagi Allah yang telah memberi makan kami dan minuman kami, serta menjadikan kami sebagai orang-orang islam"));
       doaArrayList.add(new Doa("Do'a Sebelum Tidur","بِسْمِكَ اللّٰهُمَّ اَحْيَا وَاَمُوْتُ","Dengan menyebut nama-Mu ya Allah, aku hidup dan aku mati"));
       doaArrayList.add(new Doa("Do'a Mimpi Buruk","اَللّٰهُمَّ إِنّىِ أَعُوْذُ بِكَ مِنْ عَمَلِ الشَّيْطَانِ وَسَيِّئاَتِ اْلأَحْلاَمِ","Ya Allah, sesungguhnya aku mohon perlindungan kepada Engkau dari perbuatan setan dan dari mimpi-mimpi yang buruk"));
       doaArrayList.add(new Doa("Do'a Mimpi Baik","اَلْحَمْدُ ِللهِ الَّذِيْ قَطْلَ الْحَاجَتِ","Segala puji bagi Allah yang telah memberi hajatku"));
       doaArrayList.add(new Doa("Do'a Bangun Tidur","اَلْحَمْدُ ِللهِ الَّذِىْ اَحْيَانَا بَعْدَمَآ اَمَاتَنَا وَاِلَيْهِ النُّشُوْرُ","Segala puji bagi Allah yang telah menghidupkan kami sesudah kami mati (membangunkan dari tidur) dan hanya kepada-Nya kami dikembalikan"));
       doaArrayList.add(new Doa("Do'a Masuk WC","اَللّٰهُمَّ اِنّىْ اَعُوْذُبِكَ مِنَ الْخُبُثِ وَالْخَبَآئِثِ","Ya Allah, aku berlindung pada-Mu dari godaan syetan  laki-laki dan syetan perempuan"));
       doaArrayList.add(new Doa("Do'a Istinja'","اَللّٰهُمَّ طَهِّرُ قَلْبِىْ مِنَ النِّفَاقِ وَحَصِّنْ فَرْخِىْ مِنَ الْفَوَاحِشِ","Wahai Tuhanku, sucikanlah hatiku dari sifat kepura-puraan (munafiq) serta peliharalah kemaluanku dari perbuatan keji"));
       doaArrayList.add(new Doa("Do'a Keluar WC","غُفْرَانَكَ الْحَمْدُ ِللهِ الَّذِىْ اَذْهَبَ عَنّى اْلاَذَى وَعَافَانِىْ","Dengan mengharap ampunanMu, segala puji milik Allah yang telah menghilangkan kotoran dari badanku dan yang telah menyejahterakan"));
       doaArrayList.add(new Doa("Do'a Bercermin","اَلْحَمْدُ ِللهِ كَمَا حَسَّنْتَ خَلْقِىْ  فَحَسِّـنْ خُلُقِىْ","Segala puji bagi Allah, baguskanlah budi pekertiku sebagaimana Engkau telah membaguskan rupa wajahku"));
       doaArrayList.add(new Doa("Do'a Masuk Rumah","اَللّٰهُمَّ اِنّىْ اَسْأَلُكَ خَيْرَالْمَوْلِجِ وَخَيْرَالْمَخْرَجِ بِسْمِ اللهِ وَلَجْنَا وَبِسْمِ اللهِ خَرَجْنَا وَعَلَى اللهِ رَبّنَا تَوَكَّلْنَا","Ya Allah, sesungguhnya aku mohon kepada-Mu baiknya tempat masuk dan baiknya tempat keluar dengan menyebut nama Allah kami masuk, dan dengan menyebut nama Allah kami keluar dan kepada Allah Tuhan kami, kami bertawakkal"));
       doaArrayList.add(new Doa("Do'a Keluar Rumah","بِسْمِ اللهِ تَوَكَّلْتُ عَلَى اللهِ لاَحَوْلَ وَلاَقُوَّةَ اِلاَّ بِالله","Dengan menyebut nama Allah aku bertawakal kepada Allah, tiada daya kekuatan melainkan dengan pertologan Allah"));
       doaArrayList.add(new Doa("Do'a Bepergian","اَللّٰهُمَّ هَوِّنْ عَلَيْنَا سَفَرَنَا هَذَا وَاطْوِعَنَّابُعْدَهُ اَللّٰهُمَّ اَنْتَ الصَّاحِبُ فِى السَّفَرِوَالْخَلِيْفَةُفِى الْاَهْلِ","Ya Allah, mudahkanlah kami berpergian ini, dan dekatkanlah kejauhannya. Ya Allah yang menemani dalam berpergian, dan Engkau pula yang melindungi keluarga"));
       doaArrayList.add(new Doa("Do'a Naik Kapal","بِسْمِ اللهِ مَجْرَهَا وَمُرْسَهَآاِنَّ رَبِّىْ لَغَفُوْرٌرَّحِيْمٌ","Dengan nama Allah yang menjalankan kendaraan ini berlayar dan berlabuh, sesungguhnya Tuhanku benar-benar Maha Pengampun lagi Maha Penyayang"));
       doaArrayList.add(new Doa("Do'a Masuk Masjid","اَللّٰهُمَّ افْتَحْ لِيْ اَبْوَابَ رَحْمَتِكَ","Ya Allah, bukalah untukku pintu-pintu rahmat-Mu"));



        adapter = new DoaAdapter(doaArrayList,getActivity(),FragmentKumpulanDoa.this);
        doaRecycler.setAdapter(adapter);
    }

    @Override
    public void setOnClick(int position) {
        FragmentDetailDoa fragmentDetailDoa = new FragmentDetailDoa();
        Bundle bundle = new Bundle();
        bundle.putString("title",doaArrayList.get(position).getTitle());
        bundle.putString("ayat", doaArrayList.get(position).getAyat());
        bundle.putString("arti",doaArrayList.get(position).getArti());
        fragmentDetailDoa.setArguments(bundle);
        getActivity().getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container,fragmentDetailDoa)
                .addToBackStack(null)
                .commit();

    }
}

package com.example.kira.comflu2018;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class DummyFragment extends Fragment {
    private View view;

    private String title;//String for tab title

    private static RecyclerView recyclerView;
    ArrayList<CardData> arrayList = new ArrayList<>();

    public DummyFragment() {
    }

    public DummyFragment(String title) {
        this.title = title;//Setting tab title
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.dummy_fragment, container, false);

        setRecyclerView();
    setArrayList(arrayList);

        return view;

    }
    //Setting recycler view
    private void setRecyclerView() {

        recyclerView = (RecyclerView) view
                .findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager mlinearLayoutManager = new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false);

        recyclerView
                .setLayoutManager(mlinearLayoutManager);//Linear Items

        recyclerView.addItemDecoration(new DividerItemDecoration(getActivity(),DividerItemDecoration.VERTICAL));





//        for (int i = 0; i < 20; i++) {
//            arrayList.add(title+" Items " + i);//Adding items to recycler view
//        }
//        RecyclerView_Adapter adapter = new RecyclerView_Adapter(getActivity(), arrayList);
//        recyclerView.setAdapter(adapter);// set adapter on recyclerview


    }

    public void setArrayList(ArrayList<CardData> arrayList) {

        CardData data = new CardData("NanoMaterials", "14:00PM", "Kurmi [1 Hour 20 Minutes]", "Keynote", true);
        arrayList.add(data);

        data = new CardData("Soft Matter in Industry", "14:00PM", "Kurmi [1 Hour 20 Minutes]", "Keynote", true);
        arrayList.add(data);

        data = new CardData("Soft Matter in Industry", "10:30AM", "Kurmi", "Keynote", true);
        arrayList.add(data);
        arrayList.add(data);

        data = new CardData("PHYSICS", "10:30AM", "Kurmi", "Let's go fishing with John and others. We will do some barbecue and have soo \n" +
                "                 much fun\"", false);
        arrayList.add(data);
        data = new CardData("PHYSICS", "10:30AM", "Kurmi", "Let's go fishing with John and others. We will do some barbecue and have soo \n" +
                "                 much fun\"", false);
        arrayList.add(data);
        data = new CardData("PHYSICS", "10:30AM", "Kurmi", "Let's go fishing with John and others. We will do some barbecue and have soo \n" +
                "                 much fun\"", false);
        arrayList.add(data);
        data = new CardData("PHYSICS", "10:30AM", "Kurmi", "Let's go fishing with John and others. We will do some barbecue and have soo \n" +
                "                 much fun\"", false);
        arrayList.add(data);
        data = new CardData("PHYSICS", "10:30AM", "Kurmi", "Let's go fishing with John and others. We will do some barbecue and have soo \n" +
                "                 much fun\"", false);
        arrayList.add(data);
        data = new CardData("PHYSICS", "10:30AM", "Kurmi", "Let's go fishing with John and others. We will do some barbecue and have soo \n" +
                "                 much fun\"", false);
        arrayList.add(data);
        data = new CardData("PHYSICS", "10:30AM", "Kurmi", "Let's go fishing with John and others. We will do some barbecue and have soo \n" +
                "                 much fun\"", false);
        arrayList.add(data);
        data = new CardData("PHYSICS", "10:30AM", "Kurmi", "Let's go fishing with John and others. We will do some barbecue and have soo \n" +
                "                 much fun\"", false);
        arrayList.add(data);
        data = new CardData("PHYSICS", "10:30AM", "Kurmi", "Let's go fishing with John and others. We will do some barbecue and have soo \n" +
                "                 much fun\"", false);
        arrayList.add(data);
        data = new CardData("PHYSICS", "10:30AM", "Kurmi", "Let's go fishing with John and others. We will do some barbecue and have soo \n" +
                "                 much fun\"", false);
        arrayList.add(data);
        data = new CardData("PHYSICS", "10:30AM", "Kurmi", "Let's go fishing with John and others. We will do some barbecue and have soo \n" +
                "                 much fun\"", false);
        arrayList.add(data);
        data = new CardData("PHYSICS", "10:30AM", "Kurmi", "Let's go fishing with John and others. We will do some barbecue and have soo \n" +
                "                 much fun\"", false);
        arrayList.add(data);
        data = new CardData("PHYSICS", "10:30AM", "Kurmi", "Let's go fishing with John and others. We will do some barbecue and have soo \n" +
                "                 much fun\"", false);
        arrayList.add(data);
        data = new CardData("PHYSICS", "10:30AM", "Kurmi", "Let's go fishing with John and others. We will do some barbecue and have soo \n" +
                "                 much fun\"", false);
        arrayList.add(data);
        data = new CardData("PHYSICS", "10:30AM", "Kurmi", "Let's go fishing with John and others. We will do some barbecue and have soo \n" +
                "                 much fun\"", false);
        arrayList.add(data);
        data = new CardData("PHYSICS", "10:30AM", "Kurmi", "Let's go fishing with John and others. We will do some barbecue and have soo \n" +
                "                 much fun\"", false);
        arrayList.add(data);
        data = new CardData("PHYSICS", "10:30AM", "Kurmi", "Let's go fishing with John and others. We will do some barbecue and have soo \n" +
                "                 much fun\"", false);
        arrayList.add(data);
        data = new CardData("PHYSICS", "10:30AM", "Kurmi", "Let's go fishing with John and others. We will do some barbecue and have soo \n" +
                "                 much fun\"", false);
        arrayList.add(data);
        data = new CardData("PHYSICS", "10:30AM", "Kurmi", "Let's go fishing with John and others. We will do some barbecue and have soo \n" +
                "                 much fun\"", false);
        arrayList.add(data);
        data = new CardData("PHYSICS", "10:30AM", "Kurmi", "Let's go fishing with John and others. We will do some barbecue and have soo \n" +
                "                 much fun\"", false);
        arrayList.add(data);
        data = new CardData("PHYSICS", "10:30AM", "Kurmi", "Let's go fishing with John and others. We will do some barbecue and have soo \n" +
                "                 much fun\"", false);
        arrayList.add(data);

        LectureAdapter adapter = new LectureAdapter(arrayList, getActivity());
        recyclerView.setAdapter(adapter);

        RecyclerSectionItemDecoration sectionItemDecoration = new RecyclerSectionItemDecoration(getResources().getDimensionPixelSize(R.dimen.recycler_section_header_height), true, getSectionCallback(arrayList));
        recyclerView.addItemDecoration(sectionItemDecoration);



    }

    private RecyclerSectionItemDecoration.SectionCallback getSectionCallback(final List<CardData> data) {
        return new RecyclerSectionItemDecoration.SectionCallback() {
            @Override
            public boolean isSection(int position) {
                return position == 0 || !data.get(position).getLecture_time().isEmpty();
            }

            @Override
            public String getSectionHeader(int position) {
                return data.get(position).getLecture_time();
            }
        };
    }
}
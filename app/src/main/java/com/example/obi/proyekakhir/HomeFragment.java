package com.example.obi.proyekakhir;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import com.example.obi.proyekakhir._sliders.FragmentSlider;
import com.example.obi.proyekakhir._sliders.SliderIndicator;
import com.example.obi.proyekakhir._sliders.SliderPagerAdapter;
import com.example.obi.proyekakhir._sliders.SliderView;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    private SliderPagerAdapter mAdapter;
    private SliderIndicator mIndicator;

    private SliderView sliderView;
    private LinearLayout mLinearLayout;
    private RelativeLayout menu1;
    private RelativeLayout menu2;
    private RelativeLayout menu3;
    private RelativeLayout menu4;
    private RelativeLayout menu5;
    private RelativeLayout menu6;


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        // Inflate the layout for this fragment
        sliderView = (SliderView) rootView.findViewById(R.id.sliderView);
        mLinearLayout = (LinearLayout) rootView.findViewById(R.id.pagesContainer);
        menu1 = (RelativeLayout) rootView.findViewById(R.id.menu1);

        menu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Klik me", Toast.LENGTH_SHORT).show();

                Intent goPindah = new Intent(getActivity(),WisataActivity.class);
                startActivity(goPindah);

            }
        });

        menu2 = (RelativeLayout) rootView.findViewById(R.id.menu2);

        menu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Klik me", Toast.LENGTH_SHORT).show();

                Intent goPindah = new Intent(getActivity(),HolidayBudget.class);
                startActivity(goPindah);

            }
        });

        menu3 = (RelativeLayout) rootView.findViewById(R.id.menu3);

        menu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Klik me", Toast.LENGTH_SHORT).show();

                Intent goPindah = new Intent(getActivity(),About.class);
                startActivity(goPindah);

            }
        });

        menu4 = (RelativeLayout) rootView.findViewById(R.id.menu4);

        menu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Klik me", Toast.LENGTH_SHORT).show();

                Intent goPindah = new Intent(getActivity(),MapsActivity.class);
                startActivity(goPindah);

            }
        });


        setupSliderOfline();

        return rootView;
    }

    private void setupSlider() {
        sliderView.setDurationScroll(800);
        List<Fragment> fragments = new ArrayList<>();
        fragments.add(FragmentSlider.newInstance("https://drive.google.com/drive/my-drive/image_slider_1.jpg"));
        fragments.add(FragmentSlider.newInstance("https://drive.google.com/drive/my-drive/rsz_kawah-putih-tinggi-raja-2jpg-gmpy_961x641.jpg"));
        fragments.add(FragmentSlider.newInstance("https://drive.google.com/drive/my-drive/rsz_situ-cileunca_962x482.jpg"));
        fragments.add(FragmentSlider.newInstance("https://drive.google.com/drive/my-drive/rsz_5_962x541_960x540.jpg"));
        fragments.add(FragmentSlider.newInstance("https://drive.google.com/drive/my-drive/rsz_danau_ciwidey_patenggang_bandung.jpg"));

        mAdapter = new SliderPagerAdapter(getFragmentManager(),fragments);
        sliderView.setAdapter(mAdapter);
        mIndicator = new SliderIndicator(getActivity(), mLinearLayout, sliderView, R.drawable.indicator_circle);
        mIndicator.setPageCount(fragments.size());
        mIndicator.show();
    }

    private void setupSliderOfline() {
        sliderView.setDurationScroll (800);
        List<Fragment> fragments = new ArrayList<>();
        fragments.add(FragmentSlider.newInstance("image_slider_1"));
        fragments.add(FragmentSlider.newInstance("image_slider_2"));
        fragments.add(FragmentSlider.newInstance("image_slider_3"));
        fragments.add(FragmentSlider.newInstance("image_slider_4"));
        fragments.add(FragmentSlider.newInstance("image_slider_5"));

        mAdapter = new SliderPagerAdapter(getFragmentManager(), fragments);
        sliderView.setAdapter(mAdapter);
        mIndicator = new SliderIndicator(getActivity(), mLinearLayout, sliderView, R.drawable.indicator_circle);
        mIndicator.setPageCount(fragments.size());
        mIndicator.show();
    }
}

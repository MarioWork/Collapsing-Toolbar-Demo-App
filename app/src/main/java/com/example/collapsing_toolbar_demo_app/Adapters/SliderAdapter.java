package com.example.collapsing_toolbar_demo_app.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.collapsing_toolbar_demo_app.databinding.SliderItemBinding;
import com.smarteist.autoimageslider.SliderViewAdapter;

public class SliderAdapter extends SliderViewAdapter<SliderAdapter.VH> {

    private int[] locationsImages;

    //Constructor
    public SliderAdapter(int[] locationsImages) {
        this.locationsImages = locationsImages;
    }

    @Override
    public VH onCreateViewHolder(ViewGroup parent) {
        return new VH(SliderItemBinding
                .inflate(LayoutInflater
                        .from(parent.getContext()), parent, false));

    }

    @Override
    public void onBindViewHolder(VH viewHolder, int position) {
        viewHolder.binding.imageView.setImageResource(locationsImages[position]);
    }

    @Override
    public int getCount() {
        return locationsImages.length;
    }

    //ViewHolder Class
    public class VH extends SliderViewAdapter.ViewHolder {

        private SliderItemBinding binding;

        public VH(SliderItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}

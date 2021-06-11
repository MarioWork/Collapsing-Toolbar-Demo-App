package com.example.collapsing_toolbar_demo_app.Adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.collapsing_toolbar_demo_app.databinding.ListItemBinding;

public class LocationsListAdapter extends RecyclerView.Adapter<LocationsListAdapter.VH> {

    private String[] locations;


    //Constructor
    public LocationsListAdapter(String[] locations) {
        this.locations = locations;
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new VH(ListItemBinding
                .inflate(LayoutInflater
                        .from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull LocationsListAdapter.VH holder, int position) {
        holder.binding.text.setText(locations[position]);
    }

    @Override
    public int getItemCount() {
        return locations.length;
    }

    //ViewHolder Class
    public class VH extends RecyclerView.ViewHolder {

        private ListItemBinding binding;

        public VH(@NonNull ListItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}

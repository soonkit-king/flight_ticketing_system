package my.utem.ftmk.flightticketingsystem;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

import adapter.FlightAdapter;
import model.Flight;

public class BookFlight extends Fragment {

    RecyclerView recyclerView;
    FlightAdapter flightAdapter;
    private List<Flight> flightList;

    public BookFlight() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_book_flight, container, false);

        // Initialize RecyclerView
        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        // Load Flights
        loadFlights();


        // Set Adapter
        flightAdapter = new FlightAdapter(getContext(),flightList);
        recyclerView.setAdapter(flightAdapter);

        return view;
    }

    private void loadFlights() {
        flightList = new ArrayList<>();
        flightList.add(new Flight("Kuala Lumpur (KUL) ", "Kota Bharu (KBD)", "14:50", "18:50" , "5h 12m" , "RM233 / pax"));
        flightList.add(new Flight("Kuala Lumpur (KUL) ", "Kota Bharu (KBD)", "14:50", "18:50" , "5h 12m" , "RM233 / pax"));
        flightList.add(new Flight("Kuala Lumpur (KUL) ", "Kota Bharu (KBD)", "14:50", "18:50" , "5h 12m" , "RM233 / pax"));
        flightList.add(new Flight("Kuala Lumpur (KUL) ", "Kota Bharu (KBD)", "14:50", "18:50" , "5h 12m" , "RM233 / pax"));
    }

}

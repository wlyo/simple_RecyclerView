package com.wlyd.project_recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerViewAdapter mAdapter;
    private List<Product> productList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.RecyclerView);

        mAdapter = new RecyclerViewAdapter(productList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setAdapter(mAdapter);

        initializeData();
    }

    private void initializeData() {

        Product product = new Product("Product 1", "Description :  Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "10 euros");
        productList.add(product);

        product = new Product("Product 2", "Description :  Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "20 euros");
        productList.add(product);

        product = new Product("Product 3", "Description :  Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "30 euros");
        productList.add(product);

        product = new Product("Product 4", "Description :  Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "40 euros");
        productList.add(product);

        product = new Product("Product 5", "Description :  Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "50 euros");
        productList.add(product);

        product = new Product("Product 6", "Description :  Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "60 euros");
        productList.add(product);

        product = new Product("Product 7", "Description :  Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "70 euros");
        productList.add(product);

        product = new Product("Product 8", "Description :  Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "80 euros");
        productList.add(product);

        product = new Product("Product 9", "Description :  Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "90 euros");
        productList.add(product);

        product = new Product("Product 10", "Description :  Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "100 euros");
        productList.add(product);

        product = new Product("Product 11", "Description :  Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "110 euros");
        productList.add(product);

        product = new Product("Product 12", "Description :  Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "120 euros");
        productList.add(product);

        product = new Product("Product 13", "Description :  Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "130 euros");
        productList.add(product);

        product = new Product("Product 14", "Description :  Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "140 euros");
        productList.add(product);

        product = new Product("Product 15", "Description :  Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "150 euros");
        productList.add(product);

        product = new Product("Product 16", "Description :  Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "160 euros");
        productList.add(product);

        product = new Product("Product 17", "Description :  Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "170 euros");
        productList.add(product);

        product = new Product("Product 18", "Description :  Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "180 euros");
        productList.add(product);

        product = new Product("Product 19", "Description :  Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "190 euros");
        productList.add(product);

        product = new Product("Product 20", "Description :  Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "200 euros");
        productList.add(product);

        product = new Product("Product 30", "Description :  Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "300 euros");
        productList.add(product);

        product = new Product("Product 40", "Description :  Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "400 euros");
        productList.add(product);

        product = new Product("Product 50", "Description :  Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "500 euros");
        productList.add(product);

        product = new Product("Product 60", "Description :  Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "600 euros");
        productList.add(product);

        product = new Product("Product 70", "Description :  Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "700 euros");
        productList.add(product);

        product = new Product("Product 80", "Description :  Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "800 euros");
        productList.add(product);

        product = new Product("Product 90", "Description :  Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "900 euros");
        productList.add(product);

        product = new Product("Product 100", "Description :  Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "1000 euros");
        productList.add(product);

        product = new Product("Product 110", "Description :  Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "1100 euros");
        productList.add(product);

        product = new Product("Product 120", "Description :  Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "1200 euros");
        productList.add(product);

    }
}

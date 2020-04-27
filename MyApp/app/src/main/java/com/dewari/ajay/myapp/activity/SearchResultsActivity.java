package com.dewari.ajay.myapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.dewari.ajay.myapp.model.Item;
import com.dewari.ajay.myapp.model.SearchResult;
import com.dewari.ajay.myapp.networkcall.GetSearchResultService;
import com.dewari.ajay.myapp.networkcall.RetrofitClientInstance;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.dewari.ajay.myapp.networkcall.RetrofitClientInstance.API_KEY;
import static com.dewari.ajay.myapp.networkcall.RetrofitClientInstance.CX;

public class SearchResultsActivity extends AppCompatActivity {

    public SearchResultsActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_results);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        handleIntent(getIntent());
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        handleIntent(intent);
    }

    private void handleIntent(Intent intent) {
        if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
            requestSearchQuery(intent.getStringExtra(SearchManager.QUERY));
        }
    }

    private void requestSearchQuery(String query) {
        final ProgressDialog progressDialog = new ProgressDialog(SearchResultsActivity.this);
        progressDialog.setMessage("Loading....");
        progressDialog.show();
        GetSearchResultService service = RetrofitClientInstance.getRetrofitInstance().create(GetSearchResultService.class);
        Call<SearchResult> call = service.getSearchResults(query, CX, API_KEY);
        call.enqueue(new Callback<SearchResult>() {
            @Override
            public void onResponse(Call<SearchResult> call, Response<SearchResult> response) {
                progressDialog.dismiss();
                if (response.isSuccessful()) {
                    displayResultItems(response.body());
                } else {
                    Toast.makeText(SearchResultsActivity.this, response.message(), Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<SearchResult> call, Throwable t) {
                progressDialog.dismiss();
                Toast.makeText(SearchResultsActivity.this, "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void displayResultItems(SearchResult searchResults) {
        List<Item> searchedItems = searchResults.getItems();
        if (null != searchedItems && !searchedItems.isEmpty()) {
            SearchResultAdapter searchResultAdapter = new SearchResultAdapter(searchedItems);
            RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(SearchResultsActivity.this);
            RecyclerView resultItemsRecyclerView = findViewById(R.id.result_items_recyclerView);
            resultItemsRecyclerView.setLayoutManager(layoutManager);
            resultItemsRecyclerView.setAdapter(searchResultAdapter);
            initOnItemClickListener(searchResultAdapter);
        }
    }

    private void initOnItemClickListener(SearchResultAdapter searchResultAdapter) {
        searchResultAdapter.setOnItemClickListener(new SearchResultAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Item item) {
//                openDetailResultActivity(item);
            }
        });
    }
}

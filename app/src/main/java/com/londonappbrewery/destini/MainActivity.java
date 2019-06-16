package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView mstoryTextVIew;
    private Button mTopBtn;
    private Button mBottomBtn;
    private int mIndex = 1 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
            mstoryTextVIew = (TextView)findViewById(R.id.storyTextView);
            mTopBtn = (Button)findViewById(R.id.buttonTop);
            mBottomBtn = (Button)findViewById(R.id.buttonBottom);

            mTopBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (mIndex==1) {
                        mstoryTextVIew.setText(R.string.T3_Story);
                        mTopBtn.setText(R.string.T3_Ans1);
                        mBottomBtn.setText(R.string.T3_Ans2);
                        mIndex=3;
                    }
                    else if(mIndex==3){
                        mstoryTextVIew.setText(R.string.T6_End);
                        mTopBtn.setVisibility(view.GONE);
                        mBottomBtn.setVisibility(view.GONE);
                    }

                    else if(mIndex ==2){
                        mstoryTextVIew.setText(R.string.T3_Story);
                        mTopBtn.setText(R.string.T3_Ans1);
                        mBottomBtn.setText(R.string.T3_Ans2);
                        mIndex=3;

                    }
                }
            });

            mBottomBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if (mIndex == 1) {
                        mstoryTextVIew.setText(R.string.T2_Story);
                        mTopBtn.setText(R.string.T2_Ans1);
                        mBottomBtn.setText(R.string.T2_Ans2);
                        mIndex=2;
                    }
                    else if(mIndex == 3){
                        mstoryTextVIew.setText(R.string.T5_End);
                        mTopBtn.setVisibility(view.GONE);
                        mBottomBtn.setVisibility(view.GONE);

                    }
                    else if(mIndex == 2){
                        mstoryTextVIew.setText(R.string.T4_End);
                        mTopBtn.setVisibility(view.GONE);
                        mBottomBtn.setVisibility(view.GONE);
                    }
                }
            });

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:




        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:


    }
}

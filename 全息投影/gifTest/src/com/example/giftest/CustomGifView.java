package com.example.giftest;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Movie;
import android.util.AttributeSet;
import android.view.View;

public	class CustomGifView extends View {  
	private Movie mMovie;   
    private long mMovieStart;  
	
		        public CustomGifView(Context context ,AttributeSet attrs) {   
		            super(context);   
		            mMovie = Movie.decodeStream(getResources().openRawResource(   
		                    R.drawable.gif));  
		        }   
		           
		        public void onDraw(Canvas canvas) {  
		            long now = android.os.SystemClock.uptimeMillis();   
		               
		            if (mMovieStart == 0) { // first time   
		                mMovieStart = now;   
		            }   
		            if (mMovie != null) {   
		                   
		                int dur = mMovie.duration();   
		                if (dur == 0) {   
		                    dur = 1000;   
		                }  
		                int relTime = (int) ((now - mMovieStart) % dur);                  
		                mMovie.setTime(relTime);
		               // canvas.rotate(90);
		                mMovie.draw(canvas, 0, 0);
		                invalidate();   
		            }   
		        }  
		    }  
	
/**
 * RippleExpandableLayout created by
 * @author Alessandro Muzzi
 * 
 * It's authorized copying, modifying, improvement.
 */

package it.muzzialessandro.rippleexpandablelayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class RippleExpLayout extends LinearLayout{

	private RippleView ripple;
	private LinearLayout linLayout;
	public static boolean pass= true;
	private Context context;
	private String rpRxp_text;
	private int rpRxp_textSize;
	private boolean rpRxp_bold;
	private boolean rpRxp_italic;
	private int rpRxp_textColor;
	private int rpRxp_bgColor;
	private int rpRxp_imgSrc;
	private int rpRxp_layout_width;
	private int rpRxp_layout_height;
	private boolean isOpened;
	private boolean isLoadingComplete;

	public RippleExpLayout(Context context) {
		super(context);
		this.context= context;
		ripple= new RippleView(this, context);
	}

	public RippleExpLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
		this.context= context;
		ripple= new RippleView(this,context, attrs);
		init(attrs);
	}

	public RippleExpLayout(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		this.context= context;
		ripple= new RippleView(this,context, attrs, defStyle);
		init(attrs);
	}
	
	private void init(AttributeSet attrs) { 
		if (isInEditMode())
			return;
		
		this.setOrientation(LinearLayout.VERTICAL);
		isOpened= false;
		isLoadingComplete= false;
		
		// getting attributes
	    TypedArray typedArray=getContext().obtainStyledAttributes(attrs,R.styleable.RippleExpLayout);
	    rpRxp_text= typedArray.getString(R.styleable.RippleExpLayout_rpRxp_text);
	    rpRxp_textSize= typedArray.getInt(R.styleable.RippleExpLayout_rpRxp_textSize,28);
	    rpRxp_textColor= typedArray.getColor(R.styleable.RippleExpLayout_rpRxp_textColor,Color.BLACK);
	    rpRxp_bold= typedArray.getBoolean(R.styleable.RippleExpLayout_rpRxp_bold,false);
	    rpRxp_italic= typedArray.getBoolean(R.styleable.RippleExpLayout_rpRxp_italic,false);
	    rpRxp_bgColor= typedArray.getColor(R.styleable.RippleExpLayout_rpRxp_bgColor,Color.TRANSPARENT);
	    rpRxp_imgSrc= typedArray.getResourceId(R.styleable.RippleExpLayout_rpRxp_imgSrc, 0);
	    rpRxp_layout_width= (int)TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, typedArray.getDimensionPixelSize(R.styleable.RippleExpLayout_rpRxp_layout_width, 200), getResources().getDisplayMetrics());
	    rpRxp_layout_height= (int)TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, typedArray.getDimensionPixelSize(R.styleable.RippleExpLayout_rpRxp_layout_height, 50),getResources().getDisplayMetrics());
	    
	    // composing the button and adding it to the widget
	    ripple.compose();
		typedArray.recycle();
		addView(ripple);
		
		linLayout= new LinearLayout(context);
		linLayout.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT));
		linLayout.setVisibility(RelativeLayout.GONE);
		addView(linLayout);
		//addView(btn);
		isLoadingComplete= true;
	}
	
	@Override
	public void addView(View child, int index, ViewGroup.LayoutParams params) {
		if(isLoadingComplete)
			linLayout.addView(child);
		else
			super.addView(child, index, params);
	}
	
	public String getRpRxp_text() {
		return rpRxp_text;
	}

	public int getRpRxp_textSize() {
		return rpRxp_textSize;
	}

	public boolean isRpRxp_bold() {
		return rpRxp_bold;
	}

	public boolean isRpRxp_italic() {
		return rpRxp_italic;
	}

	public int getRpRxp_textColor() {
		return rpRxp_textColor;
	}

	public int getRpRxp_bgColor() {
		return rpRxp_bgColor;
	}

	public int getRpRxp_imgSrc() {
		return rpRxp_imgSrc;
	}

	public LinearLayout getLinLayout() {
		return linLayout;
	}

	public int getRpRxp_layout_width() {
		return rpRxp_layout_width;
	}

	public int getRpRxp_layout_height() {
		return rpRxp_layout_height;
	}

	public boolean isOpened() {
		return isOpened;
	}

	public void setOpened(boolean isOpened) {
		this.isOpened = isOpened;
	}

	public boolean isLoadingComplete() {
		return isLoadingComplete;
	}

	
}

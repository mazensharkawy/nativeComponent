package com.nativecomponent;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.res.ResourcesCompat;
import android.widget.ImageView;
import android.widget.TextView;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;

public class ReactImageManager extends SimpleViewManager<TextView> {

  public static final String REACT_CLASS = "REACTImageView";

  @Override
  public String getName() {
    return REACT_CLASS;
  }

  @Override
  public TextView createViewInstance(ThemedReactContext context) {
            TextView helloTextView = new TextView(context);
            helloTextView.setText("Hello It's Mazen");
            // ImageView image = new ImageView(context);
//            Resources res = getResources();
            // Drawable drawable = ContextCompat.getDrawable(context, R.drawable.mazen);
//            Drawable drawable = ResourcesCompat.getDrawable(res, R.drawable.mazen, null);
            // image.setImageDrawable(drawable);
    return helloTextView;
  }


  // @ReactProp(name = "src")
  // public void setSrc(ImageView view, @Nullable ReadableArray sources) {
  //   view.setImageResource(R.drawable.ic_launcher);
  // }

//   @ReactProp(name = "borderRadius", defaultFloat = 0f)
//   public void setBorderRadius(ImageView view, float borderRadius) {
//     view.setBorderRadius(borderRadius);
//   }

//   @ReactProp(name = ViewProps.RESIZE_MODE)
//   public void setResizeMode(ImageView view, @Nullable String resizeMode) {
//     view.setScaleType(ImageResizeMode.toScaleType(resizeMode));
//   }
}
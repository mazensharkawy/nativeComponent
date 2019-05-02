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
import com.blloc.bllocjavatiles;

public class ReactTextManager extends SimpleViewManager<BllocTilesView> {

  public static final String REACT_CLASS = "REACTTextView";

  @Override
  public String getName() {
    return REACT_CLASS;
  }

  @Override
  public BllocTilesView createViewInstance(ThemedReactContext context) {
            BllocTilesView bllocTilesView = new BllocTilesView();
    return bllocTilesView;
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
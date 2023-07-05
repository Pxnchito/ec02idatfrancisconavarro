// Generated by view binder compiler. Do not edit!
package com.francisco.navarrofrancisco02.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.francisco.navarrofrancisco02.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySplashScreenBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Guideline guidelineMediumHorizontal;

  @NonNull
  public final ImageView splashImage;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView textView2;

  private ActivitySplashScreenBinding(@NonNull ConstraintLayout rootView,
      @NonNull Guideline guidelineMediumHorizontal, @NonNull ImageView splashImage,
      @NonNull TextView textView, @NonNull TextView textView2) {
    this.rootView = rootView;
    this.guidelineMediumHorizontal = guidelineMediumHorizontal;
    this.splashImage = splashImage;
    this.textView = textView;
    this.textView2 = textView2;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySplashScreenBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySplashScreenBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_splash_screen, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySplashScreenBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.guideline_medium_horizontal;
      Guideline guidelineMediumHorizontal = ViewBindings.findChildViewById(rootView, id);
      if (guidelineMediumHorizontal == null) {
        break missingId;
      }

      id = R.id.splash_image;
      ImageView splashImage = ViewBindings.findChildViewById(rootView, id);
      if (splashImage == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      return new ActivitySplashScreenBinding((ConstraintLayout) rootView, guidelineMediumHorizontal,
          splashImage, textView, textView2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

// Generated by view binder compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityPicSearchBinding implements ViewBinding {
  @NonNull
  private final LinearLayoutCompat rootView;

  @NonNull
  public final Button buttonChoose;

  @NonNull
  public final Button buttonUpload;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final LinearLayoutCompat main;

  @NonNull
  public final View paddingView;

  @NonNull
  public final Toolbar searchBackHome;

  private ActivityPicSearchBinding(@NonNull LinearLayoutCompat rootView,
      @NonNull Button buttonChoose, @NonNull Button buttonUpload, @NonNull ImageView imageView,
      @NonNull LinearLayoutCompat main, @NonNull View paddingView,
      @NonNull Toolbar searchBackHome) {
    this.rootView = rootView;
    this.buttonChoose = buttonChoose;
    this.buttonUpload = buttonUpload;
    this.imageView = imageView;
    this.main = main;
    this.paddingView = paddingView;
    this.searchBackHome = searchBackHome;
  }

  @Override
  @NonNull
  public LinearLayoutCompat getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityPicSearchBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityPicSearchBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_pic_search, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityPicSearchBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonChoose;
      Button buttonChoose = ViewBindings.findChildViewById(rootView, id);
      if (buttonChoose == null) {
        break missingId;
      }

      id = R.id.buttonUpload;
      Button buttonUpload = ViewBindings.findChildViewById(rootView, id);
      if (buttonUpload == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      LinearLayoutCompat main = (LinearLayoutCompat) rootView;

      id = R.id.padding_view;
      View paddingView = ViewBindings.findChildViewById(rootView, id);
      if (paddingView == null) {
        break missingId;
      }

      id = R.id.search_back_home;
      Toolbar searchBackHome = ViewBindings.findChildViewById(rootView, id);
      if (searchBackHome == null) {
        break missingId;
      }

      return new ActivityPicSearchBinding((LinearLayoutCompat) rootView, buttonChoose, buttonUpload,
          imageView, main, paddingView, searchBackHome);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

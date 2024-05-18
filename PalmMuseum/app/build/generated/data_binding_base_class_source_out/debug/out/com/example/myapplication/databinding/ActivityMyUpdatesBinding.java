// Generated by view binder compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMyUpdatesBinding implements ViewBinding {
  @NonNull
  private final LinearLayoutCompat rootView;

  @NonNull
  public final LinearLayoutCompat main;

  @NonNull
  public final View paddingView;

  @NonNull
  public final RecyclerView recyclerView;

  @NonNull
  public final Toolbar updatesBackMine;

  private ActivityMyUpdatesBinding(@NonNull LinearLayoutCompat rootView,
      @NonNull LinearLayoutCompat main, @NonNull View paddingView,
      @NonNull RecyclerView recyclerView, @NonNull Toolbar updatesBackMine) {
    this.rootView = rootView;
    this.main = main;
    this.paddingView = paddingView;
    this.recyclerView = recyclerView;
    this.updatesBackMine = updatesBackMine;
  }

  @Override
  @NonNull
  public LinearLayoutCompat getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMyUpdatesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMyUpdatesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_my_updates, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMyUpdatesBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      LinearLayoutCompat main = (LinearLayoutCompat) rootView;

      id = R.id.padding_view;
      View paddingView = ViewBindings.findChildViewById(rootView, id);
      if (paddingView == null) {
        break missingId;
      }

      id = R.id.recyclerView;
      RecyclerView recyclerView = ViewBindings.findChildViewById(rootView, id);
      if (recyclerView == null) {
        break missingId;
      }

      id = R.id.updates_back_mine;
      Toolbar updatesBackMine = ViewBindings.findChildViewById(rootView, id);
      if (updatesBackMine == null) {
        break missingId;
      }

      return new ActivityMyUpdatesBinding((LinearLayoutCompat) rootView, main, paddingView,
          recyclerView, updatesBackMine);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

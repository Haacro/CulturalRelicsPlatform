// Generated by view binder compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class AntiquesListItemTesBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView imageUrl;

  @NonNull
  public final TextView museum;

  @NonNull
  public final TextView name;

  private AntiquesListItemTesBinding(@NonNull LinearLayout rootView, @NonNull ImageView imageUrl,
      @NonNull TextView museum, @NonNull TextView name) {
    this.rootView = rootView;
    this.imageUrl = imageUrl;
    this.museum = museum;
    this.name = name;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AntiquesListItemTesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AntiquesListItemTesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.antiques_list_item_tes, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AntiquesListItemTesBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageUrl;
      ImageView imageUrl = ViewBindings.findChildViewById(rootView, id);
      if (imageUrl == null) {
        break missingId;
      }

      id = R.id.museum;
      TextView museum = ViewBindings.findChildViewById(rootView, id);
      if (museum == null) {
        break missingId;
      }

      id = R.id.name;
      TextView name = ViewBindings.findChildViewById(rootView, id);
      if (name == null) {
        break missingId;
      }

      return new AntiquesListItemTesBinding((LinearLayout) rootView, imageUrl, museum, name);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

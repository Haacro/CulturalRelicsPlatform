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

public final class AntiqueListItemBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView authorName;

  @NonNull
  public final ImageView collect;

  @NonNull
  public final TextView date;

  @NonNull
  public final ImageView thumbnailPicS;

  @NonNull
  public final TextView title;

  private AntiqueListItemBinding(@NonNull LinearLayout rootView, @NonNull TextView authorName,
      @NonNull ImageView collect, @NonNull TextView date, @NonNull ImageView thumbnailPicS,
      @NonNull TextView title) {
    this.rootView = rootView;
    this.authorName = authorName;
    this.collect = collect;
    this.date = date;
    this.thumbnailPicS = thumbnailPicS;
    this.title = title;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AntiqueListItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AntiqueListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.antique_list_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AntiqueListItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.author_name;
      TextView authorName = ViewBindings.findChildViewById(rootView, id);
      if (authorName == null) {
        break missingId;
      }

      id = R.id.collect;
      ImageView collect = ViewBindings.findChildViewById(rootView, id);
      if (collect == null) {
        break missingId;
      }

      id = R.id.date;
      TextView date = ViewBindings.findChildViewById(rootView, id);
      if (date == null) {
        break missingId;
      }

      id = R.id.thumbnail_pic_s;
      ImageView thumbnailPicS = ViewBindings.findChildViewById(rootView, id);
      if (thumbnailPicS == null) {
        break missingId;
      }

      id = R.id.title;
      TextView title = ViewBindings.findChildViewById(rootView, id);
      if (title == null) {
        break missingId;
      }

      return new AntiqueListItemBinding((LinearLayout) rootView, authorName, collect, date,
          thumbnailPicS, title);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

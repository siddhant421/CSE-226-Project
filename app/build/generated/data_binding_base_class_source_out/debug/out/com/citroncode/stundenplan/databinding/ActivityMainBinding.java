// Generated by view binder compiler. Do not edit!
package com.citroncode.stundenplan.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.citroncode.stundenplan.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final FloatingActionButton fabEdit;

  @NonNull
  public final ImageView ivArrow;

  @NonNull
  public final RelativeLayout rlEmpty;

  @NonNull
  public final RelativeLayout rlFriday;

  @NonNull
  public final RelativeLayout rlMonday;

  @NonNull
  public final RelativeLayout rlNoContent;

  @NonNull
  public final RelativeLayout rlThursday;

  @NonNull
  public final LinearLayout rlTopBar;

  @NonNull
  public final RelativeLayout rlTuesday;

  @NonNull
  public final RelativeLayout rlWednesday;

  @NonNull
  public final RecyclerView rvTimetable;

  private ActivityMainBinding(@NonNull RelativeLayout rootView,
      @NonNull FloatingActionButton fabEdit, @NonNull ImageView ivArrow,
      @NonNull RelativeLayout rlEmpty, @NonNull RelativeLayout rlFriday,
      @NonNull RelativeLayout rlMonday, @NonNull RelativeLayout rlNoContent,
      @NonNull RelativeLayout rlThursday, @NonNull LinearLayout rlTopBar,
      @NonNull RelativeLayout rlTuesday, @NonNull RelativeLayout rlWednesday,
      @NonNull RecyclerView rvTimetable) {
    this.rootView = rootView;
    this.fabEdit = fabEdit;
    this.ivArrow = ivArrow;
    this.rlEmpty = rlEmpty;
    this.rlFriday = rlFriday;
    this.rlMonday = rlMonday;
    this.rlNoContent = rlNoContent;
    this.rlThursday = rlThursday;
    this.rlTopBar = rlTopBar;
    this.rlTuesday = rlTuesday;
    this.rlWednesday = rlWednesday;
    this.rvTimetable = rvTimetable;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.fab_edit;
      FloatingActionButton fabEdit = ViewBindings.findChildViewById(rootView, id);
      if (fabEdit == null) {
        break missingId;
      }

      id = R.id.iv_arrow;
      ImageView ivArrow = ViewBindings.findChildViewById(rootView, id);
      if (ivArrow == null) {
        break missingId;
      }

      id = R.id.rl_empty;
      RelativeLayout rlEmpty = ViewBindings.findChildViewById(rootView, id);
      if (rlEmpty == null) {
        break missingId;
      }

      id = R.id.rl_friday;
      RelativeLayout rlFriday = ViewBindings.findChildViewById(rootView, id);
      if (rlFriday == null) {
        break missingId;
      }

      id = R.id.rl_monday;
      RelativeLayout rlMonday = ViewBindings.findChildViewById(rootView, id);
      if (rlMonday == null) {
        break missingId;
      }

      id = R.id.rl_no_content;
      RelativeLayout rlNoContent = ViewBindings.findChildViewById(rootView, id);
      if (rlNoContent == null) {
        break missingId;
      }

      id = R.id.rl_thursday;
      RelativeLayout rlThursday = ViewBindings.findChildViewById(rootView, id);
      if (rlThursday == null) {
        break missingId;
      }

      id = R.id.rl_top_bar;
      LinearLayout rlTopBar = ViewBindings.findChildViewById(rootView, id);
      if (rlTopBar == null) {
        break missingId;
      }

      id = R.id.rl_tuesday;
      RelativeLayout rlTuesday = ViewBindings.findChildViewById(rootView, id);
      if (rlTuesday == null) {
        break missingId;
      }

      id = R.id.rl_wednesday;
      RelativeLayout rlWednesday = ViewBindings.findChildViewById(rootView, id);
      if (rlWednesday == null) {
        break missingId;
      }

      id = R.id.rv_timetable;
      RecyclerView rvTimetable = ViewBindings.findChildViewById(rootView, id);
      if (rvTimetable == null) {
        break missingId;
      }

      return new ActivityMainBinding((RelativeLayout) rootView, fabEdit, ivArrow, rlEmpty, rlFriday,
          rlMonday, rlNoContent, rlThursday, rlTopBar, rlTuesday, rlWednesday, rvTimetable);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

package com.spotify.legacyglue.gluelib.components.toolbar;

import android.view.MenuItem;
import android.view.View;
import p.nx40;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@Deprecated
public interface GlueToolbar extends nx40 {
    void addOverflowItem(MenuItem menuItem);

    void addView(ToolbarSide toolbarSide, View view, int i);

    void clear(ToolbarSide toolbarSide);

    View findView(int i);

    CharSequence getTitle();

    /* synthetic */ View getView();

    void setBackgroundColor(int i);

    void setSubtitle(CharSequence charSequence);

    void setTitle(CharSequence charSequence);

    void setTitleAlpha(float f);
}

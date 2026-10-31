package com.spotify.legacyglue.gluelib.components.toolbar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@Deprecated
public final class GlueToolbars {
    private GlueToolbars() {
    }

    public static GlueToolbar createGlueToolbar(Context context, ViewGroup viewGroup) {
        return createGlueToolbar((GlueToolbarLayout) LayoutInflater.from(context).inflate(2131625049, viewGroup, false));
    }

    public static GlueToolbar createGlueToolbar(GlueToolbarLayout glueToolbarLayout) {
        return new GlueToolbarImpl(glueToolbarLayout);
    }
}

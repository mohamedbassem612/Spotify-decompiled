package com.google.android.material.appbar;

import android.view.View;
import p.sh;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class c implements sh {
    public final /* synthetic */ AppBarLayout a;
    public final /* synthetic */ boolean b;

    public c(AppBarLayout appBarLayout, boolean z) {
        this.a = appBarLayout;
        this.b = z;
    }

    public final boolean r(View view) {
        this.a.setExpanded(this.b);
        return true;
    }
}

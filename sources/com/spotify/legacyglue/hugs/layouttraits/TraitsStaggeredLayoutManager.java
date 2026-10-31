package com.spotify.legacyglue.hugs.layouttraits;

import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import kotlin.Metadata;
import p.f611;
import p.n611;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/spotify/legacyglue/hugs/layouttraits/TraitsStaggeredLayoutManager;", "Landroidx/recyclerview/widget/StaggeredGridLayoutManager;", "src_main_java_com_spotify_legacyglue_hugs-hugs"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class TraitsStaggeredLayoutManager extends StaggeredGridLayoutManager {
    public final void g0(RecyclerView recyclerView) {
        recyclerView.j((f611) null);
        recyclerView.getAdapter();
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager
    public final void h0(RecyclerView recyclerView, n611 n611Var) {
        super.h0(recyclerView, n611Var);
        throw null;
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager
    public final void n0(RecyclerView recyclerView, int i, int i2) {
        h1(i, i2, 1);
        throw null;
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager
    public final void o0(RecyclerView recyclerView) {
        super.o0(recyclerView);
        throw null;
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager
    public final void p0(RecyclerView recyclerView, int i, int i2) {
        super.p0(recyclerView, i, i2);
        throw null;
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager
    public final void q0(RecyclerView recyclerView, int i, int i2) {
        h1(i, i2, 2);
        throw null;
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager
    public final void s0(RecyclerView recyclerView, int i, int i2, Object obj) {
        h1(i, i2, 4);
        throw null;
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager
    public final Parcelable x0() {
        H0(0);
        return null;
    }
}

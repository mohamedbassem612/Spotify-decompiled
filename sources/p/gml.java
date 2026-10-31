package p;

import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gml implements uaq0, p4h1 {
    public final bml a;
    public final boolean b;
    public final boolean c;
    public final ytp0 d;
    public final LinearLayout e;

    public gml(LayoutInflater layoutInflater, ViewGroup viewGroup, bml bmlVar, boolean z, boolean z2, ytp0 ytp0Var) {
        this.a = bmlVar;
        this.b = z;
        this.c = z2;
        this.d = ytp0Var;
        View viewInflate = layoutInflater.inflate(2131624464, viewGroup, false);
        RecyclerView recyclerViewT = m5n1.t(viewInflate, 2131430616);
        if (recyclerViewT == null) {
            bhn0.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(2131430616)));
            throw null;
        }
        int i = kgr0.T0;
        this.e = xyn1.z((FrameLayout) viewInflate);
        recyclerViewT.setClipToPadding(false);
        rwq0.s(recyclerViewT, zrj.S0);
        recyclerViewT.setAdapter(bmlVar);
        recyclerViewT.getContext();
        recyclerViewT.setLayoutManager(new LinearLayoutManager(1));
        SparseArray sparseArray = (SparseArray) bmlVar.h;
        sparseArray.put(2, new eg1(this, (byte) 5));
        sparseArray.put(3, new eg1(this, (byte) 6));
        sparseArray.put(4, new eg1(this, (byte) 3));
        sparseArray.put(5, new eg1(this, (byte) 4));
        sparseArray.put(1, new eg1(this, (byte) 1));
        sparseArray.put(7, new eg1(this, (byte) 0));
        sparseArray.put(8, new eg1(this, (byte) 2));
    }

    @Override // p.p4h1
    public final View a() {
        return this.e;
    }

    public final void b(String str) {
        this.d.b(str);
    }

    public final void c(String str) {
        this.d.c(str);
    }

    public final void d(String str) {
        this.d.d(str);
    }

    public final void e(String str) {
        this.d.e(str);
    }

    public final void f(String str) {
        this.d.f(str);
    }
}

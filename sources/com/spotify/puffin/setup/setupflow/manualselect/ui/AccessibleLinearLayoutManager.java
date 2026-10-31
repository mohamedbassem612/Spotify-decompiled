package com.spotify.puffin.setup.setupflow.manualselect.ui;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.a;
import kotlin.Metadata;
import p.jg;
import p.kg;
import p.n611;
import p.s611;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/spotify/puffin/setup/setupflow/manualselect/ui/AccessibleLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "src_main_java_com_spotify_puffin_setup_setupflow-setupflow"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AccessibleLinearLayoutManager extends LinearLayoutManager {
    public final int K(n611 n611Var, s611 s611Var) {
        if (q()) {
            return s611Var.b();
        }
        return 1;
    }

    public final int X(n611 n611Var, s611 s611Var) {
        if (r()) {
            return s611Var.b();
        }
        return 1;
    }

    public final void m0(n611 n611Var, s611 s611Var, View view, kg kgVar) {
        kgVar.n(jg.b(false, r() ? a.V(view) : 0, 1, q() ? a.V(view) : 0, 1));
    }
}

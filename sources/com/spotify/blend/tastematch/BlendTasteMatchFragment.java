package com.spotify.blend.tastematch;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import p.dg30;
import p.ees;
import p.ges;
import p.j8k1;
import p.k241;
import p.u890;
import p.yg30;
import p.zf30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/spotify/blend/tastematch/BlendTasteMatchFragment;", "Lp/zf30;", "Lp/j8k1;", "Lp/yg30;", "injector", "<init>", "(Lp/yg30;)V", "src_main_java_com_spotify_blend_tastematch-tastematch"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class BlendTasteMatchFragment extends zf30 implements j8k1 {
    public final yg30 F1;
    public k241 G1;
    public ees H1;
    public ges I1;

    public BlendTasteMatchFragment(yg30 yg30Var) {
        this.F1 = yg30Var;
    }

    public final void G0() {
        ((zf30) this).h1 = true;
        ges gesVar = this.I1;
        if (gesVar == null) {
            u890.C("pageLoaderView");
            throw null;
        }
        k241 k241Var = this.G1;
        if (k241Var == null) {
            u890.C("pageLoader");
            throw null;
        }
        gesVar.E(this, k241Var);
        k241 k241Var2 = this.G1;
        if (k241Var2 != null) {
            k241Var2.a();
        } else {
            u890.C("pageLoader");
            throw null;
        }
    }

    public final void H0() {
        ((zf30) this).h1 = true;
        k241 k241Var = this.G1;
        if (k241Var != null) {
            k241Var.b();
        } else {
            u890.C("pageLoader");
            throw null;
        }
    }

    @Override // p.j8k1
    public final void V() {
        dg30 dg30VarF0 = f0();
        if (dg30VarF0 != null) {
            dg30VarF0.finish();
        }
    }

    public final void v0(Context context) {
        super.v0(context);
        this.F1.f(this);
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ees eesVar = this.H1;
        if (eesVar == null) {
            u890.C("pageLoaderViewBuilder");
            throw null;
        }
        ges gesVarA = eesVar.a(P0());
        this.I1 = gesVarA;
        return gesVarA;
    }
}

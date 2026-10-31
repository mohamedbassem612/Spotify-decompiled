package com.spotify.blend.tastematch;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import p.ees;
import p.ges;
import p.iac0;
import p.u890;
import p.w7r0;
import p.yg30;
import p.zf30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/spotify/blend/tastematch/GroupBlendTasteMatchFragment;", "Lp/zf30;", "Lp/yg30;", "injector", "<init>", "(Lp/yg30;)V", "src_main_java_com_spotify_blend_tastematch-tastematch"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GroupBlendTasteMatchFragment extends zf30 {
    public final yg30 F1;
    public w7r0 G1;
    public ees H1;

    public GroupBlendTasteMatchFragment(yg30 yg30Var) {
        this.F1 = yg30Var;
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
        iac0 iac0VarN0 = n0();
        w7r0 w7r0Var = this.G1;
        if (w7r0Var != null) {
            gesVarA.E(iac0VarN0, w7r0Var.get());
            return gesVarA;
        }
        u890.C("pageLoaderScope");
        throw null;
    }
}

package p;

import android.content.Context;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class kjv implements rsw {
    public final /* synthetic */ iu30 a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ vu30 c;
    public final /* synthetic */ iu30 d;

    public kjv(iu30 iu30Var, iu30 iu30Var2, u841 u841Var, iu30 iu30Var3) {
        this.a = iu30Var;
        this.b = iu30Var2;
        this.c = u841Var;
        this.d = iu30Var3;
    }

    @Override // p.rsw
    public final isw a(Context context, ViewGroup viewGroup, lsw lswVar, iu30 iu30Var) {
        return new as0(this.a, viewGroup, iu30Var, lswVar, this.b, this.c, this.d);
    }
}

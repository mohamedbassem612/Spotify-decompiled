package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class trc1 implements sbb0 {
    public final /* synthetic */ c9n a;
    public final /* synthetic */ ven0 b;
    public final /* synthetic */ ven0 c;
    public final /* synthetic */ o860 d;
    public final /* synthetic */ kt91 e;
    public final /* synthetic */ Context f;
    public final /* synthetic */ tob1 g;

    public trc1(c9n c9nVar, ven0 ven0Var, ven0 ven0Var2, o860 o860Var, kt91 kt91Var, Context context, ven0 ven0Var3) {
        this.a = c9nVar;
        this.b = ven0Var;
        this.c = ven0Var2;
        this.d = o860Var;
        this.e = kt91Var;
        this.f = context;
        this.g = ven0Var3;
    }

    public final void a(String str) {
        this.b.setValue(str);
        this.c.setValue(Boolean.TRUE);
        fn31.T(this.a, (o8n) null, 0, new bj81((byte) 6, this.d, str, this.e, this.f, this.g, (lnm) null), 3);
    }
}

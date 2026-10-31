package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class bfc1 implements ya61 {
    public final /* synthetic */ cfc1 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ i4i1 d;
    public final /* synthetic */ i29 e;
    public final /* synthetic */ i29 f;

    public /* synthetic */ bfc1(cfc1 cfc1Var, String str, String str2, i4i1 i4i1Var, i29 i29Var, i29 i29Var2) {
        this.a = cfc1Var;
        this.b = str;
        this.c = str2;
        this.d = i4i1Var;
        this.e = i29Var;
        this.f = i29Var2;
    }

    @Override // p.ya61
    public final void a(bb61 bb61Var) {
        cfc1 cfc1Var = this.a;
        if (cfc1Var.b() == null) {
            return;
        }
        cfc1Var.B();
        cfc1Var.A(cfc1Var.C(this.b, this.c, this.d, this.e, this.f));
        cfc1Var.n();
        hjk1 hjk1Var = cfc1Var.f23p;
        hjk1Var.getClass();
        w8p1.m();
        Iterator it = hjk1Var.a.iterator();
        while (it.hasNext()) {
            hjk1Var.e((e4i1) it.next());
        }
    }
}

package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class r1i1 extends x7e0 {
    public final w1i1 d;
    public final h2i1 e;
    public final llm f;
    public xab1 g;
    public czb h;

    public r1i1(w1i1 w1i1Var, h2i1 h2i1Var) {
        this.d = w1i1Var;
        this.e = h2i1Var;
        fns fnsVar = igu.a;
        this.f = smo1.e(pyf0.a);
    }

    public final void e() {
        j();
        w1i1 w1i1Var = this.d;
        bzb bzbVar = null;
        if (!(w1i1Var instanceof u1i1)) {
            if (!(w1i1Var instanceof v1i1)) {
                eg.o();
                return;
            } else {
                v1i1 v1i1Var = (v1i1) w1i1Var;
                this.g = fn31.T(this.f, (o8n) null, 0, new vxg1(this, v1i1Var.a, v1i1Var.b, (lnm) null, (byte) 8), 3);
                return;
            }
        }
        c1i1 c1i1Var = ((u1i1) w1i1Var).a;
        String str = c1i1Var.b;
        String str2 = c1i1Var.c;
        azh1 azh1Var = c1i1Var.d;
        b1i1 b1i1Var = c1i1Var.e;
        String str3 = b1i1Var.a;
        String str4 = b1i1Var.b;
        if (str4 == null) {
            str4 = "";
        }
        bzb bzbVar2 = new bzb(str3, str4);
        b1i1 b1i1Var2 = c1i1Var.f;
        if (b1i1Var2 != null) {
            String str5 = b1i1Var2.a;
            String str6 = b1i1Var2.b;
            bzbVar = new bzb(str5, str6 != null ? str6 : "");
        }
        this.h = new czb(str, str2, azh1Var, bzbVar2, bzbVar, null);
        i();
    }

    public final void f() {
        xab1 xab1Var = this.g;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.g = null;
    }
}

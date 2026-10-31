package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/mj40;", "Lp/uim0;", "Lp/nj40;", "src_main_java_com_spotify_element_compose-compose"}, k = 1, mv = {2, 3, 0}, xi = 48)
final /* data */ class mj40 extends uim0 {
    public final nml a;
    public final iu30 b;
    public final iu30 c;

    public mj40(nml nmlVar, iu30 iu30Var, iu30 iu30Var2) {
        this.a = nmlVar;
        this.b = iu30Var;
        this.c = iu30Var2;
    }

    public final pim0 a() {
        nj40 nj40Var = new nj40();
        nj40Var.O0 = this.a;
        nj40Var.P0 = this.b;
        nj40Var.Q0 = this.c;
        return nj40Var;
    }

    public final void b(pim0 pim0Var) {
        nj40 nj40Var = (nj40) pim0Var;
        iu30 iu30Var = nj40Var.P0;
        iu30 iu30Var2 = this.b;
        boolean z = iu30Var != iu30Var2;
        iu30 iu30Var3 = nj40Var.Q0;
        iu30 iu30Var4 = this.c;
        boolean z2 = iu30Var3 != iu30Var4;
        nj40Var.O0 = this.a;
        nj40Var.P0 = iu30Var2;
        nj40Var.Q0 = iu30Var4;
        if (z && nj40Var.R0) {
            iu30Var2.invoke(nj40Var.S0);
        }
        if (z2 && nj40Var.T0) {
            iu30Var4.invoke(Integer.valueOf(nj40Var.U0));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mj40)) {
            return false;
        }
        mj40 mj40Var = (mj40) obj;
        return u890.j(this.a, mj40Var.a) && this.b.equals(mj40Var.b) && this.c.equals(mj40Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ktd.g(this.b, this.a.hashCode() * 31, 31);
    }
}

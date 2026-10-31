package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, d2 = {"Lp/e14;", "T", "Lp/uim0;", "Lp/a24;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class e14<T> extends uim0 {
    public final t24 a;
    public final qqq0 b;
    public final boolean c;
    public final iq20 d;

    public e14(t24 t24Var, qqq0 qqq0Var, boolean z, iq20 iq20Var) {
        this.a = t24Var;
        this.b = qqq0Var;
        this.c = z;
        this.d = iq20Var;
    }

    public final pim0 a() {
        a24 a24Var = new a24(wm5.a, this.c, null, this.b);
        a24Var.j1 = this.a;
        a24Var.k1 = this.d;
        return a24Var;
    }

    public final void b(pim0 pim0Var) {
        boolean z;
        boolean z2;
        a24 a24Var = (a24) pim0Var;
        iq20 iq20Var = this.d;
        a24Var.k1 = iq20Var;
        t24 t24Var = a24Var.j1;
        t24 t24Var2 = this.a;
        if (u890.j(t24Var, t24Var2)) {
            z = false;
        } else {
            a24Var.j1 = t24Var2;
            a24Var.e2(iq20Var);
            z = true;
        }
        qqq0 qqq0Var = ((m5v) a24Var).Q0;
        qqq0 qqq0Var2 = this.b;
        if (qqq0Var != qqq0Var2) {
            ((m5v) a24Var).Q0 = qqq0Var2;
            z2 = true;
        } else {
            z2 = z;
        }
        a24Var.b2(((m5v) a24Var).R0, this.c, (idn0) null, qqq0Var2, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e14) {
            e14 e14Var = (e14) obj;
            if (this.a == e14Var.a && this.b == e14Var.b && this.c == e14Var.c && u890.j(this.d, e14Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iG = xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 28629151, this.c);
        iq20 iq20Var = this.d;
        return iG + (iq20Var != null ? iq20Var.hashCode() : 0);
    }
}

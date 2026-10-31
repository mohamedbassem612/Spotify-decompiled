package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/ss41;", "Lp/uim0;", "Lp/bt41;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class ss41 extends uim0 {
    public final ct41 a;
    public final qqq0 b;
    public final hxq0 c;
    public final boolean d;
    public final boolean e;
    public final iq20 f;
    public final idn0 g;

    public ss41(ct41 ct41Var, qqq0 qqq0Var, hxq0 hxq0Var, boolean z, boolean z2, iq20 iq20Var, idn0 idn0Var) {
        this.a = ct41Var;
        this.b = qqq0Var;
        this.c = hxq0Var;
        this.d = z;
        this.e = z2;
        this.f = iq20Var;
        this.g = idn0Var;
    }

    public final pim0 a() {
        return new bt41((p5c) null, this.f, this.g, this.b, this.c, this.a, this.d, this.e);
    }

    public final void b(pim0 pim0Var) {
        ((bt41) pim0Var).d2((p5c) null, this.f, this.g, this.b, this.c, this.a, this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ss41)) {
            return false;
        }
        ss41 ss41Var = (ss41) obj;
        return u890.j(this.a, ss41Var.a) && this.b == ss41Var.b && u890.j(this.c, ss41Var.c) && this.d == ss41Var.d && this.e == ss41Var.e && u890.j(this.f, ss41Var.f) && u890.j(this.g, ss41Var.g);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        hxq0 hxq0Var = this.c;
        int iG = xcg1.g(xcg1.g((iHashCode + (hxq0Var != null ? hxq0Var.hashCode() : 0)) * 31, 31, this.d), 31, this.e);
        iq20 iq20Var = this.f;
        int iHashCode2 = (iG + (iq20Var != null ? iq20Var.hashCode() : 0)) * 31;
        idn0 idn0Var = this.g;
        return (iHashCode2 + (idn0Var != null ? idn0Var.hashCode() : 0)) * 31;
    }
}

package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/fy60;", "Lp/uim0;", "Lp/jy60;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class fy60 extends uim0 {
    public final idn0 a;

    public fy60(idn0 idn0Var) {
        this.a = idn0Var;
    }

    public final pim0 a() {
        jy60 jy60Var = new jy60();
        jy60Var.O0 = this.a;
        return jy60Var;
    }

    public final void b(pim0 pim0Var) {
        jy60 jy60Var = (jy60) pim0Var;
        idn0 idn0Var = jy60Var.O0;
        idn0 idn0Var2 = this.a;
        if (u890.j(idn0Var, idn0Var2)) {
            return;
        }
        jy60Var.J1();
        jy60Var.O0 = idn0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fy60) && u890.j(((fy60) obj).a, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}

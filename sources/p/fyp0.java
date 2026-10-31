package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/fyp0;", "Lp/uim0;", "Lp/iyp0;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class fyp0 extends uim0 {
    public final float a;
    public final float b;
    public final boolean c;

    public fyp0(float f, float f2, boolean z) {
        this.a = f;
        this.b = f2;
        this.c = z;
    }

    public final pim0 a() {
        iyp0 iyp0Var = new iyp0();
        iyp0Var.O0 = this.a;
        iyp0Var.P0 = this.b;
        iyp0Var.Q0 = this.c;
        return iyp0Var;
    }

    public final void b(pim0 pim0Var) {
        iyp0 iyp0Var = (iyp0) pim0Var;
        float f = iyp0Var.O0;
        float f2 = this.a;
        boolean zC = p3v.c(f, f2);
        float f3 = this.b;
        boolean z = this.c;
        if (!zC || !p3v.c(iyp0Var.P0, f3) || iyp0Var.Q0 != z) {
            dio1.z(iyp0Var);
        }
        iyp0Var.O0 = f2;
        iyp0Var.P0 = f3;
        iyp0Var.Q0 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        fyp0 fyp0Var = obj instanceof fyp0 ? (fyp0) obj : null;
        return fyp0Var != null && p3v.c(this.a, fyp0Var.a) && p3v.c(this.b, fyp0Var.b) && this.c == fyp0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + x0d.f(Float.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return l1d.r(gvg.n("OffsetModifierElement(x=", p3v.d(this.a), ", y=", p3v.d(this.b), ", rtlAware="), this.c, ")");
    }
}

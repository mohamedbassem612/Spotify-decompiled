package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/skc1;", "Lp/uim0;", "Lp/tkc1;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class skc1 extends uim0 {
    public final t3v a;

    public skc1(t3v t3vVar) {
        this.a = t3vVar;
    }

    public final pim0 a() {
        return new tkc1(zko1.a, this.a);
    }

    public final void b(pim0 pim0Var) {
        tkc1 tkc1Var = (tkc1) pim0Var;
        ky4 ky4Var = tkc1Var.P0;
        ky4 ky4Var2 = zko1.a;
        if (!u890.j(ky4Var, ky4Var2)) {
            tkc1Var.P0 = ky4Var2;
            if (tkc1Var.Q0) {
                tkc1Var.J1();
            }
        }
        tkc1Var.O0 = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof skc1)) {
            return false;
        }
        skc1 skc1Var = (skc1) obj;
        ky4 ky4Var = zko1.a;
        return ky4Var.equals(ky4Var) && u890.j(this.a, skc1Var.a);
    }

    public final int hashCode() {
        int iG = xcg1.g(1022 * 31, 31, false);
        t3v t3vVar = this.a;
        return iG + (t3vVar != null ? t3vVar.hashCode() : 0);
    }

    public final String toString() {
        return "StylusHoverIconModifierElement(icon=" + zko1.a + ", overrideDescendants=false, touchBoundsExpansion=" + this.a + ")";
    }
}

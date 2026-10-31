package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/dav0;", "Lp/uim0;", "Lp/eav0;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class dav0 extends uim0 {
    public final ky4 a;

    public dav0(ky4 ky4Var) {
        this.a = ky4Var;
    }

    public final pim0 a() {
        return new eav0(this.a, null);
    }

    public final void b(pim0 pim0Var) {
        eav0 eav0Var = (eav0) pim0Var;
        ky4 ky4Var = eav0Var.P0;
        ky4 ky4Var2 = this.a;
        if (u890.j(ky4Var, ky4Var2)) {
            return;
        }
        eav0Var.P0 = ky4Var2;
        if (eav0Var.Q0) {
            eav0Var.J1();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dav0) && this.a.equals(((dav0) obj).a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.a + ", overrideDescendants=false)";
    }
}

package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/nui1;", "Lp/uim0;", "Lp/pui1;", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class nui1 extends uim0 {
    public final bjg1 a;
    public final zgg1 b;
    public final bby c;
    public final ln00 d;
    public final ft71 e;

    public nui1(bjg1 bjg1Var, zgg1 zgg1Var, bby bbyVar, ln00 ln00Var, ft71 ft71Var) {
        this.a = bjg1Var;
        this.b = zgg1Var;
        this.c = bbyVar;
        this.d = ln00Var;
        this.e = ft71Var;
    }

    public final pim0 a() {
        pui1 pui1Var = new pui1();
        pui1Var.O0 = this.b;
        pui1Var.P0 = this.c;
        pui1Var.Q0 = this.d;
        pui1Var.R0 = this.e;
        return pui1Var;
    }

    public final void b(pim0 pim0Var) {
        pui1 pui1Var = (pui1) pim0Var;
        pui1Var.getClass();
        pui1Var.O0 = this.b;
        pui1Var.P0 = this.c;
        pui1Var.Q0 = this.d;
        pui1Var.R0 = this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof nui1) {
            nui1 nui1Var = (nui1) obj;
            return this.a == nui1Var.a && u890.j(this.b, nui1Var.b) && this.c.equals(nui1Var.c) && u890.j(this.d, nui1Var.d) && this.e == nui1Var.e;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.a.hashCode() + ((this.c.a.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "VeilModifierElement(transition=" + this.a + ", veilAnimation=" + this.b + ", enter=" + this.c + ", exit=" + this.d + ", mutableTransformState=" + this.e + ")";
    }
}

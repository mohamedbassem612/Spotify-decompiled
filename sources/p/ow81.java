package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/ow81;", "Lp/uim0;", "Lp/pw81;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ow81 extends uim0 {
    public final hw61 a;
    public final bw61 b;

    public ow81(hw61 hw61Var, bw61 bw61Var) {
        this.a = hw61Var;
        this.b = bw61Var;
    }

    public final pim0 a() {
        pw81 pw81Var = new pw81();
        pw81Var.O0 = this.a;
        pw81Var.P0 = this.b;
        return pw81Var;
    }

    public final void b(pim0 pim0Var) {
        pw81 pw81Var = (pw81) pim0Var;
        hw61 hw61Var = pw81Var.O0;
        hw61 hw61Var2 = this.a;
        boolean zJ = u890.j(hw61Var, hw61Var2);
        bw61 bw61Var = this.b;
        if (!zJ || !u890.j(pw81Var.P0, bw61Var)) {
            pw81Var.Q0 = null;
        }
        pw81Var.O0 = hw61Var2;
        pw81Var.P0 = bw61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ow81)) {
            return false;
        }
        ow81 ow81Var = (ow81) obj;
        return u890.j(this.a, ow81Var.a) && this.b.equals(ow81Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SimpleDropShadowElement(shape=" + this.a + ", shadow=" + this.b + ")";
    }
}

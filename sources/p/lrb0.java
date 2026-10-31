package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/lrb0;", "Lp/uim0;", "Lp/mrb0;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class lrb0 extends uim0 {
    public final ni20 a;
    public final ni20 b;
    public final ni20 c;

    public lrb0(ni20 ni20Var, ni20 ni20Var2, ni20 ni20Var3) {
        this.a = ni20Var;
        this.b = ni20Var2;
        this.c = ni20Var3;
    }

    public final pim0 a() {
        mrb0 mrb0Var = new mrb0();
        mrb0Var.O0 = this.a;
        mrb0Var.P0 = this.b;
        mrb0Var.Q0 = this.c;
        return mrb0Var;
    }

    public final void b(pim0 pim0Var) {
        mrb0 mrb0Var = (mrb0) pim0Var;
        mrb0Var.O0 = this.a;
        mrb0Var.P0 = this.b;
        mrb0Var.Q0 = this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lrb0)) {
            return false;
        }
        lrb0 lrb0Var = (lrb0) obj;
        return u890.j(this.a, lrb0Var.a) && u890.j(this.b, lrb0Var.b) && u890.j(this.c, lrb0Var.c);
    }

    public final int hashCode() {
        ni20 ni20Var = this.a;
        int iHashCode = (ni20Var == null ? 0 : ni20Var.hashCode()) * 31;
        ni20 ni20Var2 = this.b;
        int iHashCode2 = (iHashCode + (ni20Var2 == null ? 0 : ni20Var2.hashCode())) * 31;
        ni20 ni20Var3 = this.c;
        return iHashCode2 + (ni20Var3 != null ? ni20Var3.hashCode() : 0);
    }

    public final String toString() {
        return "LazyLayoutAnimateItemElement(fadeInSpec=" + this.a + ", placementSpec=" + this.b + ", fadeOutSpec=" + this.c + ")";
    }
}

package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/h3n1;", "Lp/uim0;", "Lp/i3n1;", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class h3n1 extends uim0 {
    public final float a;
    public final Object b;

    public h3n1(float f, Object obj) {
        this.a = f;
        this.b = obj;
    }

    public final pim0 a() {
        i3n1 i3n1Var = new i3n1();
        i3n1Var.O0 = this.a;
        i3n1Var.P0 = this.b;
        return i3n1Var;
    }

    public final void b(pim0 pim0Var) {
        i3n1 i3n1Var = (i3n1) pim0Var;
        i3n1Var.O0 = this.a;
        i3n1Var.P0 = this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h3n1)) {
            return false;
        }
        h3n1 h3n1Var = (h3n1) obj;
        return h3n1Var.a == this.a && u890.j(h3n1Var.b, this.b);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.a) * 31;
        Object obj = this.b;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }
}

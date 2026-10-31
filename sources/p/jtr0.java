package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/jtr0;", "Lp/uim0;", "Lp/ktr0;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class jtr0 extends uim0 {
    public final float a;
    public final tob1 b;
    public final tob1 c;

    public /* synthetic */ jtr0(float f, err0 err0Var, err0 err0Var2, int i) {
        this(f, (i & 2) != 0 ? null : err0Var, (i & 4) != 0 ? null : err0Var2);
    }

    public final pim0 a() {
        ktr0 ktr0Var = new ktr0();
        ktr0Var.O0 = this.a;
        ktr0Var.P0 = this.b;
        ktr0Var.Q0 = this.c;
        return ktr0Var;
    }

    public final void b(pim0 pim0Var) {
        ktr0 ktr0Var = (ktr0) pim0Var;
        ktr0Var.O0 = this.a;
        ktr0Var.P0 = this.b;
        ktr0Var.Q0 = this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jtr0)) {
            return false;
        }
        jtr0 jtr0Var = (jtr0) obj;
        return this.a == jtr0Var.a && u890.j(this.b, jtr0Var.b) && u890.j(this.c, jtr0Var.c);
    }

    public final int hashCode() {
        tob1 tob1Var = this.b;
        int iHashCode = (tob1Var != null ? tob1Var.hashCode() : 0) * 31;
        tob1 tob1Var2 = this.c;
        return Float.hashCode(this.a) + ((iHashCode + (tob1Var2 != null ? tob1Var2.hashCode() : 0)) * 31);
    }

    public jtr0(float f, tob1 tob1Var, tob1 tob1Var2) {
        this.a = f;
        this.b = tob1Var;
        this.c = tob1Var2;
    }
}

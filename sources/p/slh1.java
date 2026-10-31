package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/slh1;", "Lp/uim0;", "Lp/tlh1;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class slh1 extends uim0 {
    public final float a;
    public final float b;

    public slh1(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final pim0 a() {
        tlh1 tlh1Var = new tlh1();
        tlh1Var.O0 = this.a;
        tlh1Var.P0 = this.b;
        return tlh1Var;
    }

    public final void b(pim0 pim0Var) {
        tlh1 tlh1Var = (tlh1) pim0Var;
        tlh1Var.O0 = this.a;
        tlh1Var.P0 = this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof slh1)) {
            return false;
        }
        slh1 slh1Var = (slh1) obj;
        return p3v.c(this.a, slh1Var.a) && p3v.c(this.b, slh1Var.b);
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }
}

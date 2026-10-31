package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/sbf0;", "Lp/uim0;", "Lp/tbf0;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class sbf0 extends uim0 {
    public final int a;
    public final int b;

    public sbf0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final pim0 a() {
        tbf0 tbf0Var = new tbf0();
        tbf0Var.O0 = this.a;
        tbf0Var.P0 = this.b;
        return tbf0Var;
    }

    public final void b(pim0 pim0Var) {
        tbf0 tbf0Var = (tbf0) pim0Var;
        tbf0Var.O0 = this.a;
        tbf0Var.P0 = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sbf0)) {
            return false;
        }
        sbf0 sbf0Var = (sbf0) obj;
        return this.a == sbf0Var.a && this.b == sbf0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return l1d.j(this.a, this.b, "LottieAnimationSizeElement(width=", ", height=", ")");
    }
}

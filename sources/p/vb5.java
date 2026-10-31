package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/vb5;", "Lp/uim0;", "Lp/yb5;", "src_main_java_com_spotify_encore_chips-chips"}, k = 1, mv = {2, 3, 0}, xi = 48)
final /* data */ class vb5 extends uim0 {
    public final float a;
    public final n8b1 b;

    public vb5(float f, n8b1 n8b1Var) {
        this.a = f;
        this.b = n8b1Var;
    }

    public final pim0 a() {
        yb5 yb5Var = new yb5();
        yb5Var.O0 = this.a;
        return yb5Var;
    }

    public final void b(pim0 pim0Var) {
        yb5 yb5Var = (yb5) pim0Var;
        float f = yb5Var.O0;
        float f2 = this.a;
        if (p3v.c(f, f2)) {
            return;
        }
        yb5Var.O0 = f2;
        fn31.T(yb5Var.v1(), null, 0, new xb5(yb5Var, f2, this.b, null, (byte) 0), 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vb5)) {
            return false;
        }
        vb5 vb5Var = (vb5) obj;
        return p3v.c(this.a, vb5Var.a) && this.b.equals(vb5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }
}

package p;

import androidx.compose.ui.geometry.Size;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class j15 {
    public hw61 a;
    public long b;
    public flb0 c;
    public float d;
    public bw61 e;

    public j15(hw61 hw61Var, long j, flb0 flb0Var, float f, bw61 bw61Var) {
        this.a = hw61Var;
        this.b = j;
        this.c = flb0Var;
        this.d = f;
        this.e = bw61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j15)) {
            return false;
        }
        j15 j15Var = (j15) obj;
        return u890.j(this.a, j15Var.a) && Size.c(this.b, j15Var.b) && this.c == j15Var.c && Float.compare(this.d, j15Var.d) == 0 && u890.j(this.e, j15Var.e);
    }

    public final int hashCode() {
        int iF = x0d.f((this.c.hashCode() + cy30.f(this.a.hashCode() * 31, this.b, 31)) * 31, 31, this.d);
        bw61 bw61Var = this.e;
        return iF + (bw61Var == null ? 0 : bw61Var.hashCode());
    }

    public final String toString() {
        return "ShadowKey(shape=" + this.a + ", size=" + Size.h(this.b) + ", layoutDirection=" + this.c + ", density=" + this.d + ", shadow=" + this.e + ")";
    }
}

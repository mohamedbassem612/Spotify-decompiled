package p;

import androidx.compose.ui.graphics.ColorFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class k6t0 {
    public final ColorFilter a;
    public final jmr0 b;

    public k6t0(ColorFilter colorFilter, jmr0 jmr0Var) {
        this.a = colorFilter;
        this.b = jmr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k6t0)) {
            return false;
        }
        k6t0 k6t0Var = (k6t0) obj;
        return u890.j(this.a, k6t0Var.a) && u890.j(this.b, k6t0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}

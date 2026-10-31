package p;

import android.text.style.StyleSpan;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class x2d1 implements z2d1 {
    public final int a;
    public final int b;
    public final StyleSpan c;

    public x2d1(int i, int i2, StyleSpan styleSpan) {
        this.a = i;
        this.b = i2;
        this.c = styleSpan;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2d1)) {
            return false;
        }
        x2d1 x2d1Var = (x2d1) obj;
        return this.a == x2d1Var.a && this.b == x2d1Var.b && this.c.equals(x2d1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31);
    }
}

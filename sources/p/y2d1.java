package p;

import android.text.style.URLSpan;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class y2d1 implements z2d1 {
    public final int a;
    public final int b;
    public final URLSpan c;

    public y2d1(int i, int i2, URLSpan uRLSpan) {
        this.a = i;
        this.b = i2;
        this.c = uRLSpan;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y2d1)) {
            return false;
        }
        y2d1 y2d1Var = (y2d1) obj;
        return this.a == y2d1Var.a && this.b == y2d1Var.b && this.c.equals(y2d1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31);
    }
}

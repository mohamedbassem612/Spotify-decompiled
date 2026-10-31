package p;

import androidx.compose.ui.graphics.Brush;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class n6a1 extends Brush implements n790 {
    public final long a;

    public n6a1(long j) {
        this.a = j;
    }

    @Override // androidx.compose.ui.graphics.Brush
    public final void a(float f, long j, lw4 lw4Var) {
        lw4Var.a(1.0f);
        long jB = this.a;
        if (f != 1.0f) {
            jB = u7h.b(jB, u7h.c(jB) * f, 0.0f, 0.0f, 0.0f, 14);
        }
        lw4Var.c(jB);
        if (lw4Var.c != null) {
            lw4Var.e(null);
        }
    }

    @Override // p.n790
    public final Object b(float f, Object obj) {
        if (obj == null) {
            int i = u7h.l;
            obj = new n6a1(nfb.o());
        }
        if (!(obj instanceof n6a1)) {
            return null;
        }
        return new n6a1(z4p1.A(f, this.a, ((n6a1) obj).a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n6a1)) {
            return false;
        }
        long j = ((n6a1) obj).a;
        int i = u7h.l;
        return z4h1.b(this.a, j);
    }

    public final int hashCode() {
        int i = u7h.l;
        return z4h1.c(this.a);
    }

    public final String toString() {
        return f4i1.f("SolidColor(value=", u7h.h(this.a), ")");
    }
}

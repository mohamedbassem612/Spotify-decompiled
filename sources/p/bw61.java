package p;

import androidx.compose.ui.graphics.Brush;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bw61 {
    public final float a;
    public final float b;
    public final long c;
    public final int d;
    public final long e;
    public final Brush f;
    public final float g;

    public bw61(float f, float f2, long j, long j2, Brush brush, float f3, int i) {
        this.a = f;
        this.b = f2;
        this.c = j;
        this.d = i;
        if (brush instanceof n6a1) {
            this.e = ((n6a1) brush).a;
            this.f = null;
        } else {
            this.e = j2;
            this.f = brush;
        }
        this.g = yoi1.o(f3, 0.0f, 1.0f);
    }

    public final float a() {
        return this.g;
    }

    public final int b() {
        return this.d;
    }

    public final Brush c() {
        return this.f;
    }

    public final long d() {
        return this.e;
    }

    public final long e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bw61) {
            bw61 bw61Var = (bw61) obj;
            if (p3v.c(this.a, bw61Var.a) && p3v.c(this.b, bw61Var.b) && this.c == bw61Var.c && this.g == bw61Var.g && this.d == bw61Var.d) {
                long j = bw61Var.e;
                int i = u7h.l;
                if (z4h1.b(this.e, j) && u890.j(this.f, bw61Var.f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final float f() {
        return this.a;
    }

    public final float g() {
        return this.b;
    }

    public final bw61 h() {
        int i = u7h.l;
        return new bw61(this.a, u7h.j, this.b, this.c, this.g, this.d);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.d, x0d.f(cy30.f(x0d.f(Float.hashCode(this.a) * 31, 31, this.b), this.c, 31), 31, this.g), 31);
        int i = u7h.l;
        int iF2 = cy30.f(iF, this.e, 31);
        Brush brush = this.f;
        return iF2 + (brush != null ? brush.hashCode() : 0);
    }

    public final String toString() {
        String strD = p3v.d(this.a);
        String strD2 = p3v.d(this.b);
        String strC = r3v.c(this.c);
        String strQ = jm5.q(this.d);
        String strH = u7h.h(this.e);
        StringBuilder sbN = gvg.n("Shadow(radius=", strD, ", spread=", strD2, ", offset=");
        sbN.append(strC);
        sbN.append(", alpha=");
        sbN.append(this.g);
        sbN.append(", blendMode=");
        bb00.j(sbN, strQ, ", color=", strH, ", brush=");
        sbN.append(this.f);
        sbN.append(")");
        return sbN.toString();
    }

    public bw61(float f, long j, float f2, long j2, float f3, int i, int i2) {
        this(f, j, (i & 4) != 0 ? 0.0f : f2, (i & 8) != 0 ? 0L : j2, (i & 16) != 0 ? 1.0f : f3, 3);
    }

    public /* synthetic */ bw61(float f, float f2, long j, long j2, Brush brush, float f3, int i, int i2) {
        this(f, f2, j, j2, brush, f3, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public bw61(float f, long j, float f2, long j2, float f3, int i) {
        if (j == 16) {
            int i2 = u7h.l;
            j = u7h.b;
        }
        this(f, f2, j2, j, (Brush) null, f3, i);
    }
}

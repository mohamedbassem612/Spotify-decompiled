package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class sor0 {
    public final nw4 a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;

    public sor0(nw4 nw4Var, int i, int i2, int i3, int i4, float f, float f2) {
        this.a = nw4Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = f;
        this.g = f2;
    }

    public final n511 a(n511 n511Var) {
        return n511Var.n((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(this.f)) & 4294967295L));
    }

    public final long b(long j, boolean z) {
        if (z) {
            int i = nbe1.c;
            if (nbe1.c(j, b6p1.k())) {
                return b6p1.k();
            }
        }
        int i2 = nbe1.c;
        int i3 = this.b;
        return e6p1.e(((int) (j >> 32)) + i3, ((int) (j & 4294967295L)) + i3);
    }

    public final n511 c(n511 n511Var) {
        float f = -this.f;
        return n511Var.n((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
    }

    public final int d(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return yoi1.p(i, i3, i2) - i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sor0) {
            sor0 sor0Var = (sor0) obj;
            if (this.a == sor0Var.a && this.b == sor0Var.b && this.c == sor0Var.c && this.d == sor0Var.d && this.e == sor0Var.e && Float.compare(this.f, sor0Var.f) == 0 && Float.compare(this.g, sor0Var.g) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + x0d.f(kaa0.f(this.e, kaa0.f(this.d, kaa0.f(this.c, kaa0.f(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphInfo(paragraph=");
        sb.append(this.a);
        sb.append(", startIndex=");
        sb.append(this.b);
        sb.append(", endIndex=");
        ktd.p(this.c, this.d, ", startLineIndex=", ", endLineIndex=", sb);
        sb.append(this.e);
        sb.append(", top=");
        sb.append(this.f);
        sb.append(", bottom=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }
}

package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class irt {
    public final double a;
    public final double b;
    public final float c;
    public final long d;

    public irt(double d, double d2, float f, long j) {
        this.a = d;
        this.b = d2;
        this.c = f;
        this.d = j;
    }

    public final float a() {
        return this.c;
    }

    public final long b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof irt)) {
            return false;
        }
        irt irtVar = (irt) obj;
        return Double.compare(this.a, irtVar.a) == 0 && Double.compare(this.b, irtVar.b) == 0 && Float.compare(this.c, irtVar.c) == 0 && this.d == irtVar.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + x0d.f(xcg1.e(this.b, Double.hashCode(this.a) * 31, 31), 31, this.c);
    }
}

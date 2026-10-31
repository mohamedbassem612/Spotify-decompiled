package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pq2 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;

    public pq2(float f, float f2, float f3, float f4, long j) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pq2)) {
            return false;
        }
        pq2 pq2Var = (pq2) obj;
        if (Float.compare(this.a, pq2Var.a) != 0 || Float.compare(this.b, pq2Var.b) != 0 || Float.compare(this.c, pq2Var.c) != 0 || Float.compare(this.d, pq2Var.d) != 0) {
            return false;
        }
        long j = pq2Var.e;
        int i = u7h.l;
        return z4h1.b(this.e, j);
    }

    public final int hashCode() {
        int iF = x0d.f(x0d.f(x0d.f(Float.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
        int i = u7h.l;
        return Long.hashCode(this.e) + iF;
    }
}

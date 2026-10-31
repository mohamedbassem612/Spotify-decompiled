package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pfh0 {
    public final String a;
    public final double b;
    public final long c;
    public final long d;
    public final long e;

    public pfh0(String str, double d, long j, long j2, long j3) {
        this.a = str;
        this.b = d;
        this.c = j;
        this.d = j2;
        this.e = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pfh0)) {
            return false;
        }
        pfh0 pfh0Var = (pfh0) obj;
        return this.a.equals(pfh0Var.a) && Double.compare(this.b, pfh0Var.b) == 0 && this.c == pfh0Var.c && this.d == pfh0Var.d && this.e == pfh0Var.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + cy30.f(cy30.f(xcg1.e(this.b, this.a.hashCode() * 31, 31), this.c, 31), this.d, 31);
    }
}

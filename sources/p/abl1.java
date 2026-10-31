package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class abl1 {
    public final String a;
    public final int b;
    public final long c;
    public final long d;

    public abl1(long j, long j2, String str, int i) {
        this.a = str;
        this.b = i;
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abl1)) {
            return false;
        }
        abl1 abl1Var = (abl1) obj;
        return this.a.equals(abl1Var.a) && this.b == abl1Var.b && this.c == abl1Var.c && this.d == abl1Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + cy30.f(ab80.k(this.b, this.a.hashCode() * 31, 31), this.c, 31);
    }
}

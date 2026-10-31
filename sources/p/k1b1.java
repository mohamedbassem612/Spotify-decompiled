package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class k1b1 implements l1b1 {
    public final long a;
    public final long b;
    public final String c;

    public k1b1(long j, long j2, String str) {
        this.a = j;
        this.b = j2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1b1)) {
            return false;
        }
        k1b1 k1b1Var = (k1b1) obj;
        return this.a == k1b1Var.a && this.b == k1b1Var.b && this.c.equals(k1b1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.f(Long.hashCode(this.a) * 31, this.b, 31);
    }
}

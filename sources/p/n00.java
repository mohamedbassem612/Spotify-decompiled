package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class n00 implements m10 {
    public final int a;
    public final long b;
    public final long c;

    public n00(int i, long j, long j2) {
        this.a = i;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n00)) {
            return false;
        }
        n00 n00Var = (n00) obj;
        return this.a == n00Var.a && this.b == n00Var.b && this.c == n00Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + cy30.f(Integer.hashCode(this.a) * 31, this.b, 31);
    }
}

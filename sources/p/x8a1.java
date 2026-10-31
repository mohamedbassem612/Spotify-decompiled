package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class x8a1 {
    public final long a;
    public final String b;
    public final c380 c;

    public x8a1(long j, String str, c380 c380Var) {
        this.a = j;
        this.b = str;
        this.c = c380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x8a1)) {
            return false;
        }
        x8a1 x8a1Var = (x8a1) obj;
        long j = x8a1Var.a;
        int i = u7h.l;
        return z4h1.b(this.a, j) && u890.j(this.b, x8a1Var.b) && u890.j(this.c, x8a1Var.c);
    }

    public final int hashCode() {
        int i = u7h.l;
        return this.c.hashCode() + cy30.d(Long.hashCode(this.a) * 31, 31, this.b);
    }
}

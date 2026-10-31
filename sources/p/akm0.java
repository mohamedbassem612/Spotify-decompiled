package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class akm0 {
    public final long a;
    public final long b;
    public final b5p1 c;

    public akm0(long j, long j2, b5p1 b5p1Var) {
        this.a = j;
        this.b = j2;
        this.c = b5p1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akm0)) {
            return false;
        }
        akm0 akm0Var = (akm0) obj;
        return this.a == akm0Var.a && this.b == akm0Var.b && this.c.equals(akm0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.f(Long.hashCode(this.a) * 31, this.b, 31);
    }
}

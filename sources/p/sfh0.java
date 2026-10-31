package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class sfh0 {
    public final String a;
    public final int b;
    public final long c;
    public final long d;

    public sfh0(long j, long j2, String str, int i) {
        this.a = str;
        this.b = i;
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sfh0)) {
            return false;
        }
        sfh0 sfh0Var = (sfh0) obj;
        return u890.j(this.a, sfh0Var.a) && this.b == sfh0Var.b && this.c == sfh0Var.c && this.d == sfh0Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + cy30.f(ab80.k(this.b, this.a.hashCode() * 31, 31), this.c, 31);
    }
}

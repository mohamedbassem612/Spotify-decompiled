package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ps51 {
    public final String a;
    public final String b;
    public final long c;
    public final long d;

    public ps51(long j, long j2, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ps51)) {
            return false;
        }
        ps51 ps51Var = (ps51) obj;
        return u890.j(this.a, ps51Var.a) && this.b.equals(ps51Var.b) && this.c == ps51Var.c && this.d == ps51Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + cy30.f(cy30.f(cy30.f(cy30.d(this.a.hashCode() * 31, 31, this.b), this.c, 31), this.d, 31), 0L, 31);
    }
}

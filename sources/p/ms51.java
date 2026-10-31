package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ms51 implements ns51 {
    public final String a;
    public final long b;
    public final long c;
    public final boolean d;

    public ms51(long j, long j2, String str, boolean z) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ms51)) {
            return false;
        }
        ms51 ms51Var = (ms51) obj;
        return this.a.equals(ms51Var.a) && this.b == ms51Var.b && this.c == ms51Var.c && this.d == ms51Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + cy30.f(cy30.f(this.a.hashCode() * 31, this.b, 31), this.c, 31);
    }
}

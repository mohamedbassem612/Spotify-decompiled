package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class e7i0 {
    public final String a;
    public final String b;
    public final long c;
    public final long d;

    public e7i0(long j, long j2, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e7i0)) {
            return false;
        }
        e7i0 e7i0Var = (e7i0) obj;
        return this.a.equals(e7i0Var.a) && this.b.equals(e7i0Var.b) && tve1.b(this.c, e7i0Var.c) && tve1.b(this.d, e7i0Var.d);
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + cy30.f(cy30.d(this.a.hashCode() * 31, 31, this.b), this.c, 31);
    }
}

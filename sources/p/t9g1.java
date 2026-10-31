package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class t9g1 implements u9g1 {
    public final String a;
    public final long b;
    public final long c;

    public t9g1(long j, long j2, String str) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t9g1)) {
            return false;
        }
        t9g1 t9g1Var = (t9g1) obj;
        return u890.j(this.a, t9g1Var.a) && this.b == t9g1Var.b && this.c == t9g1Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + cy30.f(this.a.hashCode() * 31, this.b, 31);
    }
}

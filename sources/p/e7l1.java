package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class e7l1 {
    public final String a;
    public final int b;
    public final long c;
    public final long d;

    public e7l1(long j, long j2, String str, int i) {
        this.a = str;
        this.b = i;
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e7l1)) {
            return false;
        }
        e7l1 e7l1Var = (e7l1) obj;
        return u890.j(this.a, e7l1Var.a) && this.b == e7l1Var.b && this.c == e7l1Var.c && this.d == e7l1Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + cy30.f(ab80.k(this.b, this.a.hashCode() * 31, 31), this.c, 31);
    }

    public /* synthetic */ e7l1(String str, int i) {
        this(0L, 0L, str, i);
    }
}

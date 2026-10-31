package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class e7g1 {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final boolean e;

    public e7g1(long j, String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e7g1)) {
            return false;
        }
        e7g1 e7g1Var = (e7g1) obj;
        if (!u890.j(this.a, e7g1Var.a) || !this.b.equals(e7g1Var.b) || !this.c.equals(e7g1Var.c)) {
            return false;
        }
        long j = e7g1Var.d;
        int i = u7h.l;
        return z4h1.b(this.d, j) && this.e == e7g1Var.e;
    }

    public final int hashCode() {
        String str = this.a;
        int iD = cy30.d(cy30.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c);
        int i = u7h.l;
        return Boolean.hashCode(this.e) + cy30.f(iD, this.d, 31);
    }
}

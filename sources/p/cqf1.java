package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cqf1 {
    public final String a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;

    public cqf1(String str, long j, long j2, long j3, boolean z) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cqf1)) {
            return false;
        }
        cqf1 cqf1Var = (cqf1) obj;
        return u890.j(this.a, cqf1Var.a) && this.b == cqf1Var.b && this.c == cqf1Var.c && this.d == cqf1Var.d && this.e == cqf1Var.e;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.e) + cy30.f(cy30.f(cy30.f((str == null ? 0 : str.hashCode()) * 31, this.b, 31), this.c, 31), this.d, 31);
    }

    public /* synthetic */ cqf1(String str) {
        this(str, 0L, 0L, 0L, false);
    }
}

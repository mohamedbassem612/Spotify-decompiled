package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ez0 {
    public final String a;
    public final long b;
    public final long c;
    public final Long d;
    public final boolean e;
    public final i6h1 f;

    public ez0(String str, long j, long j2, Long l, boolean z, i6h1 i6h1Var) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = l;
        this.e = z;
        this.f = i6h1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ez0)) {
            return false;
        }
        ez0 ez0Var = (ez0) obj;
        return u890.j(this.a, ez0Var.a) && this.b == ez0Var.b && this.c == ez0Var.c && u890.j(this.d, ez0Var.d) && this.e == ez0Var.e && u890.j(this.f, ez0Var.f);
    }

    public final int hashCode() {
        int iF = cy30.f(cy30.f(this.a.hashCode() * 31, this.b, 31), this.c, 31);
        Long l = this.d;
        int iG = xcg1.g((iF + (l == null ? 0 : l.hashCode())) * 31, 31, this.e);
        i6h1 i6h1Var = this.f;
        return iG + (i6h1Var != null ? i6h1Var.hashCode() : 0);
    }
}

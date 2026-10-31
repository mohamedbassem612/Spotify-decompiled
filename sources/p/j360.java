package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class j360 extends n360 {
    public final int a;
    public final String b;
    public final boolean c;
    public final String d;

    public j360(int i, String str, String str2, boolean z) {
        this.a = i;
        this.b = str;
        this.c = z;
        this.d = str2;
    }

    @Override // p.n360
    public final String a() {
        return this.d;
    }

    @Override // p.n360
    public final String c() {
        return this.b;
    }

    @Override // p.n360
    public final boolean d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j360)) {
            return false;
        }
        j360 j360Var = (j360) obj;
        return this.a == j360Var.a && this.b.equals(j360Var.b) && this.c == j360Var.c && u890.j(this.d, j360Var.d);
    }

    public final int hashCode() {
        int iG = xcg1.g(cy30.d(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return l360.a.hashCode() + ((iG + (str == null ? 0 : str.hashCode())) * 31);
    }
}

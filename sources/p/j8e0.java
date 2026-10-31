package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class j8e0 implements h7e0 {
    public final int a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final zuc0 e;

    public j8e0(int i, String str, boolean z, boolean z2, zuc0 zuc0Var) {
        this.a = i;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = zuc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j8e0)) {
            return false;
        }
        j8e0 j8e0Var = (j8e0) obj;
        return this.a == j8e0Var.a && u890.j(this.b, j8e0Var.b) && this.c == j8e0Var.c && this.d == j8e0Var.d && u890.j(this.e, j8e0Var.e);
    }

    @Override // p.h7e0
    public final String getUri() {
        return this.b;
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(cy30.d(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
        zuc0 zuc0Var = this.e;
        return iG + (zuc0Var == null ? 0 : zuc0Var.hashCode());
    }
}

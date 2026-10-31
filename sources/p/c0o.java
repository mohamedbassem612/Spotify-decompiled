package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class c0o {
    public final x4i1 a;
    public final String b;
    public final x4i1 c;
    public final String d;
    public final int e;
    public final boolean f;
    public final boolean g;

    public c0o(x4i1 x4i1Var, String str, x4i1 x4i1Var2, String str2, int i, boolean z, boolean z2) {
        this.a = x4i1Var;
        this.b = str;
        this.c = x4i1Var2;
        this.d = str2;
        this.e = i;
        this.f = z;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0o)) {
            return false;
        }
        c0o c0oVar = (c0o) obj;
        return u890.j(this.a, c0oVar.a) && u890.j(this.b, c0oVar.b) && u890.j(this.c, c0oVar.c) && u890.j(this.d, c0oVar.d) && this.e == c0oVar.e && this.f == c0oVar.f && this.g == c0oVar.g;
    }

    public final int hashCode() {
        x4i1 x4i1Var = this.a;
        int iD = cy30.d((x4i1Var == null ? 0 : x4i1Var.hashCode()) * 31, 31, this.b);
        x4i1 x4i1Var2 = this.c;
        int iHashCode = (iD + (x4i1Var2 == null ? 0 : x4i1Var2.hashCode())) * 31;
        String str = this.d;
        return Boolean.hashCode(this.g) + xcg1.g(ab80.k(this.e, (iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31), 31, this.f);
    }
}

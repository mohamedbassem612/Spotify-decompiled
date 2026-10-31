package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class a140 {
    public final String a;
    public final ggi1 b;
    public final z040 c;
    public final String d;
    public final String e;
    public final boolean f;
    public final q331 g;
    public final boolean h;
    public final String i;

    public a140(String str, ggi1 ggi1Var, z040 z040Var, String str2, String str3, boolean z, q331 q331Var, boolean z2, String str4) {
        this.a = str;
        this.b = ggi1Var;
        this.c = z040Var;
        this.d = str2;
        this.e = str3;
        this.f = z;
        this.g = q331Var;
        this.h = z2;
        this.i = str4;
    }

    public final String a() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a140)) {
            return false;
        }
        a140 a140Var = (a140) obj;
        return this.a.equals(a140Var.a) && this.b.equals(a140Var.b) && this.c.equals(a140Var.c) && this.d.equals(a140Var.d) && this.e.equals(a140Var.e) && this.f == a140Var.f && this.g.equals(a140Var.g) && this.h == a140Var.h && u890.j(this.i, a140Var.i);
    }

    public final int hashCode() {
        int iG = xcg1.g((this.g.hashCode() + xcg1.g(cy30.d(cy30.d((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f)) * 31, 31, this.h);
        String str = this.i;
        return iG + (str == null ? 0 : str.hashCode());
    }
}

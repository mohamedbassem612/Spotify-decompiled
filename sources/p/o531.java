package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class o531 {
    public final String a;
    public final String b;
    public final ggi1 c;
    public final yap1 d;
    public final String e;
    public final boolean f;
    public final q331 g;
    public final boolean h;
    public final String i;

    public o531(String str, String str2, ggi1 ggi1Var, yap1 yap1Var, String str3, boolean z, q331 q331Var, boolean z2, String str4) {
        this.a = str;
        this.b = str2;
        this.c = ggi1Var;
        this.d = yap1Var;
        this.e = str3;
        this.f = z;
        this.g = q331Var;
        this.h = z2;
        this.i = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o531)) {
            return false;
        }
        o531 o531Var = (o531) obj;
        return this.a.equals(o531Var.a) && this.b.equals(o531Var.b) && this.c.equals(o531Var.c) && this.d.equals(o531Var.d) && this.e.equals(o531Var.e) && this.f == o531Var.f && this.g.equals(o531Var.g) && this.h == o531Var.h && u890.j(this.i, o531Var.i);
    }

    public final int hashCode() {
        int iG = xcg1.g((this.g.hashCode() + xcg1.g(cy30.d((this.d.hashCode() + ((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31, 31, this.e), 31, this.f)) * 31, 31, this.h);
        String str = this.i;
        return iG + (str == null ? 0 : str.hashCode());
    }
}

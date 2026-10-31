package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class o7c1 {
    public final int a;
    public final oho1 b;
    public final String c;
    public final iy61 d;
    public final boolean e;
    public final String f;
    public final boolean g;

    public o7c1(int i, oho1 oho1Var, String str, iy61 iy61Var, boolean z, String str2, boolean z2) {
        this.a = i;
        this.b = oho1Var;
        this.c = str;
        this.d = iy61Var;
        this.e = z;
        this.f = str2;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o7c1)) {
            return false;
        }
        o7c1 o7c1Var = (o7c1) obj;
        return this.a == o7c1Var.a && u890.j(this.b, o7c1Var.b) && u890.j(this.c, o7c1Var.c) && u890.j(this.d, o7c1Var.d) && this.e == o7c1Var.e && u890.j(this.f, o7c1Var.f) && this.g == o7c1Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + cy30.d(xcg1.g((this.d.hashCode() + cy30.d((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31, this.c)) * 31, 31, this.e), 31, this.f);
    }
}

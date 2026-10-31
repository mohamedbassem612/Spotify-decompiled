package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class k8e0 implements i7e0 {
    public final int a;
    public final hwq b;
    public final String c;
    public final String d;
    public final x4i1 e;
    public final String f;
    public final Boolean g;
    public final boolean h;
    public final zuc0 i;
    public final int j;
    public final int k;
    public final tu00 l;
    public final fbp1 m;

    public k8e0(int i, hwq hwqVar, String str, String str2, x4i1 x4i1Var, String str3, Boolean bool, boolean z, zuc0 zuc0Var, int i2, int i3, tu00 tu00Var, fbp1 fbp1Var) {
        this.a = i;
        this.b = hwqVar;
        this.c = str;
        this.d = str2;
        this.e = x4i1Var;
        this.f = str3;
        this.g = bool;
        this.h = z;
        this.i = zuc0Var;
        this.j = i2;
        this.k = i3;
        this.l = tu00Var;
        this.m = fbp1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k8e0)) {
            return false;
        }
        k8e0 k8e0Var = (k8e0) obj;
        return this.a == k8e0Var.a && this.b.equals(k8e0Var.b) && u890.j(this.c, k8e0Var.c) && u890.j(this.d, k8e0Var.d) && u890.j(this.e, k8e0Var.e) && this.f.equals(k8e0Var.f) && u890.j(this.g, k8e0Var.g) && this.h == k8e0Var.h && u890.j(this.i, k8e0Var.i) && this.j == k8e0Var.j && this.k == k8e0Var.k && u890.j(this.l, k8e0Var.l) && u890.j(this.m, k8e0Var.m);
    }

    @Override // p.i7e0
    public final hwq getData() {
        return this.b;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31;
        String str = this.c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        x4i1 x4i1Var = this.e;
        int iD = cy30.d((iHashCode3 + (x4i1Var == null ? 0 : x4i1Var.hashCode())) * 31, 31, this.f);
        Boolean bool = this.g;
        int iG = xcg1.g((iD + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.h);
        zuc0 zuc0Var = this.i;
        int iHashCode4 = (iG + (zuc0Var == null ? 0 : zuc0Var.hashCode())) * 31;
        int i = this.j;
        return this.m.hashCode() + ((this.l.hashCode() + ab80.k(this.k, (iHashCode4 + (i != 0 ? l1d.C(i) : 0)) * 31, 31)) * 31);
    }
}

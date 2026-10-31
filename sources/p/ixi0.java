package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ixi0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final hux e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final hxi0 i;
    public final boolean j;
    public final iu30 k;

    public ixi0(String str, String str2, String str3, String str4, hux huxVar, boolean z, boolean z2, boolean z3, hxi0 hxi0Var, boolean z4, iu30 iu30Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = huxVar;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = hxi0Var;
        this.j = z4;
        this.k = iu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ixi0)) {
            return false;
        }
        ixi0 ixi0Var = (ixi0) obj;
        return this.a.equals(ixi0Var.a) && u890.j(this.b, ixi0Var.b) && u890.j(this.c, ixi0Var.c) && u890.j(this.d, ixi0Var.d) && u890.j(this.e, ixi0Var.e) && this.f == ixi0Var.f && this.g == ixi0Var.g && this.h == ixi0Var.h && this.i.equals(ixi0Var.i) && this.j == ixi0Var.j && u890.j(this.k, ixi0Var.k);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        hux huxVar = this.e;
        return this.k.hashCode() + xcg1.g((this.i.hashCode() + xcg1.g(xcg1.g(xcg1.g((iD + (huxVar == null ? 0 : huxVar.hashCode())) * 31, 31, this.f), 31, this.g), 31, this.h)) * 31, 31, this.j);
    }
}

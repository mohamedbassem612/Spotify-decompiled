package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class icf1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final tv80 f;
    public final boolean g;
    public final gyh h;
    public final l651 i;

    public icf1(String str, String str2, String str3, String str4, int i, tv80 tv80Var, boolean z, gyh gyhVar, l651 l651Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = tv80Var;
        this.g = z;
        this.h = gyhVar;
        this.i = l651Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof icf1)) {
            return false;
        }
        icf1 icf1Var = (icf1) obj;
        return u890.j(this.a, icf1Var.a) && this.b.equals(icf1Var.b) && u890.j(this.c, icf1Var.c) && u890.j(this.d, icf1Var.d) && this.e == icf1Var.e && u890.j(this.f, icf1Var.f) && this.g == icf1Var.g && this.h == icf1Var.h && this.i == icf1Var.i;
    }

    public final int hashCode() {
        int iF = kaa0.f(this.e, cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31);
        tv80 tv80Var = this.f;
        int iG = xcg1.g((iF + (tv80Var == null ? 0 : tv80Var.hashCode())) * 31, 31, this.g);
        gyh gyhVar = this.h;
        return this.i.hashCode() + ((iG + (gyhVar != null ? gyhVar.hashCode() : 0)) * 31);
    }
}

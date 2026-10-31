package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rx41 extends xyn1 {
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final gyh f;
    public final tv80 g;
    public final boolean h;

    public rx41(String str, String str2, String str3, int i, gyh gyhVar, tv80 tv80Var, boolean z) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = i;
        this.f = gyhVar;
        this.g = tv80Var;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rx41)) {
            return false;
        }
        rx41 rx41Var = (rx41) obj;
        return u890.j(this.b, rx41Var.b) && u890.j(this.c, rx41Var.c) && u890.j(this.d, rx41Var.d) && this.e == rx41Var.e && this.f == rx41Var.f && u890.j(this.g, rx41Var.g) && this.h == rx41Var.h;
    }

    public final int hashCode() {
        int iF = kaa0.f(this.e, cy30.d(cy30.d(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31);
        gyh gyhVar = this.f;
        int iHashCode = (iF + (gyhVar == null ? 0 : gyhVar.hashCode())) * 31;
        tv80 tv80Var = this.g;
        return Boolean.hashCode(this.h) + ((iHashCode + (tv80Var != null ? tv80Var.hashCode() : 0)) * 31);
    }

    public /* synthetic */ rx41(String str, String str2, String str3, int i, gyh gyhVar, tv80 tv80Var, boolean z, int i2) {
        this(str, str2, str3, i, (i2 & 16) != 0 ? null : gyhVar, (i2 & 32) != 0 ? null : tv80Var, z);
    }
}

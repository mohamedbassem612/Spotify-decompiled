package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class fkf {
    public final int a;
    public final String b;
    public final goe c;
    public final boolean d;
    public final boolean e;
    public final d0r f;

    public fkf(int i, String str, goe goeVar, boolean z, boolean z2, d0r d0rVar) {
        this.a = i;
        this.b = str;
        this.c = goeVar;
        this.d = z;
        this.e = z2;
        this.f = d0rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fkf)) {
            return false;
        }
        fkf fkfVar = (fkf) obj;
        return this.a == fkfVar.a && u890.j(this.b, fkfVar.b) && u890.j(this.c, fkfVar.c) && this.d == fkfVar.d && this.e == fkfVar.e && u890.j(this.f, fkfVar.f);
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g((this.c.hashCode() + cy30.d(Integer.hashCode(this.a) * 31, 31, this.b)) * 31, 31, this.d), 31, this.e);
        d0r d0rVar = this.f;
        return iG + (d0rVar == null ? 0 : d0rVar.hashCode());
    }
}

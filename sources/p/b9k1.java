package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class b9k1 extends d7p1 {
    public final String c;
    public final String d;
    public final boolean e;
    public final aey f;
    public final tv80 g;
    public final String h;
    public final boolean i;
    public final boolean j;

    public b9k1(String str, String str2, boolean z, aey aeyVar, tv80 tv80Var, String str3, boolean z2, int i) {
        str3 = (i & 64) != 0 ? null : str3;
        boolean z3 = (i & 128) == 0;
        z2 = (i & 256) != 0 ? false : z2;
        this.c = str;
        this.d = str2;
        this.e = z;
        this.f = aeyVar;
        this.g = tv80Var;
        this.h = str3;
        this.i = z3;
        this.j = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b9k1)) {
            return false;
        }
        b9k1 b9k1Var = (b9k1) obj;
        return u890.j(this.c, b9k1Var.c) && u890.j(this.d, b9k1Var.d) && this.e == b9k1Var.e && this.f == b9k1Var.f && this.g.equals(b9k1Var.g) && u890.j(this.h, b9k1Var.h) && this.i == b9k1Var.i && this.j == b9k1Var.j;
    }

    public final int hashCode() {
        int iHashCode = (this.g.hashCode() + ((this.f.hashCode() + xcg1.g(xcg1.g(cy30.d(this.c.hashCode() * 31, 31, this.d), 31, true), 31, this.e)) * 31)) * 31;
        String str = this.h;
        return Boolean.hashCode(this.j) + xcg1.g((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.i);
    }
}

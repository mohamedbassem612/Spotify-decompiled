package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gv31 implements aw31 {
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final Double g;

    public gv31(int i, int i2, String str, String str2, String str3, String str4, Double d) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gv31)) {
            return false;
        }
        gv31 gv31Var = (gv31) obj;
        return this.a == gv31Var.a && this.b == gv31Var.b && u890.j(this.c, gv31Var.c) && u890.j(this.d, gv31Var.d) && u890.j(this.e, gv31Var.e) && u890.j(this.f, gv31Var.f) && u890.j(this.g, gv31Var.g);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.g;
        return iHashCode + (d != null ? d.hashCode() : 0);
    }

    @Override // p.aw31
    public final int p() {
        return this.a;
    }
}

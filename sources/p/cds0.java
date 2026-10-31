package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class cds0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final String e;
    public final w281 f;
    public final v740 g;

    public cds0(String str, String str2, boolean z, String str3, String str4, w281 w281Var, v740 v740Var) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = str4;
        this.f = w281Var;
        this.g = v740Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cds0)) {
            return false;
        }
        cds0 cds0Var = (cds0) obj;
        return u890.j(this.a, cds0Var.a) && u890.j(this.b, cds0Var.b) && this.c == cds0Var.c && u890.j(this.d, cds0Var.d) && u890.j(this.e, cds0Var.e) && u890.j(this.f, cds0Var.f) && u890.j(this.g, cds0Var.g);
    }

    public final int hashCode() {
        int iD = cy30.d(xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        w281 w281Var = this.f;
        int iHashCode2 = (iHashCode + (w281Var == null ? 0 : w281Var.hashCode())) * 31;
        v740 v740Var = this.g;
        return iHashCode2 + (v740Var != null ? v740Var.a.hashCode() : 0);
    }
}

package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ps01 extends vs01 {
    public final String a;
    public final String b;
    public final String c;
    public final st01 d;
    public final boolean e;

    public ps01(String str, String str2, String str3, st01 st01Var, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = st01Var;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ps01)) {
            return false;
        }
        ps01 ps01Var = (ps01) obj;
        return u890.j(this.a, ps01Var.a) && u890.j(this.b, ps01Var.b) && u890.j(this.c, ps01Var.c) && this.d.equals(ps01Var.d) && this.e == ps01Var.e;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }
}

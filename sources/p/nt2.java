package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nt2 {
    public final h290 a;
    public final String b;
    public final String c;
    public final String d;

    public nt2(String str, String str2, String str3, h290 h290Var) {
        this.a = h290Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nt2)) {
            return false;
        }
        nt2 nt2Var = (nt2) obj;
        return this.a.equals(nt2Var.a) && this.b.equals(nt2Var.b) && this.c.equals(nt2Var.c) && u890.j(this.d, nt2Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return iD + (str == null ? 0 : str.hashCode());
    }
}

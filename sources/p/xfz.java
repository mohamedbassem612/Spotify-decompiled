package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xfz {
    public final String a;
    public final String b;
    public final String c;
    public final d8r0 d;
    public final grn1 e;

    public xfz(String str, String str2, String str3, d8r0 d8r0Var, grn1 grn1Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = d8r0Var;
        this.e = grn1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xfz)) {
            return false;
        }
        xfz xfzVar = (xfz) obj;
        return this.a.equals(xfzVar.a) && this.b.equals(xfzVar.b) && this.c.equals(xfzVar.c) && this.d.equals(xfzVar.d) && this.e.equals(xfzVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + hrt.i(this.d, cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }
}

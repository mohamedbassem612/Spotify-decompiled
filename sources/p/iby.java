package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class iby {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final dem1 e;

    public iby(String str, String str2, String str3, String str4, dem1 dem1Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = dem1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iby)) {
            return false;
        }
        iby ibyVar = (iby) obj;
        return this.a.equals(ibyVar.a) && this.b.equals(ibyVar.b) && this.c.equals(ibyVar.c) && u890.j(this.d, ibyVar.d) && this.e.equals(ibyVar.e);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return this.e.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }
}

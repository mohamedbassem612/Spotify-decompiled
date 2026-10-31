package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cvy0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public cvy0(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvy0)) {
            return false;
        }
        cvy0 cvy0Var = (cvy0) obj;
        return u890.j(this.a, cvy0Var.a) && u890.j(this.b, cvy0Var.b) && u890.j(this.c, cvy0Var.c) && u890.j(this.d, cvy0Var.d) && this.e.equals(cvy0Var.e);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return this.e.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }
}

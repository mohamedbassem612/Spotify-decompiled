package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class g2n {
    public final int a;
    public final String b;
    public final d8r0 c;
    public final String d;
    public final String e;
    public final String f;

    public g2n(int i, String str, d8r0 d8r0Var, String str2, String str3, String str4) {
        this.a = i;
        this.b = str;
        this.c = d8r0Var;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2n)) {
            return false;
        }
        g2n g2nVar = (g2n) obj;
        return this.a == g2nVar.a && u890.j(this.b, g2nVar.b) && this.c.equals(g2nVar.c) && u890.j(this.d, g2nVar.d) && u890.j(this.e, g2nVar.e) && u890.j(this.f, g2nVar.f);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(hrt.i(this.c, cy30.d(Integer.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d), 31, this.e);
        String str = this.f;
        return iD + (str == null ? 0 : str.hashCode());
    }
}

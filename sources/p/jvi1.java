package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jvi1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public jvi1(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jvi1)) {
            return false;
        }
        jvi1 jvi1Var = (jvi1) obj;
        return this.a.equals(jvi1Var.a) && u890.j(this.b, jvi1Var.b) && u890.j(this.c, jvi1Var.c) && u890.j(this.d, jvi1Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return iD + (str == null ? 0 : str.hashCode());
    }
}

package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class sy01 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final h290 e;

    public sy01(String str, String str2, String str3, String str4, h290 h290Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = h290Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sy01)) {
            return false;
        }
        sy01 sy01Var = (sy01) obj;
        return this.a.equals(sy01Var.a) && this.b.equals(sy01Var.b) && u890.j(this.c, sy01Var.c) && this.d.equals(sy01Var.d) && this.e.equals(sy01Var.e);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return kk0.g(this.e, cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31);
    }
}

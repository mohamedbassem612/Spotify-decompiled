package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class csu0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final yru0 e;

    public csu0(String str, String str2, boolean z, String str3, yru0 yru0Var) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = yru0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof csu0)) {
            return false;
        }
        csu0 csu0Var = (csu0) obj;
        return this.a.equals(csu0Var.a) && this.b.equals(csu0Var.b) && this.c == csu0Var.c && u890.j(this.d, csu0Var.d) && u890.j(this.e, csu0Var.e);
    }

    public final int hashCode() {
        int iG = xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
        yru0 yru0Var = this.e;
        return iHashCode + (yru0Var != null ? yru0Var.hashCode() : 0);
    }
}

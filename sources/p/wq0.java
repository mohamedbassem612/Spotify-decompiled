package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wq0 {
    public final ki0 a;
    public final String b;
    public final String c;
    public final String d;
    public final i6h1 e;

    public wq0(ki0 ki0Var, String str, String str2, String str3, i6h1 i6h1Var) {
        this.a = ki0Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = i6h1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wq0)) {
            return false;
        }
        wq0 wq0Var = (wq0) obj;
        return u890.j(this.a, wq0Var.a) && u890.j(this.b, wq0Var.b) && u890.j(this.c, wq0Var.c) && u890.j(this.d, wq0Var.d) && this.e.equals(wq0Var.e);
    }

    public final int hashCode() {
        ki0 ki0Var = this.a;
        int iHashCode = (ki0Var == null ? 0 : ki0Var.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return this.e.hashCode() + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }
}

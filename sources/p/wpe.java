package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wpe implements bqe {
    public final String a;
    public final uya1 b;
    public final String c;
    public final String d;

    public wpe(String str, uya1 uya1Var, String str2, String str3) {
        this.a = str;
        this.b = uya1Var;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wpe)) {
            return false;
        }
        wpe wpeVar = (wpe) obj;
        return u890.j(this.a, wpeVar.a) && u890.j(this.b, wpeVar.b) && this.c.equals(wpeVar.c) && u890.j(this.d, wpeVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        uya1 uya1Var = this.b;
        int iD = cy30.d((iHashCode + (uya1Var == null ? 0 : uya1Var.hashCode())) * 31, 31, this.c);
        String str = this.d;
        return iD + (str != null ? str.hashCode() : 0);
    }
}

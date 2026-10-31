package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class rg8 extends byo1 {
    public final String c;
    public final String d;
    public final String e;

    public rg8(String str, String str2, String str3) {
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rg8)) {
            return false;
        }
        rg8 rg8Var = (rg8) obj;
        return u890.j(this.c, rg8Var.c) && u890.j(this.d, rg8Var.d) && u890.j(this.e, rg8Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}

package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class usu0 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public usu0(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof usu0)) {
            return false;
        }
        usu0 usu0Var = (usu0) obj;
        return u890.j(this.a, usu0Var.a) && u890.j(this.b, usu0Var.b) && u890.j(this.c, usu0Var.c) && this.d == usu0Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}

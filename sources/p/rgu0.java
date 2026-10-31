package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rgu0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public rgu0(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rgu0)) {
            return false;
        }
        rgu0 rgu0Var = (rgu0) obj;
        return this.a.equals(rgu0Var.a) && u890.j(this.b, rgu0Var.b) && u890.j(this.c, rgu0Var.c) && u890.j(this.d, rgu0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}

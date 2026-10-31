package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dnk0 implements enk0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public dnk0(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public static dnk0 a(dnk0 dnk0Var, String str, String str2) {
        String str3 = dnk0Var.a;
        String str4 = dnk0Var.c;
        dnk0Var.getClass();
        return new dnk0(str3, str, str4, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnk0)) {
            return false;
        }
        dnk0 dnk0Var = (dnk0) obj;
        return this.a.equals(dnk0Var.a) && u890.j(this.b, dnk0Var.b) && u890.j(this.c, dnk0Var.c) && u890.j(this.d, dnk0Var.d);
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

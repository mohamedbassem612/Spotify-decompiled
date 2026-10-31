package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class x3k0 implements k4k0 {
    public final String a;
    public final String b;
    public final Double c;
    public final String d;

    public x3k0(String str, String str2, Double d, String str3) {
        this.a = str;
        this.b = str2;
        this.c = d;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x3k0)) {
            return false;
        }
        x3k0 x3k0Var = (x3k0) obj;
        return u890.j(this.a, x3k0Var.a) && u890.j(this.b, x3k0Var.b) && u890.j(this.c, x3k0Var.c) && u890.j(this.d, x3k0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.c;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }
}

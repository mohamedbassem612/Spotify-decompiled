package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class vhb0 implements xhb0 {
    public final String a;
    public final String b;
    public final Double c;
    public final String d;

    public vhb0(String str, String str2, Double d, String str3) {
        this.a = str;
        this.b = str2;
        this.c = d;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vhb0)) {
            return false;
        }
        vhb0 vhb0Var = (vhb0) obj;
        return u890.j(this.a, vhb0Var.a) && u890.j(this.b, vhb0Var.b) && u890.j(this.c, vhb0Var.c) && u890.j(this.d, vhb0Var.d);
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

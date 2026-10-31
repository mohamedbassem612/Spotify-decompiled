package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vx01 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;

    public vx01(String str, String str2, int i, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vx01)) {
            return false;
        }
        vx01 vx01Var = (vx01) obj;
        return u890.j(this.a, vx01Var.a) && u890.j(this.b, vx01Var.b) && u890.j(this.c, vx01Var.c) && this.d == vx01Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return l1d.C(this.d) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}

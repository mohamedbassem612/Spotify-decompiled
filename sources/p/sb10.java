package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class sb10 extends gto1 {
    public final String b;
    public final String c;
    public final String d;

    public sb10(String str, String str2, String str3) {
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sb10)) {
            return false;
        }
        sb10 sb10Var = (sb10) obj;
        return u890.j(this.b, sb10Var.b) && u890.j(this.c, sb10Var.c) && u890.j(this.d, sb10Var.d);
    }

    public final int hashCode() {
        String str = this.b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}

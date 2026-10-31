package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tv11 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Integer e;

    public tv11(String str, String str2, Integer num, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tv11)) {
            return false;
        }
        tv11 tv11Var = (tv11) obj;
        return u890.j(this.a, tv11Var.a) && u890.j(this.b, tv11Var.b) && u890.j(this.c, tv11Var.c) && u890.j(this.d, tv11Var.d) && u890.j(this.e, tv11Var.e);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.e;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }
}

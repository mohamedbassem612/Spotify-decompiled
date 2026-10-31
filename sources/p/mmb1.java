package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mmb1 extends qob1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public mmb1(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mmb1)) {
            return false;
        }
        mmb1 mmb1Var = (mmb1) obj;
        return u890.j(this.a, mmb1Var.a) && u890.j(this.b, mmb1Var.b) && u890.j(this.c, mmb1Var.c) && u890.j(this.d, mmb1Var.d) && u890.j(this.e, mmb1Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iD = cy30.d((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d);
        String str3 = this.e;
        return iD + (str3 != null ? str3.hashCode() : 0);
    }
}

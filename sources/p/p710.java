package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class p710 {
    public final String a;
    public final String b;
    public final String c;
    public final Integer d;
    public final String e;

    public p710(int i, Integer num, String str, String str2, String str3, String str4) {
        str2 = (i & 2) != 0 ? null : str2;
        str3 = (i & 4) != 0 ? null : str3;
        num = (i & 8) != 0 ? null : num;
        str4 = (i & 16) != 0 ? null : str4;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = num;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p710)) {
            return false;
        }
        p710 p710Var = (p710) obj;
        return this.a.equals(p710Var.a) && u890.j(this.b, p710Var.b) && u890.j(this.c, p710Var.c) && u890.j(this.d, p710Var.d) && u890.j(this.e, p710Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.e;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }
}

package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class cu70 {
    public final j47 a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final Integer g;
    public final bu70 h;
    public final boolean i;

    public /* synthetic */ cu70(j47 j47Var, String str, String str2, String str3, String str4, Integer num, bu70 bu70Var, int i) {
        this((i & 1) != 0 ? null : j47Var, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : "", (i & 32) != 0 ? null : str4, num, (i & 128) != 0 ? null : bu70Var, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cu70)) {
            return false;
        }
        cu70 cu70Var = (cu70) obj;
        return u890.j(this.a, cu70Var.a) && u890.j(this.b, cu70Var.b) && u890.j(this.c, cu70Var.c) && u890.j(this.d, cu70Var.d) && u890.j(this.e, cu70Var.e) && u890.j(this.f, cu70Var.f) && u890.j(this.g, cu70Var.g) && u890.j(this.h, cu70Var.h) && this.i == cu70Var.i;
    }

    public final int hashCode() {
        j47 j47Var = this.a;
        int iHashCode = (j47Var == null ? 0 : j47Var.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.g;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        bu70 bu70Var = this.h;
        return Boolean.hashCode(this.i) + ((iHashCode7 + (bu70Var != null ? bu70Var.hashCode() : 0)) * 31);
    }

    public cu70(j47 j47Var, String str, String str2, String str3, String str4, String str5, Integer num, bu70 bu70Var, boolean z) {
        this.a = j47Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = num;
        this.h = bu70Var;
        this.i = z;
    }
}

package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class x4i1 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;
    public final String f;
    public final Integer g;
    public final String h;

    public /* synthetic */ x4i1(int i, Integer num, String str, String str2, String str3, String str4) {
        this((i & 64) != 0 ? null : num, (i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 16) != 0 ? null : str4, null, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x4i1)) {
            return false;
        }
        x4i1 x4i1Var = (x4i1) obj;
        return u890.j(this.a, x4i1Var.a) && u890.j(this.b, x4i1Var.b) && u890.j(this.c, x4i1Var.c) && this.d == x4i1Var.d && u890.j(this.e, x4i1Var.e) && u890.j(this.f, x4i1Var.f) && u890.j(this.g, x4i1Var.g);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iG = xcg1.g((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        String str2 = this.e;
        int iHashCode = (iG + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.g;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public x4i1(Integer num, String str, String str2, String str3, String str4, String str5, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = str4;
        this.f = str5;
        this.g = num;
        if (z && str3 != null && str3.length() != 0) {
            str2 = str3;
        }
        this.h = str2;
    }
}

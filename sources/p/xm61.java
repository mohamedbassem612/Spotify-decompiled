package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xm61 implements an61 {
    public final Integer a;
    public final String b;
    public final Integer c;
    public final String d;
    public final Integer e;
    public final String f;
    public final Integer g;
    public final String h;
    public final xu30 i;
    public final xu30 j;
    public final wm61 k;

    public xm61(Integer num, String str, Integer num2, String str2, Integer num3, String str3, Integer num4, String str4, xu30 xu30Var, xu30 xu30Var2, wm61 wm61Var, int i) {
        num = (i & 1) != 0 ? null : num;
        str = (i & 2) != 0 ? null : str;
        num2 = (i & 4) != 0 ? null : num2;
        str2 = (i & 8) != 0 ? null : str2;
        num3 = (i & 16) != 0 ? null : num3;
        str3 = (i & 32) != 0 ? null : str3;
        num4 = (i & 64) != 0 ? null : num4;
        str4 = (i & 128) != 0 ? null : str4;
        this.a = num;
        this.b = str;
        this.c = num2;
        this.d = str2;
        this.e = num3;
        this.f = str3;
        this.g = num4;
        this.h = str4;
        this.i = xu30Var;
        this.j = xu30Var2;
        this.k = wm61Var;
        ero1.s(new Object[]{num, str}, w661.Y);
        ero1.s(new Object[]{num2, str2}, w661.Z);
        ero1.s(new Object[]{num3, str3}, w661.N0);
        ero1.s(new Object[]{num4, str4}, w661.O0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xm61)) {
            return false;
        }
        xm61 xm61Var = (xm61) obj;
        return u890.j(this.a, xm61Var.a) && u890.j(this.b, xm61Var.b) && u890.j(this.c, xm61Var.c) && u890.j(this.d, xm61Var.d) && u890.j(this.e, xm61Var.e) && u890.j(this.f, xm61Var.f) && u890.j(this.g, xm61Var.g) && u890.j(this.h, xm61Var.h) && this.i.equals(xm61Var.i) && this.j.equals(xm61Var.j) && this.k.equals(xm61Var.k);
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num3 = this.e;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num4 = this.g;
        int iHashCode7 = (iHashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str4 = this.h;
        return this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((iHashCode7 + (str4 != null ? str4.hashCode() : 0)) * 31)) * 31)) * 31);
    }
}

package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ev31 implements aw31 {
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final Double h;
    public final String i;

    public ev31(int i, int i2, String str, String str2, String str3, String str4, String str5, Double d, String str6) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = d;
        this.i = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ev31)) {
            return false;
        }
        ev31 ev31Var = (ev31) obj;
        return this.a == ev31Var.a && this.b == ev31Var.b && u890.j(this.c, ev31Var.c) && u890.j(this.d, ev31Var.d) && u890.j(this.e, ev31Var.e) && u890.j(this.f, ev31Var.f) && u890.j(this.g, ev31Var.g) && u890.j(this.h, ev31Var.h) && u890.j(this.i, ev31Var.i);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d = this.h;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        String str3 = this.i;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // p.aw31
    public final int p() {
        return this.a;
    }
}

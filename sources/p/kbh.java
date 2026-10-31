package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kbh implements cpe0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final woe0 e;
    public final woe0 f;
    public final woe0 g;
    public final woe0 h;

    public kbh(String str, String str2, String str3, String str4, woe0 woe0Var, woe0 woe0Var2, woe0 woe0Var3, woe0 woe0Var4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = woe0Var;
        this.f = woe0Var2;
        this.g = woe0Var3;
        this.h = woe0Var4;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kbh)) {
            return false;
        }
        kbh kbhVar = (kbh) obj;
        return u890.j(this.a, kbhVar.a) && u890.j(this.b, kbhVar.b) && this.c.equals(kbhVar.c) && this.d.equals(kbhVar.d) && this.e.equals(kbhVar.e) && u890.j(this.f, kbhVar.f) && u890.j(this.g, kbhVar.g) && u890.j(this.h, kbhVar.h);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (this.e.hashCode() + cy30.d(cy30.d((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.c), 31, this.d)) * 31;
        woe0 woe0Var = this.f;
        int iHashCode3 = (iHashCode2 + (woe0Var == null ? 0 : woe0Var.hashCode())) * 31;
        woe0 woe0Var2 = this.g;
        int iHashCode4 = (iHashCode3 + (woe0Var2 == null ? 0 : woe0Var2.hashCode())) * 31;
        woe0 woe0Var3 = this.h;
        return iHashCode4 + (woe0Var3 != null ? woe0Var3.hashCode() : 0);
    }
}

package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class efk {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final d8r0 h;
    public final int i;
    public final Integer j;
    public final String k;

    public efk(String str, String str2, String str3, String str4, String str5, String str6, String str7, d8r0 d8r0Var, int i, Integer num, String str8) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = d8r0Var;
        this.i = i;
        this.j = num;
        this.k = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof efk)) {
            return false;
        }
        efk efkVar = (efk) obj;
        return u890.j(this.a, efkVar.a) && u890.j(this.b, efkVar.b) && u890.j(this.c, efkVar.c) && u890.j(this.d, efkVar.d) && this.e.equals(efkVar.e) && u890.j(this.f, efkVar.f) && u890.j(this.g, efkVar.g) && this.h.equals(efkVar.h) && this.i == efkVar.i && u890.j(this.j, efkVar.j) && u890.j(this.k, efkVar.k);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iF = kaa0.f(this.i, hrt.i(this.h, cy30.d(cy30.d(cy30.d(cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31), 31);
        Integer num = this.j;
        int iHashCode = (iF + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.k;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}

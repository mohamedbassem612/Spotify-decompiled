package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uog {
    public final String a;
    public final long b;
    public final o571 c;
    public final String d;
    public final long e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final Integer j;
    public final String k;

    public uog(String str, long j, o571 o571Var, String str2, long j2, String str3, String str4, String str5, String str6, Integer num, String str7) {
        this.a = str;
        this.b = j;
        this.c = o571Var;
        this.d = str2;
        this.e = j2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = num;
        this.k = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uog)) {
            return false;
        }
        uog uogVar = (uog) obj;
        return this.a.equals(uogVar.a) && this.b == uogVar.b && u890.j(this.c, uogVar.c) && u890.j(this.d, uogVar.d) && this.e == uogVar.e && this.f.equals(uogVar.f) && u890.j(this.g, uogVar.g) && u890.j(this.h, uogVar.h) && u890.j(this.i, uogVar.i) && this.j.equals(uogVar.j) && u890.j(this.k, uogVar.k);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.f(cy30.d((this.c.hashCode() + cy30.f(this.a.hashCode() * 31, this.b, 31)) * 31, 31, this.d), this.e, 31), 31, this.f), 31, this.g);
        String str = this.h;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        int iE = pze0.e((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.j);
        String str3 = this.k;
        return iE + (str3 != null ? str3.hashCode() : 0);
    }
}

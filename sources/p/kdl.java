package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kdl {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final cdl f;
    public final int g;
    public final int h;

    public kdl(String str, String str2, String str3, String str4, String str5, cdl cdlVar, int i, int i2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = cdlVar;
        this.g = i;
        this.h = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kdl)) {
            return false;
        }
        kdl kdlVar = (kdl) obj;
        return u890.j(this.a, kdlVar.a) && u890.j(this.b, kdlVar.b) && u890.j(this.c, kdlVar.c) && u890.j(this.d, kdlVar.d) && u890.j(this.e, kdlVar.e) && this.f.equals(kdlVar.f) && this.g == kdlVar.g && this.h == kdlVar.h;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iF = kaa0.f(this.g, (this.f.hashCode() + cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.e)) * 31, 31);
        int i = this.h;
        return iF + (i != 0 ? l1d.C(i) : 0);
    }
}

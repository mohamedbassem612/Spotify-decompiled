package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fhb {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final String g;
    public final String h;
    public final boolean i;
    public final String j;

    public fhb(String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, boolean z2, String str8) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = z;
        this.g = str6;
        this.h = str7;
        this.i = z2;
        this.j = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fhb)) {
            return false;
        }
        fhb fhbVar = (fhb) obj;
        return u890.j(this.a, fhbVar.a) && u890.j(this.b, fhbVar.b) && u890.j(this.c, fhbVar.c) && u890.j(this.d, fhbVar.d) && u890.j(this.e, fhbVar.e) && this.f == fhbVar.f && u890.j(this.g, fhbVar.g) && u890.j(this.h, fhbVar.h) && this.i == fhbVar.i && u890.j(this.j, fhbVar.j);
    }

    public final int hashCode() {
        int iG = xcg1.g(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        String str = this.g;
        int iG2 = xcg1.g(cy30.d((iG + (str == null ? 0 : str.hashCode())) * 31, 31, this.h), 31, this.i);
        String str2 = this.j;
        return iG2 + (str2 != null ? str2.hashCode() : 0);
    }
}

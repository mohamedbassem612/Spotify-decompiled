package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ffk {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final String h;
    public final d8r0 i;

    public ffk(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, d8r0 d8r0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = z;
        this.h = str7;
        this.i = d8r0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ffk)) {
            return false;
        }
        ffk ffkVar = (ffk) obj;
        return u890.j(this.a, ffkVar.a) && u890.j(this.b, ffkVar.b) && u890.j(this.c, ffkVar.c) && u890.j(this.d, ffkVar.d) && this.e.equals(ffkVar.e) && u890.j(this.f, ffkVar.f) && this.g == ffkVar.g && u890.j(this.h, ffkVar.h) && this.i.equals(ffkVar.i);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.i.hashCode() + cy30.d(xcg1.g(xcg1.g(xcg1.g(cy30.d(cy30.d(cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, true), 31, this.g), 31, false), 31, this.h);
    }
}

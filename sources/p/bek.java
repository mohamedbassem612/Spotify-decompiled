package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bek {
    public final String a;
    public final String b;
    public final String c;
    public final iek d;
    public final String e;
    public final d8r0 f;
    public final String g;
    public final int h;
    public final String i;
    public final String j;

    public bek(String str, String str2, String str3, iek iekVar, String str4, d8r0 d8r0Var, String str5, int i, String str6, String str7) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = iekVar;
        this.e = str4;
        this.f = d8r0Var;
        this.g = str5;
        this.h = i;
        this.i = str6;
        this.j = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bek)) {
            return false;
        }
        bek bekVar = (bek) obj;
        return u890.j(this.a, bekVar.a) && u890.j(this.b, bekVar.b) && u890.j(this.c, bekVar.c) && u890.j(this.d, bekVar.d) && u890.j(this.e, bekVar.e) && this.f.equals(bekVar.f) && u890.j(this.g, bekVar.g) && this.h == bekVar.h && u890.j(this.i, bekVar.i) && u890.j(this.j, bekVar.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + cy30.d(kaa0.f(this.h, cy30.d(hrt.i(this.f, cy30.d((this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, this.e), 31), 31, this.g), 31), 31, this.i);
    }
}

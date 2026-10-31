package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zri0 {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final c380 g;
    public final String h;
    public final yri0 i;

    public zri0(String str, String str2, int i, String str3, String str4, String str5, c380 c380Var, String str6, yri0 yri0Var) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = c380Var;
        this.h = str6;
        this.i = yri0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zri0)) {
            return false;
        }
        zri0 zri0Var = (zri0) obj;
        return u890.j(this.a, zri0Var.a) && u890.j(this.b, zri0Var.b) && this.c == zri0Var.c && u890.j(this.d, zri0Var.d) && this.e.equals(zri0Var.e) && this.f.equals(zri0Var.f) && u890.j(this.g, zri0Var.g) && this.h.equals(zri0Var.h) && this.i.equals(zri0Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + cy30.d(kk0.f(this.g, cy30.d(cy30.d(cy30.d(kaa0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31, this.f), 31), 31, this.h);
    }
}

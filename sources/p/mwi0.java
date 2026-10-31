package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mwi0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final d8r0 g;
    public final boolean h;

    public mwi0(String str, String str2, String str3, String str4, String str5, String str6, d8r0 d8r0Var, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = d8r0Var;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mwi0)) {
            return false;
        }
        mwi0 mwi0Var = (mwi0) obj;
        return u890.j(this.a, mwi0Var.a) && u890.j(this.b, mwi0Var.b) && u890.j(this.c, mwi0Var.c) && u890.j(this.d, mwi0Var.d) && u890.j(this.e, mwi0Var.e) && u890.j(this.f, mwi0Var.f) && this.g.equals(mwi0Var.g) && this.h == mwi0Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + hrt.i(this.g, cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31);
    }
}

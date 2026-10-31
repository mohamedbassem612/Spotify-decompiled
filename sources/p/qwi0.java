package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qwi0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final d8r0 g;
    public final boolean h;

    public qwi0(String str, String str2, String str3, String str4, String str5, String str6, d8r0 d8r0Var, boolean z) {
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
        if (!(obj instanceof qwi0)) {
            return false;
        }
        qwi0 qwi0Var = (qwi0) obj;
        return u890.j(this.a, qwi0Var.a) && u890.j(this.b, qwi0Var.b) && u890.j(this.c, qwi0Var.c) && u890.j(this.d, qwi0Var.d) && u890.j(this.e, qwi0Var.e) && u890.j(this.f, qwi0Var.f) && this.g.equals(qwi0Var.g) && this.h == qwi0Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + hrt.i(this.g, cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31);
    }
}

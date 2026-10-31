package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jdx0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final String f;
    public final d8r0 g;
    public final List h;

    public jdx0(String str, String str2, String str3, String str4, boolean z, String str5, d8r0 d8r0Var, List list) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = str5;
        this.g = d8r0Var;
        this.h = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jdx0)) {
            return false;
        }
        jdx0 jdx0Var = (jdx0) obj;
        return u890.j(this.a, jdx0Var.a) && u890.j(this.b, jdx0Var.b) && u890.j(this.c, jdx0Var.c) && u890.j(this.d, jdx0Var.d) && this.e == jdx0Var.e && u890.j(this.f, jdx0Var.f) && this.g.equals(jdx0Var.g) && this.h.equals(jdx0Var.h);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.h.hashCode() + hrt.i(this.g, cy30.d(xcg1.g(cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31);
    }
}

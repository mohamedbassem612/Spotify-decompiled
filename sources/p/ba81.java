package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ba81 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final d8r0 g;
    public final List h;
    public final boolean i;

    public ba81(String str, String str2, String str3, String str4, String str5, String str6, d8r0 d8r0Var, List list, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = d8r0Var;
        this.h = list;
        this.i = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ba81)) {
            return false;
        }
        ba81 ba81Var = (ba81) obj;
        return u890.j(this.a, ba81Var.a) && u890.j(this.b, ba81Var.b) && u890.j(this.c, ba81Var.c) && u890.j(this.d, ba81Var.d) && u890.j(this.e, ba81Var.e) && u890.j(this.f, ba81Var.f) && this.g.equals(ba81Var.g) && this.h.equals(ba81Var.h) && this.i == ba81Var.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + f4i1.b(hrt.i(this.g, cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31), 31, this.h);
    }
}

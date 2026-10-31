package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pfj1 {
    public final String a;
    public final String b;
    public final atj1 c;
    public final String d;
    public final d8r0 e;
    public final int f;
    public final List g;

    public pfj1(String str, String str2, atj1 atj1Var, String str3, d8r0 d8r0Var, int i, List list) {
        this.a = str;
        this.b = str2;
        this.c = atj1Var;
        this.d = str3;
        this.e = d8r0Var;
        this.f = i;
        this.g = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pfj1)) {
            return false;
        }
        pfj1 pfj1Var = (pfj1) obj;
        return u890.j(this.a, pfj1Var.a) && u890.j(this.b, pfj1Var.b) && this.c.equals(pfj1Var.c) && u890.j(this.d, pfj1Var.d) && this.e.equals(pfj1Var.e) && this.f == pfj1Var.f && this.g.equals(pfj1Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + kaa0.f(this.f, hrt.i(this.e, cy30.d((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31), 31);
    }
}

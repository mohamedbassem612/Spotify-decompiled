package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jd21 {
    public final List a;
    public final List b;
    public final c380 c;
    public final shn0 d;
    public final boolean e;

    public jd21(List list, List list2, c9 c9Var, shn0 shn0Var) {
        this.a = list;
        this.b = list2;
        this.c = c9Var;
        this.d = shn0Var;
        this.e = c9Var.b() > 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jd21)) {
            return false;
        }
        jd21 jd21Var = (jd21) obj;
        return this.a.equals(jd21Var.a) && this.b.equals(jd21Var.b) && this.c.equals(jd21Var.c) && this.d == jd21Var.d;
    }

    public final int hashCode() {
        int iF = kk0.f(this.c, f4i1.b(this.a.hashCode() * 31, 31, this.b), 31);
        shn0 shn0Var = this.d;
        return iF + (shn0Var == null ? 0 : shn0Var.hashCode());
    }
}

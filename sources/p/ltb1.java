package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ltb1 implements ptb1 {
    public final String a;
    public final d761 b;
    public final d761 c;
    public final String d;
    public final String e;
    public final boolean f;

    public ltb1(String str, d761 d761Var, d761 d761Var2, String str2, String str3, boolean z) {
        this.a = str;
        this.b = d761Var;
        this.c = d761Var2;
        this.d = str2;
        this.e = str3;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ltb1)) {
            return false;
        }
        ltb1 ltb1Var = (ltb1) obj;
        return this.a.equals(ltb1Var.a) && this.b.equals(ltb1Var.b) && u890.j(this.c, ltb1Var.c) && this.d.equals(ltb1Var.d) && this.e.equals(ltb1Var.e) && this.f == ltb1Var.f;
    }

    public final int hashCode() {
        int iF = ktd.f(this.a.hashCode() * 31, this.b.a, 31);
        d761 d761Var = this.c;
        return Boolean.hashCode(this.f) + cy30.d(cy30.d((iF + (d761Var == null ? 0 : Arrays.hashCode(d761Var.a))) * 31, 31, this.d), 31, this.e);
    }
}

package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class za60 {
    public final d761 a;
    public final d761 b;
    public final String c;

    public za60(d761 d761Var, d761 d761Var2, String str) {
        this.a = d761Var;
        this.b = d761Var2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof za60)) {
            return false;
        }
        za60 za60Var = (za60) obj;
        return this.a.equals(za60Var.a) && this.b.equals(za60Var.b) && u890.j(this.c, za60Var.c);
    }

    public final int hashCode() {
        int iF = ktd.f(Arrays.hashCode(this.a.a) * 31, this.b.a, 31);
        String str = this.c;
        return iF + (str == null ? 0 : str.hashCode());
    }
}

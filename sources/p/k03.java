package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class k03 {
    public final String a;
    public final ArrayList b;
    public final String c;
    public final n6r0 d;
    public final lik1 e;

    public k03(String str, ArrayList arrayList, String str2, n6r0 n6r0Var, lik1 lik1Var) {
        this.a = str;
        this.b = arrayList;
        this.c = str2;
        this.d = n6r0Var;
        this.e = lik1Var;
    }

    public final n6r0 a() {
        return this.d;
    }

    public final lik1 b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k03)) {
            return false;
        }
        k03 k03Var = (k03) obj;
        return u890.j(this.a, k03Var.a) && this.b.equals(k03Var.b) && u890.j(this.c, k03Var.c) && u890.j(this.d, k03Var.d) && u890.j(this.e, k03Var.e);
    }

    public final int hashCode() {
        int iF = p3d1.f(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
        n6r0 n6r0Var = this.d;
        int iHashCode2 = (iHashCode + (n6r0Var == null ? 0 : n6r0Var.hashCode())) * 31;
        lik1 lik1Var = this.e;
        return iHashCode2 + (lik1Var != null ? lik1Var.a.hashCode() : 0);
    }
}

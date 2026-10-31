package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class q9a1 {
    public final String a;
    public final ArrayList b;
    public final String c;
    public final int d;
    public final qtt0 e;
    public final String f;

    public q9a1(String str, ArrayList arrayList, String str2, int i, qtt0 qtt0Var, String str3) {
        this.a = str;
        this.b = arrayList;
        this.c = str2;
        this.d = i;
        this.e = qtt0Var;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q9a1)) {
            return false;
        }
        q9a1 q9a1Var = (q9a1) obj;
        return u890.j(this.a, q9a1Var.a) && this.b.equals(q9a1Var.b) && u890.j(this.c, q9a1Var.c) && this.d == q9a1Var.d && this.e == q9a1Var.e && u890.j(this.f, q9a1Var.f);
    }

    public final int hashCode() {
        int iF = p3d1.f(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        int iK = ab80.k(this.d, (iF + (str == null ? 0 : str.hashCode())) * 31, 31);
        qtt0 qtt0Var = this.e;
        int iHashCode = (iK + (qtt0Var == null ? 0 : qtt0Var.hashCode())) * 31;
        String str2 = this.f;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}

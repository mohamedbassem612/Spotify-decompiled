package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class w1c implements gfh0 {
    public final tl3 a;
    public final boolean b;

    public w1c(tl3 tl3Var, boolean z) {
        this.a = tl3Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1c)) {
            return false;
        }
        w1c w1cVar = (w1c) obj;
        return u890.j(this.a, w1cVar.a) && this.b == w1cVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @Override // p.gfh0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final hfh0 mo23measure3p2s80s(ifh0 ifh0Var, List list, long j) {
        q5t0 q5t0VarH;
        int iMax;
        int i;
        boolean zIsEmpty = list.isEmpty();
        b7x b7xVar = b7x.a;
        if (zIsEmpty) {
            return ifh0Var.S(hjl.k(j), hjl.j(j), b7xVar, new u1c((byte) 0));
        }
        long j2 = this.b ? j : j & (-8589934589L);
        if (list.size() == 1) {
            afh0 afh0Var = (afh0) list.get(0);
            Object objG = afh0Var.g();
            p1c p1cVar = objG instanceof p1c ? (p1c) objG : null;
            if (p1cVar != null ? p1cVar.P0 : false) {
                int iK = hjl.k(j);
                int iJ = hjl.j(j);
                int iK2 = hjl.k(j);
                int iJ2 = hjl.j(j);
                if (!((iJ2 >= 0) & (iK2 >= 0))) {
                    sf80.a("width and height must be >= 0");
                }
                q5t0VarH = afh0Var.H(jjl.h(iK2, iK2, iJ2, iJ2));
                iMax = iJ;
                i = iK;
            } else {
                q5t0 q5t0VarH2 = afh0Var.H(j2);
                int iMax2 = Math.max(hjl.k(j), q5t0VarH2.a);
                iMax = Math.max(hjl.j(j), q5t0VarH2.b);
                i = iMax2;
                q5t0VarH = q5t0VarH2;
            }
            return ifh0Var.S(i, iMax, b7xVar, new v1c(q5t0VarH, afh0Var, ifh0Var, i, iMax, this));
        }
        q5t0[] q5t0VarArr = new q5t0[list.size()];
        n811 n811Var = new n811();
        n811Var.a = hjl.k(j);
        n811 n811Var2 = new n811();
        n811Var2.a = hjl.j(j);
        List list2 = list;
        int size = list2.size();
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            afh0 afh0Var2 = (afh0) list.get(i2);
            Object objG2 = afh0Var2.g();
            p1c p1cVar2 = objG2 instanceof p1c ? (p1c) objG2 : null;
            if (p1cVar2 != null ? p1cVar2.P0 : false) {
                z = true;
            } else {
                q5t0 q5t0VarH3 = afh0Var2.H(j2);
                q5t0VarArr[i2] = q5t0VarH3;
                n811Var.a = Math.max(n811Var.a, q5t0VarH3.a);
                n811Var2.a = Math.max(n811Var2.a, q5t0VarH3.b);
            }
        }
        if (z) {
            int i3 = n811Var.a;
            int i4 = i3 != Integer.MAX_VALUE ? i3 : 0;
            int i5 = n811Var2.a;
            long jA = jjl.a(i4, i3, i5 != Integer.MAX_VALUE ? i5 : 0, i5);
            int size2 = list2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                afh0 afh0Var3 = (afh0) list.get(i6);
                Object objG3 = afh0Var3.g();
                p1c p1cVar3 = objG3 instanceof p1c ? (p1c) objG3 : null;
                if (p1cVar3 != null ? p1cVar3.P0 : false) {
                    q5t0VarArr[i6] = afh0Var3.H(jA);
                }
            }
        }
        return ifh0Var.S(n811Var.a, n811Var2.a, b7xVar, new kqb(q5t0VarArr, list, ifh0Var, n811Var, n811Var2, this, (byte) 1));
    }

    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.a + ", propagateMinConstraints=" + this.b + ")";
    }
}

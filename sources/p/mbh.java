package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class mbh implements gfh0, ht31 {
    public final g36 a;
    public final nl3 b;

    public mbh(g36 g36Var, nl3 nl3Var) {
        this.a = g36Var;
        this.b = nl3Var;
    }

    @Override // p.ht31
    public final int a(q5t0 q5t0Var) {
        return q5t0Var.a;
    }

    @Override // p.ht31
    public final void b(int i, int[] iArr, int[] iArr2, ifh0 ifh0Var) {
        this.a.b(ifh0Var, i, iArr, iArr2);
    }

    @Override // p.ht31
    public final hfh0 c(q5t0[] q5t0VarArr, ifh0 ifh0Var, int i, int[] iArr, int i2, int i3, int[] iArr2, int i4, int i5, int i6) {
        return ifh0Var.S(i3, i2, b7x.a, new v1c(q5t0VarArr, this, i3, i, ifh0Var, iArr));
    }

    @Override // p.ht31
    public final long d(boolean z, int i, int i2, int i3, int i4) {
        return !z ? jjl.a(i2, i4, i, i3) : m5n1.u(i2, i4, i, i3);
    }

    @Override // p.ht31
    public final int e(q5t0 q5t0Var) {
        return q5t0Var.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mbh)) {
            return false;
        }
        mbh mbhVar = (mbh) obj;
        return u890.j(this.a, mbhVar.a) && u890.j(this.b, mbhVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // p.gfh0
    public final int maxIntrinsicHeight(p890 p890Var, List list, int i) {
        return cxm.o(i, p890Var.i0(this.a.a()), list);
    }

    @Override // p.gfh0
    public final int maxIntrinsicWidth(p890 p890Var, List list, int i) {
        return cxm.p(i, p890Var.i0(this.a.a()), list);
    }

    @Override // p.gfh0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final hfh0 mo23measure3p2s80s(ifh0 ifh0Var, List list, long j) {
        return c680.E(this, hjl.j(j), hjl.k(j), hjl.h(j), hjl.i(j), ifh0Var.i0(this.a.a()), ifh0Var, list, new q5t0[list.size()], list.size());
    }

    @Override // p.gfh0
    public final int minIntrinsicHeight(p890 p890Var, List list, int i) {
        return cxm.q(i, p890Var.i0(this.a.a()), list);
    }

    @Override // p.gfh0
    public final int minIntrinsicWidth(p890 p890Var, List list, int i) {
        return cxm.r(i, p890Var.i0(this.a.a()), list);
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.a + ", horizontalAlignment=" + this.b + ")";
    }
}

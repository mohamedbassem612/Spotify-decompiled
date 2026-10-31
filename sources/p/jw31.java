package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class jw31 implements gfh0, ht31 {
    public final c36 a;
    public final pl3 b;

    public jw31(c36 c36Var, pl3 pl3Var) {
        this.a = c36Var;
        this.b = pl3Var;
    }

    @Override // p.ht31
    public final int a(q5t0 q5t0Var) {
        return q5t0Var.b;
    }

    @Override // p.ht31
    public final void b(int i, int[] iArr, int[] iArr2, ifh0 ifh0Var) {
        this.a.e(ifh0Var, i, iArr, ifh0Var.getLayoutDirection(), iArr2);
    }

    @Override // p.ht31
    public final hfh0 c(q5t0[] q5t0VarArr, ifh0 ifh0Var, int i, int[] iArr, int i2, int i3, int[] iArr2, int i4, int i5, int i6) {
        return ifh0Var.S(i2, i3, b7x.a, new iw31(q5t0VarArr, this, i3, i, iArr));
    }

    @Override // p.ht31
    public final long d(boolean z, int i, int i2, int i3, int i4) {
        return !z ? jjl.a(i, i3, i2, i4) : m5n1.v(i, i3, i2, i4);
    }

    @Override // p.ht31
    public final int e(q5t0 q5t0Var) {
        return q5t0Var.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jw31)) {
            return false;
        }
        jw31 jw31Var = (jw31) obj;
        return this.a.equals(jw31Var.a) && u890.j(this.b, jw31Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // p.gfh0
    public final int maxIntrinsicHeight(p890 p890Var, List list, int i) {
        return cxm.c(i, p890Var.i0(this.a.a()), list);
    }

    @Override // p.gfh0
    public final int maxIntrinsicWidth(p890 p890Var, List list, int i) {
        return cxm.d(i, p890Var.i0(this.a.a()), list);
    }

    @Override // p.gfh0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final hfh0 mo23measure3p2s80s(ifh0 ifh0Var, List list, long j) {
        return c680.E(this, hjl.k(j), hjl.j(j), hjl.i(j), hjl.h(j), ifh0Var.i0(this.a.a()), ifh0Var, list, new q5t0[list.size()], list.size());
    }

    @Override // p.gfh0
    public final int minIntrinsicHeight(p890 p890Var, List list, int i) {
        return cxm.e(i, p890Var.i0(this.a.a()), list);
    }

    @Override // p.gfh0
    public final int minIntrinsicWidth(p890 p890Var, List list, int i) {
        return cxm.f(i, p890Var.i0(this.a.a()), list);
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.a + ", verticalAlignment=" + this.b + ")";
    }
}

package p;

import android.util.SparseArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class nj30 implements fn51 {
    public final SparseArray a;
    public final SparseArray b;
    public final long c;
    public final long d;
    public final int e;

    public nj30(SparseArray sparseArray, SparseArray sparseArray2, long j, long j2, int i) {
        this.a = sparseArray;
        this.b = sparseArray2;
        this.c = j;
        this.d = j2;
        this.e = i;
    }

    @Override // p.fn51
    public final en51 b(long j) {
        SparseArray sparseArray = this.a;
        int i = this.e;
        long[] jArr = (long[]) sparseArray.get(i);
        SparseArray sparseArray2 = this.b;
        long[] jArr2 = (long[]) sparseArray2.get(i);
        if (jArr == null || jArr2 == null) {
            jArr = (long[]) sparseArray.get(i);
            jArr2 = (long[]) sparseArray2.get(i);
            if (jArr == null || jArr2 == null) {
                jArr = (long[]) sparseArray.valueAt(0);
                jArr2 = (long[]) sparseArray2.valueAt(0);
            }
        }
        if (jArr.length == 0 || j < jArr[0]) {
            pn51 pn51Var = new pn51(0L, this.d);
            return new en51(pn51Var, pn51Var);
        }
        int iF = zoi1.f(jArr, j, true);
        pn51 pn51Var2 = new pn51(jArr[iF], jArr2[iF]);
        return new en51(pn51Var2, pn51Var2);
    }

    @Override // p.fn51
    public final boolean d() {
        return true;
    }

    @Override // p.fn51
    public final long g() {
        return this.c;
    }
}

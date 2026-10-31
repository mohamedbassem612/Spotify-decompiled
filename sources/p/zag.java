package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zag implements fn51 {
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    public final long f;

    public zag(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.a = length;
        if (length <= 0) {
            this.f = 0L;
        } else {
            int i = length - 1;
            this.f = jArr2[i] + jArr3[i];
        }
    }

    @Override // p.fn51
    public final en51 b(long j) {
        long[] jArr = this.e;
        int iF = zoi1.f(jArr, j, true);
        long j2 = jArr[iF];
        long[] jArr2 = this.c;
        pn51 pn51Var = new pn51(j2, jArr2[iF]);
        if (j2 >= j || iF == this.a - 1) {
            return new en51(pn51Var, pn51Var);
        }
        int i = iF + 1;
        return new en51(pn51Var, new pn51(jArr[i], jArr2[i]));
    }

    @Override // p.fn51
    public final boolean d() {
        return true;
    }

    @Override // p.fn51
    public final long g() {
        return this.f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.a + ", sizes=" + Arrays.toString(this.b) + ", offsets=" + Arrays.toString(this.c) + ", timeUs=" + Arrays.toString(this.e) + ", durationsUs=" + Arrays.toString(this.d) + ")";
    }
}

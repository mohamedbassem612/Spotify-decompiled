package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class opm0 implements fn51 {
    public final long a;
    public final ppm0[] b;
    public final int c;

    public opm0(long j, ppm0[] ppm0VarArr, int i) {
        this.a = j;
        this.b = ppm0VarArr;
        this.c = i;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0061 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0063  */
    /* JADX WARN: Code duplicated, block: B:29:0x0074  */
    /* JADX WARN: Code duplicated, block: B:32:0x007b  */
    /* JADX WARN: Code duplicated, block: B:35:0x0085  */
    /* JADX WARN: Code duplicated, block: B:37:0x008b  */
    /* JADX WARN: Code duplicated, block: B:40:0x0092  */
    /* JADX WARN: Code duplicated, block: B:41:0x0099  */
    /* JADX WARN: Code duplicated, block: B:45:0x00af  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:51:0x009e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x009e A[SYNTHETIC] */
    @Override // p.fn51
    public final en51 b(long j) {
        long j2;
        long j3;
        long jMin;
        long j4;
        int i;
        long jMin2;
        pn51 pn51Var;
        en51 en51Var;
        uzf1 uzf1Var;
        long[] jArr;
        int iA;
        int iA2;
        int iB;
        ppm0[] ppm0VarArr = this.b;
        int length = ppm0VarArr.length;
        pn51 pn51Var2 = pn51.c;
        if (length == 0) {
            return new en51(pn51Var2, pn51Var2);
        }
        int i2 = this.c;
        if (i2 != -1) {
            uzf1 uzf1Var2 = ppm0VarArr[i2].b;
            int iA3 = uzf1Var2.a(j);
            if (iA3 == -1) {
                iA3 = uzf1Var2.b(j);
            }
            long[] jArr2 = uzf1Var2.c;
            long[] jArr3 = uzf1Var2.f;
            if (iA3 == -1) {
                return new en51(pn51Var2, pn51Var2);
            }
            j3 = jArr3[iA3];
            j2 = jArr2[iA3];
            if (j3 < j && iA3 < uzf1Var2.b - 1 && (iB = uzf1Var2.b(j)) != -1 && iB != iA3) {
                j4 = jArr3[iB];
                jMin = jArr2[iB];
            }
            jMin2 = j2;
            for (i = 0; i < ppm0VarArr.length; i++) {
                if (i != i2) {
                    uzf1Var = ppm0VarArr[i].b;
                    jArr = uzf1Var.c;
                    iA = uzf1Var.a(j3);
                    if (iA == -1) {
                        iA = uzf1Var.b(j3);
                    }
                    if (iA != -1) {
                        jMin2 = Math.min(jArr[iA], jMin2);
                    }
                    if (j4 == -9223372036854775807L) {
                        iA2 = uzf1Var.a(j4);
                        if (iA2 == -1) {
                            iA2 = uzf1Var.b(j4);
                        }
                        if (iA2 == -1) {
                            jMin = Math.min(jArr[iA2], jMin);
                        }
                    }
                }
            }
            pn51Var = new pn51(j3, jMin2);
            if (j4 == -9223372036854775807L) {
                en51Var = new en51(pn51Var, pn51Var);
            } else {
                en51Var = new en51(pn51Var, new pn51(j4, jMin));
            }
            return en51Var;
        }
        j2 = Long.MAX_VALUE;
        j3 = j;
        jMin = -1;
        j4 = -9223372036854775807L;
        jMin2 = j2;
        while (i < ppm0VarArr.length) {
            if (i != i2) {
                uzf1Var = ppm0VarArr[i].b;
                jArr = uzf1Var.c;
                iA = uzf1Var.a(j3);
                if (iA == -1) {
                    iA = uzf1Var.b(j3);
                }
                if (iA != -1) {
                    jMin2 = Math.min(jArr[iA], jMin2);
                }
                if (j4 == -9223372036854775807L) {
                    iA2 = uzf1Var.a(j4);
                    if (iA2 == -1) {
                        iA2 = uzf1Var.b(j4);
                    }
                    if (iA2 == -1) {
                        jMin = Math.min(jArr[iA2], jMin);
                    }
                }
            }
        }
        pn51Var = new pn51(j3, jMin2);
        if (j4 == -9223372036854775807L) {
            en51Var = new en51(pn51Var, pn51Var);
        } else {
            en51Var = new en51(pn51Var, new pn51(j4, jMin));
        }
        return en51Var;
    }

    @Override // p.fn51
    public final boolean d() {
        return true;
    }

    @Override // p.fn51
    public final long g() {
        return this.a;
    }
}

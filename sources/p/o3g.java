package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class o3g implements c36 {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public o3g(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v6 */
    @Override // p.c36
    public final void e(wat watVar, int i, int[] iArr, flb0 flb0Var, int[] iArr2) {
        int i2;
        ?? r0;
        int i3 = 0;
        boolean z = flb0Var == flb0.b;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        int i6 = i - i4;
        if (i6 <= 0 || iArr.length <= 1) {
            if (i6 > 0 && iArr.length == 1) {
                iArr2[0] = (i - iArr[0]) / 2;
                return;
            }
            if (z) {
                int length = iArr.length;
                while (i3 < length) {
                    i -= iArr[i3];
                    iArr2[i3] = i;
                    i3++;
                }
                return;
            }
            int length2 = iArr.length;
            int i7 = 0;
            while (i3 < length2) {
                iArr2[i3] = i7;
                i7 += iArr[i3];
                i3++;
            }
            return;
        }
        boolean z2 = this.a;
        int i8 = z2 ? 0 : -1;
        if (this.b) {
            i2 = (z2 ? 1 : 0) + 1;
            r0 = z2;
        } else {
            i2 = z2 ? 1 : 0;
            r0 = -1;
        }
        int i9 = this.c ? i2 : -1;
        int i10 = z ? i9 : i8 == true ? 1 : 0;
        if (!z) {
            i8 = i9;
        }
        if (i10 >= 0) {
            iArr2[i10] = 0;
        }
        if (r0 >= 0) {
            iArr2[r0] = (i - iArr[r0]) / 2;
        }
        if (i8 >= 0) {
            iArr2[i8] = i - iArr[i8];
        }
    }
}

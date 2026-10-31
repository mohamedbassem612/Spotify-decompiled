package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xac0 extends xbk1 {
    public final fdn0 b;

    public xac0() {
        fdn0 fdn0Var = pr80.a;
        this.b = new fdn0();
    }

    @Override // p.xbk1
    public final void S() {
        fdn0 fdn0Var = this.b;
        int[] iArr = fdn0Var.b;
        Object[] objArr = fdn0Var.c;
        long[] jArr = fdn0Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        int i5 = iArr[i4];
                        wdn0 wdn0Var = (wdn0) objArr[i4];
                        Object[] objArr2 = wdn0Var.a;
                        int i6 = wdn0Var.b;
                        for (int i7 = 0; i7 < i6; i7++) {
                            wac0 wac0Var = (wac0) objArr2[i7];
                            uhd uhdVar = wac0Var.d;
                            if (uhdVar != null) {
                                uhdVar.cancel();
                            }
                            wac0Var.d = null;
                            wac0Var.a.b();
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }
}

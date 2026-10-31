package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class yua0 implements zfv {
    public final xua0 a;

    public yua0(xua0 xua0Var) {
        this.a = xua0Var;
    }

    public final xua0 f() {
        return this.a;
    }

    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final mui1 m729a(tzg1 tzg1Var) {
        int[] iArr;
        Object[] objArr;
        xua0 xua0Var = this.a;
        fdn0 fdn0Var = xua0Var.c;
        edn0 edn0Var = new edn0(((or80) fdn0Var).e + 2);
        fdn0 fdn0Var2 = new fdn0(((or80) fdn0Var).e);
        int[] iArr2 = ((or80) fdn0Var).b;
        Object[] objArr2 = ((or80) fdn0Var).c;
        long[] jArr = ((or80) fdn0Var).a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8;
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    int i4 = 0;
                    while (i4 < i3) {
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i4;
                            int i6 = iArr2[i5];
                            wua0 wua0Var = (wua0) objArr2[i5];
                            edn0Var.a(i6);
                            fdn0Var2.i(i6, new lui1((oe5) tzg1Var.a.invoke(wua0Var.a), wua0Var.b));
                        }
                        j >>= i2;
                        i4++;
                        i2 = i2;
                        iArr2 = iArr2;
                        objArr2 = objArr2;
                    }
                    iArr = iArr2;
                    objArr = objArr2;
                    if (i3 != i2) {
                        break;
                    }
                } else {
                    iArr = iArr2;
                    objArr = objArr2;
                }
                if (i == length) {
                    break;
                }
                i++;
                iArr2 = iArr;
                objArr2 = objArr;
            }
        }
        if (!fdn0Var.a(0)) {
            int i7 = edn0Var.b;
            if (i7 < 0) {
                eqr0.O("Index must be between 0 and size");
                throw null;
            }
            edn0Var.b(i7 + 1);
            int[] iArr3 = edn0Var.a;
            int i8 = edn0Var.b;
            if (i8 != 0) {
                f46.P(1, 0, i8, iArr3, iArr3);
            }
            iArr3[0] = 0;
            edn0Var.b++;
        }
        if (!fdn0Var.a(xua0Var.a)) {
            edn0Var.a(xua0Var.a);
        }
        int i9 = edn0Var.b;
        if (i9 != 0) {
            f46.D0(i9, edn0Var.a);
        }
        return new mui1(edn0Var, fdn0Var2, xua0Var.a, xua0Var.b, mlv.d);
    }
}

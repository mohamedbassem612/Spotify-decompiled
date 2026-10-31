package p;

import android.graphics.Bitmap;
import app.p000rive.semantics.SemanticState;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mts0 implements lqc1 {
    public final izr0 a = new izr0();
    public final izr0 b = new izr0();
    public final lts0 c = new lts0();
    public Inflater d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x007c  */
    public final void g(byte[] bArr, int i, int i2, kqc1 kqc1Var, akl aklVar) {
        lts0 lts0Var;
        feo feoVar;
        int i3;
        int i4;
        int iE;
        int i5;
        int i6;
        int iH;
        lts0 lts0Var2 = this.c;
        int[] iArr = lts0Var2.b;
        izr0 izr0Var = lts0Var2.a;
        izr0 izr0Var2 = this.a;
        izr0Var2.P(bArr, i + i2);
        izr0Var2.R(i);
        Inflater inflater = this.d;
        if (inflater == null) {
            inflater = new Inflater();
            this.d = inflater;
        }
        String str = zoi1.a;
        if (izr0Var2.a() > 0 && izr0Var2.n() == 120) {
            izr0 izr0Var3 = this.b;
            if (zoi1.O(izr0Var2, izr0Var3, inflater)) {
                izr0Var2.P(izr0Var3.a, izr0Var3.c);
            }
        }
        int i7 = 0;
        lts0Var2.d = 0;
        lts0Var2.e = 0;
        lts0Var2.f = 0;
        lts0Var2.g = 0;
        lts0Var2.h = 0;
        lts0Var2.i = 0;
        izr0Var.O(0);
        lts0Var2.c = false;
        ArrayList arrayList = new ArrayList();
        while (izr0Var2.a() >= 3) {
            int i8 = izr0Var2.c;
            int iE2 = izr0Var2.E();
            int iL = izr0Var2.L();
            int i9 = izr0Var2.b + iL;
            if (i9 > i8) {
                izr0Var2.R(i8);
                i3 = i7;
                lts0Var = lts0Var2;
                feoVar = null;
            } else {
                char c = 128;
                if (iE2 != 128) {
                    switch (iE2) {
                        case 20:
                            if (iL % 5 == 2) {
                                izr0Var2.S(2);
                                Arrays.fill(iArr, i7);
                                int i10 = iL / 5;
                                int i11 = i7;
                                while (i11 < i10) {
                                    int iE3 = izr0Var2.E();
                                    char c2 = c;
                                    double dE = izr0Var2.E();
                                    double dE2 = izr0Var2.E() - 128;
                                    double dE3 = izr0Var2.E() - 128;
                                    iArr[iE3] = zoi1.j((int) ((dE3 * 1.772d) + dE), 0, 255) | (izr0Var2.E() << 24) | (zoi1.j((int) ((1.402d * dE2) + dE), 0, 255) << 16) | (zoi1.j((int) ((dE - (0.34414d * dE3)) - (dE2 * 0.71414d)), 0, 255) << 8);
                                    i11++;
                                    c = c2;
                                    lts0Var2 = lts0Var2;
                                }
                                lts0Var = lts0Var2;
                                lts0Var.c = true;
                            } else {
                                lts0Var = lts0Var2;
                            }
                            break;
                        case 21:
                            if (iL >= 4) {
                                izr0Var2.S(3);
                                int i12 = iL - 4;
                                if (((128 & izr0Var2.E()) != 0 ? 1 : i7) == 0) {
                                    i5 = izr0Var.b;
                                    i6 = izr0Var.c;
                                    if (i5 < i6 && i12 > 0) {
                                        int iMin = Math.min(i12, i6 - i5);
                                        izr0Var2.o(i5, izr0Var.a, iMin);
                                        izr0Var.R(i5 + iMin);
                                    }
                                } else if (i12 >= 7 && (iH = izr0Var2.H()) >= 4) {
                                    lts0Var2.h = izr0Var2.L();
                                    lts0Var2.i = izr0Var2.L();
                                    izr0Var.O(iH - 4);
                                    i12 = iL - 11;
                                    i5 = izr0Var.b;
                                    i6 = izr0Var.c;
                                    if (i5 < i6) {
                                        int iMin2 = Math.min(i12, i6 - i5);
                                        izr0Var2.o(i5, izr0Var.a, iMin2);
                                        izr0Var.R(i5 + iMin2);
                                    }
                                }
                            }
                            lts0Var = lts0Var2;
                            break;
                        case 22:
                            if (iL >= 19) {
                                lts0Var2.d = izr0Var2.L();
                                lts0Var2.e = izr0Var2.L();
                                izr0Var2.S(11);
                                lts0Var2.f = izr0Var2.L();
                                lts0Var2.g = izr0Var2.L();
                            }
                            lts0Var = lts0Var2;
                            break;
                        default:
                            lts0Var = lts0Var2;
                            break;
                    }
                    feoVar = null;
                    i3 = 0;
                } else {
                    lts0Var = lts0Var2;
                    if (lts0Var.d == 0 || lts0Var.e == 0 || lts0Var.h == 0 || lts0Var.i == 0 || (i4 = izr0Var.c) == 0 || izr0Var.b != i4 || !lts0Var.c) {
                        feoVar = null;
                    } else {
                        izr0Var.R(0);
                        int i13 = lts0Var.h * lts0Var.i;
                        int[] iArr2 = new int[i13];
                        int i14 = 0;
                        while (i14 < i13) {
                            int iE4 = izr0Var.E();
                            if (iE4 != 0) {
                                iE = i14 + 1;
                                iArr2[i14] = iArr[iE4];
                            } else {
                                int iE5 = izr0Var.E();
                                if (iE5 != 0) {
                                    iE = ((iE5 & 64) == 0 ? iE5 & 63 : ((iE5 & 63) << 8) | izr0Var.E()) + i14;
                                    Arrays.fill(iArr2, i14, iE, (iE5 & SemanticState.Focused) == 0 ? iArr[0] : iArr[izr0Var.E()]);
                                }
                            }
                            i14 = iE;
                        }
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr2, lts0Var.h, lts0Var.i, Bitmap.Config.ARGB_8888);
                        float f = lts0Var.f;
                        float f2 = lts0Var.d;
                        float f3 = f / f2;
                        float f4 = lts0Var.g;
                        float f5 = lts0Var.e;
                        feoVar = new feo(null, null, null, bitmapCreateBitmap, f4 / f5, 0, 0, f3, 0, os00.INVALID_ID, -3.4028235E38f, lts0Var.h / f2, lts0Var.i / f5, false, -16777216, os00.INVALID_ID, 0.0f, 0);
                    }
                    i3 = 0;
                    lts0Var.d = 0;
                    lts0Var.e = 0;
                    lts0Var.f = 0;
                    lts0Var.g = 0;
                    lts0Var.h = 0;
                    lts0Var.i = 0;
                    izr0Var.O(0);
                    lts0Var.c = false;
                }
                izr0Var2.R(i9);
            }
            if (feoVar != null) {
                arrayList.add(feoVar);
            }
            lts0Var2 = lts0Var;
            i7 = i3;
        }
        aklVar.accept(new bfo(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    public final int i() {
        return 2;
    }
}

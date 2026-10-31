package p;

import java.util.ArrayList;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class mlx0 {
    public static final double a = Math.log(2.0d);
    public static final /* synthetic */ int b = 0;

    /* JADX WARN: Code duplicated, block: B:39:0x0084  */
    public static ArrayList a(izr0 izr0Var) {
        char c;
        ArrayList arrayList;
        boolean z;
        Object klx0Var;
        izr0 izr0Var2 = izr0Var;
        ArrayList arrayList2 = null;
        if (izr0Var2.E() == 0) {
            char c2 = 7;
            izr0Var2.S(7);
            int iQ = izr0Var2.q();
            boolean z2 = true;
            if (iQ == 1684433976) {
                izr0 izr0Var3 = new izr0();
                Inflater inflater = new Inflater(true);
                try {
                    if (!zoi1.O(izr0Var2, izr0Var3, inflater)) {
                        inflater.end();
                        return null;
                    }
                    inflater.end();
                    izr0Var2 = izr0Var3;
                } catch (Throwable th) {
                    inflater.end();
                    throw th;
                }
            } else if (iQ == 1918990112) {
            }
            ArrayList arrayList3 = new ArrayList();
            int i = izr0Var2.b;
            int i2 = izr0Var2.c;
            while (i < i2) {
                int iQ2 = izr0Var2.q() + i;
                if (iQ2 > i && iQ2 <= i2) {
                    if (izr0Var2.q() == 1835365224) {
                        int iQ3 = izr0Var2.q();
                        if (iQ3 <= 0 || iQ3 > 10000) {
                            c = c2;
                            arrayList = arrayList2;
                            z = z2;
                            klx0Var = arrayList;
                            break;
                        }
                        float[] fArr = new float[iQ3];
                        for (int i3 = 0; i3 < iQ3; i3++) {
                            fArr[i3] = Float.intBitsToFloat(izr0Var2.q());
                        }
                        int iQ4 = izr0Var2.q();
                        if (iQ4 > 0 && iQ4 <= 32000) {
                            double dLog = Math.log(((double) iQ3) * 2.0d);
                            double d = a;
                            int iCeil = (int) Math.ceil(dLog / d);
                            c = c2;
                            byte[] bArr = izr0Var2.a;
                            arrayList = arrayList2;
                            bae baeVar = new bae(bArr, bArr.length);
                            baeVar.m(izr0Var2.b * 8);
                            float[] fArr2 = new float[iQ4 * 5];
                            z = z2;
                            int i4 = 5;
                            int[] iArr = new int[5];
                            int i5 = 0;
                            int i6 = 0;
                            while (true) {
                                if (i5 >= iQ4) {
                                    baeVar.m((baeVar.e() + 7) & (-8));
                                    int i7 = 32;
                                    int iG = baeVar.g(32);
                                    if (iG <= 0) {
                                        break;
                                    }
                                    w4c0[] w4c0VarArr = new w4c0[iG];
                                    int i8 = 0;
                                    while (true) {
                                        if (i8 >= iG) {
                                            klx0Var = new klx0(w4c0VarArr);
                                            break;
                                        }
                                        int iG2 = baeVar.g(8);
                                        int iG3 = baeVar.g(8);
                                        int iG4 = baeVar.g(i7);
                                        if (iG4 > 0 && iG4 <= 128000) {
                                            float[] fArr3 = fArr2;
                                            int iCeil2 = (int) Math.ceil(Math.log(((double) iQ4) * 2.0d) / d);
                                            float[] fArr4 = new float[iG4 * 3];
                                            float[] fArr5 = new float[iG4 * 2];
                                            int i9 = iG;
                                            int i10 = 0;
                                            int i11 = 0;
                                            while (true) {
                                                if (i10 < iG4) {
                                                    int iG5 = baeVar.g(iCeil2);
                                                    int i12 = iCeil2;
                                                    int i13 = ((iG5 >> 1) ^ (-(iG5 & 1))) + i11;
                                                    if (i13 >= 0 && i13 < iQ4) {
                                                        int i14 = i10 * 3;
                                                        int i15 = i13 * 5;
                                                        fArr4[i14] = fArr3[i15];
                                                        fArr4[i14 + 1] = fArr3[i15 + 1];
                                                        fArr4[i14 + 2] = fArr3[i15 + 2];
                                                        int i16 = i10 * 2;
                                                        fArr5[i16] = fArr3[i15 + 3];
                                                        fArr5[i16 + 1] = fArr3[i15 + 4];
                                                        i10++;
                                                        i11 = i13;
                                                        iCeil2 = i12;
                                                    }
                                                } else {
                                                    w4c0VarArr[i8] = new w4c0(iG2, iG3, fArr4, fArr5);
                                                    i8++;
                                                    fArr2 = fArr3;
                                                    iG = i9;
                                                    i7 = 32;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    int i17 = 0;
                                    while (true) {
                                        if (i17 < i4) {
                                            int i18 = iArr[i17];
                                            int iG6 = baeVar.g(iCeil);
                                            int i19 = ((iG6 >> 1) ^ (-(iG6 & 1))) + i18;
                                            if (i19 < iQ3 && i19 >= 0) {
                                                fArr2[i6] = fArr[i19];
                                                iArr[i17] = i19;
                                                i17++;
                                                i6++;
                                                i4 = 5;
                                            }
                                        } else {
                                            i5++;
                                            i4 = 5;
                                        }
                                    }
                                }
                            }
                        } else {
                            c = c2;
                            arrayList = arrayList2;
                            z = z2;
                        }
                        klx0Var = arrayList;
                        break;
                        if (klx0Var == null) {
                            return arrayList;
                        }
                        arrayList3.add(klx0Var);
                    } else {
                        c = c2;
                        arrayList = arrayList2;
                        z = z2;
                    }
                    izr0Var2.R(iQ2);
                    i = iQ2;
                    c2 = c;
                    arrayList2 = arrayList;
                    z2 = z;
                }
            }
            return arrayList3;
        }
        return arrayList2;
    }
}

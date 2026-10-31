package p;

import androidx.media3.common.ParserException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class y760 {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final float l;
    public final int m;
    public final String n;
    public final poj0 o;

    public y760(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, float f, int i11, String str, poj0 poj0Var) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
        this.k = i10;
        this.l = f;
        this.m = i11;
        this.n = str;
        this.o = poj0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    public static y760 a(izr0 izr0Var, boolean z, poj0 poj0Var) throws ParserException {
        boolean z2;
        ij81 ij81VarY;
        int i = 4;
        try {
            if (z) {
                izr0Var.S(4);
            } else {
                izr0Var.S(21);
            }
            int iE = izr0Var.E() & 3;
            int iE2 = izr0Var.E();
            int i2 = izr0Var.b;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                z2 = true;
                if (i4 >= iE2) {
                    break;
                }
                izr0Var.S(1);
                int iL = izr0Var.L();
                for (int i6 = 0; i6 < iL; i6++) {
                    int iL2 = izr0Var.L();
                    i5 += iL2 + 4;
                    izr0Var.S(iL2);
                }
                i4++;
            }
            izr0Var.R(i2);
            byte[] bArr = new byte[i5];
            poj0 poj0Var2 = poj0Var;
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            float f = 1.0f;
            String strA = null;
            int i17 = 0;
            int i18 = 0;
            while (i17 < iE2) {
                int iE3 = izr0Var.E() & 63;
                int iL3 = izr0Var.L();
                int i19 = i3;
                poj0 poj0VarA = poj0Var2;
                while (i19 < iL3) {
                    boolean z3 = z2;
                    int iL4 = izr0Var.L();
                    int i20 = iE;
                    System.arraycopy(mqn1.a, i3, bArr, i18, i);
                    int i21 = i18 + 4;
                    System.arraycopy(izr0Var.a, izr0Var.b, bArr, i21, iL4);
                    if (iE3 == 32 && i19 == 0) {
                        poj0VarA = mqn1.A(i21, bArr, i21 + iL4);
                    } else {
                        if (iE3 == 33 && i19 == 0) {
                            win0 win0VarZ = mqn1.z(bArr, i21, i21 + iL4, poj0VarA);
                            i7 = win0VarZ.a + 1;
                            i8 = win0VarZ.h;
                            int i22 = win0VarZ.i;
                            i10 = win0VarZ.d + 8;
                            i11 = win0VarZ.e + 8;
                            int i23 = win0VarZ.l;
                            i9 = i22;
                            int i24 = win0VarZ.m;
                            int i25 = win0VarZ.n;
                            float f2 = win0VarZ.j;
                            int i26 = win0VarZ.k;
                            uin0 uin0Var = win0VarZ.b;
                            if (uin0Var != null) {
                                strA = kwg.a(uin0Var.a, uin0Var.b, uin0Var.c, uin0Var.d, uin0Var.e, uin0Var.f);
                            }
                            i16 = i26;
                            f = f2;
                            i14 = i25;
                            i13 = i24;
                            i12 = i23;
                        } else if (iE3 == 39 && i19 == 0 && (ij81VarY = mqn1.y(i21, bArr, i21 + iL4)) != null && poj0VarA != null) {
                            i3 = 0;
                            i15 = ij81VarY.b == ((tin0) ((b380) poj0VarA.b).get(0)).b ? 4 : 5;
                        }
                        i3 = 0;
                    }
                    i18 = i21 + iL4;
                    izr0Var.S(iL4);
                    i19++;
                    z2 = z3;
                    iE = i20;
                    i = 4;
                }
                i17++;
                poj0Var2 = poj0VarA;
                i = 4;
            }
            return new y760(i5 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iE + 1, i7, i8, i9, i10, i11, i12, i13, i14, i15, f, i16, strA, poj0Var2);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ParserException.a(e, "Error parsing".concat(z ? "L-HEVC config" : "HEVC config"));
        }
    }
}

package p;

import app.p000rive.semantics.SemanticState;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zl70 extends lap1 {
    public static final tw20 d = new tw20((byte) 17);
    public static final tw20 e = new tw20((byte) 18);
    public final xl70 c;

    public zl70(xl70 xl70Var) {
        this.c = xl70Var;
    }

    public static uok0 A(int i, izr0 izr0Var) {
        int iL = izr0Var.L();
        int iH = izr0Var.H();
        int iH2 = izr0Var.H();
        int iE = izr0Var.E();
        int iE2 = izr0Var.E();
        bae baeVar = new bae();
        baeVar.k(izr0Var);
        int i2 = ((i - 10) * 8) / (iE + iE2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int iG = baeVar.g(iE);
            int iG2 = baeVar.g(iE2);
            iArr[i3] = iG;
            iArr2[i3] = iG2;
        }
        return new uok0(iL, iH, iH2, iArr, iArr2);
    }

    public static how0 B(int i, izr0 izr0Var) {
        byte[] bArr = new byte[i];
        izr0Var.o(0, bArr, i);
        int iM = M(bArr, 0);
        String str = new String(bArr, 0, iM, StandardCharsets.ISO_8859_1);
        int i2 = iM + 1;
        return new how0(str, i <= i2 ? zoi1.b : Arrays.copyOfRange(bArr, i2, i));
    }

    public static String C(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, charset);
    }

    public static v8e1 D(int i, String str, izr0 izr0Var) {
        if (i < 1) {
            return null;
        }
        int iE = izr0Var.E();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        izr0Var.o(0, bArr, i2);
        return new v8e1(str, null, E(iE, bArr, 0));
    }

    public static bg11 E(int i, byte[] bArr, int i2) {
        if (i2 >= bArr.length) {
            return b380.t("");
        }
        v280 v280VarM = b380.m();
        int iL = L(i2, bArr, i);
        while (i2 < iL) {
            v280VarM.c(new String(bArr, i2, iL - i2, J(i)));
            i2 = I(i) + iL;
            iL = L(i2, bArr, i);
        }
        bg11 bg11VarG = v280VarM.g();
        return bg11VarG.isEmpty() ? b380.t("") : bg11VarG;
    }

    public static v8e1 F(int i, izr0 izr0Var) {
        if (i < 1) {
            return null;
        }
        int iE = izr0Var.E();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        izr0Var.o(0, bArr, i2);
        int iL = L(0, bArr, iE);
        return new v8e1("TXXX", new String(bArr, 0, iL, J(iE)), E(iE, bArr, I(iE) + iL));
    }

    public static r3i1 G(int i, String str, izr0 izr0Var) {
        byte[] bArr = new byte[i];
        izr0Var.o(0, bArr, i);
        return new r3i1(str, null, new String(bArr, 0, M(bArr, 0), StandardCharsets.ISO_8859_1));
    }

    public static r3i1 H(int i, izr0 izr0Var) {
        if (i < 1) {
            return null;
        }
        int iE = izr0Var.E();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        izr0Var.o(0, bArr, i2);
        int iL = L(0, bArr, iE);
        String str = new String(bArr, 0, iL, J(iE));
        int I = I(iE) + iL;
        return new r3i1("WXXX", str, C(bArr, I, M(bArr, I), StandardCharsets.ISO_8859_1));
    }

    public static int I(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public static Charset J(int i) {
        if (i == 1) {
            return StandardCharsets.UTF_16;
        }
        if (i != 2) {
            return i != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8;
        }
        return StandardCharsets.UTF_16BE;
    }

    public static String K(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    public static int L(int i, byte[] bArr, int i2) {
        int iM = M(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return iM;
        }
        while (iM < bArr.length - 1) {
            if ((iM - i) % 2 == 0 && bArr[iM + 1] == 0) {
                return iM;
            }
            iM = M(bArr, iM + 1);
        }
        return bArr.length;
    }

    public static int M(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    public static int N(int i, izr0 izr0Var) {
        byte[] bArr = izr0Var.a;
        int i2 = izr0Var.b;
        int i3 = i2;
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= i2 + i) {
                return i;
            }
            if ((bArr[i3] & 255) == 255 && bArr[i4] == 0) {
                System.arraycopy(bArr, i3 + 2, bArr, i4, (i - (i3 - i2)) - 2);
                i--;
            }
            i3 = i4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007a A[PHI: r3
      0x007a: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:42:0x0087, B:33:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    public static boolean O(izr0 izr0Var, int i, int i2, boolean z) {
        int iH;
        long jH;
        int iL;
        int i3;
        int i4 = izr0Var.b;
        while (true) {
            try {
                boolean z2 = true;
                if (izr0Var.a() < i2) {
                    izr0Var.R(i4);
                    return true;
                }
                if (i >= 3) {
                    iH = izr0Var.q();
                    jH = izr0Var.G();
                    iL = izr0Var.L();
                } else {
                    iH = izr0Var.H();
                    jH = izr0Var.H();
                    iL = 0;
                }
                if (iH == 0 && jH == 0 && iL == 0) {
                    izr0Var.R(i4);
                    return true;
                }
                if (i == 4 && !z) {
                    if ((8421504 & jH) != 0) {
                        izr0Var.R(i4);
                        return false;
                    }
                    jH = (((jH >> 24) & 255) << 21) | (jH & 255) | (((jH >> 8) & 255) << 7) | (((jH >> 16) & 255) << 14);
                }
                if (i == 4) {
                    i3 = (iL & 64) != 0 ? 1 : 0;
                    if ((iL & 1) == 0) {
                        z2 = false;
                    }
                } else if (i == 3) {
                    i3 = (iL & 32) != 0 ? 1 : 0;
                    if ((iL & SemanticState.Focused) == 0) {
                        z2 = false;
                    }
                } else {
                    i3 = 0;
                    z2 = false;
                }
                if (z2) {
                    i3 += 4;
                }
                if (jH < i3) {
                    izr0Var.R(i4);
                    return false;
                }
                if (izr0Var.a() < jH) {
                    izr0Var.R(i4);
                    return false;
                }
                izr0Var.S((int) jH);
            } catch (Throwable th) {
                izr0Var.R(i4);
                throw th;
            }
        }
    }

    public static ii5 u(izr0 izr0Var, int i, int i2) {
        int iM;
        String strConcat;
        int iE = izr0Var.E();
        Charset charsetJ = J(iE);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        izr0Var.o(0, bArr, i3);
        if (i2 == 2) {
            strConcat = "image/" + eth.W(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(strConcat)) {
                strConcat = "image/jpeg";
            }
            iM = 2;
        } else {
            iM = M(bArr, 0);
            String strW = eth.W(new String(bArr, 0, iM, StandardCharsets.ISO_8859_1));
            strConcat = strW.indexOf(47) == -1 ? "image/".concat(strW) : strW;
        }
        int i4 = bArr[iM + 1] & 255;
        int i5 = iM + 2;
        int iL = L(i5, bArr, iE);
        String str = new String(bArr, i5, iL - i5, charsetJ);
        int I = I(iE) + iL;
        return new ii5(i4, strConcat, str, i3 <= I ? zoi1.b : Arrays.copyOfRange(bArr, I, i3));
    }

    public static ghe v(izr0 izr0Var, int i, int i2, boolean z, int i3, xl70 xl70Var) throws Throwable {
        int i4 = izr0Var.b;
        int iM = M(izr0Var.a, i4);
        String str = new String(izr0Var.a, i4, iM - i4, StandardCharsets.ISO_8859_1);
        izr0Var.R(iM + 1);
        int iQ = izr0Var.q();
        int iQ2 = izr0Var.q();
        if (iQ > iQ2) {
            return null;
        }
        long jG = izr0Var.G();
        if (jG == 4294967295L) {
            jG = -1;
        }
        long jG2 = izr0Var.G();
        long j = jG2 == 4294967295L ? -1L : jG2;
        ArrayList arrayList = new ArrayList();
        int i5 = i4 + i;
        while (izr0Var.b < i5) {
            am70 am70VarY = y(i2, izr0Var, z, i3, xl70Var);
            if (am70VarY != null) {
                arrayList.add(am70VarY);
            }
        }
        return new ghe(str, iQ, iQ2, jG, j, (am70[]) arrayList.toArray(new am70[0]));
    }

    public static kle w(izr0 izr0Var, int i, int i2, boolean z, int i3, xl70 xl70Var) throws Throwable {
        int i4 = izr0Var.b;
        int iM = M(izr0Var.a, i4);
        String str = new String(izr0Var.a, i4, iM - i4, StandardCharsets.ISO_8859_1);
        izr0Var.R(iM + 1);
        int iE = izr0Var.E();
        boolean z2 = (iE & 2) != 0;
        boolean z3 = (iE & 1) != 0;
        int iE2 = izr0Var.E();
        String[] strArr = new String[iE2];
        for (int i5 = 0; i5 < iE2; i5++) {
            int i6 = izr0Var.b;
            int iM2 = M(izr0Var.a, i6);
            strArr[i5] = new String(izr0Var.a, i6, iM2 - i6, StandardCharsets.ISO_8859_1);
            izr0Var.R(iM2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i7 = i4 + i;
        while (izr0Var.b < i7) {
            am70 am70VarY = y(i2, izr0Var, z, i3, xl70Var);
            if (am70VarY != null) {
                arrayList.add(am70VarY);
            }
        }
        return new kle(str, z2, z3, strArr, (am70[]) arrayList.toArray(new am70[0]));
    }

    public static igh x(int i, izr0 izr0Var) {
        if (i < 4) {
            return null;
        }
        int iE = izr0Var.E();
        Charset charsetJ = J(iE);
        byte[] bArr = new byte[3];
        izr0Var.o(0, bArr, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        izr0Var.o(0, bArr2, i2);
        int iL = L(0, bArr2, iE);
        String str2 = new String(bArr2, 0, iL, charsetJ);
        int I = I(iE) + iL;
        return new igh(str, str2, C(bArr2, I, L(I, bArr2, iE), charsetJ));
    }

    /* JADX WARN: Code duplicated, block: B:194:0x023b  */
    /* JADX WARN: Instruction removed from duplicated block: B:194:0x023b, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [p.am70] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10, types: [p.izr0] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28, types: [p.izr0] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9, types: [p.izr0] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [int] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14, types: [int] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static am70 y(int i, izr0 izr0Var, boolean z, int i2, xl70 xl70Var) throws Throwable {
        int I;
        ?? r1;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        ?? r8;
        Throwable th;
        ?? r2;
        int i3;
        ?? r9;
        ?? r3;
        ?? r12;
        ?? r10;
        rij0 quaVar;
        int i4 = i;
        izr0 izr0Var2 = izr0Var;
        int iE = izr0Var2.E();
        int iE2 = izr0Var2.E();
        int iE3 = izr0Var2.E();
        int iE4 = i4 >= 3 ? izr0Var2.E() : 0;
        if (i4 == 4) {
            I = izr0Var2.I();
            if (!z) {
                I = (((I >> 24) & 255) << 21) | (I & 255) | (((I >> 8) & 255) << 7) | (((I >> 16) & 255) << 14);
            }
        } else {
            I = i4 == 3 ? izr0Var2.I() : izr0Var2.H();
        }
        iE3 = I;
        int iL = i4 >= 3 ? izr0Var2.L() : 0;
        if (iE == 0 && iE2 == 0 && iE3 == 0 && iE4 == 0 && iE3 == 0 && iL == 0) {
            izr0Var2.R(izr0Var2.c);
            return null;
        }
        int i5 = izr0Var2.b + iE3;
        if (i5 > izr0Var2.c) {
            oon1.H("Frame size exceeds remaining tag data");
            izr0Var2.R(izr0Var2.c);
            return null;
        }
        if (xl70Var == null) {
            r1 = iE2;
        } else if (!xl70Var.e(i4, iE, iE2, iE3, iE4)) {
            i4 = i4;
            r1 = iE2;
            izr0Var2.R(i5);
            return null;
        }
        i4 = i4;
        r1 = iE2;
        if (i4 == 3) {
            z2 = (iL & SemanticState.Focused) != 0;
            z3 = (iL & 64) != 0;
            z6 = false;
            z5 = (iL & 32) != 0;
            z4 = z2;
        } else if (i4 == 4) {
            boolean z7 = (iL & 64) != 0;
            boolean z8 = (iL & 8) != 0;
            boolean z9 = (iL & 4) != 0;
            z6 = (iL & 2) != 0;
            z4 = (iL & 1) != 0;
            boolean z10 = z9;
            z5 = z7;
            z2 = z8;
            z3 = z10;
        } else {
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = false;
            z6 = false;
        }
        if (z2 || z3) {
            oon1.H("Skipping unsupported compressed or encrypted frame");
            izr0Var2.R(i5);
            return null;
        }
        if (z5) {
            iE3--;
            izr0Var2.S(1);
        }
        if (z4) {
            iE3 -= 4;
            izr0Var2.S(4);
        }
        if (z6) {
            iE3 = N(iE3, izr0Var2);
        }
        try {
            try {
                if (iE == 84 && r1 == 88 && iE3 == 88 && (i4 == 2 || iE4 == 88)) {
                    quaVar = F(iE3, izr0Var2);
                } else if (iE == 84) {
                    quaVar = D(iE3, K(i4, iE, r1, iE3, iE4), izr0Var2);
                } else if (iE == 87 && r1 == 88 && iE3 == 88 && (i4 == 2 || iE4 == 88)) {
                    quaVar = H(iE3, izr0Var2);
                } else if (iE == 87) {
                    quaVar = G(iE3, K(i4, iE, r1, iE3, iE4), izr0Var2);
                } else {
                    if (iE != 80 || r1 != 82 || iE3 != 73 || iE4 != 86) {
                        if (iE == 71 && r1 == 69 && iE3 == 79 && (iE4 == 66 || i4 == 2)) {
                            quaVar = z(iE3, izr0Var2);
                        } else {
                            th = null;
                            try {
                                if (i4 != 2 ? iE == 65 && r1 == 80 && iE3 == 73 && iE4 == 67 : iE == 80 && r1 == 73 && iE3 == 67) {
                                    quaVar = u(izr0Var2, iE3, i4);
                                } else {
                                    if (iE != 67 || r1 != 79 || iE3 != 77 || (iE4 != 77 && i4 != 2)) {
                                        if (iE == 67 && r1 == 72 && iE3 == 65 && iE4 == 80) {
                                            r1 = r1;
                                            iE3 = iE3;
                                            iE3 = iE3;
                                            i3 = iE4;
                                            try {
                                                quaVar = v(izr0Var2, iE3, i4, z, i2, xl70Var);
                                                i4 = i;
                                                r1 = izr0Var;
                                            } catch (Exception e2) {
                                                e = e2;
                                                i4 = i;
                                                r3 = izr0Var;
                                                r9 = r1;
                                                r3.R(i5);
                                                r12 = th;
                                                r10 = r9;
                                            } catch (OutOfMemoryError e3) {
                                                e = e3;
                                                i4 = i;
                                                r3 = izr0Var;
                                                r9 = r1;
                                                r3.R(i5);
                                                r12 = th;
                                                r10 = r9;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                r2 = izr0Var;
                                                r2.R(i5);
                                                throw th;
                                            }
                                        } else {
                                            r1 = r1;
                                            iE3 = iE3;
                                            iE3 = iE3;
                                            i3 = iE4;
                                            try {
                                                if (iE == 67 && r1 == 84 && iE3 == 79 && i3 == 67) {
                                                    i4 = i;
                                                    izr0 izr0Var3 = izr0Var;
                                                    quaVar = w(izr0Var3, iE3, i4, z, i2, xl70Var);
                                                    r1 = izr0Var3;
                                                } else {
                                                    i4 = i;
                                                    izr0 izr0Var4 = izr0Var;
                                                    if (iE == 77 && r1 == 76 && iE3 == 76 && i3 == 84) {
                                                        quaVar = A(iE3, izr0Var4);
                                                        r1 = izr0Var4;
                                                    } else {
                                                        String strK = K(i4, iE, r1, iE3, i3);
                                                        byte[] bArr = new byte[iE3];
                                                        izr0Var4.o(0, bArr, iE3);
                                                        quaVar = new qua(strK, bArr);
                                                        r1 = izr0Var4;
                                                    }
                                                }
                                            } catch (Exception e4) {
                                                e = e4;
                                                r3 = r1;
                                                r9 = r1;
                                                r3.R(i5);
                                                r12 = th;
                                                r10 = r9;
                                            } catch (OutOfMemoryError e5) {
                                                e = e5;
                                                r3 = r1;
                                                r9 = r1;
                                                r3.R(i5);
                                                r12 = th;
                                                r10 = r9;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                r2 = r1;
                                                r2.R(i5);
                                                throw th;
                                            }
                                        }
                                        if (r12 == 0) {
                                            oon1.I("Failed to decode frame: id=" + K(i4, iE, r10, iE3, i3) + ", frameSize=" + iE3, e);
                                        }
                                        return r12;
                                    }
                                    quaVar = x(iE3, izr0Var2);
                                }
                                r1 = izr0Var2;
                                iE3 = iE3;
                                r1 = r1;
                                i3 = iE4;
                            } catch (Exception e6) {
                                e = e6;
                                r8 = r1;
                                iE3 = iE3;
                                i3 = iE4;
                                r3 = izr0Var2;
                                r9 = r8;
                                r3.R(i5);
                                r12 = th;
                                r10 = r9;
                                if (r12 == 0) {
                                    oon1.I("Failed to decode frame: id=" + K(i4, iE, r10, iE3, i3) + ", frameSize=" + iE3, e);
                                }
                                return r12;
                            } catch (OutOfMemoryError e7) {
                                e = e7;
                                r8 = r1;
                                iE3 = iE3;
                                i3 = iE4;
                                r3 = izr0Var2;
                                r9 = r8;
                                r3.R(i5);
                                r12 = th;
                                r10 = r9;
                                if (r12 == 0) {
                                    oon1.I("Failed to decode frame: id=" + K(i4, iE, r10, iE3, i3) + ", frameSize=" + iE3, e);
                                }
                                return r12;
                            }
                        }
                        r1.R(i5);
                        r12 = quaVar;
                        e = th;
                        r10 = r1;
                        if (r12 == 0) {
                            oon1.I("Failed to decode frame: id=" + K(i4, iE, r10, iE3, i3) + ", frameSize=" + iE3, e);
                        }
                        return r12;
                    }
                    quaVar = B(iE3, izr0Var2);
                }
                r1 = izr0Var2;
                iE3 = iE3;
                th = null;
                r1 = r1;
                i3 = iE4;
                r1.R(i5);
                r12 = quaVar;
                e = th;
                r10 = r1;
            } catch (Throwable th4) {
                th = th4;
                r2 = izr0Var2;
            }
        } catch (Exception e8) {
            e = e8;
            r8 = r1;
            iE3 = iE3;
            th = null;
            i3 = iE4;
            r3 = izr0Var2;
            r9 = r8;
            r3.R(i5);
            r12 = th;
            r10 = r9;
            if (r12 == 0) {
                oon1.I("Failed to decode frame: id=" + K(i4, iE, r10, iE3, i3) + ", frameSize=" + iE3, e);
            }
            return r12;
        } catch (OutOfMemoryError e9) {
            e = e9;
            r8 = r1;
            iE3 = iE3;
            th = null;
            i3 = iE4;
            r3 = izr0Var2;
            r9 = r8;
            r3.R(i5);
            r12 = th;
            r10 = r9;
            if (r12 == 0) {
                oon1.I("Failed to decode frame: id=" + K(i4, iE, r10, iE3, i3) + ", frameSize=" + iE3, e);
            }
            return r12;
        }
        if (r12 == 0) {
            oon1.I("Failed to decode frame: id=" + K(i4, iE, r10, iE3, i3) + ", frameSize=" + iE3, e);
        }
        return r12;
    }

    public static kj40 z(int i, izr0 izr0Var) {
        int iE = izr0Var.E();
        Charset charsetJ = J(iE);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        izr0Var.o(0, bArr, i2);
        int iM = M(bArr, 0);
        String strP = asj0.p(new String(bArr, 0, iM, StandardCharsets.ISO_8859_1));
        int i3 = iM + 1;
        int iL = L(i3, bArr, iE);
        String strC = C(bArr, i3, iL, charsetJ);
        int I = I(iE) + iL;
        int iL2 = L(I, bArr, iE);
        String strC2 = C(bArr, I, iL2, charsetJ);
        int I2 = I(iE) + iL2;
        return new kj40(strP, strC, i2 <= I2 ? zoi1.b : Arrays.copyOfRange(bArr, I2, i2), strC2);
    }

    public final hjj0 i(gkj0 gkj0Var, ByteBuffer byteBuffer) {
        return t(byteBuffer.array(), byteBuffer.limit());
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0099 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x009a  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00c5 A[SYNTHETIC] */
    public final hjj0 t(byte[] bArr, int i) {
        boolean z;
        yl70 yl70Var;
        short s;
        int i2;
        int iN;
        am70 am70VarY;
        ArrayList arrayList = new ArrayList();
        izr0 izr0Var = new izr0(bArr, i);
        boolean z2 = false;
        if (izr0Var.a() < 10) {
            oon1.H("Data too short to be an ID3 tag");
        } else {
            int iH = izr0Var.H();
            if (iH == 4801587) {
                int iE = izr0Var.E();
                izr0Var.S(1);
                int iE2 = izr0Var.E();
                int iD = izr0Var.D();
                if (iE != 2) {
                    if (iE == 3) {
                        if ((iE2 & 64) != 0) {
                            int iQ = izr0Var.q();
                            izr0Var.S(iQ);
                            iD -= iQ + 4;
                        }
                    } else if (iE == 4) {
                        if ((iE2 & 64) != 0) {
                            int iD2 = izr0Var.D();
                            izr0Var.S(iD2 - 4);
                            iD -= iD2;
                        }
                        if ((iE2 & 16) != 0) {
                            iD -= 10;
                        }
                    } else {
                        td6.p(iE, "Skipped ID3 tag with unsupported majorVersion=");
                    }
                    if (iE < 4) {
                        z = false;
                    } else {
                        z = false;
                    }
                    yl70Var = new yl70(iE, z, iD);
                } else if ((iE2 & 64) != 0) {
                    oon1.H("Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                } else {
                    if (iE < 4 || (iE2 & SemanticState.Focused) == 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    yl70Var = new yl70(iE, z, iD);
                }
                if (yl70Var == null) {
                    return null;
                }
                s = yl70Var.a;
                int i3 = izr0Var.b;
                i2 = s == 2 ? 6 : 10;
                iN = yl70Var.c;
                if (yl70Var.b) {
                    iN = N(iN, izr0Var);
                }
                izr0Var.Q(i3 + iN);
                if (!O(izr0Var, s, i2, false)) {
                    if (s == 4 || !O(izr0Var, 4, i2, true)) {
                        td6.p(s, "Failed to validate ID3 tag with majorVersion=");
                        return null;
                    }
                    z2 = true;
                }
                while (izr0Var.a() >= i2) {
                    am70VarY = y(s, izr0Var, z2, i2, this.c);
                    if (am70VarY != null) {
                        arrayList.add(am70VarY);
                    }
                }
                return new hjj0(arrayList);
            }
            oon1.H("Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(iH))));
        }
        yl70Var = null;
        if (yl70Var == null) {
            return null;
        }
        s = yl70Var.a;
        int i4 = izr0Var.b;
        if (s == 2) {
        }
        iN = yl70Var.c;
        if (yl70Var.b) {
            iN = N(iN, izr0Var);
        }
        izr0Var.Q(i4 + iN);
        if (!O(izr0Var, s, i2, false)) {
            if (s == 4) {
            }
            td6.p(s, "Failed to validate ID3 tag with majorVersion=");
            return null;
        }
        while (izr0Var.a() >= i2) {
            am70VarY = y(s, izr0Var, z2, i2, this.c);
            if (am70VarY != null) {
                arrayList.add(am70VarY);
            }
        }
        return new hjj0(arrayList);
    }
}

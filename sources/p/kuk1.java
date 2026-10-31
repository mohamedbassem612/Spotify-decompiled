package p;

import androidx.media3.common.ParserException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class kuk1 extends aec1 {
    public cik1 n;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f84p;
    public luk1 q;
    public h5a1 r;

    @Override // p.aec1
    public final void a(long j) {
        this.g = j;
        this.f84p = j != 0;
        luk1 luk1Var = this.q;
        this.o = luk1Var != null ? luk1Var.e : 0;
    }

    @Override // p.aec1
    public final long b(izr0 izr0Var) {
        if ((izr0Var.a[0] & 1) == 1) {
            return -1L;
        }
        cik1 cik1Var = this.n;
        cik1Var.getClass();
        byte b = izr0Var.a[0];
        luk1 luk1Var = (luk1) cik1Var.b;
        wgz0[] wgz0VarArr = (wgz0[]) cik1Var.e;
        int i = wgz0VarArr[(b >> 1) & (255 >>> (8 - sj1.u(wgz0VarArr.length - 1)))].b ? luk1Var.f : luk1Var.e;
        long j = this.f84p ? (this.o + i) / 4 : 0;
        byte[] bArr = izr0Var.a;
        int length = bArr.length;
        int i2 = izr0Var.c + 4;
        if (length < i2) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i2);
            izr0Var.P(bArrCopyOf, bArrCopyOf.length);
        } else {
            izr0Var.Q(i2);
        }
        byte[] bArr2 = izr0Var.a;
        int i3 = izr0Var.c;
        bArr2[i3 - 4] = (byte) (j & 255);
        bArr2[i3 - 3] = (byte) ((j >>> 8) & 255);
        bArr2[i3 - 2] = (byte) ((j >>> 16) & 255);
        bArr2[i3 - 1] = (byte) ((j >>> 24) & 255);
        this.f84p = true;
        this.o = i;
        return j;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    /* JADX WARN: Code duplicated, block: B:158:0x03a3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:160:0x03a6  */
    @Override // p.aec1
    public final boolean c(izr0 izr0Var, long j, r2a1 r2a1Var) throws ParserException {
        cik1 cik1Var;
        long jFloor;
        if (this.n != null) {
            ((ie30) r2a1Var.b).getClass();
            return false;
        }
        luk1 luk1Var = this.q;
        int i = 4;
        if (luk1Var != null) {
            h5a1 h5a1Var = this.r;
            if (h5a1Var == null) {
                this.r = sj1.y(izr0Var, true, true);
            } else {
                int i2 = izr0Var.c;
                byte[] bArr = new byte[i2];
                System.arraycopy(izr0Var.a, 0, bArr, 0, i2);
                short s = luk1Var.a;
                int i3 = 5;
                sj1.B(5, izr0Var, false);
                int iE = izr0Var.E() + 1;
                bae baeVar = new bae(izr0Var.a);
                int i4 = 8;
                baeVar.o(izr0Var.b * 8);
                int i5 = 0;
                while (true) {
                    int i6 = 2;
                    int i7 = i4;
                    int i8 = 16;
                    if (i5 >= iE) {
                        luk1 luk1Var2 = luk1Var;
                        int i9 = 6;
                        int iG = baeVar.g(6) + 1;
                        for (int i10 = 0; i10 < iG; i10++) {
                            if (baeVar.g(16) != 0) {
                                throw ParserException.a((RuntimeException) null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int i11 = 1;
                        int iG2 = baeVar.g(6) + 1;
                        int i12 = 0;
                        while (true) {
                            int i13 = 3;
                            if (i12 >= iG2) {
                                int iG3 = baeVar.g(i9) + 1;
                                int i14 = 0;
                                while (i14 < iG3) {
                                    if (baeVar.g(16) > 2) {
                                        throw ParserException.a((RuntimeException) null, "residueType greater than 2 is not decodable");
                                    }
                                    baeVar.o(24);
                                    baeVar.o(24);
                                    baeVar.o(24);
                                    int iG4 = baeVar.g(i9) + 1;
                                    int i15 = 8;
                                    baeVar.o(8);
                                    int[] iArr = new int[iG4];
                                    for (int i16 = 0; i16 < iG4; i16++) {
                                        iArr[i16] = ((baeVar.f() ? baeVar.g(5) : 0) * 8) + baeVar.g(3);
                                    }
                                    int i17 = 0;
                                    while (i17 < iG4) {
                                        int i18 = 0;
                                        while (i18 < i15) {
                                            if ((iArr[i17] & (1 << i18)) != 0) {
                                                baeVar.o(i15);
                                            }
                                            i18++;
                                            i15 = 8;
                                        }
                                        i17++;
                                        i15 = 8;
                                    }
                                    i14++;
                                    i9 = 6;
                                }
                                int iG5 = baeVar.g(i9) + 1;
                                for (int i19 = 0; i19 < iG5; i19++) {
                                    int iG6 = baeVar.g(16);
                                    if (iG6 != 0) {
                                        oon1.v("mapping type other than 0 not supported: " + iG6);
                                    } else {
                                        int iG7 = baeVar.f() ? baeVar.g(4) + 1 : 1;
                                        if (baeVar.f()) {
                                            int iG8 = baeVar.g(8) + 1;
                                            for (int i20 = 0; i20 < iG8; i20++) {
                                                int i21 = s - 1;
                                                baeVar.o(sj1.u(i21));
                                                baeVar.o(sj1.u(i21));
                                            }
                                        }
                                        if (baeVar.g(2) != 0) {
                                            throw ParserException.a((RuntimeException) null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                        if (iG7 > 1) {
                                            for (int i22 = 0; i22 < s; i22++) {
                                                baeVar.o(4);
                                            }
                                        }
                                        for (int i23 = 0; i23 < iG7; i23++) {
                                            baeVar.o(8);
                                            baeVar.o(8);
                                            baeVar.o(8);
                                        }
                                    }
                                }
                                int iG9 = baeVar.g(6) + 1;
                                wgz0[] wgz0VarArr = new wgz0[iG9];
                                for (int i24 = 0; i24 < iG9; i24++) {
                                    boolean zF = baeVar.f();
                                    baeVar.g(16);
                                    baeVar.g(16);
                                    baeVar.g(8);
                                    wgz0VarArr[i24] = new wgz0((byte) 12, zF);
                                }
                                if (!baeVar.f()) {
                                    throw ParserException.a((RuntimeException) null, "framing bit after modes not set as expected");
                                }
                                cik1Var = new cik1(luk1Var2, h5a1Var, bArr, wgz0VarArr, (byte) 2);
                                break;
                            }
                            int iG10 = baeVar.g(i8);
                            if (iG10 == 0) {
                                int i25 = i7;
                                baeVar.o(i25);
                                baeVar.o(16);
                                baeVar.o(16);
                                baeVar.o(6);
                                baeVar.o(i25);
                                int iG11 = baeVar.g(4) + 1;
                                int i26 = 0;
                                while (i26 < iG11) {
                                    baeVar.o(i25);
                                    i26++;
                                    i25 = 8;
                                }
                            } else {
                                if (iG10 != i11) {
                                    throw ParserException.a((RuntimeException) null, "floor type greater than 1 not decodable: " + iG10);
                                }
                                int iG12 = baeVar.g(5);
                                int[] iArr2 = new int[iG12];
                                int i27 = -1;
                                for (int i28 = 0; i28 < iG12; i28++) {
                                    int iG13 = baeVar.g(4);
                                    iArr2[i28] = iG13;
                                    if (iG13 > i27) {
                                        i27 = iG13;
                                    }
                                }
                                int i29 = i27 + 1;
                                int[] iArr3 = new int[i29];
                                int i30 = 0;
                                while (i30 < i29) {
                                    iArr3[i30] = baeVar.g(i13) + 1;
                                    int iG14 = baeVar.g(i6);
                                    int i31 = i7;
                                    if (iG14 > 0) {
                                        baeVar.o(i31);
                                    }
                                    int[] iArr4 = iArr3;
                                    int i32 = 0;
                                    for (int i33 = 1; i32 < (i33 << iG14); i33 = 1) {
                                        baeVar.o(i31);
                                        i32++;
                                        i31 = 8;
                                    }
                                    i30++;
                                    iArr3 = iArr4;
                                    i7 = 8;
                                    i6 = 2;
                                    i13 = 3;
                                }
                                int[] iArr5 = iArr3;
                                baeVar.o(i6);
                                int iG15 = baeVar.g(4);
                                int i34 = 0;
                                int i35 = 0;
                                for (int i36 = 0; i36 < iG12; i36++) {
                                    i34 += iArr5[iArr2[i36]];
                                    while (i35 < i34) {
                                        baeVar.o(iG15);
                                        i35++;
                                    }
                                }
                            }
                            i12++;
                            i7 = 8;
                            i9 = 6;
                            i11 = 1;
                            i6 = 2;
                            i8 = 16;
                        }
                    } else {
                        if (baeVar.g(24) != 5653314) {
                            throw ParserException.a((RuntimeException) null, "expected code book to start with [0x56, 0x43, 0x42] at " + ((baeVar.d * 8) + baeVar.e));
                        }
                        int iG16 = baeVar.g(16);
                        int iG17 = baeVar.g(24);
                        if (baeVar.f()) {
                            baeVar.o(i3);
                            for (int iG18 = 0; iG18 < iG17; iG18 += baeVar.g(sj1.u(iG17 - iG18))) {
                            }
                        } else {
                            boolean zF2 = baeVar.f();
                            for (int i37 = 0; i37 < iG17; i37++) {
                                if (!zF2) {
                                    baeVar.o(i3);
                                } else if (baeVar.f()) {
                                    baeVar.o(i3);
                                }
                            }
                        }
                        int iG19 = baeVar.g(i);
                        if (iG19 > 2) {
                            throw ParserException.a((RuntimeException) null, "lookup type greater than 2 not decodable: " + iG19);
                        }
                        if (iG19 == 1 || iG19 == 2) {
                            baeVar.o(32);
                            baeVar.o(32);
                            int iG20 = baeVar.g(i) + 1;
                            baeVar.o(1);
                            if (iG19 == 1) {
                                jFloor = iG16 != 0 ? (long) Math.floor(Math.pow(iG17, 1.0d / ((double) iG16))) : 0L;
                            } else {
                                luk1Var = luk1Var;
                                jFloor = ((long) iG17) * ((long) iG16);
                            }
                            baeVar.o((int) (jFloor * ((long) iG20)));
                        } else {
                            luk1Var = luk1Var;
                            iE = iE;
                        }
                        i5++;
                        i4 = i7;
                        luk1Var = luk1Var;
                        iE = iE;
                        i = 4;
                        i3 = 5;
                    }
                }
            }
            this.n = cik1Var;
            if (cik1Var == null) {
                return true;
            }
            luk1 luk1Var3 = (luk1) cik1Var.b;
            ArrayList arrayList = new ArrayList();
            arrayList.add(luk1Var3.g);
            arrayList.add((byte[]) cik1Var.d);
            hjj0 hjj0VarA = muk1.a(b380.q((String[]) ((h5a1) cik1Var.c).b));
            ge30 ge30Var = new ge30();
            ge30Var.n = asj0.p("audio/ogg");
            ge30Var.o = asj0.p("audio/vorbis");
            ge30Var.i = luk1Var3.d;
            ge30Var.j = luk1Var3.c;
            ge30Var.I = luk1Var3.a;
            ge30Var.K = luk1Var3.b;
            ge30Var.r = arrayList;
            ge30Var.l = hjj0VarA;
            r2a1Var.b = new ie30(ge30Var);
            return true;
        }
        sj1.B(1, izr0Var, false);
        izr0Var.w();
        int iE2 = izr0Var.E();
        int iW = izr0Var.w();
        int iS = izr0Var.s();
        int i38 = iS <= 0 ? -1 : iS;
        int iS2 = izr0Var.s();
        int i39 = iS2 <= 0 ? -1 : iS2;
        izr0Var.s();
        int iE3 = izr0Var.E();
        int iPow = (int) Math.pow(2.0d, iE3 & 15);
        int iPow2 = (int) Math.pow(2.0d, (iE3 & 240) >> 4);
        izr0Var.E();
        this.q = new luk1(iE2, iW, i38, i39, iPow, iPow2, Arrays.copyOf(izr0Var.a, izr0Var.c));
        cik1Var = null;
        this.n = cik1Var;
        if (cik1Var == null) {
            return true;
        }
        luk1 luk1Var4 = (luk1) cik1Var.b;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(luk1Var4.g);
        arrayList2.add((byte[]) cik1Var.d);
        hjj0 hjj0VarA2 = muk1.a(b380.q((String[]) ((h5a1) cik1Var.c).b));
        ge30 ge30Var2 = new ge30();
        ge30Var2.n = asj0.p("audio/ogg");
        ge30Var2.o = asj0.p("audio/vorbis");
        ge30Var2.i = luk1Var4.d;
        ge30Var2.j = luk1Var4.c;
        ge30Var2.I = luk1Var4.a;
        ge30Var2.K = luk1Var4.b;
        ge30Var2.r = arrayList2;
        ge30Var2.l = hjj0VarA2;
        r2a1Var.b = new ie30(ge30Var2);
        return true;
    }

    @Override // p.aec1
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.f84p = false;
    }
}

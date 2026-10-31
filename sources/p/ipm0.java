package p;

import app.p000rive.semantics.SemanticState;
import java.io.EOFException;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ipm0 implements ec10 {
    public final long a;
    public final izr0 b;
    public final xpm0 c;
    public final e440 d;
    public final bm70 e;
    public final x6u f;
    public gc10 g;
    public gtf1 h;
    public gtf1 i;
    public int j;
    public hjj0 k;
    public hjj0 l;
    public long m;
    public long n;
    public long o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f70p;
    public int q;
    public xo51 r;
    public boolean s;
    public boolean t;
    public long u;

    public ipm0(long j) {
        this.a = j;
        this.b = new izr0(10);
        this.c = new xpm0();
        this.d = new e440();
        this.m = -9223372036854775807L;
        this.e = new bm70((byte) 0);
        x6u x6uVar = new x6u();
        this.f = x6uVar;
        this.i = x6uVar;
        this.f70p = -1L;
    }

    @Override // p.ec10
    public final void a(long j, long j2) {
        this.j = 0;
        this.m = -9223372036854775807L;
        this.n = 0L;
        this.q = 0;
        this.f70p = -1L;
        this.u = j2;
        if (this.r instanceof v980) {
            throw null;
        }
    }

    @Override // p.ec10
    public final void b(gc10 gc10Var) {
        this.g = gc10Var;
        gtf1 gtf1VarW = gc10Var.w(0, 1);
        this.h = gtf1VarW;
        this.i = gtf1VarW;
        this.g.s();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0239  */
    /* JADX WARN: Code duplicated, block: B:101:0x0243  */
    /* JADX WARN: Code duplicated, block: B:104:0x0281  */
    /* JADX WARN: Code duplicated, block: B:107:0x0286 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:111:0x0290  */
    /* JADX WARN: Code duplicated, block: B:112:0x029d  */
    /* JADX WARN: Code duplicated, block: B:115:0x02af  */
    /* JADX WARN: Code duplicated, block: B:117:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:118:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:11:0x004e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:126:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:129:0x0305  */
    /* JADX WARN: Code duplicated, block: B:12:0x0050  */
    /* JADX WARN: Code duplicated, block: B:131:0x0309  */
    /* JADX WARN: Code duplicated, block: B:133:0x0315  */
    /* JADX WARN: Code duplicated, block: B:135:0x0319  */
    /* JADX WARN: Code duplicated, block: B:139:0x032d  */
    /* JADX WARN: Code duplicated, block: B:13:0x0052  */
    /* JADX WARN: Code duplicated, block: B:142:0x0353  */
    /* JADX WARN: Code duplicated, block: B:143:0x0357  */
    /* JADX WARN: Code duplicated, block: B:145:0x035d  */
    /* JADX WARN: Code duplicated, block: B:147:0x036b  */
    /* JADX WARN: Code duplicated, block: B:14:0x0055 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:150:0x037a  */
    /* JADX WARN: Code duplicated, block: B:153:0x037f A[LOOP:0: B:144:0x035b->B:153:0x037f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:158:0x0389  */
    /* JADX WARN: Code duplicated, block: B:160:0x0391  */
    /* JADX WARN: Code duplicated, block: B:162:0x039f  */
    /* JADX WARN: Code duplicated, block: B:165:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:168:0x03b8 A[LOOP:1: B:159:0x038f->B:168:0x03b8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:16:0x0058  */
    /* JADX WARN: Code duplicated, block: B:172:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:173:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:176:0x03e6 A[LOOP:2: B:175:0x03e4->B:176:0x03e6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:180:0x0417  */
    /* JADX WARN: Code duplicated, block: B:181:0x0422 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:182:0x0424  */
    /* JADX WARN: Code duplicated, block: B:183:0x0428 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:184:0x042a  */
    /* JADX WARN: Code duplicated, block: B:185:0x042f  */
    /* JADX WARN: Code duplicated, block: B:189:0x0467  */
    /* JADX WARN: Code duplicated, block: B:192:0x0482 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:193:0x0484  */
    /* JADX WARN: Code duplicated, block: B:197:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:199:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:19:0x0070  */
    /* JADX WARN: Code duplicated, block: B:201:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:203:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:206:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:208:0x0500  */
    /* JADX WARN: Code duplicated, block: B:209:0x0507  */
    /* JADX WARN: Code duplicated, block: B:211:0x051f  */
    /* JADX WARN: Code duplicated, block: B:213:0x0526  */
    /* JADX WARN: Code duplicated, block: B:214:0x052d  */
    /* JADX WARN: Code duplicated, block: B:216:0x053b  */
    /* JADX WARN: Code duplicated, block: B:218:0x054d  */
    /* JADX WARN: Code duplicated, block: B:222:0x0571  */
    /* JADX WARN: Code duplicated, block: B:224:0x057e  */
    /* JADX WARN: Code duplicated, block: B:226:0x058a A[PHI: r22
      0x058a: PHI (r22v4 long) = (r22v3 long), (r22v7 long) binds: [B:232:0x05a6, B:225:0x0584] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:227:0x058d  */
    /* JADX WARN: Code duplicated, block: B:230:0x059e A[PHI: r22
      0x059e: PHI (r22v5 long) = (r22v3 long), (r22v10 long) binds: [B:229:0x059c, B:208:0x0500] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:231:0x05a1  */
    /* JADX WARN: Code duplicated, block: B:234:0x05a9  */
    /* JADX WARN: Code duplicated, block: B:23:0x007c  */
    /* JADX WARN: Code duplicated, block: B:248:0x0602  */
    /* JADX WARN: Code duplicated, block: B:257:0x0382 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:258:0x0384 A[EDGE_INSN: B:258:0x0384->B:155:0x0384 BREAK  A[LOOP:0: B:144:0x035b->B:153:0x037f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:259:0x03bd A[EDGE_INSN: B:259:0x03bd->B:170:0x03bd BREAK  A[LOOP:1: B:159:0x038f->B:168:0x03b8], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0082  */
    /* JADX WARN: Code duplicated, block: B:260:0x03bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:262:0x013d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:263:0x0116 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x008b  */
    /* JADX WARN: Code duplicated, block: B:28:0x008d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0097  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:40:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:42:0x010d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0110  */
    /* JADX WARN: Code duplicated, block: B:46:0x0113  */
    /* JADX WARN: Code duplicated, block: B:49:0x011a  */
    /* JADX WARN: Code duplicated, block: B:50:0x011f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0124  */
    /* JADX WARN: Code duplicated, block: B:52:0x0129  */
    /* JADX WARN: Code duplicated, block: B:59:0x015c  */
    /* JADX WARN: Code duplicated, block: B:62:0x0162  */
    /* JADX WARN: Code duplicated, block: B:63:0x017e  */
    /* JADX WARN: Code duplicated, block: B:68:0x019a  */
    /* JADX WARN: Code duplicated, block: B:69:0x019f  */
    /* JADX WARN: Code duplicated, block: B:72:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:73:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:76:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:78:0x01b7 A[LOOP:4: B:77:0x01b5->B:78:0x01b7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:80:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:84:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:87:0x01db  */
    /* JADX WARN: Code duplicated, block: B:89:0x0204 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:93:0x020c  */
    /* JADX WARN: Code duplicated, block: B:96:0x0229  */
    /* JADX WARN: Code duplicated, block: B:9:0x0035  */
    @Override // p.ec10
    public final int c(fc10 fc10Var, sfv0 sfv0Var) throws Throwable {
        e440 e440Var;
        Throwable th;
        int i;
        int i2;
        long j;
        long j2;
        long j3;
        long j4;
        int i3;
        xo51 xo51Var;
        izr0 izr0Var;
        int i4;
        izr0 izr0Var2;
        long j5;
        long position;
        long j6;
        int iE;
        int i5;
        int iQ;
        int i6;
        long j7;
        izr0 izr0Var3;
        int i7;
        int i8;
        int i9;
        int iQ2;
        izr0 izr0Var4;
        int iQ3;
        int I;
        long jMin;
        long[] jArr;
        izr0 izr0Var5;
        kpm0 kpm0Var;
        int iMax;
        int i10;
        qhn1 qhn1Var;
        long j8;
        xpm0 xpm0Var;
        hjj0 hjj0Var;
        long position2;
        long length;
        long jA;
        long j9;
        long j10;
        int iK;
        xo51 qglVar;
        long length2;
        long jA2;
        String strC;
        float fIntBitsToFloat;
        jpm0 jpm0VarA;
        jpm0 jpm0VarA2;
        long[] jArr2;
        int i11;
        hjj0 hjj0Var2;
        long position3;
        rij0[] rij0VarArr;
        int length3;
        int i12;
        rij0 rij0Var;
        uok0 uok0Var;
        int[] iArr;
        rij0[] rij0VarArr2;
        int length4;
        int i13;
        rij0 rij0Var2;
        v8e1 v8e1Var;
        char c;
        long jW;
        int length5;
        long[] jArr3;
        long[] jArr4;
        long j11;
        int i14;
        vok0 vok0Var;
        rij0 rij0Var3;
        rij0 rij0Var4;
        xo51 qglVar2;
        hjj0 hjj0VarB;
        hjj0 hjj0Var3;
        ge30 ge30Var;
        long length6;
        long position4;
        long j12;
        long j13;
        int iQ4;
        long jE0;
        int iL;
        int iL2;
        int iL3;
        long[] jArr5;
        long[] jArr6;
        long j14;
        int i15;
        long j15;
        long jMax;
        izr0 izr0Var6;
        int iE2;
        this.h.getClass();
        String str = zoi1.a;
        int i16 = this.j;
        e440 e440Var2 = this.d;
        xpm0 xpm0Var2 = this.c;
        if (i16 == 0) {
            try {
                h(fc10Var, false);
                xo51Var = this.r;
                th = null;
                izr0Var = this.b;
                j = 1000000;
                i4 = 1;
                if (xo51Var == null) {
                    izr0Var3 = new izr0(xpm0Var2.c);
                    j2 = 1;
                    fc10Var.h(0, izr0Var3.a, xpm0Var2.c);
                    i7 = xpm0Var2.a & 1;
                    i8 = xpm0Var2.e;
                    if (i7 != 0) {
                        if (i8 != 1) {
                            i9 = 36;
                        } else {
                            i9 = 21;
                        }
                    } else if (i8 != 1) {
                        i9 = 21;
                    } else {
                        i9 = 13;
                    }
                    j5 = 0;
                    if (izr0Var3.c >= i9 + 4) {
                        izr0Var3.R(i9);
                        iQ2 = izr0Var3.q();
                        if (iQ2 != 1483304551 && iQ2 != 1231971951) {
                            if (izr0Var3.c >= 40) {
                                izr0Var3.R(36);
                                if (izr0Var3.q() == 1447187017) {
                                    iQ2 = 1447187017;
                                } else {
                                    iQ2 = 0;
                                }
                            } else {
                                iQ2 = 0;
                            }
                        }
                    } else if (izr0Var3.c >= 40) {
                        izr0Var3.R(36);
                        if (izr0Var3.q() == 1447187017) {
                            iQ2 = 1447187017;
                        } else {
                            iQ2 = 0;
                        }
                    } else {
                        iQ2 = 0;
                    }
                    if (iQ2 == 1231971951) {
                        izr0Var4 = izr0Var;
                        iQ3 = izr0Var3.q();
                        if ((iQ3 & 1) != 0) {
                            I = izr0Var3.I();
                        } else {
                            I = -1;
                        }
                        if ((iQ3 & 2) != 0) {
                            jMin = izr0Var3.G();
                        } else {
                            jMin = -1;
                        }
                        if ((iQ3 & 4) == 4) {
                            jArr2 = new long[100];
                            for (i11 = 0; i11 < 100; i11++) {
                                jArr2[i11] = izr0Var3.E();
                            }
                            jArr = jArr2;
                        } else {
                            jArr = null;
                        }
                        if ((iQ3 & 8) != 0) {
                            izr0Var5 = izr0Var3;
                            izr0Var5.S(4);
                        } else {
                            izr0Var5 = izr0Var3;
                        }
                        if (izr0Var5.a() >= 24) {
                            strC = izr0Var5.C(9, StandardCharsets.UTF_8);
                            izr0Var5.S(2);
                            fIntBitsToFloat = Float.intBitsToFloat(izr0Var5.q());
                            int iL4 = izr0Var5.L();
                            int iL5 = izr0Var5.L();
                            jpm0VarA = jpm0.a(iL4);
                            jpm0VarA2 = jpm0.a(iL5);
                            if (fIntBitsToFloat > 0.0f && jpm0VarA == null && jpm0VarA2 == null) {
                                kpm0Var = null;
                            } else {
                                kpm0Var = new kpm0(fIntBitsToFloat, jpm0VarA, jpm0VarA2);
                            }
                            izr0Var5.S(2);
                            int iH = izr0Var5.H();
                            i10 = (16773120 & iH) >> 12;
                            iMax = iH & 4095;
                            if (strC.startsWith("LAME") || strC.startsWith("Lavf") || strC.startsWith("Lavc")) {
                                i10 += 529;
                                iMax = Math.max(0, iMax - 529);
                            }
                        } else {
                            kpm0Var = null;
                            iMax = -1;
                            i10 = -1;
                        }
                        j8 = I;
                        qhn1Var = new qhn1();
                        xpm0 xpm0Var3 = new xpm0();
                        xpm0Var3.a = xpm0Var2.a;
                        xpm0Var3.b = xpm0Var2.b;
                        xpm0Var3.c = xpm0Var2.c;
                        xpm0Var3.d = xpm0Var2.d;
                        xpm0Var3.e = xpm0Var2.e;
                        xpm0Var3.f = xpm0Var2.f;
                        xpm0Var3.g = xpm0Var2.g;
                        qhn1Var.c = xpm0Var3;
                        qhn1Var.b = j8;
                        qhn1Var.a = i10;
                        qhn1Var.d = iMax;
                        xpm0Var = (xpm0) qhn1Var.c;
                        e440Var = e440Var2;
                        if ((e440Var.a != -1 || e440Var.b == -1) && i10 != -1 && iMax != -1) {
                            e440Var.a = i10;
                            e440Var.b = iMax;
                        }
                        if (kpm0Var != null) {
                            hjj0Var = new hjj0(kpm0Var);
                        } else {
                            hjj0Var = null;
                        }
                        this.l = hjj0Var;
                        position2 = fc10Var.getPosition();
                        fc10Var.u(xpm0Var2.c);
                        if (iQ2 == 1483304551) {
                            length2 = fc10Var.getLength();
                            jA2 = qhn1Var.a();
                            if (jA2 == -9223372036854775807L) {
                                qglVar = null;
                            } else {
                                if (jMin != -1 && length2 != -1 && position2 + jMin != length2) {
                                    long j16 = length2 - position2;
                                    StringBuilder sbS = cy30.s(j16, "Data size mismatch between stream (", ") and Xing frame (");
                                    sbS.append(jMin);
                                    sbS.append("), using smaller value.");
                                    oon1.A(sbS.toString());
                                    jMin = Math.min(jMin, j16);
                                }
                                qglVar = new gkm1(position2, xpm0Var.c, jA2, jMin, jArr);
                            }
                        } else {
                            length = fc10Var.getLength();
                            jA = qhn1Var.a();
                            if (jA != -9223372036854775807L) {
                                if (jMin != -1) {
                                    length = position2 + jMin;
                                    j9 = jMin - ((long) xpm0Var.c);
                                } else if (length != -1) {
                                    j9 = (length - position2) - ((long) xpm0Var.c);
                                } else {
                                    qglVar = null;
                                }
                                j10 = length;
                                iK = qxd0.K(j9, jA);
                                if (iK == -2147483647) {
                                    qglVar = null;
                                } else {
                                    qglVar = new qgl(j10, position2 + ((long) xpm0Var.c), iK, bmq0.j(cwl1.u(j9, j8, RoundingMode.HALF_UP)), false, true, jA);
                                }
                            } else {
                                qglVar = null;
                            }
                        }
                    } else if (iQ2 != 1447187017) {
                        length6 = fc10Var.getLength();
                        position4 = fc10Var.getPosition();
                        izr0Var3.S(6);
                        int iQ5 = izr0Var3.q();
                        j12 = position4 + ((long) xpm0Var2.c);
                        j13 = j12 + ((long) iQ5);
                        iQ4 = izr0Var3.q();
                        if (iQ4 <= 0) {
                            jE0 = zoi1.e0(xpm0Var2.d, (((long) iQ4) * ((long) xpm0Var2.g)) - 1);
                            iL = izr0Var3.L();
                            iL2 = izr0Var3.L();
                            iL3 = izr0Var3.L();
                            izr0Var3.S(2);
                            jArr5 = new long[iL];
                            jArr6 = new long[iL];
                            j14 = position4 + ((long) xpm0Var2.c);
                            i15 = 0;
                            while (true) {
                                if (i15 < iL) {
                                    izr0Var4 = izr0Var;
                                    if (length6 != -1 || length6 == j13) {
                                        j15 = j13;
                                    } else {
                                        StringBuilder sbS2 = cy30.s(length6, "VBRI data size mismatch: ", ", ");
                                        j15 = j13;
                                        sbS2.append(j15);
                                        oon1.H(sbS2.toString());
                                    }
                                    if (j15 != j14) {
                                        StringBuilder sbS3 = cy30.s(j15, "VBRI bytes and ToC mismatch (using max): ", ", ");
                                        sbS3.append(j14);
                                        sbS3.append("\nSeeking will be inaccurate.");
                                        oon1.H(sbS3.toString());
                                        jMax = Math.max(j15, j14);
                                    } else {
                                        jMax = j15;
                                    }
                                    qglVar = new kti1(jArr5, jArr6, jE0, j12, jMax);
                                    break;
                                }
                                izr0Var6 = izr0Var3;
                                izr0Var4 = izr0Var;
                                jArr5[i15] = (((long) i15) * jE0) / ((long) iL);
                                jArr6[i15] = j14;
                                if (iL3 != i4) {
                                    iE2 = izr0Var6.E();
                                } else if (iL3 != 2) {
                                    iE2 = izr0Var6.L();
                                } else if (iL3 != 3) {
                                    iE2 = izr0Var6.H();
                                } else {
                                    if (iL3 != 4) {
                                        qglVar = null;
                                        break;
                                    }
                                    iE2 = izr0Var6.I();
                                }
                                j14 += ((long) iE2) * ((long) iL2);
                                i15++;
                                izr0Var = izr0Var4;
                                izr0Var3 = izr0Var6;
                                iL = iL;
                                i4 = 1;
                            }
                        } else {
                            qglVar = null;
                            izr0Var4 = izr0Var;
                        }
                        fc10Var.u(xpm0Var2.c);
                        e440Var = e440Var2;
                    } else if (iQ2 != 1483304551) {
                        fc10Var.f();
                        qglVar = null;
                        izr0Var4 = izr0Var;
                        e440Var = e440Var2;
                    } else {
                        izr0Var4 = izr0Var;
                        iQ3 = izr0Var3.q();
                        if ((iQ3 & 1) != 0) {
                            I = izr0Var3.I();
                        } else {
                            I = -1;
                        }
                        if ((iQ3 & 2) != 0) {
                            jMin = izr0Var3.G();
                        } else {
                            jMin = -1;
                        }
                        if ((iQ3 & 4) == 4) {
                            jArr2 = new long[100];
                            while (i11 < 100) {
                                jArr2[i11] = izr0Var3.E();
                            }
                            jArr = jArr2;
                        } else {
                            jArr = null;
                        }
                        if ((iQ3 & 8) != 0) {
                            izr0Var5 = izr0Var3;
                            izr0Var5.S(4);
                        } else {
                            izr0Var5 = izr0Var3;
                        }
                        if (izr0Var5.a() >= 24) {
                            strC = izr0Var5.C(9, StandardCharsets.UTF_8);
                            izr0Var5.S(2);
                            fIntBitsToFloat = Float.intBitsToFloat(izr0Var5.q());
                            int iL6 = izr0Var5.L();
                            int iL7 = izr0Var5.L();
                            jpm0VarA = jpm0.a(iL6);
                            jpm0VarA2 = jpm0.a(iL7);
                            if (fIntBitsToFloat > 0.0f) {
                                kpm0Var = new kpm0(fIntBitsToFloat, jpm0VarA, jpm0VarA2);
                            } else {
                                kpm0Var = new kpm0(fIntBitsToFloat, jpm0VarA, jpm0VarA2);
                            }
                            izr0Var5.S(2);
                            int iH2 = izr0Var5.H();
                            i10 = (16773120 & iH2) >> 12;
                            iMax = iH2 & 4095;
                            if (strC.startsWith("LAME")) {
                                i10 += 529;
                                iMax = Math.max(0, iMax - 529);
                            } else {
                                i10 += 529;
                                iMax = Math.max(0, iMax - 529);
                            }
                        } else {
                            kpm0Var = null;
                            iMax = -1;
                            i10 = -1;
                        }
                        j8 = I;
                        qhn1Var = new qhn1();
                        xpm0 xpm0Var4 = new xpm0();
                        xpm0Var4.a = xpm0Var2.a;
                        xpm0Var4.b = xpm0Var2.b;
                        xpm0Var4.c = xpm0Var2.c;
                        xpm0Var4.d = xpm0Var2.d;
                        xpm0Var4.e = xpm0Var2.e;
                        xpm0Var4.f = xpm0Var2.f;
                        xpm0Var4.g = xpm0Var2.g;
                        qhn1Var.c = xpm0Var4;
                        qhn1Var.b = j8;
                        qhn1Var.a = i10;
                        qhn1Var.d = iMax;
                        xpm0Var = (xpm0) qhn1Var.c;
                        e440Var = e440Var2;
                        if (e440Var.a != -1) {
                            e440Var.a = i10;
                            e440Var.b = iMax;
                        } else {
                            e440Var.a = i10;
                            e440Var.b = iMax;
                        }
                        if (kpm0Var != null) {
                            hjj0Var = new hjj0(kpm0Var);
                        } else {
                            hjj0Var = null;
                        }
                        this.l = hjj0Var;
                        position2 = fc10Var.getPosition();
                        fc10Var.u(xpm0Var2.c);
                        if (iQ2 == 1483304551) {
                            length2 = fc10Var.getLength();
                            jA2 = qhn1Var.a();
                            if (jA2 == -9223372036854775807L) {
                                qglVar = null;
                            } else {
                                if (jMin != -1) {
                                    long j17 = length2 - position2;
                                    StringBuilder sbS4 = cy30.s(j17, "Data size mismatch between stream (", ") and Xing frame (");
                                    sbS4.append(jMin);
                                    sbS4.append("), using smaller value.");
                                    oon1.A(sbS4.toString());
                                    jMin = Math.min(jMin, j17);
                                }
                                qglVar = new gkm1(position2, xpm0Var.c, jA2, jMin, jArr);
                            }
                        } else {
                            length = fc10Var.getLength();
                            jA = qhn1Var.a();
                            if (jA != -9223372036854775807L) {
                                if (jMin != -1) {
                                    length = position2 + jMin;
                                    j9 = jMin - ((long) xpm0Var.c);
                                } else if (length != -1) {
                                    j9 = (length - position2) - ((long) xpm0Var.c);
                                } else {
                                    qglVar = null;
                                }
                                j10 = length;
                                iK = qxd0.K(j9, jA);
                                if (iK == -2147483647) {
                                    qglVar = null;
                                } else {
                                    qglVar = new qgl(j10, position2 + ((long) xpm0Var.c), iK, bmq0.j(cwl1.u(j9, j8, RoundingMode.HALF_UP)), false, true, jA);
                                }
                            } else {
                                qglVar = null;
                            }
                        }
                    }
                    hjj0Var2 = this.k;
                    position3 = fc10Var.getPosition();
                    if (hjj0Var2 == null) {
                        vok0Var = null;
                    } else {
                        rij0VarArr = hjj0Var2.a;
                        length3 = rij0VarArr.length;
                        i12 = 0;
                        while (true) {
                            if (i12 < length3) {
                                rij0Var = null;
                                break;
                            }
                            rij0Var4 = rij0VarArr[i12];
                            if (uok0.class.isAssignableFrom(rij0Var4.getClass())) {
                                rij0Var = (rij0) uok0.class.cast(rij0Var4);
                                if (!zmv0.a.apply(rij0Var)) {
                                    rij0Var = null;
                                }
                            } else {
                                rij0Var = null;
                            }
                            if (rij0Var != null) {
                                break;
                            }
                            i12++;
                        }
                        uok0Var = (uok0) rij0Var;
                        if (uok0Var == null) {
                            vok0Var = null;
                        } else {
                            iArr = uok0Var.e;
                            rij0VarArr2 = hjj0Var2.a;
                            length4 = rij0VarArr2.length;
                            i13 = 0;
                            while (true) {
                                if (i13 < length4) {
                                    rij0Var2 = null;
                                    break;
                                }
                                rij0Var3 = rij0VarArr2[i13];
                                if (v8e1.class.isAssignableFrom(rij0Var3.getClass())) {
                                    rij0Var2 = (rij0) v8e1.class.cast(rij0Var3);
                                    if (!((v8e1) rij0Var2).a.equals("TLEN")) {
                                        rij0Var2 = null;
                                    }
                                } else {
                                    rij0Var2 = null;
                                }
                                if (rij0Var2 != null) {
                                    break;
                                }
                                i13++;
                            }
                            v8e1Var = (v8e1) rij0Var2;
                            if (v8e1Var == null) {
                                jW = -9223372036854775807L;
                                c = 0;
                            } else {
                                c = 0;
                                jW = zoi1.W(Long.parseLong((String) v8e1Var.c.get(0)));
                            }
                            length5 = iArr.length;
                            int i17 = length5 + 1;
                            jArr3 = new long[i17];
                            jArr4 = new long[i17];
                            jArr3[c] = position3;
                            jArr4[c] = 0;
                            j11 = 0;
                            i14 = 1;
                            while (i14 <= length5) {
                                int i18 = i14 - 1;
                                long j18 = position3 + ((long) (uok0Var.c + iArr[i18]));
                                j11 += (long) (uok0Var.d + uok0Var.f[i18]);
                                jArr3[i14] = j18;
                                jArr4[i14] = j11;
                                i14++;
                                length5 = length5;
                                position3 = j18;
                            }
                            vok0Var = new vok0(jW, jArr3, jArr4);
                        }
                    }
                    if (this.s) {
                        qglVar2 = new wo51(-9223372036854775807L);
                        izr0Var2 = izr0Var4;
                    } else {
                        if (vok0Var != null) {
                            qglVar2 = vok0Var;
                            izr0Var2 = izr0Var4;
                        } else if (qglVar != null) {
                            izr0Var2 = izr0Var4;
                            qglVar2 = qglVar;
                        } else {
                            izr0Var2 = izr0Var4;
                            fc10Var.h(0, izr0Var2.a, 4);
                            izr0Var2.R(0);
                            xpm0Var2.a(izr0Var2.q());
                            qglVar2 = new qgl(fc10Var.getLength(), fc10Var.getPosition(), xpm0Var2.f, xpm0Var2.c, false, true, -9223372036854775807L);
                        }
                        if (!(qglVar2 instanceof qgl)) {
                            qglVar2.d();
                        }
                    }
                    this.r = qglVar2;
                    this.h.g(qglVar2.g());
                    this.g.c(this.r);
                    hjj0VarB = this.k;
                    hjj0Var3 = this.l;
                    if (hjj0VarB != null) {
                        if (hjj0Var3 != null) {
                            hjj0VarB = hjj0VarB.b(hjj0Var3);
                        }
                        hjj0Var3 = hjj0VarB;
                    }
                    ge30Var = new ge30();
                    ge30Var.n = asj0.p("audio/mpeg");
                    ge30Var.o = asj0.p(xpm0Var2.b);
                    ge30Var.f52p = SemanticState.Obscured;
                    ge30Var.I = xpm0Var2.e;
                    ge30Var.K = xpm0Var2.d;
                    ge30Var.M = e440Var.a;
                    ge30Var.N = e440Var.b;
                    ge30Var.l = hjj0Var3;
                    if (this.r.f() != -2147483647) {
                        ge30Var.i = this.r.f();
                    }
                    this.i.a(new ie30(ge30Var));
                    this.o = fc10Var.getPosition();
                } else {
                    izr0Var2 = izr0Var;
                    e440Var = e440Var2;
                    j2 = 1;
                    j5 = 0;
                    if (this.o != 0) {
                        position = fc10Var.getPosition();
                        j6 = this.o;
                        if (position < j6) {
                            fc10Var.u((int) (j6 - position));
                        }
                    }
                }
                if (this.q == 0) {
                    fc10Var.f();
                    if (g(fc10Var)) {
                        j3 = -9223372036854775807L;
                    } else {
                        izr0Var2.R(0);
                        iQ = izr0Var2.q();
                        if (((-128000) & iQ) == (((long) this.j) & (-128000))) {
                            j3 = -9223372036854775807L;
                            i6 = 1;
                        } else if (kqn1.t(iQ) == -1) {
                            i6 = 1;
                            j3 = -9223372036854775807L;
                        } else {
                            xpm0Var2.a(iQ);
                            j3 = -9223372036854775807L;
                            if (this.m == -9223372036854775807L) {
                                this.m = this.r.e(fc10Var.getPosition());
                                j7 = this.a;
                                if (j7 != -9223372036854775807L) {
                                    this.m = (j7 - this.r.e(j5)) + this.m;
                                }
                            }
                            this.q = xpm0Var2.c;
                            this.f70p = fc10Var.getPosition() + ((long) xpm0Var2.c);
                            if (this.r instanceof v980) {
                                long j19 = ((this.n + ((long) xpm0Var2.g)) * 1000000) / ((long) xpm0Var2.d);
                                throw null;
                            }
                        }
                        fc10Var.u(i6);
                        this.j = 0;
                        i = -1;
                        i2 = 0;
                    }
                    i = -1;
                    i2 = -1;
                } else {
                    j3 = -9223372036854775807L;
                }
                iE = this.i.e(fc10Var, this.q, true);
                if (iE == -1) {
                    i = -1;
                    i2 = -1;
                } else {
                    i5 = this.q - iE;
                    this.q = i5;
                    if (i5 > 0) {
                        i = -1;
                        i2 = 0;
                    } else {
                        this.i.b(((this.n * 1000000) / ((long) xpm0Var2.d)) + this.m, 1, xpm0Var2.c, 0, null);
                        this.n += (long) xpm0Var2.g;
                        this.q = 0;
                        i2 = 0;
                        i = -1;
                    }
                }
            } catch (EOFException unused) {
                e440Var = e440Var2;
                th = null;
                i = -1;
                i2 = -1;
                j = 1000000;
                j2 = 1;
                j3 = -9223372036854775807L;
            }
        } else {
            xo51Var = this.r;
            th = null;
            izr0Var = this.b;
            j = 1000000;
            i4 = 1;
            if (xo51Var == null) {
                izr0Var3 = new izr0(xpm0Var2.c);
                j2 = 1;
                fc10Var.h(0, izr0Var3.a, xpm0Var2.c);
                i7 = xpm0Var2.a & 1;
                i8 = xpm0Var2.e;
                if (i7 != 0) {
                    if (i8 != 1) {
                        i9 = 36;
                    } else {
                        i9 = 21;
                    }
                } else if (i8 != 1) {
                    i9 = 21;
                } else {
                    i9 = 13;
                }
                j5 = 0;
                if (izr0Var3.c >= i9 + 4) {
                    izr0Var3.R(i9);
                    iQ2 = izr0Var3.q();
                    if (iQ2 != 1483304551) {
                        if (izr0Var3.c >= 40) {
                            izr0Var3.R(36);
                            if (izr0Var3.q() == 1447187017) {
                                iQ2 = 1447187017;
                            } else {
                                iQ2 = 0;
                            }
                        } else {
                            iQ2 = 0;
                        }
                    }
                } else if (izr0Var3.c >= 40) {
                    izr0Var3.R(36);
                    if (izr0Var3.q() == 1447187017) {
                        iQ2 = 1447187017;
                    } else {
                        iQ2 = 0;
                    }
                } else {
                    iQ2 = 0;
                }
                if (iQ2 == 1231971951) {
                    izr0Var4 = izr0Var;
                    iQ3 = izr0Var3.q();
                    if ((iQ3 & 1) != 0) {
                        I = izr0Var3.I();
                    } else {
                        I = -1;
                    }
                    if ((iQ3 & 2) != 0) {
                        jMin = izr0Var3.G();
                    } else {
                        jMin = -1;
                    }
                    if ((iQ3 & 4) == 4) {
                        jArr2 = new long[100];
                        while (i11 < 100) {
                            jArr2[i11] = izr0Var3.E();
                        }
                        jArr = jArr2;
                    } else {
                        jArr = null;
                    }
                    if ((iQ3 & 8) != 0) {
                        izr0Var5 = izr0Var3;
                        izr0Var5.S(4);
                    } else {
                        izr0Var5 = izr0Var3;
                    }
                    if (izr0Var5.a() >= 24) {
                        strC = izr0Var5.C(9, StandardCharsets.UTF_8);
                        izr0Var5.S(2);
                        fIntBitsToFloat = Float.intBitsToFloat(izr0Var5.q());
                        int iL8 = izr0Var5.L();
                        int iL9 = izr0Var5.L();
                        jpm0VarA = jpm0.a(iL8);
                        jpm0VarA2 = jpm0.a(iL9);
                        if (fIntBitsToFloat > 0.0f) {
                            kpm0Var = new kpm0(fIntBitsToFloat, jpm0VarA, jpm0VarA2);
                        } else {
                            kpm0Var = new kpm0(fIntBitsToFloat, jpm0VarA, jpm0VarA2);
                        }
                        izr0Var5.S(2);
                        int iH3 = izr0Var5.H();
                        i10 = (16773120 & iH3) >> 12;
                        iMax = iH3 & 4095;
                        if (strC.startsWith("LAME")) {
                            i10 += 529;
                            iMax = Math.max(0, iMax - 529);
                        } else {
                            i10 += 529;
                            iMax = Math.max(0, iMax - 529);
                        }
                    } else {
                        kpm0Var = null;
                        iMax = -1;
                        i10 = -1;
                    }
                    j8 = I;
                    qhn1Var = new qhn1();
                    xpm0 xpm0Var5 = new xpm0();
                    xpm0Var5.a = xpm0Var2.a;
                    xpm0Var5.b = xpm0Var2.b;
                    xpm0Var5.c = xpm0Var2.c;
                    xpm0Var5.d = xpm0Var2.d;
                    xpm0Var5.e = xpm0Var2.e;
                    xpm0Var5.f = xpm0Var2.f;
                    xpm0Var5.g = xpm0Var2.g;
                    qhn1Var.c = xpm0Var5;
                    qhn1Var.b = j8;
                    qhn1Var.a = i10;
                    qhn1Var.d = iMax;
                    xpm0Var = (xpm0) qhn1Var.c;
                    e440Var = e440Var2;
                    if (e440Var.a != -1) {
                        e440Var.a = i10;
                        e440Var.b = iMax;
                    } else {
                        e440Var.a = i10;
                        e440Var.b = iMax;
                    }
                    if (kpm0Var != null) {
                        hjj0Var = new hjj0(kpm0Var);
                    } else {
                        hjj0Var = null;
                    }
                    this.l = hjj0Var;
                    position2 = fc10Var.getPosition();
                    fc10Var.u(xpm0Var2.c);
                    if (iQ2 == 1483304551) {
                        length2 = fc10Var.getLength();
                        jA2 = qhn1Var.a();
                        if (jA2 == -9223372036854775807L) {
                            qglVar = null;
                        } else {
                            if (jMin != -1) {
                                long j110 = length2 - position2;
                                StringBuilder sbS5 = cy30.s(j110, "Data size mismatch between stream (", ") and Xing frame (");
                                sbS5.append(jMin);
                                sbS5.append("), using smaller value.");
                                oon1.A(sbS5.toString());
                                jMin = Math.min(jMin, j110);
                            }
                            qglVar = new gkm1(position2, xpm0Var.c, jA2, jMin, jArr);
                        }
                    } else {
                        length = fc10Var.getLength();
                        jA = qhn1Var.a();
                        if (jA != -9223372036854775807L) {
                            if (jMin != -1) {
                                length = position2 + jMin;
                                j9 = jMin - ((long) xpm0Var.c);
                            } else if (length != -1) {
                                j9 = (length - position2) - ((long) xpm0Var.c);
                            } else {
                                qglVar = null;
                            }
                            j10 = length;
                            iK = qxd0.K(j9, jA);
                            if (iK == -2147483647) {
                                qglVar = null;
                            } else {
                                qglVar = new qgl(j10, position2 + ((long) xpm0Var.c), iK, bmq0.j(cwl1.u(j9, j8, RoundingMode.HALF_UP)), false, true, jA);
                            }
                        } else {
                            qglVar = null;
                        }
                    }
                } else if (iQ2 != 1447187017) {
                    length6 = fc10Var.getLength();
                    position4 = fc10Var.getPosition();
                    izr0Var3.S(6);
                    int iQ6 = izr0Var3.q();
                    j12 = position4 + ((long) xpm0Var2.c);
                    j13 = j12 + ((long) iQ6);
                    iQ4 = izr0Var3.q();
                    if (iQ4 <= 0) {
                        jE0 = zoi1.e0(xpm0Var2.d, (((long) iQ4) * ((long) xpm0Var2.g)) - 1);
                        iL = izr0Var3.L();
                        iL2 = izr0Var3.L();
                        iL3 = izr0Var3.L();
                        izr0Var3.S(2);
                        jArr5 = new long[iL];
                        jArr6 = new long[iL];
                        j14 = position4 + ((long) xpm0Var2.c);
                        i15 = 0;
                        while (true) {
                            if (i15 < iL) {
                                izr0Var4 = izr0Var;
                                if (length6 != -1) {
                                    j15 = j13;
                                } else {
                                    j15 = j13;
                                }
                                if (j15 != j14) {
                                    StringBuilder sbS6 = cy30.s(j15, "VBRI bytes and ToC mismatch (using max): ", ", ");
                                    sbS6.append(j14);
                                    sbS6.append("\nSeeking will be inaccurate.");
                                    oon1.H(sbS6.toString());
                                    jMax = Math.max(j15, j14);
                                } else {
                                    jMax = j15;
                                }
                                qglVar = new kti1(jArr5, jArr6, jE0, j12, jMax);
                                break;
                            }
                            izr0Var6 = izr0Var3;
                            izr0Var4 = izr0Var;
                            jArr5[i15] = (((long) i15) * jE0) / ((long) iL);
                            jArr6[i15] = j14;
                            if (iL3 != i4) {
                                iE2 = izr0Var6.E();
                            } else if (iL3 != 2) {
                                iE2 = izr0Var6.L();
                            } else if (iL3 != 3) {
                                iE2 = izr0Var6.H();
                            } else {
                                if (iL3 != 4) {
                                    qglVar = null;
                                    break;
                                }
                                iE2 = izr0Var6.I();
                            }
                            j14 += ((long) iE2) * ((long) iL2);
                            i15++;
                            izr0Var = izr0Var4;
                            izr0Var3 = izr0Var6;
                            iL = iL;
                            i4 = 1;
                        }
                    } else {
                        qglVar = null;
                        izr0Var4 = izr0Var;
                    }
                    fc10Var.u(xpm0Var2.c);
                    e440Var = e440Var2;
                } else if (iQ2 != 1483304551) {
                    fc10Var.f();
                    qglVar = null;
                    izr0Var4 = izr0Var;
                    e440Var = e440Var2;
                } else {
                    izr0Var4 = izr0Var;
                    iQ3 = izr0Var3.q();
                    if ((iQ3 & 1) != 0) {
                        I = izr0Var3.I();
                    } else {
                        I = -1;
                    }
                    if ((iQ3 & 2) != 0) {
                        jMin = izr0Var3.G();
                    } else {
                        jMin = -1;
                    }
                    if ((iQ3 & 4) == 4) {
                        jArr2 = new long[100];
                        while (i11 < 100) {
                            jArr2[i11] = izr0Var3.E();
                        }
                        jArr = jArr2;
                    } else {
                        jArr = null;
                    }
                    if ((iQ3 & 8) != 0) {
                        izr0Var5 = izr0Var3;
                        izr0Var5.S(4);
                    } else {
                        izr0Var5 = izr0Var3;
                    }
                    if (izr0Var5.a() >= 24) {
                        strC = izr0Var5.C(9, StandardCharsets.UTF_8);
                        izr0Var5.S(2);
                        fIntBitsToFloat = Float.intBitsToFloat(izr0Var5.q());
                        int iL10 = izr0Var5.L();
                        int iL11 = izr0Var5.L();
                        jpm0VarA = jpm0.a(iL10);
                        jpm0VarA2 = jpm0.a(iL11);
                        if (fIntBitsToFloat > 0.0f) {
                            kpm0Var = new kpm0(fIntBitsToFloat, jpm0VarA, jpm0VarA2);
                        } else {
                            kpm0Var = new kpm0(fIntBitsToFloat, jpm0VarA, jpm0VarA2);
                        }
                        izr0Var5.S(2);
                        int iH4 = izr0Var5.H();
                        i10 = (16773120 & iH4) >> 12;
                        iMax = iH4 & 4095;
                        if (strC.startsWith("LAME")) {
                            i10 += 529;
                            iMax = Math.max(0, iMax - 529);
                        } else {
                            i10 += 529;
                            iMax = Math.max(0, iMax - 529);
                        }
                    } else {
                        kpm0Var = null;
                        iMax = -1;
                        i10 = -1;
                    }
                    j8 = I;
                    qhn1Var = new qhn1();
                    xpm0 xpm0Var6 = new xpm0();
                    xpm0Var6.a = xpm0Var2.a;
                    xpm0Var6.b = xpm0Var2.b;
                    xpm0Var6.c = xpm0Var2.c;
                    xpm0Var6.d = xpm0Var2.d;
                    xpm0Var6.e = xpm0Var2.e;
                    xpm0Var6.f = xpm0Var2.f;
                    xpm0Var6.g = xpm0Var2.g;
                    qhn1Var.c = xpm0Var6;
                    qhn1Var.b = j8;
                    qhn1Var.a = i10;
                    qhn1Var.d = iMax;
                    xpm0Var = (xpm0) qhn1Var.c;
                    e440Var = e440Var2;
                    if (e440Var.a != -1) {
                        e440Var.a = i10;
                        e440Var.b = iMax;
                    } else {
                        e440Var.a = i10;
                        e440Var.b = iMax;
                    }
                    if (kpm0Var != null) {
                        hjj0Var = new hjj0(kpm0Var);
                    } else {
                        hjj0Var = null;
                    }
                    this.l = hjj0Var;
                    position2 = fc10Var.getPosition();
                    fc10Var.u(xpm0Var2.c);
                    if (iQ2 == 1483304551) {
                        length2 = fc10Var.getLength();
                        jA2 = qhn1Var.a();
                        if (jA2 == -9223372036854775807L) {
                            qglVar = null;
                        } else {
                            if (jMin != -1) {
                                long j111 = length2 - position2;
                                StringBuilder sbS7 = cy30.s(j111, "Data size mismatch between stream (", ") and Xing frame (");
                                sbS7.append(jMin);
                                sbS7.append("), using smaller value.");
                                oon1.A(sbS7.toString());
                                jMin = Math.min(jMin, j111);
                            }
                            qglVar = new gkm1(position2, xpm0Var.c, jA2, jMin, jArr);
                        }
                    } else {
                        length = fc10Var.getLength();
                        jA = qhn1Var.a();
                        if (jA != -9223372036854775807L) {
                            if (jMin != -1) {
                                length = position2 + jMin;
                                j9 = jMin - ((long) xpm0Var.c);
                            } else if (length != -1) {
                                j9 = (length - position2) - ((long) xpm0Var.c);
                            } else {
                                qglVar = null;
                            }
                            j10 = length;
                            iK = qxd0.K(j9, jA);
                            if (iK == -2147483647) {
                                qglVar = null;
                            } else {
                                qglVar = new qgl(j10, position2 + ((long) xpm0Var.c), iK, bmq0.j(cwl1.u(j9, j8, RoundingMode.HALF_UP)), false, true, jA);
                            }
                        } else {
                            qglVar = null;
                        }
                    }
                }
                hjj0Var2 = this.k;
                position3 = fc10Var.getPosition();
                if (hjj0Var2 == null) {
                    vok0Var = null;
                } else {
                    rij0VarArr = hjj0Var2.a;
                    length3 = rij0VarArr.length;
                    i12 = 0;
                    while (true) {
                        if (i12 < length3) {
                            rij0Var = null;
                            break;
                        }
                        rij0Var4 = rij0VarArr[i12];
                        if (uok0.class.isAssignableFrom(rij0Var4.getClass())) {
                            rij0Var = (rij0) uok0.class.cast(rij0Var4);
                            if (!zmv0.a.apply(rij0Var)) {
                                rij0Var = null;
                            }
                        } else {
                            rij0Var = null;
                        }
                        if (rij0Var != null) {
                            break;
                            break;
                        }
                        i12++;
                    }
                    uok0Var = (uok0) rij0Var;
                    if (uok0Var == null) {
                        vok0Var = null;
                    } else {
                        iArr = uok0Var.e;
                        rij0VarArr2 = hjj0Var2.a;
                        length4 = rij0VarArr2.length;
                        i13 = 0;
                        while (true) {
                            if (i13 < length4) {
                                rij0Var2 = null;
                                break;
                            }
                            rij0Var3 = rij0VarArr2[i13];
                            if (v8e1.class.isAssignableFrom(rij0Var3.getClass())) {
                                rij0Var2 = (rij0) v8e1.class.cast(rij0Var3);
                                if (!((v8e1) rij0Var2).a.equals("TLEN")) {
                                    rij0Var2 = null;
                                }
                            } else {
                                rij0Var2 = null;
                            }
                            if (rij0Var2 != null) {
                                break;
                                break;
                            }
                            i13++;
                        }
                        v8e1Var = (v8e1) rij0Var2;
                        if (v8e1Var == null) {
                            jW = -9223372036854775807L;
                            c = 0;
                        } else {
                            c = 0;
                            jW = zoi1.W(Long.parseLong((String) v8e1Var.c.get(0)));
                        }
                        length5 = iArr.length;
                        int i19 = length5 + 1;
                        jArr3 = new long[i19];
                        jArr4 = new long[i19];
                        jArr3[c] = position3;
                        jArr4[c] = 0;
                        j11 = 0;
                        i14 = 1;
                        while (i14 <= length5) {
                            int i110 = i14 - 1;
                            long j112 = position3 + ((long) (uok0Var.c + iArr[i110]));
                            j11 += (long) (uok0Var.d + uok0Var.f[i110]);
                            jArr3[i14] = j112;
                            jArr4[i14] = j11;
                            i14++;
                            length5 = length5;
                            position3 = j112;
                        }
                        vok0Var = new vok0(jW, jArr3, jArr4);
                    }
                }
                if (this.s) {
                    qglVar2 = new wo51(-9223372036854775807L);
                    izr0Var2 = izr0Var4;
                } else {
                    if (vok0Var != null) {
                        qglVar2 = vok0Var;
                        izr0Var2 = izr0Var4;
                    } else if (qglVar != null) {
                        izr0Var2 = izr0Var4;
                        qglVar2 = qglVar;
                    } else {
                        izr0Var2 = izr0Var4;
                        fc10Var.h(0, izr0Var2.a, 4);
                        izr0Var2.R(0);
                        xpm0Var2.a(izr0Var2.q());
                        qglVar2 = new qgl(fc10Var.getLength(), fc10Var.getPosition(), xpm0Var2.f, xpm0Var2.c, false, true, -9223372036854775807L);
                    }
                    if (!(qglVar2 instanceof qgl)) {
                        qglVar2.d();
                    }
                }
                this.r = qglVar2;
                this.h.g(qglVar2.g());
                this.g.c(this.r);
                hjj0VarB = this.k;
                hjj0Var3 = this.l;
                if (hjj0VarB != null) {
                    if (hjj0Var3 != null) {
                        hjj0VarB = hjj0VarB.b(hjj0Var3);
                    }
                    hjj0Var3 = hjj0VarB;
                }
                ge30Var = new ge30();
                ge30Var.n = asj0.p("audio/mpeg");
                ge30Var.o = asj0.p(xpm0Var2.b);
                ge30Var.f52p = SemanticState.Obscured;
                ge30Var.I = xpm0Var2.e;
                ge30Var.K = xpm0Var2.d;
                ge30Var.M = e440Var.a;
                ge30Var.N = e440Var.b;
                ge30Var.l = hjj0Var3;
                if (this.r.f() != -2147483647) {
                    ge30Var.i = this.r.f();
                }
                this.i.a(new ie30(ge30Var));
                this.o = fc10Var.getPosition();
            } else {
                izr0Var2 = izr0Var;
                e440Var = e440Var2;
                j2 = 1;
                j5 = 0;
                if (this.o != 0) {
                    position = fc10Var.getPosition();
                    j6 = this.o;
                    if (position < j6) {
                        fc10Var.u((int) (j6 - position));
                    }
                }
            }
            if (this.q == 0) {
                fc10Var.f();
                if (g(fc10Var)) {
                    j3 = -9223372036854775807L;
                } else {
                    izr0Var2.R(0);
                    iQ = izr0Var2.q();
                    if (((-128000) & iQ) == (((long) this.j) & (-128000))) {
                        j3 = -9223372036854775807L;
                        i6 = 1;
                    } else if (kqn1.t(iQ) == -1) {
                        i6 = 1;
                        j3 = -9223372036854775807L;
                    } else {
                        xpm0Var2.a(iQ);
                        j3 = -9223372036854775807L;
                        if (this.m == -9223372036854775807L) {
                            this.m = this.r.e(fc10Var.getPosition());
                            j7 = this.a;
                            if (j7 != -9223372036854775807L) {
                                this.m = (j7 - this.r.e(j5)) + this.m;
                            }
                        }
                        this.q = xpm0Var2.c;
                        this.f70p = fc10Var.getPosition() + ((long) xpm0Var2.c);
                        if (this.r instanceof v980) {
                            long j113 = ((this.n + ((long) xpm0Var2.g)) * 1000000) / ((long) xpm0Var2.d);
                            throw null;
                        }
                    }
                    fc10Var.u(i6);
                    this.j = 0;
                    i = -1;
                    i2 = 0;
                }
                i = -1;
                i2 = -1;
            } else {
                j3 = -9223372036854775807L;
            }
            iE = this.i.e(fc10Var, this.q, true);
            if (iE == -1) {
                i = -1;
                i2 = -1;
            } else {
                i5 = this.q - iE;
                this.q = i5;
                if (i5 > 0) {
                    i = -1;
                    i2 = 0;
                } else {
                    this.i.b(((this.n * 1000000) / ((long) xpm0Var2.d)) + this.m, 1, xpm0Var2.c, 0, null);
                    this.n += (long) xpm0Var2.g;
                    this.q = 0;
                    i2 = 0;
                    i = -1;
                }
            }
        }
        if (i2 == i) {
            xo51 xo51Var2 = this.r;
            if (xo51Var2 instanceof v980) {
                long j20 = this.n - j2;
                if (j20 < 0) {
                    j4 = j3;
                } else {
                    int i20 = e440Var.a;
                    if (i20 != i && (i3 = e440Var.b) != i) {
                        j20 = (j20 - ((long) i20)) - ((long) i3);
                    }
                    if (j20 >= 0) {
                        j4 = ((j20 * j) / ((long) xpm0Var2.d)) + this.m;
                    } else {
                        j4 = j3;
                    }
                }
                if (xo51Var2.g() != j4) {
                    ((v980) this.r).getClass();
                    throw th;
                }
            }
        }
        return i2;
    }

    @Override // p.ec10
    public final boolean d(fc10 fc10Var) {
        return h(fc10Var, true);
    }

    public final void f() {
        fn51 fn51Var = this.r;
        if ((fn51Var instanceof qgl) && ((pgl) fn51Var).d()) {
            long j = this.f70p;
            if (j == -1 || j == this.r.c()) {
                return;
            }
            qgl qglVar = (qgl) this.r;
            this.r = new qgl(this.f70p, qglVar.b, qglVar.e, qglVar.c, qglVar.g, false, qglVar.i);
            gc10 gc10Var = this.g;
            gc10Var.getClass();
            gc10Var.c(this.r);
            gtf1 gtf1Var = this.h;
            gtf1Var.getClass();
            gtf1Var.g(this.r.g());
        }
    }

    public final boolean g(fc10 fc10Var) {
        xo51 xo51Var = this.r;
        if (xo51Var != null) {
            long jC = xo51Var.c();
            if (jC == -1 || fc10Var.j() <= jC - 4) {
            }
            return true;
        }
        try {
            return !fc10Var.d(this.b.a, 0, 4, true);
        } catch (EOFException unused) {
        }
    }

    public final boolean h(fc10 fc10Var, boolean z) {
        int iJ;
        int i;
        int iT;
        fc10Var.f();
        if (fc10Var.getPosition() == 0) {
            hjj0 hjj0VarA = this.e.a(fc10Var, null, 131072);
            this.k = hjj0VarA;
            if (hjj0VarA != null) {
                this.d.b(hjj0VarA);
            }
            iJ = (int) fc10Var.j();
            if (!z) {
                fc10Var.u(iJ);
            }
            i = 0;
        } else {
            iJ = 0;
            i = 0;
        }
        int i2 = i;
        int i3 = i2;
        while (true) {
            if (g(fc10Var)) {
                if (i2 > 0) {
                    break;
                }
                f();
                eg.l();
                return false;
            }
            izr0 izr0Var = this.b;
            izr0Var.R(0);
            int iQ = izr0Var.q();
            if ((i == 0 || ((-128000) & iQ) == (((long) i) & (-128000))) && (iT = kqn1.t(iQ)) != -1) {
                i2++;
                if (i2 != 1) {
                    if (i2 == 4) {
                        break;
                    }
                } else {
                    this.c.a(iQ);
                    i = iQ;
                }
                fc10Var.k(iT - 4);
            } else {
                int i4 = i3 + 1;
                if (i3 == 131072) {
                    if (z) {
                        return false;
                    }
                    f();
                    eg.l();
                    return false;
                }
                if (z) {
                    fc10Var.f();
                    fc10Var.k(iJ + i4);
                } else {
                    fc10Var.u(1);
                }
                i2 = 0;
                i3 = i4;
                i = 0;
            }
        }
        if (z) {
            fc10Var.u(iJ + i3);
        } else {
            fc10Var.f();
        }
        this.j = i;
        return true;
    }

    @Override // p.ec10
    public final void release() {
    }

    public ipm0(int i) {
        this(-9223372036854775807L);
    }
}

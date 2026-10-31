package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class q511 {
    public final or80 a;
    public final ha4 b;
    public final que0 c;
    public final che1 d;
    public final wdn0 e;
    public boolean f;
    public boolean g;
    public boolean h;
    public t94 i;
    public long j;
    public final g030 k;
    public final ken0 l;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.Serializable, long[]] */
    public q511(fdn0 fdn0Var, ha4 ha4Var) {
        this.a = fdn0Var;
        this.b = ha4Var;
        que0 que0Var = new que0((byte) 1);
        que0Var.c = new long[192];
        que0Var.d = new long[192];
        this.c = que0Var;
        this.d = new che1();
        this.e = new wdn0();
        this.j = -1L;
        this.k = new g030(this, (byte) 29);
        this.l = new ken0();
    }

    public static boolean c(ndo0 ndo0Var) {
        mxq0 mxq0Var = ndo0Var.v1;
        return (mxq0Var == null || zgo1.t(((ge50) mxq0Var).b())) ? false : true;
    }

    public static long f(hmb0 hmb0Var) {
        jdo0 jdo0Var = hmb0Var.e1;
        ndo0 ndo0Var = (ndo0) jdo0Var.e;
        long jD = 0;
        for (ndo0 ndo0Var2 = (sh80) jdo0Var.d; ndo0Var2 != null && ndo0Var2 != ndo0Var; ndo0Var2 = ndo0Var2.Y0) {
            if (c(ndo0Var2)) {
                return 9223372034707292159L;
            }
            jD = qr80.d(jD, ndo0Var2.h1);
        }
        return jD;
    }

    public static void i(hmb0 hmb0Var) {
        if (!hmb0Var.c || c((ndo0) hmb0Var.e1.e)) {
            return;
        }
        hmb0Var.c = false;
        if (hmb0Var.e) {
            hmb0Var.d = f(hmb0Var);
            hmb0Var.e = false;
        }
        if (qr80.b(hmb0Var.d, 9223372034707292159L)) {
            return;
        }
        bfn0 bfn0VarA = hmb0Var.A();
        Object[] objArr = bfn0VarA.a;
        int i = bfn0VarA.c;
        for (int i2 = 0; i2 < i; i2++) {
            i((hmb0) objArr[i2]);
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0229  */
    /* JADX WARN: Code duplicated, block: B:110:0x024e  */
    /* JADX WARN: Code duplicated, block: B:112:0x0264  */
    /* JADX WARN: Code duplicated, block: B:115:0x0278  */
    /* JADX WARN: Code duplicated, block: B:117:0x0288  */
    /* JADX WARN: Code duplicated, block: B:119:0x028e  */
    /* JADX WARN: Code duplicated, block: B:121:0x0297 A[LOOP:11: B:120:0x0295->B:121:0x0297, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:125:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:126:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:128:0x02df A[LOOP:9: B:113:0x0269->B:128:0x02df, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:130:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:133:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:135:0x02f1 A[LOOP:12: B:134:0x02ef->B:135:0x02f1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:138:0x0300  */
    /* JADX WARN: Code duplicated, block: B:139:0x0303  */
    /* JADX WARN: Code duplicated, block: B:143:0x030c  */
    /* JADX WARN: Code duplicated, block: B:167:0x023d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x02ea A[EDGE_INSN: B:168:0x02ea->B:131:0x02ea BREAK  A[LOOP:9: B:113:0x0269->B:128:0x02df], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x02e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x02b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:91:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ba A[LOOP:7: B:92:0x01b8->B:93:0x01ba, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:96:0x0203  */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.Serializable, long[]] */
    public final void a() {
        boolean z;
        long j;
        long j2;
        long j3;
        long j4;
        che1 che1Var;
        que0 que0Var;
        long j5;
        long j6;
        long j7;
        float[] fArr;
        Object[] objArr;
        long[] jArr;
        int length;
        long jA;
        bhe1 bhe1Var;
        long j8;
        bhe1 bhe1Var2;
        int i;
        long j9;
        long j10;
        long j11;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j12;
        int i7;
        int i8;
        bhe1 bhe1Var3;
        long[] jArr2;
        ?? r5;
        int i9;
        int i10;
        int i11;
        long j13;
        long j14;
        float[] fArr2;
        bhe1 bhe1Var4;
        bhe1 bhe1Var5;
        long j15;
        long j16;
        Runnable runnable = this.i;
        if (runnable != null) {
            this.b.removeCallbacks(runnable);
            this.i = null;
        }
        long jF = r1p1.f();
        boolean z2 = this.f;
        boolean z3 = z2 || this.g;
        que0 que0Var2 = this.c;
        boolean z4 = true;
        che1 che1Var2 = this.d;
        if (z2) {
            this.f = false;
            wdn0 wdn0Var = this.e;
            Object[] objArr2 = wdn0Var.a;
            int i12 = wdn0Var.b;
            for (int i13 = 0; i13 < i12; i13++) {
                ((Function0) objArr2[i13]).invoke();
            }
            long[] jArr3 = (long[]) que0Var2.c;
            int i14 = que0Var2.b;
            int i15 = 0;
            while (i15 < jArr3.length - 2 && i15 < i14) {
                boolean z5 = z4;
                int i16 = i14;
                long j17 = jArr3[i15 + 2];
                boolean z6 = z3;
                if ((((int) (j17 >> 60)) & 1) != 0) {
                    long j18 = jArr3[i15];
                    long j19 = jArr3[i15 + 1];
                    bhe1 bhe1Var6 = (bhe1) che1Var2.a.b(((int) j17) & 33554431);
                    while (bhe1Var6 != null) {
                        bhe1 bhe1Var7 = bhe1Var6.f;
                        int i17 = i15;
                        long j20 = bhe1Var6.i;
                        long j21 = bhe1Var6.b;
                        long j22 = bhe1Var6.c;
                        boolean z7 = (jF - j20 >= j21 || j20 == Long.MIN_VALUE) ? z5 : false;
                        boolean z8 = j22 == 0 ? z5 : false;
                        boolean z9 = j21 == 0 ? z5 : false;
                        bhe1Var6.g = j18;
                        bhe1Var6.h = j19;
                        boolean z10 = ((z8 || z9) && !z8) ? false : z5;
                        if (z7 && z10) {
                            j16 = j19;
                            bhe1Var6.j = -1L;
                            bhe1Var6.i = jF;
                            j15 = j18;
                            bhe1Var6.a(j15, j16, che1Var2.d, che1Var2.e, che1Var2.g);
                        } else {
                            j15 = j18;
                            j16 = j19;
                            if (!z8) {
                                bhe1Var6.j = jF;
                                long j23 = che1Var2.c;
                                long j24 = j22 + jF;
                                if (j23 > 0 && j24 < j23) {
                                    che1Var2.c = j23;
                                }
                            }
                        }
                        i15 = i17;
                        bhe1Var6 = bhe1Var7;
                        j18 = j15;
                        j19 = j16;
                    }
                }
                i15 += 3;
                i14 = i16;
                z3 = z6;
                z4 = z5;
            }
            z = z3;
            j = 0;
            long[] jArr4 = (long[]) que0Var2.c;
            int i18 = que0Var2.b;
            for (int i19 = 0; i19 < jArr4.length - 2 && i19 < i18; i19 += 3) {
                int i20 = i19 + 2;
                jArr4[i20] = jArr4[i20] & (-1152921504606846977L);
            }
        } else {
            z = z3;
            j = 0;
        }
        if (this.g) {
            this.g = false;
            long j25 = che1Var2.d;
            long j26 = che1Var2.e;
            j2 = jF;
            float[] fArr3 = che1Var2.g;
            fdn0 fdn0Var = che1Var2.a;
            j3 = 128;
            Object[] objArr3 = fdn0Var.c;
            long[] jArr5 = fdn0Var.a;
            int length2 = jArr5.length - 2;
            if (length2 >= 0) {
                int i21 = 0;
                j4 = 255;
                while (true) {
                    long j27 = jArr5[i21];
                    long[] jArr6 = jArr5;
                    che1 che1Var3 = che1Var2;
                    if ((((~j27) << 7) & j27 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i22 = 8 - ((~(i21 - length2)) >>> 31);
                        long j28 = j27;
                        int i23 = 0;
                        while (i23 < i22) {
                            if ((j28 & 255) < 128) {
                                bhe1 bhe1Var8 = (bhe1) objArr3[(i21 << 3) + i23];
                                while (bhe1Var8 != null) {
                                    que0 que0Var3 = que0Var2;
                                    bhe1 bhe1Var9 = bhe1Var8;
                                    che1Var3.b(bhe1Var9, j25, j26, fArr3, j2);
                                    bhe1Var8 = bhe1Var9.f;
                                    que0Var2 = que0Var3;
                                }
                            }
                            j28 >>= 8;
                            i23++;
                            che1Var3 = che1Var3;
                            que0Var2 = que0Var2;
                        }
                        que0Var2 = que0Var2;
                        che1Var2 = che1Var3;
                        if (i22 != 8) {
                            break;
                        }
                    } else {
                        que0Var2 = que0Var2;
                        che1Var2 = che1Var3;
                    }
                    if (i21 == length2) {
                        break;
                    }
                    i21++;
                    que0Var2 = que0Var2;
                    jArr5 = jArr6;
                }
            }
            if (z) {
                j13 = che1Var2.d;
                j14 = che1Var2.e;
                fArr2 = che1Var2.g;
                bhe1Var4 = che1Var2.b;
                if (bhe1Var4 != null) {
                    bhe1Var5 = bhe1Var4;
                    while (bhe1Var5 != null) {
                        hmb0 hmb0VarB = oap1.B(bhe1Var5.d);
                        long jB = ((ha4) kmb0.a(hmb0VarB)).getRectManager().b(hmb0VarB);
                        bhe1Var5.g = jB;
                        ffh0 ffh0Var = hmb0VarB.f1.f68p;
                        bhe1Var5.h = (((long) (ffh0Var.a + ((int) (jB >> 32)))) << 32) | (((long) (ffh0Var.b + ((int) (jB & 4294967295L)))) & 4294967295L);
                        che1Var2.b(bhe1Var5, j13, j14, fArr2, j2);
                        bhe1Var5 = bhe1Var5.f;
                        que0Var2 = que0Var2;
                    }
                }
            }
            che1Var = che1Var2;
            que0Var = que0Var2;
            if (this.h) {
                this.h = false;
                jArr2 = (long[]) que0Var.c;
                int i24 = que0Var.b;
                r5 = (long[]) que0Var.d;
                i10 = 0;
                for (i9 = 0; i9 < jArr2.length - 2 && i10 < r5.length - 2 && i9 < i24; i9 += 3) {
                    i11 = i9 + 2;
                    if (jArr2[i11] != o511.a) {
                        r5[i10] = jArr2[i9];
                        r5[i10 + 1] = jArr2[i9 + 1];
                        r5[i10 + 2] = jArr2[i11];
                        i10 += 3;
                    }
                }
                que0Var.b = i10;
                que0Var.c = r5;
                que0Var.d = jArr2;
            }
            j5 = che1Var.c;
            if (j5 <= j2) {
                j6 = che1Var.d;
                j7 = che1Var.e;
                fArr = che1Var.g;
                fdn0 fdn0Var2 = che1Var.a;
                objArr = fdn0Var2.c;
                jArr = fdn0Var2.a;
                length = jArr.length - 2;
                if (length >= 0) {
                    i = 0;
                    j9 = Long.MAX_VALUE;
                    while (true) {
                        j10 = jArr[i];
                        j11 = j6;
                        i2 = length;
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            i5 = 8;
                            i6 = 8 - ((~(i - i2)) >>> 31);
                            jA = j9;
                            j12 = j10;
                            i7 = 0;
                            while (i7 < i6) {
                                if ((j12 & j4) < j3) {
                                    bhe1Var3 = (bhe1) objArr[(i << 3) + i7];
                                    while (bhe1Var3 != null) {
                                        int i25 = i6;
                                        bhe1 bhe1Var10 = bhe1Var3;
                                        long j29 = j11;
                                        int i26 = i7;
                                        int i27 = i5;
                                        int i28 = i;
                                        long j30 = j2;
                                        jA = che1.a(bhe1Var10, j29, j7, fArr, j30, jA);
                                        j2 = j30;
                                        i = i28;
                                        i5 = i27;
                                        i7 = i26;
                                        j11 = j29;
                                        i2 = i2;
                                        bhe1Var3 = bhe1Var10.f;
                                        i6 = i25;
                                    }
                                }
                                int i29 = i6;
                                long j31 = j11;
                                int i30 = i7;
                                int i31 = i5;
                                j12 >>= i31;
                                int i32 = i30 + 1;
                                j11 = j31;
                                i2 = i2;
                                i = i;
                                i5 = i31;
                                i7 = i32;
                                i6 = i29;
                            }
                            i3 = i2;
                            i8 = i5;
                            j6 = j11;
                            i4 = i;
                            if (i6 == i8) {
                                break;
                            } else {
                                j9 = jA;
                            }
                        } else {
                            i3 = i2;
                            i4 = i;
                            j6 = j11;
                        }
                        if (i4 != i3) {
                            jA = j9;
                            break;
                        } else {
                            i = i4 + 1;
                            length = i3;
                        }
                    }
                } else {
                    jA = Long.MAX_VALUE;
                }
                bhe1Var = che1Var.b;
                if (bhe1Var != null) {
                    for (bhe1Var2 = bhe1Var; bhe1Var2 != null; bhe1Var2 = bhe1Var2.f) {
                        long j32 = j2;
                        jA = che1.a(bhe1Var2, j6, j7, fArr, j32, jA);
                        j2 = j32;
                    }
                }
                if (jA == Long.MAX_VALUE) {
                    j8 = -1;
                } else {
                    j8 = jA;
                }
                che1Var.c = j8;
                j5 = j8;
            }
            if (j5 > j) {
                j();
            }
        }
        j2 = jF;
        j3 = 128;
        j4 = 255;
        if (z) {
            j13 = che1Var2.d;
            j14 = che1Var2.e;
            fArr2 = che1Var2.g;
            bhe1Var4 = che1Var2.b;
            if (bhe1Var4 != null) {
                bhe1Var5 = bhe1Var4;
                while (bhe1Var5 != null) {
                    hmb0 hmb0VarB2 = oap1.B(bhe1Var5.d);
                    long jB2 = ((ha4) kmb0.a(hmb0VarB2)).getRectManager().b(hmb0VarB2);
                    bhe1Var5.g = jB2;
                    ffh0 ffh0Var2 = hmb0VarB2.f1.f68p;
                    bhe1Var5.h = (((long) (ffh0Var2.a + ((int) (jB2 >> 32)))) << 32) | (((long) (ffh0Var2.b + ((int) (jB2 & 4294967295L)))) & 4294967295L);
                    che1Var2.b(bhe1Var5, j13, j14, fArr2, j2);
                    bhe1Var5 = bhe1Var5.f;
                    que0Var2 = que0Var2;
                }
            }
        }
        che1Var = che1Var2;
        que0Var = que0Var2;
        if (this.h) {
            this.h = false;
            jArr2 = (long[]) que0Var.c;
            int i210 = que0Var.b;
            r5 = (long[]) que0Var.d;
            i10 = 0;
            while (i9 < jArr2.length - 2) {
                i11 = i9 + 2;
                if (jArr2[i11] != o511.a) {
                    r5[i10] = jArr2[i9];
                    r5[i10 + 1] = jArr2[i9 + 1];
                    r5[i10 + 2] = jArr2[i11];
                    i10 += 3;
                }
            }
            que0Var.b = i10;
            que0Var.c = r5;
            que0Var.d = jArr2;
        }
        j5 = che1Var.c;
        if (j5 <= j2) {
            j6 = che1Var.d;
            j7 = che1Var.e;
            fArr = che1Var.g;
            fdn0 fdn0Var3 = che1Var.a;
            objArr = fdn0Var3.c;
            jArr = fdn0Var3.a;
            length = jArr.length - 2;
            if (length >= 0) {
                i = 0;
                j9 = Long.MAX_VALUE;
                while (true) {
                    j10 = jArr[i];
                    j11 = j6;
                    i2 = length;
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        i5 = 8;
                        i6 = 8 - ((~(i - i2)) >>> 31);
                        jA = j9;
                        j12 = j10;
                        i7 = 0;
                        while (i7 < i6) {
                            if ((j12 & j4) < j3) {
                                bhe1Var3 = (bhe1) objArr[(i << 3) + i7];
                                while (bhe1Var3 != null) {
                                    int i211 = i6;
                                    bhe1 bhe1Var11 = bhe1Var3;
                                    long j210 = j11;
                                    int i212 = i7;
                                    int i213 = i5;
                                    int i214 = i;
                                    long j33 = j2;
                                    jA = che1.a(bhe1Var11, j210, j7, fArr, j33, jA);
                                    j2 = j33;
                                    i = i214;
                                    i5 = i213;
                                    i7 = i212;
                                    j11 = j210;
                                    i2 = i2;
                                    bhe1Var3 = bhe1Var11.f;
                                    i6 = i211;
                                }
                            }
                            int i215 = i6;
                            long j34 = j11;
                            int i33 = i7;
                            int i34 = i5;
                            j12 >>= i34;
                            int i35 = i33 + 1;
                            j11 = j34;
                            i2 = i2;
                            i = i;
                            i5 = i34;
                            i7 = i35;
                            i6 = i215;
                        }
                        i3 = i2;
                        i8 = i5;
                        j6 = j11;
                        i4 = i;
                        if (i6 == i8) {
                            break;
                            break;
                        }
                        j9 = jA;
                    } else {
                        i3 = i2;
                        i4 = i;
                        j6 = j11;
                    }
                    if (i4 != i3) {
                        jA = j9;
                        break;
                    } else {
                        i = i4 + 1;
                        length = i3;
                    }
                }
            } else {
                jA = Long.MAX_VALUE;
            }
            bhe1Var = che1Var.b;
            if (bhe1Var != null) {
                while (bhe1Var2 != null) {
                    long j35 = j2;
                    jA = che1.a(bhe1Var2, j6, j7, fArr, j35, jA);
                    j2 = j35;
                }
            }
            if (jA == Long.MAX_VALUE) {
                j8 = -1;
            } else {
                j8 = jA;
            }
            che1Var.c = j8;
            j5 = j8;
        }
        if (j5 > j) {
            j();
        }
    }

    public final long b(hmb0 hmb0Var) {
        if (hmb0Var.g == -4) {
            return 9223372034707292159L;
        }
        long j = ((long[]) this.c.c)[d(hmb0Var)];
        return (((long) ((int) (j >> 32))) << 32) | (((long) ((int) j)) & 4294967295L);
    }

    public final int d(hmb0 hmb0Var) {
        int i = hmb0Var.g;
        if (i != -4) {
            int i2 = hmb0Var.b;
            que0 que0Var = this.c;
            long[] jArr = (long[]) que0Var.c;
            if (i < 0 || i >= que0Var.b - 2 || (((int) jArr[i + 2]) & 33554431) != (i2 & 33554431)) {
                int i3 = i2 & 33554431;
                int i4 = que0Var.b;
                int i5 = 0;
                while (true) {
                    if (i5 >= i4 - 2) {
                        i = -4;
                        break;
                    }
                    if ((((int) jArr[i5 + 2]) & 33554431) == i3) {
                        i = i5;
                        break;
                    }
                    i5 += 3;
                }
            }
        } else {
            i = -4;
            break;
        }
        if (i == -4) {
            qf80.a("LayoutNode " + hmb0Var.b + " not found in RectList");
        }
        hmb0Var.g = i;
        return i;
    }

    public final void e(hmb0 hmb0Var) {
        hmb0Var.c = true;
        jdo0 jdo0Var = hmb0Var.e1;
        ffh0 ffh0Var = hmb0Var.f1.f68p;
        int iY = ffh0Var.Y();
        float fX = ffh0Var.X();
        ken0 ken0Var = this.l;
        ken0Var.a = 0.0f;
        ken0Var.b = 0.0f;
        ken0Var.c = iY;
        ken0Var.d = fX;
        for (ndo0 ndo0Var = (ndo0) jdo0Var.e; ndo0Var != null; ndo0Var = ndo0Var.Y0) {
            hmb0 hmb0Var2 = ndo0Var.U0;
            if (ndo0Var == ((ndo0) hmb0Var2.e1.e) && !hmb0Var2.c) {
                long jB = b(hmb0Var2);
                if (!qr80.b(jB, 9223372034707292159L)) {
                    ken0Var.c((((long) Float.floatToRawIntBits((int) (jB >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (jB & 4294967295L))) & 4294967295L));
                    break;
                }
            }
            mxq0 mxq0Var = ndo0Var.v1;
            if (mxq0Var != null) {
                float[] fArrB = ((ge50) mxq0Var).b();
                if (!zgo1.t(fArrB)) {
                    kch0.d(fArrB, ken0Var);
                }
            }
            long j = ndo0Var.h1;
            ken0Var.c((4294967295L & ((long) Float.floatToRawIntBits((int) (j & 4294967295L)))) | (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32));
        }
        int i = (int) ken0Var.a;
        int i2 = (int) ken0Var.b;
        int i3 = (int) ken0Var.c;
        int i4 = (int) ken0Var.d;
        int i5 = hmb0Var.b;
        int i6 = hmb0Var.g;
        que0 que0Var = this.c;
        if (i6 != -4) {
            int iD = d(hmb0Var);
            long[] jArr = (long[]) que0Var.c;
            jArr[iD] = (((long) i) << 32) | (((long) i2) & 4294967295L);
            jArr[iD + 1] = (4294967295L & ((long) i4)) | (((long) i3) << 32);
            int i7 = iD + 2;
            long j2 = jArr[i7];
            jArr[i7] = j2 | (((j2 >> 63) & 1) << 60);
        } else {
            hmb0 hmb0VarV = hmb0Var.v();
            hmb0Var.g = que0Var.e(i5, i, i2, i3, i4, hmb0VarV != null ? hmb0VarV.b : -1, hmb0VarV != null ? d(hmb0VarV) : -4, jdo0Var.k(1024), jdo0Var.k(16), this.d.a.a(i5));
        }
        hmb0Var.f = false;
        this.f = true;
        bfn0 bfn0VarA = hmb0Var.A();
        Object[] objArr = bfn0VarA.a;
        int i8 = bfn0VarA.c;
        for (int i9 = 0; i9 < i8; i9++) {
            hmb0 hmb0Var3 = (hmb0) objArr[i9];
            if (hmb0Var3.J()) {
                e(hmb0Var3);
            }
        }
    }

    public final void g(hmb0 hmb0Var) {
        long j;
        boolean zJ = hmb0Var.J();
        jdo0 jdo0Var = hmb0Var.e1;
        if (zJ && hmb0Var.f) {
            hmb0 hmb0VarV = hmb0Var.v();
            if (hmb0VarV == null || hmb0VarV.c) {
                j = hmb0VarV == null ? 0L : 9223372034707292159L;
            } else {
                if (hmb0VarV.e) {
                    hmb0VarV.e = false;
                    hmb0VarV.d = f(hmb0VarV);
                }
                j = hmb0VarV.d;
            }
            ndo0 ndo0Var = (ndo0) jdo0Var.e;
            if (!m0p1.o(j) || c(ndo0Var)) {
                e(hmb0Var);
            } else if (hmb0Var.c) {
                e(hmb0Var);
                i(hmb0Var);
            } else {
                long jD = qr80.d(j, ndo0Var.h1);
                ffh0 ffh0Var = hmb0Var.f1.f68p;
                int iY = ffh0Var.Y();
                int iX = ffh0Var.X();
                int i = hmb0Var.g;
                que0 que0Var = this.c;
                if (i != -4) {
                    int iD = d(hmb0Var);
                    if (hmb0VarV != null) {
                        int iD2 = d(hmb0VarV);
                        long[] jArr = (long[]) que0Var.c;
                        long j2 = jArr[iD2];
                        int i2 = ((int) (j2 >> 32)) + ((int) (jD >> 32));
                        int i3 = ((int) j2) + ((int) (jD & 4294967295L));
                        long j3 = jArr[iD];
                        int i4 = i2 - ((int) (j3 >> 32));
                        int i5 = i3 - ((int) j3);
                        int i6 = iD + 2;
                        long j4 = jArr[i6];
                        jArr[iD] = (((long) i3) & 4294967295L) | (((long) i2) << 32);
                        jArr[iD + 1] = (((long) (iX + i3)) & 4294967295L) | (((long) (iY + i2)) << 32);
                        jArr[i6] = (((j4 >> 63) & 1) << 60) | j4;
                        if (i4 != 0 || i5 != 0) {
                            que0Var.f(j4, iD, i4, i5);
                        }
                    } else {
                        int iD3 = d(hmb0Var);
                        int i7 = (int) (jD >> 32);
                        int i8 = (int) (jD & 4294967295L);
                        long[] jArr2 = (long[]) que0Var.c;
                        long j5 = jArr2[iD3];
                        jArr2[iD3] = (((long) i7) << 32) | (((long) i8) & 4294967295L);
                        jArr2[iD3 + 1] = (((long) (iX + i8)) & 4294967295L) | (((long) (iY + i7)) << 32);
                        int i9 = iD3 + 2;
                        long j6 = jArr2[i9];
                        jArr2[i9] = (((j6 >> 63) & 1) << 60) | j6;
                        int i10 = i7 - ((int) (j5 >> 32));
                        int i11 = i8 - ((int) j5);
                        if (i10 != 0 || i11 != 0) {
                            que0Var.f(j6, iD3, i10, i11);
                        }
                    }
                } else {
                    int i12 = hmb0Var.b;
                    boolean zK = jdo0Var.k(1024);
                    boolean zK2 = jdo0Var.k(16);
                    boolean zA = this.d.a.a(i12);
                    if (hmb0VarV != null) {
                        int i13 = hmb0VarV.b;
                        int iD4 = d(hmb0VarV);
                        int i14 = (int) (jD >> 32);
                        int i15 = (int) (jD & 4294967295L);
                        int i16 = i12 & 33554431;
                        long[] jArr3 = (long[]) que0Var.c;
                        if ((((int) jArr3[iD4 + 2]) & 33554431) != (33554431 & i13)) {
                            qf80.a("Inserted child " + i16 + " without valid parent index or parent " + i13 + " not found");
                        }
                        long j7 = jArr3[iD4];
                        int i17 = (int) j7;
                        int i18 = ((int) (j7 >> 32)) + i14;
                        int i19 = i17 + i15;
                        hmb0Var.g = que0Var.e(i16, i18, i19, i18 + iY, i19 + iX, i13, iD4, zK, zK2, zA);
                    } else {
                        int i20 = (int) (jD >> 32);
                        int i21 = (int) (4294967295L & jD);
                        hmb0Var.g = que0Var.e(i12, i20, i21, i20 + iY, i21 + iX, -1, -4, zK, zK2, zA);
                    }
                }
            }
            hmb0Var.f = false;
            this.f = true;
            j();
        }
    }

    public final void h(hmb0 hmb0Var) {
        if (hmb0Var.g != -4) {
            int iD = d(hmb0Var);
            long[] jArr = (long[]) this.c.c;
            jArr[iD] = -1;
            jArr[iD + 1] = -1;
            jArr[iD + 2] = o511.a;
            hmb0Var.g = -4;
            hmb0Var.f = true;
            this.f = true;
            this.h = true;
        }
    }

    public final void j() {
        Runnable runnable = this.i;
        boolean z = runnable != null;
        long j = this.d.c;
        if (j >= 0 || !z) {
            if (this.j == j && z) {
                return;
            }
            ha4 ha4Var = this.b;
            if (runnable != null) {
                ha4Var.removeCallbacks(runnable);
            }
            long jF = r1p1.f();
            long jMax = Math.max(j, 16 + jF);
            this.j = jMax;
            t94 t94Var = new t94(this.k, (byte) 1);
            ha4Var.postDelayed(t94Var, jMax - jF);
            this.i = t94Var;
        }
    }
}

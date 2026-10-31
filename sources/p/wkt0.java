package p;

import android.os.Build;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class wkt0 {
    public static final ceo a = new ceo(0.167f, 0.167f, 0.833f, 0.833f);
    public static final float[] b = {0.6666667f, 0.16666667f, 0.6666667f, 0.41666666f, 0.9166667f, 0.6666667f};
    public static final float[] c = {0.9166667f, 0.6666667f, 0.41666666f, 0.6666667f, 0.16666667f, 0.9166667f};
    public static final float[] d = {0.41666666f, 0.6666667f, 0.16666667f, 0.9166667f, 0.6666667f, 0.41666666f};

    /* JADX WARN: Code duplicated, block: B:101:0x015f  */
    /* JADX WARN: Code duplicated, block: B:103:0x0165  */
    /* JADX WARN: Code duplicated, block: B:105:0x0173  */
    /* JADX WARN: Code duplicated, block: B:107:0x0179  */
    /* JADX WARN: Code duplicated, block: B:113:0x0186 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:114:0x0188  */
    /* JADX WARN: Code duplicated, block: B:116:0x019f  */
    /* JADX WARN: Code duplicated, block: B:118:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:120:0x01af  */
    /* JADX WARN: Code duplicated, block: B:124:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:126:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:127:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:129:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:131:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:133:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:136:0x020d  */
    /* JADX WARN: Code duplicated, block: B:139:0x021c  */
    /* JADX WARN: Code duplicated, block: B:141:0x0229  */
    /* JADX WARN: Code duplicated, block: B:143:0x0238  */
    /* JADX WARN: Code duplicated, block: B:146:0x0245  */
    /* JADX WARN: Code duplicated, block: B:149:0x0251  */
    /* JADX WARN: Code duplicated, block: B:153:0x027f  */
    /* JADX WARN: Code duplicated, block: B:155:0x0285  */
    /* JADX WARN: Code duplicated, block: B:161:0x02a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:162:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:165:0x02be  */
    /* JADX WARN: Code duplicated, block: B:167:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:170:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:171:0x02e0 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:25:0x0048  */
    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0053  */
    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:46:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:49:0x0087  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0097  */
    /* JADX WARN: Code duplicated, block: B:56:0x0099  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ca A[PHI: r3 r6 r8 r12
      0x00ca: PHI (r3v18 int) = (r3v12 int), (r3v21 int), (r3v22 int) binds: [B:92:0x0136, B:71:0x00c6, B:72:0x00c8] A[DONT_GENERATE, DONT_INLINE]
      0x00ca: PHI (r6v9 p.qim0) = (r6v5 p.qim0), (r6v2 p.qim0), (r6v2 p.qim0) binds: [B:92:0x0136, B:71:0x00c6, B:72:0x00c8] A[DONT_GENERATE, DONT_INLINE]
      0x00ca: PHI (r8v22 p.ksl) = (r8v8 p.ksl), (r8v6 p.ksl), (r8v6 p.ksl) binds: [B:92:0x0136, B:71:0x00c6, B:72:0x00c8] A[DONT_GENERATE, DONT_INLINE]
      0x00ca: PHI (r12v6 long) = (r12v3 long), (r12v1 long), (r12v1 long) binds: [B:92:0x0136, B:71:0x00c6, B:72:0x00c8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x00d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:80:0x00dd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x00df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:86:0x010b  */
    /* JADX WARN: Code duplicated, block: B:90:0x0127  */
    /* JADX WARN: Code duplicated, block: B:93:0x0138  */
    /* JADX WARN: Code duplicated, block: B:96:0x014a  */
    /* JADX WARN: Code duplicated, block: B:98:0x0150  */
    public static final void a(zkt0 zkt0Var, qim0 qim0Var, ksl kslVar, long j, boolean z, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var2;
        ksl kslVar2;
        long j2;
        boolean zD;
        boolean z2;
        ksl kslVar3;
        long j3;
        h311 h311VarV;
        ukt0 ukt0Var;
        int i4;
        qim0 qim0Var3;
        long j4;
        int i5;
        int iOrdinal;
        ksl jslVar;
        Object objT;
        qim0 qim0VarA;
        float[] fArr;
        float[] fArr2;
        float[] fArr3;
        zkt0 zkt0Var2;
        Object objT2;
        tob1 tob1VarB;
        Object objT3;
        Object objT4;
        tob1 tob1VarB2;
        tob1 tob1VarB3;
        Object objT5;
        Object objT6;
        Object objT7;
        boolean zI;
        Object objT8;
        boolean z3;
        boolean z4;
        Object objT9;
        int i6;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(382924797);
        if ((i & 6) == 0) {
            i3 = (x340Var.e(zkt0Var.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 == 0) {
            if ((i & 48) == 0) {
                qim0Var2 = qim0Var;
                i3 |= x340Var.i(qim0Var2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if ((i2 & 4) == 0) {
                    kslVar2 = kslVar;
                    int i8 = x340Var.g(kslVar2) ? 256 : 128;
                    i3 |= i8;
                } else {
                    kslVar2 = kslVar;
                }
                i3 |= i8;
            } else {
                kslVar2 = kslVar;
            }
            if ((i & 3072) == 0) {
                j2 = j;
                if ((i2 & 8) == 0 || !x340Var.f(j2)) {
                    i6 = 1024;
                } else {
                    i6 = 2048;
                }
                i3 |= i6;
            } else {
                j2 = j;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    zD = z;
                    int i9 = x340Var.h(zD) ? 16384 : 8192;
                    i3 |= i9;
                } else {
                    zD = z;
                }
                i3 |= i9;
            } else {
                zD = z;
            }
            if ((i3 & 9363) != 9362) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (x340Var.Y(i3 & 1, z2)) {
                x340Var.d0();
                i4 = i & 1;
                qim0Var3 = nim0.a;
                if (i4 != 0 || x340Var.E()) {
                    if (i7 != 0) {
                        qim0Var2 = qim0Var3;
                    }
                    if ((i2 & 4) != 0) {
                        iOrdinal = zkt0Var.ordinal();
                        if (iOrdinal == 0) {
                            x340Var.i0(-655567167);
                            jslVar = new jsl(cwl1.o0(x340Var, 2131961276));
                            x340Var.r(false);
                        } else if (iOrdinal == 1) {
                            x340Var.i0(-655563328);
                            jslVar = new jsl(cwl1.o0(x340Var, 2131961275));
                            x340Var.r(false);
                        } else {
                            if (iOrdinal != 2) {
                                throw p3d1.k(x340Var, -655569276, false);
                            }
                            x340Var.i0(-655560414);
                            x340Var.r(false);
                            jslVar = isl.a;
                        }
                        i3 &= -897;
                        kslVar2 = jslVar;
                    }
                    if ((i2 & 8) != 0) {
                        uwr uwrVar = cbx.a;
                        i3 &= -7169;
                        j2 = cbx.a(x340Var).c.c;
                    }
                    if ((i2 & 16) != 0) {
                        zD = d();
                        j4 = j2;
                        i5 = i3 & (-57345);
                        kslVar3 = kslVar2;
                    }
                    x340Var.s();
                    if (zkt0Var == zkt0.c) {
                        h311VarV = x340Var.v();
                        if (h311VarV == null) {
                            return;
                        } else {
                            ukt0Var = new ukt0(zkt0Var, qim0Var2, kslVar3, j4, zD, i, i2, (byte) 0);
                        }
                    } else {
                        j2 = j4;
                        if (kslVar3 instanceof jsl) {
                            x340Var.i0(-1376443680);
                            z4 = (((i5 & 896) ^ 384) <= 256 && x340Var.g(kslVar3)) || (i5 & 384) == 256;
                            objT9 = x340Var.T();
                            if (z4 || objT9 == m4cVar) {
                                objT9 = new fgs0((jsl) kslVar3, (byte) 10);
                                x340Var.s0(objT9);
                            }
                            qim0VarA = s161.b(qim0Var3, false, (iu30) objT9);
                            x340Var.r(false);
                        } else {
                            if (!(kslVar3 instanceof isl)) {
                                throw p3d1.k(x340Var, -1376446109, false);
                            }
                            x340Var.i0(-1376439884);
                            objT = x340Var.T();
                            if (objT == m4cVar) {
                                objT = iet0.d1;
                                x340Var.s0(objT);
                            }
                            qim0VarA = s161.a(qim0Var3, (iu30) objT);
                            x340Var.r(false);
                        }
                        fArr = d;
                        fArr2 = c;
                        fArr3 = b;
                        zkt0Var2 = zkt0.a;
                        if (zD) {
                            x340Var.i0(280192705);
                            if (zkt0Var == zkt0Var2) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            db80 db80VarR = t5p1.r("play-indicator-transition", x340Var, 0);
                            tob1VarB = b(db80VarR, z3, fArr3, "bar-1", x340Var);
                            tob1VarB2 = b(db80VarR, z3, fArr2, "bar-2", x340Var);
                            tob1VarB3 = b(db80VarR, z3, fArr, "bar-3", x340Var);
                            x340Var.r(false);
                        } else if (zkt0Var == zkt0Var2) {
                            x340Var.i0(280618676);
                            objT5 = x340Var.T();
                            if (objT5 == m4cVar) {
                                objT5 = us71.i(fArr3[0], x340Var);
                            }
                            tob1VarB = (tob1) objT5;
                            objT6 = x340Var.T();
                            if (objT6 == m4cVar) {
                                objT6 = us71.i(fArr2[0], x340Var);
                            }
                            tob1VarB2 = (tob1) objT6;
                            objT7 = x340Var.T();
                            if (objT7 == m4cVar) {
                                objT7 = us71.i(fArr[0], x340Var);
                            }
                            tob1VarB3 = (tob1) objT7;
                            x340Var.r(false);
                        } else {
                            x340Var.i0(280832514);
                            objT2 = x340Var.T();
                            if (objT2 == m4cVar) {
                                objT2 = us71.i(0.16666667f, x340Var);
                            }
                            tob1VarB = (tob1) objT2;
                            objT3 = x340Var.T();
                            if (objT3 == m4cVar) {
                                objT3 = us71.i(0.16666667f, x340Var);
                            }
                            tob1 tob1Var = (tob1) objT3;
                            objT4 = x340Var.T();
                            if (objT4 == m4cVar) {
                                objT4 = us71.i(0.16666667f, x340Var);
                            }
                            x340Var.r(false);
                            tob1VarB2 = tob1Var;
                            tob1VarB3 = (tob1) objT4;
                        }
                        uwr uwrVar2 = cbx.a;
                        cvx cvxVar = cbx.b(x340Var).b;
                        qim0 qim0VarThen = u291.r(qim0Var2, 16.0f).then(qim0VarA);
                        zI = x340Var.i(tob1VarB) | ((((i5 & 7168) ^ 3072) <= 2048 && x340Var.f(j2)) || (i5 & 3072) == 2048) | x340Var.i(tob1VarB2) | x340Var.i(tob1VarB3);
                        objT8 = x340Var.T();
                        if (zI || objT8 == m4cVar) {
                            objT8 = new vkt0(tob1VarB, j2, tob1VarB2, tob1VarB3, (byte) 0);
                            x340Var.s0(objT8);
                        }
                        j0o1.b(0, x340Var, (iu30) objT8, qim0VarThen);
                    }
                    h311VarV.d = ukt0Var;
                }
                x340Var.b0();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                }
                i5 = i3;
                kslVar3 = kslVar2;
                j4 = j2;
                x340Var.s();
                if (zkt0Var == zkt0.c) {
                    h311VarV = x340Var.v();
                    if (h311VarV == null) {
                        return;
                    } else {
                        ukt0Var = new ukt0(zkt0Var, qim0Var2, kslVar3, j4, zD, i, i2, (byte) 0);
                    }
                } else {
                    j2 = j4;
                    if (kslVar3 instanceof jsl) {
                        x340Var.i0(-1376443680);
                        if (((i5 & 896) ^ 384) <= 256) {
                        }
                        objT9 = x340Var.T();
                        if (z4) {
                            objT9 = new fgs0((jsl) kslVar3, (byte) 10);
                            x340Var.s0(objT9);
                        } else {
                            objT9 = new fgs0((jsl) kslVar3, (byte) 10);
                            x340Var.s0(objT9);
                        }
                        qim0VarA = s161.b(qim0Var3, false, (iu30) objT9);
                        x340Var.r(false);
                    } else {
                        if (!(kslVar3 instanceof isl)) {
                            throw p3d1.k(x340Var, -1376446109, false);
                        }
                        x340Var.i0(-1376439884);
                        objT = x340Var.T();
                        if (objT == m4cVar) {
                            objT = iet0.d1;
                            x340Var.s0(objT);
                        }
                        qim0VarA = s161.a(qim0Var3, (iu30) objT);
                        x340Var.r(false);
                    }
                    fArr = d;
                    fArr2 = c;
                    fArr3 = b;
                    zkt0Var2 = zkt0.a;
                    if (zD) {
                        x340Var.i0(280192705);
                        if (zkt0Var == zkt0Var2) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        db80 db80VarR2 = t5p1.r("play-indicator-transition", x340Var, 0);
                        tob1VarB = b(db80VarR2, z3, fArr3, "bar-1", x340Var);
                        tob1VarB2 = b(db80VarR2, z3, fArr2, "bar-2", x340Var);
                        tob1VarB3 = b(db80VarR2, z3, fArr, "bar-3", x340Var);
                        x340Var.r(false);
                    } else if (zkt0Var == zkt0Var2) {
                        x340Var.i0(280618676);
                        objT5 = x340Var.T();
                        if (objT5 == m4cVar) {
                            objT5 = us71.i(fArr3[0], x340Var);
                        }
                        tob1VarB = (tob1) objT5;
                        objT6 = x340Var.T();
                        if (objT6 == m4cVar) {
                            objT6 = us71.i(fArr2[0], x340Var);
                        }
                        tob1VarB2 = (tob1) objT6;
                        objT7 = x340Var.T();
                        if (objT7 == m4cVar) {
                            objT7 = us71.i(fArr[0], x340Var);
                        }
                        tob1VarB3 = (tob1) objT7;
                        x340Var.r(false);
                    } else {
                        x340Var.i0(280832514);
                        objT2 = x340Var.T();
                        if (objT2 == m4cVar) {
                            objT2 = us71.i(0.16666667f, x340Var);
                        }
                        tob1VarB = (tob1) objT2;
                        objT3 = x340Var.T();
                        if (objT3 == m4cVar) {
                            objT3 = us71.i(0.16666667f, x340Var);
                        }
                        tob1 tob1Var2 = (tob1) objT3;
                        objT4 = x340Var.T();
                        if (objT4 == m4cVar) {
                            objT4 = us71.i(0.16666667f, x340Var);
                        }
                        x340Var.r(false);
                        tob1VarB2 = tob1Var2;
                        tob1VarB3 = (tob1) objT4;
                    }
                    uwr uwrVar3 = cbx.a;
                    cvx cvxVar2 = cbx.b(x340Var).b;
                    qim0 qim0VarThen2 = u291.r(qim0Var2, 16.0f).then(qim0VarA);
                    zI = x340Var.i(tob1VarB) | ((((i5 & 7168) ^ 3072) <= 2048 && x340Var.f(j2)) || (i5 & 3072) == 2048) | x340Var.i(tob1VarB2) | x340Var.i(tob1VarB3);
                    objT8 = x340Var.T();
                    if (zI) {
                        objT8 = new vkt0(tob1VarB, j2, tob1VarB2, tob1VarB3, (byte) 0);
                        x340Var.s0(objT8);
                    } else {
                        objT8 = new vkt0(tob1VarB, j2, tob1VarB2, tob1VarB3, (byte) 0);
                        x340Var.s0(objT8);
                    }
                    j0o1.b(0, x340Var, (iu30) objT8, qim0VarThen2);
                }
                h311VarV.d = ukt0Var;
            }
            x340Var.b0();
            kslVar3 = kslVar2;
            j3 = j2;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                ukt0Var = new ukt0(zkt0Var, qim0Var2, kslVar3, j3, zD, i, i2, (byte) 1);
                h311VarV.d = ukt0Var;
            }
        }
        i3 |= 48;
        qim0Var2 = qim0Var;
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                kslVar2 = kslVar;
                if (x340Var.g(kslVar2)) {
                }
                i3 |= i8;
            } else {
                kslVar2 = kslVar;
            }
            i3 |= i8;
        } else {
            kslVar2 = kslVar;
        }
        if ((i & 3072) == 0) {
            j2 = j;
            if ((i2 & 8) == 0) {
                i6 = 1024;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        } else {
            j2 = j;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                zD = z;
                if (x340Var.h(zD)) {
                }
                i3 |= i9;
            } else {
                zD = z;
            }
            i3 |= i9;
        } else {
            zD = z;
        }
        if ((i3 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (x340Var.Y(i3 & 1, z2)) {
            x340Var.d0();
            i4 = i & 1;
            qim0Var3 = nim0.a;
            if (i4 != 0) {
                if (i7 != 0) {
                    qim0Var2 = qim0Var3;
                }
                if ((i2 & 4) != 0) {
                    iOrdinal = zkt0Var.ordinal();
                    if (iOrdinal == 0) {
                        x340Var.i0(-655567167);
                        jslVar = new jsl(cwl1.o0(x340Var, 2131961276));
                        x340Var.r(false);
                    } else if (iOrdinal == 1) {
                        x340Var.i0(-655563328);
                        jslVar = new jsl(cwl1.o0(x340Var, 2131961275));
                        x340Var.r(false);
                    } else {
                        if (iOrdinal != 2) {
                            throw p3d1.k(x340Var, -655569276, false);
                        }
                        x340Var.i0(-655560414);
                        x340Var.r(false);
                        jslVar = isl.a;
                    }
                    i3 &= -897;
                    kslVar2 = jslVar;
                }
                if ((i2 & 8) != 0) {
                    uwr uwrVar4 = cbx.a;
                    i3 &= -7169;
                    j2 = cbx.a(x340Var).c.c;
                }
                if ((i2 & 16) != 0) {
                    zD = d();
                    j4 = j2;
                    i5 = i3 & (-57345);
                    kslVar3 = kslVar2;
                } else {
                    i5 = i3;
                    kslVar3 = kslVar2;
                    j4 = j2;
                }
            } else {
                if (i7 != 0) {
                    qim0Var2 = qim0Var3;
                }
                if ((i2 & 4) != 0) {
                    iOrdinal = zkt0Var.ordinal();
                    if (iOrdinal == 0) {
                        x340Var.i0(-655567167);
                        jslVar = new jsl(cwl1.o0(x340Var, 2131961276));
                        x340Var.r(false);
                    } else if (iOrdinal == 1) {
                        x340Var.i0(-655563328);
                        jslVar = new jsl(cwl1.o0(x340Var, 2131961275));
                        x340Var.r(false);
                    } else {
                        if (iOrdinal != 2) {
                            throw p3d1.k(x340Var, -655569276, false);
                        }
                        x340Var.i0(-655560414);
                        x340Var.r(false);
                        jslVar = isl.a;
                    }
                    i3 &= -897;
                    kslVar2 = jslVar;
                }
                if ((i2 & 8) != 0) {
                    uwr uwrVar5 = cbx.a;
                    i3 &= -7169;
                    j2 = cbx.a(x340Var).c.c;
                }
                if ((i2 & 16) != 0) {
                    zD = d();
                    j4 = j2;
                    i5 = i3 & (-57345);
                    kslVar3 = kslVar2;
                } else {
                    i5 = i3;
                    kslVar3 = kslVar2;
                    j4 = j2;
                }
            }
            x340Var.s();
            if (zkt0Var == zkt0.c) {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    ukt0Var = new ukt0(zkt0Var, qim0Var2, kslVar3, j4, zD, i, i2, (byte) 0);
                }
            } else {
                j2 = j4;
                if (kslVar3 instanceof jsl) {
                    x340Var.i0(-1376443680);
                    if (((i5 & 896) ^ 384) <= 256) {
                    }
                    objT9 = x340Var.T();
                    if (z4) {
                        objT9 = new fgs0((jsl) kslVar3, (byte) 10);
                        x340Var.s0(objT9);
                    } else {
                        objT9 = new fgs0((jsl) kslVar3, (byte) 10);
                        x340Var.s0(objT9);
                    }
                    qim0VarA = s161.b(qim0Var3, false, (iu30) objT9);
                    x340Var.r(false);
                } else {
                    if (!(kslVar3 instanceof isl)) {
                        throw p3d1.k(x340Var, -1376446109, false);
                    }
                    x340Var.i0(-1376439884);
                    objT = x340Var.T();
                    if (objT == m4cVar) {
                        objT = iet0.d1;
                        x340Var.s0(objT);
                    }
                    qim0VarA = s161.a(qim0Var3, (iu30) objT);
                    x340Var.r(false);
                }
                fArr = d;
                fArr2 = c;
                fArr3 = b;
                zkt0Var2 = zkt0.a;
                if (zD) {
                    x340Var.i0(280192705);
                    if (zkt0Var == zkt0Var2) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    db80 db80VarR3 = t5p1.r("play-indicator-transition", x340Var, 0);
                    tob1VarB = b(db80VarR3, z3, fArr3, "bar-1", x340Var);
                    tob1VarB2 = b(db80VarR3, z3, fArr2, "bar-2", x340Var);
                    tob1VarB3 = b(db80VarR3, z3, fArr, "bar-3", x340Var);
                    x340Var.r(false);
                } else if (zkt0Var == zkt0Var2) {
                    x340Var.i0(280618676);
                    objT5 = x340Var.T();
                    if (objT5 == m4cVar) {
                        objT5 = us71.i(fArr3[0], x340Var);
                    }
                    tob1VarB = (tob1) objT5;
                    objT6 = x340Var.T();
                    if (objT6 == m4cVar) {
                        objT6 = us71.i(fArr2[0], x340Var);
                    }
                    tob1VarB2 = (tob1) objT6;
                    objT7 = x340Var.T();
                    if (objT7 == m4cVar) {
                        objT7 = us71.i(fArr[0], x340Var);
                    }
                    tob1VarB3 = (tob1) objT7;
                    x340Var.r(false);
                } else {
                    x340Var.i0(280832514);
                    objT2 = x340Var.T();
                    if (objT2 == m4cVar) {
                        objT2 = us71.i(0.16666667f, x340Var);
                    }
                    tob1VarB = (tob1) objT2;
                    objT3 = x340Var.T();
                    if (objT3 == m4cVar) {
                        objT3 = us71.i(0.16666667f, x340Var);
                    }
                    tob1 tob1Var3 = (tob1) objT3;
                    objT4 = x340Var.T();
                    if (objT4 == m4cVar) {
                        objT4 = us71.i(0.16666667f, x340Var);
                    }
                    x340Var.r(false);
                    tob1VarB2 = tob1Var3;
                    tob1VarB3 = (tob1) objT4;
                }
                uwr uwrVar6 = cbx.a;
                cvx cvxVar3 = cbx.b(x340Var).b;
                qim0 qim0VarThen3 = u291.r(qim0Var2, 16.0f).then(qim0VarA);
                zI = x340Var.i(tob1VarB) | ((((i5 & 7168) ^ 3072) <= 2048 && x340Var.f(j2)) || (i5 & 3072) == 2048) | x340Var.i(tob1VarB2) | x340Var.i(tob1VarB3);
                objT8 = x340Var.T();
                if (zI) {
                    objT8 = new vkt0(tob1VarB, j2, tob1VarB2, tob1VarB3, (byte) 0);
                    x340Var.s0(objT8);
                } else {
                    objT8 = new vkt0(tob1VarB, j2, tob1VarB2, tob1VarB3, (byte) 0);
                    x340Var.s0(objT8);
                }
                j0o1.b(0, x340Var, (iu30) objT8, qim0VarThen3);
            }
            h311VarV.d = ukt0Var;
        }
        x340Var.b0();
        kslVar3 = kslVar2;
        j3 = j2;
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            ukt0Var = new ukt0(zkt0Var, qim0Var2, kslVar3, j3, zD, i, i2, (byte) 1);
            h311VarV.d = ukt0Var;
        }
    }

    public static final tob1 b(db80 db80Var, boolean z, float[] fArr, String str, b0k b0kVar) {
        b0k b0kVar2;
        String str2;
        cb80 cb80VarG;
        b0k b0kVar3 = (x340) b0kVar;
        Object objT = b0kVar3.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            objT = us71.i(fArr[0], b0kVar3);
        }
        cb80 cb80Var = (drr0) objT;
        if (z) {
            b0kVar3.i0(304097488);
            float f = fArr[0];
            float f2 = fArr[5];
            boolean zI = b0kVar3.i(fArr);
            Object objT2 = b0kVar3.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new fgs0(fArr, (byte) 11);
                b0kVar3.s0(objT2);
            }
            b0kVar2 = b0kVar3;
            str2 = str;
            cb80VarG = t5p1.g(db80Var, f, f2, irn1.Y(irn1.e0((iu30) objT2), 1, 0L, 4), str2, b0kVar2, 28680, 0);
            b0kVar2.r(false);
        } else {
            b0kVar2 = b0kVar3;
            str2 = str;
            b0kVar2.i0(304737700);
            b0kVar2.r(false);
            cb80VarG = cb80Var;
        }
        float f3 = z ? 1.0f : 0.0f;
        pxg1 pxg1VarO0 = irn1.o0(200, 0, mlv.a, 2);
        String strConcat = "blend-".concat(str2);
        b0k b0kVar4 = b0kVar2;
        tob1 tob1VarB = z95.b(f3, pxg1VarO0, strConcat, (iu30) null, b0kVar4, 0, 20);
        boolean zG = b0kVar4.g(cb80VarG);
        Object objT3 = b0kVar4.T();
        if (zG || objT3 == m4cVar) {
            objT3 = yv91.a(new zg6(cb80VarG, z, cb80Var, tob1VarB));
            b0kVar4.s0(objT3);
        }
        return (tob1) objT3;
    }

    public static final void c(DrawScope drawScope, float f, float f2, float f3, long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) * f3;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) - fIntBitsToFloat;
        DrawScope.d0(drawScope, j, (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L), (((long) Float.floatToRawIntBits(f2)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat))), 0.0f, (phc1) null, (ColorFilter) null, 120);
    }

    public static final boolean d() {
        return !u890.j(Build.FINGERPRINT, "robolectric");
    }
}

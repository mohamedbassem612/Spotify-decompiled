package p;

import android.graphics.Bitmap;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class vi6 {
    public static final z3g1 a = new z3g1(34.0f, null, -0.01f, 24);
    public static final z3g1 b = new z3g1(46.0f, Float.valueOf(43.7f), 0.0f, 16);
    public static final z3g1 c = new z3g1(34.0f, Float.valueOf(40.800003f), 0.0f, true, 2.0f);
    public static final float d = phc0.d;

    public static final void a(String str, long j, yux yuxVar, z3g1 z3g1Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1527912341);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(yuxVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.g(z3g1Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.g(qim0Var) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            wat watVar = (wat) x340Var.k(t4k.h);
            long jS = watVar.s(yuxVar.c(z3g1Var.a));
            Float f = z3g1Var.b;
            long jS2 = f != null ? watVar.s(yuxVar.c(f.floatValue())) : TextUnit.c;
            uwr uwrVar = cbx.a;
            lee1 lee1VarA = lee1.a(cbx.d(x340Var).c, 0L, jS, FontWeight.t, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, fc11.Y(z3g1Var.c, 8589934592L), (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, jS2, (u8e1) null, (wdt0) null, f != null ? new shc0(17, 0, phc0.b) : null, 0, 15597433);
            cjc0 cjc0Var = new cjc0(2);
            yfu yfuVar = ajx.a;
            Object obj = yfuVar.b;
            FontWeight fontWeight = (FontWeight) ((bjx) yfuVar.c).e;
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            boolean z = ((i2 & 7168) == 2048) | ((i2 & 896) == 256);
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new wf((Object) z3g1Var, (Object) yuxVar, (byte) 19);
                x340Var.s0(objT);
            }
            gxo1.c(str, j9k1.x(qim0VarF, (xu30) objT), lee1VarA, j, null, 2, false, cjc0Var, null, 50.0f, fontWeight, null, x340Var, (i2 & 14) | 196608 | ((i2 << 6) & 7168), 0, 2384);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new si6(str, j, yuxVar, z3g1Var, qim0Var, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:44:0x007c  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00af  */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    public static final void b(yj41 yj41Var, qim0 qim0Var, j6m j6mVar, b0k b0kVar, int i, int i2) {
        int i3;
        j6m j6mVar2;
        boolean z;
        j6m j6mVar3;
        h311 h311VarV;
        j6m j6mVar4;
        boolean zG;
        Object objT;
        Bitmap bitmap = yj41Var.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1749769242);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? x340Var.g(yj41Var) : x340Var.i(yj41Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.g(qim0Var) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                j6mVar2 = j6mVar;
                i3 |= x340Var.g(j6mVar2) ? 256 : 128;
            }
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                if (i4 != 0) {
                    j6mVar4 = mif1.Q0;
                } else {
                    j6mVar4 = j6mVar2;
                }
                zG = x340Var.g(bitmap);
                objT = x340Var.T();
                if (zG || objT == fkj0.X) {
                    objT = new yk4(bitmap);
                    x340Var.s0(objT);
                }
                eso1.f((yk4) objT, yj41Var.a(), qim0Var, (p3v) null, (zvx) null, (ecx) null, j6mVar4, (tl3) null, (ColorFilter) null, x340Var, ((i3 << 3) & 896) | 224256 | ((i3 << 12) & 3670016), 384);
                j6mVar3 = j6mVar4;
            } else {
                x340Var.b0();
                j6mVar3 = j6mVar2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new qx1((Object) yj41Var, (Object) qim0Var, (Object) j6mVar3, i, i2, (byte) 1);
            }
        }
        i3 |= 384;
        j6mVar2 = j6mVar;
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i3 & 1, z)) {
            if (i4 != 0) {
                j6mVar4 = mif1.Q0;
            } else {
                j6mVar4 = j6mVar2;
            }
            zG = x340Var.g(bitmap);
            objT = x340Var.T();
            if (zG) {
                objT = new yk4(bitmap);
                x340Var.s0(objT);
            } else {
                objT = new yk4(bitmap);
                x340Var.s0(objT);
            }
            eso1.f((yk4) objT, yj41Var.a(), qim0Var, (p3v) null, (zvx) null, (ecx) null, j6mVar4, (tl3) null, (ColorFilter) null, x340Var, ((i3 << 3) & 896) | 224256 | ((i3 << 12) & 3670016), 384);
            j6mVar3 = j6mVar4;
        } else {
            x340Var.b0();
            j6mVar3 = j6mVar2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qx1((Object) yj41Var, (Object) qim0Var, (Object) j6mVar3, i, i2, (byte) 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0093  */
    /* JADX WARN: Code duplicated, block: B:57:0x0096  */
    /* JADX WARN: Code duplicated, block: B:59:0x009e  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00af  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cb A[PHI: r6
      0x00cb: PHI (r6v7 int) = (r6v4 int), (r6v2 int) binds: [B:77:0x00d0, B:73:0x00c8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:84:0x0103  */
    /* JADX WARN: Code duplicated, block: B:87:0x015e  */
    /* JADX WARN: Code duplicated, block: B:88:0x0160  */
    /* JADX WARN: Code duplicated, block: B:91:0x017e  */
    /* JADX WARN: Code duplicated, block: B:92:0x0191  */
    /* JADX WARN: Code duplicated, block: B:94:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:96:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:99:0x01e1  */
    public static final void c(String str, lee1 lee1Var, long j, qim0 qim0Var, int i, float f, p3v p3vVar, b0k b0kVar, int i2, int i3) {
        int i4;
        lee1 lee1Var2;
        int i5;
        float f2;
        int i6;
        p3v p3vVar2;
        int i7;
        boolean z;
        p3v p3vVar3;
        h311 h311VarV;
        p3v p3vVar4;
        gfh0 gfh0VarC;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        int i8;
        nim0 nim0Var;
        qim0 qim0VarY;
        int i9;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1656727380);
        if ((i2 & 6) == 0) {
            i4 = (x340Var.g(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            lee1Var2 = lee1Var;
            i4 |= x340Var.g(lee1Var2) ? 32 : 16;
        } else {
            lee1Var2 = lee1Var;
        }
        if ((i2 & 384) == 0) {
            i4 |= x340Var.f(j) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= x340Var.g(qim0Var) ? 2048 : 1024;
        }
        int i10 = i3 & 16;
        if (i10 == 0) {
            if ((i2 & 24576) == 0) {
                i5 = i;
                i4 |= x340Var.e(i5) ? 16384 : 8192;
            }
            if ((i2 & 196608) == 0) {
                f2 = f;
                if (x340Var.d(f2)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i4 |= i9;
            } else {
                f2 = f;
            }
            i6 = i3 & 64;
            if (i6 != 0) {
                if ((1572864 & i2) == 0) {
                    p3vVar2 = p3vVar;
                    if (x340Var.g(p3vVar2)) {
                        i7 = 1048576;
                    } else {
                        i7 = 524288;
                    }
                    i4 |= i7;
                }
                if ((599187 & i4) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var.Y(i4 & 1, z)) {
                    x340Var.d0();
                    if ((i2 & 1) != 0 || x340Var.E()) {
                        if (i10 != 0) {
                            i5 = 1;
                        }
                        if (i6 != 0) {
                            p3vVar4 = null;
                        }
                        x340Var.s();
                        gfh0VarC = t1c.c(een.d, false);
                        iHashCode = Long.hashCode(x340Var.T);
                        xos0VarM = x340Var.m();
                        qim0VarE = zr7.E(x340Var, qim0Var);
                        hzj.A.getClass();
                        if (x340Var.a == null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var.m0();
                        if (x340Var.S) {
                            x340Var.l(hmb0.t1);
                        } else {
                            x340Var.v0();
                        }
                        nko1.H(gfh0VarC, x340Var, y580.O0);
                        nko1.H(xos0VarM, x340Var, y580.N0);
                        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                        nko1.F(x340Var);
                        nko1.H(qim0VarE, x340Var, y580.Y);
                        lee1 lee1VarA = lee1.a(d(lee1Var2), 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 4, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16711679);
                        if (x340Var.k(t4k.n) == flb0.b) {
                            i8 = 2;
                        } else {
                            i8 = 1;
                        }
                        cjc0 cjc0Var = new cjc0(i5);
                        uwr uwrVar = cbx.a;
                        FontWeight fontWeight = (FontWeight) ((bjx) ajx.a.c).e;
                        nim0Var = nim0.a;
                        qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                        if (p3vVar4 != null) {
                            qim0VarY = j9k1.x(nim0Var, new yy2((byte) 1, p3vVar4.a));
                        } else {
                            qim0VarY = u291.y(nim0Var, een.N0, true);
                        }
                        gxo1.c(str, qim0VarF.then(qim0VarY), lee1VarA, j, new a0e1(i8), 2, false, cjc0Var, null, f2, fontWeight, null, x340Var, (i4 & 14) | 196608 | ((i4 << 3) & 7168) | ((i4 << 12) & 1879048192), 0, 2368);
                        x340Var = x340Var;
                        x340Var.r(true);
                        p3vVar3 = p3vVar4;
                    } else {
                        x340Var.b0();
                    }
                    p3vVar4 = p3vVar2;
                    x340Var.s();
                    gfh0VarC = t1c.c(een.d, false);
                    iHashCode = Long.hashCode(x340Var.T);
                    xos0VarM = x340Var.m();
                    qim0VarE = zr7.E(x340Var, qim0Var);
                    hzj.A.getClass();
                    if (x340Var.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(hmb0.t1);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC, x340Var, y580.O0);
                    nko1.H(xos0VarM, x340Var, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                    nko1.F(x340Var);
                    nko1.H(qim0VarE, x340Var, y580.Y);
                    lee1 lee1VarA2 = lee1.a(d(lee1Var2), 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 4, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16711679);
                    if (x340Var.k(t4k.n) == flb0.b) {
                        i8 = 2;
                    } else {
                        i8 = 1;
                    }
                    cjc0 cjc0Var2 = new cjc0(i5);
                    uwr uwrVar2 = cbx.a;
                    FontWeight fontWeight2 = (FontWeight) ((bjx) ajx.a.c).e;
                    nim0Var = nim0.a;
                    qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                    if (p3vVar4 != null) {
                        qim0VarY = j9k1.x(nim0Var, new yy2((byte) 1, p3vVar4.a));
                    } else {
                        qim0VarY = u291.y(nim0Var, een.N0, true);
                    }
                    gxo1.c(str, qim0VarF2.then(qim0VarY), lee1VarA2, j, new a0e1(i8), 2, false, cjc0Var2, null, f2, fontWeight2, null, x340Var, (i4 & 14) | 196608 | ((i4 << 3) & 7168) | ((i4 << 12) & 1879048192), 0, 2368);
                    x340Var = x340Var;
                    x340Var.r(true);
                    p3vVar3 = p3vVar4;
                } else {
                    x340Var.b0();
                    p3vVar3 = p3vVar2;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new ti6(str, lee1Var2, j, qim0Var, i5, f, p3vVar3, i2, i3);
                }
            }
            i4 |= 1572864;
            p3vVar2 = p3vVar;
            if ((599187 & i4) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i4 & 1, z)) {
                x340Var.d0();
                if ((i2 & 1) != 0) {
                    if (i10 != 0) {
                        i5 = 1;
                    }
                    if (i6 != 0) {
                        p3vVar4 = null;
                    } else {
                        p3vVar4 = p3vVar2;
                    }
                } else {
                    if (i10 != 0) {
                        i5 = 1;
                    }
                    if (i6 != 0) {
                        p3vVar4 = null;
                    } else {
                        p3vVar4 = p3vVar2;
                    }
                }
                x340Var.s();
                gfh0VarC = t1c.c(een.d, false);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0Var);
                hzj.A.getClass();
                if (x340Var.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(hmb0.t1);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                lee1 lee1VarA3 = lee1.a(d(lee1Var2), 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 4, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16711679);
                if (x340Var.k(t4k.n) == flb0.b) {
                    i8 = 2;
                } else {
                    i8 = 1;
                }
                cjc0 cjc0Var3 = new cjc0(i5);
                uwr uwrVar3 = cbx.a;
                FontWeight fontWeight3 = (FontWeight) ((bjx) ajx.a.c).e;
                nim0Var = nim0.a;
                qim0 qim0VarF3 = u291.f(nim0Var, 1.0f);
                if (p3vVar4 != null) {
                    qim0VarY = j9k1.x(nim0Var, new yy2((byte) 1, p3vVar4.a));
                } else {
                    qim0VarY = u291.y(nim0Var, een.N0, true);
                }
                gxo1.c(str, qim0VarF3.then(qim0VarY), lee1VarA3, j, new a0e1(i8), 2, false, cjc0Var3, null, f2, fontWeight3, null, x340Var, (i4 & 14) | 196608 | ((i4 << 3) & 7168) | ((i4 << 12) & 1879048192), 0, 2368);
                x340Var = x340Var;
                x340Var.r(true);
                p3vVar3 = p3vVar4;
            } else {
                x340Var.b0();
                p3vVar3 = p3vVar2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new ti6(str, lee1Var2, j, qim0Var, i5, f, p3vVar3, i2, i3);
            }
        }
        i4 |= 24576;
        i5 = i;
        if ((i2 & 196608) == 0) {
            f2 = f;
            if (x340Var.d(f2)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i4 |= i9;
        } else {
            f2 = f;
        }
        i6 = i3 & 64;
        if (i6 != 0) {
            if ((1572864 & i2) == 0) {
                p3vVar2 = p3vVar;
                if (x340Var.g(p3vVar2)) {
                    i7 = 1048576;
                } else {
                    i7 = 524288;
                }
                i4 |= i7;
            }
            if ((599187 & i4) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i4 & 1, z)) {
                x340Var.d0();
                if ((i2 & 1) != 0) {
                    if (i10 != 0) {
                        i5 = 1;
                    }
                    if (i6 != 0) {
                        p3vVar4 = null;
                    } else {
                        p3vVar4 = p3vVar2;
                    }
                } else {
                    if (i10 != 0) {
                        i5 = 1;
                    }
                    if (i6 != 0) {
                        p3vVar4 = null;
                    } else {
                        p3vVar4 = p3vVar2;
                    }
                }
                x340Var.s();
                gfh0VarC = t1c.c(een.d, false);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0Var);
                hzj.A.getClass();
                if (x340Var.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(hmb0.t1);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                lee1 lee1VarA4 = lee1.a(d(lee1Var2), 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 4, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16711679);
                if (x340Var.k(t4k.n) == flb0.b) {
                    i8 = 2;
                } else {
                    i8 = 1;
                }
                cjc0 cjc0Var4 = new cjc0(i5);
                uwr uwrVar4 = cbx.a;
                FontWeight fontWeight4 = (FontWeight) ((bjx) ajx.a.c).e;
                nim0Var = nim0.a;
                qim0 qim0VarF4 = u291.f(nim0Var, 1.0f);
                if (p3vVar4 != null) {
                    qim0VarY = j9k1.x(nim0Var, new yy2((byte) 1, p3vVar4.a));
                } else {
                    qim0VarY = u291.y(nim0Var, een.N0, true);
                }
                gxo1.c(str, qim0VarF4.then(qim0VarY), lee1VarA4, j, new a0e1(i8), 2, false, cjc0Var4, null, f2, fontWeight4, null, x340Var, (i4 & 14) | 196608 | ((i4 << 3) & 7168) | ((i4 << 12) & 1879048192), 0, 2368);
                x340Var = x340Var;
                x340Var.r(true);
                p3vVar3 = p3vVar4;
            } else {
                x340Var.b0();
                p3vVar3 = p3vVar2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new ti6(str, lee1Var2, j, qim0Var, i5, f, p3vVar3, i2, i3);
            }
        }
        i4 |= 1572864;
        p3vVar2 = p3vVar;
        if ((599187 & i4) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i4 & 1, z)) {
            x340Var.d0();
            if ((i2 & 1) != 0) {
                if (i10 != 0) {
                    i5 = 1;
                }
                if (i6 != 0) {
                    p3vVar4 = null;
                } else {
                    p3vVar4 = p3vVar2;
                }
            } else {
                if (i10 != 0) {
                    i5 = 1;
                }
                if (i6 != 0) {
                    p3vVar4 = null;
                } else {
                    p3vVar4 = p3vVar2;
                }
            }
            x340Var.s();
            gfh0VarC = t1c.c(een.d, false);
            iHashCode = Long.hashCode(x340Var.T);
            xos0VarM = x340Var.m();
            qim0VarE = zr7.E(x340Var, qim0Var);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            lee1 lee1VarA5 = lee1.a(d(lee1Var2), 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 4, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16711679);
            if (x340Var.k(t4k.n) == flb0.b) {
                i8 = 2;
            } else {
                i8 = 1;
            }
            cjc0 cjc0Var5 = new cjc0(i5);
            uwr uwrVar5 = cbx.a;
            FontWeight fontWeight5 = (FontWeight) ((bjx) ajx.a.c).e;
            nim0Var = nim0.a;
            qim0 qim0VarF5 = u291.f(nim0Var, 1.0f);
            if (p3vVar4 != null) {
                qim0VarY = j9k1.x(nim0Var, new yy2((byte) 1, p3vVar4.a));
            } else {
                qim0VarY = u291.y(nim0Var, een.N0, true);
            }
            gxo1.c(str, qim0VarF5.then(qim0VarY), lee1VarA5, j, new a0e1(i8), 2, false, cjc0Var5, null, f2, fontWeight5, null, x340Var, (i4 & 14) | 196608 | ((i4 << 3) & 7168) | ((i4 << 12) & 1879048192), 0, 2368);
            x340Var = x340Var;
            x340Var.r(true);
            p3vVar3 = p3vVar4;
        } else {
            x340Var.b0();
            p3vVar3 = p3vVar2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ti6(str, lee1Var2, j, qim0Var, i5, f, p3vVar3, i2, i3);
        }
    }

    public static final lee1 d(lee1 lee1Var) {
        wdt0 wdt0Var = new wdt0(true);
        shc0 shc0Var = lee1Var.b.f;
        return lee1.a(lee1Var, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, wdt0Var, new shc0(0, 0, shc0Var != null ? shc0Var.a : phc0.b), 0, 15204351);
    }

    public static final qim0 e(long j, qim0 qim0Var) {
        return exd0.s(i541.D(qim0Var, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 0L, 0L, 1, null, 983039), new ps((byte) 2, j));
    }

    public static final qim0 f(qim0 qim0Var, tob1 tob1Var) {
        return tob1Var == null ? qim0Var : i541.C(qim0Var, new lq2(tob1Var, (byte) 9));
    }

    public static final lee1 g(yux yuxVar, float f, float f2, float f3, float f4, b0k b0kVar, int i) {
        float f5 = (i & 8) != 0 ? 0.0f : f3;
        float f6 = (i & 16) != 0 ? phc0.b : f4;
        x340 x340Var = (x340) b0kVar;
        wat watVar = (wat) x340Var.k(t4k.h);
        long jS = watVar.s(yuxVar.c(f));
        long jS2 = watVar.s(yuxVar.c(f2));
        long jS3 = watVar.s(yuxVar.c(f5));
        uwr uwrVar = cbx.a;
        return lee1.a(cbx.d(x340Var).e, 0L, jS, FontWeight.t, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, jS3, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, jS2, (u8e1) null, (wdt0) null, new shc0(17, 0, f6), 0, 15597433);
    }

    public static final qim0 h(yux yuxVar, float f, float f2, float f3, float f4) {
        return u291.h(u291.v(eqr0.C(nim0.a, yuxVar.b(f), yuxVar.c(f2)), yuxVar.b(f3)), yuxVar.c(f4));
    }

    public static final qim0 i(qim0 qim0Var, yk4 yk4Var) {
        return yk4Var == null ? qim0Var : exd0.r(i541.D(qim0Var, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 0L, 0L, 1, null, 983039), new ve3(yk4Var, (byte) 24));
    }

    public static final yk4 j(yj41 yj41Var, b0k b0kVar) {
        if (yj41Var == null) {
            x340 x340Var = (x340) b0kVar;
            x340Var.i0(876304048);
            x340Var.r(false);
            return null;
        }
        Bitmap bitmap = yj41Var.a;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.i0(876304049);
        boolean zG = x340Var2.g(bitmap);
        Object objT = x340Var2.T();
        if (zG || objT == fkj0.X) {
            objT = new yk4(bitmap);
            x340Var2.s0(objT);
        }
        yk4 yk4Var = (yk4) objT;
        x340Var2.r(false);
        return yk4Var;
    }
}

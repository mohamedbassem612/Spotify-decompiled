package p;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class nl70 {
    public static final qim0 a = u291.r(nim0.a, 24.0f);

    public static final void a(yk4 yk4Var, String str, qim0 qim0Var, long j, b0k b0kVar, int i, int i2) {
        qim0 qim0Var2;
        String str2;
        long j2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1092052280);
        int i3 = (x340Var.i(yk4Var) ? 4 : 2) | i | (x340Var.g(str) ? 32 : 16) | (x340Var.g(qim0Var) ? 256 : 128) | (((i2 & 8) == 0 && x340Var.f(j)) ? 2048 : 1024);
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            x340Var.d0();
            if ((i & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
            } else if ((i2 & 8) != 0) {
                j = ((u7h) x340Var.k(wrl.a)).a;
                i3 &= -7169;
            }
            long j3 = j;
            x340Var.s();
            boolean zG = x340Var.g(yk4Var);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = new pxa(yk4Var);
                x340Var.s0(objT);
            }
            qim0Var2 = qim0Var;
            c((pxa) objT, str, qim0Var2, j3, x340Var, i3 & 8176, 0);
            str2 = str;
            j2 = j3;
        } else {
            qim0Var2 = qim0Var;
            str2 = str;
            x340Var.b0();
            j2 = j;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kl70(yk4Var, str2, qim0Var2, j2, i, i2);
        }
    }

    public static final void b(b180 b180Var, String str, qim0 qim0Var, long j, b0k b0kVar, int i, int i2) {
        int i3;
        String str2;
        long j2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-126890956);
        int i4 = (x340Var.g(b180Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i4 |= x340Var.g(str) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | 384;
        } else {
            i3 = i4 | (x340Var.g(qim0Var) ? 256 : 128);
        }
        int i6 = i3 | (((i2 & 8) == 0 && x340Var.f(j)) ? 2048 : 1024);
        if (x340Var.Y(i6 & 1, (i6 & 1171) != 1170)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                if (i5 != 0) {
                    qim0Var = nim0.a;
                }
                if ((i2 & 8) != 0) {
                    j = ((u7h) x340Var.k(wrl.a)).a;
                    i6 &= -7169;
                }
            } else {
                x340Var.b0();
                if ((i2 & 8) != 0) {
                    i6 &= -7169;
                }
            }
            qim0 qim0Var3 = qim0Var;
            long j3 = j;
            x340Var.s();
            str2 = str;
            c(byo1.s(b180Var, x340Var), str2, qim0Var3, j3, x340Var, (i6 & 112) | 8 | (i6 & 896) | (i6 & 7168), 0);
            qim0Var2 = qim0Var3;
            j2 = j3;
        } else {
            str2 = str;
            x340Var.b0();
            j2 = j;
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jl70(b180Var, str2, qim0Var2, j2, i, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:53:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x0099  */
    /* JADX WARN: Code duplicated, block: B:57:0x009e  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:87:0x010b  */
    /* JADX WARN: Code duplicated, block: B:90:0x0125  */
    /* JADX WARN: Code duplicated, block: B:94:0x0147  */
    /* JADX WARN: Code duplicated, block: B:96:0x0163  */
    /* JADX WARN: Code duplicated, block: B:99:0x016e  */
    public static final void c(jmr0 jmr0Var, String str, qim0 qim0Var, long j, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var2;
        long j2;
        boolean z;
        qim0 qim0Var3;
        long j3;
        h311 h311VarV;
        int i4;
        qim0 qim0Var4;
        int i5;
        boolean z2;
        Object objT;
        f2b f2bVarH;
        qim0 qim0VarB;
        long jI;
        boolean z3;
        Object objT2;
        int i6;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2142239481);
        if ((i & 6) == 0) {
            i3 = (x340Var.i(jmr0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.g(str) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 == 0) {
            if ((i & 384) == 0) {
                qim0Var2 = qim0Var;
                i3 |= x340Var.g(qim0Var2) ? 256 : 128;
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
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                x340Var.d0();
                i4 = i & 1;
                qim0Var4 = nim0.a;
                if (i4 != 0 || x340Var.E()) {
                    if (i7 != 0) {
                        qim0Var2 = qim0Var4;
                    }
                    if ((i2 & 8) != 0) {
                        j2 = ((u7h) x340Var.k(wrl.a)).a;
                        i3 &= -7169;
                    }
                } else {
                    x340Var.b0();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                }
                i5 = i3;
                qim0Var3 = qim0Var2;
                x340Var.s();
                z2 = (((i5 & 7168) ^ 3072) <= 2048 && x340Var.f(j2)) || (i5 & 3072) == 2048;
                objT = x340Var.T();
                if (z2 || objT == m4cVar) {
                    int i8 = u7h.l;
                    if (z4h1.b(j2, nfb.p())) {
                        f2bVarH = null;
                    } else {
                        f2bVarH = ejb.h(j2);
                    }
                    objT = f2bVarH;
                    x340Var.s0(objT);
                }
                ColorFilter colorFilter = (ColorFilter) objT;
                if (str != null) {
                    x340Var.i0(-536990979);
                    z3 = (i5 & 112) == 32;
                    objT2 = x340Var.T();
                    if (z3 || objT2 == m4cVar) {
                        objT2 = new jfa(str, (byte) 6);
                        x340Var.s0(objT2);
                    }
                    qim0VarB = s161.b(qim0Var4, false, (iu30) objT2);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-536832197);
                    x340Var.r(false);
                    qim0VarB = qim0Var4;
                }
                if (Size.c(jmr0Var.i(), 9205357640488583168L)) {
                    qim0Var4 = a;
                } else {
                    jI = jmr0Var.i();
                    if (Float.isInfinite(Float.intBitsToFloat((int) (jI >> 32))) && Float.isInfinite(Float.intBitsToFloat((int) (jI & 4294967295L)))) {
                        qim0Var4 = a;
                    }
                }
                t1c.a(xyn1.s(qim0Var3.then(qim0Var4), jmr0Var, (tl3) null, mif1.Q0, 0.0f, colorFilter, 22).then(qim0VarB), x340Var, 0);
                j3 = j2;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var2;
                j3 = j2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new hl70(jmr0Var, str, qim0Var3, j3, i, i2);
            }
        }
        i3 |= 384;
        qim0Var2 = qim0Var;
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
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i3 & 1, z)) {
            x340Var.d0();
            i4 = i & 1;
            qim0Var4 = nim0.a;
            if (i4 != 0) {
                if (i7 != 0) {
                    qim0Var2 = qim0Var4;
                }
                if ((i2 & 8) != 0) {
                    j2 = ((u7h) x340Var.k(wrl.a)).a;
                    i3 &= -7169;
                }
            } else {
                if (i7 != 0) {
                    qim0Var2 = qim0Var4;
                }
                if ((i2 & 8) != 0) {
                    j2 = ((u7h) x340Var.k(wrl.a)).a;
                    i3 &= -7169;
                }
            }
            i5 = i3;
            qim0Var3 = qim0Var2;
            x340Var.s();
            if (((i5 & 7168) ^ 3072) <= 2048) {
            }
            objT = x340Var.T();
            if (z2) {
                int i9 = u7h.l;
                if (z4h1.b(j2, nfb.p())) {
                    f2bVarH = null;
                } else {
                    f2bVarH = ejb.h(j2);
                }
                objT = f2bVarH;
                x340Var.s0(objT);
            } else {
                int i10 = u7h.l;
                if (z4h1.b(j2, nfb.p())) {
                    f2bVarH = null;
                } else {
                    f2bVarH = ejb.h(j2);
                }
                objT = f2bVarH;
                x340Var.s0(objT);
            }
            ColorFilter colorFilter2 = (ColorFilter) objT;
            if (str != null) {
                x340Var.i0(-536990979);
                if ((i5 & 112) == 32) {
                }
                objT2 = x340Var.T();
                if (z3) {
                    objT2 = new jfa(str, (byte) 6);
                    x340Var.s0(objT2);
                } else {
                    objT2 = new jfa(str, (byte) 6);
                    x340Var.s0(objT2);
                }
                qim0VarB = s161.b(qim0Var4, false, (iu30) objT2);
                x340Var.r(false);
            } else {
                x340Var.i0(-536832197);
                x340Var.r(false);
                qim0VarB = qim0Var4;
            }
            if (Size.c(jmr0Var.i(), 9205357640488583168L)) {
                jI = jmr0Var.i();
                if (Float.isInfinite(Float.intBitsToFloat((int) (jI >> 32)))) {
                    qim0Var4 = a;
                }
            } else {
                qim0Var4 = a;
            }
            t1c.a(xyn1.s(qim0Var3.then(qim0Var4), jmr0Var, (tl3) null, mif1.Q0, 0.0f, colorFilter2, 22).then(qim0VarB), x340Var, 0);
            j3 = j2;
        } else {
            x340Var.b0();
            qim0Var3 = qim0Var2;
            j3 = j2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hl70(jmr0Var, str, qim0Var3, j3, i, i2);
        }
    }
}

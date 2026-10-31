package p;

import android.view.KeyEvent;
import com.spotify.base.java.logging.Logger;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class n3p1 {
    public static b180 a;
    public static b180 b;

    /* JADX WARN: Code duplicated, block: B:100:0x011f  */
    /* JADX WARN: Code duplicated, block: B:103:0x0128  */
    /* JADX WARN: Code duplicated, block: B:105:0x012c  */
    /* JADX WARN: Code duplicated, block: B:107:0x012f  */
    /* JADX WARN: Code duplicated, block: B:108:0x0131  */
    /* JADX WARN: Code duplicated, block: B:111:0x0155  */
    /* JADX WARN: Code duplicated, block: B:113:0x015c  */
    /* JADX WARN: Code duplicated, block: B:114:0x0162  */
    /* JADX WARN: Code duplicated, block: B:117:0x0188  */
    /* JADX WARN: Code duplicated, block: B:120:0x0198  */
    /* JADX WARN: Code duplicated, block: B:121:0x019b  */
    /* JADX WARN: Code duplicated, block: B:124:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:127:0x020c  */
    /* JADX WARN: Code duplicated, block: B:128:0x020e  */
    /* JADX WARN: Code duplicated, block: B:132:0x0218  */
    /* JADX WARN: Code duplicated, block: B:135:0x022d  */
    /* JADX WARN: Code duplicated, block: B:136:0x022f  */
    /* JADX WARN: Code duplicated, block: B:140:0x023d  */
    /* JADX WARN: Code duplicated, block: B:143:0x0257  */
    /* JADX WARN: Code duplicated, block: B:144:0x0259  */
    /* JADX WARN: Code duplicated, block: B:150:0x0268  */
    /* JADX WARN: Code duplicated, block: B:153:0x0283  */
    /* JADX WARN: Code duplicated, block: B:154:0x0286  */
    /* JADX WARN: Code duplicated, block: B:160:0x0297  */
    /* JADX WARN: Code duplicated, block: B:162:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:164:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:167:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:169:? A[RETURN, SYNTHETIC] */
    public static final void a(String str, String str2, String str3, boolean z, boolean z2, float f, iu30 iu30Var, iu30 iu30Var2, Function0 function0, Function0 function1, qim0 qim0Var, boolean z3, b0k b0kVar, int i, int i2, int i3) {
        int i4;
        qim0 qim0Var2;
        int i5;
        boolean z4;
        Function0 function2;
        boolean z5;
        h311 h311VarV;
        qim0 qim0Var3;
        mbh mbhVarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        Object objT;
        m4c m4cVar;
        int i6;
        Object objT2;
        drr0 drr0Var;
        boolean z6;
        boolean z7;
        Object objT3;
        boolean z8;
        boolean zI;
        Object objT4;
        boolean z9;
        boolean z10;
        Object objT5;
        boolean z11;
        boolean z12;
        Object objT6;
        boolean z13;
        Function0 function3 = function1;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(56212627);
        if ((i & 6) == 0) {
            i4 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= x340Var.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= x340Var.g(str3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= x340Var.h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= x340Var.h(z2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= x340Var.d(f) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= x340Var.i(iu30Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i4 |= x340Var.i(iu30Var2) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i4 |= x340Var.i(function0) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i4 |= x340Var.i(function3) ? 536870912 : 268435456;
        }
        int i7 = i3 & 1024;
        if (i7 != 0) {
            i5 = i2 | 6;
            qim0Var2 = qim0Var;
        } else {
            qim0Var2 = qim0Var;
            if ((i2 & 6) == 0) {
                i5 = i2 | (x340Var.i(qim0Var2) ? 4 : 2);
            } else {
                i5 = i2;
            }
        }
        int i8 = i4;
        int i9 = i3 & 2048;
        if (i9 == 0) {
            if ((i2 & 48) == 0) {
                i5 |= x340Var.h(z3) ? 32 : 16;
            }
            if ((i8 & 306783379) == 306783378 || (i5 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (x340Var.Y(i8 & 1, z4)) {
                qim0Var3 = nim0.a;
                if (i7 != 0) {
                    qim0Var2 = qim0Var3;
                }
                if (i9 != 0) {
                    z5 = false;
                } else {
                    z5 = z3;
                }
                mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0Var2);
                hzj.A.getClass();
                if (x340Var.a != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(hmb0.t1);
                } else {
                    x340Var.v0();
                }
                nko1.H(mbhVarA, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                objT = x340Var.T();
                m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = fr9.i;
                    x340Var.s0(objT);
                }
                qim0 qim0VarB = s161.b(qim0Var3, true, (iu30) objT);
                if (z2) {
                    i6 = 2;
                } else {
                    i6 = 1;
                }
                jto1.b(qim0VarB, new uvx(0, (pgx) null, 0, (vzq0) null, (zzq0) null, (tvx) null, (hw61) null, i6, (p3v) null, 383), null, false, null, null, null, null, null, apo.r(-1834383950, new gt9(z5, z2, str), x340Var), null, apo.r(116458705, new c2(z5, str3, (byte) 1), x340Var), null, null, null, apo.r(1213539149, new gt9(z5, str2, z), x340Var), x340Var, 805306432, 196656, 30204);
                objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    objT2 = us71.i(f, x340Var);
                }
                drr0Var = (drr0) objT2;
                float fS = drr0Var.s();
                boolean zI2 = x340Var.i(drr0Var);
                if ((i8 & 3670016) == 1048576) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                z7 = zI2 | z6;
                objT3 = x340Var.T();
                if (z7 || objT3 == m4cVar) {
                    objT3 = new ht9(drr0Var, iu30Var, (byte) 0);
                    x340Var.s0(objT3);
                }
                iu30 iu30Var3 = (iu30) objT3;
                if ((i8 & 29360128) == 8388608) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                zI = z8 | x340Var.i(drr0Var);
                objT4 = x340Var.T();
                if (zI || objT4 == m4cVar) {
                    objT4 = new z77(iu30Var2, drr0Var, (byte) 18);
                    x340Var.s0(objT4);
                }
                Function0 function4 = (Function0) objT4;
                boolean zI3 = x340Var.i(drr0Var);
                if ((i8 & 234881024) == 67108864) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                z10 = zI3 | z9;
                objT5 = x340Var.T();
                if (!z10 || objT5 == m4cVar) {
                    function2 = function0;
                    objT5 = new it9(drr0Var, function2, (byte) 0);
                    x340Var.s0(objT5);
                } else {
                    function2 = function0;
                }
                Function0 function5 = (Function0) objT5;
                boolean zI4 = x340Var.i(drr0Var);
                if ((i8 & 1879048192) == 536870912) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = zI4 | z11;
                objT6 = x340Var.T();
                if (!z12 || objT6 == m4cVar) {
                    function3 = function1;
                    z13 = true;
                    objT6 = new it9(drr0Var, function3, (byte) 1);
                    x340Var.s0(objT6);
                } else {
                    function3 = function1;
                    z13 = true;
                }
                g(fS, iu30Var3, function4, function5, (Function0) objT6, null, !z5, x340Var, 0);
                x340Var.r(z13);
            } else {
                function2 = function0;
                x340Var.b0();
                z5 = z3;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new jt9(str, str2, str3, z, z2, f, iu30Var, iu30Var2, function2, function3, qim0Var2, z5, i, i2, i3);
            }
        }
        i5 |= 48;
        if ((i8 & 306783379) == 306783378) {
            z4 = true;
        } else {
            z4 = true;
        }
        if (x340Var.Y(i8 & 1, z4)) {
            qim0Var3 = nim0.a;
            if (i7 != 0) {
                qim0Var2 = qim0Var3;
            }
            if (i9 != 0) {
                z5 = false;
            } else {
                z5 = z3;
            }
            mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            iHashCode = Long.hashCode(x340Var.T);
            xos0VarM = x340Var.m();
            qim0VarE = zr7.E(x340Var, qim0Var2);
            hzj.A.getClass();
            if (x340Var.a != null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            objT = x340Var.T();
            m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = fr9.i;
                x340Var.s0(objT);
            }
            qim0 qim0VarB2 = s161.b(qim0Var3, true, (iu30) objT);
            if (z2) {
                i6 = 2;
            } else {
                i6 = 1;
            }
            jto1.b(qim0VarB2, new uvx(0, (pgx) null, 0, (vzq0) null, (zzq0) null, (tvx) null, (hw61) null, i6, (p3v) null, 383), null, false, null, null, null, null, null, apo.r(-1834383950, new gt9(z5, z2, str), x340Var), null, apo.r(116458705, new c2(z5, str3, (byte) 1), x340Var), null, null, null, apo.r(1213539149, new gt9(z5, str2, z), x340Var), x340Var, 805306432, 196656, 30204);
            objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = us71.i(f, x340Var);
            }
            drr0Var = (drr0) objT2;
            float fS2 = drr0Var.s();
            boolean zI5 = x340Var.i(drr0Var);
            if ((i8 & 3670016) == 1048576) {
                z6 = true;
            } else {
                z6 = false;
            }
            z7 = zI5 | z6;
            objT3 = x340Var.T();
            if (z7) {
                objT3 = new ht9(drr0Var, iu30Var, (byte) 0);
                x340Var.s0(objT3);
            } else {
                objT3 = new ht9(drr0Var, iu30Var, (byte) 0);
                x340Var.s0(objT3);
            }
            iu30 iu30Var4 = (iu30) objT3;
            if ((i8 & 29360128) == 8388608) {
                z8 = true;
            } else {
                z8 = false;
            }
            zI = z8 | x340Var.i(drr0Var);
            objT4 = x340Var.T();
            if (zI) {
                objT4 = new z77(iu30Var2, drr0Var, (byte) 18);
                x340Var.s0(objT4);
            } else {
                objT4 = new z77(iu30Var2, drr0Var, (byte) 18);
                x340Var.s0(objT4);
            }
            Function0 function6 = (Function0) objT4;
            boolean zI6 = x340Var.i(drr0Var);
            if ((i8 & 234881024) == 67108864) {
                z9 = true;
            } else {
                z9 = false;
            }
            z10 = zI6 | z9;
            objT5 = x340Var.T();
            if (z10) {
                function2 = function0;
                objT5 = new it9(drr0Var, function2, (byte) 0);
                x340Var.s0(objT5);
            } else {
                function2 = function0;
                objT5 = new it9(drr0Var, function2, (byte) 0);
                x340Var.s0(objT5);
            }
            Function0 function7 = (Function0) objT5;
            boolean zI7 = x340Var.i(drr0Var);
            if ((i8 & 1879048192) == 536870912) {
                z11 = true;
            } else {
                z11 = false;
            }
            z12 = zI7 | z11;
            objT6 = x340Var.T();
            if (z12) {
                function3 = function1;
                z13 = true;
                objT6 = new it9(drr0Var, function3, (byte) 1);
                x340Var.s0(objT6);
            } else {
                function3 = function1;
                z13 = true;
                objT6 = new it9(drr0Var, function3, (byte) 1);
                x340Var.s0(objT6);
            }
            g(fS2, iu30Var4, function6, function7, (Function0) objT6, null, !z5, x340Var, 0);
            x340Var.r(z13);
        } else {
            function2 = function0;
            x340Var.b0();
            z5 = z3;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jt9(str, str2, str3, z, z2, f, iu30Var, iu30Var2, function2, function3, qim0Var2, z5, i, i2, i3);
        }
    }

    public static final void b(int i, b0k b0kVar, qim0 qim0Var, boolean z) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(889377870);
        if ((i & 6) == 0) {
            i2 = (x340Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = fr9.t;
                x340Var.s0(objT);
            }
            iu30 iu30Var = (iu30) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = fr9.X;
                x340Var.s0(objT2);
            }
            iu30 iu30Var2 = (iu30) objT2;
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = vc7.d1;
                x340Var.s0(objT3);
            }
            Function0 function0 = (Function0) objT3;
            Object objT4 = x340Var.T();
            if (objT4 == m4cVar) {
                objT4 = vc7.e1;
                x340Var.s0(objT4);
            }
            qim0Var2 = nim0.a;
            a(null, "", "", false, z, 0.0f, iu30Var, iu30Var2, function0, (Function0) objT4, qim0Var2, true, x340Var, ((i3 << 12) & 57344) | 920325558, 54, 0);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kt9(z, qim0Var2, i, (byte) 0);
        }
    }

    public static final void c(lee1 lee1Var, float f, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(354792945);
        int i2 = i | (x340Var.i(lee1Var) ? 4 : 2);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            cjc0 cjc0Var = new cjc0(1);
            qim0 qim0VarF = u291.f(nim0.a, f);
            uwr uwrVar = cbx.a;
            long jA = cbx.a(x340Var).a.b.a();
            cua cuaVar = cbx.b(x340Var).f;
            uwo1.e("", cwl1.l0(dug.f(qim0VarF, jA, er31.b(4.0f)), 0L, (hw61) null, 15), lee1Var, 0L, null, null, 0, false, cjc0Var, 0, null, x340Var, ((i2 << 6) & 896) | 6, 0, 1784);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lt9(lee1Var, f, i, (byte) 0);
        }
    }

    public static final void d(ihh1 ihh1Var, boolean z, boolean z2, Function0 function0, Function0 function1, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1113217952);
        int i3 = i & 6;
        h2c h2cVar = h2c.a;
        if (i3 == 0) {
            i2 = (x340Var.g(h2cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.e(ihh1Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.h(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.i(function1) ? 131072 : 65536;
        }
        if (!x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            x340Var.b0();
        } else if (ihh1Var != ihh1.b) {
            x340Var.i0(1861790047);
            fq7.g(ihh1Var == ihh1.c, h2cVar.a(nim0.a, een.e), xay.e(2, irn1.o0(150, 0, null, 6)), xay.f(2, irn1.o0(150, 0, null, 6)), (String) null, apo.r(-1825621741, new gb7(z, z2, (Object) function0, (Object) function1, (byte) 3), x340Var), x340Var, 200064, 16);
            x340Var.r(false);
        } else {
            x340Var.i0(1862192706);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bmg(ihh1Var, z, z2, function0, function1, i, (byte) 2);
        }
    }

    public static final void e(an11 an11Var, j2i j2iVar, iu30 iu30Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(250537543);
        int i2 = (b0kVar3.i(an11Var) ? 4 : 2) | i | (b0kVar3.i(iu30Var) ? 256 : 128);
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            ydx ydxVar = new ydx(0.0f, 0.0f, 0.0f, new zzq0(0.0f, 0.0f, 0.0f, 0.0f));
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            boolean z = (i2 & 896) == 256;
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new fr01(iu30Var, (byte) 29);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            ioo1.c(qim0VarF, null, ydxVar, null, null, null, null, new gbx(z50.c, (Function0) objT), null, apo.r(-1561558142, new hov0(an11Var, j2iVar, (byte) 29), b0kVar3), null, null, null, null, null, null, ucj.a, b0kVar2, 805306880, 1572864, 64890);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new hl11(an11Var, j2iVar, iu30Var, i);
        }
    }

    public static final void f(os71 os71Var, Function0 function0, ls71 ls71Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        Function0 function1;
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1822335911);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(os71Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            function1 = function0;
            i2 |= b0kVar3.i(function1) ? 32 : 16;
        } else {
            function1 = function0;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(ls71Var) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (b0kVar3.Y(i3 & 1, (i3 & 1171) != 1170)) {
            b0kVar2 = b0kVar3;
            x74.f(function1, (scx) null, (mfx) null, false, false, 0.0f, false, (Boolean) null, false, false, (vu30) null, apo.r(-213912026, new nu31(os71Var.b, ls71Var, os71Var), b0kVar3), b0kVar2, ((i3 >> 3) & 14) | 24576, 48, 2030);
            qim0Var2 = nim0.a;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new nk31(i, os71Var, function0, ls71Var, qim0Var2, (byte) 13);
        }
    }

    public static final void g(float f, iu30 iu30Var, Function0 function0, Function0 function1, Function0 function2, qim0 qim0Var, boolean z, b0k b0kVar, int i) {
        qim0 qim0Var2;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(1538860467);
        int i2 = i | (b0kVar2.d(f) ? 4 : 2) | (b0kVar2.i(iu30Var) ? 32 : 16) | (b0kVar2.i(function0) ? 256 : 128) | (b0kVar2.i(function1) ? 2048 : 1024) | (b0kVar2.i(function2) ? 16384 : 8192) | 196608 | (b0kVar2.h(z) ? 1048576 : 524288);
        if (b0kVar2.Y(i2 & 1, (599187 & i2) != 599186)) {
            fra fraVar = een.N0;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            jw31 jw31VarA = ew31.a(h36.a, fraVar, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarF);
            hzj.A.getClass();
            if (((x340) b0kVar2).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(hmb0.t1);
            } else {
                b0kVar2.v0();
            }
            nko1.H(jw31VarA, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE, b0kVar2, y580.Y);
            bux buxVar = bux.c;
            jsl jslVar = new jsl(cwl1.o0(b0kVar2, 2131953081));
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(b0kVar2).g;
            w0h1.a(buxVar, jslVar, bin.x(u291.r(qim0Var3, 24.0f), z && f > 0.0f, null, null, null, function1, 14), cbx.a(b0kVar2).c.b, 0L, false, b0kVar2, bux.d, 48);
            wnb0 wnb0Var = new wnb0(1.0f, true);
            cvx cvxVar = cbx.b(b0kVar2).b;
            luo1.e(f, iu30Var, uyn1.z(8.0f, 0.0f, 2, wnb0Var), z, null, 0, function0, 0L, 0L, null, 0L, 0L, 0L, b0kVar2, (i2 & 126) | ((i2 >> 9) & 7168) | ((i2 << 12) & 3670016), 8112);
            b0kVar2 = b0kVar2;
            ztx ztxVar = ztx.c;
            jsl jslVar2 = new jsl(cwl1.o0(b0kVar2, 2131953080));
            zov0 zov0Var2 = cbx.b(b0kVar2).g;
            w0h1.a(ztxVar, jslVar2, bin.x(u291.r(qim0Var3, 24.0f), z && f < 1.0f, null, null, null, function2, 14), cbx.a(b0kVar2).c.b, 0L, false, b0kVar2, ztx.d, 48);
            b0kVar2.r(true);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new mt9(f, iu30Var, function0, function1, function2, qim0Var2, z, i);
        }
    }

    public static final up60 h(x4e0 x4e0Var) {
        int iOrdinal = x4e0Var.ordinal();
        if (iOrdinal == 0) {
            return new up60(2);
        }
        if (iOrdinal == 1) {
            return new up60(1);
        }
        if (iOrdinal == 2 || iOrdinal == 3) {
            return null;
        }
        eg.o();
        return null;
    }

    public static void i(Object obj, Object obj2) {
        if (obj == null) {
            bhn0.i(gvg.g(obj2, "null key in entry: null="));
        } else {
            if (obj2 != null) {
                return;
            }
            bhn0.i(cy30.m("null value in entry: ", obj, "=null"));
        }
    }

    public static void j(int i, String str) {
        if (i >= 0) {
            return;
        }
        hhg1.n(l1d.k(i, str, " cannot be negative but was: "));
    }

    public static void k(o2r o2rVar) {
        if (o2rVar != null) {
            try {
                o2rVar.close();
            } catch (IOException unused) {
            }
        }
    }

    public static final List l(String str) {
        String strB;
        String strB2;
        Integer numJ;
        int length = str.length();
        z6x z6xVar = z6x.a;
        if (length == 0) {
            Logger.d("Media manifest is empty", new Object[0]);
            return z6xVar;
        }
        try {
            pfa0 pfa0VarK = fga0.k(nfa0.d.c(str));
            List list = pfa0VarK.a;
            if (list.isEmpty()) {
                Logger.d("Media manifest is empty", new Object[0]);
                return z6xVar;
            }
            ArrayList arrayList = new ArrayList(q7h.U(pfa0VarK, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                uga0 uga0VarL = fga0.l((ega0) it.next());
                ega0 ega0Var = (ega0) uga0VarL.get("url");
                String str2 = null;
                String strB3 = ega0Var != null ? fga0.m(ega0Var).b() : null;
                ega0 ega0Var2 = (ega0) uga0VarL.get("bitrate");
                int iIntValue = (ega0Var2 == null || (numJ = fga0.j(fga0.m(ega0Var2))) == null) ? -1 : numJ.intValue();
                ega0 ega0Var3 = (ega0) uga0VarL.get("encryption");
                if (ega0Var3 == null || (strB = fga0.m(ega0Var3).b()) == null || strB.length() == 0) {
                    strB = null;
                }
                ega0 ega0Var4 = (ega0) uga0VarL.get("mimeType");
                if (ega0Var4 != null && (strB2 = fga0.m(ega0Var4).b()) != null && strB2.length() != 0) {
                    str2 = strB2;
                }
                arrayList.add(new pqj1(strB3, strB, iIntValue, str2));
            }
            return arrayList;
        } catch (IllegalArgumentException unused) {
            Logger.d("Error parsing media manifest", new Object[0]);
            return z6xVar;
        }
    }

    public static x180 m() {
        return x180.g;
    }

    public static final boolean n(KeyEvent keyEvent) {
        return keyEvent.getAction() == 0 && !Character.isISOControl(keyEvent.getUnicodeChar());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:34:0x004f A[RETURN] */
    public static final int o(String str) {
        switch (str.hashCode()) {
            case -1821966572:
                if (str.equals("npv_martini_chat")) {
                    return 5;
                }
                return 2;
            case -1038716495:
                if (str.equals("npv_dj")) {
                    return 4;
                }
                return 2;
            case 78687603:
                if (str.equals("search_crossword")) {
                    return 8;
                }
                return 2;
            case 219431106:
                if (str.equals("new_conversation")) {
                    return 3;
                }
                return 2;
            case 937185458:
                if (str.equals("genpods_prompt_chat")) {
                    return 1;
                }
                return 2;
            case 1092705254:
                str.equals("home_dj");
                return 2;
            case 1281789100:
                if (str.equals("npv_see_more")) {
                    return 7;
                }
                return 2;
            default:
                return 2;
        }
    }

    public static final String p(long j) {
        ytw0 ytw0Var = jfv.b;
        long jL0 = fdg1.l0(Math.max(0L, j), ngv.d);
        ngv ngvVar = ngv.g;
        long jU = jfv.u(jL0, ngvVar);
        long jP = jfv.p(jL0, fdg1.l0(jU, ngvVar));
        ngv ngvVar2 = ngv.f;
        long jU2 = jfv.u(jP, ngvVar2);
        long jU3 = jfv.u(jfv.p(jfv.p(jL0, fdg1.l0(jU, ngvVar)), fdg1.l0(jU2, ngvVar2)), ngv.e);
        return jU == 0 ? String.format(Locale.US, "%d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(jU2), Long.valueOf(jU3)}, 2)) : String.format(Locale.US, "%d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(jU), Long.valueOf(jU2), Long.valueOf(jU3)}, 3));
    }

    public static final String q(clj1 clj1Var) {
        String str = clj1Var.a;
        int iC = l1d.C(clj1Var.b);
        if (iC == 0) {
            return str;
        }
        if (iC == 1) {
            return wqn1.n(str);
        }
        eg.o();
        return null;
    }
}

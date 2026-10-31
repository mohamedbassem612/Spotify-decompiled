package p;

import android.net.Uri;
import android.widget.FrameLayout;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.ColorFilter;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class k2g1 {
    public static final nux a;
    public static final bby b;
    public static final ln00 c;

    static {
        ltx ltxVar = ltx.c;
        a = new nux(ltxVar, ltxVar);
        b = xay.d(irn1.o0(400, 0, mlv.b, 2), (fra) null, 14);
        c = xay.l(14, irn1.o0(400, 0, mlv.c, 2));
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0047  */
    /* JADX WARN: Code duplicated, block: B:22:0x004a  */
    /* JADX WARN: Code duplicated, block: B:26:0x0057  */
    /* JADX WARN: Code duplicated, block: B:27:0x0059  */
    /* JADX WARN: Code duplicated, block: B:30:0x0062  */
    /* JADX WARN: Code duplicated, block: B:32:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x007f A[PHI: r3 r4
      0x007f: PHI (r3v21 int) = (r3v9 int), (r3v23 int), (r3v24 int) binds: [B:46:0x0097, B:39:0x007b, B:40:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x007f: PHI (r4v21 float) = (r4v9 float), (r4v6 float), (r4v6 float) binds: [B:46:0x0097, B:39:0x007b, B:40:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x0084  */
    /* JADX WARN: Code duplicated, block: B:44:0x008a  */
    /* JADX WARN: Code duplicated, block: B:47:0x0099  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:56:0x0118  */
    /* JADX WARN: Code duplicated, block: B:57:0x014d  */
    /* JADX WARN: Code duplicated, block: B:59:0x0179  */
    /* JADX WARN: Code duplicated, block: B:60:0x017d  */
    /* JADX WARN: Code duplicated, block: B:63:0x01be  */
    /* JADX WARN: Code duplicated, block: B:65:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    public static final void a(Uri uri, qim0 qim0Var, float f, float f2, b0k b0kVar, int i, int i2) {
        float f3;
        float f4;
        int i3;
        boolean z;
        float f5;
        float f6;
        h311 h311VarV;
        float f7;
        int i4;
        float f8;
        cr31 cr31VarB;
        gfh0 gfh0VarC;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        boolean z2;
        n4k n4kVar;
        llj lljVar;
        llj lljVar2;
        llj lljVar3;
        llj lljVar4;
        nim0 nim0Var;
        isl islVar;
        h2c h2cVar;
        float f9;
        boolean z3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1679770638);
        j06 j06Var = x340Var.a;
        int i5 = i | (x340Var.g(uri) ? 4 : 2) | (x340Var.i(qim0Var) ? 32 : 16);
        if ((i2 & 4) == 0) {
            f3 = f;
            int i6 = x340Var.d(f3) ? 256 : 128;
            int i7 = i5 | i6;
            if ((i2 & 8) == 0) {
                f4 = f2;
                int i8 = x340Var.d(f4) ? 2048 : 1024;
                i3 = i7 | i8;
                if ((i3 & 1171) != 1170) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var.Y(i3 & 1, z)) {
                    x340Var.d0();
                    if ((i & 1) != 0 || x340Var.E()) {
                        if ((i2 & 4) != 0) {
                            uwr uwrVar = cbx.a;
                            cua cuaVar = cbx.b(x340Var).f;
                            i3 &= -897;
                            f3 = 2.0f;
                        }
                        if ((i2 & 8) != 0) {
                            uwr uwrVar2 = cbx.a;
                            avw0 avw0Var = cbx.b(x340Var).c;
                            f7 = f3;
                            i4 = i3 & (-7169);
                            f8 = 2.0f;
                        }
                        x340Var.s();
                        cr31VarB = er31.b(f7);
                        qim0 qim0VarQ = i1p1.q(qim0Var, cr31VarB);
                        uwr uwrVar3 = cbx.a;
                        qim0 qim0VarX = uyn1.x(dug.f(qim0VarQ, cbx.a(x340Var).a.a.a(), d4o1.a), f8);
                        gfh0VarC = t1c.c(een.d, false);
                        iHashCode = Long.hashCode(x340Var.T);
                        xos0VarM = x340Var.m();
                        qim0VarE = zr7.E(x340Var, qim0VarX);
                        hzj.A.getClass();
                        if (j06Var == null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var.m0();
                        z2 = x340Var.S;
                        n4kVar = hmb0.t1;
                        if (z2) {
                            x340Var.l(n4kVar);
                        } else {
                            x340Var.v0();
                        }
                        lljVar = y580.O0;
                        nko1.H(gfh0VarC, x340Var, lljVar);
                        lljVar2 = y580.N0;
                        nko1.H(xos0VarM, x340Var, lljVar2);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        lljVar3 = y580.R0;
                        nko1.H(numValueOf, x340Var, lljVar3);
                        nko1.F(x340Var);
                        lljVar4 = y580.Y;
                        nko1.H(qim0VarE, x340Var, lljVar4);
                        nim0Var = nim0.a;
                        islVar = isl.a;
                        h2cVar = h2c.a;
                        if (uri != null) {
                            x340Var.i0(233387971);
                            f9 = f8;
                            eso1.e(uri, islVar, i1p1.q(h2cVar.b(nim0Var), cr31VarB), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, a, false, false, x340Var, (i4 & 14) | 1073741872, 0, 3576);
                            x340Var.r(false);
                            z3 = true;
                        } else {
                            f9 = f8;
                            x340Var.i0(233601933);
                            qim0 qim0VarQ2 = i1p1.q(h2cVar.b(nim0Var), cr31VarB);
                            gfh0 gfh0VarC2 = t1c.c(een.h, false);
                            int iHashCode2 = Long.hashCode(x340Var.T);
                            xos0 xos0VarM2 = x340Var.m();
                            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarQ2);
                            x340Var.m0();
                            if (x340Var.S) {
                                x340Var.l(n4kVar);
                            } else {
                                x340Var.v0();
                            }
                            nko1.H(gfh0VarC2, x340Var, lljVar);
                            nko1.H(xos0VarM2, x340Var, lljVar2);
                            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
                            nko1.H(qim0VarE2, x340Var, lljVar4);
                            ltx ltxVar = ltx.c;
                            zov0 zov0Var = cbx.b(x340Var).g;
                            w0h1.a(ltxVar, islVar, u291.r(nim0Var, 16.0f), cbx.a(x340Var).b.b, 0L, false, x340Var, ltx.d | 48, 48);
                            z3 = true;
                            x340Var.r(true);
                            x340Var.r(false);
                        }
                        x340Var.r(z3);
                        f5 = f7;
                        f6 = f9;
                    } else {
                        x340Var.b0();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                    }
                    f7 = f3;
                    i4 = i3;
                    f8 = f4;
                    x340Var.s();
                    cr31VarB = er31.b(f7);
                    qim0 qim0VarQ3 = i1p1.q(qim0Var, cr31VarB);
                    uwr uwrVar4 = cbx.a;
                    qim0 qim0VarX2 = uyn1.x(dug.f(qim0VarQ3, cbx.a(x340Var).a.a.a(), d4o1.a), f8);
                    gfh0VarC = t1c.c(een.d, false);
                    iHashCode = Long.hashCode(x340Var.T);
                    xos0VarM = x340Var.m();
                    qim0VarE = zr7.E(x340Var, qim0VarX2);
                    hzj.A.getClass();
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    z2 = x340Var.S;
                    n4kVar = hmb0.t1;
                    if (z2) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    lljVar = y580.O0;
                    nko1.H(gfh0VarC, x340Var, lljVar);
                    lljVar2 = y580.N0;
                    nko1.H(xos0VarM, x340Var, lljVar2);
                    Integer numValueOf2 = Integer.valueOf(iHashCode);
                    lljVar3 = y580.R0;
                    nko1.H(numValueOf2, x340Var, lljVar3);
                    nko1.F(x340Var);
                    lljVar4 = y580.Y;
                    nko1.H(qim0VarE, x340Var, lljVar4);
                    nim0Var = nim0.a;
                    islVar = isl.a;
                    h2cVar = h2c.a;
                    if (uri != null) {
                        x340Var.i0(233387971);
                        f9 = f8;
                        eso1.e(uri, islVar, i1p1.q(h2cVar.b(nim0Var), cr31VarB), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, a, false, false, x340Var, (i4 & 14) | 1073741872, 0, 3576);
                        x340Var.r(false);
                        z3 = true;
                    } else {
                        f9 = f8;
                        x340Var.i0(233601933);
                        qim0 qim0VarQ4 = i1p1.q(h2cVar.b(nim0Var), cr31VarB);
                        gfh0 gfh0VarC3 = t1c.c(een.h, false);
                        int iHashCode3 = Long.hashCode(x340Var.T);
                        xos0 xos0VarM3 = x340Var.m();
                        qim0 qim0VarE3 = zr7.E(x340Var, qim0VarQ4);
                        x340Var.m0();
                        if (x340Var.S) {
                            x340Var.l(n4kVar);
                        } else {
                            x340Var.v0();
                        }
                        nko1.H(gfh0VarC3, x340Var, lljVar);
                        nko1.H(xos0VarM3, x340Var, lljVar2);
                        x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
                        nko1.H(qim0VarE3, x340Var, lljVar4);
                        ltx ltxVar2 = ltx.c;
                        zov0 zov0Var2 = cbx.b(x340Var).g;
                        w0h1.a(ltxVar2, islVar, u291.r(nim0Var, 16.0f), cbx.a(x340Var).b.b, 0L, false, x340Var, ltx.d | 48, 48);
                        z3 = true;
                        x340Var.r(true);
                        x340Var.r(false);
                    }
                    x340Var.r(z3);
                    f5 = f7;
                    f6 = f9;
                } else {
                    x340Var.b0();
                    f5 = f3;
                    f6 = f4;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new ff60(uri, qim0Var, f5, f6, i, i2);
                }
            }
            f4 = f2;
            i3 = i7 | i8;
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                x340Var.d0();
                if ((i & 1) != 0) {
                    if ((i2 & 4) != 0) {
                        uwr uwrVar5 = cbx.a;
                        cua cuaVar2 = cbx.b(x340Var).f;
                        i3 &= -897;
                        f3 = 2.0f;
                    }
                    if ((i2 & 8) != 0) {
                        uwr uwrVar6 = cbx.a;
                        avw0 avw0Var2 = cbx.b(x340Var).c;
                        f7 = f3;
                        i4 = i3 & (-7169);
                        f8 = 2.0f;
                    } else {
                        f7 = f3;
                        i4 = i3;
                        f8 = f4;
                    }
                } else {
                    if ((i2 & 4) != 0) {
                        uwr uwrVar7 = cbx.a;
                        cua cuaVar3 = cbx.b(x340Var).f;
                        i3 &= -897;
                        f3 = 2.0f;
                    }
                    if ((i2 & 8) != 0) {
                        uwr uwrVar8 = cbx.a;
                        avw0 avw0Var3 = cbx.b(x340Var).c;
                        f7 = f3;
                        i4 = i3 & (-7169);
                        f8 = 2.0f;
                    } else {
                        f7 = f3;
                        i4 = i3;
                        f8 = f4;
                    }
                }
                x340Var.s();
                cr31VarB = er31.b(f7);
                qim0 qim0VarQ5 = i1p1.q(qim0Var, cr31VarB);
                uwr uwrVar9 = cbx.a;
                qim0 qim0VarX3 = uyn1.x(dug.f(qim0VarQ5, cbx.a(x340Var).a.a.a(), d4o1.a), f8);
                gfh0VarC = t1c.c(een.d, false);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarX3);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                z2 = x340Var.S;
                n4kVar = hmb0.t1;
                if (z2) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                lljVar = y580.O0;
                nko1.H(gfh0VarC, x340Var, lljVar);
                lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var, lljVar2);
                Integer numValueOf3 = Integer.valueOf(iHashCode);
                lljVar3 = y580.R0;
                nko1.H(numValueOf3, x340Var, lljVar3);
                nko1.F(x340Var);
                lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var, lljVar4);
                nim0Var = nim0.a;
                islVar = isl.a;
                h2cVar = h2c.a;
                if (uri != null) {
                    x340Var.i0(233387971);
                    f9 = f8;
                    eso1.e(uri, islVar, i1p1.q(h2cVar.b(nim0Var), cr31VarB), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, a, false, false, x340Var, (i4 & 14) | 1073741872, 0, 3576);
                    x340Var.r(false);
                    z3 = true;
                } else {
                    f9 = f8;
                    x340Var.i0(233601933);
                    qim0 qim0VarQ6 = i1p1.q(h2cVar.b(nim0Var), cr31VarB);
                    gfh0 gfh0VarC4 = t1c.c(een.h, false);
                    int iHashCode4 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM4 = x340Var.m();
                    qim0 qim0VarE4 = zr7.E(x340Var, qim0VarQ6);
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC4, x340Var, lljVar);
                    nko1.H(xos0VarM4, x340Var, lljVar2);
                    x0d.q(iHashCode4, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE4, x340Var, lljVar4);
                    ltx ltxVar3 = ltx.c;
                    zov0 zov0Var3 = cbx.b(x340Var).g;
                    w0h1.a(ltxVar3, islVar, u291.r(nim0Var, 16.0f), cbx.a(x340Var).b.b, 0L, false, x340Var, ltx.d | 48, 48);
                    z3 = true;
                    x340Var.r(true);
                    x340Var.r(false);
                }
                x340Var.r(z3);
                f5 = f7;
                f6 = f9;
            } else {
                x340Var.b0();
                f5 = f3;
                f6 = f4;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new ff60(uri, qim0Var, f5, f6, i, i2);
            }
        }
        f3 = f;
        int i9 = i5 | i6;
        if ((i2 & 8) == 0) {
            f4 = f2;
            if (x340Var.d(f4)) {
            }
            i3 = i9 | i8;
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                x340Var.d0();
                if ((i & 1) != 0) {
                    if ((i2 & 4) != 0) {
                        uwr uwrVar10 = cbx.a;
                        cua cuaVar4 = cbx.b(x340Var).f;
                        i3 &= -897;
                        f3 = 2.0f;
                    }
                    if ((i2 & 8) != 0) {
                        uwr uwrVar11 = cbx.a;
                        avw0 avw0Var4 = cbx.b(x340Var).c;
                        f7 = f3;
                        i4 = i3 & (-7169);
                        f8 = 2.0f;
                    } else {
                        f7 = f3;
                        i4 = i3;
                        f8 = f4;
                    }
                } else {
                    if ((i2 & 4) != 0) {
                        uwr uwrVar12 = cbx.a;
                        cua cuaVar5 = cbx.b(x340Var).f;
                        i3 &= -897;
                        f3 = 2.0f;
                    }
                    if ((i2 & 8) != 0) {
                        uwr uwrVar13 = cbx.a;
                        avw0 avw0Var5 = cbx.b(x340Var).c;
                        f7 = f3;
                        i4 = i3 & (-7169);
                        f8 = 2.0f;
                    } else {
                        f7 = f3;
                        i4 = i3;
                        f8 = f4;
                    }
                }
                x340Var.s();
                cr31VarB = er31.b(f7);
                qim0 qim0VarQ7 = i1p1.q(qim0Var, cr31VarB);
                uwr uwrVar14 = cbx.a;
                qim0 qim0VarX4 = uyn1.x(dug.f(qim0VarQ7, cbx.a(x340Var).a.a.a(), d4o1.a), f8);
                gfh0VarC = t1c.c(een.d, false);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarX4);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                z2 = x340Var.S;
                n4kVar = hmb0.t1;
                if (z2) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                lljVar = y580.O0;
                nko1.H(gfh0VarC, x340Var, lljVar);
                lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var, lljVar2);
                Integer numValueOf4 = Integer.valueOf(iHashCode);
                lljVar3 = y580.R0;
                nko1.H(numValueOf4, x340Var, lljVar3);
                nko1.F(x340Var);
                lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var, lljVar4);
                nim0Var = nim0.a;
                islVar = isl.a;
                h2cVar = h2c.a;
                if (uri != null) {
                    x340Var.i0(233387971);
                    f9 = f8;
                    eso1.e(uri, islVar, i1p1.q(h2cVar.b(nim0Var), cr31VarB), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, a, false, false, x340Var, (i4 & 14) | 1073741872, 0, 3576);
                    x340Var.r(false);
                    z3 = true;
                } else {
                    f9 = f8;
                    x340Var.i0(233601933);
                    qim0 qim0VarQ8 = i1p1.q(h2cVar.b(nim0Var), cr31VarB);
                    gfh0 gfh0VarC5 = t1c.c(een.h, false);
                    int iHashCode5 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM5 = x340Var.m();
                    qim0 qim0VarE5 = zr7.E(x340Var, qim0VarQ8);
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC5, x340Var, lljVar);
                    nko1.H(xos0VarM5, x340Var, lljVar2);
                    x0d.q(iHashCode5, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE5, x340Var, lljVar4);
                    ltx ltxVar4 = ltx.c;
                    zov0 zov0Var4 = cbx.b(x340Var).g;
                    w0h1.a(ltxVar4, islVar, u291.r(nim0Var, 16.0f), cbx.a(x340Var).b.b, 0L, false, x340Var, ltx.d | 48, 48);
                    z3 = true;
                    x340Var.r(true);
                    x340Var.r(false);
                }
                x340Var.r(z3);
                f5 = f7;
                f6 = f9;
            } else {
                x340Var.b0();
                f5 = f3;
                f6 = f4;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new ff60(uri, qim0Var, f5, f6, i, i2);
            }
        }
        f4 = f2;
        i3 = i9 | i8;
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i3 & 1, z)) {
            x340Var.d0();
            if ((i & 1) != 0) {
                if ((i2 & 4) != 0) {
                    uwr uwrVar15 = cbx.a;
                    cua cuaVar6 = cbx.b(x340Var).f;
                    i3 &= -897;
                    f3 = 2.0f;
                }
                if ((i2 & 8) != 0) {
                    uwr uwrVar16 = cbx.a;
                    avw0 avw0Var6 = cbx.b(x340Var).c;
                    f7 = f3;
                    i4 = i3 & (-7169);
                    f8 = 2.0f;
                } else {
                    f7 = f3;
                    i4 = i3;
                    f8 = f4;
                }
            } else {
                if ((i2 & 4) != 0) {
                    uwr uwrVar17 = cbx.a;
                    cua cuaVar7 = cbx.b(x340Var).f;
                    i3 &= -897;
                    f3 = 2.0f;
                }
                if ((i2 & 8) != 0) {
                    uwr uwrVar18 = cbx.a;
                    avw0 avw0Var7 = cbx.b(x340Var).c;
                    f7 = f3;
                    i4 = i3 & (-7169);
                    f8 = 2.0f;
                } else {
                    f7 = f3;
                    i4 = i3;
                    f8 = f4;
                }
            }
            x340Var.s();
            cr31VarB = er31.b(f7);
            qim0 qim0VarQ9 = i1p1.q(qim0Var, cr31VarB);
            uwr uwrVar19 = cbx.a;
            qim0 qim0VarX5 = uyn1.x(dug.f(qim0VarQ9, cbx.a(x340Var).a.a.a(), d4o1.a), f8);
            gfh0VarC = t1c.c(een.d, false);
            iHashCode = Long.hashCode(x340Var.T);
            xos0VarM = x340Var.m();
            qim0VarE = zr7.E(x340Var, qim0VarX5);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            z2 = x340Var.S;
            n4kVar = hmb0.t1;
            if (z2) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var, lljVar);
            lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf5 = Integer.valueOf(iHashCode);
            lljVar3 = y580.R0;
            nko1.H(numValueOf5, x340Var, lljVar3);
            nko1.F(x340Var);
            lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            nim0Var = nim0.a;
            islVar = isl.a;
            h2cVar = h2c.a;
            if (uri != null) {
                x340Var.i0(233387971);
                f9 = f8;
                eso1.e(uri, islVar, i1p1.q(h2cVar.b(nim0Var), cr31VarB), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, a, false, false, x340Var, (i4 & 14) | 1073741872, 0, 3576);
                x340Var.r(false);
                z3 = true;
            } else {
                f9 = f8;
                x340Var.i0(233601933);
                qim0 qim0VarQ10 = i1p1.q(h2cVar.b(nim0Var), cr31VarB);
                gfh0 gfh0VarC6 = t1c.c(een.h, false);
                int iHashCode6 = Long.hashCode(x340Var.T);
                xos0 xos0VarM6 = x340Var.m();
                qim0 qim0VarE6 = zr7.E(x340Var, qim0VarQ10);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC6, x340Var, lljVar);
                nko1.H(xos0VarM6, x340Var, lljVar2);
                x0d.q(iHashCode6, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE6, x340Var, lljVar4);
                ltx ltxVar5 = ltx.c;
                zov0 zov0Var5 = cbx.b(x340Var).g;
                w0h1.a(ltxVar5, islVar, u291.r(nim0Var, 16.0f), cbx.a(x340Var).b.b, 0L, false, x340Var, ltx.d | 48, 48);
                z3 = true;
                x340Var.r(true);
                x340Var.r(false);
            }
            x340Var.r(z3);
            f5 = f7;
            f6 = f9;
        } else {
            x340Var.b0();
            f5 = f3;
            f6 = f4;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ff60(uri, qim0Var, f5, f6, i, i2);
        }
    }

    public static final void b(tob1 tob1Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(944985450);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.i(tob1Var) ? 4 : 2);
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            float fFloatValue = ((Number) tob1Var.getValue()).floatValue();
            fra fraVar = een.N0;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(8.0f, true, new um5(false)), fraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, nim0Var);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            gra graVar = een.i;
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = uyf1.Z0;
                x340Var.s0(objT);
            }
            qim0 qim0VarA = s161.a(nim0Var, (iu30) objT);
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarA);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            String strO0 = cwl1.o0(x340Var, 2131961571);
            lee1 lee1Var = cbx.d(x340Var).n;
            long j = cbx.a(x340Var).b.b;
            boolean zD = x340Var.d(fFloatValue);
            Object objT2 = x340Var.T();
            if (zD || objT2 == m4cVar) {
                objT2 = new waf1((byte) 6, fFloatValue);
                x340Var.s0(objT2);
            }
            uwo1.e(strO0, i541.C(nim0Var, (iu30) objT2), lee1Var, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
            String strO1 = cwl1.o0(x340Var, 2131961569);
            lee1 lee1Var2 = cbx.d(x340Var).n;
            long j2 = cbx.a(x340Var).b.b;
            boolean zD2 = x340Var.d(fFloatValue);
            Object objT3 = x340Var.T();
            if (zD2 || objT3 == m4cVar) {
                objT3 = new waf1((byte) 7, fFloatValue);
                x340Var.s0(objT3);
            }
            uwo1.e(strO1, i541.C(nim0Var, (iu30) objT3), lee1Var2, j2, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
            x340Var.r(true);
            mlx mlxVar = mlx.c;
            zov0 zov0Var = cbx.b(x340Var).g;
            qim0 qim0VarR = u291.r(nim0Var, 12.0f);
            boolean zD3 = x340Var.d(fFloatValue);
            Object objT4 = x340Var.T();
            if (zD3 || objT4 == m4cVar) {
                objT4 = new waf1((byte) 8, fFloatValue);
                x340Var.s0(objT4);
            }
            w0h1.a(mlxVar, isl.a, i541.C(qim0VarR, (iu30) objT4), cbx.a(x340Var).b.b, 0L, false, x340Var, mlx.d | 48, 48);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lpk(tob1Var, i);
        }
    }

    public static final void c(Function0 function0, c380 c380Var, float f, float f2, float f3, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(611561250);
        int i2 = 4;
        c380 c380Var2 = c380Var;
        float f4 = f2;
        int i3 = 131072;
        int i4 = i | (x340Var.i(function0) ? 4 : 2) | (x340Var.g(c380Var2) ? 32 : 16) | (x340Var.d(16.0f) ? 256 : 128) | (x340Var.d(4.0f) ? 2048 : 1024) | (x340Var.d(f) ? 16384 : 8192) | (x340Var.d(f4) ? 131072 : 65536) | (x340Var.d(f3) ? 1048576 : 524288);
        if (x340Var.Y(i4 & 1, (i4 & 599187) != 599186)) {
            wat watVar = (wat) x340Var.k(t4k.h);
            uwr uwrVar = cbx.a;
            mta mtaVar = cbx.b(x340Var).d;
            float fX0 = watVar.X0(12.0f);
            x340Var.i0(-700144806);
            cvx cvxVar = cbx.b(x340Var).b;
            float fX1 = watVar.X0(16.0f);
            x340Var.r(false);
            x340Var.i0(-700142339);
            float fX2 = watVar.X0(cbx.b(x340Var).b.f);
            x340Var.r(false);
            x340Var.i0(-700139746);
            cvx cvxVar2 = cbx.b(x340Var).b;
            float fX3 = watVar.X0(8.0f);
            x340Var.r(false);
            float f5 = 48.0f;
            float fX4 = watVar.X0(16.0f) / watVar.X0(48.0f);
            x340Var.i0(-700134184);
            cua cuaVar = cbx.b(x340Var).f;
            float fN0 = watVar.N0(watVar.X0(2.0f) / fX4);
            x340Var.r(false);
            x340Var.i0(-700130475);
            avw0 avw0Var = cbx.b(x340Var).c;
            float fN1 = watVar.N0(watVar.X0(2.0f) / fX4);
            x340Var.r(false);
            int i5 = 0;
            for (Object obj : c380Var2) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    p7h.T();
                    throw null;
                }
                Uri uri = (Uri) obj;
                float f6 = i5;
                float f7 = (fX0 * f6) + f;
                float f8 = (f6 * fX2) + f3 + fX3;
                qim0 qim0VarR = u291.r(nim0.a, f5);
                int i7 = i4 & 14;
                boolean zD = (i7 == i2) | x340Var.d(f7) | x340Var.d(fX1) | ((i4 & 458752) == i3) | x340Var.d(f8);
                Object objT = x340Var.T();
                if (zD || objT == m4cVar) {
                    g2g1 g2g1Var = new g2g1(function0, f7, fX1, f4, f8);
                    x340Var.s0(g2g1Var);
                    objT = g2g1Var;
                }
                qim0 qim0VarX = lrn1.x(eqr0.B(qim0VarR, (iu30) objT), (c380Var2.size() - i5) + 10.0f);
                boolean zD2 = (i7 == 4) | x340Var.d(fX4);
                Object objT2 = x340Var.T();
                if (zD2 || objT2 == m4cVar) {
                    objT2 = new w7f1(function0, fX4);
                    x340Var.s0(objT2);
                }
                a(uri, i541.C(qim0VarX, (iu30) objT2), fN0, fN1, x340Var, 0, 0);
                c380Var2 = c380Var;
                fX4 = fX4;
                f5 = 48.0f;
                i3 = 131072;
                i2 = 4;
                f4 = f2;
                i5 = i6;
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new h2g1(function0, c380Var, f, f2, f3, i);
        }
    }

    public static final void d(c380 c380Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        h311 h311VarV;
        e eVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-402924539);
        int i2 = (x340Var.g(c380Var) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean zIsEmpty = c380Var.isEmpty();
            qim0Var2 = nim0.a;
            if (zIsEmpty) {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    eVar = new e(c380Var, qim0Var2, i, (byte) 10);
                }
            } else {
                uwr uwrVar = cbx.a;
                zov0 zov0Var = cbx.b(x340Var).g;
                cvx cvxVar = cbx.b(x340Var).b;
                qim0 qim0VarS = u291.s(qim0Var2, ((c380Var.size() - 1) * 12.0f) + 16.0f, 16.0f);
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarS);
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
                Iterator itN = kk0.n(x340Var, qim0VarE, y580.Y, -691123247, c380Var);
                int i3 = 0;
                while (itN.hasNext()) {
                    Object next = itN.next();
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        p7h.T();
                        throw null;
                    }
                    a((Uri) next, lrn1.x(eqr0.D(i3 * 12.0f, 0.0f, 2, u291.r(qim0Var2, 16.0f)), c380Var.size() - i3), 0.0f, 0.0f, x340Var, 0, 12);
                    i3 = i4;
                }
                x340Var.r(false);
                x340Var.r(true);
            }
            h311VarV.d = eVar;
        }
        x340Var.b0();
        qim0Var2 = qim0Var;
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            eVar = new e(c380Var, qim0Var2, i, (byte) 11);
            h311VarV.d = eVar;
        }
    }

    public static final void e(String str, c380 c380Var, boolean z, iu30 iu30Var, iu30 iu30Var2, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(529513690);
        int i3 = i & 6;
        pw31 pw31Var = pw31.a;
        if (i3 == 0) {
            i2 = (x340Var.i(pw31Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(c380Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(iu30Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.i(iu30Var2) ? 131072 : 65536;
        }
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            w2g0.c(pw31Var.a(1.0f, nim0.a, true), (tl3) null, apo.r(372843460, new hh1(c380Var, str, iu30Var2, z, iu30Var, (byte) 15), x340Var), x340Var, 3072, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cnr0(str, c380Var, z, iu30Var, iu30Var2, i, (byte) 10);
        }
    }

    public static final void f(d2g1 d2g1Var, c380 c380Var, wf3 wf3Var, qim0 qim0Var, boolean z, Function0 function0, b0k b0kVar, int i) {
        x340 x340Var;
        qim0 qim0Var2;
        ven0 ven0Var;
        tob1 tob1Var;
        int i2;
        boolean z2 = z;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-465718615);
        j06 j06Var = x340Var2.a;
        int i3 = i | (x340Var2.i(d2g1Var) ? 4 : 2) | (x340Var2.g(c380Var) ? 32 : 16) | (x340Var2.i(wf3Var) ? 256 : 128) | 3072 | (x340Var2.h(z2) ? 16384 : 8192) | (x340Var2.i(function0) ? 131072 : 65536);
        if (x340Var2.Y(i3 & 1, (i3 & 74899) != 74898)) {
            tob1 tob1VarB = z95.b(z2 ? 1.0f : 0.0f, irn1.o0(400, 0, z2 ? mlv.b : mlv.c, 2), "expandProgress", (iu30) null, x340Var2, 3072, 20);
            Object objT = x340Var2.T();
            if (objT == m4cVar) {
                objT = kaa0.h(9205357640488583168L, x340Var2);
            }
            ven0 ven0Var2 = (ven0) objT;
            Object objT2 = x340Var2.T();
            if (objT2 == m4cVar) {
                objT2 = kaa0.h(9205357640488583168L, x340Var2);
            }
            ven0 ven0Var3 = (ven0) objT2;
            Object objT3 = x340Var2.T();
            if (objT3 == m4cVar) {
                objT3 = us71.i(0.0f, x340Var2);
            }
            drr0 drr0Var = (drr0) objT3;
            boolean zG = x340Var2.g(d2g1Var.a) | x340Var2.e(c380Var.size());
            Object objT4 = x340Var2.T();
            if (zG || objT4 == m4cVar) {
                objT4 = v8r.q(Integer.valueOf(c380Var.size()));
                x340Var2.s0(objT4);
            }
            ven0 ven0Var4 = (ven0) objT4;
            boolean zE = x340Var2.e(((Number) ven0Var4.getValue()).intValue()) | ((i3 & 112) == 32);
            Object objT5 = x340Var2.T();
            if (zE || objT5 == m4cVar) {
                objT5 = mqo1.A(o7h.d1(c380Var, ((Number) ven0Var4.getValue()).intValue()));
                x340Var2.s0(objT5);
            }
            c380 c380Var2 = (c380) objT5;
            Object objT6 = x340Var2.T();
            if (objT6 == m4cVar) {
                g96 g96Var = new g96(z, tob1VarB, ven0Var2, ven0Var3, ven0Var4);
                z2 = z;
                tob1Var = tob1VarB;
                ven0Var = ven0Var2;
                objT6 = yv91.a(g96Var);
                x340Var2.s0(objT6);
            } else {
                ven0Var = ven0Var2;
                tob1Var = tob1VarB;
            }
            tob1 tob1Var2 = (tob1) objT6;
            Object objT7 = x340Var2.T();
            if (objT7 == m4cVar) {
                objT7 = yv91.a(new vm1(z2, tob1Var, ven0Var4, (byte) 25));
                x340Var2.s0(objT7);
            }
            tob1 tob1Var3 = (tob1) objT7;
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var2).f;
            float fT = dm5.T(16.0f, 8.0f, ((Number) tob1Var.getValue()).floatValue());
            Object objT8 = x340Var2.T();
            qim0 qim0Var3 = nim0.a;
            if (objT8 == m4cVar) {
                objT8 = q1o1.u(wf3Var, u291.f(qim0Var3, 1.0f), (FrameLayout.LayoutParams) null, 4);
                x340Var2.s0(objT8);
            }
            xpw xpwVar = (xpw) objT8;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            cvx cvxVar = cbx.b(x340Var2).b;
            cvx cvxVar2 = cbx.b(x340Var2).b;
            qim0 qim0VarY = uyn1.y(qim0VarF, 12.0f, 8.0f);
            boolean zI = x340Var2.i(ven0Var);
            Object objT9 = x340Var2.T();
            if (zI || objT9 == m4cVar) {
                objT9 = new ry71(ven0Var, (byte) 28);
                x340Var2.s0(objT9);
            }
            qim0 qim0VarX = ern1.x(qim0VarY, (iu30) objT9);
            gra graVar = een.d;
            ven0 ven0Var5 = ven0Var;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarX);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z3 = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z3) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            qim0 qim0VarF2 = dug.f(i1p1.q(u291.f(qim0Var3, 1.0f), er31.b(fT)), cbx.a(x340Var2).a.a.a(), d4o1.a);
            Object objT10 = x340Var2.T();
            if (objT10 == m4cVar) {
                objT10 = uyf1.a1;
                x340Var2.s0(objT10);
            }
            qim0 qim0VarR = exd0.r(qim0VarF2, (iu30) objT10);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarR);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar4);
            String strO0 = cwl1.o0(x340Var2, z ? 2131961569 : 2131961571);
            String strO1 = cwl1.o0(x340Var2, z ? 2131961570 : 2131961572);
            qim0 qim0VarF3 = u291.f(qim0Var3, 1.0f);
            mta mtaVar = cbx.b(x340Var2).d;
            qim0 qim0VarN = anm1.N("Search.TrackVersionsSection.Header", u291.b(0.0f, 32.0f, 1, qim0VarF3));
            boolean zG2 = x340Var2.g(strO0);
            Object objT11 = x340Var2.T();
            byte b2 = 6;
            if (zG2 || objT11 == m4cVar) {
                objT11 = new ysf1(strO0, b2);
                x340Var2.s0(objT11);
            }
            qim0 qim0VarX2 = bin.x(s161.b(qim0VarN, true, (iu30) objT11), false, strO1, (pm31) null, (idn0) null, function0, 13);
            boolean zI2 = x340Var2.i(drr0Var);
            Object objT12 = x340Var2.T();
            if (zI2 || objT12 == m4cVar) {
                objT12 = new qg6(drr0Var, (byte) 25);
                x340Var2.s0(objT12);
            }
            qim0 qim0VarX3 = ern1.x(qim0VarX2, (iu30) objT12);
            cvx cvxVar3 = cbx.b(x340Var2).b;
            cvx cvxVar4 = cbx.b(x340Var2).b;
            qim0 qim0VarY2 = uyn1.y(qim0VarX3, 16.0f, 8.0f);
            fra fraVar = een.N0;
            cvx cvxVar5 = cbx.b(x340Var2).b;
            jw31 jw31VarA = ew31.a(new d36(8.0f, true, new um5(false)), fraVar, x340Var2, 0);
            int iHashCode3 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM3 = x340Var2.m();
            qim0 qim0VarE3 = zr7.E(x340Var2, qim0VarY2);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(jw31VarA, x340Var2, lljVar);
            nko1.H(xos0VarM3, x340Var2, lljVar2);
            x0d.q(iHashCode3, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE3, x340Var2, lljVar4);
            String str = d2g1Var.a;
            boolean zBooleanValue = ((Boolean) tob1Var3.getValue()).booleanValue();
            boolean zI3 = x340Var2.i(ven0Var3);
            Object objT13 = x340Var2.T();
            if (zI3 || objT13 == m4cVar) {
                objT13 = new ry71(ven0Var3, (byte) 29);
                x340Var2.s0(objT13);
            }
            iu30 iu30Var = (iu30) objT13;
            boolean zI4 = x340Var2.i(ven0Var4);
            Object objT14 = x340Var2.T();
            if (zI4 || objT14 == m4cVar) {
                i2 = 0;
                objT14 = new i2g1(ven0Var4, (byte) 0);
                x340Var2.s0(objT14);
            } else {
                i2 = 0;
            }
            e(str, c380Var, zBooleanValue, iu30Var, (iu30) objT14, x340Var2, 6 | ((i3 << 3) & 896));
            b(tob1Var, x340Var2, i2);
            x340Var2.r(true);
            fq7.b(pbh.a, z, null, b, c, null, apo.r(472450173, new xw91(d2g1Var, xpwVar, (byte) 26), x340Var2), x340Var2, ((i3 >> 9) & 112) | 1572870, 18);
            x340Var = x340Var2;
            x340Var.r(true);
            if (((Boolean) tob1Var2.getValue()).booleanValue()) {
                x340Var.i0(2032658789);
                qim0 qim0VarB = h2c.a.b(qim0Var3);
                gfh0 gfh0VarC2 = t1c.c(graVar, false);
                int iHashCode4 = Long.hashCode(x340Var.T);
                xos0 xos0VarM4 = x340Var.m();
                qim0 qim0VarE4 = zr7.E(x340Var, qim0VarB);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC2, x340Var, lljVar);
                nko1.H(xos0VarM4, x340Var, lljVar2);
                x0d.q(iHashCode4, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE4, x340Var, lljVar4);
                tob1 tob1Var4 = tob1Var;
                boolean zI5 = x340Var.i(tob1Var4);
                Object objT15 = x340Var.T();
                if (zI5 || objT15 == m4cVar) {
                    objT15 = new bu2(tob1Var4, (byte) 27);
                    x340Var.s0(objT15);
                }
                zov0 zov0Var = cbx.b(x340Var).g;
                cvx cvxVar6 = cbx.b(x340Var).b;
                c((Function0) objT15, c380Var2, Float.intBitsToFloat((int) (((Offset) ven0Var3.getValue()).a >> 32)) - Float.intBitsToFloat((int) (((Offset) ven0Var5.getValue()).a >> 32)), Float.intBitsToFloat((int) (((Offset) ven0Var3.getValue()).a & 4294967295L)) - Float.intBitsToFloat((int) (((Offset) ven0Var5.getValue()).a & 4294967295L)), drr0Var.s(), x340Var, 0);
                x340Var = x340Var;
                x340Var.r(true);
                x340Var.r(false);
            } else {
                x340Var.i0(2033164275);
                x340Var.r(false);
            }
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new j2g1(d2g1Var, c380Var, wf3Var, qim0Var2, z, function0, i);
        }
    }
}

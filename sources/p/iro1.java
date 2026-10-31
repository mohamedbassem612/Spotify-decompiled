package p;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class iro1 {
    public static b180 a;

    public static final void a(String str, int i, int i2, yf yfVar, boolean z, Function0 function0, b0k b0kVar, int i3) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-2046505235);
        int i4 = (b0kVar3.g(str) ? 4 : 2) | i3 | (b0kVar3.e(i) ? 32 : 16) | (b0kVar3.e(i2) ? 256 : 128) | (b0kVar3.i(yfVar) ? 2048 : 1024);
        if ((i3 & 24576) == 0) {
            i4 |= b0kVar3.h(z) ? 16384 : 8192;
        }
        int i5 = i4 | (b0kVar3.i(function0) ? 131072 : 65536);
        if (b0kVar3.Y(i5 & 1, (74899 & i5) != 74898)) {
            b0kVar2 = b0kVar3;
            jto1.b(u291.f(nim0.a, 1.0f), new uvx((pgx) null, 0, (tvx) null, (p3v) null, 30), (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, (xu30) null, z ? wbi.a : null, (xu30) null, (xu30) null, apo.r(-4747116, new jaf(function0, z, yfVar, i, cwl1.o0(b0kVar3, i2)), b0kVar3), (xu30) null, (xu30) null, apo.r(-521791439, new kaf(str, (byte) 0), b0kVar3), b0kVar2, 64, 196992, 28156);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new laf(str, i, i2, yfVar, z, function0, i3);
        }
    }

    public static final void b(z2o z2oVar, int i, float f, qim0 qim0Var, b0k b0kVar, int i2) {
        qim0 qim0Var2;
        qim0 qim0VarX;
        cr31 cr31VarB;
        m4c m4cVar = fkj0.X;
        int i3 = z2oVar.b;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1040130102);
        int i4 = i2 | (x340Var.g(z2oVar) ? 4 : 2) | 3072;
        if (x340Var.Y(i4 & 1, (i4 & 1171) != 1170)) {
            float fX0 = ((wat) x340Var.k(t4k.h)).X0(28.0f);
            boolean zD = x340Var.d(fX0);
            Object objT = x340Var.T();
            if (zD || objT == m4cVar) {
                objT = new ik6(i, fX0);
                x340Var.s0(objT);
            }
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarB = eqr0.B(qim0Var3, (iu30) objT);
            if (i3 == 2) {
                x340Var.i0(-1672775683);
                Object objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    objT2 = rwn.U0;
                    x340Var.s0(objT2);
                }
                qim0VarX = lrn1.x(exd0.s(qim0Var3, (iu30) objT2), f);
                x340Var.r(false);
            } else {
                x340Var.i0(-1672385238);
                x340Var.r(false);
                qim0VarX = qim0Var3;
            }
            qim0 qim0VarThen = qim0VarB.then(qim0VarX);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarThen);
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
            Uri uri = Uri.parse(z2oVar.a);
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            if (i3 == 2) {
                x340Var.i0(-1012909603);
                x340Var.r(false);
                cr31VarB = er31.a;
            } else {
                x340Var.i0(-1012861367);
                cua cuaVar = cbx.b(x340Var).f;
                cr31VarB = er31.b(4.0f);
                x340Var.r(false);
            }
            eso1.e(uri, isl.a, i1p1.q(qim0Var3, cr31VarB), new p3v(32.0f), null, null, null, null, null, null, false, false, x340Var, 48, 0, 4080);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new l3a(z2oVar, i, f, qim0Var2, i2);
        }
    }

    public static final void c(xtb0 xtb0Var, qim0 qim0Var, boolean z, float f, float f2, int i, long j, int i2, j2i j2iVar, Function0 function0, b0k b0kVar, int i3) {
        int i4;
        float f3;
        int i5;
        long j2;
        int i6;
        int i7;
        int i8;
        int i9;
        float f4;
        long j3;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(1981162926);
        if ((i3 & 6) == 0) {
            i4 = (b0kVar2.i(xtb0Var) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= b0kVar2.i(qim0Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= b0kVar2.h(z) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= b0kVar2.d(f2) ? 16384 : 8192;
        }
        int i10 = 196608 | i4;
        if ((1572864 & i3) == 0) {
            i10 = 720896 | i4;
        }
        int i11 = 113246208 | i10;
        if ((805306368 & i3) == 0) {
            i11 |= b0kVar2.i(j2iVar) ? 536870912 : 268435456;
        }
        if (b0kVar2.Y(i11 & 1, ((306783379 & i11) == 306783378 && ((b0kVar2.i(function0) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            b0kVar2.d0();
            if ((i3 & 1) == 0 || b0kVar2.E()) {
                uwr uwrVar = cbx.a;
                i7 = 15;
                i8 = 1000;
                i9 = i11 & (-3677185);
                f4 = cbx.b(b0kVar2).b.e + cbx.b(b0kVar2).b.b;
                j3 = u7h.j;
            } else {
                b0kVar2.b0();
                i8 = i;
                j3 = j;
                i7 = i2;
                i9 = i11 & (-3677185);
                f4 = f;
            }
            b0kVar2.s();
            wat watVar = (wat) b0kVar2.k(t4k.h);
            flb0 flb0Var = (flb0) b0kVar2.k(t4k.n);
            yqg yqgVar = (yqg) b0kVar2.k(bde0.a);
            Object objT = b0kVar2.T();
            Object obj = fkj0.X;
            if (objT == obj) {
                objT = qxd0.M(o6x.a, b0kVar2);
                b0kVar2.s0(objT);
            }
            c9n c9nVar = (c9n) objT;
            float fX0 = watVar.X0(f4);
            float fX1 = watVar.X0(f2);
            boolean zE = b0kVar2.e(flb0Var.ordinal());
            float f5 = f4;
            Object objT2 = b0kVar2.T();
            if (zE || objT2 == obj) {
                objT2 = v8r.q(new ll10(0.0f, 0.0f, 0, 0L, false, false));
                b0kVar2.s0(objT2);
            }
            ven0 ven0Var = (ven0) objT2;
            Object objT3 = b0kVar2.T();
            if (objT3 == obj) {
                objT3 = bb00.h(0, b0kVar2);
            }
            err0 err0Var = (hdn0) objT3;
            boolean zE2 = b0kVar2.e(flb0Var.ordinal());
            Object objT4 = b0kVar2.T();
            if (zE2 || objT4 == obj) {
                objT4 = p3d1.m(0L, b0kVar2);
            }
            frr0 frr0Var = (frr0) objT4;
            err0 err0Var2 = err0Var;
            int iS = err0Var2.s();
            ll10 ll10Var = (ll10) ven0Var.getValue();
            boolean zI = b0kVar2.i(ven0Var);
            Object objT5 = b0kVar2.T();
            if (zI || objT5 == obj) {
                objT5 = new d7v(ven0Var, (byte) 6);
                b0kVar2.s0(objT5);
            }
            iu30 iu30Var = (iu30) objT5;
            boolean zI2 = b0kVar2.i(frr0Var) | b0kVar2.g(yqgVar);
            Object objT6 = b0kVar2.T();
            if (zI2 || objT6 == obj) {
                objT6 = new vhx(yqgVar, frr0Var, (byte) 0);
                b0kVar2.s0(objT6);
            }
            int i12 = i8;
            int i13 = i9;
            int i14 = i7;
            h(xtb0Var, z, i14, iS, ll10Var, iu30Var, (Function0) objT6, b0kVar2, (i9 & 14) | ((i9 >> 3) & 112) | ((i9 >> 15) & 896));
            Long lValueOf = Long.valueOf(frr0Var.s());
            Boolean boolValueOf = Boolean.valueOf(((ll10) ven0Var.getValue()).b);
            boolean zI3 = b0kVar2.i(ven0Var) | ((458752 & i13) == 131072);
            Object objT7 = b0kVar2.T();
            if (zI3 || objT7 == obj) {
                objT7 = new whx(i12, ven0Var, null);
                b0kVar2.s0(objT7);
            }
            qxd0.s(lValueOf, boolValueOf, (vu30) objT7, b0kVar2);
            Boolean boolValueOf2 = Boolean.valueOf(z);
            boolean zI4 = ((i13 & 896) == 256) | b0kVar2.i(ven0Var);
            Object objT8 = b0kVar2.T();
            if (zI4 || objT8 == obj) {
                objT8 = new hj6(z, ven0Var, (lnm) null, (byte) 4);
                b0kVar2.s0(objT8);
            }
            qxd0.t(boolValueOf2, b0kVar2, (vu30) objT8);
            boolean zD = b0kVar2.d(((ll10) ven0Var.getValue()).c) | b0kVar2.e(err0Var2.s()) | b0kVar2.d(fX0);
            Object objT9 = b0kVar2.T();
            if (zD || objT9 == obj) {
                float fS = err0Var2.s() - fX0;
                if (fS < 0.0f) {
                    fS = 0.0f;
                }
                objT9 = Float.valueOf(yoi1.o(((ll10) ven0Var.getValue()).c * fS, 0.0f, fS));
                b0kVar2.s0(objT9);
            }
            float fFloatValue = ((Number) objT9).floatValue();
            tob1 tob1VarB = z95.b(((ll10) ven0Var.getValue()).a ? 0.0f : fX1, irn1.o0(200, 0, (dlv) null, 6), "fast_scroller_offset", (iu30) null, b0kVar2, 3072, 20);
            boolean zI5 = b0kVar2.i(err0Var);
            Object objT10 = b0kVar2.T();
            if (zI5 || objT10 == obj) {
                objT10 = new tu9(err0Var, (byte) 9);
                b0kVar2.s0(objT10);
            }
            long j4 = j3;
            i5 = i12;
            j2 = j4;
            f3 = f5;
            b0kVar2 = b0kVar2;
            d(f2, (iu30) objT10, qim0Var, apo.r(820639473, new xhx(f2, j4, f5, fX0, fFloatValue, j2iVar, xtb0Var, c9nVar, ven0Var, frr0Var, yqgVar, function0, tob1VarB, err0Var), b0kVar2), b0kVar2, ((i13 >> 12) & 14) | 3072 | ((i13 << 3) & 896));
            i6 = i14;
        } else {
            b0kVar2.b0();
            f3 = f;
            i5 = i;
            j2 = j;
            i6 = i2;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new yhx(xtb0Var, qim0Var, z, f3, f2, i5, j2, i6, j2iVar, function0, i3);
        }
    }

    public static final void d(float f, iu30 iu30Var, qim0 qim0Var, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1273800745);
        if ((i & 6) == 0) {
            i2 = (x340Var.d(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(j2iVar) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0VarC = u291.c(u291.v(qim0Var, f), 1.0f);
            boolean z = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new hws(iu30Var, (byte) 26);
                x340Var.s0(objT);
            }
            qim0 qim0VarU = lrn1.u(qim0VarC, (iu30) objT);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarU);
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
            dv20.l((i2 >> 9) & 14, j2iVar, x340Var, true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new f61(f, iu30Var, qim0Var, j2iVar, i, (byte) 2);
        }
    }

    public static final void e(float f, float f2, long j, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-915369078);
        int i2 = (x340Var.d(f) ? 4 : 2) | i | (x340Var.d(f2) ? 32 : 16) | (x340Var.f(j) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0VarV = u291.v(u291.c(nim0.a, 1.0f), f);
            boolean z = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new jc5((byte) 22, f2);
                x340Var.s0(objT);
            }
            t1c.a(dug.f(eqr0.B(qim0VarV, (iu30) objT), j, d4o1.a), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zhx(f, f2, j, i, (byte) 0);
        }
    }

    public static final void f(float f, float f2, float f3, float f4, float f5, j2i j2iVar, int i, ll10 ll10Var, xtb0 xtb0Var, c9n c9nVar, iu30 iu30Var, Function0 function0, Function0 function1, b0k b0kVar, int i2) {
        j2i j2iVar2;
        boolean z;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1570369483);
        int i3 = i2 | (x340Var.d(f) ? 4 : 2) | (x340Var.d(f2) ? 32 : 16) | (x340Var.d(f3) ? 256 : 128) | (x340Var.d(f4) ? 2048 : 1024) | (x340Var.d(f5) ? 16384 : 8192) | (x340Var.i(j2iVar) ? 131072 : 65536) | (x340Var.e(i) ? 1048576 : 524288) | (x340Var.g(ll10Var) ? 8388608 : 4194304) | (x340Var.i(xtb0Var) ? 67108864 : 33554432) | (x340Var.e(0) ? 536870912 : 268435456);
        int i4 = (x340Var.i(c9nVar) ? (char) 4 : (char) 2) | (x340Var.i(iu30Var) ? ' ' : (char) 16) | (x340Var.i(function0) ? (char) 256 : (char) 128) | (x340Var.i(function1) ? (char) 2048 : (char) 1024);
        if (x340Var.Y(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 1171) == 1170) ? false : true)) {
            ven0 ven0VarS = v8r.s(ll10Var, x340Var);
            ven0 ven0VarS2 = v8r.s(Integer.valueOf(i), x340Var);
            ven0 ven0VarS3 = v8r.s(iu30Var, x340Var);
            ven0 ven0VarS4 = v8r.s(function0, x340Var);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(new v3v(0.0f, 0.0f));
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            boolean z2 = ((i3 & 7168) == 2048) | ((57344 & i3) == 16384);
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new e8(f4, f5, (byte) 5);
                x340Var.s0(objT2);
            }
            qim0 qim0VarS = u291.s(eqr0.B(nim0.a, (iu30) objT2), f, f2);
            boolean zI = ((i3 & 896) == 256) | ((i4 & 7168) == 2048) | x340Var.i(ven0VarS) | x340Var.i(ven0VarS2) | x340Var.i(ven0Var) | x340Var.i(ven0VarS3) | x340Var.i(ven0VarS4) | x340Var.i(xtb0Var) | ((1879048192 & i3) == 536870912) | x340Var.i(c9nVar);
            Object objT3 = x340Var.T();
            if (zI || objT3 == m4cVar) {
                z = false;
                bix bixVar = new bix(function1, f3, ven0VarS, ven0VarS2, ven0Var, ven0VarS3, ven0VarS4, xtb0Var, c9nVar);
                x340Var.s0(bixVar);
                objT3 = bixVar;
            } else {
                z = false;
            }
            qim0 qim0VarB = f8d1.b(qim0VarS, rih1.a, (PointerInputEventHandler) objT3);
            gfh0 gfh0VarC = t1c.c(een.d, z);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
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
            j2iVar2 = j2iVar;
            dv20.l((i3 >> 15) & 14, j2iVar2, x340Var, true);
        } else {
            j2iVar2 = j2iVar;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cix(f, f2, f3, f4, f5, j2iVar2, i, ll10Var, xtb0Var, c9nVar, iu30Var, function0, function1, i2);
        }
    }

    public static final void g(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-24198478);
        if (x340Var.Y(i & 1, i != 0)) {
            w0h1.a(tnx.c, isl.a, (qim0) null, 0L, 0L, false, x340Var, tnx.d | 48, 60);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qza((byte) 10, i, false);
        }
    }

    public static final void h(xtb0 xtb0Var, boolean z, int i, int i2, ll10 ll10Var, iu30 iu30Var, Function0 function0, b0k b0kVar, int i3) {
        int i4;
        int i5;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(793293332);
        if ((i3 & 6) == 0) {
            i4 = (x340Var.i(xtb0Var) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= x340Var.h(z) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= x340Var.e(i) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 = i2;
            i4 |= x340Var.e(i5) ? 2048 : 1024;
        } else {
            i5 = i2;
        }
        if ((i3 & 24576) == 0) {
            i4 |= x340Var.g(ll10Var) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= x340Var.i(iu30Var) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i4 |= x340Var.i(function0) ? 1048576 : 524288;
        }
        if (x340Var.Y(i4 & 1, (599187 & i4) != 599186)) {
            ven0 ven0VarS = v8r.s(ll10Var, x340Var);
            ven0 ven0VarS2 = v8r.s(Integer.valueOf(i5), x340Var);
            boolean z2 = false;
            ven0 ven0VarS3 = v8r.s(iu30Var, x340Var);
            ven0 ven0VarS4 = v8r.s(function0, x340Var);
            yqg yqgVar = (yqg) x340Var.k(bde0.a);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = yv91.a(new ih1(xtb0Var, (byte) 17));
                x340Var.s0(objT);
            }
            tob1 tob1Var = (tob1) objT;
            Integer numValueOf = Integer.valueOf(((Number) tob1Var.getValue()).intValue());
            boolean zI = ((i4 & 112) == 32) | x340Var.i(ven0VarS) | x340Var.g(yqgVar) | x340Var.i(tob1Var);
            if ((i4 & 896) == 256) {
                z2 = true;
            }
            boolean zI2 = zI | z2 | x340Var.i(ven0VarS4) | x340Var.i(ven0VarS2) | x340Var.i(xtb0Var) | x340Var.i(ven0VarS3);
            Object objT2 = x340Var.T();
            if (zI2 || objT2 == m4cVar) {
                ml1 ml1Var = new ml1(z, yqgVar, i, xtb0Var, ven0VarS, tob1Var, ven0VarS4, ven0VarS2, ven0VarS3, (lnm) null);
                x340Var.s0(ml1Var);
                objT2 = ml1Var;
            }
            qxd0.t(numValueOf, x340Var, (vu30) objT2);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new dix(xtb0Var, z, i, i2, ll10Var, iu30Var, function0, i3);
        }
    }

    public static final void i(List list, ws61 ws61Var, iu30 iu30Var, qim0 qim0Var, boolean z, b0k b0kVar, int i) {
        ws61 ws61Var2;
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1247774260);
        int i2 = i | (x340Var.g(list) ? 4 : 2) | (x340Var.e(ws61Var.ordinal()) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128) | 3072 | (x340Var.h(z) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            xtb0 xtb0VarA = aub0.a(0, x340Var, 3);
            int iIndexOf = list.indexOf(ws61Var);
            Integer numValueOf = Integer.valueOf(iIndexOf);
            boolean zE = x340Var.e(iIndexOf) | x340Var.i(xtb0VarA);
            Object objT = x340Var.T();
            if (zE || objT == m4cVar) {
                objT = new xe2(iIndexOf, xtb0VarA, (lnm) null);
                x340Var.s0(objT);
            }
            qxd0.t(numValueOf, x340Var, (vu30) objT);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(qim0VarF, 0.0f, 16.0f, 0.0f, 8.0f, 5);
            mta mtaVar = cbx.b(x340Var).d;
            qim0 qim0VarH = u291.h(qim0VarB, 48.0f);
            cvx cvxVar3 = cbx.b(x340Var).b;
            zzq0 zzq0VarH = uyn1.h(2, 16.0f, 0.0f);
            cvx cvxVar4 = cbx.b(x340Var).b;
            d36 d36Var = new d36(12.0f, true, new g21(een.Q0, (byte) 29));
            boolean z2 = ((i2 & 14) == 4) | ((i2 & 112) == 32) | ((57344 & i2) == 16384) | ((i2 & 896) == 256);
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                ws61Var2 = ws61Var;
                objT2 = new gh1(list, ws61Var2, z, iu30Var);
                x340Var.s0(objT2);
            } else {
                ws61Var2 = ws61Var;
            }
            ujo1.e(qim0VarH, xtb0VarA, zzq0VarH, d36Var, (pl3) null, (iq20) null, false, (hxq0) null, (iu30) objT2, x340Var, 0, 488);
            qim0Var2 = qim0Var3;
        } else {
            ws61Var2 = ws61Var;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ofi0(list, ws61Var2, iu30Var, qim0Var2, z, i, (byte) 12);
        }
    }

    public static final void j(tl7 tl7Var, RecyclerView recyclerView) {
        recyclerView.m(new zl7(tl7Var, (byte) 0));
        recyclerView.post(new xwn1(tl7Var, recyclerView, (byte) 5));
    }

    public static final long k(ff01 ff01Var, rhc rhcVar, int i, long j, long j2) {
        rhc rhcVar2;
        nac nacVar = ff01Var.b;
        long j3 = i;
        zod.u(rhcVar.d(), 0L, j3);
        if (ff01Var.c) {
            eg.m("closed");
            return 0L;
        }
        long jMax = j;
        int i2 = i;
        rhc rhcVar3 = rhcVar;
        while (true) {
            long jA = b.a(nacVar, rhcVar3, jMax, j2, i2);
            long j4 = jMax;
            if (jA != -1) {
                return jA;
            }
            long j5 = nacVar.b;
            long j6 = (j5 - j3) + 1;
            if (j6 < j2) {
                if (j5 < j2) {
                    rhcVar2 = rhcVar;
                } else {
                    int iMax = (int) Math.max(1L, (j5 - j2) + 1);
                    int iMin = ((int) Math.min(j3, (nacVar.b - j4) + 1)) - 1;
                    if (iMax <= iMin) {
                        while (true) {
                            rhcVar2 = rhcVar;
                            if (nacVar.j(iMin, nacVar.b - ((long) iMin), rhcVar2)) {
                                break;
                            }
                            if (iMin != iMax) {
                                iMin--;
                            }
                        }
                    }
                }
                if (ff01Var.a.O0(nacVar, 8192L) != -1) {
                    i2 = i;
                    jMax = Math.max(j4, j6);
                    rhcVar3 = rhcVar2;
                }
            }
            return -1L;
        }
    }

    public static zuc1 l(wuc1 wuc1Var) {
        zuc1 zuc1Var = new zuc1();
        Bundle bundle = new Bundle();
        bundle.putParcelable("ARGS_KEY", wuc1Var);
        zuc1Var.T0(bundle);
        return zuc1Var;
    }

    public static void m(View view) {
        zjs0 zjs0VarP = p(view);
        if (zjs0VarP.a == null) {
            zjs0VarP.a = new ytp0();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final d6c0 n(String str, List list) {
        switch (str.hashCode()) {
            case -1865828127:
                if (str.equals("playlists")) {
                    return new y5c0(list);
                }
                break;
            case -1415163932:
                if (str.equals("albums")) {
                    return new y4c0(list);
                }
                break;
            case -1377611054:
                if (str.equals("by_spotify")) {
                    return new h5c0(list);
                }
                break;
            case -1374614473:
                if (str.equals("by_you")) {
                    return new i5c0(list);
                }
                break;
            case -1369608972:
                if (str.equals("downloaded_artists")) {
                    return l5c0.b;
                }
                break;
            case -1291329255:
                if (str.equals("events")) {
                    return new r5c0(list);
                }
                break;
            case -753541113:
                if (str.equals("in_progress")) {
                    return u5c0.b;
                }
                break;
            case -732362228:
                if (str.equals("artists")) {
                    return new e5c0(list);
                }
                break;
            case -683249211:
                if (str.equals("folders")) {
                    return new t5c0(list);
                }
                break;
            case -673660814:
                if (str.equals("finished")) {
                    return s5c0.b;
                }
                break;
            case -646508472:
                if (str.equals("authors")) {
                    return f5c0.b;
                }
                break;
            case -99249492:
                if (str.equals("unplayed")) {
                    return a6c0.b;
                }
                break;
            case -94639139:
                if (str.equals("all_mixed")) {
                    return d5c0.b;
                }
                break;
            case -79625783:
                if (str.equals("downloaded_playlists")) {
                    return o5c0.b;
                }
                break;
            case 3433490:
                if (str.equals("past")) {
                    return x5c0.b;
                }
                break;
            case 93921962:
                if (str.equals("books")) {
                    return new g5c0(list);
                }
                break;
            case 112093807:
                if (str.equals("venue")) {
                    return c6c0.b;
                }
                break;
            case 118879398:
                if (str.equals("is_mixed")) {
                    return new w5c0(list);
                }
                break;
            case 312270319:
                if (str.equals("podcasts")) {
                    return new z5c0(list);
                }
                break;
            case 320702112:
                if (str.equals("downloaded_courses")) {
                    return n5c0.b;
                }
                break;
            case 598286226:
                if (str.equals("downloaded_books")) {
                    return m5c0.b;
                }
                break;
            case 766185605:
                if (str.equals("all_downloaded")) {
                    return new b5c0(list, 2);
                }
                break;
            case 957948856:
                if (str.equals("courses")) {
                    return new j5c0(list);
                }
                break;
            case 1060284565:
                if (str.equals("all_by_you")) {
                    return a5c0.b;
                }
                break;
            case 1306691868:
                if (str.equals("upcoming")) {
                    return b6c0.b;
                }
                break;
            case 1335226364:
                if (str.equals("downloaded_albums")) {
                    return k5c0.b;
                }
                break;
            case 1644400688:
                if (str.equals("all_by_spotify")) {
                    return z4c0.b;
                }
                break;
            case 1784176935:
                if (str.equals("all_folders")) {
                    return c5c0.b;
                }
                break;
            case 2032457735:
                if (str.equals("downloaded_podcasts")) {
                    return p5c0.b;
                }
                break;
            case 2039141159:
                if (str.equals("downloaded")) {
                    return new q5c0(list);
                }
                break;
        }
        hhg1.n(f4i1.f("Invalid id, \"", str, "\""));
        return null;
    }

    public static final String o(List list) {
        List listA1 = o7h.a1(list, new be21((byte) 27));
        int size = list.size();
        if (size > 2) {
            size = 2;
        }
        return o7h.y0(listA1.subList(0, size), ", ", (String) null, list.size() > 2 ? f4i1.c(list.size() - 2, " +") : "", kei1.R0, 26);
    }

    public static zjs0 p(View view) {
        View rootView = view.getRootView();
        Object tag = rootView.getTag(2131429977);
        if (tag == null) {
            tag = new zjs0();
            rootView.setTag(2131429977, tag);
        }
        return (zjs0) tag;
    }

    public static final String q(d6c0 d6c0Var) {
        if (d6c0Var instanceof y4c0) {
            return "albums";
        }
        if (d6c0Var instanceof b5c0) {
            return "all_downloaded";
        }
        if (d6c0Var instanceof e5c0) {
            return "artists";
        }
        if (d6c0Var instanceof g5c0) {
            return "books";
        }
        if (d6c0Var instanceof q5c0) {
            return "downloaded";
        }
        if (d6c0Var instanceof y5c0) {
            return "playlists";
        }
        if (d6c0Var instanceof z5c0) {
            return "podcasts";
        }
        if (d6c0Var instanceof j5c0) {
            return "courses";
        }
        if (d6c0Var.equals(k5c0.b)) {
            return "downloaded_albums";
        }
        if (d6c0Var.equals(l5c0.b)) {
            return "downloaded_artists";
        }
        if (d6c0Var.equals(o5c0.b)) {
            return "downloaded_playlists";
        }
        if (d6c0Var.equals(p5c0.b)) {
            return "downloaded_podcasts";
        }
        if (d6c0Var.equals(m5c0.b)) {
            return "downloaded_books";
        }
        if (d6c0Var.equals(n5c0.b)) {
            return "downloaded_courses";
        }
        if (d6c0Var instanceof i5c0) {
            return "by_you";
        }
        if (d6c0Var instanceof h5c0) {
            return "by_spotify";
        }
        if (d6c0Var.equals(a5c0.b)) {
            return "all_by_you";
        }
        if (d6c0Var.equals(z4c0.b)) {
            return "all_by_spotify";
        }
        if (d6c0Var instanceof r5c0) {
            return "events";
        }
        if (d6c0Var.equals(b6c0.b)) {
            return "upcoming";
        }
        if (d6c0Var.equals(c6c0.b)) {
            return "venue";
        }
        if (d6c0Var.equals(x5c0.b)) {
            return "past";
        }
        if (d6c0Var.equals(u5c0.b)) {
            return "in_progress";
        }
        if (d6c0Var.equals(a6c0.b)) {
            return "unplayed";
        }
        if (d6c0Var.equals(f5c0.b)) {
            return "authors";
        }
        if (d6c0Var.equals(s5c0.b)) {
            return "finished";
        }
        if (d6c0Var.equals(d5c0.b)) {
            return "all_mixed";
        }
        if (d6c0Var instanceof w5c0) {
            return "is_mixed";
        }
        if (d6c0Var.equals(c5c0.b)) {
            return "all_folders";
        }
        if (d6c0Var instanceof t5c0) {
            return "folders";
        }
        eg.o();
        return null;
    }

    public static final go80 r(klm klmVar, qbp0 qbp0Var, obp0 obp0Var) {
        return klmVar.a("AndroidAutoConnectedDaemon", new s2n0(qbp0Var, obp0Var, (byte) 27));
    }

    public static final boolean s(String str) {
        return Pattern.compile("#[0-9a-fA-F]{8}").matcher(str).matches();
    }

    public static final boolean t(List list, ArrayList arrayList, d6c0 d6c0Var) {
        List<d6c0> list2 = list;
        boolean z = list2 instanceof Collection;
        if (!z || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((d6c0) it.next()).getClass() == d6c0Var.getClass()) {
                    return true;
                }
            }
        }
        if (z && list2.isEmpty()) {
            return false;
        }
        for (d6c0 d6c0Var2 : list2) {
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (((d6c0) it2.next()).getClass() == d6c0Var2.getClass()) {
                        List listA = d6c0Var2.a();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : arrayList) {
                            if (((d6c0) obj).getClass() != d6c0Var2.getClass()) {
                                arrayList2.add(obj);
                            }
                        }
                        if (!t(listA, arrayList2, d6c0Var)) {
                            break;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final float u(RecyclerView recyclerView) {
        LinearLayoutManager layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? layoutManager : null;
        if (linearLayoutManager == null) {
            return 0.0f;
        }
        int iF1 = linearLayoutManager.f1();
        View viewD = linearLayoutManager.D(iF1);
        if (viewD == null) {
            return iF1;
        }
        float height = viewD.getHeight();
        return iF1 - (1.0f - (height != 0.0f ? (-viewD.getTop()) / height : 0.0f));
    }

    public static final float v(RecyclerView recyclerView) {
        View viewD;
        LinearLayoutManager layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? layoutManager : null;
        if (linearLayoutManager == null) {
            return 0.0f;
        }
        int iR = linearLayoutManager.R();
        int iH1 = linearLayoutManager.h1();
        if (iH1 == -1 || (viewD = linearLayoutManager.D(iH1)) == null) {
            return 0.0f;
        }
        float height = viewD.getHeight();
        float bottom = viewD.getBottom() - recyclerView.getHeight();
        if (bottom < 0.0f) {
            bottom = 0.0f;
        }
        float f = (iR - iH1) - 1.0f;
        return (f >= 0.0f ? f : 0.0f) + (height == 0.0f ? 0.0f : bottom / height);
    }

    public static final ia00 w(maa maaVar, l0x0 l0x0Var, boolean z) {
        return n3o1.q(maaVar).a(new spf((byte) 2, z), new bii0(l0x0Var, (byte) 0));
    }

    public static final float x(b0k b0kVar) {
        return dsa0.m(b0kVar, 2131166901);
    }

    public static final String y(String str) {
        return str.substring(6).concat(str.substring(0, 6));
    }
}

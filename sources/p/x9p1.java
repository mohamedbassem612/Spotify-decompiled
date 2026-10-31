package p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.messages.BetamaxPlaybackErrorDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class x9p1 {
    public static b180 a;
    public static b180 b;

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void a(int i, int i2, b0k b0kVar, iu30 iu30Var, qim0 qim0Var) throws NoWhenBranchMatchedException {
        int i3;
        qim0 qim0Var2;
        qim0 qim0Var3;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1794321459);
        if ((i2 & 6) == 0) {
            i3 = i2 | (x340Var.e(l1d.C(i)) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        int i4 = i3 | 384;
        if (x340Var.Y(i4 & 1, (i4 & 147) != 146)) {
            String strO0 = cwl1.o0(x340Var, 2131963221);
            boolean z = (i4 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new cr0(iu30Var, (byte) 28);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar = new gbx(new y50(strO0), function0);
            int iC = l1d.C(i);
            qim0 qim0Var4 = nim0.a;
            if (iC == 0) {
                qim0Var3 = qim0Var4;
                x340Var.i0(-2061026978);
                Object objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    objT2 = ah1.P0;
                    x340Var.s0(objT2);
                }
                foo1.c(gbxVar, new hdx(18, (vu30) null, (vu30) objT2, (vu30) null, (hw61) null, 26), qim0Var3, null, yla.s(x340Var), null, null, null, w4i.b, null, apo.r(-366658890, new nl(strO0, (byte) 10), x340Var), x340Var, 805306368 | (i4 & 896), 48, 1496);
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                if (iC != 1) {
                    throw p3d1.k(x340Var, -2061027974, false);
                }
                x340Var.i0(-2061009409);
                qim0Var3 = qim0Var4;
                wro1.h(gbxVar, ldx.c, qim0Var3, null, null, null, false, null, null, apo.r(1690022485, new nl(strO0, (byte) 11), x340Var), x340Var, i4 & 896, 6, 1016);
                x340Var.r(false);
            }
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ry1(i, iu30Var, qim0Var2, i2, (byte) 0);
        }
    }

    public static final void b(yc30 yc30Var, Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1245280366);
        int i3 = i | (x340Var.g(yc30Var) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(function1) ? 256 : 128) | 3072;
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarH = l6o1.H(voo1.y(dug.f(qim0VarD, cbx.a(x340Var).a.c, d4o1.a), voo1.c), l6o1.C(0, 0, 1, x340Var), false, 14);
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarH);
            mbh mbhVarA = jbh.a(h36.e, een.Q0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarZ);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            wsx wsxVar = wsx.c;
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(wsxVar, isl.a, u291.r(qim0Var3, 32.0f), 0L, 0L, false, x340Var, wsx.d | 48, 56);
            cvx cvxVar2 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(qim0Var3, 8.0f));
            uwo1.e(yc30Var.b, null, cbx.d(x340Var).e, cbx.a(x340Var).b.a, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2018);
            cvx cvxVar3 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(qim0Var3, 8.0f));
            uwo1.e(yc30Var.c, null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2018);
            op71.g(x340Var, u291.h(qim0Var3, cbx.b(x340Var).b.a));
            boolean z = (i3 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                i2 = 4;
                objT = new zg20(function0, (byte) 4);
                x340Var.s0(objT);
            } else {
                i2 = 4;
            }
            z50 z50Var = z50.c;
            foo1.c(new gbx(z50Var, (Function0) objT), new idx(i2), null, null, null, null, null, null, null, null, apo.r(1868926627, new xc30(yc30Var, (byte) 0), x340Var), x340Var, 0, 48, 2044);
            cvx cvxVar4 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(qim0Var3, 8.0f));
            boolean z2 = (i3 & 896) == 256;
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new zg20(function1, (byte) 5);
                x340Var.s0(objT2);
            }
            foo1.c(new gbx(z50Var, (Function0) objT2), ldx.c, null, null, null, null, null, null, null, null, apo.r(-1923881958, new xc30(yc30Var, (byte) 1), x340Var), x340Var, 0, 48, 2044);
            x340Var = x340Var;
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qfx(i, yc30Var, function0, function1, qim0Var2, (byte) 20);
        }
    }

    public static final void c(wr21 wr21Var, String str, pxk0 pxk0Var, Function0 function0, vu30 vu30Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1293097483);
        int i2 = i | (b0kVar3.i(wr21Var) ? 4 : 2) | (b0kVar3.g(str) ? 32 : 16) | (b0kVar3.i(pxk0Var) ? 256 : 128) | (b0kVar3.i(function0) ? 2048 : 1024) | (b0kVar3.i(vu30Var) ? 16384 : 8192);
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            op80 op80VarB = gfe0.b(b0kVar3);
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = new aje1();
                b0kVar3.s0(objT);
            }
            aje1 aje1Var = (aje1) objT;
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar) {
                objT2 = v8r.q(Boolean.FALSE);
                b0kVar3.s0(objT2);
            }
            ven0 ven0Var = (ven0) objT2;
            boolean zI = b0kVar3.i(pxk0Var) | b0kVar3.i(ven0Var) | ((i2 & 7168) == 2048);
            Object objT3 = b0kVar3.T();
            if (zI || objT3 == m4cVar) {
                objT3 = new o8e1(pxk0Var, function0, ven0Var, (byte) 1);
                b0kVar3.s0(objT3);
            }
            i3u i3uVar = new i3u(229, false, false, false, false);
            j2i j2iVarR = apo.r(-561388638, new wy51(op80VarB, pxk0Var, aje1Var, wr21Var, str, function0, vu30Var, ven0Var), b0kVar3);
            b0kVar2 = b0kVar3;
            anm1.a((Function0) objT3, i3uVar, j2iVarR, b0kVar2, 384, 0);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new wnx0(wr21Var, str, pxk0Var, function0, vu30Var, i, (byte) 29);
        }
    }

    public static final void d(wr21 wr21Var, iu30 iu30Var, b0k b0kVar, int i) {
        wr21 wr21Var2;
        x340 x340Var;
        tie1 tie1Var;
        drr0 drr0Var;
        Object sie1Var;
        float f;
        qim0 qim0Var;
        ven0 ven0Var;
        iu30 iu30Var2 = iu30Var;
        String str = wr21Var.b;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1401074891);
        j06 j06Var = x340Var2.a;
        int i2 = i | (x340Var2.i(wr21Var) ? 4 : 2) | (x340Var2.i(iu30Var2) ? 32 : 16);
        if (x340Var2.Y(i2 & 1, (i2 & 19) != 18)) {
            x340Var2.i0(689661865);
            Object objT = x340Var2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(new tie1(0.0f, 0.0f));
                x340Var2.s0(objT);
            }
            ven0 ven0Var2 = (ven0) objT;
            Context context = (Context) x340Var2.k(AndroidCompositionLocals_androidKt.b);
            boolean zI = x340Var2.i(context) | x340Var2.i(ven0Var2);
            Object objT2 = x340Var2.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new vie1((byte) 0, context, ven0Var2);
                x340Var2.s0(objT2);
            }
            rih1 rih1Var = rih1.a;
            qxd0.i(rih1Var, (iu30) objT2, x340Var2);
            x340Var2.r(false);
            ss50 ss50Var = (ss50) x340Var2.k(t4k.l);
            float fX0 = ((wat) x340Var2.k(t4k.h)).X0(120.0f);
            Object objT3 = x340Var2.T();
            if (objT3 == m4cVar) {
                objT3 = v8r.q((Object) null);
                x340Var2.s0(objT3);
            }
            ven0 ven0Var3 = (ven0) objT3;
            Object objT4 = x340Var2.T();
            if (objT4 == m4cVar) {
                objT4 = us71.i(1.0f, x340Var2);
            }
            drr0 drr0Var2 = (drr0) objT4;
            Object objT5 = x340Var2.T();
            if (objT5 == m4cVar) {
                objT5 = kaa0.h(0L, x340Var2);
            }
            ven0 ven0Var4 = (ven0) objT5;
            Object objT6 = x340Var2.T();
            if (objT6 == m4cVar) {
                objT6 = us71.i(0.0f, x340Var2);
            }
            drr0 drr0Var3 = (drr0) objT6;
            tie1 tie1Var2 = (tie1) ven0Var3.getValue();
            if (tie1Var2 == null) {
                tie1Var2 = (tie1) ven0Var2.getValue();
            }
            nim0 nim0Var = nim0.a;
            qim0 qim0VarN = anm1.N("reserved-share-ticket-fullscreen", dug.f(u291.d(nim0Var, 1.0f), u7h.b, d4o1.a));
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarN);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
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
            gra graVar2 = een.h;
            h2c h2cVar = h2c.a;
            qim0 qim0VarC = u291.c(u291.f(uyn1.y(h2cVar.a(nim0Var, graVar2), 32.0f, 112.0f), 1.0f), 0.76f);
            boolean zG = x340Var2.g(tie1Var2) | x340Var2.i(drr0Var2) | x340Var2.i(ven0Var4) | x340Var2.i(drr0Var3);
            Object objT7 = x340Var2.T();
            if (zG || objT7 == m4cVar) {
                tie1 tie1Var3 = tie1Var2;
                objT7 = new e971(tie1Var3, drr0Var2, ven0Var4, drr0Var3, (byte) 13);
                tie1Var = tie1Var3;
                drr0Var = drr0Var2;
                x340Var2.s0(objT7);
            } else {
                tie1Var = tie1Var2;
                drr0Var = drr0Var2;
            }
            qim0 qim0VarC2 = i541.C(qim0VarC, (iu30) objT7);
            Float fValueOf = Float.valueOf(fX0);
            boolean zI2 = x340Var2.i(drr0Var) | x340Var2.i(ven0Var4) | x340Var2.i(drr0Var3) | x340Var2.i(ven0Var3) | x340Var2.d(fX0) | x340Var2.i(ss50Var);
            int i3 = i2 & 112;
            boolean z2 = zI2 | (i3 == 32);
            Object objT8 = x340Var2.T();
            if (z2 || objT8 == m4cVar) {
                f = 1.0f;
                qim0Var = qim0VarC2;
                iu30Var2 = iu30Var;
                ven0Var = ven0Var4;
                sie1Var = new sie1(fX0, iu30Var2, ss50Var, ven0Var, ven0Var3, drr0Var, drr0Var3);
                x340Var2.s0(sie1Var);
            } else {
                iu30Var2 = iu30Var;
                ven0Var = ven0Var4;
                f = 1.0f;
                qim0Var = qim0VarC2;
                sie1Var = objT8;
            }
            qim0 qim0VarC3 = f8d1.c(qim0Var, iu30Var2, fValueOf, (PointerInputEventHandler) sie1Var);
            boolean zI3 = x340Var2.i(drr0Var) | x340Var2.i(ven0Var);
            Object objT9 = x340Var2.T();
            if (zI3 || objT9 == m4cVar) {
                objT9 = new ep30(drr0Var, ven0Var, (byte) 2);
                x340Var2.s0(objT9);
            }
            qim0 qim0VarThen = i541.C(f8d1.b(qim0VarC3, rih1Var, (PointerInputEventHandler) objT9), nhe1.d).then(exd0.s(nim0Var, new qwc1(tie1Var, (byte) 18)));
            gfh0 gfh0VarC2 = t1c.c(graVar, false);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarThen);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC2, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar4);
            wr21Var2 = wr21Var;
            eso1.h(oi7.a(Uri.parse(wr21Var2.a), (gw70) null, (xb10) null, (yqi1) null, (jmr0) null, (jmr0) null, true, false, (j6m) null, (iu30) null, (iu30) null, (iu30) null, jhc1.c(360.0f, 640.0f), x340Var2, 100663296, 0, 98046), ihc1.y0(str) ? isl.a : new jsl(str), u291.d(nim0Var, f), (p3v) null, (zvx) null, (ecx) null, mif1.Q0, (tl3) null, (ColorFilter) null, x340Var2, 224256, 384);
            x340Var2.r(true);
            boolean z3 = i3 == 32;
            Object objT10 = x340Var2.T();
            if (z3 || objT10 == m4cVar) {
                objT10 = new pwc1(iu30Var2, (byte) 10);
                x340Var2.s0(objT10);
            }
            z50 z50Var = z50.c;
            gbx gbxVar = new gbx(z50Var, (Function0) objT10);
            ldx ldxVar = ldx.c;
            gdx gdxVarP = yla.p(x340Var2);
            qim0 qim0VarA = h2cVar.a(nim0Var, graVar);
            WeakHashMap weakHashMap = osl1.x;
            wro1.h(gbxVar, ldxVar, anm1.N("reserved-share-ticket-fullscreen-close", uyn1.B(too1.y(qim0VarA, lhc.g(x340Var2).l), 16.0f, 40.0f, 0.0f, 0.0f, 12)), null, gdxVarP, null, false, null, null, bnj.a, x340Var2, 0, 6, 984);
            boolean z4 = i3 == 32;
            Object objT11 = x340Var2.T();
            if (z4 || objT11 == m4cVar) {
                objT11 = new pwc1(iu30Var2, (byte) 11);
                x340Var2.s0(objT11);
            }
            foo1.c(new gbx(z50Var, (Function0) objT11), new idx(), anm1.N("reserved-share-ticket-fullscreen-share", uyn1.B(too1.y(h2cVar.a(nim0Var, een.X), lhc.g(x340Var2).l), 0.0f, 0.0f, 0.0f, 24.0f, 7)), null, yla.r(x340Var2), null, null, null, null, null, bnj.b, x340Var2, 0, 48, 2008);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            wr21Var2 = wr21Var;
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sdb1(wr21Var2, iu30Var2, i, (byte) 25);
        }
    }

    public static qim0 e(qim0 qim0Var, boolean z) {
        return zr7.i(qim0Var, new epe0((byte) 0, z));
    }

    public static im21 f(uww0 uww0Var, Intent intent, String str) {
        im21 im21VarA = uww0Var.a();
        im21VarA.G1 = intent;
        Bundle bundle = new Bundle();
        bundle.putString("entity-url", str);
        im21VarA.T0(bundle);
        return im21VarA;
    }

    public static Object g(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            hhg1.n(f4i1.c(i, "must be power of 2 between 2^1 and 2^30: "));
            return null;
        }
        if (i <= 256) {
            return new byte[i];
        }
        return i <= 65536 ? new short[i] : new int[i];
    }

    public static final iac0 h(View view) {
        while (view != null) {
            Object tag = view.getTag(2131431630);
            iac0 iac0Var = tag instanceof iac0 ? (iac0) tag : null;
            if (iac0Var != null) {
                return iac0Var;
            }
            Object objP = dm5.P(view);
            view = objP instanceof View ? (View) objP : null;
        }
        return null;
    }

    public static final BetamaxPlaybackErrorDevice i(m0u0 m0u0Var, String str, int i, Throwable th) {
        String message;
        eoa eoaVarN = BetamaxPlaybackErrorDevice.n();
        eoaVarN.s(i);
        if (th == null || (message = th.getMessage()) == null) {
            message = "";
        }
        eoaVarN.t(message);
        eoaVarN.u(th != null ? th.getClass().getSimpleName() : "");
        eoaVarN.v(v9p1.J(th));
        eoaVarN.w(v9p1.I(th));
        eoaVarN.x(str);
        eoaVarN.y(m0u0Var.a.a);
        eoaVarN.C(m0u0Var.d);
        return eoaVarN.build();
    }

    public static qim0 j(qim0 qim0Var, boolean z) {
        return Build.VERSION.SDK_INT >= 31 ? e(qim0Var, z) : zr7.i(qim0Var, new zw2(z, (Object) er31.b(4.0f), (byte) 13));
    }

    public static int k(int i, int i2, int i3) {
        return (i & (~i3)) | (i2 & i3);
    }

    public static int l(int i) {
        return (i + 1) * (i < 32 ? 4 : 2);
    }

    public static ksk0 m(String str, String str2) {
        return new ksk0(str, str2, (byte) 17);
    }

    public static final ArrayList n(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Object obj2 = null;
            Object obj3 = obj instanceof uqw ? ((uqw) obj).c : null;
            if (obj3 != null && ((obj3 instanceof eer0) || (obj3 instanceof dfr0) || (obj3 instanceof efr0))) {
                obj2 = obj3;
            }
            if (obj2 != null) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static int o(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int iB = j0o1.B(obj);
        int i2 = iB & i;
        int iT = t(i2, obj3);
        if (iT != 0) {
            int i3 = ~i;
            int i4 = iB & i3;
            int i5 = -1;
            while (true) {
                int i6 = iT - 1;
                int i7 = iArr[i6];
                if ((i7 & i3) == i4 && zno1.k(obj, objArr[i6]) && (objArr2 == null || zno1.k(obj2, objArr2[i6]))) {
                    int i8 = i7 & i;
                    if (i5 == -1) {
                        u(i2, i8, obj3);
                        return i6;
                    }
                    iArr[i5] = k(iArr[i5], i8, i);
                    return i6;
                }
                int i9 = i7 & i;
                if (i9 == 0) {
                    break;
                }
                i5 = i6;
                iT = i9;
            }
        }
        return -1;
    }

    public static final void p(View view, iac0 iac0Var) {
        view.setTag(2131431630, iac0Var);
    }

    public static final boolean q(nt81 nt81Var, b1y b1yVar) {
        e090 e090Var = nt81Var.e;
        boolean z = nt81Var.a;
        boolean zContains = nt81Var.c;
        a090 a090Var = a090.a;
        a090 a090Var2 = z ? a090Var : null;
        a090 a090Var3 = c090.a;
        a090 a090Var4 = yz80.a;
        a090 a090Var5 = d090.a;
        a090 a090Var6 = b090.a;
        List listI0 = f46.i0(new e090[]{a090Var3, a090Var4, a090Var5, a090Var6, a090Var2});
        int iC = l1d.C(b1yVar.b());
        if (iC != 0) {
            if (iC == 1) {
                a090Var = a090Var3;
            } else if (iC == 2) {
                a090Var = a090Var4;
            } else if (iC == 3) {
                a090Var = a090Var5;
            } else if (iC == 4) {
                a090Var = a090Var6;
            } else if (iC != 5) {
                eg.o();
                return false;
            }
            ArrayList arrayList = new ArrayList();
            boolean z2 = false;
            for (Object obj : listI0) {
                if (z2) {
                    arrayList.add(obj);
                } else if (u890.j((e090) obj, a090Var)) {
                    arrayList.add(obj);
                    z2 = true;
                }
            }
            zContains = arrayList.contains(e090Var);
        }
        return zContains || nt81Var.k;
    }

    public static final void r() {
        wf10 wf10Var = wf10.a;
        if (wgi1.c()) {
            mn10.a(new tw20((byte) 21), kn10.d1);
            mn10.a(new tw20((byte) 22), kn10.g1);
            mn10.a(new tw20((byte) 23), kn10.h1);
        }
    }

    public static pzc s(ArrayList arrayList, g661 g661Var, js50 js50Var) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(poz0.F(((j2t) it.next()).c()));
        }
        return upn1.t(new k65(upn1.t(new kx30(new suc0(new ArrayList(arrayList2), false, n5u.a()), js50Var, 5000L)), g661Var, arrayList, (byte) 6));
    }

    public static int t(int i, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & 255;
        }
        return obj instanceof short[] ? ((short[]) obj)[i] & 65535 : ((int[]) obj)[i];
    }

    public static void u(int i, int i2, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }
}

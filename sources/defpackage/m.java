package defpackage;

import android.graphics.Bitmap;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.mobius.functions.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import p.a0e1;
import p.a8o;
import p.afh0;
import p.ag6;
import p.ai4;
import p.ajq0;
import p.alg0;
import p.anm1;
import p.ao6;
import p.apo;
import p.b0k;
import p.b4g1;
import p.b7x;
import p.bab1;
import p.bno1;
import p.bo6;
import p.bp9;
import p.c21;
import p.c2b0;
import p.c380;
import p.c9n;
import p.cbx;
import p.cce;
import p.cfd;
import p.cir0;
import p.co6;
import p.cr0;
import p.cua;
import p.cvx;
import p.cwl1;
import p.cxc0;
import p.czo1;
import p.d36;
import p.d5p1;
import p.db;
import p.dko1;
import p.dug;
import p.dx1;
import p.een;
import p.eg;
import p.ely0;
import p.em0;
import p.em3;
import p.ep8;
import p.eqn1;
import p.er31;
import p.ew31;
import p.ewe1;
import p.exd0;
import p.f4i1;
import p.fct;
import p.fkj0;
import p.flb0;
import p.fof;
import p.foo1;
import p.fu1;
import p.g1c;
import p.gbx;
import p.gfh0;
import p.gfx;
import p.gln;
import p.gm50;
import p.grn1;
import p.guo1;
import p.gw70;
import p.h36;
import p.h52;
import p.hab0;
import p.hav0;
import p.hdh;
import p.hhg1;
import p.hjl;
import p.hmb0;
import p.hti1;
import p.hwd;
import p.hzj;
import p.i541;
import p.i8h1;
import p.idd1;
import p.ihc1;
import p.ihl;
import p.ipb1;
import p.iu30;
import p.ivo0;
import p.j06;
import p.j2i;
import p.jbh;
import p.jha1;
import p.jkr0;
import p.joa0;
import p.jpc;
import p.jw31;
import p.jy2;
import p.k8;
import p.kiv;
import p.kko;
import p.kp71;
import p.l2c;
import p.l3p1;
import p.l6o1;
import p.l811;
import p.lee1;
import p.llj;
import p.lmt0;
import p.los;
import p.m0t;
import p.m3g;
import p.m4c;
import p.m811;
import p.mbh;
import p.mj1;
import p.mod;
import p.mu1;
import p.mwq0;
import p.n4k;
import p.n82;
import p.n891;
import p.n8l1;
import p.n9d1;
import p.na2;
import p.nim0;
import p.nko1;
import p.ny1;
import p.o0i;
import p.o5m;
import p.o7h;
import p.obk1;
import p.oi6;
import p.oih;
import p.otw;
import p.p8p1;
import p.pap1;
import p.pbq;
import p.pdp1;
import p.pj8;
import p.pu;
import p.pyg;
import p.q59;
import p.q5t0;
import p.q7h;
import p.qcb1;
import p.qfl1;
import p.qgo1;
import p.qim0;
import p.qsw;
import p.qu1;
import p.qxd0;
import p.ra2;
import p.rbt;
import p.rce0;
import p.rfv0;
import p.rha1;
import p.rih1;
import p.rwq;
import p.ryx;
import p.rzo;
import p.s161;
import p.su;
import p.swc;
import p.t1c;
import p.t6;
import p.tgp1;
import p.tla;
import p.tlc1;
import p.tob1;
import p.too1;
import p.tto1;
import p.tyo1;
import p.tyq;
import p.u291;
import p.uhl;
import p.um5;
import p.uwr;
import p.uyn1;
import p.ven0;
import p.vnr0;
import p.vu30;
import p.vy71;
import p.wb6;
import p.wen0;
import p.wpb1;
import p.wqz0;
import p.wuj;
import p.x0d;
import p.x340;
import p.xd6;
import p.xf6;
import p.xfx;
import p.xgm1;
import p.xhl;
import p.xos0;
import p.xrc;
import p.xtb0;
import p.xu30;
import p.y50;
import p.y580;
import p.ycc1;
import p.ymd0;
import p.yok0;
import p.yqg;
import p.yuj;
import p.ywo1;
import p.z4p1;
import p.z6p1;
import p.zm7;
import p.zr7;
import p.zt6;
import p.zzq0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class m extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Bitmap bitmap, xd6 xd6Var, qim0 qim0Var, Function0 function0, b4g1 b4g1Var, int i) {
        super(2);
        this.a = (byte) 13;
        this.c = bitmap;
        this.d = xd6Var;
        this.b = qim0Var;
        this.f = function0;
        this.e = b4g1Var;
    }

    private final Object a(Object obj, Object obj2) {
        iu30 iu30Var = (iu30) this.d;
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        qcb1 qcb1Var = (qcb1) this.c;
        Object obj3 = this.b;
        ajq0 ajq0Var = (ajq0) obj3;
        x340 x340Var2 = x340Var;
        boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2);
        j06 j06Var = x340Var2.a;
        if (zY) {
            zzq0 zzq0VarS = l6o1.s(x340Var2);
            nim0 nim0Var = nim0.a;
            ((ajq0) obj3).g(qcb1Var, iu30Var, (jha1) this.e, (iu30) this.f, uyn1.w(nim0Var, zzq0VarS), x340Var2, 0);
            qim0 qim0VarW = uyn1.w(nim0Var, l6o1.s(x340Var2));
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            jw31 jw31VarA = ew31.a(new d36(16.0f, true, new um5(false)), een.N0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarW);
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
            nko1.H(jw31VarA, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            ajq0Var.a(x340Var2, 0);
            rbt rbtVar = (rbt) ajq0Var.a;
            cvx cvxVar2 = cbx.b(x340Var2).b;
            mbh mbhVarA = jbh.a(new d36(8.0f, true, new um5(false)), een.P0, x340Var2, 0);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, nim0Var);
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
            pbq pbqVar = rbtVar.n;
            x340Var2.i0(-234139734);
            pbqVar.c(x340Var2, 0);
            x340Var2.r(false);
            ajq0Var.h(qcb1Var.b, qcb1Var.h, iu30Var, x340Var2, 0);
            pbq pbqVar2 = rbtVar.l;
            x340Var2.i0(-234132438);
            pbqVar2.c(x340Var2, 0);
            x340Var2.r(false);
            x340Var2.r(true);
            x340Var2.r(true);
            pbq pbqVar3 = rbtVar.g;
            qim0 qim0VarW2 = uyn1.w(nim0Var, l6o1.s(x340Var2));
            cvx cvxVar3 = cbx.b(x340Var2).b;
            qgo1.g(pbqVar3, uyn1.B(qim0VarW2, 0.0f, 8.0f, 0.0f, 0.0f, 13), x340Var2);
            if (qcb1Var.f) {
                x340Var2.i0(-76675878);
                fct fctVar = rbtVar.q;
                qim0 qim0VarW3 = uyn1.w(nim0Var, l6o1.s(x340Var2));
                cvx cvxVar4 = cbx.b(x340Var2).b;
                qgo1.g(fctVar, uyn1.B(qim0VarW3, 0.0f, 8.0f, 0.0f, 0.0f, 13), x340Var2);
                x340Var2.r(false);
            } else {
                x340Var2.i0(-76451004);
                x340Var2.r(false);
            }
            pbq pbqVar4 = rbtVar.k;
            qim0 qim0VarW4 = uyn1.w(nim0Var, l6o1.s(x340Var2));
            cvx cvxVar5 = cbx.b(x340Var2).b;
            qgo1.g(pbqVar4, uyn1.B(qim0VarW4, 0.0f, 8.0f, 0.0f, 0.0f, 13), x340Var2);
            pbq pbqVar5 = rbtVar.m;
            qim0 qim0VarW5 = uyn1.w(nim0Var, l6o1.s(x340Var2));
            cvx cvxVar6 = cbx.b(x340Var2).b;
            cvx cvxVar7 = cbx.b(x340Var2).b;
            qgo1.g(pbqVar5, uyn1.B(qim0VarW5, 0.0f, 8.0f, 0.0f, 8.0f, 5), x340Var2);
            qim0 qim0VarB = u291.b(0.0f, 52.0f, 1, nim0Var);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode3 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM3 = x340Var2.m();
            qim0 qim0VarE3 = zr7.E(x340Var2, qim0VarB);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC, x340Var2, lljVar);
            nko1.H(xos0VarM3, x340Var2, lljVar2);
            x0d.q(iHashCode3, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE3, x340Var2, lljVar4);
            qgo1.g(rbtVar.c, uyn1.w(nim0Var, l6o1.r(x340Var2)), x340Var2);
            x340Var2.r(true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:51:0x019b  */
    /* JADX WARN: Code duplicated, block: B:52:0x019d  */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        boolean z;
        Integer numValueOf;
        boolean z2;
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        Object obj3 = this.e;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.f;
        Object obj5 = this.c;
        Object obj6 = this.b;
        Object obj7 = this.d;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                Function0 function0 = (Function0) obj4;
                vy71 vy71Var = (vy71) obj3;
                c9n c9nVar = (c9n) obj7;
                String str = (String) obj5;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    qim0 qim0VarB = uyn1.B((qim0) obj6, 0.0f, 8.0f, 0.0f, 16.0f, 5);
                    boolean zI = x340Var2.i(c9nVar) | x340Var2.i(vy71Var) | x340Var2.g(function0);
                    Object objT = x340Var2.T();
                    if (zI || objT == fkj0.X) {
                        objT = new i(c9nVar, vy71Var, function0, (byte) 1);
                        x340Var2.s0(objT);
                    }
                    Function0 function1 = (Function0) objT;
                    if (ihc1.y0(str)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return null;
                    }
                    foo1.f(new gbx(new y50(str), function1), qim0VarB, null, null, null, null, null, apo.r(-1438804858, new j(str, (byte) 1), x340Var2), x340Var2, 12582912, 124);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                guo1.b((m0t) obj5, (jkr0) obj7, (n8l1) obj3, (Consumer) obj4, (qim0) obj6, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                l3p1.b((String) obj5, (String) obj7, (hti1) obj3, (qim0) obj6, (String) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                z4p1.a((d5p1) obj5, (iu30) obj7, (em0) obj3, (hdh) obj4, (qim0) obj6, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                z6p1.a((j2i) obj6, (j2i) obj5, (j2i) obj7, (j2i) obj3, (j2i) obj4, (b0k) obj, czo1.p(28087));
                return rih1Var;
            case 5:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    fu1 fu1Var = (fu1) obj7;
                    otw.b((qu1) obj4, new mu1(((dx1) obj5).a, fu1Var.e == 1, (fu1Var.b.b() && ((Boolean) ((ven0) obj3).getValue()).booleanValue()) ? false : true), new joa0("atp-navigation"), (qim0) obj6, x340Var4, 8, 0);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 6:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                h52 h52Var = (h52) obj4;
                m4c m4cVar = fkj0.X;
                iu30 iu30Var = (iu30) obj3;
                xhl xhlVar = (xhl) obj5;
                if ((iIntValue3 & 11) == 2) {
                    x340 x340Var6 = x340Var5;
                    if (x340Var6.H()) {
                        x340Var6.b0();
                        return rih1Var;
                    }
                }
                ((ven0) obj6).setValue(rih1Var);
                int i = ((uhl) xhlVar).b;
                xhlVar.m();
                x340 x340Var7 = x340Var5;
                x340Var7.i0(-890556588);
                xhl xhlVar2 = (xhl) xhlVar.l().b;
                ihl ihlVarK = xhlVar2.k();
                ihl ihlVarK2 = xhlVar2.k();
                ihl ihlVarK3 = xhlVar2.k();
                String strO0 = cwl1.o0(x340Var7, 2131955138);
                boolean zG = x340Var7.g(iu30Var);
                Object objT2 = x340Var7.T();
                if (zG || objT2 == m4cVar) {
                    objT2 = new cr0(iu30Var, (byte) 29);
                    x340Var7.s0(objT2);
                }
                Function0 function2 = (Function0) objT2;
                Object objT3 = x340Var7.T();
                if (objT3 == m4cVar) {
                    objT3 = ny1.t;
                    x340Var7.s0(objT3);
                }
                qim0 qim0VarJ = xhl.j(nim0Var, ihlVarK, (iu30) objT3);
                uwr uwrVar = cbx.a;
                pap1.p(0, strO0, function2, x340Var7, uyn1.z(cbx.b(x340Var7).e.a, 0.0f, 2, qim0VarJ));
                if (h52Var.m) {
                    x340Var7.i0(-890079437);
                    boolean zI2 = x340Var7.i(ihlVarK);
                    Object objT4 = x340Var7.T();
                    if (zI2 || objT4 == m4cVar) {
                        objT4 = new pu(ihlVarK, (byte) 2);
                        x340Var7.s0(objT4);
                    }
                    z = false;
                    pap1.g(0, x340Var7, iu30Var, xhl.j(nim0Var, ihlVarK2, (iu30) objT4));
                    x340Var7.r(false);
                } else {
                    x340Var7.i0(-889731555);
                    x340Var7.r(false);
                    qim0 qim0VarX = uyn1.x(u291.f(nim0Var, 1.0f), cbx.b(x340Var7).e.a);
                    boolean zI3 = x340Var7.i(ihlVarK);
                    Object objT5 = x340Var7.T();
                    if (zI3 || objT5 == m4cVar) {
                        objT5 = new pu(ihlVarK, (byte) 3);
                        x340Var7.s0(objT5);
                    }
                    pap1.f(h52Var, iu30Var, xhl.j(qim0VarX, ihlVarK2, (iu30) objT5), x340Var7, 0);
                    if (h52Var.k) {
                        x340Var7.i0(-889256356);
                        qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                        Object objT6 = x340Var7.T();
                        if (objT6 == m4cVar) {
                            objT6 = ny1.X;
                            x340Var7.s0(objT6);
                        }
                        tto1.c(0, 6, 0L, 0L, x340Var7, xhl.j(qim0VarF, ihlVarK3, (iu30) objT6));
                        z = false;
                        x340Var7.r(false);
                    } else {
                        z = false;
                        x340Var7.i0(-888978627);
                        x340Var7.r(false);
                    }
                }
                x340Var7.r(z);
                if (((uhl) xhlVar).b == i) {
                    return rih1Var;
                }
                qxd0.S((su) obj7, x340Var7);
                return rih1Var;
            case 7:
                x340 x340Var8 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                na2 na2Var = (na2) obj4;
                ra2 ra2Var = (ra2) obj3;
                ven0 ven0Var = (ven0) obj7;
                x340 x340Var9 = x340Var8;
                if (x340Var9.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    mwq0 mwq0Var = (mwq0) obj6;
                    pdp1.a(mwq0Var, (bab1) obj5, apo.r(-239148842, new k8((Object) ven0Var, (Object) ra2Var, (Object) na2Var, (Object) mwq0Var, (byte) 4), x340Var9), apo.r(-888113280, new n891(ven0Var, ra2Var, na2Var, (byte) 12), x340Var9), x340Var9, 3456);
                } else {
                    x340Var9.b0();
                }
                return rih1Var;
            case 8:
                ((Number) obj2).intValue();
                mod.a((jy2) obj5, (ycc1) obj7, (yok0) obj3, (qim0) obj6, (Function0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 9:
                ((Number) obj2).intValue();
                lmt0.m((los) obj6, (i8h1) obj7, (String) obj5, (c2b0) obj3, (AtomicBoolean) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                l6o1.c((zm7) obj5, (kko) obj7, (rzo) obj3, (Function0) obj4, (qim0) obj6, (b0k) obj, czo1.p(9));
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                ((Number) obj2).intValue();
                qgo1.a(this.b, (xf6) obj7, (String) obj5, (xgm1) obj3, (iu30) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case grn1.d /* 12 */:
                x340 x340Var10 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                m4c m4cVar2 = fkj0.X;
                c21 c21Var = (c21) obj7;
                wqz0 wqz0Var = (wqz0) obj5;
                tob1 tob1Var = (tob1) obj6;
                x340 x340Var11 = x340Var10;
                if (x340Var11.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x340Var11.i0(-2127724848);
                    boolean zG2 = x340Var11.g(tob1Var) | x340Var11.g(wqz0Var) | x340Var11.g(c21Var);
                    Object objT7 = x340Var11.T();
                    if (zG2 || objT7 == m4cVar2) {
                        objT7 = new t6(tob1Var, wqz0Var, c21Var, (byte) 25);
                        x340Var11.s0(objT7);
                    }
                    qim0 qim0VarC = i541.C(nim0Var, (iu30) objT7);
                    if (((Boolean) ((ven0) obj3).getValue()).booleanValue()) {
                        Object objT8 = x340Var11.T();
                        if (objT8 == m4cVar2) {
                            objT8 = ag6.g;
                            x340Var11.s0(objT8);
                        }
                        qim0VarC = qim0VarC.then(s161.a(nim0Var, (iu30) objT8));
                    }
                    x340Var11.r(false);
                    vu30 vu30Var = (vu30) obj4;
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode = Long.hashCode(x340Var11.T);
                    xos0 xos0VarM = x340Var11.m();
                    qim0 qim0VarE = zr7.E(x340Var11, qim0VarC);
                    hzj.A.getClass();
                    if (x340Var11.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var11.m0();
                    if (x340Var11.S) {
                        x340Var11.l(n4kVar);
                    } else {
                        x340Var11.v0();
                    }
                    nko1.H(gfh0VarC, x340Var11, y580.O0);
                    nko1.H(xos0VarM, x340Var11, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var11, y580.R0);
                    nko1.F(x340Var11);
                    nko1.H(qim0VarE, x340Var11, y580.Y);
                    qgo1.f((vnr0) vu30Var.invoke(x340Var11, 0), null, new a0e1(3), 0, false, null, x340Var11, 8, 58);
                    x340Var11.r(true);
                } else {
                    x340Var11.b0();
                }
                return rih1Var;
            case 13:
                ((Number) obj2).intValue();
                oi6.a((Bitmap) obj5, (xd6) obj7, (qim0) obj6, (Function0) obj4, (b4g1) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 14:
                x340 x340Var12 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                co6 co6Var = (co6) obj6;
                x340 x340Var13 = x340Var12;
                if (x340Var13.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    qsw.c(new obk1(((ao6) co6Var.e).a), apo.r(-934455458, new bo6((gw70) obj5, (em3) obj7, (xfx) obj3, (qfl1) obj4, co6Var, rwq.h((wen0) ((idd1) co6Var.f).getValue(), x340Var13, 0), rwq.h((wen0) ((idd1) co6Var.g).getValue(), x340Var13, 0), (byte) 2), x340Var13), x340Var13, 48);
                } else {
                    x340Var13.b0();
                }
                return rih1Var;
            case 15:
                ((Number) obj2).intValue();
                dko1.e((o5m) obj5, (iu30) obj7, (em3) obj3, (xfx) obj4, (qim0) obj6, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 16:
                ((Number) obj2).intValue();
                bno1.h((String) obj5, (rha1) obj6, (List) obj7, (xu30) obj3, (Function0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 17:
                ((Number) obj2).intValue();
                tyo1.a((ep8) obj5, (iu30) obj7, (yqg) obj3, (ai4) obj4, (qim0) obj6, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 18:
                ((Number) obj2).intValue();
                gm50.a((a8o) obj5, (iu30) obj7, (cfd) obj3, (ivo0) obj4, (qim0) obj6, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 19:
                x340 x340Var14 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                m4c m4cVar3 = fkj0.X;
                Function0 function3 = (Function0) obj4;
                l2c l2cVar = (l2c) obj5;
                x340 x340Var15 = x340Var14;
                if (x340Var15.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    qim0 qim0Var = (qim0) obj6;
                    boolean zG3 = x340Var15.g(function3);
                    Object objT9 = x340Var15.T();
                    if (zG3 || objT9 == m4cVar3) {
                        objT9 = new pj8(function3, (byte) 11);
                        x340Var15.s0(objT9);
                    }
                    qim0 qim0VarK = eqn1.k(qim0Var, (Function0) objT9);
                    uwr uwrVar2 = cbx.a;
                    long j = cbx.a(x340Var15).d.b;
                    cua cuaVar = cbx.b(x340Var15).f;
                    qim0 qim0VarF2 = dug.f(qim0VarK, j, er31.b(16.0f));
                    cvx cvxVar = cbx.b(x340Var15).b;
                    qim0 qim0VarZ = uyn1.z(0.0f, 8.0f, 1, qim0VarF2);
                    cvx cvxVar2 = cbx.b(x340Var15).b;
                    qim0 qim0VarB2 = uyn1.B(qim0VarZ, 8.0f, 0.0f, 0.0f, 0.0f, 14);
                    boolean zG4 = x340Var15.g(l2cVar);
                    Object objT10 = x340Var15.T();
                    if (zG4 || objT10 == m4cVar3) {
                        objT10 = new tla(l2cVar, (byte) 21);
                        x340Var15.s0(objT10);
                    }
                    qim0 qim0VarB3 = s161.b(qim0VarB2, false, (iu30) objT10);
                    cce cceVar = (cce) obj7;
                    o0i o0iVar = (o0i) obj3;
                    jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var15, 0);
                    int iHashCode2 = Long.hashCode(x340Var15.T);
                    xos0 xos0VarM2 = x340Var15.m();
                    qim0 qim0VarE2 = zr7.E(x340Var15, qim0VarB3);
                    hzj.A.getClass();
                    if (x340Var15.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var15.m0();
                    if (x340Var15.S) {
                        x340Var15.l(n4kVar);
                    } else {
                        x340Var15.v0();
                    }
                    nko1.H(jw31VarA, x340Var15, y580.O0);
                    nko1.H(xos0VarM2, x340Var15, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode2), x340Var15, y580.R0);
                    nko1.F(x340Var15);
                    nko1.H(qim0VarE2, x340Var15, y580.Y);
                    gfx.b(1, apo.r(-804666933, new zt6(l2cVar, cceVar, o0iVar, (byte) 26), x340Var15), x340Var15, 54);
                    x340Var15.r(true);
                } else {
                    x340Var15.b0();
                }
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                x340 x340Var16 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                x340 x340Var17 = x340Var16;
                if (x340Var17.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    qsw.c((obk1) obj6, apo.r(-975489303, new wb6((q59) obj5, (ymd0) obj7, (j2i) obj3, (Function0) obj4, (byte) 26), x340Var17), x340Var17, 48);
                } else {
                    x340Var17.b0();
                }
                return rih1Var;
            case 21:
                tlc1 tlc1Var = (tlc1) obj;
                long j2 = ((hjl) obj2).a;
                c380<vu30> c380Var = (c380) obj6;
                rfv0 rfv0Var = (rfv0) obj7;
                lee1 lee1Var = (lee1) obj3;
                lee1 lee1Var2 = (lee1) obj4;
                ArrayList arrayList = new ArrayList(q7h.U(c380Var, 10));
                for (vu30 vu30Var2 : c380Var) {
                    int i2 = rfv0Var.b;
                    rfv0Var.b = i2 + 1;
                    List listP = tlc1Var.P(f4i1.c(i2, "position-"), new j2i(-1571296665, new swc((Object) vu30Var2, (Object) lee1Var, (Object) lee1Var2, (byte) 0), true));
                    ArrayList arrayList2 = new ArrayList(q7h.U(listP, 10));
                    Iterator it = listP.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((afh0) it.next()).H(j2));
                    }
                    Iterator it2 = arrayList2.iterator();
                    if (it2.hasNext()) {
                        numValueOf = Integer.valueOf(((q5t0) it2.next()).a);
                        while (it2.hasNext()) {
                            Integer numValueOf2 = Integer.valueOf(((q5t0) it2.next()).a);
                            if (numValueOf.compareTo(numValueOf2) < 0) {
                                numValueOf = numValueOf2;
                            }
                        }
                    } else {
                        numValueOf = null;
                    }
                    arrayList.add(Integer.valueOf(numValueOf != null ? numValueOf.intValue() : 0));
                }
                iu30 iu30Var2 = (iu30) obj5;
                Integer num = (Integer) o7h.D0(arrayList);
                iu30Var2.invoke(Integer.valueOf(num != null ? num.intValue() : 0));
                return tlc1Var.S(0, 0, b7x.a, jpc.Y);
            case 22:
                String str2 = (String) obj5;
                x340 x340Var18 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                ven0 ven0Var2 = (ven0) obj3;
                m4c m4cVar4 = fkj0.X;
                x340 x340Var19 = x340Var18;
                if (x340Var19.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    boolean zG5 = x340Var19.g(str2) | x340Var19.g(obj6);
                    iu30 iu30Var3 = (iu30) obj4;
                    Object objT11 = x340Var19.T();
                    if (zG5 || objT11 == m4cVar4) {
                        objT11 = iu30Var3.invoke(new pyg(this.b, true, xrc.h, (iu30) null, true));
                        x340Var19.s0(objT11);
                    }
                    Object obj8 = objT11;
                    ipb1 ipb1VarC = wpb1.C(str2, (tyq) obj7, obj8, x340Var19, 0, 8);
                    kiv kivVar = alg0.e;
                    Boolean bool = Boolean.TRUE;
                    ely0 ely0VarA = kivVar.a(bool);
                    ely0 ely0VarA2 = alg0.a.a(bool);
                    kiv kivVar2 = alg0.b;
                    boolean zI4 = x340Var19.i(ven0Var2);
                    Object objT12 = x340Var19.T();
                    if (zI4 || objT12 == m4cVar4) {
                        objT12 = new bp9(ven0Var2, (byte) 15);
                        x340Var19.s0(objT12);
                    }
                    mod.c(new ely0[]{ely0VarA, ely0VarA2, kivVar2.a(objT12)}, apo.r(793229889, new g1c((tyq) obj7, obj8, ipb1VarC, (byte) 1), x340Var19), x340Var19, 56);
                } else {
                    x340Var19.b0();
                }
                return rih1Var;
            case 23:
                x340 x340Var20 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var21 = x340Var20;
                if (x340Var21.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    ryx ryxVar = (ryx) obj6;
                    ywo1.b((String) obj5, ryxVar, nim0.a, null, apo.r(1726344186, new hwd(ryxVar, (Function0) obj4, (c9n) obj7, (String) obj3), x340Var21), x340Var21, 24576, 8);
                } else {
                    x340Var21.b0();
                }
                return rih1Var;
            case 24:
                ((Number) obj2).intValue();
                guo1.c((fof) obj5, (mj1) obj7, (kp71) obj3, (gln) obj4, (qim0) obj6, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 25:
                hav0 hav0Var = (hav0) obj;
                float fFloatValue = ((Number) obj2).floatValue();
                long jB = p8p1.B(hav0Var, true);
                l811 l811Var = (l811) obj6;
                int i3 = (int) (jB >> 32);
                if (Math.abs(Float.intBitsToFloat(i3)) > Math.abs(Float.intBitsToFloat((int) (jB & 4294967295L))) * 3.0f) {
                    flb0 flb0Var = (flb0) obj5;
                    n9d1 n9d1Var = (n9d1) obj7;
                    n9d1 n9d1Var2 = (n9d1) obj3;
                    boolean z3 = Float.intBitsToFloat(i3) > 0.0f;
                    int iOrdinal = flb0Var.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            eg.o();
                            return null;
                        }
                        if ((!z3 || n9d1Var2 == null) && (z3 || n9d1Var == null)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } else if ((!z3 || n9d1Var == null) && (z3 || n9d1Var2 == null)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    z2 = false;
                }
                l811Var.a = z2;
                if (z2) {
                    hav0Var.a();
                    ((m811) obj4).a = fFloatValue;
                }
                return rih1Var;
            case 26:
                x340 x340Var22 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                cxc0 cxc0Var = (cxc0) obj3;
                m3g m3gVar = (m3g) obj7;
                ven0 ven0Var3 = (ven0) obj5;
                x340 x340Var23 = x340Var22;
                if (x340Var23.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    qim0 qim0VarN = anm1.N("list_ux_platform_chip_bar_row", nim0Var);
                    uwr uwrVar3 = cbx.a;
                    qim0 qim0VarS = exd0.s(qim0VarN, new n82(cbx.a(x340Var23).a.c, (xtb0) obj6, (byte) 3));
                    cvx cvxVar3 = cbx.b(x340Var23).b;
                    cvx cvxVar4 = cbx.b(x340Var23).b;
                    cvx cvxVar5 = cbx.b(x340Var23).b;
                    zzq0 zzq0Var = new zzq0(16.0f, 0.0f, 16.0f, 12.0f);
                    xtb0 xtb0Var = (xtb0) obj6;
                    boolean zG6 = x340Var23.g(ven0Var3) | x340Var23.i(m3gVar) | x340Var23.g(cxc0Var);
                    Map map = (Map) obj4;
                    Object objT13 = x340Var23.T();
                    if (zG6 || objT13 == fkj0.X) {
                        objT13 = new db(ven0Var3, map, m3gVar, cxc0Var, (byte) 28);
                        x340Var23.s0(objT13);
                    }
                    too1.b(qim0VarS, xtb0Var, zzq0Var, (iu30) objT13, x340Var23, 0, 0);
                } else {
                    x340Var23.b0();
                }
                return rih1Var;
            case 27:
                ((Number) obj2).intValue();
                ((oih) obj5).l((ewe1) obj7, (Function0) obj4, (Function0) obj3, (qim0) obj6, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 28:
                return a(obj, obj2);
            default:
                x340 x340Var24 = (b0k) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                x340 x340Var25 = x340Var24;
                if (x340Var25.Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    rce0.a(cwl1.B(((cir0) obj6).g()), apo.r(-2037558639, new wuj((yuj) obj5, (j2i) obj7, this.e, (iu30) obj4, (byte) 1), x340Var25), x340Var25, 48);
                } else {
                    x340Var25.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(byte b, int i, Object obj, Object obj2, Object obj3, Object obj4, String str) {
        super(2);
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = str;
        this.e = obj3;
        this.f = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Object obj, Object obj2, Object obj3, Object obj4, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Object obj, Object obj2, Object obj3, qim0 qim0Var, Object obj4, int i, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = qim0Var;
        this.f = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, Object obj, tyq tyqVar, ven0 ven0Var, iu30 iu30Var) {
        super(2);
        this.a = (byte) 22;
        this.c = str;
        this.b = obj;
        this.d = tyqVar;
        this.e = ven0Var;
        this.f = iu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, ryx ryxVar, Function0 function0, c9n c9nVar, String str2) {
        super(2);
        this.a = (byte) 23;
        this.c = str;
        this.b = ryxVar;
        this.f = function0;
        this.d = c9nVar;
        this.e = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, rha1 rha1Var, List list, xu30 xu30Var, Function0 function0, int i) {
        super(2);
        this.a = (byte) 16;
        this.c = str;
        this.b = rha1Var;
        this.d = list;
        this.e = xu30Var;
        this.f = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(dx1 dx1Var, fu1 fu1Var, ven0 ven0Var, qu1 qu1Var, qim0 qim0Var) {
        super(2);
        this.a = (byte) 5;
        this.c = dx1Var;
        this.d = fu1Var;
        this.e = ven0Var;
        this.f = qu1Var;
        this.b = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(oih oihVar, ewe1 ewe1Var, Function0 function0, Function0 function1, qim0 qim0Var, int i) {
        super(2);
        this.a = (byte) 27;
        this.c = oihVar;
        this.d = ewe1Var;
        this.f = function0;
        this.e = function1;
        this.b = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(j2i j2iVar, j2i j2iVar2, j2i j2iVar3, j2i j2iVar4, j2i j2iVar5, int i) {
        super(2);
        this.a = (byte) 4;
        this.b = j2iVar;
        this.c = j2iVar2;
        this.d = j2iVar3;
        this.e = j2iVar4;
        this.f = j2iVar5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(qim0 qim0Var, Function0 function0, l2c l2cVar, cce cceVar, o0i o0iVar) {
        super(2);
        this.a = (byte) 19;
        this.b = qim0Var;
        this.f = function0;
        this.c = l2cVar;
        this.d = cceVar;
        this.e = o0iVar;
    }
}

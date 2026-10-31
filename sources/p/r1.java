package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class r1 extends hab0 implements bv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ maa b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r1(maa maaVar, byte b) {
        super(5);
        this.a = b;
        this.b = maaVar;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        kp0 kp0Var = (kp0) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        ven0 ven0VarS = v8r.s(kp0Var.k, x340Var);
        String strA = kp0Var.d.a();
        gq0 gq0Var = new gq0(strA);
        op0 op0Var = this.b;
        x340 x340Var2 = x340Var;
        boolean zI = x340Var2.i(op0Var) | x340Var2.g(strA) | x340Var2.i(ven0VarS);
        Object objT = x340Var2.T();
        if (zI || objT == m4cVar) {
            objT = new c6(op0Var, strA, ven0VarS, (lnm) null, (byte) 6);
            x340Var2.s0(objT);
        }
        qxd0.t(gq0Var, x340Var2, (vu30) objT);
        ldx ldxVar = ldx.c;
        String strO0 = cwl1.o0(x340Var2, 2131951976);
        if (ihc1.y0(strO0)) {
            hhg1.n("Please consider providing a non-empty action label to provide a more accessible experience for everyone. You can use SelfDescribed if the content description is sufficient.");
            return null;
        }
        y50 y50Var = new y50(strO0);
        boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256;
        Object objT2 = x340Var2.T();
        if (z || objT2 == m4cVar) {
            objT2 = new p1(iu30Var, (byte) 21);
            x340Var2.s0(objT2);
        }
        gbx gbxVar = new gbx(y50Var, (Function0) objT2);
        gdx gdxVarS = yla.s(x340Var2);
        x340Var2.i0(71001739);
        String str = wyd1.a;
        nim0 nim0Var = nim0.a;
        qim0 qim0VarN = anm1.N(str, nim0Var);
        if (kp0Var.j) {
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var2).g;
            qim0VarN = qim0VarN.then(dug.f(u291.r(nim0Var, 40.0f), cbx.a(x340Var2).a.c, er31.a));
        }
        x340Var2.r(false);
        wro1.h(gbxVar, ldxVar, qim0VarN, null, gdxVarS, null, false, null, null, i3i.a, x340Var2, 0, 6, 984);
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        era eraVar = een.Q0;
        qim0 qim0VarF = u291.f(nim0.a, 1.0f);
        uwr uwrVar = cbx.a;
        cvx cvxVar = cbx.b(x340Var).b;
        qim0 qim0VarY = uyn1.y(qim0VarF, 16.0f, cbx.b(x340Var).b.b);
        bc1 bc1Var = this.b;
        mbh mbhVarA = jbh.a(h36.c, eraVar, x340Var, 0);
        x340 x340Var2 = x340Var;
        int iHashCode = Long.hashCode(x340Var2.T);
        xos0 xos0VarM = x340Var2.m();
        qim0 qim0VarE = zr7.E(x340Var, qim0VarY);
        hzj.A.getClass();
        x340 x340Var3 = x340Var;
        if (x340Var3.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var3.m0();
        if (x340Var3.S) {
            x340Var3.l(hmb0.t1);
        } else {
            x340Var3.v0();
        }
        nko1.H(mbhVarA, x340Var, y580.O0);
        nko1.H(xos0VarM, x340Var, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
        nko1.F(x340Var);
        nko1.H(qim0VarE, x340Var, y580.Y);
        bc1Var.e(x340Var, 0);
        Object objT = x340Var3.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            objT = gx0.N0;
            x340Var3.s0(objT);
        }
        bc1Var.i((iu30) objT, x340Var, 6);
        bc1Var.j(x340Var, 0);
        Object objT2 = x340Var3.T();
        if (objT2 == m4cVar) {
            objT2 = gx0.O0;
            x340Var3.s0(objT2);
        }
        bc1Var.i((iu30) objT2, x340Var, 6);
        bc1Var.f(x340Var, 0);
        Object objT3 = x340Var3.T();
        if (objT3 == m4cVar) {
            objT3 = gx0.P0;
            x340Var3.s0(objT3);
        }
        bc1Var.i((iu30) objT3, x340Var, 6);
        int i = (iIntValue & 896) ^ 384;
        boolean z = (i > 256 && x340Var3.g(iu30Var)) || (iIntValue & 384) == 256;
        Object objT4 = x340Var3.T();
        if (z || objT4 == m4cVar) {
            objT4 = new cr0(iu30Var, (byte) 7);
            x340Var3.s0(objT4);
        }
        bc1Var.h((Function0) objT4, x340Var, 0);
        Object objT5 = x340Var3.T();
        if (objT5 == m4cVar) {
            objT5 = gx0.Q0;
            x340Var3.s0(objT5);
        }
        bc1Var.i((iu30) objT5, x340Var, 6);
        boolean z2 = (i > 256 && x340Var3.g(iu30Var)) || (iIntValue & 384) == 256;
        Object objT6 = x340Var3.T();
        if (z2 || objT6 == m4cVar) {
            objT6 = new cr0(iu30Var, (byte) 8);
            x340Var3.s0(objT6);
        }
        bc1Var.g((Function0) objT6, x340Var, 0);
        x340Var3.r(true);
        return rih1.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        fi1 fi1Var = (fi1) obj2;
        b0k b0kVar = (b0k) obj4;
        ((Number) obj5).intValue();
        ei1 ei1Var = this.b;
        z6p1.a(apo.r(-1572913832, new di1(ei1Var, fi1Var, (byte) 0), b0kVar), apo.r(-401705161, new di1(ei1Var, fi1Var, (byte) 1), b0kVar), apo.r(769503510, new di1(ei1Var, fi1Var, (byte) 2), b0kVar), apo.r(1940712181, new di1(ei1Var, fi1Var, (byte) 3), b0kVar), apo.r(-1183046444, new di1(ei1Var, fi1Var, (byte) 4), b0kVar), b0kVar, 28086);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        int i;
        llj lljVar = y580.Y;
        llj lljVar2 = y580.R0;
        llj lljVar3 = y580.N0;
        llj lljVar4 = y580.O0;
        ij1 ij1Var = (ij1) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        era eraVar = een.P0;
        m4c m4cVar = fkj0.X;
        mj1 mj1Var = this.b;
        if ((iIntValue & 48) == 0) {
            i = ((iIntValue & 64) == 0 ? x340Var.g(ij1Var) : x340Var.i(ij1Var) ? 32 : 16) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 384) == 0) {
            i |= x340Var.i(iu30Var) ? 256 : 128;
        }
        x340 x340Var2 = x340Var;
        boolean zY = x340Var2.Y(i & 1, (i & 1169) != 1168);
        j06 j06Var = x340Var2.a;
        rih1 rih1Var = rih1.a;
        if (!zY) {
            x340Var2.b0();
            return rih1Var;
        }
        if (!(ij1Var instanceof gj1)) {
            return rih1Var;
        }
        gj1 gj1Var = (gj1) ij1Var;
        int iC = l1d.C(gj1Var.b);
        nim0 nim0Var = nim0.a;
        n4k n4kVar = hmb0.t1;
        f36 f36Var = h36.c;
        if (iC == 0) {
            x340Var2.i0(486531360);
            qim0 qim0VarC = u291.c(nim0Var, 1.0f);
            mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarC);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA, x340Var2, lljVar4);
            nko1.H(xos0VarM, x340Var2, lljVar3);
            x0d.q(iHashCode, x340Var2, lljVar2, x340Var2);
            nko1.H(qim0VarE, x340Var2, lljVar);
            qim0 qim0VarN = anm1.N("loading_element", u291.d(nim0Var, 1.0f));
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarN);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC, x340Var2, lljVar4);
            nko1.H(xos0VarM2, x340Var2, lljVar3);
            x0d.q(iHashCode2, x340Var2, lljVar2, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar);
            xto1.e(null, 5, 0L, 0L, x340Var2, 48, 13);
            us71.m(x340Var2, true, true, false);
            return rih1Var;
        }
        if (iC != 1) {
            if (iC == 2) {
                x340Var2.i0(486541979);
                qim0 qim0VarC2 = u291.c(nim0Var, 1.0f);
                mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var2, 0);
                int iHashCode3 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM3 = x340Var2.m();
                qim0 qim0VarE3 = zr7.E(x340Var2, qim0VarC2);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(mbhVarA2, x340Var2, lljVar4);
                nko1.H(xos0VarM3, x340Var2, lljVar3);
                x0d.q(iHashCode3, x340Var2, lljVar2, x340Var2);
                nko1.H(qim0VarE3, x340Var2, lljVar);
                qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var2).b;
                qim0 qim0VarN2 = anm1.N("error_element", uyn1.x(qim0VarD, 8.0f));
                gfh0 gfh0VarC2 = t1c.c(een.X, false);
                int iHashCode4 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM4 = x340Var2.m();
                qim0 qim0VarE4 = zr7.E(x340Var2, qim0VarN2);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(gfh0VarC2, x340Var2, lljVar4);
                nko1.H(xos0VarM4, x340Var2, lljVar3);
                x0d.q(iHashCode4, x340Var2, lljVar2, x340Var2);
                nko1.H(qim0VarE4, x340Var2, lljVar);
                z6q z6qVar = mj1Var.c;
                boolean z = (i & 896) == 256;
                Object objT = x340Var2.T();
                if (z || objT == m4cVar) {
                    objT = new cr0(iu30Var, (byte) 17);
                    x340Var2.s0(objT);
                }
                otw.c(z6qVar.a((Function0) objT), rih1Var, (qim0) null, (ipb1) null, x340Var2, 48, 12);
                us71.m(x340Var2, true, true, false);
                return rih1Var;
            }
            if (iC != 3) {
                throw p3d1.k(x340Var2, 486531499, false);
            }
        }
        x340Var2.i0(-2096515506);
        Object objT2 = x340Var2.T();
        if (objT2 == m4cVar) {
            m5p m5pVar = mj1Var.t;
            AtomicReferenceArray atomicReferenceArray = p6r0.e;
            objT2 = m5pVar.a(yon1.C0().a, gj1Var.c, new jj1(mj1Var, (byte) 4));
            x340Var2.s0(objT2);
        }
        fm50 fm50Var = (fm50) objT2;
        Object objT3 = x340Var2.T();
        if (objT3 == m4cVar) {
            r6h1 r6h1Var = r6h1.c;
            objT3 = new suk0();
            x340Var2.s0(objT3);
        }
        suk0 suk0Var = (suk0) objT3;
        Object objT4 = x340Var2.T();
        if (objT4 == m4cVar) {
            objT4 = suk0Var.b();
            x340Var2.s0(objT4);
        }
        r6h1 r6h1Var2 = (r6h1) objT4;
        boolean zI = x340Var2.i(r6h1Var2);
        Object objT5 = x340Var2.T();
        if (zI || objT5 == m4cVar) {
            objT5 = new cb1(r6h1Var2, (byte) 3);
            x340Var2.s0(objT5);
        }
        dgo1.c("chatSharePage", (iu30) objT5, apo.r(99097118, new x2((Object) ij1Var, (Object) iu30Var, (Object) mj1Var, (Object) fm50Var, (byte) 13), x340Var2), x340Var2, 390);
        x340Var2.r(false);
        return rih1Var;
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        Object obj6;
        ksw kswVar = (ksw) obj;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        tm tmVar = this.b;
        if ((iIntValue & 6) == 0) {
            i = (x340Var.g(kswVar) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 384) == 0) {
            i |= x340Var.i(iu30Var) ? 256 : 128;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 1155) != 1154)) {
            Object objT = x340Var2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                obj6 = objT;
                q811 q811Var = new q811();
                q811Var.a = Boolean.FALSE;
                x340Var2.s0(q811Var);
                obj6 = q811Var;
            }
            obj6 = objT;
            q811 q811Var2 = (q811) obj6;
            Object objT2 = x340Var2.T();
            if (objT2 == m4cVar) {
                objT2 = qxd0.M(o6x.a, x340Var2);
                x340Var2.s0(objT2);
            }
            c9n c9nVar = (c9n) objT2;
            boolean zI = x340Var2.i(q811Var2) | x340Var2.i(c9nVar) | x340Var2.i(tmVar);
            Object objT3 = x340Var2.T();
            if (zI || objT3 == m4cVar) {
                objT3 = new t6(q811Var2, c9nVar, tmVar, (byte) 4);
                x340Var2.s0(objT3);
            }
            n9p1.e(kswVar, (iu30) objT3, x340Var2, i & 14);
            irx irxVar = irx.c;
            String strO0 = cwl1.o0(x340Var2, 2131962130);
            boolean z = (i & 896) == 256;
            Object objT4 = x340Var2.T();
            if (z || objT4 == m4cVar) {
                objT4 = new cr0(iu30Var, (byte) 18);
                x340Var2.s0(objT4);
            }
            iko1.m(irxVar, strO0, null, false, null, null, new gbx(z50.c, (Function0) objT4), null, x340Var2, irx.d, 188);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        iu30 iu30Var = (iu30) obj3;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        boolean z = ((bm1) obj2).b;
        x340 x340Var = (b0k) obj4;
        boolean zH = x340Var.h(z);
        Object objT = x340Var.T();
        if (zH || objT == m4cVar) {
            objT = z ? xl1.b : xl1.a;
            x340Var.s0(objT);
        }
        xl1 xl1Var = (xl1) objT;
        boolean zH2 = x340Var.h(z);
        yxb0 yxb0Var = this.b;
        Object objT2 = x340Var.T();
        if (zH2 || objT2 == m4cVar) {
            pk1 pk1Var = new pk1(z ? qk1.b : qk1.a, false, (String) yxb0Var.e, (String) yxb0Var.f, (j7p1) null, 18);
            x340Var.s0(pk1Var);
            objT2 = pk1Var;
        }
        pk1 pk1Var2 = (pk1) objT2;
        qim0 qim0VarN = anm1.N("standard_add_to_header_action_" + z, nim0.a);
        boolean zE = ((((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256) | x340Var.e(xl1Var.ordinal());
        Object objT3 = x340Var.T();
        if (zE || objT3 == m4cVar) {
            objT3 = new y4(iu30Var, xl1Var, (byte) 19);
            x340Var.s0(objT3);
        }
        h7p1.a(pk1Var2, new gbx(z50.c, (Function0) objT3), qim0VarN, null, null, x340Var, 0, 24);
        return rih1.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int iIntValue = ((Number) obj5).intValue();
        this.b.f((cm1) obj2, (iu30) obj3, (b0k) obj4, (iIntValue >> 3) & 126);
        return rih1.a;
    }

    private final Object j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        b0k b0kVar = (b0k) obj4;
        ((Number) obj5).intValue();
        nyx.a(2, (wux) null, apo.r(107617962, new q1(obj2, (iu30) obj3, (Object) this.b, (byte) 17), b0kVar), b0kVar, 3078, 6);
        return rih1.a;
    }

    private final Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        nu1 nu1Var = (nu1) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        qu1 qu1Var = this.b;
        tu1 tu1Var = nu1Var.a;
        boolean z = nu1Var.c;
        boolean z2 = nu1Var.d;
        boolean z3 = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z3 || objT == fkj0.X) {
            objT = new cr0(iu30Var, (byte) 22);
            x340Var2.s0(objT);
        }
        i9p1.a(tu1Var, (Function0) objT, apo.r(1788760453, new t20(qu1Var, iu30Var, (byte) 2), x340Var2), null, z, z2, apo.r(-225971574, new wh(qu1Var, nu1Var, (byte) 2), x340Var2), x340Var2, 1573248);
        return rih1.a;
    }

    private final Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int iIntValue = ((Number) obj5).intValue();
        this.b.e((iu30) obj3, (b0k) obj4, (iIntValue >> 6) & 14);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        tob1 tob1Var;
        String strK;
        t72 t72Var = (t72) obj2;
        iu30 iu30Var = (iu30) obj3;
        int iIntValue = ((Number) obj5).intValue();
        z72 z72Var = this.b;
        x340 x340Var = (b0k) obj4;
        Object objT = x340Var.T();
        Object obj6 = fkj0.X;
        if (objT == obj6) {
            objT = v8r.q(Boolean.FALSE);
            x340Var.s0(objT);
        }
        ven0 ven0Var = (ven0) objT;
        Object objT2 = x340Var.T();
        if (objT2 == obj6) {
            objT2 = v8r.q((Object) null);
            x340Var.s0(objT2);
        }
        tob1 tob1Var2 = (ven0) objT2;
        boolean zI = x340Var.i(z72Var) | x340Var.i(tob1Var2) | x340Var.i(ven0Var);
        Object objT3 = x340Var.T();
        if (zI || objT3 == obj6) {
            objT3 = new bh(z72Var, tob1Var2, ven0Var, (lnm) null, (byte) 5);
            tob1Var = tob1Var2;
            x340Var.s0(objT3);
        } else {
            tob1Var = tob1Var2;
        }
        rih1 rih1Var = rih1.a;
        qxd0.t(rih1Var, x340Var, (vu30) objT3);
        boolean zP = too1.p((jre) rwq.h(((yo2) z72Var.t).s, x340Var, 0).getValue());
        boolean zH = x340Var.h(zP) | x340Var.i(ven0Var);
        Object objT4 = x340Var.T();
        if (zH || objT4 == obj6) {
            objT4 = new y72(zP, ven0Var, (byte) 0);
            x340Var.s0(objT4);
        }
        qxd0.S((Function0) objT4, x340Var);
        Boolean bool = t72Var.a;
        if (u890.j(bool, Boolean.TRUE)) {
            strK = x0d.k(x340Var, -986979453, 2131952021, x340Var, false);
        } else if (u890.j(bool, Boolean.FALSE)) {
            strK = x0d.k(x340Var, -986977055, 2131952022, x340Var, false);
        } else {
            if (bool != null) {
                throw p3d1.k(x340Var, -986980562, false);
            }
            x340Var.i0(-531447852);
            x340Var.r(false);
            strK = "";
        }
        x340Var.i0(-986973068);
        String strO0 = strK.length() == 0 ? cwl1.o0(x340Var, 2131952020) : strK;
        x340Var.r(false);
        zmx zmxVar = zmx.c;
        boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        Object objT5 = x340Var.T();
        if (z || objT5 == obj6) {
            objT5 = new k52(iu30Var, (byte) 5);
            x340Var.s0(objT5);
        }
        kyo1.c(strK, zmxVar, (Function0) objT5, anm1.N("advanced_curation_action_button", nim0.a), false, strO0, null, c5i.a, x340Var, 12582912 | (zmx.d << 3), 80);
        Object objT6 = x340Var.T();
        if (objT6 == obj6) {
            objT6 = ((tra0) z72Var.i).a((ruz) z72Var.X, new ma0(ven0Var, (byte) 9));
            x340Var.s0(objT6);
        }
        wra0 wra0Var = (wra0) objT6;
        boolean z2 = ((Boolean) ven0Var.getValue()).booleanValue() && !zP;
        String str = (String) tob1Var.getValue();
        String str2 = (String) z72Var.e;
        otw.c(wra0Var, new ura0(z2, (rq2) null, "advanced_curation", 0, str, str2, str2, 138), (qim0) null, (ipb1) null, x340Var, 0, 12);
        return rih1Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        rwj rwjVar = this.b;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        we2 we2Var = ((kb2) obj2).a;
        if (we2Var instanceof te2) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(-49895796);
            eb2 eb2Var = ((te2) we2Var).b;
            if (u890.j(eb2Var, bb2.a)) {
                x340Var2.i0(-140154107);
                rwjVar.f((iIntValue >> 6) & 14, x340Var2, iu30Var, (qim0) null);
                x340Var2.r(false);
            } else if (eb2Var instanceof cb2) {
                x340Var2.i0(-140151046);
                rwjVar.l(((cb2) eb2Var).a, (iIntValue >> 6) & 14, x340Var2, iu30Var, (qim0) null);
                x340Var2.r(false);
            } else {
                if (!(eb2Var instanceof db2)) {
                    throw p3d1.k(x340Var2, -140156874, false);
                }
                x340Var2.i0(-140147367);
                rwjVar.m(((db2) eb2Var).a, (iIntValue >> 6) & 14, x340Var2, iu30Var, (qim0) null);
                x340Var2.r(false);
            }
            x340Var2.r(false);
        } else {
            if (!u890.j(we2Var, ve2.b)) {
                throw p3d1.k(x340Var, -140159886, false);
            }
            x340 x340Var3 = x340Var;
            x340Var3.i0(-140143803);
            rwjVar.f((iIntValue >> 6) & 14, x340Var3, iu30Var, (qim0) null);
            x340Var3.r(false);
        }
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        gf2 gf2Var = (gf2) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        hf2 hf2Var = this.b;
        m4c m4cVar = fkj0.X;
        int iOrdinal = gf2Var.a.ordinal();
        boolean z = true;
        if (iOrdinal == 0) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(1697006784);
            Integer num = gf2Var.b;
            boolean z2 = hf2Var.b;
            int i = (iIntValue & 896) ^ 384;
            boolean z3 = (i > 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256;
            Object objT = x340Var2.T();
            if (z3 || objT == m4cVar) {
                objT = new k52(iu30Var, (byte) 13);
                x340Var2.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            boolean z4 = (i > 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256;
            Object objT2 = x340Var2.T();
            if (z4 || objT2 == m4cVar) {
                objT2 = new k52(iu30Var, (byte) 14);
                x340Var2.s0(objT2);
            }
            Function0 function1 = (Function0) objT2;
            if ((i <= 256 || !x340Var2.g(iu30Var)) && (iIntValue & 384) != 256) {
                z = false;
            }
            Object objT3 = x340Var2.T();
            if (z || objT3 == m4cVar) {
                objT3 = new k52(iu30Var, (byte) 15);
                x340Var2.s0(objT3);
            }
            si1.a(num, z2, function0, function1, (qim0) null, (Function0) objT3, x340Var2, 0);
            x340Var2.r(false);
        } else {
            if (iOrdinal != 1) {
                throw p3d1.k(x340Var, -222354640, false);
            }
            x340 x340Var3 = x340Var;
            x340Var3.i0(1697505636);
            Integer num2 = gf2Var.b;
            boolean z5 = hf2Var.b;
            int i2 = (iIntValue & 896) ^ 384;
            boolean z6 = (i2 > 256 && x340Var3.g(iu30Var)) || (iIntValue & 384) == 256;
            Object objT4 = x340Var3.T();
            if (z6 || objT4 == m4cVar) {
                objT4 = new k52(iu30Var, (byte) 16);
                x340Var3.s0(objT4);
            }
            Function0 function2 = (Function0) objT4;
            boolean z7 = (i2 > 256 && x340Var3.g(iu30Var)) || (iIntValue & 384) == 256;
            Object objT5 = x340Var3.T();
            if (z7 || objT5 == m4cVar) {
                objT5 = new k52(iu30Var, (byte) 17);
                x340Var3.s0(objT5);
            }
            Function0 function3 = (Function0) objT5;
            if ((i2 <= 256 || !x340Var3.g(iu30Var)) && (iIntValue & 384) != 256) {
                z = false;
            }
            Object objT6 = x340Var3.T();
            if (z || objT6 == m4cVar) {
                objT6 = new k52(iu30Var, (byte) 18);
                x340Var3.s0(objT6);
            }
            si1.b(num2, z5, function2, function3, (qim0) null, (Function0) objT6, x340Var3, 0);
            x340Var3.r(false);
        }
        return rih1.a;
    }

    private final Object q(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        b0k b0kVar = (b0k) obj4;
        ((Number) obj5).intValue();
        nyx.a(2, (wux) null, apo.r(-822480614, new q1(obj2, (iu30) obj3, (Object) this.b, (byte) 27), b0kVar), b0kVar, 3078, 6);
        return rih1.a;
    }

    private final Object r(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        b0k b0kVar = (b0k) obj4;
        ((Number) obj5).intValue();
        kiv kivVar = oi7.a;
        hw2 hw2Var = this.b;
        mod.b(kivVar.a((gw70) hw2Var.g), apo.r(1429604435, new oj2(obj2, (Object) hw2Var, obj3, (byte) 2), b0kVar), b0kVar, 56);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:315:0x07ad  */
    /* JADX WARN: Code duplicated, block: B:316:0x07c1  */
    /* JADX WARN: Code duplicated, block: B:431:0x0b7d  */
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        ss rsVar;
        int i;
        boolean z;
        int i2;
        long j;
        m4c m4cVar;
        byte b = this.a;
        z50 z50Var = z50.c;
        byte b2 = 6;
        n4k n4kVar = hmb0.t1;
        f36 f36Var = h36.c;
        nim0 nim0Var = nim0.a;
        byte b3 = 3;
        rih1 rih1Var = rih1.a;
        vh1 vh1Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                b0k b0kVar = (b0k) obj4;
                ((Number) obj5).intValue();
                s1 s1Var = (s1) vh1Var;
                mod.b(oi7.a.a(s1Var.c), apo.r(1782184184, new q1(obj2, (Object) s1Var, obj3, (byte) 0), b0kVar), b0kVar, 56);
                return rih1Var;
            case 1:
                za zaVar = (za) obj2;
                iu30 iu30Var = (iu30) obj3;
                x340 x340Var = (b0k) obj4;
                int iIntValue = ((Number) obj5).intValue();
                qj0 qj0Var = (qj0) vh1Var;
                boolean z2 = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
                x340 x340Var2 = x340Var;
                boolean zI = z2 | x340Var2.i(qj0Var);
                Object objT = x340Var2.T();
                if (zI || objT == fkj0.X) {
                    objT = new y4(iu30Var, qj0Var, (byte) 1);
                    x340Var2.s0(objT);
                }
                foo1.c(new gbx(z50Var, (Function0) objT), new idx(), u291.x(166.0f, 0.0f, 2, nim0Var), null, yla.r(x340Var2), null, null, null, null, null, apo.r(277790733, new ab(zaVar, (byte) 0), x340Var2), x340Var2, 0, 48, 2008);
                return rih1Var;
            case 2:
                vm vmVar = (vm) obj2;
                iu30 iu30Var2 = (iu30) obj3;
                int iIntValue2 = ((Number) obj5).intValue();
                m4c m4cVar2 = fkj0.X;
                tm tmVar = (tm) vh1Var;
                x340 x340Var3 = (b0k) obj4;
                boolean zI2 = x340Var3.i(tmVar);
                Object objT2 = x340Var3.T();
                if (zI2 || objT2 == m4cVar2) {
                    objT2 = new qm(tmVar, (lnm) null, (byte) 0);
                    x340Var3.s0(objT2);
                }
                qxd0.t(rih1Var, x340Var3, (vu30) objT2);
                boolean z3 = (((iIntValue2 & 112) ^ 48) > 32 && x340Var3.g(vmVar)) || (iIntValue2 & 48) == 32;
                Object objT3 = x340Var3.T();
                if (z3 || objT3 == m4cVar2) {
                    objT3 = new j2(vmVar, (byte) 4);
                    x340Var3.s0(objT3);
                }
                qxd0.i(rih1Var, (iu30) objT3, x340Var3);
                mod.b(oi7.a.a((gw70) tmVar.e), apo.r(794624982, new sm(iu30Var2, (byte) 0), x340Var3), x340Var3, 56);
                return rih1Var;
            case 3:
                er erVar = (er) obj2;
                x340 x340Var4 = (b0k) obj4;
                ((Number) obj5).intValue();
                boolean z4 = erVar.e;
                fg91 fg91Var = erVar.c;
                int i3 = erVar.a;
                int iC = l1d.C(i3);
                if (iC == 0) {
                    rsVar = new rs(erVar.b, fg91Var == null ? fg91.b : fg91Var);
                } else {
                    if (iC != 1) {
                        eg.o();
                        return null;
                    }
                    rsVar = new qs(fg91Var, z4);
                }
                ts tsVar = new ts(rsVar, erVar.d);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var4).b;
                qim0 qim0VarB = nim0.a;
                if (i3 == 1) {
                    qim0VarB = uyn1.B(qim0VarB, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                }
                fr frVar = (fr) vh1Var;
                mbh mbhVarA = jbh.a(f36Var, een.P0, x340Var4, 0);
                x340 x340Var5 = x340Var4;
                int iHashCode = Long.hashCode(x340Var5.T);
                xos0 xos0VarM = x340Var5.m();
                qim0 qim0VarE = zr7.E(x340Var4, qim0VarB);
                hzj.A.getClass();
                x340 x340Var6 = x340Var4;
                if (x340Var6.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var6.m0();
                if (x340Var6.S) {
                    x340Var6.l(n4kVar);
                } else {
                    x340Var6.v0();
                }
                nko1.H(mbhVarA, x340Var4, y580.O0);
                nko1.H(xos0VarM, x340Var4, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var4, y580.R0);
                nko1.F(x340Var4);
                nko1.H(qim0VarE, x340Var4, y580.Y);
                pt ptVar = frVar.a;
                otw.c(ptVar, tsVar, (qim0) null, wpb1.D("AccountSwitcherSideDrawerElement", ptVar, tsVar, x340Var4, 582), x340Var4, 72, 4);
                if (z4) {
                    if (fg91Var != null) {
                        i = 1;
                        if (fg91Var.isEmpty()) {
                            x340Var6.i0(-1947344846);
                            x340Var6.r(false);
                        }
                    } else {
                        i = 1;
                    }
                    x340Var6.i0(-1947661976);
                    if (i3 == 2) {
                        x340Var6.i0(-1947630387);
                        rqo1.g(0, i, x340Var4, null);
                        x340Var6.r(false);
                    } else {
                        x340Var6.i0(-1947594830);
                        x340Var6.r(false);
                    }
                    otw.c((maa) frVar.b.get(), new zt(i3 == i), (qim0) null, (ipb1) null, x340Var4, 0, 12);
                    x340Var6.r(false);
                } else {
                    x340Var6.i0(-1947344846);
                    x340Var6.r(false);
                }
                x340Var6.r(true);
                return rih1Var;
            case 4:
                xs xsVar = (xs) obj2;
                x340 x340Var7 = (b0k) obj4;
                int iIntValue3 = ((Number) obj5).intValue();
                m4c m4cVar3 = fkj0.X;
                pt ptVar2 = (pt) vh1Var;
                if (xsVar instanceof us) {
                    x340 x340Var8 = x340Var7;
                    x340Var8.i0(2046318664);
                    us usVar = (us) xsVar;
                    if (usVar.a) {
                        x340Var8.i0(-988601063);
                        otw.c((maa) ((ynb0) ptVar2.h).get(), new ls(usVar.b, usVar.c), (qim0) null, (ipb1) null, x340Var8, 0, 12);
                        z = false;
                        x340Var8.r(false);
                    } else {
                        z = false;
                        x340Var8.i0(-988282972);
                        x340Var8.r(false);
                    }
                    x340Var8.r(z);
                } else if (xsVar instanceof ws) {
                    x340 x340Var9 = x340Var7;
                    x340Var9.i0(2046331549);
                    boolean z5 = ((ws) xsVar).a;
                    boolean zI3 = x340Var9.i(ptVar2);
                    Object objT4 = x340Var9.T();
                    if (zI3 || objT4 == m4cVar3) {
                        objT4 = new et(ptVar2, (byte) 1);
                        x340Var9.s0(objT4);
                    }
                    ptVar2.z(z5, (iu30) objT4, x340Var9, 0);
                    x340Var9.r(false);
                } else {
                    if (!(xsVar instanceof vs)) {
                        throw p3d1.k(x340Var7, 2046318054, false);
                    }
                    x340 x340Var10 = x340Var7;
                    x340Var10.i0(2046339779);
                    boolean z6 = ((vs) xsVar).d;
                    boolean zI4 = ((((iIntValue3 & 112) ^ 48) > 32 && x340Var10.i(xsVar)) || (iIntValue3 & 48) == 32) | x340Var10.i(ptVar2);
                    Object objT5 = x340Var10.T();
                    if (zI4 || objT5 == m4cVar3) {
                        objT5 = new d4((Object) xsVar, (Object) ptVar2, (byte) 3);
                        x340Var10.s0(objT5);
                    }
                    ptVar2.z(z6, (iu30) objT5, x340Var10, 0);
                    x340Var10.r(false);
                }
                return rih1Var;
            case 5:
                b0k b0kVar2 = (b0k) obj4;
                ((Number) obj5).intValue();
                i40 i40Var = (i40) vh1Var;
                mod.b(oi7.a.a(i40Var.t), apo.r(1870459302, new q1((e40) obj2, i40Var, (iu30) obj3, b2), b0kVar2), b0kVar2, 56);
                return rih1Var;
            case 6:
                y70 y70Var = (y70) obj2;
                x340 x340Var11 = (b0k) obj4;
                ((Number) obj5).intValue();
                qim0 qim0VarZ = u291.z(u291.f(nim0Var, 1.0f), (fra) null, 3);
                z70 z70Var = (z70) vh1Var;
                mbh mbhVarA2 = jbh.a(f36Var, een.P0, x340Var11, 0);
                x340 x340Var12 = x340Var11;
                int iHashCode2 = Long.hashCode(x340Var12.T);
                xos0 xos0VarM2 = x340Var12.m();
                qim0 qim0VarE2 = zr7.E(x340Var11, qim0VarZ);
                hzj.A.getClass();
                x340 x340Var13 = x340Var11;
                if (x340Var13.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var13.m0();
                if (x340Var13.S) {
                    x340Var13.l(n4kVar);
                } else {
                    x340Var13.v0();
                }
                nko1.H(mbhVarA2, x340Var11, y580.O0);
                nko1.H(xos0VarM2, x340Var11, y580.N0);
                nko1.H(Integer.valueOf(iHashCode2), x340Var11, y580.R0);
                nko1.F(x340Var11);
                nko1.H(qim0VarE2, x340Var11, y580.Y);
                x340Var13.i0(591173615);
                for (ql71 ql71Var : z70Var.b) {
                    if (ql71Var.a()) {
                        x340Var13.i0(573148036);
                        i2 = 0;
                        eso1.i(u291.f(nim0Var, 1.0f), x340Var11, 0);
                        x340Var13.r(false);
                    } else {
                        i2 = 0;
                        x340Var13.i0(573222033);
                        x340Var13.r(false);
                    }
                    ggo1.p(ql71Var, y70Var.a, null, x340Var11, i2);
                }
                x340Var13.r(false);
                x340Var13.r(true);
                return rih1Var;
            case 7:
                iu30 iu30Var3 = (iu30) obj3;
                int iIntValue4 = ((Number) obj5).intValue();
                List list = ((ha0) obj2).a;
                x340 x340Var14 = (b0k) obj4;
                Object objT6 = x340Var14.T();
                m4c m4cVar4 = fkj0.X;
                if (objT6 == m4cVar4) {
                    objT6 = v8r.q((Object) null);
                    x340Var14.s0(objT6);
                }
                ven0 ven0Var = (ven0) objT6;
                qim0 qim0VarH = sgc1.H(1, nim0Var);
                uwr uwrVar2 = cbx.a;
                m4c m4cVar5 = m4cVar4;
                long jC = cbx.a(x340Var14).a.a.c();
                cua cuaVar = cbx.b(x340Var14).f;
                qim0 qim0VarF = dug.f(qim0VarH, jC, er31.b(16.0f));
                mbh mbhVarA3 = jbh.a(f36Var, een.P0, x340Var14, 0);
                int iHashCode3 = Long.hashCode(x340Var14.T);
                xos0 xos0VarM3 = x340Var14.m();
                qim0 qim0VarE3 = zr7.E(x340Var14, qim0VarF);
                hzj.A.getClass();
                if (x340Var14.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var14.m0();
                if (x340Var14.S) {
                    x340Var14.l(n4kVar);
                } else {
                    x340Var14.v0();
                }
                nko1.H(mbhVarA3, x340Var14, y580.O0);
                nko1.H(xos0VarM3, x340Var14, y580.N0);
                nko1.H(Integer.valueOf(iHashCode3), x340Var14, y580.R0);
                nko1.F(x340Var14);
                nko1.H(qim0VarE3, x340Var14, y580.Y);
                x340Var14.i0(1619941565);
                Iterator it = list.iterator();
                int i4 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        p7h.T();
                        throw null;
                    }
                    ga0 ga0Var = (ga0) next;
                    String strO0 = cwl1.o0(x340Var14, ga0Var.a);
                    if (na0.a[l1d.C(ga0Var.c)] == 1) {
                        x340Var14.i0(-1674524917);
                        uwr uwrVar3 = cbx.a;
                        j = cbx.a(x340Var14).b.d;
                        x340Var14.r(false);
                    } else {
                        x340Var14.i0(-1674523321);
                        uwr uwrVar4 = cbx.a;
                        j = cbx.a(x340Var14).b.a;
                        x340Var14.r(false);
                    }
                    uvx uvxVar = new uvx((pgx) null, 0, (tvx) null, (p3v) null, 30);
                    vh1 vh1Var2 = vh1Var;
                    qim0 qim0VarF2 = u291.f(u291.x(240.0f, 0.0f, 2, nim0Var), 1.0f);
                    boolean zI5 = x340Var14.i(ga0Var) | x340Var14.i(ven0Var) | x340Var14.e(i4) | ((((iIntValue4 & 896) ^ 384) > 256 && x340Var14.g(iu30Var3)) || (iIntValue4 & 384) == 256);
                    Object objT7 = x340Var14.T();
                    if (zI5) {
                        m4cVar = m4cVar5;
                    } else {
                        m4cVar = m4cVar5;
                        if (objT7 == m4cVar) {
                        }
                        jto1.b(qim0VarF2, uvxVar, null, false, null, null, new gbx(z50Var, (Function0) objT7), null, null, null, null, null, apo.r(175592842, new no9((Object) ga0Var, (Object) strO0, j, (byte) 1), x340Var14), null, null, apo.r(472162535, new la0((byte) 0, j, strO0), x340Var14), x340Var14, 64, 196992, 28604);
                        if (i4 < list.size() - 1) {
                            x340Var14.i0(-369801864);
                            rqo1.g(0, 0, x340Var14, u291.f(nim0Var, 1.0f));
                            x340Var14.r(false);
                        } else {
                            x340Var14.i0(-369733633);
                            x340Var14.r(false);
                        }
                        m4cVar5 = m4cVar;
                        it = it;
                        vh1Var = vh1Var2;
                        i4 = i5;
                    }
                    objT7 = new ka0(ga0Var, i4, iu30Var3, ven0Var, (byte) 0);
                    x340Var14.s0(objT7);
                    jto1.b(qim0VarF2, uvxVar, null, false, null, null, new gbx(z50Var, (Function0) objT7), null, null, null, null, null, apo.r(175592842, new no9((Object) ga0Var, (Object) strO0, j, (byte) 1), x340Var14), null, null, apo.r(472162535, new la0((byte) 0, j, strO0), x340Var14), x340Var14, 64, 196992, 28604);
                    if (i4 < list.size() - 1) {
                        x340Var14.i0(-369801864);
                        rqo1.g(0, 0, x340Var14, u291.f(nim0Var, 1.0f));
                        x340Var14.r(false);
                    } else {
                        x340Var14.i0(-369733633);
                        x340Var14.r(false);
                    }
                    m4cVar5 = m4cVar;
                    it = it;
                    vh1Var = vh1Var2;
                    i4 = i5;
                }
                vh1 vh1Var3 = vh1Var;
                m4c m4cVar6 = m4cVar5;
                x340Var14.r(false);
                x340Var14.r(true);
                Integer num = (Integer) ven0Var.getValue();
                if (num == null) {
                    x340Var14.i0(2063004474);
                    x340Var14.r(false);
                } else {
                    x340Var14.i0(2063004475);
                    oa0 oa0Var = (oa0) vh1Var3;
                    int iIntValue5 = num.intValue();
                    Object obj6 = list.get(iIntValue5);
                    ea0 ea0Var = obj6 instanceof ea0 ? (ea0) obj6 : null;
                    if (ea0Var != null) {
                        nu nuVar = oa0Var.g;
                        int size = ea0Var.d.size();
                        int size2 = ea0Var.e.size();
                        boolean zI6 = x340Var14.i(ven0Var);
                        Object objT8 = x340Var14.T();
                        if (zI6 || objT8 == m4cVar6) {
                            objT8 = new ma0(ven0Var, (byte) 0);
                            x340Var14.s0(objT8);
                        }
                        Function0 function0 = (Function0) objT8;
                        boolean zI7 = ((((iIntValue4 & 896) ^ 384) > 256 && x340Var14.g(iu30Var3)) || (iIntValue4 & 384) == 256) | x340Var14.i(ven0Var) | x340Var14.i(ea0Var) | x340Var14.e(iIntValue5);
                        Object objT9 = x340Var14.T();
                        if (zI7 || objT9 == m4cVar6) {
                            objT9 = new ka0(iu30Var3, ea0Var, iIntValue5, ven0Var);
                            x340Var14.s0(objT9);
                        }
                        Function0 function1 = (Function0) objT9;
                        boolean zI8 = x340Var14.i(ven0Var);
                        Object objT10 = x340Var14.T();
                        if (zI8 || objT10 == m4cVar6) {
                            objT10 = new ma0(ven0Var, (byte) 1);
                            x340Var14.s0(objT10);
                        }
                        otw.c(nuVar, new hyu(size, size2, function0, function1, (Function0) objT10), (qim0) null, (ipb1) null, x340Var14, 0, 12);
                    }
                    x340Var14.r(false);
                }
                return rih1Var;
            case 8:
                ad0 ad0Var = (ad0) obj2;
                iu30 iu30Var4 = (iu30) obj3;
                x340 x340Var15 = (b0k) obj4;
                int iIntValue6 = ((Number) obj5).intValue();
                yv31 yv31Var = ad0Var.c.a;
                int i6 = (iIntValue6 & 48) == 0 ? iIntValue6 | (x340Var15.g(ad0Var) ? 32 : 16) : iIntValue6;
                if ((iIntValue6 & 384) == 0) {
                    i6 |= x340Var15.i(iu30Var4) ? 256 : 128;
                }
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(i6 & 1, (i6 & 1169) != 1168)) {
                    bcm bcmVar = yv31Var.d;
                    x340Var16.i0(1771202755);
                    x340Var16.r(false);
                    boolean z7 = (i6 & 896) == 256;
                    Object objT11 = x340Var16.T();
                    if (z7 || objT11 == fkj0.X) {
                        objT11 = new p1(iu30Var4, (byte) 13);
                        x340Var16.s0(objT11);
                    }
                    ((res) vh1Var).f(ad0Var, yv31Var.d instanceof acm ? (Function0) objT11 : null, x340Var16, (i6 >> 3) & 14);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 9:
                uj0 uj0Var = (uj0) obj2;
                ((Number) obj5).intValue();
                ((wj0) vh1Var).e(0, uj0Var.d, uj0Var.e, (b0k) obj4);
                return rih1Var;
            case 10:
                rk0 rk0Var = (rk0) obj2;
                x340 x340Var17 = (b0k) obj4;
                ((Number) obj5).intValue();
                lax laxVar = rk0Var.e;
                tm tmVar2 = (tm) vh1Var;
                mbh mbhVarA4 = jbh.a(f36Var, een.P0, x340Var17, 0);
                x340 x340Var18 = x340Var17;
                int iHashCode4 = Long.hashCode(x340Var18.T);
                xos0 xos0VarM4 = x340Var18.m();
                qim0 qim0VarE4 = zr7.E(x340Var17, nim0Var);
                hzj.A.getClass();
                x340 x340Var19 = x340Var17;
                if (x340Var19.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var19.m0();
                if (x340Var19.S) {
                    x340Var19.l(n4kVar);
                } else {
                    x340Var19.v0();
                }
                nko1.H(mbhVarA4, x340Var17, y580.O0);
                nko1.H(xos0VarM4, x340Var17, y580.N0);
                nko1.H(Integer.valueOf(iHashCode4), x340Var17, y580.R0);
                nko1.F(x340Var17);
                nko1.H(qim0VarE4, x340Var17, y580.Y);
                jto1.b(null, null, mmo1.z(laxVar, x340Var17), false, null, null, null, null, null, null, null, null, null, null, null, apo.r(-1298330515, new o2((Object) rk0Var, (byte) 7), x340Var17), x340Var17, 0, 196608, 32763);
                if (rk0Var.c == null) {
                    x340Var19.i0(790360373);
                    x340Var19.r(false);
                } else {
                    x340Var19.i0(790360374);
                    cso1.s(new if5((Integer) null, rk0Var.c, (b2i) null, (hf5) null, 13), null, laxVar, null, x340Var17, 8, 10);
                    x340Var19.r(false);
                }
                x340Var19.i0(164049131);
                int i7 = 0;
                for (Object obj7 : rk0Var.d) {
                    int i8 = i7 + 1;
                    if (i7 < 0) {
                        p7h.T();
                        throw null;
                    }
                    p2o1.b(new k3h1(i7), apo.r(525715532, new q1((Object) tmVar2, (Object) rk0Var, obj7, (byte) 10), (b0k) 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0512: INVOKE 
                          (wrap p.k3h1:0x04ff: CONSTRUCTOR (r4v81 'i7' int) A[WRAPPED] (LINE:1280) call: p.k3h1.<init>(int):void type: CONSTRUCTOR)
                          (wrap p.j2i:0x050c: INVOKE 
                          (525715532 int)
                          (wrap p.q1:0x0506: CONSTRUCTOR 
                          (wrap java.lang.Object:?: CAST (java.lang.Object) (r8v51 'tmVar2' p.tm))
                          (wrap java.lang.Object:?: CAST (java.lang.Object) (r0v85 'rk0Var' p.rk0))
                          (r5v63 'obj7' java.lang.Object)
                          (10 byte)
                         A[MD:(java.lang.Object, java.lang.Object, java.lang.Object, byte):void (m), WRAPPED] (LINE:1287) call: p.q1.<init>(java.lang.Object, java.lang.Object, java.lang.Object, byte):void type: CONSTRUCTOR)
                          (wrap p.b0k:?: CAST (p.b0k) (r16v9 ?? I:??[OBJECT, ARRAY]))
                         STATIC call: p.apo.r(int, p.cv30, p.b0k):p.j2i A[WRAPPED] (LINE:1293))
                          (r1v54 'x340Var17' p.x340)
                          (48 int)
                         STATIC call: p.p2o1.b(p.k3h1, p.j2i, p.b0k, int):void A[MD:(p.k3h1, p.j2i, p.b0k, int):void (m)] (LINE:1299) in method: p.r1.c1(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object, file: /workspace/spotify-analysis/dex-input/classes4.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:207)
                        	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:173)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:267)
                        	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r16v9 ??
                        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                        */
                    /*
                        Method dump skipped, instruction units count: 3426
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p.r1.c1(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }

package p;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class uuy extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uuy(String str, c380 c380Var, kbl1 kbl1Var, tob1 tob1Var, iu30 iu30Var, Function0 function0) {
        super(2);
        this.a = (byte) 18;
        this.g = str;
        this.b = c380Var;
        this.c = kbl1Var;
        this.d = tob1Var;
        this.e = iu30Var;
        this.f = function0;
    }

    private final Object a(Object obj, Object obj2) {
        lnm lnmVar;
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        cib0 cib0Var = (cib0) this.c;
        iu30 iu30Var = (iu30) this.e;
        zgb0 zgb0Var = (zgb0) this.d;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = x340Var;
        boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2);
        rih1 rih1Var = rih1.a;
        if (!zY) {
            x340Var2.b0();
            return rih1Var;
        }
        qim0 qim0VarD = u291.d((qim0) this.b, 1.0f);
        dw91 dw91Var = (dw91) this.f;
        bjb0 bjb0Var = (bjb0) this.g;
        mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
        int iHashCode = Long.hashCode(x340Var2.T);
        xos0 xos0VarM = x340Var2.m();
        qim0 qim0VarE = zr7.E(x340Var2, qim0VarD);
        hzj.A.getClass();
        if (x340Var2.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var2.m0();
        if (x340Var2.S) {
            x340Var2.l(hmb0.t1);
        } else {
            x340Var2.v0();
        }
        nko1.H(mbhVarA, x340Var2, y580.O0);
        nko1.H(xos0VarM, x340Var2, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
        nko1.F(x340Var2);
        nko1.H(qim0VarE, x340Var2, y580.Y);
        boolean z = zgb0Var.b.Z;
        boolean zI = x340Var2.i(zgb0Var) | x340Var2.g(iu30Var);
        Object objT = x340Var2.T();
        if (zI || objT == m4cVar) {
            objT = new x680(zgb0Var, iu30Var, (byte) 19);
            x340Var2.s0(objT);
        }
        zgb0Var.a(0, (Function0) objT, x340Var2, z);
        String str = cib0Var.b;
        qhs0 qhs0Var = cib0Var.e;
        boolean zI2 = x340Var2.i(zgb0Var) | x340Var2.i(cib0Var);
        Object objT2 = x340Var2.T();
        if (zI2 || objT2 == m4cVar) {
            objT2 = new y160(zgb0Var, cib0Var, (lnm) null, (byte) 21);
            x340Var2.s0(objT2);
        }
        qxd0.t(str, x340Var2, (vu30) objT2);
        qlb qlbVar = zgb0Var.e;
        d0r d0rVar = zgb0Var.c;
        String str2 = cib0Var.b;
        uwr uwrVar = cbx.a;
        cvx cvxVar = cbx.b(x340Var2).b;
        nim0 nim0Var = nim0.a;
        i1o1.e(qlbVar, str2, d0rVar, uyn1.z(16.0f, 0.0f, 2, nim0Var), null, null, null, 0, null, x340Var2, 0, 248);
        qim0 qim0VarF = u291.f(nim0Var, 1.0f);
        cvx cvxVar2 = cbx.b(x340Var2).b;
        cvx cvxVar3 = cbx.b(x340Var2).b;
        cvx cvxVar4 = cbx.b(x340Var2).b;
        rqo1.g(0, 0, x340Var2, uyn1.B(qim0VarF, 16.0f, 16.0f, 16.0f, 0.0f, 8));
        qim0 qim0VarD2 = u291.d(nim0Var, 1.0f);
        cvx cvxVar5 = cbx.b(x340Var2).b;
        zzq0 zzq0VarH = uyn1.h(1, 0.0f, 8.0f);
        boolean zI3 = x340Var2.i(cib0Var) | x340Var2.i(dw91Var) | x340Var2.i(zgb0Var) | x340Var2.i(bjb0Var);
        Object objT3 = x340Var2.T();
        if (zI3 || objT3 == m4cVar) {
            lnmVar = null;
            objT3 = new lhx(cib0Var, dw91Var, zgb0Var, bjb0Var, (byte) 23);
            x340Var2.s0(objT3);
        } else {
            lnmVar = null;
        }
        ujo1.d(qim0VarD2, null, zzq0VarH, false, null, null, null, false, null, (iu30) objT3, x340Var2, 0, 506);
        x340Var2.r(true);
        if (qhs0Var == null) {
            x340Var2.i0(615019322);
            x340Var2.r(false);
            return rih1Var;
        }
        x340Var2.i0(613649897);
        boolean zI4 = x340Var2.i(zgb0Var);
        Object objT4 = x340Var2.T();
        if (zI4 || objT4 == m4cVar) {
            objT4 = new n3s(zgb0Var, lnmVar, (byte) 28);
            x340Var2.s0(objT4);
        }
        qxd0.t(qhs0Var, x340Var2, (vu30) objT4);
        boolean zG = x340Var2.g(iu30Var);
        Object objT5 = x340Var2.T();
        if (zG || objT5 == m4cVar) {
            maj0 maj0Var = new maj0(2, new ygb0(iu30Var, zgb0Var), zgb0Var.f.a.b.A5);
            x340Var2.s0(maj0Var);
            objT5 = maj0Var;
        }
        otw.c((maj0) objT5, rih1Var, (qim0) null, (ipb1) null, x340Var2, 48, 12);
        x340Var2.r(false);
        return rih1Var;
    }

    private final Object d(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        kbl1 kbl1Var = (kbl1) this.c;
        m4c m4cVar = fkj0.X;
        boolean z = true;
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            uwr uwrVar = cbx.a;
            uwo1.e((String) this.g, null, cbx.d(x340Var2).d, cbx.a(x340Var2).b.a, null, null, 2, false, new cjc0(2), 0, null, x340Var2, 1572864, 0, 1714);
            x340Var2.i0(723666380);
            c380 c380Var = (c380) this.b;
            tob1 tob1Var = (tob1) this.d;
            iu30 iu30Var = (iu30) this.e;
            Iterator it = c380Var.iterator();
            int i = 0;
            while (true) {
                boolean zHasNext = it.hasNext();
                nim0 nim0Var = nim0.a;
                if (!zHasNext) {
                    x340Var2.r(false);
                    if (kbl1Var != null) {
                        x340Var2.i0(959180654);
                        Function0 function0 = (Function0) this.f;
                        op71.g(x340Var2, new wnb0(1.0f, true));
                        boolean zG = x340Var2.g(function0);
                        Object objT = x340Var2.T();
                        if (zG || objT == m4cVar) {
                            objT = new tze0(function0, (byte) 9);
                            x340Var2.s0(objT);
                        }
                        foo1.c(new gbx(z50.c, (Function0) objT), ldx.c, uyn1.y(nim0Var, 16.0f, 16.0f), null, null, null, null, null, null, null, apo.r(222576244, new mbf0(kbl1Var, (byte) 10), x340Var2), x340Var2, 432, 48, 2040);
                        x340Var2.r(false);
                        break;
                    }
                    x340Var2.i0(959180653);
                    x340Var2.r(false);
                    break;
                }
                Object next = it.next();
                int i2 = i + 1;
                if (i < 0) {
                    p7h.T();
                    throw null;
                }
                jbl1 jbl1Var = (jbl1) next;
                String str = jbl1Var.a;
                String str2 = jbl1Var.b;
                Integer num = (Integer) tob1Var.getValue();
                boolean z2 = (num != null && i == num.intValue()) ? z : false;
                boolean zG2 = x340Var2.g(iu30Var) | x340Var2.e(i);
                Object objT2 = x340Var2.T();
                if (zG2 || objT2 == m4cVar) {
                    objT2 = new ck0(iu30Var, i, (byte) 14);
                    x340Var2.s0(objT2);
                }
                two1.n(24576, str, str2, (Function0) objT2, x340Var2, u291.f(nim0Var, 1.0f), z2);
                i = i2;
                z = true;
            }
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object e(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        iu30 iu30Var = (iu30) this.d;
        kgi0 kgi0Var = (kgi0) this.e;
        igi0 igi0Var = (igi0) this.c;
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            boolean zB = xoi1.b((Context) x340Var2.k(AndroidCompositionLocals_androidKt.b));
            cgi0 cgi0Var = (cgi0) this.b;
            int i = cgi0Var.c.a;
            float f = cgi0Var.a;
            int i2 = cgi0Var.b;
            float f2 = cgi0Var.d;
            byte b = cgi0Var.e;
            int i3 = cgi0Var.f;
            boolean zG = x340Var2.g(iu30Var) | x340Var2.i(igi0Var) | x340Var2.i(kgi0Var);
            Object objT = x340Var2.T();
            if (zG || objT == fkj0.X) {
                objT = new gnf0(iu30Var, igi0Var, kgi0Var, (byte) 14);
                x340Var2.s0(objT);
            }
            bro1.g(igi0Var, (iu30) objT, apo.r(1719335602, new q0g0((kly0) this.f, igi0Var, (byte) 25), x340Var2), i, f, i2, f2, b, null, i3, zB, apo.r(-1438418779, new gk0((j2i) this.g, igi0Var, kgi0Var, (byte) 20), x340Var2), x340Var2, 384, 256);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object f(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        m4c m4cVar = fkj0.X;
        kgi0 kgi0Var = (kgi0) this.e;
        pii0 pii0Var = (pii0) this.c;
        iu30 iu30Var = (iu30) this.b;
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            boolean zG = x340Var2.g(iu30Var);
            Object objT = x340Var2.T();
            if (zG || objT == m4cVar) {
                objT = new mhg0(iu30Var, (byte) 24);
                x340Var2.s0(objT);
            }
            qim0 qim0VarW = jzn1.w(nim0.a, (iu30) objT, x340Var2);
            igi0 igi0Var = new igi0(pii0Var.a, pii0Var.b, pii0Var.c, false, false);
            boolean zB = xoi1.b((Context) x340Var2.k(AndroidCompositionLocals_androidKt.b));
            cgi0 cgi0Var = (cgi0) this.d;
            int i = cgi0Var.c.a;
            float f = cgi0Var.a;
            int i2 = cgi0Var.b;
            float f2 = cgi0Var.d;
            byte b = cgi0Var.e;
            boolean zG2 = x340Var2.g(iu30Var) | x340Var2.i(pii0Var) | x340Var2.i(kgi0Var);
            Object objT2 = x340Var2.T();
            if (zG2 || objT2 == m4cVar) {
                objT2 = new gnf0(iu30Var, pii0Var, kgi0Var, (byte) 15);
                x340Var2.s0(objT2);
            }
            bro1.g(igi0Var, (iu30) objT2, apo.r(323148945, new q0g0((kly0) this.f, pii0Var, (byte) 26), x340Var2), i, f, i2, f2, b, qim0VarW, 0, zB, apo.r(-2031900220, new wh((j2i) this.g, kgi0Var, (byte) 20), x340Var2), x340Var2, 384, 512);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object g(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        blo1.e((uwy0) this.b, (String) this.g, (i8h1) this.c, (Function0) this.d, (Function0) this.e, (Function0) this.f, (b0k) obj, czo1.p(1));
        return rih1.a;
    }

    private final Object h(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((rzo0) this.b).j((bab1) this.c, (th61) this.d, (ods) this.e, (mr20) this.f, (qim0) this.g, (b0k) obj, czo1.p(1));
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object i(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        qim0 qim0Var;
        ewr0 ewr0Var;
        maa maaVar;
        boolean z;
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2);
        j06 j06Var = x340Var2.a;
        if (zY) {
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var2, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0VarB = uyn1.B(uyn1.x(qim0VarF, 16.0f), 0.0f, 0.0f, 0.0f, ((vzq0) this.b).a(), 7);
            hxa0 hxa0Var = (hxa0) this.c;
            ewr0 ewr0Var2 = hxa0Var.a;
            maa maaVar2 = (cxr0) this.d;
            qwr0 qwr0Var = (qwr0) this.e;
            iu30 iu30Var = (iu30) this.f;
            xk xkVar = (xk) this.g;
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarB);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z2 = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            String strO0 = cwl1.o0(x340Var2, 2131959623);
            lee1 lee1Var = cbx.d(x340Var2).d;
            Object objT = x340Var2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = wvr0.f;
                x340Var2.s0(objT);
            }
            uwo1.e(strO0, s161.b(qim0Var2, false, (iu30) objT), lee1Var, 0L, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2040);
            yxa0 yxa0Var = hxa0Var.c;
            ewr0 ewr0Var3 = hxa0Var.b;
            if (ewr0Var2 instanceof ewr0) {
                x340Var2.i0(-404495134);
                axr0 axr0Var = new axr0(bxr0.a, ewr0Var2.a);
                cvx cvxVar2 = cbx.b(x340Var2).b;
                qim0Var = qim0Var2;
                ewr0Var = ewr0Var3;
                maaVar = maaVar2;
                otw.c(maaVar, axr0Var, uyn1.B(qim0Var2, 0.0f, 16.0f, 0.0f, 0.0f, 13), (ipb1) null, x340Var2, 0, 8);
                x340Var2.r(false);
            } else {
                qim0Var = qim0Var2;
                ewr0Var = ewr0Var3;
                maaVar = maaVar2;
                x340Var2.i0(-404206834);
                x340Var2.r(false);
            }
            if (ewr0Var instanceof ewr0) {
                x340Var2.i0(-404130264);
                otw.c(maaVar, new axr0(bxr0.b, ewr0Var.a), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                x340Var2.r(false);
            } else {
                x340Var2.i0(-403970738);
                x340Var2.r(false);
            }
            fra fraVar = een.N0;
            qim0 qim0VarN = anm1.N("parental_control_done_button", uyn1.B(u291.f(qim0Var, 1.0f), 0.0f, cbx.b(x340Var2).b.d, 0.0f, 0.0f, 13));
            jw31 jw31VarA = ew31.a(h36.e, fraVar, x340Var2, 0);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarN);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(jw31VarA, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar4);
            s110.d(yxa0Var, apo.r(1174527186, new b2o0(hxa0Var, xkVar, qwr0Var, iu30Var, (byte) 12), x340Var2), x340Var2, 48);
            x340Var2.r(true);
            String strO1 = cwl1.o0(x340Var2, 2131959621);
            c9 c9VarS = mqo1.s(new mae1(cwl1.o0(x340Var2, 2131959622), "https://support.spotify.com/article/managed-accounts/plain/"));
            long jQ = f0o1.q(yxa0Var, x340Var2);
            qim0 qim0VarB2 = uyn1.B(qim0Var, 0.0f, cbx.b(x340Var2).b.b, 0.0f, 0.0f, 13);
            boolean zI = x340Var2.i(qwr0Var) | x340Var2.g(iu30Var);
            Object objT2 = x340Var2.T();
            if (zI || objT2 == m4cVar) {
                z = true;
                objT2 = new twr0(qwr0Var, iu30Var, (byte) 1);
                x340Var2.s0(objT2);
            } else {
                z = true;
            }
            i8p1.i(strO1, c9VarS, (iu30) objT2, qim0VarB2, null, 0L, jQ, x340Var2, 0, 48);
            x340Var2.r(z);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object j(Object obj, Object obj2) {
        boolean z;
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2);
        j06 j06Var = x340Var2.a;
        if (zY) {
            vu30 vu30Var = (vu30) this.b;
            Function0 function0 = (Function0) this.c;
            String str = (String) this.g;
            ccs0 ccs0Var = (ccs0) this.d;
            iu30 iu30Var = (iu30) this.e;
            Function0 function1 = (Function0) this.f;
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var2, nim0Var);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z2 = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
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
            w3d1.a(u291.d(nim0Var, 1.0f), (hw61) null, 0L, 0L, 0.0f, 0.0f, (qqb) null, apo.r(1631492062, new e9g0((Object) function0, (Object) str, (Object) ccs0Var, (Object) iu30Var, (Object) function1, (byte) 17), x340Var2), x340Var2, 12582912, 126);
            if (vu30Var == null) {
                x340Var2.i0(819454725);
                x340Var2.r(false);
                z = true;
            } else {
                x340Var2.i0(819454726);
                gra graVar = een.h;
                uwr uwrVar = cbx.a;
                qim0 qim0VarB = h2c.a.b(dug.f(nim0Var, u7h.b(cbx.a(x340Var2).a.c, 0.6f, 0.0f, 0.0f, 0.0f, 14), d4o1.a));
                Object objT = x340Var2.T();
                if (objT == fkj0.X) {
                    objT = v0r0.S0;
                    x340Var2.s0(objT);
                }
                qim0 qim0VarX = bin.x(qim0VarB, false, null, null, null, (Function0) objT, 15);
                gfh0 gfh0VarC2 = t1c.c(graVar, false);
                int iHashCode2 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM2 = x340Var2.m();
                qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarX);
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
                z = true;
                us71.k(0, vu30Var, x340Var2, true, false);
            }
            x340Var2.r(z);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object k(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        epo1.l((String) this.g, (c380) this.b, (dw91) this.c, (iu30) this.d, (vu30) this.e, (qim0) this.f, (b0k) obj, czo1.p(1));
        return rih1.a;
    }

    private final Object m(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        cyo1.i((String) this.g, (if5) this.b, (Integer) this.c, (Function0) this.d, (qim0) this.e, (max) this.f, (b0k) obj, czo1.p(65));
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:192:0x0804  */
    /* JADX WARN: Code duplicated, block: B:195:0x0845  */
    /* JADX WARN: Code duplicated, block: B:198:0x086e  */
    /* JADX WARN: Code duplicated, block: B:202:0x08b2  */
    /* JADX WARN: Code duplicated, block: B:206:0x0910  */
    /* JADX WARN: Code duplicated, block: B:209:0x094a  */
    /* JADX WARN: Code duplicated, block: B:89:0x0342  */
    /* JADX WARN: Code duplicated, block: B:90:0x0345  */
    /* JADX WARN: Code duplicated, block: B:93:0x034c  */
    /* JADX WARN: Code duplicated, block: B:94:0x034e  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v62 java.lang.Object, still in use, count: 2, list:
          (r1v62 java.lang.Object) from 0x033e: PHI (r1 I:??) = (r1v59 java.lang.Object), (r1v62 java.lang.Object) binds: [B:86:0x033d, B:325:0x033e] A[DONT_GENERATE, DONT_INLINE]
          (r1v62 java.lang.Object) from 0x0336: CHECK_CAST (p.nbb0) (r1v62 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public final java.lang.Object invoke(java.lang.Object r53, java.lang.Object r54) {
        /*
            Method dump skipped, instruction units count: 3556
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.uuy.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uuy(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uuy(Object obj, Object obj2, Object obj3, Object obj4, String str, Object obj5, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.g = str;
        this.f = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uuy(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, byte b) {
        super(2);
        this.a = b;
        this.g = str;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uuy(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uuy(vu30 vu30Var, Function0 function0, String str, ccs0 ccs0Var, iu30 iu30Var, Function0 function1) {
        super(2);
        this.a = (byte) 26;
        this.b = vu30Var;
        this.c = function0;
        this.g = str;
        this.d = ccs0Var;
        this.e = iu30Var;
        this.f = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uuy(vef0 vef0Var, kw9 kw9Var, String str, qim0 qim0Var, String str2, xu30 xu30Var, int i) {
        super(2);
        this.a = (byte) 16;
        this.b = vef0Var;
        this.c = kw9Var;
        this.g = str;
        this.d = qim0Var;
        this.e = str2;
        this.f = xu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uuy(uwy0 uwy0Var, String str, i8h1 i8h1Var, Function0 function0, Function0 function1, Function0 function2, int i) {
        super(2);
        this.a = (byte) 23;
        this.b = uwy0Var;
        this.g = str;
        this.c = i8h1Var;
        this.d = function0;
        this.e = function1;
        this.f = function2;
    }
}

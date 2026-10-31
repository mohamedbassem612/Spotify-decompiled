package p;

import io.reactivex.rxjava3.core.Observable;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dea0 implements xpw {
    public final Object N0;
    public final rqw O0;
    public final Object X;
    public final Object Y;
    public final Object Z;
    public final /* synthetic */ byte a;
    public final q8n b;
    public final js20 c;
    public final psw d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object t;

    public dea0(eoc eocVar, iir iirVar, vt90 vt90Var, los losVar, bbl0 bbl0Var, b0a0 b0a0Var, zor zorVar, lzn0 lzn0Var, q8n q8nVar) {
        byte b = 0;
        this.a = (byte) 0;
        this.e = eocVar;
        this.f = iirVar;
        this.g = vt90Var;
        this.h = bbl0Var;
        this.i = b0a0Var;
        this.t = zorVar;
        this.X = lzn0Var;
        this.b = q8nVar;
        this.Y = new svh0(losVar, (byte) 16);
        byte b2 = 1;
        this.Z = new idd1(new yda0(this, b2));
        this.N0 = new idd1(new yda0(this, b));
        this.c = x3p1.n(new zda0(this, b), mr90.Q0, new gs90(this, (byte) 7), (o8n) null, new zda0(this, b2), 8);
        this.O0 = new qdk(this, (byte) 3);
        j2i j2iVar = new j2i(-1705532719, new pba0(this, (byte) 2), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        switch (this.a) {
            case 0:
                return (qdk) this.O0;
            default:
                return this.O0;
        }
    }

    public final jsw c() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.d;
    }

    public void e(iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        iu30 iu30Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1886821290);
        int i3 = i & 6;
        pbh pbhVar = pbh.a;
        if (i3 == 0) {
            i2 = (x340Var.g(pbhVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(this) ? 256 : 128;
        }
        int i4 = i2;
        boolean z = false;
        if (x340Var.Y(i4 & 1, (i4 & 147) != 146)) {
            otw.c((maa) ((ynb0) this.X).get(), hg81.a, (qim0) null, (ipb1) null, x340Var, 48, 12);
            kiv kivVar = vvx.a;
            vzq0 vzq0Var = ((uvx) x340Var.k(kivVar)).e;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(uyn1.w(nim0Var, vzq0Var), 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            uwo1.e(cwl1.o0(x340Var, 2131962451), uyn1.B(uyn1.z(12.0f, 0.0f, 2, qim0VarF), 0.0f, cbx.b(x340Var).b.a, 0.0f, 0.0f, 13), cbx.d(x340Var).j, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
            qim0 qim0VarB = u291.B(uyn1.w(nim0Var, ((uvx) x340Var.k(kivVar)).e), (gra) null, 3);
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(12.0f, 0.0f, 2, qim0VarB);
            cvx cvxVar3 = cbx.b(x340Var).b;
            qim0 qim0VarC = pbhVar.c(een.P0, uyn1.B(qim0VarZ, 0.0f, 16.0f, 0.0f, cbx.b(x340Var).b.a, 5));
            idx idxVar = new idx();
            gdx gdxVarS = yla.s(x340Var);
            if ((i4 & 112) == 32) {
                x340Var = x340Var;
                z = true;
            }
            x340Var = x340Var;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                iu30Var2 = iu30Var;
                objT = new pc81(iu30Var2, (byte) 5);
                x340Var.s0(objT);
            } else {
                iu30Var2 = iu30Var;
            }
            foo1.c(new gbx(z50.c, (Function0) objT), idxVar, qim0VarC, (max) null, gdxVarS, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, uhj.a, x340Var, 0, 48, 2008);
        } else {
            iu30Var2 = iu30Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wjz0(this, iu30Var2, i, (byte) 23);
        }
    }

    public void f(ag81 ag81Var, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-446780247);
        int i2 = (i & 6) == 0 ? (x340Var.g(ag81Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= x340Var.i(this) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            List list = ag81Var.b;
            String str = ag81Var.a;
            gg81 gg81Var = new gg81(str);
            Object objT = x340Var.T();
            if (objT == m4cVar) {
                bm00 bm00Var = (bm00) this.N0;
                j3r j3rVar = rzq.y;
                objT = l2p1.f((wed0) bm00Var.b);
                x340Var.s0(objT);
            }
            rzq rzqVar = (rzq) objT;
            boolean zI = x340Var.i(rzqVar);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new d781(rzqVar, (byte) 9);
                x340Var.s0(objT2);
            }
            qxd0.i(rzqVar, (iu30) objT2, x340Var);
            otw.c((maa) ((ynb0) this.X).get(), gg81Var, (qim0) null, (ipb1) null, x340Var, 0, 12);
            if (ag81Var.c) {
                x340Var.i0(73802442);
                otw.c((maa) ((ynb0) this.Y).get(), hoo0.a, (qim0) null, (ipb1) null, x340Var, 0, 12);
                x340Var.r(false);
            } else {
                x340Var.i0(73939865);
                x340Var.r(false);
            }
            if (list.isEmpty()) {
                x340Var.i0(73976259);
                i1k0.f(2, 54, x340Var, u291.f(nim0.a, 1.0f));
                x340Var.r(false);
            } else {
                x340Var.i0(74064857);
                x340Var.r(false);
            }
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = ((qhq) ((ynb0) this.t).get()).a(1);
                x340Var.s0(objT3);
            }
            jkf jkfVar = (jkf) objT3;
            x340Var.i0(140942777);
            int i3 = 0;
            for (Object obj : o7h.d1(list, ((add) this.e).a.g0())) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    p7h.T();
                    throw null;
                }
                otw.c(jkfVar, new ekf(i3, str, (goe) obj, rzqVar), (qim0) null, (ipb1) null, x340Var, 0, 12);
                i3 = i4;
            }
            x340Var.r(false);
            boolean zG = x340Var.g(str);
            Object objT4 = x340Var.T();
            if (zG || objT4 == m4cVar) {
                objT4 = ((rhq) ((ynb0) this.i).get()).a(str, fao0.c);
                x340Var.s0(objT4);
            }
            otw.c((hao0) objT4, rih1.a, (qim0) null, (ipb1) null, x340Var, 48, 12);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wjz0(this, ag81Var, i, (byte) 24);
        }
    }

    public void g(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(954011641);
        int i2 = (x340Var.i(this) ? 32 : 16) | i;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            otw.c((maa) ((ynb0) this.X).get(), hg81.a, (qim0) null, (ipb1) null, x340Var, 48, 12);
            String strO0 = cwl1.o0(x340Var, 2131962452);
            qim0 qim0VarB = u291.B(uyn1.w(nim0.a, ((uvx) x340Var.k(vvx.a)).e), (gra) null, 3);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarM = ktd.m(een.Q0, uyn1.y(qim0VarB, 12.0f, 16.0f));
            boolean zG = x340Var.g(strO0);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = new pg61(strO0, (byte) 20);
                x340Var.s0(objT);
            }
            xto1.e(s161.b(qim0VarM, false, (iu30) objT), 3, 0L, 0L, x340Var, 48, 12);
            x340Var = x340Var;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new dj71(this, i, (byte) 12);
        }
    }

    public final mqw getBehavior() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.c;
    }

    public rqw h(tda0 tda0Var) {
        return tda0Var.c ? (rqw) ((idd1) this.N0).getValue() : (rqw) ((idd1) this.Z).getValue();
    }

    public dea0(add addVar, Observable observable, q8n q8nVar, bfd bfdVar, jqd0 jqd0Var, ynb0 ynb0Var, ynb0 ynb0Var2, ynb0 ynb0Var3, ynb0 ynb0Var4, gqo0 gqo0Var, bm00 bm00Var) {
        this.a = (byte) 1;
        this.e = addVar;
        this.f = observable;
        this.b = q8nVar;
        this.g = bfdVar;
        this.h = jqd0Var;
        this.i = ynb0Var;
        this.t = ynb0Var2;
        this.X = ynb0Var3;
        this.Y = ynb0Var4;
        this.Z = gqo0Var;
        this.N0 = bm00Var;
        this.c = x3p1.n(new eg81(this, (byte) 0), oa81.Q0, yd81.g, (o8n) null, new eg81(this, (byte) 1), 8);
        this.O0 = new eih1();
        j2i j2iVar = new j2i(-281552766, new c771(this, (byte) 21), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }
}

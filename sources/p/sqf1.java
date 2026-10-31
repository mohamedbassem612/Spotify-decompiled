package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class sqf1 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ crf1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sqf1(crf1 crf1Var, byte b) {
        super(3);
        this.a = b;
        this.b = crf1Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        crf1 crf1Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                crm0.l(crf1Var, null, (b0k) obj2, 8);
                return rih1Var;
            case 1:
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarR = u291.r(nim0Var, 101.0f);
                uwr uwrVar = cbx.a;
                cua cuaVar = cbx.b(x340Var).f;
                cua cuaVar2 = cbx.b(x340Var).f;
                qim0 qim0VarQ = i1p1.q(qim0VarR, new zvx());
                gfh0 gfh0VarC = t1c.c(een.d, false);
                x340 x340Var2 = x340Var;
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarQ);
                hzj.A.getClass();
                x340 x340Var3 = x340Var;
                if (x340Var3.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var3.m0();
                if (x340Var3.S) {
                    x340Var3.l(n4kVar);
                } else {
                    x340Var3.v0();
                }
                nko1.H(gfh0VarC, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                Uri uri = Uri.parse(crf1Var.d);
                ltx ltxVar = ltx.c;
                x2g0.p(uri, false, new nux(ltxVar, ltxVar), u291.r(nim0Var, 101.0f), null, x340Var, 3632, 96);
                x340Var3.r(true);
                return rih1Var;
            default:
                x340 x340Var4 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar2 = cbx.a;
                cvx cvxVar = cbx.b(x340Var4).b;
                mbh mbhVarA = jbh.a(new d36(4.0f, true, new um5(false)), een.P0, x340Var4, 0);
                x340 x340Var5 = x340Var4;
                int iHashCode2 = Long.hashCode(x340Var5.T);
                xos0 xos0VarM2 = x340Var5.m();
                qim0 qim0VarE2 = zr7.E(x340Var4, nim0Var);
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
                nko1.H(xos0VarM2, x340Var4, y580.N0);
                nko1.H(Integer.valueOf(iHashCode2), x340Var4, y580.R0);
                nko1.F(x340Var4);
                nko1.H(qim0VarE2, x340Var4, y580.Y);
                uwo1.e(crf1Var.c, (qim0) null, cbx.d(x340Var4).j, 0L, (a0e1) null, (iu30) null, 2, false, new zic0(1), 0, (qx8) null, x340Var4, 0, 0, 1722);
                d761 d761Var = crf1Var.g;
                if (d761Var == null) {
                    x340Var6.i0(1802566864);
                } else {
                    x340Var6.i0(1802566865);
                    qgo1.f(d761Var.g((djc0) null, x340Var4, 1), (qim0) null, (a0e1) null, 0, false, (iu30) null, x340Var4, 8, 62);
                }
                x340Var6.r(false);
                x340Var6.r(true);
                return rih1Var;
        }
    }
}

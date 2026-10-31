package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class d8f1 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ q8f1 b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d8f1(q8f1 q8f1Var, boolean z, byte b) {
        super(3);
        this.a = b;
        this.b = q8f1Var;
        this.c = z;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        x340 x340Var;
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        boolean z = this.c;
        rih1 rih1Var = rih1.a;
        nim0 nim0Var = nim0.a;
        q8f1 q8f1Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var2 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarQ = i1p1.q(u291.r(nim0Var, 88.0f), er31.a);
                gfh0 gfh0VarC = t1c.c(een.d, false);
                x340 x340Var3 = x340Var2;
                int iHashCode = Long.hashCode(x340Var3.T);
                xos0 xos0VarM = x340Var3.m();
                qim0 qim0VarE = zr7.E(x340Var2, qim0VarQ);
                hzj.A.getClass();
                x340 x340Var4 = x340Var2;
                if (x340Var4.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var4.m0();
                if (x340Var4.S) {
                    x340Var4.l(n4kVar);
                } else {
                    x340Var4.v0();
                }
                nko1.H(gfh0VarC, x340Var2, y580.O0);
                nko1.H(xos0VarM, x340Var2, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                nko1.F(x340Var2);
                nko1.H(qim0VarE, x340Var2, y580.Y);
                Uri uri = Uri.parse(q8f1Var.g);
                ltx ltxVar = ltx.c;
                x2g0.p(uri, this.c, new nux(ltxVar, ltxVar), u291.r(nim0Var, 88.0f), mif1.P0, x340Var2, 3584, 64);
                x340Var4.r(true);
                return rih1Var;
            case 1:
                x340 x340Var5 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var5).b;
                d36 d36Var = new d36(4.0f, true, new um5(false));
                d761 d761Var = q8f1Var.h;
                mbh mbhVarA = jbh.a(d36Var, een.P0, x340Var5, 0);
                x340 x340Var6 = x340Var5;
                int iHashCode2 = Long.hashCode(x340Var6.T);
                xos0 xos0VarM2 = x340Var6.m();
                qim0 qim0VarE2 = zr7.E(x340Var5, nim0Var);
                hzj.A.getClass();
                x340 x340Var7 = x340Var5;
                if (x340Var7.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var7.m0();
                if (x340Var7.S) {
                    x340Var7.l(n4kVar);
                } else {
                    x340Var7.v0();
                }
                nko1.H(mbhVarA, x340Var5, y580.O0);
                nko1.H(xos0VarM2, x340Var5, y580.N0);
                nko1.H(Integer.valueOf(iHashCode2), x340Var5, y580.R0);
                nko1.F(x340Var5);
                nko1.H(qim0VarE2, x340Var5, y580.Y);
                if (d761Var == null) {
                    x340Var7.i0(1712460403);
                    x340Var7.r(false);
                    x340Var = x340Var7;
                } else {
                    x340Var7.i0(1712460404);
                    x340Var = x340Var7;
                    qgo1.f(d761Var.g(new zic0(1), x340Var5, 0), x9p1.j(nim0Var, z), (a0e1) null, 0, false, (iu30) null, x340Var5, 8, 60);
                    x340Var.r(false);
                }
                x340Var.r(true);
                return rih1Var;
            default:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                String str = q8f1Var.a;
                uwr uwrVar2 = cbx.a;
                uwo1.e(str, x9p1.j(nim0Var, z), cbx.d(b0kVar).g, 0L, (a0e1) null, (iu30) null, 2, false, new zic0(1), 0, (qx8) null, b0kVar, 0, 0, 1720);
                return rih1Var;
        }
    }
}

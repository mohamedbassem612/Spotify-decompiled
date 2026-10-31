package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jff1 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zff1 b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jff1(zff1 zff1Var, boolean z, byte b) {
        super(3);
        this.a = b;
        this.b = zff1Var;
        this.c = z;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        boolean z = this.c;
        rih1 rih1Var = rih1.a;
        zff1 zff1Var = this.b;
        switch (b) {
            case 0:
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
                Uri uri = Uri.parse(zff1Var.h);
                ltx ltxVar = ltx.c;
                x2g0.p(uri, this.c, new nux(ltxVar, ltxVar), u291.r(nim0Var, 101.0f), (j6m) null, x340Var, 3584, 96);
                x340Var3.r(true);
                return rih1Var;
            case 1:
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
                uwo1.e(zff1Var.t, x9p1.j(nim0Var, z), cbx.d(x340Var4).j, 0L, (a0e1) null, (iu30) null, 2, false, new zic0(1), 0, (qx8) null, x340Var4, 0, 0, 1720);
                d761 d761Var = zff1Var.c;
                if (d761Var == null) {
                    x340Var6.i0(-1702389489);
                    x340Var6.r(false);
                } else {
                    x340Var6.i0(-1702389488);
                    qgo1.f(d761Var.g((djc0) null, x340Var4, 1), x9p1.j(nim0Var, z), (a0e1) null, 0, false, (iu30) null, x340Var4, 8, 60);
                    x340Var6.r(false);
                }
                x340Var6.r(true);
                return rih1Var;
            default:
                ((Number) obj3).intValue();
                d761 d761Var2 = zff1Var.i;
                x340 x340Var7 = (b0k) obj2;
                if (d761Var2 == null) {
                    x340Var7.i0(867684708);
                    x340Var7.r(false);
                } else {
                    x340Var7.i0(867684709);
                    qgo1.f(d761Var2.g((djc0) null, x340Var7, 1), x9p1.j(uyn1.B(nim0.a, 36.0f, 0.0f, 0.0f, 0.0f, 14), z), (a0e1) null, 0, false, (iu30) null, x340Var7, 8, 60);
                    x340Var7.r(false);
                }
                return rih1Var;
        }
    }
}

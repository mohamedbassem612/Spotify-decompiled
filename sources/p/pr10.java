package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pr10 extends hab0 implements xu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pr10(long j, o6j1 o6j1Var, hdn0 hdn0Var, boolean z, boolean z2) {
        super(3);
        this.b = j;
        this.e = o6j1Var;
        this.f = hdn0Var;
        this.c = z;
        this.d = z2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        max maxVar;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = this.d;
        Object obj4 = this.f;
        Object obj5 = this.e;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                iu30 iu30Var = (iu30) obj5;
                x340 x340Var = (b0k) obj2;
                String str = (String) obj4;
                boolean zG = x340Var.g(iu30Var) | x340Var.g(str);
                Object objT = x340Var.T();
                if (zG || objT == fkj0.X) {
                    objT = new are(iu30Var, str, (byte) 7);
                    x340Var.s0(objT);
                }
                gbx gbxVar = new gbx(z50.c, (Function0) objT);
                ldx ldxVar = ldx.c;
                gdx gdxVarS = yla.s(x340Var);
                if (this.c) {
                    x340Var.i0(235130776);
                    x340Var.r(false);
                    maxVar = jax.a;
                } else {
                    x340Var.i0(235184437);
                    max haxVar = new hax(cwl1.o0(x340Var, 2131958264));
                    x340Var.r(false);
                    maxVar = haxVar;
                }
                foo1.c(gbxVar, ldxVar, anm1.N("feedback_actions_thumbs_down_button", nim0.a), maxVar, gdxVarS, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(196126875, new me3(this.b, z), x340Var), x340Var, 0, 48, 1992);
                return rih1Var;
            default:
                ((Number) obj3).intValue();
                nim0 nim0Var = nim0.a;
                qim0 qim0VarC = u291.c(uyn1.B(nim0Var, 12.0f, 0.0f, 16.0f, 0.0f, 10), 1.0f);
                x340 x340Var2 = (b0k) obj2;
                Object objT2 = x340Var2.T();
                j06 j06Var = x340Var2.a;
                if (objT2 == fkj0.X) {
                    objT2 = td4.o;
                    x340Var2.s0(objT2);
                }
                gfh0 gfh0Var = (gfh0) objT2;
                o6j1 o6j1Var = (o6j1) obj5;
                hdn0 hdn0Var = (hdn0) obj4;
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(x340Var2, qim0VarC);
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
                nko1.H(gfh0Var, x340Var2, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var2, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var2, lljVar3);
                nko1.F(x340Var2);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var2, lljVar4);
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
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
                String str2 = o6j1Var.g;
                String str3 = o6j1Var.h;
                long j = this.b;
                x340 x340Var3 = x340Var2;
                boolean z3 = this.c;
                k1p1.g(j, str2, str3, hdn0Var, z3, x340Var3, 0);
                if (z) {
                    x340Var3.i0(172315975);
                    x340Var3.r(false);
                } else {
                    v8i0.i(8.0f, 171965210, x340Var3, x340Var3, nim0Var);
                    k1p1.b(o6j1Var.f, hdn0Var, j, z3, x340Var3, 0);
                    x340Var3 = x340Var3;
                    x340Var3.r(false);
                }
                x340Var3.r(true);
                x340Var3.r(true);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pr10(iu30 iu30Var, String str, boolean z, long j, boolean z2) {
        super(3);
        this.e = iu30Var;
        this.f = str;
        this.c = z;
        this.b = j;
        this.d = z2;
    }
}

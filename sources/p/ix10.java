package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ix10 extends hab0 implements xu30 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ fyo1 h;
    public final /* synthetic */ gbx i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ix10(boolean z, boolean z2, float f, Function0 function0, boolean z3, String str, String str2, fyo1 fyo1Var, gbx gbxVar) {
        super(3);
        this.a = z;
        this.b = z2;
        this.c = f;
        this.d = function0;
        this.e = z3;
        this.f = str;
        this.g = str2;
        this.h = fyo1Var;
        this.i = gbxVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        x340 x340Var2 = x340Var;
        boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16);
        j06 j06Var = x340Var2.a;
        if (zY) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var2, 48);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarF);
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
            jyo1.c(this.a, this.b, this.c, (qim0) null, this.d, x340Var2, 0);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0VarB = uyn1.B(nim0Var, 8.0f, 0.0f, 0.0f, 0.0f, 14);
            if (1.0f <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            qim0 qim0VarThen = qim0VarB.then(new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarThen);
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
            uwo1.e(this.f, (qim0) null, cbx.d(x340Var2).k, cbx.a(x340Var2).b.a, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var2, 1572864, 0, 1714);
            Object objT = x340Var2.T();
            if (objT == fkj0.X) {
                objT = zs10.N0;
                x340Var2.s0(objT);
            }
            hm5.a(this.g, (qim0) null, (iu30) objT, (tl3) null, "subtitleCrossfade", (iu30) null, hoi.a, x340Var2, 1597824, 42);
            x340Var2.r(true);
            fq7.f(this.e, (qim0) null, xay.e(2, irn1.o0(250, 0, (dlv) null, 6)), xay.f(2, irn1.o0(250, 0, (dlv) null, 6)), (String) null, apo.r(1873490305, new cex(this.h, this.i, (byte) 11), x340Var2), x340Var2, 1600518, 18);
            x340Var2.r(true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}

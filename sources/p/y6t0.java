package p;

import androidx.compose.ui.graphics.ColorFilter;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class y6t0 extends hab0 implements vu30 {
    public final /* synthetic */ tob1 a;
    public final /* synthetic */ qim0 b;
    public final /* synthetic */ cr31 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ yj41 e;
    public final /* synthetic */ mdm1 f;
    public final /* synthetic */ mdm1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6t0(tob1 tob1Var, qim0 qim0Var, cr31 cr31Var, long j, yj41 yj41Var, mdm1 mdm1Var, mdm1 mdm1Var2) {
        super(2);
        this.a = tob1Var;
        this.b = qim0Var;
        this.c = cr31Var;
        this.d = j;
        this.e = yj41Var;
        this.f = mdm1Var;
        this.g = mdm1Var2;
    }

    public final Object invoke(Object obj, Object obj2) {
        Function0 function0;
        qim0 qim0Var;
        int i;
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = x340Var;
        boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2);
        j06 j06Var = x340Var2.a;
        if (zY) {
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var2).a.c;
            tob1 tob1Var = this.a;
            boolean zG = x340Var2.g(tob1Var);
            Object objT = x340Var2.T();
            if (zG || objT == m4cVar) {
                objT = yv91.a(new bu2(tob1Var, (byte) 15));
                x340Var2.s0(objT);
            }
            tob1 tob1Var2 = (tob1) objT;
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, this.b);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z = x340Var2.S;
            Function0 function1 = hmb0.t1;
            if (z) {
                x340Var2.l(function1);
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
            boolean zBooleanValue = ((Boolean) tob1Var2.getValue()).booleanValue();
            qim0 qim0Var2 = nim0.a;
            tob1 tob1Var3 = this.a;
            if (zBooleanValue) {
                x340Var2.i0(-1779529032);
                qim0 qim0VarB = h2c.a.b(qim0Var2);
                boolean zG2 = x340Var2.g(tob1Var3);
                Object objT2 = x340Var2.T();
                if (zG2 || objT2 == m4cVar) {
                    objT2 = new lws0(tob1Var3, (byte) 1);
                    x340Var2.s0(objT2);
                }
                w6t0.a(i541.C(qim0VarB, (iu30) objT2), x340Var2, 6);
                x340Var2.r(false);
            } else {
                x340Var2.i0(-1779244576);
                x340Var2.r(false);
            }
            qim0 qim0VarQ = i1p1.q(u291.j(64.0f, 0.0f, 2, u291.w(qim0Var2, 170.0f, 330.0f)), this.c);
            long j2 = this.d;
            boolean zF = x340Var2.f(j2) | x340Var2.f(j) | x340Var2.g(tob1Var3);
            Object objT3 = x340Var2.T();
            if (zF || objT3 == m4cVar) {
                objT3 = new x6t0(j2, j, tob1Var3, (byte) 0);
                x340Var2.s0(objT3);
            }
            qim0 qim0VarQ2 = exd0.q(qim0VarQ, (iu30) objT3);
            cvx cvxVar = cbx.b(x340Var2).b;
            cvx cvxVar2 = cbx.b(x340Var2).b;
            qim0 qim0VarY = uyn1.y(qim0VarQ2, 12.0f, 8.0f);
            fra fraVar = een.N0;
            cvx cvxVar3 = cbx.b(x340Var2).b;
            jw31 jw31VarA = ew31.a(new d36(12.0f, true, new um5(false)), fraVar, x340Var2, 48);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarY);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(function1);
            } else {
                x340Var2.v0();
            }
            nko1.H(jw31VarA, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar4);
            yj41 yj41Var = this.e;
            if (yj41Var != null) {
                x340Var2.i0(-301133814);
                yk4 yk4Var = new yk4(yj41Var.a);
                ksl kslVarA = yj41Var.a();
                p3v p3vVar = new p3v(40.0f);
                cua cuaVar = cbx.b(x340Var2).f;
                cua cuaVar2 = cbx.b(x340Var2).f;
                function0 = function1;
                qim0Var = qim0Var2;
                i = 6;
                eso1.f(yk4Var, kslVarA, (qim0) null, p3vVar, new zvx(), (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, x340Var2, 3072, 484);
                x340Var2 = x340Var2;
                x340Var2.r(false);
            } else {
                function0 = function1;
                qim0Var = qim0Var2;
                i = 6;
                x340Var2.i0(-300880947);
                t1c.a(dug.f(i1p1.q(u291.r(qim0Var, 40.0f), er31.b(4.0f)), cbx.a(x340Var2).d.b, d4o1.a), x340Var2, 0);
                x340Var2.r(false);
            }
            mbh mbhVarA = jbh.a(h36.e, een.P0, x340Var2, i);
            int iHashCode3 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM3 = x340Var2.m();
            qim0 qim0VarE3 = zr7.E(x340Var2, qim0Var);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(function0);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA, x340Var2, lljVar);
            nko1.H(xos0VarM3, x340Var2, lljVar2);
            x0d.q(iHashCode3, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE3, x340Var2, lljVar4);
            qgo1.f((vnr0) this.f.invoke(x340Var2, 0), (qim0) null, (a0e1) null, 0, false, (iu30) null, x340Var2, 8, 62);
            qgo1.f((vnr0) this.g.invoke(x340Var2, 0), (qim0) null, (a0e1) null, 0, false, (iu30) null, x340Var2, 8, 62);
            us71.m(x340Var2, true, true, true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}

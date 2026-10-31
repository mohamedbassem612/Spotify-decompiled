package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ucx extends hab0 implements vu30 {
    public final /* synthetic */ tl3 N0;
    public final /* synthetic */ xu30 O0;
    public final /* synthetic */ ga80 P0;
    public final /* synthetic */ idn0 X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ vzq0 Z;
    public final /* synthetic */ qim0 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ max c;
    public final /* synthetic */ gbx d;
    public final /* synthetic */ gbx e;
    public final /* synthetic */ hb5 f;
    public final /* synthetic */ hw61 g;
    public final /* synthetic */ long h;
    public final /* synthetic */ pgx i;
    public final /* synthetic */ afx t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ucx(qim0 qim0Var, boolean z, max maxVar, gbx gbxVar, gbx gbxVar2, hb5 hb5Var, hw61 hw61Var, long j, pgx pgxVar, afx afxVar, idn0 idn0Var, boolean z2, vzq0 vzq0Var, tl3 tl3Var, xu30 xu30Var, ga80 ga80Var) {
        super(2);
        this.a = qim0Var;
        this.b = z;
        this.c = maxVar;
        this.d = gbxVar;
        this.e = gbxVar2;
        this.f = hb5Var;
        this.g = hw61Var;
        this.h = j;
        this.i = pgxVar;
        this.t = afxVar;
        this.X = idn0Var;
        this.Y = z2;
        this.Z = vzq0Var;
        this.N0 = tl3Var;
        this.O0 = xu30Var;
        this.P0 = ga80Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        qim0 qim0VarV;
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            x340Var2.i0(-1674404044);
            qim0 qim0VarH = pqo.h(this.a, !this.b);
            max maxVar = this.c;
            boolean zG = x340Var2.g(maxVar);
            Object objT = x340Var2.T();
            if (zG || objT == m4cVar) {
                objT = new s20(maxVar, (byte) 20);
                x340Var2.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarH, false, (iu30) objT);
            gbx gbxVar = this.e;
            gbx gbxVar2 = this.d;
            boolean z = (gbxVar2 == null && gbxVar == null) ? false : true;
            qim0 qim0VarE = nim0.a;
            if (z) {
                String str = gbxVar2 != null ? gbxVar2.c : null;
                pm31 pm31Var = new pm31(0);
                String str2 = gbxVar != null ? gbxVar.c : null;
                Function0 function0 = gbxVar != null ? gbxVar.b : null;
                Function0 function1 = gbxVar2 != null ? gbxVar2.b : null;
                if (function1 == null) {
                    x340Var2.i0(888149286);
                    Object objT2 = x340Var2.T();
                    if (objT2 == m4cVar) {
                        objT2 = xzu.Y0;
                        x340Var2.s0(objT2);
                    }
                    function1 = (Function0) objT2;
                } else {
                    x340Var2.i0(-941181937);
                }
                x340Var2.r(false);
                qim0VarB = qim0VarB.then(bin.y(qim0VarE, this.X, this.P0, this.b, str, pm31Var, str2, function0, function1, 256));
            }
            x340Var2.r(false);
            hw61 hw61Var = this.g;
            hb5 hb5Var = this.f;
            if (hb5Var != null) {
                long j = hb5Var.b;
                long j2 = hb5Var.a;
                qim0 qim0VarE2 = u7h.c(j) > 0.0f ? d1u.E(1.0f, j, qim0VarE, hw61Var) : qim0VarE;
                if (u7h.c(j2) > 0.0f) {
                    qim0VarE2 = qim0VarE2.then(dug.f(qim0VarE, j2, hw61Var));
                }
                qim0VarV = i1p1.q(qim0VarE2, hw61Var);
            } else {
                long j3 = this.h;
                if (u7h.c(j3) > 0.0f) {
                    qim0VarE = d1u.E(1.0f, j3, qim0VarE, hw61Var);
                }
                qim0VarV = cwl1.v(qim0VarE, this.g, this.i, this.t, this.X, this.Y);
            }
            qim0 qim0VarW = uyn1.w(qim0VarB.then(qim0VarV), this.Z);
            gfh0 gfh0VarC = t1c.c(this.N0, true);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE3 = zr7.E(x340Var2, qim0VarW);
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
            nko1.H(gfh0VarC, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE3, x340Var2, y580.Y);
            hrt.k(6, this.O0, h2c.a, x340Var2, true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}

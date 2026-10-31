package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class l6f1 extends hab0 implements vu30 {
    public final /* synthetic */ drr0 N0;
    public final /* synthetic */ drr0 X;
    public final /* synthetic */ tob1 Y;
    public final /* synthetic */ tob1 Z;
    public final /* synthetic */ int a;
    public final /* synthetic */ c380 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ ven0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6f1(int i, c380 c380Var, int i2, float f, float f2, float f3, float f4, boolean z, boolean z2, ven0 ven0Var, drr0 drr0Var, tob1 tob1Var, tob1 tob1Var2, drr0 drr0Var2) {
        super(2);
        this.a = i;
        this.b = c380Var;
        this.c = i2;
        this.d = f;
        this.e = f2;
        this.f = f3;
        this.g = f4;
        this.h = z;
        this.i = z2;
        this.t = ven0Var;
        this.X = drr0Var;
        this.Y = tob1Var;
        this.Z = tob1Var2;
        this.N0 = drr0Var2;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        gra graVar = een.d;
        x340 x340Var2 = x340Var;
        boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2);
        j06 j06Var = x340Var2.a;
        if (zY) {
            qim0 qim0Var = nim0.a;
            qim0 qim0VarThen = u291.d(qim0Var, 1.0f).then(this.a > 0 ? i1p1.r(qim0Var) : qim0Var);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarThen);
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
            nko1.H(gfh0VarC, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            c380 c380Var = this.b;
            int iL = p7h.L(c380Var);
            int i = this.c;
            int iMin = Math.min(iL - i, p7h.L(k6f1.a));
            float f = this.d;
            float f2 = this.e;
            qim0 qim0VarS = u291.s(qim0Var, f2, this.f);
            gfh0 gfh0VarC2 = t1c.c(graVar, false);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            float f3 = f - f2;
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarS);
            x340Var2.m0();
            float f4 = f2;
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC2, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar4);
            x340Var2.i0(1439597724);
            int i2 = iMin;
            while (-1 < i2) {
                x340Var2.f0(1439599322, Integer.valueOf(i2));
                yj41 yj41Var = ((r6f1) c380Var.get(i + i2)).d;
                gjn gjnVar = (gjn) k6f1.a.get(i2);
                Object objT = x340Var2.T();
                m4c m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = new ptf0(this.N0, (byte) 1);
                    x340Var2.s0(objT);
                }
                Function0 function0 = (Function0) objT;
                ven0 ven0Var = this.t;
                boolean zG = x340Var2.g(ven0Var);
                drr0 drr0Var = this.X;
                boolean zG2 = zG | x340Var2.g(drr0Var);
                tob1 tob1Var = this.Y;
                boolean zG3 = zG2 | x340Var2.g(tob1Var);
                Object objT2 = x340Var2.T();
                if (zG3 || objT2 == m4cVar) {
                    objT2 = new o8e1(tob1Var, ven0Var, drr0Var, (byte) 5);
                    x340Var2.s0(objT2);
                }
                Function0 function1 = (Function0) objT2;
                boolean zE = x340Var2.e(i);
                tob1 tob1Var2 = this.Z;
                boolean zG4 = zE | x340Var2.g(tob1Var2);
                Object objT3 = x340Var2.T();
                if (zG4 || objT3 == m4cVar) {
                    objT3 = new gf6(i, tob1Var2, (byte) 14);
                    x340Var2.s0(objT3);
                }
                x340 x340Var3 = x340Var2;
                int i3 = i;
                float f5 = f4;
                float f6 = f3;
                smo1.l(yj41Var, gjnVar, i2, f5, this.g, f6, function0, this.a, this.h, this.i, function1, (Function0) objT3, h2c.a.a(qim0Var, graVar), x340Var3, 1572872);
                f4 = f5;
                x340Var3.r(false);
                i2--;
                f3 = f6;
                i = i3;
                x340Var2 = x340Var3;
            }
            us71.m(x340Var2, false, true, true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}

package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lok1 extends hab0 implements vu30 {
    public final /* synthetic */ float X;
    public final /* synthetic */ Function0 Y;
    public final /* synthetic */ Function0 Z;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ umk1 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ hnk1 d;
    public final /* synthetic */ mr20 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Function0 h;
    public final /* synthetic */ Function0 i;
    public final /* synthetic */ float t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lok1(boolean z, umk1 umk1Var, boolean z2, hnk1 hnk1Var, mr20 mr20Var, boolean z3, boolean z4, Function0 function0, Function0 function1, float f, float f2, Function0 function2, Function0 function3) {
        super(2);
        this.a = z;
        this.b = umk1Var;
        this.c = z2;
        this.d = hnk1Var;
        this.e = mr20Var;
        this.f = z3;
        this.g = z4;
        this.h = function0;
        this.i = function1;
        this.t = f;
        this.X = f2;
        this.Y = function2;
        this.Z = function3;
    }

    public final Object invoke(Object obj, Object obj2) {
        float f;
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            qim0 qim0Var = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarF);
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
            nko1.H(jw31VarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            boolean z = this.a;
            boolean z2 = z && (this.b instanceof tmk1);
            float f2 = 0.0f;
            boolean z3 = this.c;
            if (z3) {
                x340Var2.i0(-121098999);
                x340Var2.r(false);
                f = 0.0f;
            } else {
                x340Var2.i0(-121097874);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var2).b;
                x340Var2.r(false);
                f = 12.0f;
            }
            if (z3) {
                x340Var2.i0(-121095159);
                x340Var2.r(false);
            } else {
                x340Var2.i0(-121094033);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar2 = cbx.b(x340Var2).b;
                x340Var2.r(false);
                f2 = 4.0f;
            }
            float f3 = f2;
            qim0 wnb0Var = z3 ? new wnb0(1.0f, true) : qim0Var;
            hnk1 hnk1Var = this.d;
            mr20 mr20Var = this.e;
            boolean z4 = this.f;
            boolean z5 = this.g;
            Function0 function0 = this.h;
            Function0 function1 = this.i;
            pok1.l(hnk1Var, mr20Var, z4, z5, z2, function0, function1, this.t, f, f3, wnb0Var, x340Var2, 0);
            if (z3) {
                x340Var2.i0(541296648);
                op71.g(x340Var2, u291.v(qim0Var, 12.0f));
                pok1.a(hnk1Var, z5, z, this.X, function1, this.Y, this.Z, x340Var2, 0);
                x340Var2.r(false);
            } else {
                x340Var2.i0(541683931);
                x340Var2.r(false);
            }
            x340Var2.r(true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}

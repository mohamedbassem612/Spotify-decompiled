package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ys51 extends hab0 implements vu30 {
    public final /* synthetic */ agv N0;
    public final /* synthetic */ Function0 O0;
    public final /* synthetic */ long X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ ps51 Z;
    public final /* synthetic */ c380 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ long i;
    public final /* synthetic */ float t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ys51(c380 c380Var, long j, long j2, iu30 iu30Var, Function0 function0, Function0 function1, boolean z, boolean z2, long j3, float f, long j4, long j5, ps51 ps51Var, agv agvVar, Function0 function2) {
        super(2);
        this.a = c380Var;
        this.b = j;
        this.c = j2;
        this.d = iu30Var;
        this.e = function0;
        this.f = function1;
        this.g = z;
        this.h = z2;
        this.i = j3;
        this.t = f;
        this.X = j4;
        this.Y = j5;
        this.Z = ps51Var;
        this.N0 = agvVar;
        this.O0 = function2;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            cvx cvxVar2 = cbx.b(x340Var2).b;
            cvx cvxVar3 = cbx.b(x340Var2).b;
            cvx cvxVar4 = cbx.b(x340Var2).b;
            qim0 qim0VarA = uyn1.A(qim0VarF, 16.0f, 8.0f, 16.0f, 8.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarA);
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
            nko1.H(mbhVarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            c380 c380Var = this.a;
            long j = this.b;
            long j2 = this.c;
            ft51.d(c380Var, j, j2, this.d, this.e, this.f, this.g, this.h, this.i, this.t, null, x340Var2, 0, 1024);
            ft51.h(j2, j, this.X, this.Y, this.Z, this.N0, this.O0, x340Var2, 0);
            x340Var2.r(true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}

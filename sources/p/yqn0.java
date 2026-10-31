package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class yqn0 extends hab0 implements vu30 {
    public final /* synthetic */ qim0 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ xqn0 e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ vu30 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yqn0(qim0 qim0Var, boolean z, boolean z2, int i, xqn0 xqn0Var, Function0 function0, Function0 function1, vu30 vu30Var) {
        super(2);
        this.a = qim0Var;
        this.b = z;
        this.c = z2;
        this.d = i;
        this.e = xqn0Var;
        this.f = function0;
        this.g = function1;
        this.h = vu30Var;
    }

    @Override // p.vu30
    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(tgp1.l(x340Var2));
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, this.a);
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
            boolean z = this.b;
            boolean z2 = this.c;
            int i = this.d;
            xqn0 xqn0Var = this.e;
            eqn1.j(z, z2, i, xqn0Var, this.f, (qim0) null, this.g, this.h, x340Var2, 0);
            if (xqn0Var.c != null) {
                x340Var2.i0(-570677252);
                qim0 qim0VarB = uyn1.B(nim0.a, 0.0f, 2.0f, 0.0f, 0.0f, 13);
                uwr uwrVar = cbx.a;
                uwo1.e(xqn0Var.c, qim0VarB, cbx.d(x340Var2).j, cbx.a(x340Var2).b.b, new a0e1(5), (iu30) null, 2, false, new cjc0(xqn0Var.d), 0, (qx8) null, x340Var2, 0, 0, 1696);
                x340Var2 = x340Var2;
                x340Var2.r(false);
            } else {
                x340Var2.i0(-570344498);
                x340Var2.r(false);
            }
            x340Var2.r(true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}

package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class u7m extends hab0 implements vu30 {
    public final /* synthetic */ Function0 N0;
    public final /* synthetic */ String X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ vu30 Z;
    public final /* synthetic */ l7c1 a;
    public final /* synthetic */ n8m b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ ven0 f;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ ven0 i;
    public final /* synthetic */ i7m t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7m(l7c1 l7c1Var, n8m n8mVar, boolean z, boolean z2, int i, ven0 ven0Var, Function0 function0, boolean z3, ven0 ven0Var2, i7m i7mVar, String str, boolean z4, vu30 vu30Var, Function0 function1) {
        super(2);
        this.a = l7c1Var;
        this.b = n8mVar;
        this.c = z;
        this.d = z2;
        this.e = i;
        this.f = ven0Var;
        this.g = function0;
        this.h = z3;
        this.i = ven0Var2;
        this.t = i7mVar;
        this.X = str;
        this.Y = z4;
        this.Z = vu30Var;
        this.N0 = function1;
    }

    public final Object invoke(Object obj, Object obj2) {
        Function0 function0;
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            l7c1 l7c1Var = this.a;
            if (l7c1Var.e == 3) {
                x340Var2.i0(-1041631538);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var2).b;
                g8m.a(anm1.N("content_story_card_trending_indicator", uyn1.B(nim0.a, 0.0f, 0.0f, 0.0f, 8.0f, 7)), x340Var2, 0);
                x340Var2.r(false);
            } else {
                x340Var2.i0(-1041406664);
                x340Var2.r(false);
            }
            boolean z = this.c || this.d;
            int i = this.e;
            if (i == 0) {
                x340Var2.i0(-1040962217);
                ven0 ven0Var = this.f;
                boolean zI = x340Var2.i(ven0Var);
                Function0 function1 = this.g;
                boolean zG = zI | x340Var2.g(function1);
                Object objT = x340Var2.T();
                if (zG || objT == m4cVar) {
                    objT = new cb(function1, ven0Var, (byte) 10);
                    x340Var2.s0(objT);
                }
                function0 = (Function0) objT;
                x340Var2.r(false);
            } else if (this.h && i == 1) {
                x340Var2.i0(-1040756594);
                ven0 ven0Var2 = this.i;
                boolean zI2 = x340Var2.i(ven0Var2);
                Object objT2 = x340Var2.T();
                if (zI2 || objT2 == m4cVar) {
                    objT2 = new hnf(ven0Var2, (byte) 11);
                    x340Var2.s0(objT2);
                }
                function0 = (Function0) objT2;
                x340Var2.r(false);
            } else {
                x340Var2.i0(-1040658573);
                x340Var2.r(false);
                function0 = null;
            }
            Function0 function2 = function0;
            int size = this.t.a.size();
            vu30 vu30Var = this.Z;
            boolean zG2 = x340Var2.g(vu30Var) | x340Var2.e(i);
            Object objT3 = x340Var2.T();
            if (zG2 || objT3 == m4cVar) {
                objT3 = new t7m(vu30Var, i, (byte) 0);
                x340Var2.s0(objT3);
            }
            otw.c(this.b, new j8m(this.X, l7c1Var, this.Y, z, (iu30) objT3, function2, this.e, size, this.N0), (qim0) null, (ipb1) null, x340Var2, 0, 12);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}

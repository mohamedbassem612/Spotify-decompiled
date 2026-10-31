package p;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class c2m1 extends hab0 implements zu30 {
    public final /* synthetic */ iu30 X;
    public final /* synthetic */ Function0 Y;
    public final /* synthetic */ m4m1 a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ iu30 e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ iu30 g;
    public final /* synthetic */ iu30 h;
    public final /* synthetic */ iu30 i;
    public final /* synthetic */ Function0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2m1(m4m1 m4m1Var, iu30 iu30Var, iu30 iu30Var2, Function0 function0, iu30 iu30Var3, Function0 function1, iu30 iu30Var4, iu30 iu30Var5, iu30 iu30Var6, Function0 function2, iu30 iu30Var7, Function0 function3) {
        super(4);
        this.a = m4m1Var;
        this.b = iu30Var;
        this.c = iu30Var2;
        this.d = function0;
        this.e = iu30Var3;
        this.f = function1;
        this.g = iu30Var4;
        this.h = iu30Var5;
        this.i = iu30Var6;
        this.t = function2;
        this.X = iu30Var7;
        this.Y = function3;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) throws NoWhenBranchMatchedException {
        x340 x340Var = (b0k) obj3;
        ((Number) obj4).intValue();
        int iOrdinal = ((ws61) obj2).ordinal();
        m4m1 m4m1Var = this.a;
        if (iOrdinal == 0) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(1226614547);
            cgj1.d(m4m1Var.c, m4m1Var.d, m4m1Var.e, m4m1Var.f, this.b, null, this.c, x340Var2, 0);
            x340Var2.r(false);
        } else if (iOrdinal == 1) {
            x340 x340Var3 = x340Var;
            x340Var3.i0(1226650587);
            nb51.g(m4m1Var.k, m4m1Var.l, m4m1Var.m, m4m1Var.n, this.h, this.i, (qim0) null, this.t, x340Var3, 0);
            x340Var3.r(false);
        } else if (iOrdinal == 2) {
            x340 x340Var4 = x340Var;
            x340Var4.i0(1226665376);
            mth1.k(m4m1Var.o, this.X, (qim0) null, x340Var4, 0);
            x340Var4.r(false);
        } else if (iOrdinal == 3) {
            x340 x340Var5 = x340Var;
            x340Var5.i0(1226671353);
            cto1.a(0, this.Y, x340Var5, (qim0) null, m4m1Var.f17p);
            x340Var5.r(false);
        } else {
            if (iOrdinal != 4) {
                throw p3d1.k(x340Var, 1226614290, false);
            }
            x340 x340Var6 = x340Var;
            x340Var6.i0(-629247613);
            boolean z = m4m1Var.q;
            int i = m4m1Var.g;
            int i2 = m4m1Var.h;
            int i3 = m4m1Var.i;
            int i4 = m4m1Var.j;
            boolean z2 = m4m1Var.r;
            boolean z3 = m4m1Var.s;
            gj4 gj4Var = m4m1Var.v;
            j7p1.b(z, this.d, i, i2, i3, i4, this.e, z2, this.f, (qim0) null, z3, this.g, gj4Var, x340Var6, 0);
            x340Var6.r(false);
        }
        return rih1.a;
    }
}

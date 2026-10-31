package p;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class b9j1 extends hab0 implements vu30 {
    public final /* synthetic */ qim0 X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ int Z;
    public final /* synthetic */ fdj1 a;
    public final /* synthetic */ jbj1 b;
    public final /* synthetic */ j2i c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ Function0 h;
    public final /* synthetic */ Function0 i;
    public final /* synthetic */ Function0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b9j1(fdj1 fdj1Var, jbj1 jbj1Var, j2i j2iVar, iu30 iu30Var, Function0 function0, Function0 function1, Function0 function2, Function0 function3, Function0 function4, Function0 function5, qim0 qim0Var, int i, int i2) {
        super(2);
        this.a = fdj1Var;
        this.b = jbj1Var;
        this.c = j2iVar;
        this.d = iu30Var;
        this.e = function0;
        this.f = function1;
        this.g = function2;
        this.h = function3;
        this.i = function4;
        this.t = function5;
        this.X = qim0Var;
        this.Y = i;
        this.Z = i2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        ((Number) obj2).intValue();
        int iP = czo1.p(this.Y | 1);
        int iP2 = czo1.p(this.Z);
        p1p1.f(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, (b0k) obj, iP, iP2);
        return rih1.a;
    }
}

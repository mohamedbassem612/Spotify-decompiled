package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mok1 extends hab0 implements vu30 {
    public final /* synthetic */ Function0 N0;
    public final /* synthetic */ Function0 X;
    public final /* synthetic */ Function0 Y;
    public final /* synthetic */ Function0 Z;
    public final /* synthetic */ hnk1 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ qim0 e;
    public final /* synthetic */ mr20 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ umk1 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mok1(hnk1 hnk1Var, long j, float f, float f2, qim0 qim0Var, mr20 mr20Var, boolean z, boolean z2, boolean z3, umk1 umk1Var, Function0 function0, Function0 function1, Function0 function2, Function0 function3, int i) {
        super(2);
        this.a = hnk1Var;
        this.b = j;
        this.c = f;
        this.d = f2;
        this.e = qim0Var;
        this.f = mr20Var;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.t = umk1Var;
        this.X = function0;
        this.Y = function1;
        this.Z = function2;
        this.N0 = function3;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(1);
        pok1.k(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, this.Z, this.N0, (b0k) obj, iP);
        return rih1.a;
    }
}

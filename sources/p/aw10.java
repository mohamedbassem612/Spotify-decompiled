package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class aw10 extends hab0 implements vu30 {
    public final /* synthetic */ int N0;
    public final /* synthetic */ int O0;
    public final /* synthetic */ boolean X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ Function0 Z;
    public final /* synthetic */ nho0 a;
    public final /* synthetic */ j5c b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ qim0 g;
    public final /* synthetic */ tob1 h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aw10(nho0 nho0Var, j5c j5cVar, iu30 iu30Var, Function0 function0, Function0 function1, Function0 function2, qim0 qim0Var, tob1 tob1Var, boolean z, boolean z2, boolean z3, int i, Function0 function3, int i2, int i3) {
        super(2);
        this.a = nho0Var;
        this.b = j5cVar;
        this.c = iu30Var;
        this.d = function0;
        this.e = function1;
        this.f = function2;
        this.g = qim0Var;
        this.h = tob1Var;
        this.i = z;
        this.t = z2;
        this.X = z3;
        this.Y = i;
        this.Z = function3;
        this.N0 = i2;
        this.O0 = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(this.N0 | 1);
        int iP2 = czo1.p(this.O0);
        cyo1.d(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, this.Z, (b0k) obj, iP, iP2);
        return rih1.a;
    }
}

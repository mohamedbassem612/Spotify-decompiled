package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ws51 extends hab0 implements vu30 {
    public final /* synthetic */ qim0 X;
    public final /* synthetic */ short Y;
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
    /* JADX WARN: Multi-variable type inference failed */
    public ws51(c380 c380Var, long j, long j2, iu30 iu30Var, Function0 function0, Function0 function1, boolean z, boolean z2, long j3, float f, qim0 qim0Var, int i, int i2) {
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
        this.X = qim0Var;
        this.Y = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(1);
        short s = this.Y;
        ft51.d(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, (b0k) obj, iP, s);
        return rih1.a;
    }
}

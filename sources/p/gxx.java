package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gxx extends hab0 implements vu30 {
    public final /* synthetic */ int N0;
    public final /* synthetic */ short O0;
    public final /* synthetic */ long X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ float a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ ksg e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ long h;
    public final /* synthetic */ long i;
    public final /* synthetic */ idn0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public gxx(float f, iu30 iu30Var, qim0 qim0Var, boolean z, ksg ksgVar, int i, Function0 function0, long j, long j2, idn0 idn0Var, long j3, long j4, long j5, int i2, int i3) {
        super(2);
        this.a = f;
        this.b = iu30Var;
        this.c = qim0Var;
        this.d = z;
        this.e = ksgVar;
        this.f = i;
        this.g = function0;
        this.h = j;
        this.i = j2;
        this.t = idn0Var;
        this.X = j3;
        this.Y = j4;
        this.Z = j5;
        this.N0 = i2;
        this.O0 = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(this.N0 | 1);
        short s = this.O0;
        luo1.e(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, this.Z, (b0k) obj, iP, s);
        return rih1.a;
    }
}

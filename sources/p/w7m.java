package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class w7m extends hab0 implements vu30 {
    public final /* synthetic */ Function0 N0;
    public final /* synthetic */ int O0;
    public final /* synthetic */ int P0;
    public final /* synthetic */ short Q0;
    public final /* synthetic */ boolean X;
    public final /* synthetic */ float Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ f8m a;
    public final /* synthetic */ i7m b;
    public final /* synthetic */ kes c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ vu30 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ String h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ qim0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public w7m(f8m f8mVar, i7m i7mVar, kes kesVar, boolean z, Function0 function0, vu30 vu30Var, int i, String str, boolean z2, qim0 qim0Var, boolean z3, float f, boolean z4, Function0 function1, int i2, int i3, int i4) {
        super(2);
        this.a = f8mVar;
        this.b = i7mVar;
        this.c = kesVar;
        this.d = z;
        this.e = function0;
        this.f = vu30Var;
        this.g = i;
        this.h = str;
        this.i = z2;
        this.t = qim0Var;
        this.X = z3;
        this.Y = f;
        this.Z = z4;
        this.N0 = function1;
        this.O0 = i2;
        this.P0 = i3;
        this.Q0 = i4;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(this.O0 | 1);
        int iP2 = czo1.p(this.P0);
        short s = this.Q0;
        this.a.d(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, this.Z, this.N0, (b0k) obj, iP, iP2, s);
        return rih1.a;
    }
}

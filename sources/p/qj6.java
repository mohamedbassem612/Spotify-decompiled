package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qj6 extends hab0 implements vu30 {
    public final /* synthetic */ short N0;
    public final /* synthetic */ tob1 X;
    public final /* synthetic */ y3g1 Y;
    public final /* synthetic */ int Z;
    public final /* synthetic */ gj6 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ xd6 e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ iu30 g;
    public final /* synthetic */ qim0 h;
    public final /* synthetic */ int i;
    public final /* synthetic */ tob1 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public qj6(gj6 gj6Var, boolean z, boolean z2, boolean z3, xd6 xd6Var, Function0 function0, iu30 iu30Var, qim0 qim0Var, int i, tob1 tob1Var, tob1 tob1Var2, y3g1 y3g1Var, int i2, int i3) {
        super(2);
        this.a = gj6Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = xd6Var;
        this.f = function0;
        this.g = iu30Var;
        this.h = qim0Var;
        this.i = i;
        this.t = tob1Var;
        this.X = tob1Var2;
        this.Y = y3g1Var;
        this.Z = i2;
        this.N0 = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(this.Z | 1);
        short s = this.N0;
        uj6.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, (b0k) obj, iP, s);
        return rih1.a;
    }
}

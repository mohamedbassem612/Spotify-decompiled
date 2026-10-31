package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class txx extends hab0 implements vu30 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ short Y;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ idn0 e;
    public final /* synthetic */ max f;
    public final /* synthetic */ vu30 g;
    public final /* synthetic */ hw61 h;
    public final /* synthetic */ ga80 i;
    public final /* synthetic */ int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public txx(boolean z, Function0 function0, String str, qim0 qim0Var, idn0 idn0Var, max maxVar, vu30 vu30Var, hw61 hw61Var, ga80 ga80Var, int i, int i2, int i3, int i4) {
        super(2);
        this.a = z;
        this.b = function0;
        this.c = str;
        this.d = qim0Var;
        this.e = idn0Var;
        this.f = maxVar;
        this.g = vu30Var;
        this.h = hw61Var;
        this.i = ga80Var;
        this.t = i;
        this.X = i3;
        this.Y = i4;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(1);
        int iP2 = czo1.p(this.X);
        short s = this.Y;
        m5n1.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, (b0k) obj, iP, iP2, s);
        return rih1.a;
    }
}

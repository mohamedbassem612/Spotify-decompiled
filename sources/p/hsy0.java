package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class hsy0 extends hab0 implements vu30 {
    public final /* synthetic */ byte N0;
    public final /* synthetic */ short O0;
    public final /* synthetic */ String X;
    public final /* synthetic */ nyn1 Y;
    public final /* synthetic */ int Z;
    public final /* synthetic */ wd50 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ cm10 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ jtl1 h;
    public final /* synthetic */ vgo1 i;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public hsy0(wd50 wd50Var, String str, String str2, cm10 cm10Var, Function0 function0, Function0 function1, Function0 function2, jtl1 jtl1Var, vgo1 vgo1Var, boolean z, String str3, nyn1 nyn1Var, int i, int i2, int i3) {
        super(2);
        this.a = wd50Var;
        this.b = str;
        this.c = str2;
        this.d = cm10Var;
        this.e = function0;
        this.f = function1;
        this.g = function2;
        this.h = jtl1Var;
        this.i = vgo1Var;
        this.t = z;
        this.X = str3;
        this.Y = nyn1Var;
        this.Z = i;
        this.N0 = i2;
        this.O0 = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(this.Z | 1);
        int iP2 = czo1.p(this.N0);
        short s = this.O0;
        l6o1.n(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, (b0k) obj, iP, iP2, s);
        return rih1.a;
    }
}

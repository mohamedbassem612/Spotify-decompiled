package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jt9 extends hab0 implements vu30 {
    public final /* synthetic */ int N0;
    public final /* synthetic */ short O0;
    public final /* synthetic */ qim0 X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ int Z;
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ float f;
    public final /* synthetic */ iu30 g;
    public final /* synthetic */ iu30 h;
    public final /* synthetic */ Function0 i;
    public final /* synthetic */ Function0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public jt9(String str, String str2, String str3, boolean z, boolean z2, float f, iu30 iu30Var, iu30 iu30Var2, Function0 function0, Function0 function1, qim0 qim0Var, boolean z3, int i, int i2, int i3) {
        super(2);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
        this.f = f;
        this.g = iu30Var;
        this.h = iu30Var2;
        this.i = function0;
        this.t = function1;
        this.X = qim0Var;
        this.Y = z3;
        this.Z = i;
        this.N0 = i2;
        this.O0 = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(this.Z | 1);
        int iP2 = czo1.p(this.N0);
        short s = this.O0;
        n3p1.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, (b0k) obj, iP, iP2, s);
        return rih1.a;
    }
}

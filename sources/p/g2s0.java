package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class g2s0 extends hab0 implements vu30 {
    public final /* synthetic */ lax X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ short Z;
    public final /* synthetic */ String a;
    public final /* synthetic */ zmo1 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ if5 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ iu30 g;
    public final /* synthetic */ iu30 h;
    public final /* synthetic */ qim0 i;
    public final /* synthetic */ lax t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g2s0(String str, zmo1 zmo1Var, String str2, if5 if5Var, String str3, Function0 function0, iu30 iu30Var, iu30 iu30Var2, qim0 qim0Var, lax laxVar, lax laxVar2, int i, int i2) {
        super(2);
        this.a = str;
        this.b = zmo1Var;
        this.c = str2;
        this.d = if5Var;
        this.e = str3;
        this.f = function0;
        this.g = iu30Var;
        this.h = iu30Var2;
        this.i = qim0Var;
        this.t = laxVar;
        this.X = laxVar2;
        this.Y = i;
        this.Z = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(this.Y | 1);
        short s = this.Z;
        bno1.f(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, (b0k) obj, iP, s);
        return rih1.a;
    }
}

package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class grf extends hab0 implements vu30 {
    public final /* synthetic */ short X;
    public final /* synthetic */ String a;
    public final /* synthetic */ w4i1 b;
    public final /* synthetic */ c380 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ vu30 f;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ Function0 h;
    public final /* synthetic */ qim0 i;
    public final /* synthetic */ int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public grf(String str, w4i1 w4i1Var, c380 c380Var, boolean z, boolean z2, vu30 vu30Var, Function0 function0, Function0 function1, qim0 qim0Var, int i, int i2) {
        super(2);
        this.a = str;
        this.b = w4i1Var;
        this.c = c380Var;
        this.d = z;
        this.e = z2;
        this.f = vu30Var;
        this.g = function0;
        this.h = function1;
        this.i = qim0Var;
        this.t = i;
        this.X = i2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.vu30 */
    public final Object invoke(Object obj, Object obj2) throws vu30 {
        ((Number) obj2).intValue();
        wwo1.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (b0k) obj, czo1.p(this.t | 1), this.X);
        return rih1.a;
    }
}

package p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kxm0 extends hab0 implements vu30 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ iu30 f;
    public final /* synthetic */ zja1 g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ qim0 i;
    public final /* synthetic */ int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kxm0(int i, String str, boolean z, int i2, boolean z2, iu30 iu30Var, zja1 zja1Var, boolean z3, qim0 qim0Var, int i3) {
        super(2);
        this.a = i;
        this.b = str;
        this.c = z;
        this.d = i2;
        this.e = z2;
        this.f = iu30Var;
        this.g = zja1Var;
        this.h = z3;
        this.i = qim0Var;
        this.t = i3;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        ((Number) obj2).intValue();
        ot11.g(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (b0k) obj, czo1.p(this.t | 1));
        return rih1.a;
    }
}

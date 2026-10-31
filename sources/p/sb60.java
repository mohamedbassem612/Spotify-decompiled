package p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class sb60 extends hab0 implements vu30 {
    public final /* synthetic */ rb60 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ jkr0 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ db60 e;
    public final /* synthetic */ slx0 f;
    public final /* synthetic */ qim0 g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ int i;
    public final /* synthetic */ short t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public sb60(rb60 rb60Var, int i, jkr0 jkr0Var, boolean z, db60 db60Var, slx0 slx0Var, qim0 qim0Var, boolean z2, int i2, int i3) {
        super(2);
        this.a = rb60Var;
        this.b = i;
        this.c = jkr0Var;
        this.d = z;
        this.e = db60Var;
        this.f = slx0Var;
        this.g = qim0Var;
        this.h = z2;
        this.i = i2;
        this.t = i3;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        ((Number) obj2).intValue();
        qmo1.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, (b0k) obj, czo1.p(this.i | 1), this.t);
        return rih1.a;
    }
}

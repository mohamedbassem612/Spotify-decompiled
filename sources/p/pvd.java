package p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pvd extends hab0 implements vu30 {
    public final /* synthetic */ vnr0 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ float c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ byte e;
    public final /* synthetic */ iu30 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ byte h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public pvd(vnr0 vnr0Var, long j, float f, qim0 qim0Var, int i, iu30 iu30Var, int i2, int i3) {
        super(2);
        this.a = vnr0Var;
        this.b = j;
        this.c = f;
        this.d = qim0Var;
        this.e = i;
        this.f = iu30Var;
        this.g = i2;
        this.h = i3;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        ((Number) obj2).intValue();
        y4o1.l(this.a, this.b, this.c, this.d, this.e, this.f, (b0k) obj, czo1.p(this.g | 1), this.h);
        return rih1.a;
    }
}

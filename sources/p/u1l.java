package p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class u1l extends hab0 implements vu30 {
    public final /* synthetic */ c2l a;
    public final /* synthetic */ float b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1l(c2l c2lVar, float f, boolean z, int i, int i2) {
        super(2);
        this.a = c2lVar;
        this.b = f;
        this.c = z;
        this.d = i;
        this.e = i2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        ((Number) obj2).intValue();
        rqt0.m(this.a, this.b, this.c, this.d, (b0k) obj, czo1.p(this.e | 1));
        return rih1.a;
    }
}

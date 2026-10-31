package p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qb9 extends hab0 implements vu30 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ m1a g;
    public final /* synthetic */ int h;
    public final /* synthetic */ byte i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public qb9(String str, String str2, int i, qim0 qim0Var, long j, boolean z, m1a m1aVar, int i2, int i3) {
        super(2);
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = qim0Var;
        this.e = j;
        this.f = z;
        this.g = m1aVar;
        this.h = i2;
        this.i = i3;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        ((Number) obj2).intValue();
        k1p1.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, (b0k) obj, czo1.p(this.h | 1), this.i);
        return rih1.a;
    }
}

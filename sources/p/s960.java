package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class s960 extends hab0 implements vu30 {
    public final /* synthetic */ da60 a;
    public final /* synthetic */ qim0 b;
    public final /* synthetic */ List c;
    public final /* synthetic */ long d;
    public final /* synthetic */ short e;
    public final /* synthetic */ byte f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s960(da60 da60Var, qim0 qim0Var, List list, long j, int i, int i2) {
        super(2);
        this.a = da60Var;
        this.b = qim0Var;
        this.c = list;
        this.d = j;
        this.e = i;
        this.f = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        zko1.f(this.a, this.b, this.c, this.d, (b0k) obj, czo1.p(this.e | 1), this.f);
        return rih1.a;
    }
}

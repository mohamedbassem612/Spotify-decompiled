package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class o6m1 extends hab0 implements vu30 {
    public final /* synthetic */ l6m1 a;
    public final /* synthetic */ Map b;
    public final /* synthetic */ float c;
    public final /* synthetic */ byte d;
    public final /* synthetic */ byte e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o6m1(l6m1 l6m1Var, Map map, float f, int i, int i2) {
        super(2);
        this.a = l6m1Var;
        this.b = map;
        this.c = f;
        this.d = i;
        this.e = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        q6m1.c(this.a, this.b, this.c, (b0k) obj, czo1.p(this.d | 1), this.e);
        return rih1.a;
    }
}

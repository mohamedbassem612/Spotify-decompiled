package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rex extends hab0 implements vu30 {
    public final /* synthetic */ String a;
    public final /* synthetic */ qim0 b;
    public final /* synthetic */ byte c;
    public final /* synthetic */ byte d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public rex(int i, int i2, String str, qim0 qim0Var) {
        super(2);
        this.a = str;
        this.b = qim0Var;
        this.c = i;
        this.d = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        eqr0.b(czo1.p(this.c | 1), this.d, this.a, (b0k) obj, this.b);
        return rih1.a;
    }
}

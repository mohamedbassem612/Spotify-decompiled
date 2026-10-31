package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class sth extends hab0 implements vu30 {
    public final /* synthetic */ qim0 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ byte e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public sth(qim0 qim0Var, boolean z, long j, int i, int i2) {
        super(2);
        this.a = qim0Var;
        this.b = z;
        this.c = j;
        this.d = i;
        this.e = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        i9p1.j(this.a, this.b, this.c, (b0k) obj, czo1.p(this.d | 1), this.e);
        return rih1.a;
    }
}

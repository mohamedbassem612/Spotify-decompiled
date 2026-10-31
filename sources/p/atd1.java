package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class atd1 extends hab0 implements vu30 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ byte c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public atd1(int i, long j, int i2) {
        super(2);
        this.a = i;
        this.b = j;
        this.c = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(this.c | 1);
        htd1.d(this.a, iP, this.b, (b0k) obj);
        return rih1.a;
    }
}

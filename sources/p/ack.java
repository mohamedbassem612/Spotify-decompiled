package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ack extends hab0 implements vu30 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ack(float f, float f2, int i, int i2, long j) {
        super(2);
        this.a = i;
        this.b = j;
        this.c = f;
        this.d = f2;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(1);
        rck.a(this.a, this.b, this.c, this.d, (b0k) obj, iP);
        return rih1.a;
    }
}

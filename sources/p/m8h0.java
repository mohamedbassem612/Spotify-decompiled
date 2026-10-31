package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class m8h0 extends hab0 implements vu30 {
    public final /* synthetic */ long a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ String d;
    public final /* synthetic */ qim0 e;
    public final /* synthetic */ short f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m8h0(long j, long j2, long j3, String str, qim0 qim0Var, int i) {
        super(2);
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = str;
        this.e = qim0Var;
        this.f = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        n8h0.a(this.a, this.b, this.c, this.d, this.e, (b0k) obj, czo1.p(this.f | 1));
        return rih1.a;
    }
}

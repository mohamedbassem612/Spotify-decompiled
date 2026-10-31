package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class q8e1 extends hab0 implements vu30 {
    public final /* synthetic */ mjh a;
    public final /* synthetic */ String b;
    public final /* synthetic */ lee1 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ qim0 e;
    public final /* synthetic */ byte f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q8e1(mjh mjhVar, String str, lee1 lee1Var, long j, qim0 qim0Var, int i, int i2) {
        super(2);
        this.a = mjhVar;
        this.b = str;
        this.c = lee1Var;
        this.d = j;
        this.e = qim0Var;
        this.f = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(1);
        byte b = this.f;
        this.a.g(this.b, this.c, this.d, this.e, (b0k) obj, iP, b);
        return rih1.a;
    }
}

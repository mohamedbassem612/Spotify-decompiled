package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class o1g0 extends hab0 implements vu30 {
    public final /* synthetic */ long a;
    public final /* synthetic */ long b;
    public final /* synthetic */ dlv c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ short e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o1g0(long j, long j2, dlv dlvVar, qim0 qim0Var, int i) {
        super(2);
        this.a = j;
        this.b = j2;
        this.c = dlvVar;
        this.d = qim0Var;
        this.e = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        p1g0.a(this.a, this.b, this.c, this.d, (b0k) obj, czo1.p(this.e | 1));
        return rih1.a;
    }
}

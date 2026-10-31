package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gg6 extends hab0 implements vu30 {
    public final /* synthetic */ String a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ byte e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public gg6(String str, long j, long j2, qim0 qim0Var, int i) {
        super(2);
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = qim0Var;
        this.e = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        fho1.k(czo1.p(this.e | 1), this.b, this.c, this.a, (b0k) obj, this.d);
        return rih1.a;
    }
}

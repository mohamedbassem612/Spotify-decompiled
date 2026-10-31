package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class t990 extends hab0 implements vu30 {
    public final /* synthetic */ c380 a;
    public final /* synthetic */ sip b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ short e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v1, types: [int, short] */
    public t990(c380 c380Var, sip sipVar, qim0 qim0Var, boolean z, long j, int i) {
        super(2);
        this.a = c380Var;
        this.b = sipVar;
        this.c = qim0Var;
        this.d = z;
        this.e = (int) j;
        this.f = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        bin.d(this.a, this.b, this.c, this.d, this.e, (b0k) obj, czo1.p(this.f | 1));
        return rih1.a;
    }
}

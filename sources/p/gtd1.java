package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gtd1 extends hab0 implements vu30 {
    public final /* synthetic */ ssd1 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ qim0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gtd1(ssd1 ssd1Var, boolean z, float f, long j, long j2, qim0 qim0Var, int i) {
        super(2);
        this.a = ssd1Var;
        this.b = z;
        this.c = f;
        this.d = j;
        this.e = j2;
        this.f = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(1);
        htd1.h(this.a, this.b, this.c, this.d, this.e, this.f, (b0k) obj, iP);
        return rih1.a;
    }
}

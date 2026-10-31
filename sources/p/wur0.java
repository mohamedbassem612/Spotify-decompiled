package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wur0 extends hab0 implements vu30 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wur0(int i, int i2, int i3, long j, qim0 qim0Var) {
        super(2);
        this.a = i;
        this.b = i2;
        this.c = qim0Var;
        this.d = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(1);
        ijo1.h(this.a, this.b, iP, this.d, (b0k) obj, this.c);
        return rih1.a;
    }
}

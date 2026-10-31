package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class nm71 extends hab0 implements vu30 {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ qim0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nm71(float f, float f2, float f3, qim0 qim0Var, int i) {
        super(2);
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(1);
        g2p1.w(this.a, this.b, this.c, this.d, (b0k) obj, iP);
        return rih1.a;
    }
}

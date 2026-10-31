package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mwx extends hab0 implements vu30 {
    public final /* synthetic */ qim0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ byte c;
    public final /* synthetic */ byte d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public mwx(int i, int i2, int i3, qim0 qim0Var) {
        super(2);
        this.a = qim0Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(this.c | 1);
        byte b = this.d;
        yto1.e(this.b, iP, b, (b0k) obj, this.a);
        return rih1.a;
    }
}

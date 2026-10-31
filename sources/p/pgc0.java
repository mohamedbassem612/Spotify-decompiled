package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pgc0 extends hab0 implements vu30 {
    public final /* synthetic */ String a;
    public final /* synthetic */ int b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ byte d;
    public final /* synthetic */ byte e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public pgc0(String str, int i, qim0 qim0Var, int i2, int i3) {
        super(2);
        this.a = str;
        this.b = i;
        this.c = qim0Var;
        this.d = i2;
        this.e = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(this.d | 1);
        byte b = this.e;
        qgc0.c(this.b, iP, b, this.a, (b0k) obj, this.c);
        return rih1.a;
    }
}

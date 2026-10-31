package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wm81 extends hab0 implements vu30 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ byte d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public wm81(int i, int i2, int i3, long j, qim0 qim0Var) {
        super(2);
        this.a = i;
        this.b = j;
        this.c = qim0Var;
        this.d = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(1);
        byte b = this.d;
        i9p1.o(this.a, iP, b, this.b, (b0k) obj, this.c);
        return rih1.a;
    }
}

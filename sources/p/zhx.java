package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zhx extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zhx(float f, float f2, long j, int i, byte b) {
        super(2);
        this.a = b;
        this.b = f;
        this.c = f2;
        this.d = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                iro1.e(this.b, this.c, this.d, (b0k) obj, czo1.p(1));
                break;
            default:
                ((Number) obj2).intValue();
                g491.f(this.b, this.c, this.d, (b0k) obj, czo1.p(385));
                break;
        }
        return rih1Var;
    }
}

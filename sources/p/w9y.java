package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class w9y extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z9y b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w9y(z9y z9yVar, byte b) {
        super(1);
        this.a = b;
        this.b = z9yVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        z9y z9yVar = this.b;
        switch (b) {
            case 0:
                return z9yVar.f((u9y) obj);
            default:
                ((xas) obj).a(x0y.O0, new hzw(z9yVar, (byte) 8));
                return rih1.a;
        }
    }
}

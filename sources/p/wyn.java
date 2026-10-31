package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wyn extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xyn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wyn(xyn xynVar, byte b) {
        super(1);
        this.a = b;
        this.b = xynVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        xyn xynVar = this.b;
        switch (b) {
            case 0:
                return xynVar.e;
            default:
                ((qtr) obj).b(new k1(xynVar, (lnm) null, (byte) 8));
                return rih1.a;
        }
    }
}

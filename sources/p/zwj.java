package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zwj extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ txj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zwj(txj txjVar, byte b) {
        super(1);
        this.a = b;
        this.b = txjVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        txj txjVar = this.b;
        switch (b) {
            case 0:
                ((Number) obj).intValue();
                return txjVar.i;
            case 1:
                return new h3h1(new zwj(txjVar, (byte) 0));
            default:
                ((Number) obj).intValue();
                return txjVar.i;
        }
    }
}

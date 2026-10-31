package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zp00 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rwj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zp00(rwj rwjVar, byte b) {
        super(1);
        this.a = b;
        this.b = rwjVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rwj rwjVar = this.b;
        switch (b) {
            case 0:
                return rwjVar.q((bq00) ((u601) rwjVar.g).getValue());
            default:
                ((qtr) obj).b(new skv(rwjVar, (lnm) null, (byte) 2));
                return rih1.a;
        }
    }
}

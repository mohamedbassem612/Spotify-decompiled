package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class is extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rwj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ is(rwj rwjVar, byte b) {
        super(1);
        this.a = b;
        this.b = rwjVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rwj rwjVar = this.b;
        switch (b) {
            case 0:
                return ((kw) rwjVar.e).b();
            case 1:
                return new hs(((Boolean) ((kw) rwjVar.e).b().getValue()).booleanValue());
            default:
                ((qtr) obj).b(new js(rwjVar, (lnm) null, (byte) 0));
                return rih1.a;
        }
    }
}

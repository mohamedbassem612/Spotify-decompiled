package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class f9c extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g9c b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f9c(g9c g9cVar, byte b) {
        super(1);
        this.a = b;
        this.b = g9cVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        g9c g9cVar = this.b;
        switch (b) {
            case 0:
                return g9cVar.b;
            default:
                ((qtr) obj).b(new ep0(g9cVar, (lnm) null, (byte) 9));
                return rih1.a;
        }
    }
}

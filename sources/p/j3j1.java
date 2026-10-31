package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class j3j1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rwj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j3j1(rwj rwjVar, byte b) {
        super(1);
        this.a = b;
        this.b = rwjVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rwj rwjVar = this.b;
        switch (b) {
            case 0:
                return (zob1) rwjVar.g;
            default:
                ((qtr) obj).b(new bgb1((avl1) rwjVar, (lnm) null, (byte) 7));
                return rih1.a;
        }
    }
}

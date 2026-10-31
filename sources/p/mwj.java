package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mwj extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ owj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mwj(owj owjVar, byte b) {
        super(1);
        this.a = b;
        this.b = owjVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        owj owjVar = this.b;
        switch (b) {
            case 0:
                return d3p1.F(owjVar.a, owjVar.h, (p901) obj);
            default:
                ((qtr) obj).b(new ep0(owjVar, null, (byte) 14));
                return rih1.a;
        }
    }
}

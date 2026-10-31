package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hyj extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iyj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hyj(iyj iyjVar, byte b) {
        super(1);
        this.a = b;
        this.b = iyjVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        iyj iyjVar = this.b;
        switch (b) {
            case 0:
                return d3p1.F(iyjVar.a, iyjVar.f, (c061) obj);
            default:
                ((qtr) obj).b(new ep0(iyjVar, null, (byte) 15));
                return rih1.a;
        }
    }
}

package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vdv0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dyd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vdv0(dyd dydVar, byte b) {
        super(1);
        this.a = b;
        this.b = dydVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        dyd dydVar = this.b;
        switch (b) {
            case 0:
                ((qtr) obj).b(new udv0(dydVar, null, (byte) 0));
                break;
            default:
                ((qtr) obj).b(new udv0(dydVar, null, (byte) 1));
                break;
        }
        return rih1Var;
    }
}

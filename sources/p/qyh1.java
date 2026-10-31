package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qyh1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ smp0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qyh1(smp0 smp0Var, byte b) {
        super(1);
        this.a = b;
        this.b = smp0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        smp0 smp0Var = this.b;
        switch (b) {
            case 0:
                return (sru) smp0Var.d;
            default:
                ((qtr) obj).b(new eri0(smp0Var, (lnm) null, (byte) 21));
                return rih1.a;
        }
    }
}

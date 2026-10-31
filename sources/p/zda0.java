package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zda0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dea0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zda0(dea0 dea0Var, byte b) {
        super(1);
        this.a = b;
        this.b = dea0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        dea0 dea0Var = this.b;
        switch (b) {
            case 0:
                return (evz) ((iir) dea0Var.f).c;
            default:
                qtr qtrVar = (qtr) obj;
                qtrVar.c(new vm0(dea0Var, (lnm) null, (byte) 19));
                qtrVar.b(new jaz(dea0Var, (lnm) null, (byte) 8));
                return rih1.a;
        }
    }
}

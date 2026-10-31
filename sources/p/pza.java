package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pza extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tza b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pza(tza tzaVar, byte b) {
        super(1);
        this.a = b;
        this.b = tzaVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        tza tzaVar = this.b;
        switch (b) {
            case 0:
                return d3p1.F(tzaVar.b, tzaVar.d, (nza) obj);
            default:
                ((qtr) obj).b(new lu(tzaVar, (lnm) null, (byte) 10));
                return rih1.a;
        }
    }
}

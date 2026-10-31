package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cfc0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ et90 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cfc0(et90 et90Var, byte b) {
        super(1);
        this.a = b;
        this.b = et90Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        et90 et90Var = this.b;
        switch (b) {
            case 0:
                return q601.b(new x010((zob1) et90Var.c, (zob1) et90Var.e, new vm0(3, (lnm) null, (byte) 21), (byte) 1));
            default:
                ((qtr) obj).b(new kr(et90Var, (lnm) null, (byte) 25));
                return rih1.a;
        }
    }
}

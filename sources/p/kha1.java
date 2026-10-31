package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kha1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ et90 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kha1(et90 et90Var, byte b) {
        super(1);
        this.a = b;
        this.b = et90Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        et90 et90Var = this.b;
        switch (b) {
            case 0:
                return new jha1((cly0) et90Var.e, (byte) 0);
            default:
                ((qtr) obj).b(new f3(et90Var, (lnm) null, (byte) 27));
                return rih1.a;
        }
    }
}

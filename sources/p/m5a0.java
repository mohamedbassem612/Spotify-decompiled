package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class m5a0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m5a0(pt ptVar, byte b) {
        super(1);
        this.a = b;
        this.b = ptVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        pt ptVar = this.b;
        switch (b) {
            case 0:
                return new ht20(new x880(((c9c0) ptVar.d).b.current(), ptVar, (byte) 10), new pk50(2, (lnm) null, (byte) 3));
            default:
                qtr qtrVar = (qtr) obj;
                qtrVar.b(new u08(ptVar, qtrVar, (lnm) null, (byte) 8));
                return rih1.a;
        }
    }
}

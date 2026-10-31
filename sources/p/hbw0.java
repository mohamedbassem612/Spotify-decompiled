package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class hbw0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tei0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hbw0(tei0 tei0Var, byte b) {
        super(2);
        this.a = b;
        this.b = tei0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        tei0 tei0Var = this.b;
        switch (b) {
            case 0:
                Integer numValueOf = Integer.valueOf(((Number) obj).intValue());
                return new wqk0(tei0Var.b().b, numValueOf, tei0Var.b().d, (r6h1) obj2, (byte) 26);
            default:
                Integer numValueOf2 = Integer.valueOf(((Number) obj).intValue());
                return new wqk0(tei0Var.b().b, numValueOf2, tei0Var.b().d, (r6h1) obj2, (byte) 26);
        }
    }
}

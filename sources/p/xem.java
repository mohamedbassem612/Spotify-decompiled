package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xem extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ efm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xem(efm efmVar, byte b) {
        super(1);
        this.a = b;
        this.b = efmVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        efm efmVar = this.b;
        switch (b) {
            case 0:
                return d3p1.H(efmVar.b, efmVar.f, (mem) obj);
            default:
                ((qtr) obj).b(new lu(efmVar, (lnm) null, (byte) 16));
                return rih1.a;
        }
    }
}

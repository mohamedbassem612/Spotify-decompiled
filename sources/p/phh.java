package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class phh extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uhh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ phh(uhh uhhVar, byte b) {
        super(1);
        this.a = b;
        this.b = uhhVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        lnm lnmVar = null;
        uhh uhhVar = this.b;
        switch (b) {
            case 0:
                return new te1(d3p1.F(uhhVar.i, uhhVar.X, (khh) obj), (byte) 21);
            case 1:
                return uhhVar.g((khh) obj, new nhh(z6x.a, null, null));
            default:
                ((qtr) obj).b(new u08(uhhVar, lnmVar, (byte) 2));
                return rih1.a;
        }
    }
}

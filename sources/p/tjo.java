package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tjo extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ujo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tjo(ujo ujoVar, byte b) {
        super(1);
        this.a = b;
        this.b = ujoVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        ujo ujoVar = this.b;
        switch (b) {
            case 0:
                return d3p1.H(ujoVar.b, (o3r) ujoVar.e, (rjo) obj);
            default:
                ((qtr) obj).b(new js(ujoVar, (lnm) null, (byte) 7));
                return rih1.a;
        }
    }
}

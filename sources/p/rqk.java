package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rqk extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uqk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rqk(uqk uqkVar, byte b) {
        super(1);
        this.a = b;
        this.b = uqkVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        uqk uqkVar = this.b;
        switch (b) {
            case 0:
                vqk vqkVar = (vqk) obj;
                return hu20.e(new m441(new bag(new fu20(d3p1.F(uqkVar.c, uqkVar.d, vqkVar), new zti(vqkVar, (lnm) null, (byte) 16), (byte) 1), (lnm) null, (byte) 28)), new qd0((lnm) null, uqkVar, vqkVar, (byte) 7));
            default:
                ((qtr) obj).b(new u08(uqkVar, (lnm) null, (byte) 4));
                return rih1.a;
        }
    }
}

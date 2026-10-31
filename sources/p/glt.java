package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class glt extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hlt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ glt(hlt hltVar, byte b) {
        super(1);
        this.a = b;
        this.b = hltVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        hlt hltVar = this.b;
        switch (b) {
            case 0:
                return d3p1.F(hltVar.b, hltVar.c, (elt) obj);
            default:
                ((qtr) obj).b(new lu(hltVar, (lnm) null, (byte) 27));
                return rih1.a;
        }
    }
}

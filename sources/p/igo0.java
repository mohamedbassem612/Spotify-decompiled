package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class igo0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hc30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ igo0(hc30 hc30Var, byte b) {
        super(1);
        this.a = b;
        this.b = hc30Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        lnm lnmVar = null;
        hc30 hc30Var = this.b;
        switch (b) {
            case 0:
                return new m441(new hgo0((r231) obj, hc30Var, (lnm) null, (byte) 0));
            default:
                ((qtr) obj).b(new gz0((Object) hc30Var, lnmVar, (byte) 15));
                return rih1.a;
        }
    }
}

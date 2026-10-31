package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yr11 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ w2s b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yr11(w2s w2sVar, byte b) {
        super(1);
        this.a = b;
        this.b = w2sVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        w2s w2sVar = this.b;
        switch (b) {
            case 0:
                qr11 qr11Var = (qr11) obj;
                return new ht20(h5p1.s((mr20) ((iu30) w2sVar.f).invoke(qr11Var.a), ((kwn) w2sVar.e).a(), (zob1) w2sVar.i, new w63(qr11Var, (lnm) null, (byte) 17)), new egv0(2, (lnm) null, (byte) 15));
            default:
                ((qtr) obj).b(new js(w2sVar, (lnm) null, (byte) 18));
                return rih1.a;
        }
    }
}

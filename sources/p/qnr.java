package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class qnr extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ snr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qnr(snr snrVar, byte b) {
        super(1);
        this.a = b;
        this.b = snrVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        snr snrVar = this.b;
        switch (b) {
            case 0:
                w1l w1lVar = (w1l) obj;
                unr unrVar = (unr) snrVar.a.get();
                return new x010(new yv8(vby0.r(unrVar.a, unrVar.b, w1lVar.f), (byte) 3), w1lVar.c ? new dkm(((qor) snrVar.b.get()).m, (byte) 24) : new huz(Boolean.FALSE, (byte) 10), new ms4(w1lVar, snrVar, (lnm) null), (byte) 1);
            case 1:
                w1l w1lVar2 = (w1l) obj;
                return new x1l(b2l.a, false, w1lVar2.a, w1lVar2.b, w1lVar2.d, w1lVar2.e, snrVar.d.c());
            default:
                ((qtr) obj).b(new ep0(snrVar, (lnm) null, (byte) 24));
                return rih1.a;
        }
    }
}

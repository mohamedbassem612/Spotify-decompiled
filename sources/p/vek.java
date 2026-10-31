package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vek extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wek b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vek(wek wekVar, byte b) {
        super(1);
        this.a = b;
        this.b = wekVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        wek wekVar = this.b;
        switch (b) {
            case 0:
                tek tekVar = (tek) obj;
                return new x010(d3p1.H(wekVar.h, wekVar.i, tekVar), yoi1.g(wekVar.b.c(tekVar.a)), new l2(3, (lnm) null, (byte) 25), (byte) 1);
            default:
                ((qtr) obj).b(new js(wekVar, (lnm) null, (byte) 5));
                return rih1.a;
        }
    }
}

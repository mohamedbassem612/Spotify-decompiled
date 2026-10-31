package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class gms extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gms(tm tmVar, byte b) {
        super(1);
        this.a = b;
        this.b = tmVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        tm tmVar = this.b;
        switch (b) {
            case 0:
                return ((oms) tmVar.d).a(((ems) obj).a);
            default:
                ((qtr) obj).b(new ep0(tmVar, (lnm) null, (byte) 27));
                return rih1.a;
        }
    }
}

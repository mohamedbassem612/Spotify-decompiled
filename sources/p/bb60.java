package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bb60 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bb60(tm tmVar, byte b) {
        super(1);
        this.a = b;
        this.b = tmVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        tm tmVar = this.b;
        switch (b) {
            case 0:
                return ytp0.q((ytp0) tmVar.b);
            default:
                ((qtr) obj).b(new jaz(tmVar, (lnm) null, (byte) 4));
                return rih1.a;
        }
    }
}

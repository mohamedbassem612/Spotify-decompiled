package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ui81 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ui81(pt ptVar, byte b) {
        super(1);
        this.a = b;
        this.b = ptVar;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return pt.K(this.b, (si81) obj, null, null, null, null, 63);
            default:
                ((xas) obj).a(oa81.X0, new dj71(this.b, (byte) 16));
                return rih1.a;
        }
    }
}

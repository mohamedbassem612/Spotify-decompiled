package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fa11 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fa11(pt ptVar, byte b) {
        super(1);
        this.a = b;
        this.b = ptVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        pt ptVar = this.b;
        switch (b) {
            case 0:
                return new x010(((zwz0) ptVar.h).c(), yoi1.g(((xvo) ptVar.g).a(true)), new a82(3, (lnm) null, (byte) 6), (byte) 1);
            default:
                ((qtr) obj).b(new pnp0(ptVar, null, (byte) 19));
                return rih1.a;
        }
    }
}

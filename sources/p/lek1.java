package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lek1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lek1(pt ptVar, byte b) {
        super(1);
        this.a = b;
        this.b = ptVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        pt ptVar = this.b;
        switch (b) {
            case 0:
                return new be40(((i5y0) ptVar.e).h(), (byte) 3);
            default:
                ((qtr) obj).b(new efj1(ptVar, null, (byte) 3));
                return rih1.a;
        }
    }
}

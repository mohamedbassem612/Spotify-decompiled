package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wan0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lob1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wan0(lob1 lob1Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = lob1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lob1 lob1Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                vpb1.g(lob1Var, b0kVar, czo1.p(1));
                break;
            default:
                vpb1.h(lob1Var, b0kVar, czo1.p(7));
                break;
        }
        return rih1Var;
    }
}

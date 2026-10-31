package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class h77 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ b87 b;
    public final /* synthetic */ yrd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h77(b87 b87Var, yrd yrdVar, int i, byte b) {
        super(2);
        this.a = b;
        this.b = b87Var;
        this.c = yrdVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        yrd yrdVar = this.c;
        b87 b87Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                b87Var.e(yrdVar, b0kVar, czo1.p(1));
                break;
            default:
                b87Var.e(yrdVar, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}

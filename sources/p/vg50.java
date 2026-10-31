package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vg50 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yg50 b;
    public final /* synthetic */ c380 c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vg50(yg50 yg50Var, c380 c380Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = yg50Var;
        this.c = c380Var;
        this.d = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        c380 c380Var = this.c;
        yg50 yg50Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                yg50Var.b(c380Var, b0kVar, czo1.p(i | 1));
                break;
            default:
                yg50Var.c(c380Var, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }
}

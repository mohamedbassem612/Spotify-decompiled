package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sk90 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tk90 b;
    public final /* synthetic */ hwq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sk90(tk90 tk90Var, hwq hwqVar, int i, byte b) {
        super(2);
        this.a = b;
        this.b = tk90Var;
        this.c = hwqVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        hwq hwqVar = this.c;
        tk90 tk90Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                tk90Var.a(hwqVar, b0kVar, czo1.p(1));
                break;
            default:
                tk90Var.a(hwqVar, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}

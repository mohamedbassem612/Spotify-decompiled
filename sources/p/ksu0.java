package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ksu0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rsu0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ksu0(rsu0 rsu0Var, byte b) {
        super(3);
        this.a = b;
        this.b = rsu0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        rsu0 rsu0Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                rsu0Var.o(16.0f, 16.0f, (b0k) obj2, 0);
                break;
            case 1:
                ((Number) obj3).intValue();
                rsu0Var.o(48.0f, 48.0f, (b0k) obj2, 0);
                break;
            case 2:
                ((Number) obj3).intValue();
                rsu0Var.o(80.0f, 16.0f, (b0k) obj2, 0);
                break;
            default:
                ((Number) obj3).intValue();
                rsu0Var.o(200.0f, 20.0f, (b0k) obj2, 0);
                break;
        }
        return rih1Var;
    }
}

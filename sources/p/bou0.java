package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bou0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hou0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ qim0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bou0(hou0 hou0Var, String str, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = hou0Var;
        this.c = str;
        this.d = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qim0 qim0Var = this.d;
        String str = this.c;
        hou0 hou0Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                hou0Var.f(czo1.p(1), str, b0kVar, qim0Var);
                break;
            default:
                hou0Var.i(czo1.p(1), str, b0kVar, qim0Var);
                break;
        }
        return rih1Var;
    }
}

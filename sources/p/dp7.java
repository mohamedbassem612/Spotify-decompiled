package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dp7 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fp7 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ qim0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dp7(fp7 fp7Var, String str, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = fp7Var;
        this.c = str;
        this.d = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qim0 qim0Var = this.d;
        String str = this.c;
        fp7 fp7Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                fp7Var.e(czo1.p(1), str, b0kVar, qim0Var);
                break;
            default:
                fp7Var.f(czo1.p(1), str, b0kVar, qim0Var);
                break;
        }
        return rih1Var;
    }
}

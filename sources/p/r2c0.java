package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class r2c0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vu30 b;
    public final /* synthetic */ p2c0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r2c0(vu30 vu30Var, p2c0 p2c0Var, byte b) {
        super(1);
        this.a = b;
        this.b = vu30Var;
        this.c = p2c0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        p2c0 p2c0Var = this.c;
        vu30 vu30Var = this.b;
        switch (b) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                vu30Var.invoke(p2c0Var, bool);
                break;
            default:
                Boolean bool2 = (Boolean) obj;
                bool2.getClass();
                vu30Var.invoke(p2c0Var, bool2);
                break;
        }
        return rih1Var;
    }
}

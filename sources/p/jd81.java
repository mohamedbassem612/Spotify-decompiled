package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jd81 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ he81 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jd81(iu30 iu30Var, he81 he81Var, byte b) {
        super(1);
        this.a = b;
        this.b = iu30Var;
        this.c = he81Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        he81 he81Var = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(new uc81(((Boolean) obj).booleanValue(), us71.d(he81Var.I)));
                break;
            case 1:
                iu30Var.invoke(new uc81(((Boolean) obj).booleanValue(), us71.d(he81Var.I)));
                break;
            default:
                iu30Var.invoke(new uc81(((Boolean) obj).booleanValue(), us71.d(he81Var.I)));
                break;
        }
        return rih1Var;
    }
}

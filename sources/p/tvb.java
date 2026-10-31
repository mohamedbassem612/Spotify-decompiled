package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tvb extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ivo0 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tvb(ivo0 ivo0Var, iu30 iu30Var, byte b) {
        super(1);
        this.a = b;
        this.b = ivo0Var;
        this.c = iu30Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        ivo0 ivo0Var = this.b;
        switch (b) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ivo0Var.a(new iv80(2, zBooleanValue));
                iu30Var.invoke(new hlk("push", zBooleanValue));
                break;
            default:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                ivo0Var.a(new iv80(1, zBooleanValue2));
                iu30Var.invoke(new hlk("email", zBooleanValue2));
                break;
        }
        return rih1Var;
    }
}

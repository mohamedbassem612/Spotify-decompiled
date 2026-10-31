package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wrt extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xrt b;
    public final /* synthetic */ cir0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wrt(xrt xrtVar, cir0 cir0Var, byte b) {
        super(1);
        this.a = b;
        this.b = xrtVar;
        this.c = cir0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        cir0 cir0Var = this.c;
        xrt xrtVar = this.b;
        switch (b) {
            case 0:
                xrtVar.d(((Boolean) obj).booleanValue() ? est.a : est.b, cir0Var);
                break;
            case 1:
                xrtVar.c(((Boolean) obj).booleanValue(), cir0Var);
                break;
            default:
                xrtVar.c(((Boolean) obj).booleanValue(), cir0Var);
                break;
        }
        return rih1Var;
    }
}

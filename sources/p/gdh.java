package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gdh extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ flb0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gdh(flb0 flb0Var, byte b) {
        super(1);
        this.a = b;
        this.b = flb0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        flb0 flb0Var = flb0.b;
        flb0 flb0Var2 = this.b;
        switch (b) {
            case 0:
                return new p3v(((vzq0) obj).c(flb0Var2));
            case 1:
                kd31 kd31Var = (kd31) obj;
                kd31Var.p(flb0Var2 == flb0Var ? -8.0f : 8.0f);
                kd31Var.w(er31.b(4.0f));
                kd31Var.f(true);
                return rih1Var;
            case 2:
                kd31 kd31Var2 = (kd31) obj;
                kd31Var2.p(flb0Var2 == flb0Var ? -6.0f : 6.0f);
                kd31Var2.w(er31.b(4.0f));
                kd31Var2.f(true);
                return rih1Var;
            default:
                kd31 kd31Var3 = (kd31) obj;
                kd31Var3.p(flb0Var2 == flb0Var ? -6.0f : 6.0f);
                kd31Var3.w(er31.b(4.0f));
                kd31Var3.f(true);
                return rih1Var;
        }
    }
}

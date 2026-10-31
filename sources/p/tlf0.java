package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tlf0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ flb0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tlf0(float f, flb0 flb0Var, byte b) {
        super(1);
        this.a = b;
        this.b = f;
        this.c = flb0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        float f = 1.0f;
        flb0 flb0Var = this.c;
        float f2 = this.b;
        switch (b) {
            case 0:
                kd31 kd31Var = (kd31) obj;
                kd31Var.q(f2);
                kd31Var.r(f2);
                int iOrdinal = flb0Var.ordinal();
                if (iOrdinal == 0) {
                    f = 0.0f;
                } else if (iOrdinal != 1) {
                    eg.o();
                    return null;
                }
                kd31Var.A(sgc1.u(f, 0.0f));
                return rih1Var;
            default:
                kd31 kd31Var2 = (kd31) obj;
                kd31Var2.q(f2);
                kd31Var2.r(f2);
                int iOrdinal2 = flb0Var.ordinal();
                if (iOrdinal2 == 0) {
                    f = 0.0f;
                } else if (iOrdinal2 != 1) {
                    eg.o();
                    return null;
                }
                kd31Var2.A(sgc1.u(f, 0.0f));
                return rih1Var;
        }
    }
}

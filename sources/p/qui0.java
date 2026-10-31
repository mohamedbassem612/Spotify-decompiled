package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qui0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rui0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qui0(rui0 rui0Var, byte b) {
        super(1);
        this.a = b;
        this.b = rui0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        rui0 rui0Var = this.b;
        switch (b) {
            case 0:
                return rui0Var.a;
            case 1:
                ((z2s) obj).R(aui0.class, rui0Var.c, fii0.Y0, fii0.Z0, fii0.a1, false, ish0.b1);
                return rih1Var;
            default:
                o4o1.o((y2s) obj, rui0Var.b, new qui0(rui0Var, (byte) 1));
                return rih1Var;
        }
    }
}

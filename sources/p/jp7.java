package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jp7 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x6o0 b;
    public final /* synthetic */ dob1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jp7(x6o0 x6o0Var, dob1 dob1Var, byte b) {
        super(1);
        this.a = b;
        this.b = x6o0Var;
        this.c = dob1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        dob1 dob1Var = this.c;
        x6o0 x6o0Var = this.b;
        switch (b) {
            case 0:
                k8e0 k8e0Var = dob1Var.a;
                x6o0Var.q(r600.c, k8e0Var, (tv80) obj);
                return rih1.a;
            default:
                jp7 jp7Var = new jp7(x6o0Var, dob1Var, (byte) 0);
                k8e0 k8e0Var2 = ((dob1) obj).a;
                if (k8e0Var2 instanceof k8e0) {
                    k8e0 k8e0Var3 = k8e0Var2;
                    return new lem(k8e0Var3.c, tro1.D(k8e0Var3), jp7Var);
                }
                if (k8e0Var2 instanceof jae0) {
                    return null;
                }
                eg.o();
                return null;
        }
    }
}

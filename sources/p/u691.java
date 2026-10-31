package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class u691 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ w691 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u691(w691 w691Var, byte b) {
        super(1);
        this.a = b;
        this.b = w691Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        w691 w691Var = this.b;
        switch (b) {
            case 0:
                rwq0.z((qtr) obj, new cq61(w691Var, (byte) 18));
                return rih1.a;
            default:
                return w691Var.b;
        }
    }
}

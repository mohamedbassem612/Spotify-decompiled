package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qbm extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ug3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qbm(ug3 ug3Var, byte b) {
        super(1);
        this.a = b;
        this.b = ug3Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        ug3 ug3Var = this.b;
        switch (b) {
            case 0:
                rwq0.z((qtr) obj, new cml(ug3Var, (byte) 3));
                return rih1.a;
            default:
                return (qzh) ug3Var.d;
        }
    }
}

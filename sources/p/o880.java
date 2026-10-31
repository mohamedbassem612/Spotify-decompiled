package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class o880 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ q880 b;
    public final /* synthetic */ ji41 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o880(q880 q880Var, ji41 ji41Var) {
        super(2);
        this.b = q880Var;
        this.c = ji41Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ji41 ji41Var = this.c;
        q880 q880Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                q880Var.e(ji41Var, (b0k) obj, czo1.p(1));
                break;
            default:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    o3r o3rVar = q880.Z;
                    q880Var.e(ji41Var, x340Var2, 0);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o880(q880 q880Var, ji41 ji41Var, int i) {
        super(2);
        this.b = q880Var;
        this.c = ji41Var;
    }
}

package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class u7a1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v7a1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u7a1(v7a1 v7a1Var, byte b) {
        super(1);
        this.a = b;
        this.b = v7a1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        v7a1 v7a1Var = this.b;
        switch (b) {
            case 0:
                return v7a1Var.c;
            default:
                ((qtr) obj).b(new q7a1(v7a1Var, null, (byte) 1));
                return rih1.a;
        }
    }
}

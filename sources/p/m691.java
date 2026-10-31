package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class m691 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n691 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m691(n691 n691Var, byte b) {
        super(1);
        this.a = b;
        this.b = n691Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        n691 n691Var = this.b;
        switch (b) {
            case 0:
                rwq0.z((qtr) obj, new cq61(n691Var, (byte) 17));
                return rih1.a;
            default:
                return n691Var.e;
        }
    }
}

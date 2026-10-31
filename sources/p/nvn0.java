package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nvn0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lvn0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nvn0(lvn0 lvn0Var, byte b) {
        super(1);
        this.a = b;
        this.b = lvn0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        lvn0 lvn0Var = this.b;
        switch (b) {
            case 0:
                return ((o3m0) obj).a(lvn0Var.c);
            default:
                b261.n((e261) obj, lvn0Var.d);
                return rih1.a;
        }
    }
}

package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class m110 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ f690 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m110(f690 f690Var, byte b) {
        super(1);
        this.a = b;
        this.b = f690Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        f690 f690Var = this.b;
        switch (b) {
            case 0:
                f690Var.f.a();
                break;
            default:
                f690Var.f.c();
                break;
        }
        return rih1Var;
    }
}

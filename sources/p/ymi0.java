package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ymi0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zmi0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ymi0(zmi0 zmi0Var, byte b) {
        super(1);
        this.a = b;
        this.b = zmi0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        zmi0 zmi0Var = this.b;
        switch (b) {
            case 0:
                return zmi0Var.a;
            default:
                return zmi0Var.b;
        }
    }
}

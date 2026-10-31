package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hdo extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mr20 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hdo(mr20 mr20Var, byte b) {
        super(1);
        this.a = b;
        this.b = mr20Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        mr20 mr20Var = this.b;
        switch (b) {
            case 0:
                return mr20Var;
            case 1:
                return mr20Var;
            case 2:
                return new ry50(mr20Var, (byte) 28);
            default:
                return mr20Var;
        }
    }
}

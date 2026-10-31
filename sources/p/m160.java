package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class m160 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p410 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m160(p410 p410Var, byte b) {
        super(1);
        this.a = b;
        this.b = p410Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        p410 p410Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj).intValue();
                return (r6h1) p410Var.d;
            default:
                return new h3h1(new m160(p410Var, (byte) 0));
        }
    }
}

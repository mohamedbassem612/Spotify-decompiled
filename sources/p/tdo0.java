package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tdo0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rdo0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tdo0(rdo0 rdo0Var, byte b) {
        super(1);
        this.a = b;
        this.b = rdo0Var;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return new sdo0(this.b, (byte) 0);
            default:
                return new sdo0(this.b, (byte) 1);
        }
    }
}

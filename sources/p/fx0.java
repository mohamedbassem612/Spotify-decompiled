package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fx0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hx0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fx0(hx0 hx0Var, byte b) {
        super(1);
        this.a = b;
        this.b = hx0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        hx0 hx0Var = this.b;
        switch (b) {
            case 0:
                rwq0.z((qtr) obj, new m3(hx0Var, (byte) 21));
                return rih1.a;
            default:
                return hx0Var.e;
        }
    }
}

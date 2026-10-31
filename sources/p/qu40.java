package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qu40 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tu40 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qu40(tu40 tu40Var, byte b) {
        super(1);
        this.a = b;
        this.b = tu40Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        tu40 tu40Var = this.b;
        switch (b) {
            case 0:
                return new tm((paj0) obj, new pu40(tu40Var, (byte) 0), tu40Var.b);
            default:
                return new tm((paj0) obj, new pu40(tu40Var, (byte) 1), tu40Var.b, (byte) 0);
        }
    }
}

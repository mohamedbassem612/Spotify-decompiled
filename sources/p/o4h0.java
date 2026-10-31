package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class o4h0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ks6 b;
    public final /* synthetic */ otf0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o4h0(ks6 ks6Var, otf0 otf0Var, byte b) {
        super(2);
        this.a = b;
        this.b = ks6Var;
        this.c = otf0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        otf0 otf0Var = this.c;
        ks6 ks6Var = this.b;
        switch (b) {
            case 0:
                return new kpg0((xpw) ((kly0) ks6Var.Z).get(), new m4h0(ks6Var, otf0Var, (byte) 1));
            default:
                return new kpg0((xpw) ((kly0) ks6Var.Z).get(), new m4h0(ks6Var, otf0Var, (byte) 0));
        }
    }
}

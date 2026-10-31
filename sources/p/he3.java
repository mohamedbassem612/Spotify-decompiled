package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class he3 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x8c0 b;
    public final /* synthetic */ ven0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ he3(x8c0 x8c0Var, ven0 ven0Var, byte b) {
        super(1);
        this.a = b;
        this.b = x8c0Var;
        this.c = ven0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        x8c0 x8c0Var = this.b;
        ven0 ven0Var = this.c;
        switch (b) {
            case 0:
                it0 it0Var = new it0((byte) 1, x8c0Var, ven0Var);
                x8c0Var.a(it0Var);
                return new ht0(x8c0Var, it0Var, (byte) 3);
            case 1:
                x9d0 x9d0Var = new x9d0(ven0Var, (byte) 0);
                x8c0Var.a(x9d0Var);
                return new w9d0(x8c0Var, x9d0Var, (byte) 0);
            case 2:
                x9d0 x9d0Var2 = new x9d0(ven0Var, (byte) 2);
                x8c0Var.a(x9d0Var2);
                return new w9d0(x8c0Var, x9d0Var2, (byte) 15);
            default:
                x9d0 x9d0Var3 = new x9d0(ven0Var, (byte) 3);
                x8c0Var.a(x9d0Var3);
                return new w9d0(x8c0Var, x9d0Var3, (byte) 16);
        }
    }
}

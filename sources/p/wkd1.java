package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wkd1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zkd1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wkd1(zkd1 zkd1Var, byte b) {
        super(1);
        this.a = b;
        this.b = zkd1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        zkd1 zkd1Var = this.b;
        switch (b) {
            case 0:
                return zkd1Var.u1.U((r6h1) obj).b();
            case 1:
                return zkd1Var.u1.G((r6h1) obj);
            case 2:
                return zkd1Var.u1.p((r6h1) obj);
            case 3:
                return zkd1Var.u1.a0((r6h1) obj);
            case 4:
                return zkd1Var.u1.L((r6h1) obj);
            default:
                return zkd1Var.u1.E((r6h1) obj);
        }
    }
}

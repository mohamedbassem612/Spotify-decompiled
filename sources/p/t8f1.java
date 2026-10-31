package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class t8f1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z72 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t8f1(z72 z72Var, byte b) {
        super(1);
        this.a = b;
        this.b = z72Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        z72 z72Var = this.b;
        switch (b) {
            case 0:
                return new x010(((fg60) z72Var.X).a, (mr20) ((zc80) z72Var.c).b, new irp0(3, null, (byte) 23), (byte) 1);
            case 1:
                return new p8f1((n8f1) obj, ((fg60) z72Var.X).b(), false);
            default:
                ((qtr) obj).b(new bgb1((avl1) z72Var, (lnm) null, (byte) 4));
                return rih1.a;
        }
    }
}

package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ye50 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ze50 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ye50(ze50 ze50Var, byte b) {
        super(1);
        this.a = b;
        this.b = ze50Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        ze50 ze50Var = this.b;
        switch (b) {
            case 0:
                return ze50Var.p1.U((r6h1) obj).b();
            case 1:
                return ze50Var.p1.G((r6h1) obj);
            case 2:
                return ze50Var.p1.p((r6h1) obj);
            case 3:
                return ze50Var.p1.a0((r6h1) obj);
            case 4:
                return ze50Var.p1.L((r6h1) obj);
            case 5:
                return ze50Var.p1.E((r6h1) obj);
            default:
                return new thl0(ze50Var.f1.a, (r6h1) obj);
        }
    }
}

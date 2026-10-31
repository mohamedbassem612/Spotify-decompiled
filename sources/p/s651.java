package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class s651 extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ e7r0 b;
    public final /* synthetic */ u651 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s651(u651 u651Var, e7r0 e7r0Var) {
        super(1);
        this.c = u651Var;
        this.b = e7r0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        u651 u651Var = this.c;
        e7r0 e7r0Var = this.b;
        switch (b) {
            case 0:
                u651Var.f.a(e7r0Var.b, e7r0Var.d);
                return new tj4((byte) 16);
            default:
                d8r0 d8r0Var = new d8r0(e7r0Var.a, e7r0Var.b.c, e7r0Var.c, e7r0Var.e);
                u651Var.e.a = new l451(d8r0Var, (byte) 4);
                return new x651(d8r0Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s651(e7r0 e7r0Var, u651 u651Var) {
        super(1);
        this.b = e7r0Var;
        this.c = u651Var;
    }
}

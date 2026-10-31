package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class r651 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ u651 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r651(u651 u651Var, byte b) {
        super(1);
        this.a = b;
        this.b = u651Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        u651 u651Var = this.b;
        switch (b) {
            case 0:
                return Boolean.valueOf(u651Var.d.b(u651Var.c, ((xb51) obj).a));
            case 1:
                return Boolean.valueOf(u651Var.d.g(u651Var.c, ((xb51) obj).a));
            default:
                return new xwm0(u651Var, (byte) 25);
        }
    }
}

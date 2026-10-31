package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class uvb extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ ven0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uvb(Object obj, iu30 iu30Var, ven0 ven0Var, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
        this.c = iu30Var;
        this.d = ven0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        Object obj2 = this.b;
        ven0 ven0Var = this.d;
        switch (b) {
            case 0:
                ((Boolean) obj).getClass();
                if (!u890.j(ven0Var.getValue(), obj2)) {
                    iu30Var.invoke(obj2);
                }
                ven0Var.setValue(obj2);
                break;
            default:
                ((Boolean) obj).getClass();
                if (!u890.j(ven0Var.getValue(), obj2)) {
                    iu30Var.invoke(obj2);
                }
                ven0Var.setValue(obj2);
                break;
        }
        return rih1Var;
    }
}

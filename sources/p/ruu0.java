package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ruu0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ puu0 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ruu0(puu0 puu0Var, iu30 iu30Var, byte b) {
        super(1);
        this.a = b;
        this.b = puu0Var;
        this.c = iu30Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        puu0 puu0Var = this.b;
        switch (b) {
            case 0:
                puu0Var.g.invoke();
                iu30Var.invoke(new luu0(((s201) obj).a));
                break;
            default:
                tv80 tv80Var = (tv80) obj;
                puu0Var.g.invoke();
                iu30Var.invoke(new iuu0(tv80Var != null ? tv80Var.a : null));
                break;
        }
        return rih1Var;
    }
}

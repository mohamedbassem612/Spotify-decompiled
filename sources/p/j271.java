package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class j271 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j171 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j271(byte b, iu30 iu30Var, j171 j171Var) {
        super(1);
        this.a = b;
        this.b = j171Var;
        this.c = iu30Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        j171 j171Var = this.b;
        switch (b) {
            case 0:
                j171Var.d.invoke();
                iu30Var.invoke(new r071(((s201) obj).a));
                break;
            default:
                tv80 tv80Var = (tv80) obj;
                j171Var.d.invoke();
                iu30Var.invoke(new o071(tv80Var != null ? tv80Var.a : null));
                break;
        }
        return rih1Var;
    }
}

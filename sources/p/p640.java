package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class p640 implements rjp0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fai0 b;
    public final /* synthetic */ fai0 c;

    public /* synthetic */ p640(fai0 fai0Var, fai0 fai0Var2, byte b) {
        this.a = b;
        this.b = fai0Var;
        this.c = fai0Var2;
    }

    public final void b(Object obj) {
        byte b = this.a;
        fai0 fai0Var = this.c;
        fai0 fai0Var2 = this.b;
        switch (b) {
            case 0:
                v740 v740Var = (v740) obj;
                o640 o640Var = (o640) fai0Var.e();
                fai0Var2.m(new q640(v740Var != null ? (u740) o7h.s0(v740Var.a) : null, o640Var != null ? o640Var.b : null, o640Var != null && o640Var.a));
                break;
            default:
                v740 v740Var2 = (v740) fai0Var.e();
                o640 o640Var2 = (o640) obj;
                fai0Var2.m(new q640(v740Var2 != null ? (u740) o7h.s0(v740Var2.a) : null, o640Var2 != null ? o640Var2.b : null, o640Var2 != null && o640Var2.a));
                break;
        }
    }
}

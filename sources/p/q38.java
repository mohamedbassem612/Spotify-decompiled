package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class q38 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ em3 b;
    public final /* synthetic */ b4x0 c;

    public /* synthetic */ q38(em3 em3Var, b4x0 b4x0Var, byte b) {
        this.a = b;
        this.b = em3Var;
        this.c = b4x0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        b4x0 b4x0Var = this.c;
        em3 em3Var = this.b;
        switch (b) {
            case 0:
                t38 t38Var = (t38) em3Var.c;
                String str = zoi1.a;
                t38Var.r(b4x0Var);
                break;
            default:
                t38 t38Var2 = (t38) em3Var.c;
                String str2 = zoi1.a;
                t38Var2.p(b4x0Var);
                break;
        }
    }
}

package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class dq21 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ eq21 b;

    public /* synthetic */ dq21(eq21 eq21Var, byte b) {
        this.a = b;
        this.b = eq21Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        eq21 eq21Var = this.b;
        switch (b) {
            case 0:
                at7 at7Var = eq21Var.c;
                if (((eq21) at7Var.h) != null) {
                    at7Var.c();
                }
                break;
            default:
                at7 at7Var2 = eq21Var.c;
                if (((eq21) at7Var2.h) != null && (at7Var2.b & 3) != 0) {
                    at7Var2.c();
                    break;
                }
                break;
        }
    }
}

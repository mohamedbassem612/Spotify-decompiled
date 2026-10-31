package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class wy9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t01 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wy9(t01 t01Var, Object obj, byte b) {
        this.a = b;
        this.b = t01Var;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Object obj = this.c;
        t01 t01Var = this.b;
        switch (b) {
            case 0:
                if (t01Var.a == 0) {
                    t01Var.H(obj);
                }
                break;
            default:
                int i = t01Var.a - 1;
                t01Var.a = i;
                if (i == 0) {
                    t01Var.H(obj);
                }
                break;
        }
    }
}

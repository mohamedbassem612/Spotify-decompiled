package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class tlk0 implements r331 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ulk0 b;
    public final /* synthetic */ tik0 c;

    public /* synthetic */ tlk0(ulk0 ulk0Var, tik0 tik0Var, byte b) {
        this.a = b;
        this.b = ulk0Var;
        this.c = tik0Var;
    }

    public final void e(d331 d331Var) {
        byte b = this.a;
        tik0 tik0Var = this.c;
        ulk0 ulk0Var = this.b;
        switch (b) {
            case 0:
                ulk0Var.c = false;
                if (d331Var instanceof y231) {
                    tik0Var.invoke(((y231) d331Var).a);
                }
                break;
            default:
                ulk0Var.c = false;
                if (d331Var instanceof y231) {
                    og7 og7Var = (og7) ((y231) d331Var).a;
                    tik0Var.invoke(new qib0(og7Var.a, null, null, og7Var.b));
                }
                break;
        }
    }
}

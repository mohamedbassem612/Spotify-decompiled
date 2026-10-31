package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class dv40 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ev40 b;
    public final /* synthetic */ int c;

    public /* synthetic */ dv40(ev40 ev40Var, int i, byte b) {
        this.a = b;
        this.b = ev40Var;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        ev40 ev40Var = this.b;
        switch (b) {
            case 0:
                lwh0 lwh0Var = ((kv40) ((lc20) ev40Var.g).d).d;
                if (lwh0Var != null) {
                    lwh0Var.i(i);
                }
                break;
            default:
                lwh0 lwh0Var2 = ((kv40) ((lc20) ev40Var.g).d).d;
                if (lwh0Var2 != null) {
                    lwh0Var2.j(i);
                }
                break;
        }
    }
}

package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hl91 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ il91 b;

    public /* synthetic */ hl91(il91 il91Var, byte b) {
        this.a = b;
        this.b = il91Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        il91 il91Var = this.b;
        switch (b) {
            case 0:
                il91Var.i.i(w8c0.e);
                break;
            default:
                il91Var.i.i(w8c0.c);
                break;
        }
    }
}

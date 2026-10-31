package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class szh0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ e0i0 b;
    public final /* synthetic */ ffu0 c;

    public /* synthetic */ szh0(e0i0 e0i0Var, ffu0 ffu0Var, byte b) {
        this.a = b;
        this.b = e0i0Var;
        this.c = ffu0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ffu0 ffu0Var = this.c;
        e0i0 e0i0Var = this.b;
        switch (b) {
            case 0:
                e0i0Var.j.setPlaybackState(e0i0Var.b(ffu0Var));
                break;
            default:
                e0i0Var.j.setPlaybackState(e0i0Var.b(ffu0Var));
                e0i0Var.f.x(ffu0Var.n0().a(17) ? ffu0Var.d0() : sqe1.a);
                break;
        }
    }
}

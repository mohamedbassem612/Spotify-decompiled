package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class aj8 implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ dg30 b;

    public aj8(dj8 dj8Var, dg30 dg30Var) {
        this.b = dg30Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        dg30 dg30Var = this.b;
        switch (b) {
            case 0:
                dg30Var.startActivity(dg30Var.getPackageManager().getLaunchIntentForPackage(dg30Var.getPackageName()));
                break;
            default:
                dg30Var.finish();
                break;
        }
    }

    public aj8(dg30 dg30Var) {
        this.b = dg30Var;
    }
}

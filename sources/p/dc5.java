package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dc5 implements Runnable {
    public final /* synthetic */ ec5 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;

    public dc5(ec5 ec5Var, float f, float f2) {
        this.a = ec5Var;
        this.b = f;
        this.c = f2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ec5 ec5Var = this.a;
        zb5 zb5Var = ec5Var.a;
        zb5Var.y = this.b;
        zb5Var.z = this.c;
        ec5Var.a();
    }
}

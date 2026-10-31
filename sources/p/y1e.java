package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class y1e implements Runnable {
    public final /* synthetic */ z1e a;
    public final /* synthetic */ ysi0 b;
    public final /* synthetic */ msi0 c;
    public final /* synthetic */ fp8 d;

    public y1e(fp8 fp8Var, z1e z1eVar, ysi0 ysi0Var, msi0 msi0Var) {
        this.d = fp8Var;
        this.a = z1eVar;
        this.b = ysi0Var;
        this.c = msi0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a2e a2eVar = (a2e) this.d.b;
        z1e z1eVar = this.a;
        if (z1eVar != null) {
            a2eVar.Z0 = true;
            z1eVar.b.d(false);
            a2eVar.Z0 = false;
        }
        ysi0 ysi0Var = this.b;
        if (ysi0Var.isEnabled() && ysi0Var.hasSubMenu()) {
            this.c.r(ysi0Var);
        }
    }
}

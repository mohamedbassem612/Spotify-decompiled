package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gw30 implements o5s {
    public final /* synthetic */ hw30 a;

    public gw30(hw30 hw30Var) {
        this.a = hw30Var;
    }

    public final void onDestroy(iac0 iac0Var) {
        hw30 hw30Var = this.a;
        hw30Var.g.b(hw30Var.h, false);
        mbm1 mbm1Var = hw30Var.g;
        Object obj = hw30Var.h;
        synchronized (mbm1Var) {
            mbm1Var.b.remove(obj);
        }
    }

    public final void onResume(iac0 iac0Var) {
        hw30 hw30Var = this.a;
        if (!hw30Var.Z) {
            hw30Var.a.invoke(ywz.b);
        }
        hw30Var.Z = false;
    }
}

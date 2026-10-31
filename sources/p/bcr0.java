package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bcr0 implements o5s {
    public final idd1 a;
    public final /* synthetic */ dcr0 b;

    public bcr0(dcr0 dcr0Var) {
        this.b = dcr0Var;
        this.a = new idd1(new gyq0(dcr0Var, (byte) 15));
    }

    public final boolean a() {
        return ((Boolean) this.a.getValue()).booleanValue();
    }

    public final void onCreate(iac0 iac0Var) {
        if (a()) {
            this.b.i.k().start();
        }
    }

    public final void onDestroy(iac0 iac0Var) {
        boolean zA = a();
        dcr0 dcr0Var = this.b;
        if (zA) {
            dcr0Var.i.k().stop();
        }
        if (dcr0Var.a == null) {
            dcr0Var.d.a();
        }
    }

    public final void onStart(iac0 iac0Var) {
        if (a()) {
            return;
        }
        this.b.i.k().start();
    }

    public final void onStop(iac0 iac0Var) {
        if (a()) {
            return;
        }
        this.b.i.k().stop();
    }
}

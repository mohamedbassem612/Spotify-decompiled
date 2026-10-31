package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bes implements o5s {
    public final /* synthetic */ ges a;

    public bes(ges gesVar) {
        this.a = gesVar;
    }

    public final void onCreate(iac0 iac0Var) {
        ges gesVar = this.a;
        if (gesVar.m1) {
            gesVar.o1 = true;
            if (gesVar.b1 != null) {
                gesVar.A();
            }
        }
    }

    public final void onDestroy(iac0 iac0Var) {
        ges gesVar = this.a;
        if (gesVar.m1) {
            gesVar.o1 = false;
            if (gesVar.b1 != null) {
                gesVar.B();
            }
        }
    }

    public final void onPause(iac0 iac0Var) {
        ges gesVar = this.a;
        if (gesVar.m1) {
            return;
        }
        gesVar.o1 = false;
        if (gesVar.b1 != null) {
            gesVar.B();
        }
    }

    public final void onResume(iac0 iac0Var) {
        ges gesVar = this.a;
        if (gesVar.m1) {
            return;
        }
        gesVar.o1 = true;
        if (gesVar.b1 != null) {
            gesVar.A();
        }
    }
}

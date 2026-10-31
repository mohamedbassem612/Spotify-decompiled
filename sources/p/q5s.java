package p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class q5s implements aac0 {
    public final o5s a;
    public final aac0 b;

    public q5s(o5s o5sVar, aac0 aac0Var) {
        this.a = o5sVar;
        this.b = aac0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // p.aac0
    public final void q(iac0 iac0Var, k8c0 k8c0Var) throws NoWhenBranchMatchedException {
        int i = p5s.a[k8c0Var.ordinal()];
        o5s o5sVar = this.a;
        switch (i) {
            case 1:
                o5sVar.onCreate(iac0Var);
                break;
            case 2:
                o5sVar.onStart(iac0Var);
                break;
            case 3:
                o5sVar.onResume(iac0Var);
                break;
            case 4:
                o5sVar.onPause(iac0Var);
                break;
            case 5:
                o5sVar.onStop(iac0Var);
                break;
            case 6:
                o5sVar.onDestroy(iac0Var);
                break;
            case 7:
                hhg1.n("ON_ANY must not been send by anybody");
                return;
            default:
                eg.o();
                return;
        }
        aac0 aac0Var = this.b;
        if (aac0Var != null) {
            aac0Var.q(iac0Var, k8c0Var);
        }
    }
}

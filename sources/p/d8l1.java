package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class d8l1 implements o5s {
    public final /* synthetic */ zau0 a;
    public final /* synthetic */ ven0 b;
    public final /* synthetic */ Function0 c;

    public d8l1(zau0 zau0Var, ven0 ven0Var, Function0 function0) {
        this.a = zau0Var;
        this.b = ven0Var;
        this.c = function0;
    }

    public final void onDestroy(iac0 iac0Var) {
        iac0Var.getLifecycle().d(this);
    }

    public final void onResume(iac0 iac0Var) {
        zau0 zau0Var;
        abu0 abu0Var;
        if (!qtg.g(this.b) || (zau0Var = this.a) == null || (abu0Var = (abu0) this.c.invoke()) == null) {
            return;
        }
        abu0Var.a(zau0Var);
    }
}

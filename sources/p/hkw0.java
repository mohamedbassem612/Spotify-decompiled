package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hkw0 implements o5s {
    public final /* synthetic */ lkw0 a;

    public hkw0(lkw0 lkw0Var) {
        this.a = lkw0Var;
    }

    public final void onDestroy(iac0 iac0Var) {
        lkw0.f(this.a);
    }

    public final void onStart(iac0 iac0Var) {
        lkw0 lkw0Var = this.a;
        lkw0.a(lkw0Var).f(lkw0.e(lkw0Var).observeOn(lkw0.b(lkw0Var)).subscribe((Consumer) new ekw0(this, (byte) 0)), lkw0.c(lkw0Var).L(lkw0.b(lkw0Var)).subscribe((Consumer) new ekw0(this, (byte) 1)));
    }

    public final void onStop(iac0 iac0Var) {
        lkw0 lkw0Var = this.a;
        lkw0.a(lkw0Var).g();
        lkw0.g(lkw0Var);
        lkw0.d(lkw0Var);
    }
}

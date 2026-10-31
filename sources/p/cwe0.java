package p;

import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class cwe0 implements o5s {
    public final ohv0 a;
    public final boolean b;
    public final xov0 c;
    public final CompositeDisposable d = new CompositeDisposable();

    public cwe0(x8c0 x8c0Var, ohv0 ohv0Var, boolean z, xov0 xov0Var) {
        this.a = ohv0Var;
        this.b = z;
        this.c = xov0Var;
        x8c0Var.a(this);
    }

    public final void onCreate(iac0 iac0Var) {
        this.a.a(new khv0(null, 1, zno1.t(oqn1.n("status", this.b ? rca.d : rca.e)), "accessibility_status"));
        this.d.b(fq7.D(this.c).subscribe((Consumer) new rwa0(this, (byte) 14)));
    }

    public final void onDestroy(iac0 iac0Var) {
        this.d.g();
    }
}

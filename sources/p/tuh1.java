package p;

import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.functions.Functions;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class tuh1 implements Consumer, o5s {
    public final s4w0 a;
    public final vku b = new vku();

    public tuh1(s4w0 s4w0Var, iac0 iac0Var) {
        this.a = s4w0Var;
        iac0Var.getLifecycle().a(new ct6(this, (byte) 14));
    }

    public final void accept(Object obj) {
        m0w0 m0w0Var = (m0w0) obj;
        this.b.a(this.a.d(m0w0Var.d, (tv80) null, m0w0Var.e).o(Functions.h).subscribe());
    }

    public final void onStop(iac0 iac0Var) {
        this.b.c();
    }
}

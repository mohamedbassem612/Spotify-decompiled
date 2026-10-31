package p;

import android.view.View;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sf10 implements o5s {
    public final utw0 a;
    public final Scheduler b;
    public final kp00 c;
    public Disposable d = EmptyDisposable.a;
    public final rku e = new rku();
    public final rku f = new rku();
    public pf10 g;

    public sf10(utw0 utw0Var, Scheduler scheduler, x8c0 x8c0Var, khc khcVar, kp00 kp00Var) {
        this.a = utw0Var;
        this.b = scheduler;
        this.c = kp00Var;
        x8c0Var.a(this);
    }

    public final void a(boolean z) {
        View view;
        pf10 pf10Var = this.g;
        if (pf10Var != null && (view = pf10Var.M1) != null) {
            view.setVisibility(8);
        }
        pf10 pf10Var2 = this.g;
        kp00 kp00Var = this.c;
        if (!z) {
            if (pf10Var2 != null) {
                pf10Var2.Z0();
            }
            kp00Var.k(String.format(Locale.US, "Error code %d", Arrays.copyOf(new Object[]{0}, 1)));
        } else {
            if (pf10Var2 != null && pf10Var2.f0() != null && pf10Var2.q0()) {
                pf10Var2.N1.setValue(new j0f0(pf10Var2.l0(2131952658), pf10Var2.l0(2131952657), (hux) null, new h0f0(pf10Var2.l0(2131953887), new of10(pf10Var2, (byte) 1)), (h0f0) null, (i3u) null, new of10(pf10Var2, (byte) 2), new of10(pf10Var2, (byte) 3), 52));
            }
            String.format(Locale.US, "Error code %d", Arrays.copyOf(new Object[]{37}, 1));
            ((ohv0) kp00Var.c).a(new jhv0(((gp41) kp00Var.b).a, "no_connection", (String) null, (String) null));
        }
    }

    public final void b(pf10 pf10Var) {
        this.g = pf10Var;
    }

    public final void onStop(iac0 iac0Var) {
        this.d.dispose();
        this.e.a();
        this.f.a();
    }
}

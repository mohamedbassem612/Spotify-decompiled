package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vr00 implements o5s {
    public final /* synthetic */ wr00 a;

    public vr00(wr00 wr00Var) {
        this.a = wr00Var;
    }

    public final void onDestroy(iac0 iac0Var) {
        this.a.a.getLifecycle().d(this);
    }

    public final void onPause(iac0 iac0Var) {
        faa0 faa0Var = this.a.c;
        if (faa0Var != null) {
            faa0Var.d((CancellationException) null);
        }
    }
}

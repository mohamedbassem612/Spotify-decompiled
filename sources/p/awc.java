package p;

import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class awc implements o5s {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ awc(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // p.o5s
    public final void onDestroy(iac0 iac0Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                iwc iwcVar = (iwc) obj;
                iwc.d(iwcVar).a(iwc.c(iwcVar));
                break;
            case 1:
                ((Disposable) obj).dispose();
                iac0Var.getLifecycle().d(this);
                break;
            default:
                hms0.a((hms0) obj).dispose();
                break;
        }
    }
}

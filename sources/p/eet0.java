package p;

import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class eet0 implements o5s {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iac0 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ eet0(Object obj, iac0 iac0Var, byte b) {
        this.a = b;
        this.c = obj;
        this.b = iac0Var;
    }

    public final void onDestroy(iac0 iac0Var) {
        byte b = this.a;
        iac0 iac0Var2 = this.b;
        switch (b) {
            case 0:
                iac0Var2.getLifecycle().d(this);
                break;
            default:
                iac0Var2.getLifecycle().d(this);
                break;
        }
    }

    public final void onPause(iac0 iac0Var) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                ((get0) obj).h.c();
                break;
            default:
                b9l1 b9l1Var = (b9l1) obj;
                b9l1Var.a.b(b9l1Var.b);
                break;
        }
    }

    public final void onResume(iac0 iac0Var) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                get0 get0Var = (get0) obj;
                get0Var.h.b(new Disposable[]{get0Var.c.subscribe(new det0(get0Var, (byte) 0)), yoi1.i(get0Var.f.a, o6x.a).distinctUntilChanged().subscribe(new det0(get0Var, (byte) 1))});
                break;
            default:
                b9l1 b9l1Var = (b9l1) obj;
                b9l1Var.a.a(b9l1Var.b);
                break;
        }
    }
}

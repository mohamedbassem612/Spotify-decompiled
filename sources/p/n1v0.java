package p;

import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Action;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class n1v0 implements Action {
    public final /* synthetic */ byte a;
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ p1v0 c;

    public /* synthetic */ n1v0(AtomicReference atomicReference, p1v0 p1v0Var, byte b) {
        this.a = b;
        this.b = atomicReference;
        this.c = p1v0Var;
    }

    public final void run() {
        byte b = this.a;
        p1v0 p1v0Var = this.c;
        AtomicReference atomicReference = this.b;
        switch (b) {
            case 0:
                Disposable disposable = (Disposable) atomicReference.get();
                if (disposable != null) {
                    p1v0Var.g.a(disposable);
                }
                break;
            default:
                Disposable disposable2 = (Disposable) atomicReference.get();
                if (disposable2 != null) {
                    p1v0Var.g.a(disposable2);
                }
                break;
        }
    }
}

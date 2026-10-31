package p;

import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class m1v0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ p1v0 c;

    public /* synthetic */ m1v0(AtomicReference atomicReference, p1v0 p1v0Var, byte b) {
        this.a = b;
        this.b = atomicReference;
        this.c = p1v0Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        p1v0 p1v0Var = this.c;
        AtomicReference atomicReference = this.b;
        switch (b) {
            case 0:
                Disposable disposable = (Disposable) obj;
                atomicReference.set(disposable);
                p1v0Var.g.b(disposable);
                break;
            default:
                Disposable disposable2 = (Disposable) obj;
                atomicReference.set(disposable2);
                p1v0Var.g.b(disposable2);
                break;
        }
    }
}

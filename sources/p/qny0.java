package p;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qny0 extends AtomicBoolean implements Disposable {
    public final Observer a;
    public final rny0 b;

    public qny0(Observer observer, rny0 rny0Var) {
        this.a = observer;
        this.b = rny0Var;
    }

    public void dispose() {
        if (compareAndSet(false, true)) {
            this.b.a(this);
        }
    }

    public boolean isDisposed() {
        return get();
    }
}

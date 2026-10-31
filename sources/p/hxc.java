package p;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hxc implements Disposable, myc {
    public final dxc a;
    public final Observer b;
    public volatile boolean c;
    public boolean d = false;

    public hxc(dxc dxcVar, Observer observer) {
        this.a = dxcVar;
        this.b = observer;
    }

    public void dispose() {
        this.c = true;
        this.a.cancel();
    }

    public boolean isDisposed() {
        return this.c;
    }

    public final void u(dxc dxcVar, Throwable th) {
        if (dxcVar.o()) {
            return;
        }
        try {
            this.b.onError(th);
        } catch (Throwable th2) {
            Exceptions.a(th2);
            RxJavaPlugins.b(new CompositeException(new Throwable[]{th, th2}));
        }
    }

    public final void z(dxc dxcVar, sy21 sy21Var) {
        if (this.c) {
            return;
        }
        try {
            this.b.onNext(sy21Var);
            if (this.c) {
                return;
            }
            this.d = true;
            this.b.onComplete();
        } catch (Throwable th) {
            Exceptions.a(th);
            if (this.d) {
                RxJavaPlugins.b(th);
                return;
            }
            if (this.c) {
                return;
            }
            try {
                this.b.onError(th);
            } catch (Throwable th2) {
                Exceptions.a(th2);
                RxJavaPlugins.b(new CompositeException(new Throwable[]{th, th2}));
            }
        }
    }
}

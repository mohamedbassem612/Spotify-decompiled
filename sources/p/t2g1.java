package p;

import io.reactivex.rxjava3.core.Emitter;
import io.reactivex.rxjava3.core.FlowableEmitter;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class t2g1 {
    public final Emitter a;
    public final Disposable b;
    public final hoc1 c;

    public t2g1(Emitter emitter, Disposable disposable, hoc1 hoc1Var, String str) {
        this.a = emitter;
        this.b = disposable;
        this.c = hoc1Var;
    }

    public final hoc1 a() {
        return this.c;
    }

    public final boolean b() {
        boolean zIsCancelled;
        ObservableEmitter observableEmitter = this.a;
        if (observableEmitter instanceof ObservableEmitter) {
            zIsCancelled = observableEmitter.isDisposed();
        } else {
            if (!(observableEmitter instanceof FlowableEmitter)) {
                hhg1.n("Must be either ObservableEmitter or FlowableEmitter");
                return false;
            }
            zIsCancelled = ((FlowableEmitter) observableEmitter).isCancelled();
        }
        if (zIsCancelled) {
            return false;
        }
        this.b.dispose();
        return true;
    }
}

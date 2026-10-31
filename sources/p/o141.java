package p;

import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class o141 implements SingleObserver {
    public final /* synthetic */ ohd a;

    public o141(ohd ohdVar) {
        this.a = ohdVar;
    }

    public final void onError(Throwable th) {
        this.a.resumeWith(new m231(th));
    }

    public final void onSubscribe(Disposable disposable) {
        this.a.n(new waq0(disposable, (byte) 11));
    }

    public final void onSuccess(Object obj) {
        this.a.resumeWith(obj);
    }
}

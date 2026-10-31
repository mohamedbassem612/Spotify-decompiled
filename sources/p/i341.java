package p;

import androidx.work.rxjava3.RxWorker;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class i341 implements SingleObserver {
    public final /* synthetic */ mzc a;

    public i341(mzc mzcVar) {
        this.a = mzcVar;
    }

    public final void onError(Throwable th) {
        this.a.c(th);
    }

    public final void onSubscribe(Disposable disposable) {
        Objects.requireNonNull(disposable);
        this.a.a(new n6(disposable, (byte) 10), RxWorker.e);
    }

    public final void onSuccess(Object obj) {
        this.a.b(obj);
    }
}

package p;

import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zc00 implements f961 {
    public final kly0 a;
    public Disposable b;
    public final PublishSubject c = new PublishSubject();

    public zc00(kly0 kly0Var) {
        this.a = kly0Var;
    }

    public final void shutdown() {
        Disposable disposable = this.b;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    public final Object getApi() {
        return this;
    }
}

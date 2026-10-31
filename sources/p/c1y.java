package p;

import io.reactivex.rxjava3.disposables.CompositeDisposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class c1y implements f961 {
    public final cr51 a;
    public final aod b;
    public final g0l c;
    public final CompositeDisposable d = new CompositeDisposable();

    public c1y(cr51 cr51Var, aod aodVar, g0l g0lVar) {
        this.a = cr51Var;
        this.b = aodVar;
        this.c = g0lVar;
    }

    public final void shutdown() {
        this.d.g();
    }

    public final Object getApi() {
        return this;
    }
}

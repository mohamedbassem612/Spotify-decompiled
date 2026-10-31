package p;

import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wwf0 {
    public final Scheduler a;
    public final RetrofitMaker b;
    public final nxf0 c;
    public final ajg d;
    public final CompositeDisposable e = new CompositeDisposable();

    public wwf0(Scheduler scheduler, RetrofitMaker retrofitMaker, nxf0 nxf0Var, ajg ajgVar) {
        this.a = scheduler;
        this.b = retrofitMaker;
        this.c = nxf0Var;
        this.d = ajgVar;
    }
}

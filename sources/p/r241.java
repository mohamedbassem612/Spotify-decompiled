package p;

import com.spotify.connectivity.product_state.esperanto.proto.PutValuesSyncRequest;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.disposables.CompositeDisposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class r241 {
    public final luw0 a;
    public final CompositeDisposable b = new CompositeDisposable();

    public r241(luw0 luw0Var) {
        this.a = luw0Var;
    }

    public final void a(String str, String str2) {
        this.a.a(str, str2).subscribe(new q241(this));
    }

    public final Completable b(String str, String str2) {
        be beVar = this.a.a;
        qyy0 qyy0VarO = PutValuesSyncRequest.o();
        qyy0VarO.n(str, str2);
        return beVar.e(qyy0VarO.build()).flatMapCompletable(zz10.d1);
    }
}

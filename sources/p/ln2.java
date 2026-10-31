package p;

import com.spotify.mobius.Connection;
import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ln2 implements Connection {
    public final /* synthetic */ nn2 a;
    public final /* synthetic */ Disposable b;

    public ln2(nn2 nn2Var, Disposable disposable) {
        this.a = nn2Var;
        this.b = disposable;
    }

    @Override // com.spotify.mobius.Connection, com.spotify.mobius.functions.Consumer
    public final void accept(Object obj) {
        nn2.d(this.a, (th2) obj);
    }

    @Override // com.spotify.mobius.Connection, com.spotify.mobius.disposables.Disposable
    public final void dispose() {
        this.b.dispose();
    }
}

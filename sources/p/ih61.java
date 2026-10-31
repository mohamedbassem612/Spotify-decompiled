package p;

import com.spotify.cosmos.servicebasedrouter.AndroidServicebasedrouterProperties;
import com.spotify.cosmos.servicebasedrouter.ScopeCallbackConnector;
import com.spotify.cosmos.servicebasedrouter.ScopeConnector;
import io.reactivex.rxjava3.disposables.Disposable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ih61 implements ScopeConnector, ScopeCallbackConnector {
    public final xm41 a;
    public final AndroidServicebasedrouterProperties b;

    public ih61(xm41 xm41Var, AndroidServicebasedrouterProperties androidServicebasedrouterProperties) {
        this.a = xm41Var;
        this.b = androidServicebasedrouterProperties;
    }

    public final gn41 connect(iu30 iu30Var, Function0 function0) {
        return this.a.e(function0, new n601(iu30Var, (byte) 27));
    }

    public final Disposable subscribe(iu30 iu30Var, Function0 function0) {
        return Disposable.d(new c72(this.a.e(function0, new c861(iu30Var, this, (byte) 2)), (byte) 7));
    }
}

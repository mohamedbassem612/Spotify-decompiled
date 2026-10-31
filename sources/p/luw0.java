package p;

import com.spotify.connectivity.product_state.esperanto.proto.PutValuesRequest;
import io.reactivex.rxjava3.core.Completable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class luw0 {
    public final be a;

    public luw0(be beVar) {
        this.a = beVar;
    }

    public final Completable a(String str, String str2) {
        oyy0 oyy0VarO = PutValuesRequest.o();
        oyy0VarO.n(str, str2);
        return this.a.d((PutValuesRequest) oyy0VarO.build()).ignoreElement();
    }
}

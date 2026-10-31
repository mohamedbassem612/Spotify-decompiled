package p;

import com.spotify.offline.offlineplugin_proto.EsOfflinePlugin$RemoveCommand;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Supplier;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class g921 implements Supplier {
    public final /* synthetic */ EsOfflinePlugin$RemoveCommand a;

    public g921(EsOfflinePlugin$RemoveCommand esOfflinePlugin$RemoveCommand) {
        this.a = esOfflinePlugin$RemoveCommand;
    }

    public final Object get() {
        return Observable.fromIterable(this.a.n());
    }
}

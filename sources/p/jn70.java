package p;

import com.spotify.offline.offlineplugin_proto.EsOfflinePlugin$IdentifyCommand;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Supplier;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jn70 implements Supplier {
    public final /* synthetic */ EsOfflinePlugin$IdentifyCommand a;

    public jn70(EsOfflinePlugin$IdentifyCommand esOfflinePlugin$IdentifyCommand) {
        this.a = esOfflinePlugin$IdentifyCommand;
    }

    public final Object get() {
        return Observable.fromIterable(this.a.n());
    }
}

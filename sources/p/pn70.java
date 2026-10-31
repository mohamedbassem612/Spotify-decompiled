package p;

import com.spotify.offline.offlineplugin_proto.EsOfflinePlugin$IdentifyCommand;
import com.spotify.offline.offlineplugin_proto.EsOfflinePlugin$IdentifyResponse;
import com.spotify.offline.offlineplugin_proto.f;
import com.spotify.offline.offlineplugin_proto.g;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class pn70 {
    public static final bof1 a(String str, g gVar) {
        f fVarO = EsOfflinePlugin$IdentifyResponse.Result.o();
        fVarO.q(gVar);
        EsOfflinePlugin$IdentifyResponse.Result result = (EsOfflinePlugin$IdentifyResponse.Result) fVarO.build();
        result.getClass();
        return new bof1(str, result);
    }

    public static final Single b(EsOfflinePlugin$IdentifyCommand esOfflinePlugin$IdentifyCommand, pmf0 pmf0Var, Scheduler scheduler) {
        return Observable.defer(new jn70(esOfflinePlugin$IdentifyCommand)).subscribeOn(scheduler).map(kn70.a).flatMap(new ouz(pmf0Var, (byte) 13), 8).observeOn(scheduler).collect(ln70.b, mn70.a).map(dj20.f);
    }
}

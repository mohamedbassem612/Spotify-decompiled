package p;

import com.spotify.offline.offlineplugin_proto.EsOfflinePlugin$RemoveCommand;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class h921 implements Function {
    public static final h921 a = new h921();

    public final Object apply(Object obj) {
        EsOfflinePlugin$RemoveCommand.Query query = (EsOfflinePlugin$RemoveCommand.Query) obj;
        phc phcVarA = ckj0.a(query.getMetadataMap());
        return phcVarA != null ? "spotify:track:".concat(g9a.a(phcVarA.t())) : query.getLink();
    }
}

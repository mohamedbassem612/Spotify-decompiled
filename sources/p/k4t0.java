package p;

import com.spotify.watchfeedentrypoints.api.v1.GetPivotsResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J&\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lp/k4t0;", "", "", "id", "categoryUri", "Lcom/spotify/watchfeedentrypoints/api/v1/GetPivotsResponse;", "b", "(Ljava/lang/String;Ljava/lang/String;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_watchfeed_pivotspage-pivotspage"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface k4t0 {
    static /* synthetic */ Object a(k4t0 k4t0Var, String str, String str2, lnm lnmVar, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: getContent");
            return null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return k4t0Var.b(str, str2, lnmVar);
    }

    @ay30("watch-feed-entrypoints/v1/pivots/{id}")
    @u360({"Content-Type: application/protobuf", "Accept: application/protobuf"})
    Object b(@t8s0("id") String str, @u0z0("categoryUri") String str2, lnm<? super GetPivotsResponse> lnmVar);
}

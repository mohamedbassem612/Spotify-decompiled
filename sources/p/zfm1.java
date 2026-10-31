package p;

import com.spotify.wrapped.v1.proto.LandscapeShareImageResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lp/zfm1;", "", "", "shareId", "Lcom/spotify/wrapped/v1/proto/LandscapeShareImageResponse;", "a", "(Ljava/lang/String;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_recents_recentsdatasourceimpl-recentsdatasourceimpl"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface zfm1 {
    @ay30("campaigns-service/v1/campaigns/wrapped/consumer/share-landscape/{shareId}")
    @u360({"Accept: application/protobuf"})
    Object a(@t8s0("shareId") String str, lnm<? super LandscapeShareImageResponse> lnmVar);
}

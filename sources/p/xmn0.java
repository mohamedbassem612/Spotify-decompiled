package p;

import com.spotify.aipartner.aipartnerapi.proto.ResolveIntentRequest;
import com.spotify.aipartner.aipartnerapi.proto.ResolveIntentResponse;
import com.spotify.playlist4.proto.PlaylistSyncReasonProto;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lp/xmn0;", "", "Lcom/spotify/aipartner/aipartnerapi/proto/ResolveIntentRequest;", "request", "Lcom/spotify/aipartner/aipartnerapi/proto/ResolveIntentResponse;", "a", "(Lcom/spotify/aipartner/aipartnerapi/proto/ResolveIntentRequest;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_aipartner_aipartnerapiwrapper-aipartnerapiwrapper"}, k = 1, mv = {2, 3, 0}, xi = PlaylistSyncReasonProto.PlaylistSyncCaller.MULTIGET_ADDITIONAL_RESPONSE_VALUE)
public interface xmn0 {
    @wyq0("/v2/natural-language/resolve-intent")
    Object a(@elb ResolveIntentRequest resolveIntentRequest, lnm<? super ResolveIntentResponse> lnmVar);
}

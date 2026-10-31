package p;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.voiceassistants.playermodels.CommandPlayRequest;
import com.spotify.voiceassistants.playermodels.CommandPlayResponse;
import com.spotify.voiceassistants.playermodels.SearchEndpointRequest;
import com.spotify.voiceassistants.playermodels.SearchEndpointResponse;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH'¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lp/qna1;", "", "Lcom/spotify/voiceassistants/playermodels/SearchEndpointRequest;", "request", "Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/voiceassistants/playermodels/SearchEndpointResponse;", "b", "(Lcom/spotify/voiceassistants/playermodels/SearchEndpointRequest;)Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/voiceassistants/playermodels/CommandPlayRequest;", "Lcom/spotify/voiceassistants/playermodels/CommandPlayResponse;", "a", "(Lcom/spotify/voiceassistants/playermodels/CommandPlayRequest;)Lio/reactivex/rxjava3/core/Single;", "src_main_java_com_spotify_voiceassistants_speakeasyendpoints-speakeasyendpoints"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public interface qna1 {
    @wyq0("speakeasy/v2/command/play")
    Single<CommandPlayResponse> a(@elb CommandPlayRequest request);

    @wyq0("speakeasy/v2/search")
    Single<SearchEndpointResponse> b(@elb SearchEndpointRequest request);
}

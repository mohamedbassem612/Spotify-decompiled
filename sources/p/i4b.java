package p;

import com.spotify.socialprompting.v1.GeneratePromptedPlaylistRequest;
import com.spotify.socialprompting.v1.GeneratePromptedPlaylistResponse;
import com.spotify.socialprompting.v1.GetFilterPillsRequest;
import com.spotify.socialprompting.v1.GetFilterPillsResponse;
import com.spotify.socialprompting.v1.GetSuggestedPromptsRequest;
import com.spotify.socialprompting.v1.GetSuggestedPromptsResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u000bH§@¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lp/i4b;", "", "Lcom/spotify/socialprompting/v1/GeneratePromptedPlaylistRequest;", "request", "Lcom/spotify/socialprompting/v1/GeneratePromptedPlaylistResponse;", "b", "(Lcom/spotify/socialprompting/v1/GeneratePromptedPlaylistRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/socialprompting/v1/GetFilterPillsRequest;", "Lcom/spotify/socialprompting/v1/GetFilterPillsResponse;", "c", "(Lcom/spotify/socialprompting/v1/GetFilterPillsRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/socialprompting/v1/GetSuggestedPromptsRequest;", "Lcom/spotify/socialprompting/v1/GetSuggestedPromptsResponse;", "a", "(Lcom/spotify/socialprompting/v1/GetSuggestedPromptsRequest;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_blend_socialprompting_network-network"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface i4b {
    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("social-prompting/suggested-prompts")
    Object a(@elb GetSuggestedPromptsRequest getSuggestedPromptsRequest, lnm<? super GetSuggestedPromptsResponse> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("social-prompting/generate")
    Object b(@elb GeneratePromptedPlaylistRequest generatePromptedPlaylistRequest, lnm<? super GeneratePromptedPlaylistResponse> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("social-prompting/filter-pills")
    Object c(@elb GetFilterPillsRequest getFilterPillsRequest, lnm<? super GetFilterPillsResponse> lnmVar);
}

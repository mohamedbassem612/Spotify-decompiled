package p;

import com.spotify.aiplaylistcoverart.proto.AiPlaylistCoverArtProto;
import com.spotify.playlist4.proto.PlaylistSyncReasonProto;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lp/x13;", "", "Lcom/spotify/aiplaylistcoverart/proto/AiPlaylistCoverArtProto$GetPlaylistImageBackgroundRequest;", "getPlaylistImageBackgroundRequest", "Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/aiplaylistcoverart/proto/AiPlaylistCoverArtProto$GetPlaylistImageBackgroundResponse;", "a", "(Lcom/spotify/aiplaylistcoverart/proto/AiPlaylistCoverArtProto$GetPlaylistImageBackgroundRequest;)Lio/reactivex/rxjava3/core/Single;", "src_main_java_com_spotify_aiplaylist_networkimpl-networkimpl"}, k = 1, mv = {2, 3, 0}, xi = PlaylistSyncReasonProto.PlaylistSyncCaller.MULTIGET_ADDITIONAL_RESPONSE_VALUE)
public interface x13 {
    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf", "Content-Encoding: identity"})
    @wyq0("ai-playlist-cover-art/v1/get-playlist-image-background")
    Single<AiPlaylistCoverArtProto.GetPlaylistImageBackgroundResponse> a(@elb AiPlaylistCoverArtProto.GetPlaylistImageBackgroundRequest getPlaylistImageBackgroundRequest);
}

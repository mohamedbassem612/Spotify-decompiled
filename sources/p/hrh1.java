package p;

import com.spotify.playlist4.proto.Playlist4ApiProto;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J5\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006H'¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lp/hrh1;", "", "", "playlistId", "Lcom/spotify/playlist4/proto/Playlist4ApiProto$ListUpdateRequest;", "listUpdateRequest", "Lp/wf90;", "isRegional", "Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/playlist4/proto/Playlist4ApiProto$SelectedListContent;", "a", "(Ljava/lang/String;Lcom/spotify/playlist4/proto/Playlist4ApiProto$ListUpdateRequest;Lp/wf90;)Lio/reactivex/rxjava3/core/Single;", "src_main_java_com_spotify_aiplaylist_playlist4serviceimpl-playlist4serviceimpl"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface hrh1 {
    static /* synthetic */ Single b(hrh1 hrh1Var, String str, Playlist4ApiProto.ListUpdateRequest listUpdateRequest, wf90 wf90Var, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: updateListItems");
            return null;
        }
        if ((i & 4) != 0) {
            wf90Var = null;
        }
        return hrh1Var.a(str, listUpdateRequest, wf90Var);
    }

    @yyq0("playlist/v2/playlist/{playlist_id}/items")
    @u360({"Content-Type: application/protobuf", "Accept: application/protobuf", "Content-Encoding: identity"})
    Single<Playlist4ApiProto.SelectedListContent> a(@t8s0("playlist_id") String playlistId, @elb Playlist4ApiProto.ListUpdateRequest listUpdateRequest, @rod1 wf90 isRegional);
}

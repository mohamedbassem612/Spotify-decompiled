package p;

import com.spotify.playlistartwork.setpictureimpl.proto.RegisterPlaylistImageRequest;
import com.spotify.playlistartwork.setpictureimpl.proto.RegisterPlaylistImageResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lp/zmu0;", "", "", "playlistId", "Lcom/spotify/playlistartwork/setpictureimpl/proto/RegisterPlaylistImageRequest;", "registerPlaylistImageRequest", "Lcom/spotify/playlistartwork/setpictureimpl/proto/RegisterPlaylistImageResponse;", "a", "(Ljava/lang/String;Lcom/spotify/playlistartwork/setpictureimpl/proto/RegisterPlaylistImageRequest;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_playlistartwork_setpictureimpl-setpictureimpl"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface zmu0 {
    @u360({"content-type: application/protobuf", "accept: application/protobuf"})
    @wyq0("playlist/v2/playlist/{playlist-id}/register-image")
    Object a(@t8s0("playlist-id") String str, @elb RegisterPlaylistImageRequest registerPlaylistImageRequest, lnm<? super RegisterPlaylistImageResponse> lnmVar);
}

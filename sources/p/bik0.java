package p;

import com.spotify.playlist4.proto.PlaylistSyncReasonProto;
import com.spotify.playlistmixing.proto.HarmonizeRequestBody;
import com.spotify.playlistmixing.proto.HarmonizeResponseBody;
import com.spotify.playlistmixing.proto.HarmonizeSaveRequestBody;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lp/bik0;", "", "Lcom/spotify/playlistmixing/proto/HarmonizeRequestBody;", "request", "Lp/sy21;", "Lcom/spotify/playlistmixing/proto/HarmonizeResponseBody;", "a", "(Lcom/spotify/playlistmixing/proto/HarmonizeRequestBody;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/playlistmixing/proto/HarmonizeSaveRequestBody;", "b", "(Lcom/spotify/playlistmixing/proto/HarmonizeSaveRequestBody;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_playlistmixing_endpoints-endpoints"}, k = 1, mv = {2, 3, 0}, xi = PlaylistSyncReasonProto.PlaylistSyncCaller.MULTIGET_ADDITIONAL_RESPONSE_VALUE)
public interface bik0 {
    @u360({"Content-Type: application/protobuf", "Accept: application/protobuf"})
    @wyq0("list-harmonizer/v1/harmonize")
    Object a(@elb HarmonizeRequestBody harmonizeRequestBody, lnm<? super sy21<HarmonizeResponseBody>> lnmVar);

    @u360({"Content-Type: application/protobuf", "Accept: application/protobuf"})
    @wyq0("list-harmonizer/v1/harmonize/save")
    Object b(@elb HarmonizeSaveRequestBody harmonizeSaveRequestBody, lnm<? super sy21<HarmonizeResponseBody>> lnmVar);
}

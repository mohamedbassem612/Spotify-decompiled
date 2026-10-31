package p;

import com.spotify.liveroom.listeningpartyvotingcardimpl.proto.GetVotingWidgetResponse;
import com.spotify.liveroom.listeningpartyvotingcardimpl.proto.SendVotesRequestV2;
import com.spotify.playlist4.proto.PlaylistSyncReasonProto;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J.\u0010\u000b\u001a\u00020\u00012\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lp/qvk1;", "", "", "rootUri", "Lcom/spotify/liveroom/listeningpartyvotingcardimpl/proto/GetVotingWidgetResponse;", "a", "(Ljava/lang/String;Lp/lnm;)Ljava/lang/Object;", "contestId", "awardId", "Lcom/spotify/liveroom/listeningpartyvotingcardimpl/proto/SendVotesRequestV2;", "request", "b", "(Ljava/lang/String;Ljava/lang/String;Lcom/spotify/liveroom/listeningpartyvotingcardimpl/proto/SendVotesRequestV2;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_liveroom_listeningpartyvotingcardimpl-listeningpartyvotingcardimpl"}, k = 1, mv = {2, 3, 0}, xi = PlaylistSyncReasonProto.PlaylistSyncCaller.MULTIGET_ADDITIONAL_RESPONSE_VALUE)
public interface qvk1 {
    @ay30("voting-service/voting/v2/widget/{root_uri}")
    @u360({"Accept: application/x-protobuf"})
    Object a(@t8s0("root_uri") String str, lnm<? super GetVotingWidgetResponse> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("voting-service/voting/v2/listening-parties/contests/{contest_id}/awards/{award_id}/votes")
    Object b(@t8s0("contest_id") String str, @t8s0("award_id") String str2, @elb SendVotesRequestV2 sendVotesRequestV2, lnm<Object> lnmVar);
}

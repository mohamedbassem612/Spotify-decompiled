package p;

import com.spotify.voting.proto.v1.GetVotingRootResponse;
import com.spotify.voting.proto.v2.GetVotingResultsPageResponse;
import com.spotify.voting.proto.v2.SendVotesRequestV2;
import com.spotify.voting.proto.v2.VotingSharePage;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\b\u0010\u0006J.\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0011\u0010\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"Lp/wyk1;", "Lp/jxk1;", "", "rootUri", "Lcom/spotify/voting/proto/v1/GetVotingRootResponse;", "c", "(Ljava/lang/String;Lp/lnm;)Ljava/lang/Object;", "", "a", "contestId", "awardId", "Lcom/spotify/voting/proto/v2/SendVotesRequestV2;", "request", "Lcom/spotify/voting/proto/v2/VotingSharePage;", "b", "(Ljava/lang/String;Ljava/lang/String;Lcom/spotify/voting/proto/v2/SendVotesRequestV2;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/voting/proto/v2/GetVotingResultsPageResponse;", "d", "(Ljava/lang/String;Ljava/lang/String;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_voting_service-service"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface wyk1 extends jxk1 {
    @ay30("voting-service/voting/v2/widget/{root_uri}")
    @u360({"Accept: application/x-protobuf"})
    Object a(@t8s0("root_uri") String str, lnm<Object> lnmVar);

    @Override // p.jxk1
    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("voting-service/voting/v2/contests/{contest_id}/awards/{award_id}/votes")
    Object b(@t8s0("contest_id") String str, @t8s0("award_id") String str2, @elb SendVotesRequestV2 sendVotesRequestV2, lnm<? super VotingSharePage> lnmVar);

    @Override // p.jxk1
    @ay30("voting-service/voting/v2/root/{root_uri}")
    @u360({"Accept: application/x-protobuf"})
    Object c(@t8s0("root_uri") String str, lnm<? super GetVotingRootResponse> lnmVar);

    @Override // p.jxk1
    @ay30("voting-service/voting/v2/contests/{contest_id}/awards/{award_id}/results")
    @u360({"Accept: application/x-protobuf"})
    Object d(@t8s0("contest_id") String str, @t8s0("award_id") String str2, lnm<? super GetVotingResultsPageResponse> lnmVar);
}

package p;

import com.spotify.voting.proto.v1.GetVotingRootResponse;
import com.spotify.voting.proto.v2.GetVotingResultsPageResponse;
import com.spotify.voting.proto.v2.SendVotesRequestV2;
import com.spotify.voting.proto.v2.VotingSharePage;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J.\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\tH¦@¢\u0006\u0004\b\f\u0010\rJ$\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u000f\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Lp/jxk1;", "", "", "rootUri", "Lcom/spotify/voting/proto/v1/GetVotingRootResponse;", "c", "(Ljava/lang/String;Lp/lnm;)Ljava/lang/Object;", "contestId", "awardId", "Lcom/spotify/voting/proto/v2/SendVotesRequestV2;", "request", "Lcom/spotify/voting/proto/v2/VotingSharePage;", "b", "(Ljava/lang/String;Ljava/lang/String;Lcom/spotify/voting/proto/v2/SendVotesRequestV2;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/voting/proto/v2/GetVotingResultsPageResponse;", "d", "(Ljava/lang/String;Ljava/lang/String;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_voting_service-service"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface jxk1 {
    Object b(@t8s0("contest_id") String str, @t8s0("award_id") String str2, @elb SendVotesRequestV2 sendVotesRequestV2, lnm<? super VotingSharePage> lnmVar);

    Object c(@t8s0("root_uri") String str, lnm<? super GetVotingRootResponse> lnmVar);

    Object d(@t8s0("contest_id") String str, @t8s0("award_id") String str2, lnm<? super GetVotingResultsPageResponse> lnmVar);
}

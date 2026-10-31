package p;

import com.spotify.messages.BetamaxPlaybackSession;
import com.spotify.musicquizservice.v1.GetOrCreateChallengeRequest;
import com.spotify.musicquizservice.v1.GetOrCreateChallengeResponse;
import com.spotify.musicquizservice.v1.GetShareCardForQuizRequest;
import com.spotify.musicquizservice.v1.GetShareCardForQuizResponse;
import com.spotify.musicquizservice.v1.ListChallengeTargetsRequest;
import com.spotify.musicquizservice.v1.ListChallengeTargetsResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lp/lce;", "", "Lcom/spotify/musicquizservice/v1/GetOrCreateChallengeRequest;", "request", "Lp/sy21;", "Lcom/spotify/musicquizservice/v1/GetOrCreateChallengeResponse;", "b", "(Lcom/spotify/musicquizservice/v1/GetOrCreateChallengeRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/musicquizservice/v1/ListChallengeTargetsRequest;", "Lcom/spotify/musicquizservice/v1/ListChallengeTargetsResponse;", "c", "(Lcom/spotify/musicquizservice/v1/ListChallengeTargetsRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/musicquizservice/v1/GetShareCardForQuizRequest;", "Lcom/spotify/musicquizservice/v1/GetShareCardForQuizResponse;", "a", "(Lcom/spotify/musicquizservice/v1/GetShareCardForQuizRequest;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_musicquiz_network_challenge-challenge"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public interface lce {
    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("music-quiz-service/com.spotify.musicquizservice.v1.ChallengeService/GetShareCardForQuiz")
    Object a(@elb GetShareCardForQuizRequest getShareCardForQuizRequest, lnm<? super sy21<GetShareCardForQuizResponse>> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("music-quiz-service/com.spotify.musicquizservice.v1.ChallengeService/GetOrCreateChallenge")
    Object b(@elb GetOrCreateChallengeRequest getOrCreateChallengeRequest, lnm<? super sy21<GetOrCreateChallengeResponse>> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("music-quiz-service/com.spotify.musicquizservice.v1.ChallengeService/ListChallengeTargets")
    Object c(@elb ListChallengeTargetsRequest listChallengeTargetsRequest, lnm<? super sy21<ListChallengeTargetsResponse>> lnmVar);
}

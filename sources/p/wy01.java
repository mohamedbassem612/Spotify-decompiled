package p;

import com.spotify.messages.BetamaxPlaybackSession;
import com.spotify.quizrecommendationservice.v1.GetRecommendedQuizzesRequest;
import com.spotify.quizrecommendationservice.v1.GetRecommendedQuizzesResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lp/wy01;", "", "Lcom/spotify/quizrecommendationservice/v1/GetRecommendedQuizzesRequest;", "request", "Lp/sy21;", "Lcom/spotify/quizrecommendationservice/v1/GetRecommendedQuizzesResponse;", "a", "(Lcom/spotify/quizrecommendationservice/v1/GetRecommendedQuizzesRequest;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_musicquiz_network_recommendation-recommendation"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public interface wy01 {
    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("quiz-personalization-service/com.spotify.quizrecommendationservice.v1.QuizRecommendationService/GetRecommendedQuizzes")
    Object a(@elb GetRecommendedQuizzesRequest getRecommendedQuizzesRequest, lnm<? super sy21<GetRecommendedQuizzesResponse>> lnmVar);
}

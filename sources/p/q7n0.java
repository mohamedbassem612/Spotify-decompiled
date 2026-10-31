package p;

import com.spotify.messages.BetamaxPlaybackSession;
import com.spotify.musicquizservice.v1.CompleteQuizRequest;
import com.spotify.musicquizservice.v1.CompleteQuizResponse;
import com.spotify.musicquizservice.v1.GetQuizMetadataRequest;
import com.spotify.musicquizservice.v1.GetQuizMetadataResponse;
import com.spotify.musicquizservice.v1.GetRoundRequest;
import com.spotify.musicquizservice.v1.GetRoundResponse;
import com.spotify.musicquizservice.v1.RateQuestionRequest;
import com.spotify.musicquizservice.v1.RateQuestionResponse;
import com.spotify.musicquizservice.v1.ReportAnswersRequest;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\nJ \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u000bH§@¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0013H§@¢\u0006\u0004\b\u0015\u0010\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, d2 = {"Lp/q7n0;", "", "Lcom/spotify/musicquizservice/v1/ReportAnswersRequest;", "request", "Lp/sy21;", "b", "(Lcom/spotify/musicquizservice/v1/ReportAnswersRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/musicquizservice/v1/GetQuizMetadataRequest;", "Lcom/spotify/musicquizservice/v1/GetQuizMetadataResponse;", "a", "(Lcom/spotify/musicquizservice/v1/GetQuizMetadataRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/musicquizservice/v1/GetRoundRequest;", "Lcom/spotify/musicquizservice/v1/GetRoundResponse;", "d", "(Lcom/spotify/musicquizservice/v1/GetRoundRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/musicquizservice/v1/RateQuestionRequest;", "Lcom/spotify/musicquizservice/v1/RateQuestionResponse;", "e", "(Lcom/spotify/musicquizservice/v1/RateQuestionRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/musicquizservice/v1/CompleteQuizRequest;", "Lcom/spotify/musicquizservice/v1/CompleteQuizResponse;", "c", "(Lcom/spotify/musicquizservice/v1/CompleteQuizRequest;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_musicquiz_network_quiz-quiz"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public interface q7n0 {
    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("music-quiz-service/com.spotify.musicquizservice.v1.MusicQuizService/GetQuizMetadata")
    Object a(@elb GetQuizMetadataRequest getQuizMetadataRequest, lnm<? super sy21<GetQuizMetadataResponse>> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("music-quiz-service/com.spotify.musicquizservice.v1.MusicQuizService/ReportAnswers")
    Object b(@elb ReportAnswersRequest reportAnswersRequest, lnm<? super sy21<Object>> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf", "Content-Encoding: identity"})
    @wyq0("music-quiz-service/com.spotify.musicquizservice.v1.MusicQuizService/CompleteQuiz")
    Object c(@elb CompleteQuizRequest completeQuizRequest, lnm<? super sy21<CompleteQuizResponse>> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("music-quiz-service/com.spotify.musicquizservice.v1.MusicQuizService/GetRound")
    Object d(@elb GetRoundRequest getRoundRequest, lnm<? super sy21<GetRoundResponse>> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("music-quiz-service/com.spotify.musicquizservice.v1.MusicQuizService/RateQuestion")
    Object e(@elb RateQuestionRequest rateQuestionRequest, lnm<? super sy21<RateQuestionResponse>> lnmVar);
}

package p;

import com.spotify.musicquizservice.v1.GetLocalizedStringsRequest;
import com.spotify.musicquizservice.v1.GetLocalizedStringsResponse;
import com.spotify.musicquizservice.v1.GetOnboardingCarouselRequest;
import com.spotify.musicquizservice.v1.GetOnboardingCarouselResponse;
import com.spotify.musicquizservice.v1.GetQuizColorsRequest;
import com.spotify.musicquizservice.v1.GetQuizColorsResponse;
import com.spotify.musicquizservice.v1.GetSoundEffectsRequest;
import com.spotify.musicquizservice.v1.GetSoundEffectsResponse;
import com.spotify.stream_reporting_esperanto.proto.StreamStartRequestOuterClass$StreamStartRequest;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0012\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Lp/p7n0;", "", "Lcom/spotify/musicquizservice/v1/GetSoundEffectsRequest;", "request", "Lp/sy21;", "Lcom/spotify/musicquizservice/v1/GetSoundEffectsResponse;", "d", "(Lcom/spotify/musicquizservice/v1/GetSoundEffectsRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/musicquizservice/v1/GetQuizColorsRequest;", "Lcom/spotify/musicquizservice/v1/GetQuizColorsResponse;", "c", "(Lcom/spotify/musicquizservice/v1/GetQuizColorsRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/musicquizservice/v1/GetOnboardingCarouselRequest;", "Lcom/spotify/musicquizservice/v1/GetOnboardingCarouselResponse;", "a", "(Lcom/spotify/musicquizservice/v1/GetOnboardingCarouselRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/musicquizservice/v1/GetLocalizedStringsRequest;", "Lcom/spotify/musicquizservice/v1/GetLocalizedStringsResponse;", "b", "(Lcom/spotify/musicquizservice/v1/GetLocalizedStringsRequest;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_musicquiz_network_quizui-quizui"}, k = 1, mv = {2, 3, 0}, xi = StreamStartRequestOuterClass$StreamStartRequest.PREVIEW_IMPRESSION_URI_FIELD_NUMBER)
public interface p7n0 {
    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("music-quiz-service/com.spotify.musicquizservice.v1.QuizUiService/GetOnboardingCarousel")
    Object a(@elb GetOnboardingCarouselRequest getOnboardingCarouselRequest, lnm<? super sy21<GetOnboardingCarouselResponse>> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("music-quiz-service/com.spotify.musicquizservice.v1.QuizUiService/GetLocalizedStrings")
    Object b(@elb GetLocalizedStringsRequest getLocalizedStringsRequest, lnm<? super sy21<GetLocalizedStringsResponse>> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("music-quiz-service/com.spotify.musicquizservice.v1.QuizUiService/GetQuizColors")
    Object c(@elb GetQuizColorsRequest getQuizColorsRequest, lnm<? super sy21<GetQuizColorsResponse>> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("music-quiz-service/com.spotify.musicquizservice.v1.QuizUiService/GetSoundEffects")
    Object d(@elb GetSoundEffectsRequest getSoundEffectsRequest, lnm<? super sy21<GetSoundEffectsResponse>> lnmVar);
}

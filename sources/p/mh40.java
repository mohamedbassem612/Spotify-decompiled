package p;

import com.spotify.personalizedepisodes.contentservice.v1.ConfirmGenerationRequest;
import com.spotify.personalizedepisodes.contentservice.v1.ConfirmGenerationResponse;
import com.spotify.personalizedepisodes.contentservice.v1.CreateGenerationRequest;
import com.spotify.personalizedepisodes.contentservice.v1.CreateGenerationResponse;
import com.spotify.personalizedepisodes.contentservice.v1.CreateOrUpdatePendingShowRequest;
import com.spotify.personalizedepisodes.contentservice.v1.CreateOrUpdatePendingShowResponse;
import com.spotify.personalizedepisodes.contentservice.v1.ListEpisodeStatusResponse;
import com.spotify.personalizedepisodes.contentservice.v1.ListShowStatusResponse;
import com.spotify.personalizedepisodes.contentservice.v1.ValidateStepAnswerRequest;
import com.spotify.personalizedepisodes.contentservice.v1.ValidateStepAnswerResponse;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0012\u0010\u0013J2\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00042\u000e\b\u0001\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0015H§@¢\u0006\u0004\b\u0019\u0010\u001aJ,\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00042\b\b\u0001\u0010\u001b\u001a\u00020\u00152\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0015H§@¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010 \u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0001\u0010\u001f\u001a\u00020\u0015H§@¢\u0006\u0004\b \u0010!ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\"À\u0006\u0001"}, d2 = {"Lp/mh40;", "", "Lcom/spotify/personalizedepisodes/contentservice/v1/CreateGenerationRequest;", "request", "Lp/sy21;", "Lcom/spotify/personalizedepisodes/contentservice/v1/CreateGenerationResponse;", "a", "(Lcom/spotify/personalizedepisodes/contentservice/v1/CreateGenerationRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/personalizedepisodes/contentservice/v1/ValidateStepAnswerRequest;", "Lcom/spotify/personalizedepisodes/contentservice/v1/ValidateStepAnswerResponse;", "b", "(Lcom/spotify/personalizedepisodes/contentservice/v1/ValidateStepAnswerRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/personalizedepisodes/contentservice/v1/ConfirmGenerationRequest;", "Lcom/spotify/personalizedepisodes/contentservice/v1/ConfirmGenerationResponse;", "d", "(Lcom/spotify/personalizedepisodes/contentservice/v1/ConfirmGenerationRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/personalizedepisodes/contentservice/v1/CreateOrUpdatePendingShowRequest;", "Lcom/spotify/personalizedepisodes/contentservice/v1/CreateOrUpdatePendingShowResponse;", "c", "(Lcom/spotify/personalizedepisodes/contentservice/v1/CreateOrUpdatePendingShowRequest;Lp/lnm;)Ljava/lang/Object;", "", "", "filterBy", "since", "Lcom/spotify/personalizedepisodes/contentservice/v1/ListShowStatusResponse;", "f", "(Ljava/util/List;Ljava/lang/String;Lp/lnm;)Ljava/lang/Object;", "showUri", "Lcom/spotify/personalizedepisodes/contentservice/v1/ListEpisodeStatusResponse;", "g", "(Ljava/lang/String;Ljava/lang/String;Lp/lnm;)Ljava/lang/Object;", "generationId", "e", "(Ljava/lang/String;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_bluejay_data_impl-generation_data_module"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface mh40 {
    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("personalized-episodes/v1/content/generations")
    Object a(@elb CreateGenerationRequest createGenerationRequest, lnm<? super sy21<CreateGenerationResponse>> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("personalized-episodes/v1/content/validate-step-answer")
    Object b(@elb ValidateStepAnswerRequest validateStepAnswerRequest, lnm<? super sy21<ValidateStepAnswerResponse>> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("personalized-episodes/v1/content/generations/show")
    Object c(@elb CreateOrUpdatePendingShowRequest createOrUpdatePendingShowRequest, lnm<? super sy21<CreateOrUpdatePendingShowResponse>> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("personalized-episodes/v1/content/generations/confirm")
    Object d(@elb ConfirmGenerationRequest confirmGenerationRequest, lnm<? super sy21<ConfirmGenerationResponse>> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("personalized-episodes/v1/content/generations/{generation_id}/recreate")
    Object e(@t8s0("generation_id") String str, lnm<? super sy21<Object>> lnmVar);

    @ay30("personalized-episodes/v1/content/status")
    @u360({"Accept: application/x-protobuf"})
    Object f(@u0z0("filter_by") List<String> list, @u0z0("since") String str, lnm<? super sy21<ListShowStatusResponse>> lnmVar);

    @ay30("personalized-episodes/v1/content/status/{show_uri}")
    @u360({"Accept: application/x-protobuf"})
    Object g(@t8s0(encoded = true, value = "show_uri") String str, @u0z0("since") String str2, lnm<? super sy21<ListEpisodeStatusResponse>> lnmVar);
}

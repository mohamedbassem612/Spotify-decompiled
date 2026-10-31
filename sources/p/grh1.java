package p;

import com.spotify.personalizedepisodes.contentservice.v1.CreateOrUpdateScheduleRequest;
import com.spotify.personalizedepisodes.contentservice.v1.CreateOrUpdateScheduleResponse;
import com.spotify.personalizedepisodes.contentservice.v1.GetEntityDetailsResponse;
import com.spotify.personalizedepisodes.contentservice.v1.TriggerGenerationRequest;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\t\u0010\nJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lp/grh1;", "", "Lcom/spotify/personalizedepisodes/contentservice/v1/CreateOrUpdateScheduleRequest;", "request", "Lp/sy21;", "Lcom/spotify/personalizedepisodes/contentservice/v1/CreateOrUpdateScheduleResponse;", "b", "(Lcom/spotify/personalizedepisodes/contentservice/v1/CreateOrUpdateScheduleRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/personalizedepisodes/contentservice/v1/TriggerGenerationRequest;", "c", "(Lcom/spotify/personalizedepisodes/contentservice/v1/TriggerGenerationRequest;Lp/lnm;)Ljava/lang/Object;", "", "entityUri", "Lcom/spotify/personalizedepisodes/contentservice/v1/GetEntityDetailsResponse;", "a", "(Ljava/lang/String;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_bluejay_data_impl-generation_data_module"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface grh1 {
    @ay30("personalized-episodes/v1/entity/{entity_uri}")
    @u360({"Accept: application/x-protobuf"})
    Object a(@t8s0(encoded = true, value = "entity_uri") String str, lnm<? super sy21<GetEntityDetailsResponse>> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("personalized-episodes/v1/schedule")
    Object b(@elb CreateOrUpdateScheduleRequest createOrUpdateScheduleRequest, lnm<? super sy21<CreateOrUpdateScheduleResponse>> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("personalized-episodes/v1/content/trigger-generation")
    Object c(@elb TriggerGenerationRequest triggerGenerationRequest, lnm<? super sy21<Object>> lnmVar);
}

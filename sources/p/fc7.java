package p;

import com.spotify.assistedcuration.v1.RecommendationsProto$CurationRecommendationsRequest;
import com.spotify.assistedcuration.v1.RecommendationsProto$ItemSpecificRecommendationsRequest;
import com.spotify.assistedcuration.v1.RecommendationsProto$RecommendationUrisResponse;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lp/fc7;", "", "Lcom/spotify/assistedcuration/v1/RecommendationsProto$CurationRecommendationsRequest;", "curationRecommendationsRequest", "Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/assistedcuration/v1/RecommendationsProto$RecommendationUrisResponse;", "a", "(Lcom/spotify/assistedcuration/v1/RecommendationsProto$CurationRecommendationsRequest;)Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/assistedcuration/v1/RecommendationsProto$ItemSpecificRecommendationsRequest;", "itemSpecificRecommendationsRequest", "b", "(Lcom/spotify/assistedcuration/v1/RecommendationsProto$ItemSpecificRecommendationsRequest;)Lio/reactivex/rxjava3/core/Single;", "src_main_java_com_spotify_assistedcuration_endpointsimpl-endpointsimpl"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface fc7 {
    @wyq0("assisted-curation/v1/recommendations/curation/uri")
    Single<RecommendationsProto$RecommendationUrisResponse> a(@elb RecommendationsProto$CurationRecommendationsRequest curationRecommendationsRequest);

    @wyq0("assisted-curation/v1/recommendations/item/uri")
    Single<RecommendationsProto$RecommendationUrisResponse> b(@elb RecommendationsProto$ItemSpecificRecommendationsRequest itemSpecificRecommendationsRequest);
}

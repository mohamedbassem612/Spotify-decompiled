package p;

import com.spotify.unboxinghub.api.v1.proto.GetMainHubPageRequest;
import com.spotify.unboxinghub.api.v1.proto.GetMainHubPageResponse;
import com.spotify.unboxinghub.api.v1.proto.UnboxFeatureRequest;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lp/sgh1;", "", "Lcom/spotify/unboxinghub/api/v1/proto/GetMainHubPageRequest;", "request", "Lcom/spotify/unboxinghub/api/v1/proto/GetMainHubPageResponse;", "b", "(Lcom/spotify/unboxinghub/api/v1/proto/GetMainHubPageRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/unboxinghub/api/v1/proto/UnboxFeatureRequest;", "Lp/rih1;", "a", "(Lcom/spotify/unboxinghub/api/v1/proto/UnboxFeatureRequest;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_unboxing_endpoints-endpoints"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface sgh1 {
    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("/spotify.unboxinghub.api.v1.UnboxingService/UnboxFeature")
    Object a(@elb UnboxFeatureRequest unboxFeatureRequest, lnm<? super rih1> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("/spotify.unboxinghub.api.v1.UnboxingService/GetMainHubPage")
    Object b(@elb GetMainHubPageRequest getMainHubPageRequest, lnm<? super GetMainHubPageResponse> lnmVar);
}

package p;

import com.spotify.clientrestrictions.v1.RestrictedIntegrationsRequest;
import com.spotify.clientrestrictions.v1.RestrictedIntegrationsResponse;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lp/ijg;", "", "Lcom/spotify/clientrestrictions/v1/RestrictedIntegrationsRequest;", "body", "Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/clientrestrictions/v1/RestrictedIntegrationsResponse;", "a", "(Lcom/spotify/clientrestrictions/v1/RestrictedIntegrationsRequest;)Lio/reactivex/rxjava3/core/Single;", "src_main_java_com_spotify_externalintegration_contentfiltering-contentfiltering"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public interface ijg {
    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("spotify.clientrestrictions.v1.ClientRestrictionsService/GetRestrictedIntegrations")
    Single<RestrictedIntegrationsResponse> a(@elb RestrictedIntegrationsRequest body);
}

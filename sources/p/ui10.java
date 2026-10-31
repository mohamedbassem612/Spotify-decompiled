package p;

import com.spotify.familygatedcontent.v1.GetFeatureRequestDialogRequest;
import com.spotify.familygatedcontent.v1.GetFeatureRequestDialogResponse;
import com.spotify.familygatedcontent.v1.RequestFeatureRequest;
import com.spotify.familygatedcontent.v1.RequestFeatureResponse;
import com.spotify.playlist4.proto.PlaylistSyncReasonProto;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH'¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lp/ui10;", "", "Lcom/spotify/familygatedcontent/v1/GetFeatureRequestDialogRequest;", "request", "Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/familygatedcontent/v1/GetFeatureRequestDialogResponse;", "b", "(Lcom/spotify/familygatedcontent/v1/GetFeatureRequestDialogRequest;)Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/familygatedcontent/v1/RequestFeatureRequest;", "Lcom/spotify/familygatedcontent/v1/RequestFeatureResponse;", "a", "(Lcom/spotify/familygatedcontent/v1/RequestFeatureRequest;)Lio/reactivex/rxjava3/core/Single;", "src_main_java_com_spotify_premiumaccountmanagement_familygatedcontentimpl-familygatedcontentimpl"}, k = 1, mv = {2, 3, 0}, xi = PlaylistSyncReasonProto.PlaylistSyncCaller.MULTIGET_ADDITIONAL_RESPONSE_VALUE)
public interface ui10 {
    @u360({"Content-Type: application/x-protobuf", "Accept: application/protobuf"})
    @wyq0("spotify.familygatedcontent.v1.FeatureRequestService/RequestFeature")
    Single<RequestFeatureResponse> a(@elb RequestFeatureRequest request);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/protobuf"})
    @wyq0("spotify.familygatedcontent.v1.FeatureRequestViewService/GetFeatureRequestDialog")
    Single<GetFeatureRequestDialogResponse> b(@elb GetFeatureRequestDialogRequest request);
}

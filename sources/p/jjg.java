package p;

import com.spotify.pendragon.v1.proto.FetchMessageForPreviewRequest;
import com.spotify.pendragon.v1.proto.FetchMessageListRequest;
import com.spotify.pendragon.v1.proto.FetchMessageListResponse;
import com.spotify.pendragon.v1.proto.FetchMessageRequest;
import com.spotify.pendragon.v1.proto.FetchMessageResponse;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH'¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0001\u0010\u0003\u001a\u00020\fH'¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lp/jjg;", "", "Lcom/spotify/pendragon/v1/proto/FetchMessageListRequest;", "request", "Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/pendragon/v1/proto/FetchMessageListResponse;", "a", "(Lcom/spotify/pendragon/v1/proto/FetchMessageListRequest;)Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/pendragon/v1/proto/FetchMessageRequest;", "Lcom/spotify/pendragon/v1/proto/FetchMessageResponse;", "b", "(Lcom/spotify/pendragon/v1/proto/FetchMessageRequest;)Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/pendragon/v1/proto/FetchMessageForPreviewRequest;", "c", "(Lcom/spotify/pendragon/v1/proto/FetchMessageForPreviewRequest;)Lio/reactivex/rxjava3/core/Single;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public interface jjg {
    @u360({"Accept: application/x-protobuf", "Content-Type: application/x-protobuf"})
    @wyq0("pendragon/com.spotify.pendragon.v1.ClientMessageService/FetchMessageList")
    Single<FetchMessageListResponse> a(@elb FetchMessageListRequest request);

    @u360({"Accept: application/x-protobuf", "Content-Type: application/x-protobuf"})
    @wyq0("pendragon/com.spotify.pendragon.v1.ClientMessageService/FetchMessage")
    Single<FetchMessageResponse> b(@elb FetchMessageRequest request);

    @u360({"Accept: application/x-protobuf", "Content-Type: application/x-protobuf"})
    @wyq0("pendragon/com.spotify.pendragon.v1.ClientMessageService/FetchMessageForPreview")
    Single<Object> c(@elb FetchMessageForPreviewRequest request);
}

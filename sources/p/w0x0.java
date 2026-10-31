package p;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.profileconfig.proto.v1.DismissProfileCompletionRequest;
import com.spotify.profileconfig.proto.v1.ProfileCompletionRequest;
import com.spotify.profileconfig.proto.v1.ProfileCompletionResponse;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\tH'¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lp/w0x0;", "", "Lcom/spotify/profileconfig/proto/v1/ProfileCompletionRequest;", "request", "Lio/reactivex/rxjava3/core/Single;", "Lp/sy21;", "Lcom/spotify/profileconfig/proto/v1/ProfileCompletionResponse;", "b", "(Lcom/spotify/profileconfig/proto/v1/ProfileCompletionRequest;)Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/profileconfig/proto/v1/DismissProfileCompletionRequest;", "Ljava/lang/Void;", "a", "(Lcom/spotify/profileconfig/proto/v1/DismissProfileCompletionRequest;)Lio/reactivex/rxjava3/core/Single;", "src_main_java_com_spotify_profile_completionsheetimpl-completionsheetimpl"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public interface w0x0 {
    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("profile-config/v1/dismiss-profile-completion")
    Single<sy21<Void>> a(@elb DismissProfileCompletionRequest request);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("profile-config/v1/show-profile-completion")
    Single<sy21<ProfileCompletionResponse>> b(@elb ProfileCompletionRequest request);
}

package p;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.profileprivacy.proto.v1.GetProfilePrivacyRequest;
import com.spotify.profileprivacy.proto.v1.GetProfilePrivacyResponse;
import com.spotify.profileprivacy.proto.v1.SetProfilePrivacyRequest;
import com.spotify.profileprivacy.proto.v1.SetProfilePrivacyResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lp/fdx0;", "", "Lcom/spotify/profileprivacy/proto/v1/GetProfilePrivacyRequest;", "body", "Lp/sy21;", "Lcom/spotify/profileprivacy/proto/v1/GetProfilePrivacyResponse;", "b", "(Lcom/spotify/profileprivacy/proto/v1/GetProfilePrivacyRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/profileprivacy/proto/v1/SetProfilePrivacyRequest;", "Lcom/spotify/profileprivacy/proto/v1/SetProfilePrivacyResponse;", "a", "(Lcom/spotify/profileprivacy/proto/v1/SetProfilePrivacyRequest;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_profile_privacy-privacy"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public interface fdx0 {
    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("/profile-privacy/v2/store-settings")
    Object a(@elb SetProfilePrivacyRequest setProfilePrivacyRequest, lnm<? super sy21<SetProfilePrivacyResponse>> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("/profile-privacy/v2/read-settings")
    Object b(@elb GetProfilePrivacyRequest getProfilePrivacyRequest, lnm<? super sy21<GetProfilePrivacyResponse>> lnmVar);
}

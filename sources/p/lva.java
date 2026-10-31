package p;

import com.spotify.messages.BetamaxPlaybackSession;
import com.spotify.profile.editprofile.proto.UserprofileviewV4;
import com.spotify.profile.editprofile.proto.UserprofileviewV4$GetBioAudienceRequest;
import com.spotify.profile.editprofile.proto.UserprofileviewV4$UpdateBioResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\nJ \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u000bH§@¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0011\u0010\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"Lp/lva;", "", "Lcom/spotify/profile/editprofile/proto/UserprofileviewV4$GetBioRequest;", "request", "Lp/sy21;", "a", "(Lcom/spotify/profile/editprofile/proto/UserprofileviewV4$GetBioRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/profile/editprofile/proto/UserprofileviewV4$GetBioAudienceRequest;", "Lcom/spotify/profile/editprofile/proto/UserprofileviewV4$GetBioAudienceResponse;", "b", "(Lcom/spotify/profile/editprofile/proto/UserprofileviewV4$GetBioAudienceRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/profile/editprofile/proto/UserprofileviewV4$SetBioAudienceRequest;", "Lcom/spotify/profile/editprofile/proto/UserprofileviewV4$SetBioAudienceResponse;", "c", "(Lcom/spotify/profile/editprofile/proto/UserprofileviewV4$SetBioAudienceRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/profile/editprofile/proto/UserprofileviewV4$UpdateBioRequest;", "Lcom/spotify/profile/editprofile/proto/UserprofileviewV4$UpdateBioResponse;", "d", "(Lcom/spotify/profile/editprofile/proto/UserprofileviewV4$UpdateBioRequest;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_profile_editprofile_editprofile_biodatasource-biodatasource"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public interface lva {
    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("user-profile-view/spotify.userprofileview.v4.UserProfileViewService/GetBio")
    Object a(@elb UserprofileviewV4.GetBioRequest getBioRequest, lnm<? super sy21<Object>> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("user-profile-view/spotify.userprofileview.v4.UserProfileViewService/GetBioAudience")
    Object b(@elb UserprofileviewV4$GetBioAudienceRequest userprofileviewV4$GetBioAudienceRequest, lnm<? super sy21<UserprofileviewV4.GetBioAudienceResponse>> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("user-profile-view/spotify.userprofileview.v4.UserProfileViewService/SetBioAudience")
    Object c(@elb UserprofileviewV4.SetBioAudienceRequest setBioAudienceRequest, lnm<? super sy21<UserprofileviewV4.SetBioAudienceResponse>> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("user-profile-view/spotify.userprofileview.v4.UserProfileViewService/UpdateBio")
    Object d(@elb UserprofileviewV4.UpdateBioRequest updateBioRequest, lnm<? super sy21<UserprofileviewV4$UpdateBioResponse>> lnmVar);
}

package p;

import com.spotify.playlist4.proto.PlaylistSyncReasonProto;
import com.spotify.profile.profile.proto.ArtistlistResponse$ArtistList;
import com.spotify.profile.profile.proto.PlaylistlistResponse$PlaylistList;
import com.spotify.profile.profile.proto.ProfilelistResponse;
import com.spotify.profile.profile.proto.ProfilemodelRequest$Profile;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H'¢\u0006\u0004\b\t\u0010\nJ%\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u000e\u0010\rJ%\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0010\u0010\rJ%\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0012\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"Lp/afi1;", "", "", "username", "", "viewAsVisitor", "Lio/reactivex/rxjava3/core/Single;", "Lp/sy21;", "Lcom/spotify/profile/profile/proto/ProfilemodelRequest$Profile;", "e", "(Ljava/lang/String;Ljava/lang/Boolean;)Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/profile/profile/proto/ProfilelistResponse$SmallProfileList;", "d", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/Single;", "b", "Lcom/spotify/profile/profile/proto/ArtistlistResponse$ArtistList;", "c", "Lcom/spotify/profile/profile/proto/PlaylistlistResponse$PlaylistList;", "a", "src_main_java_com_spotify_profile_profile_userprofileview-userprofileview"}, k = 1, mv = {2, 3, 0}, xi = PlaylistSyncReasonProto.PlaylistSyncCaller.MULTIGET_ADDITIONAL_RESPONSE_VALUE)
public interface afi1 {
    @ay30("user-profile-view/v3/profile/{username}/playlists")
    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    Single<sy21<PlaylistlistResponse$PlaylistList>> a(@t8s0(encoded = true, value = "username") String username);

    @ay30("user-profile-view/v3/profile/{username}/following")
    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    Single<sy21<ProfilelistResponse.SmallProfileList>> b(@t8s0(encoded = true, value = "username") String username);

    @ay30("user-profile-view/v3/profile/{username}/artists")
    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    Single<sy21<ArtistlistResponse$ArtistList>> c(@t8s0(encoded = true, value = "username") String username);

    @ay30("user-profile-view/v3/profile/{username}/followers")
    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    Single<sy21<ProfilelistResponse.SmallProfileList>> d(@t8s0(encoded = true, value = "username") String username);

    @ay30("user-profile-view/v3/profile/{username}")
    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    Single<sy21<ProfilemodelRequest$Profile>> e(@t8s0(encoded = true, value = "username") String username, @u0z0("view_as_visitor") Boolean viewAsVisitor);
}

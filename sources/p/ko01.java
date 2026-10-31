package p;

import com.spotify.playlist4.proto.PlaylistSyncReasonProto;
import com.spotify.profile.mainprofilesections.artists.ArtistlistResponse$RecentlyPlayedArtistsList;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lp/ko01;", "", "", "username", "Lio/reactivex/rxjava3/core/Single;", "Lp/sy21;", "Lcom/spotify/profile/mainprofilesections/artists/ArtistlistResponse$RecentlyPlayedArtistsList;", "a", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/Single;", "src_main_java_com_spotify_profile_profilemainsections-profilemainsections"}, k = 1, mv = {2, 3, 0}, xi = PlaylistSyncReasonProto.PlaylistSyncCaller.MULTIGET_ADDITIONAL_RESPONSE_VALUE)
public interface ko01 {
    @ay30("user-profile-view/v3/profile/{username}/artists")
    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    Single<sy21<ArtistlistResponse$RecentlyPlayedArtistsList>> a(@t8s0(encoded = true, value = "username") String username);
}

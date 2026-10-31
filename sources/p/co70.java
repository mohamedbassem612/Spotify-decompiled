package p;

import com.spotify.identity.proto.v3.Identity;
import com.spotify.identity.proto.v3.Identity$KidProfileUpdateRequest;
import com.spotify.identity.proto.v3.Identity$SocialHandleRequest;
import com.spotify.identity.proto.v3.Identity$UserProfileUpdateRequest;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000f\u001a\u00020\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u0002H'¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0014\u001a\u00020\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0013H'¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0018\u001a\u00020\u00062\b\b\u0001\u0010\u0016\u001a\u00020\u00022\b\b\u0001\u0010\u0017\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u001aH'¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u001aH'¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u000bH'¢\u0006\u0004\b\u001f\u0010 ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006!À\u0006\u0001"}, d2 = {"Lp/co70;", "", "", "username", "Lio/reactivex/rxjava3/core/Single;", "Lp/sy21;", "Lcom/spotify/identity/proto/v3/Identity$UserProfile;", "h", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/identity/proto/v3/Identity$UserProfileUpdateRequest;", "body", "Lio/reactivex/rxjava3/core/Completable;", "i", "(Ljava/lang/String;Lcom/spotify/identity/proto/v3/Identity$UserProfileUpdateRequest;)Lio/reactivex/rxjava3/core/Completable;", "uploadToken", "d", "(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/Completable;", "e", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/Completable;", "Lcom/spotify/identity/proto/v3/Identity$KidProfileUpdateRequest;", "c", "(Ljava/lang/String;Lcom/spotify/identity/proto/v3/Identity$KidProfileUpdateRequest;)Lio/reactivex/rxjava3/core/Completable;", "accountId", "socialHandle", "b", "(Ljava/lang/String;Ljava/lang/String;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/identity/proto/v3/Identity$SocialHandleRequest;", "Lcom/spotify/identity/proto/v3/Identity$SocialHandleResponse;", "g", "(Ljava/lang/String;Lcom/spotify/identity/proto/v3/Identity$SocialHandleRequest;)Lio/reactivex/rxjava3/core/Single;", "a", "f", "()Lio/reactivex/rxjava3/core/Completable;", "src_main_java_com_spotify_profile_identity-identity"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public interface co70 {
    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("identity/v3/social-handle/{username}")
    Single<sy21<Identity.SocialHandleResponse>> a(@t8s0(encoded = true, value = "username") String username, @elb Identity$SocialHandleRequest body);

    @ay30("identity/v3/user/accountid/{accountId}/username/{socialHandle}")
    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    Object b(@t8s0(encoded = true, value = "accountId") String str, @t8s0(encoded = true, value = "socialHandle") String str2, lnm<? super Identity.UserProfile> lnmVar);

    @wyq0("identity/v3/kid/username/{username}")
    Completable c(@t8s0(encoded = true, value = "username") String username, @elb Identity$KidProfileUpdateRequest body);

    @wyq0("identity/v2/profile-image/{username}/{uploadToken}")
    Completable d(@t8s0(encoded = true, value = "username") String username, @t8s0("uploadToken") String uploadToken);

    @juo("identity/v2/profile-image/{username}")
    Completable e(@t8s0(encoded = true, value = "username") String username);

    @wyq0("identity/v3/social-handle/reset-rate-limit")
    Completable f();

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("identity/v3/social-handle/validate/{username}")
    Single<sy21<Identity.SocialHandleResponse>> g(@t8s0(encoded = true, value = "username") String username, @elb Identity$SocialHandleRequest body);

    @ay30("identity/v3/user/username/{username}")
    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    Single<sy21<Identity.UserProfile>> h(@t8s0(encoded = true, value = "username") String username);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("identity/v3/user/username/{username}")
    Completable i(@t8s0(encoded = true, value = "username") String username, @elb Identity$UserProfileUpdateRequest body);
}

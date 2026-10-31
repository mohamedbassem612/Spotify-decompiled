package p;

import com.spotify.identity.proto.v3.Identity;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes14.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lp/fo70;", "", "", "authorizationHeader", "username", "Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/identity/proto/v3/Identity$UserProfile;", "a", "(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/Single;", "src_main_java_com_spotify_accountswitching_switcherimpl-switcherimpl"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface fo70 {
    @ay30("/identity/v3/user/username/{username}")
    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    Single<Identity.UserProfile> a(@dv50("Authorization") String authorizationHeader, @t8s0("username") String username);
}

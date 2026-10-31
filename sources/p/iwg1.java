package p;

import com.spotify.campfire.trustedcircles.impl.proto.TrustedUsersResponse;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J4\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H§@¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lp/iwg1;", "", "", "username", "", "limit", "", "modifiers", "Lcom/spotify/campfire/trustedcircles/impl/proto/TrustedUsersResponse;", "a", "(Ljava/lang/String;ILjava/util/List;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_campfire_trustedcircles_impl-impl"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface iwg1 {
    @ay30("trusted-circles/v1/trusted-users/{username}")
    @u360({"Accept: application/protobuf"})
    Object a(@t8s0("username") String str, @u0z0("limit") int i, @u0z0("modifiers") List<String> list, lnm<? super TrustedUsersResponse> lnmVar);
}

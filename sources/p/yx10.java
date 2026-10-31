package p;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import io.reactivex.rxjava3.core.Completable;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J-\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\t\u001a\u00020\u00062\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lp/yx10;", "", "", "feature", "uri", "reason", "Lio/reactivex/rxjava3/core/Completable;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/Completable;", "d", "(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/Completable;", "src_main_java_com_spotify_home_common-common"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public interface yx10 {
    static /* synthetic */ Completable b(yx10 yx10Var, String str, String str2, String str3, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: sendDislike");
            return null;
        }
        if ((i & 1) != 0) {
            str = "home-promotion";
        }
        return yx10Var.a(str, str2, str3);
    }

    static /* synthetic */ Completable c(yx10 yx10Var, String str, String str2, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: sendNeutral");
            return null;
        }
        if ((i & 1) != 0) {
            str = "home-promotion";
        }
        return yx10Var.d(str, str2);
    }

    @wyq0("feedback/v1/feedback/{feature}/dislike")
    Completable a(@t8s0("feature") String feature, @u0z0("uri") String uri, @u0z0("reason") String reason);

    @juo("feedback/v1/feedback/{feature}")
    Completable d(@t8s0("feature") String feature, @u0z0("uri") String uri);
}

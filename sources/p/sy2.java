package p;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J+\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ5\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\t\u001a\u00020\u0002H'¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lp/sy2;", "", "", "clientContext", "externalAccessoryDescription", "Lio/reactivex/rxjava3/core/Single;", "Lp/teh1;", "a", "(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/Single;", "query", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/Single;", "src_main_java_com_spotify_externalintegration_http-http"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public interface sy2 {
    static /* synthetic */ Single b(sy2 sy2Var, String str, String str2, String str3, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: getUnauthenticatedSearch");
            return null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return sy2Var.d(str, str2, str3);
    }

    static /* synthetic */ Single c(sy2 sy2Var, String str, String str2, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: getUnauthenticatedExperiences");
            return null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return sy2Var.a(str, str2);
    }

    @ay30("{clientContext}/v1/unauthenticated-experiences/")
    Single<teh1> a(@t8s0(encoded = true, value = "clientContext") String clientContext, @dv50("x-external-accessory-description") String externalAccessoryDescription);

    @ay30("{clientContext}/v1/unauthenticated-search/")
    Single<teh1> d(@t8s0(encoded = true, value = "clientContext") String clientContext, @dv50("x-external-accessory-description") String externalAccessoryDescription, @u0z0("query") String query);
}

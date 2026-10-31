package p;

import android.os.Build;
import com.spotify.allboarding.model.v1.proto.MoreResponse;
import com.spotify.allboarding.model.v1.proto.OnboardingRequest;
import com.spotify.allboarding.model.v1.proto.SearchResponse;
import com.spotify.allboarding.model.v2.proto.OnboardingResponse;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001dJ[\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u00022\b\b\u0003\u0010\t\u001a\u00020\u0002H'¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u000e\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u000fH'¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\n2\b\b\u0001\u0010\u000e\u001a\u00020\u0002H'¢\u0006\u0004\b\u0014\u0010\u0015JI\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\n2\b\b\u0001\u0010\u000e\u001a\u00020\u00022\b\b\u0001\u0010\u0016\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0017\u001a\u00020\u00022\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0018H'¢\u0006\u0004\b\u001b\u0010\u001cø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001eÀ\u0006\u0001"}, d2 = {"Lp/qm3;", "", "", "path", "sessionId", "deeplink", "entryPoint", "manufacturer", "model", "platform", "Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/allboarding/model/v2/proto/OnboardingResponse;", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/Single;", "url", "Lcom/spotify/allboarding/model/v1/proto/OnboardingRequest;", "body", "c", "(Ljava/lang/String;Lcom/spotify/allboarding/model/v1/proto/OnboardingRequest;)Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/allboarding/model/v1/proto/MoreResponse;", "b", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/Single;", "query", "timestamp", "", "offset", "Lcom/spotify/allboarding/model/v1/proto/SearchResponse;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lio/reactivex/rxjava3/core/Single;", "p/pm3", "src_main_java_com_spotify_allboarding_allboardingdata-allboardingdata"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface qm3 {
    public static final pm3 a = pm3.a;
    public static final String b = "allboarding";

    static /* synthetic */ Single d(qm3 qm3Var, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: getAllboarding");
            return null;
        }
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 16) != 0) {
            str5 = Build.MANUFACTURER;
        }
        if ((i & 32) != 0) {
            str6 = Build.MODEL;
        }
        if ((i & 64) != 0) {
            str7 = "android";
        }
        String str8 = str7;
        return qm3Var.e(str, str2, str3, str4, str5, str6, str8);
    }

    @ay30
    @u360({"Accept: application/protobuf"})
    Single<SearchResponse> a(@g3i1 String url, @u0z0("query") String query, @u0z0("search-session-id") String sessionId, @u0z0("timestamp") String timestamp, @u0z0("offset") Integer offset);

    @ay30
    @u360({"Accept: application/protobuf"})
    Single<MoreResponse> b(@g3i1 String url);

    @u360({"Accept: application/protobuf"})
    @wyq0
    Single<OnboardingResponse> c(@g3i1 String url, @elb OnboardingRequest body);

    @ay30("allboarding/v2/onboarding/{path}")
    @u360({"Accept: application/protobuf"})
    Single<OnboardingResponse> e(@t8s0("path") String path, @u0z0("session-id") String sessionId, @u0z0("deeplink") String deeplink, @u0z0("entry-point") String entryPoint, @u0z0("manufacturer") String manufacturer, @u0z0("model") String model, @u0z0("platform") String platform);
}

package p;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lp/h8y;", "", "Lp/d8y;", "engagementRequest", "Lio/reactivex/rxjava3/core/Single;", "Lp/g8y;", "a", "(Lp/d8y;)Lio/reactivex/rxjava3/core/Single;", "src_main_java_com_spotify_contentaccess_gatedcontentimpl-gatedcontentimpl"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public interface h8y {
    @wyq0("/spotify.engagement.v1.EngagementService/EngageWithContent")
    Single<g8y> a(@elb d8y engagementRequest);
}

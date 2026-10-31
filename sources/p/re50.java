package p;

import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JM\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0002H'¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lp/re50;", "", "", "uri", "locale", "timeZone", "timeFormat", "feature", "Lio/reactivex/rxjava3/core/Single;", "Lp/sy21;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/Single;", "src_main_java_com_spotify_liveroom_commonimpl-commonimpl"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface re50 {
    @ay30("greenroom/v1/rooms")
    Single<sy21<Object>> a(@u0z0("uri") String uri, @u0z0("locale") String locale, @u0z0("timezone") String timeZone, @u0z0("timeFormat") String timeFormat, @u0z0("feature") String feature);
}

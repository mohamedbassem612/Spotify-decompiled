package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J3\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lp/dfo;", "", "", "id", "", "isReinventFreeEnabled", "timezone", "Lio/reactivex/rxjava3/core/Single;", "Lp/i470;", "a", "(Ljava/lang/String;ZLjava/lang/String;)Lio/reactivex/rxjava3/core/Single;", "src_main_java_com_spotify_culturalmoments_hubspage-hubspage"}, k = 1, mv = {2, 3, SplitInstallErrorCode.NO_ERROR}, xi = 48)
public interface dfo {
    @ay30("cultural-moment/v1/hub")
    Single<i470> a(@u0z0("id") String id, @u0z0("userHasRiF") boolean isReinventFreeEnabled, @u0z0("clientTimezone") String timezone);
}

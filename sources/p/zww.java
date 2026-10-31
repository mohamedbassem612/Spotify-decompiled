package p;

import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lp/zww;", "", "Lio/reactivex/rxjava3/core/Single;", "Lp/sy21;", "Lp/uxw;", "b", "()Lio/reactivex/rxjava3/core/Single;", "Lp/oww;", "request", "a", "(Lp/oww;)Lio/reactivex/rxjava3/core/Single;", "src_main_java_com_spotify_email_service-service"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface zww {
    @yyq0("accountsettings/v1/profile/email")
    Single<sy21<uxw>> a(@elb oww request);

    @ay30("accountsettings/v1/profile/email")
    Single<sy21<uxw>> b();
}

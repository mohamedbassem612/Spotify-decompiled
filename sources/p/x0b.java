package p;

import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\n\u0010\u0007J%\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\b0\u00042\b\b\u0001\u0010\u000b\u001a\u00020\u0002H'¢\u0006\u0004\b\r\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lp/x0b;", "", "", "invitationToken", "Lio/reactivex/rxjava3/core/Single;", "Lp/yaa0;", "a", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/Single;", "Lp/sy21;", "Lp/dri1;", "b", "playlistId", "Lp/v3c1;", "c", "src_main_java_com_spotify_blend_tastematch-tastematch"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface x0b {
    @yyq0("blend-invitation/v1/join/{invitationToken}")
    Single<yaa0> a(@t8s0("invitationToken") String invitationToken);

    @ay30("blend-invitation/v2/view-invitation/{invitationToken}")
    Single<sy21<dri1>> b(@t8s0("invitationToken") String invitationToken);

    @ay30("blend-invitation/v3/data-stories/{playlistId}")
    Single<sy21<v3c1>> c(@t8s0("playlistId") String playlistId);
}

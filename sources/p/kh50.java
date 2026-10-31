package p;

import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\u0007J\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0004H'¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lp/kh50;", "", "", "invitationToken", "Lio/reactivex/rxjava3/core/Single;", "Lp/pc90;", "b", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/Single;", "Lp/yaa0;", "a", "Lp/vc90;", "c", "()Lio/reactivex/rxjava3/core/Single;", "src_main_java_com_spotify_blend_tastematch-tastematch"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface kh50 {
    @yyq0("blend-invitation/v2/join/{invitationToken}")
    Single<yaa0> a(@t8s0("invitationToken") String invitationToken);

    @ay30("blend-invitation/v3/view-invitation/{invitationToken}")
    Single<pc90> b(@t8s0("invitationToken") String invitationToken);

    @wyq0("blend-invitation/v1/generate")
    Single<vc90> c();
}

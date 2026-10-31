package p;

import com.spotify.gander.v2.proto.ResetLatestCursorRequest;
import com.spotify.gander.v2.proto.ResetLatestCursorResponse;
import com.spotify.gander.v2.proto.UpdateNotificationStateRequest;
import com.spotify.gander.v2.proto.UpdateNotificationStateResponse;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J7\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005H'¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\b\b\u0001\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00072\b\b\u0001\u0010\f\u001a\u00020\u0010H'¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007H'¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u0017\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0019\u0010\u001aø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001bÀ\u0006\u0001"}, d2 = {"Lp/y2n1;", "", "", "locale", "cursor", "", "limit", "Lio/reactivex/rxjava3/core/Single;", "Lp/wz10;", "f", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/gander/v2/proto/ResetLatestCursorRequest;", "request", "Lcom/spotify/gander/v2/proto/ResetLatestCursorResponse;", "b", "(Lcom/spotify/gander/v2/proto/ResetLatestCursorRequest;)Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/gander/v2/proto/UpdateNotificationStateRequest;", "Lcom/spotify/gander/v2/proto/UpdateNotificationStateResponse;", "e", "(Lcom/spotify/gander/v2/proto/UpdateNotificationStateRequest;)Lio/reactivex/rxjava3/core/Single;", "Lp/a120;", "d", "()Lio/reactivex/rxjava3/core/Single;", "notificationStorageId", "Lp/tz10;", "a", "(Ljava/lang/String;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_yourupdates_data-data"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public interface y2n1 {
    static /* synthetic */ Single c(y2n1 y2n1Var, String str, String str2, Integer num, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: fetchNotifications");
            return null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        return y2n1Var.f(str, str2, num);
    }

    @ay30("gander/v2/notification/{notification_storage_id}/actions")
    Object a(@t8s0("notification_storage_id") String str, lnm<? super tz10> lnmVar);

    @u360({"Accept: application/x-protobuf", "Content-Type: application/x-protobuf"})
    @wyq0("gander/v2/ResetLatestCursor")
    Single<ResetLatestCursorResponse> b(@elb ResetLatestCursorRequest request);

    @ay30("gander/v2/GetUserHasUnreadNotification")
    Single<a120> d();

    @u360({"Accept: application/x-protobuf", "Content-Type: application/x-protobuf"})
    @wyq0("gander/v2/UpdateNotificationState")
    Single<UpdateNotificationStateResponse> e(@elb UpdateNotificationStateRequest request);

    @ay30("gander/v2/GetNotifications")
    Single<wz10> f(@u0z0("locale") String locale, @u0z0("cursor") String cursor, @u0z0("limit") Integer limit);
}

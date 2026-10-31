package p;

import com.spotify.messages.BetamaxPlaybackSession;
import io.reactivex.rxjava3.core.Completable;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001Je\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u0002H'¢\u0006\u0004\b\r\u0010\u000eJe\u0010\u0011\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u00022\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000fH'¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\f2\b\b\u0001\u0010\u0014\u001a\u00020\u0013H'¢\u0006\u0004\b\u0015\u0010\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, d2 = {"Lp/nm31;", "", "", "uuid", "messageId", "", "timestamp", "appDeviceId", "targetUri", "osName", "osVersion", "appState", "Lio/reactivex/rxjava3/core/Completable;", "a", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/Completable;", "Lp/ufz;", "error", "c", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lp/ufz;)Lio/reactivex/rxjava3/core/Completable;", "Lp/sr81;", "body", "b", "(Lp/sr81;)Lio/reactivex/rxjava3/core/Completable;", "src_main_java_com_spotify_notifications_notifications-notifications"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public interface nm31 {
    @u360({"Accept: application/json", "Content-Type: application/json"})
    @wyq0("robin/v1/log-push-received-event")
    Completable a(@u0z0("uuid") String uuid, @u0z0("message_id") String messageId, @u0z0("timestamp_ms") long timestamp, @u0z0("app_device_id") String appDeviceId, @u0z0("target_uri") String targetUri, @u0z0("os_name") String osName, @u0z0("os_version") String osVersion, @u0z0("app_state") String appState);

    @u360({"Accept: application/json", "Content-Type: application/json"})
    @wyq0("robin/v1/log-silent-push-received-event")
    Completable b(@elb sr81 body);

    @u360({"Accept: application/json", "Content-Type: application/json"})
    @wyq0("robin/v1/log-push-display-event")
    Completable c(@u0z0("uuid") String uuid, @u0z0("message_id") String messageId, @u0z0("timestamp_ms") long timestamp, @u0z0("app_device_id") String appDeviceId, @u0z0("target_uri") String targetUri, @u0z0("os_name") String osName, @u0z0("os_version") String osVersion, @u0z0("error") ufz error);
}

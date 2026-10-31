package p;

import com.spotify.messages.BetamaxPlaybackSession;
import com.spotify.notifications.datasource.proto.GetPushNotificationContentRequest;
import com.spotify.notifications.datasource.proto.GetPushNotificationContentResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lp/uvy0;", "", "Lcom/spotify/notifications/datasource/proto/GetPushNotificationContentRequest;", "request", "Lcom/spotify/notifications/datasource/proto/GetPushNotificationContentResponse;", "a", "(Lcom/spotify/notifications/datasource/proto/GetPushNotificationContentRequest;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_notifications_datasource-datasource"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public interface uvy0 {
    @wyq0("speechless/v1/push-notification/content")
    Object a(@elb GetPushNotificationContentRequest getPushNotificationContentRequest, lnm<? super GetPushNotificationContentResponse> lnmVar);
}

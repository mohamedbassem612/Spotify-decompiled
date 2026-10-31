package p;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import com.spotify.eventsender.gabo.PublishEventsRequest;
import com.spotify.eventsender.gabo.PublishEventsResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lp/iy30;", "", "Lcom/spotify/eventsender/gabo/PublishEventsRequest;", "event", "Lp/dxc;", "Lcom/spotify/eventsender/gabo/PublishEventsResponse;", "b", "(Lcom/spotify/eventsender/gabo/PublishEventsRequest;)Lp/dxc;", "a", "src_main_java_com_spotify_eventsender_eventsender-eventsender"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public interface iy30 {
    @u360({"No-Webgate-Authentication: true", "Content-Type: application/x-protobuf"})
    @wyq0("gabo-receiver-service/public/v3/events")
    dxc<PublishEventsResponse> a(@elb PublishEventsRequest event);

    @u360({"Content-Type: application/x-protobuf"})
    @wyq0("gabo-receiver-service/v3/events")
    dxc<PublishEventsResponse> b(@elb PublishEventsRequest event);
}

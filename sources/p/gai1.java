package p;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import com.spotify.usergeopoints.v1.UpdateLocationRequest;
import com.spotify.usergeopoints.v1.UpdateLocationResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lp/gai1;", "", "Lcom/spotify/usergeopoints/v1/UpdateLocationRequest;", "body", "Lcom/spotify/usergeopoints/v1/UpdateLocationResponse;", "a", "(Lcom/spotify/usergeopoints/v1/UpdateLocationRequest;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_devicelocation_configurationimpl-configurationimpl"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public interface gai1 {
    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("user-geo-points/v1/location")
    Object a(@elb UpdateLocationRequest updateLocationRequest, lnm<? super UpdateLocationResponse> lnmVar);
}

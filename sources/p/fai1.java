package p;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import com.spotify.usergeopoints.v1.ConsentWriteResponse;
import com.spotify.usergeopoints.v1.GetConsentResponse;
import com.spotify.usergeopoints.v1.GrantConsentRequest;
import com.spotify.usergeopoints.v1.RevokeConsentRequest;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\nH§@¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lp/fai1;", "", "Lcom/spotify/usergeopoints/v1/GetConsentResponse;", "c", "(Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/usergeopoints/v1/GrantConsentRequest;", "request", "Lcom/spotify/usergeopoints/v1/ConsentWriteResponse;", "a", "(Lcom/spotify/usergeopoints/v1/GrantConsentRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/usergeopoints/v1/RevokeConsentRequest;", "b", "(Lcom/spotify/usergeopoints/v1/RevokeConsentRequest;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_devicelocation_consent-consent"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public interface fai1 {
    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("user-geo-points/v1/location/consent/grant")
    Object a(@elb GrantConsentRequest grantConsentRequest, lnm<? super ConsentWriteResponse> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("user-geo-points/v1/location/consent/revoke")
    Object b(@elb RevokeConsentRequest revokeConsentRequest, lnm<? super ConsentWriteResponse> lnmVar);

    @ay30("user-geo-points/v1/location/consent")
    @u360({"Accept: application/x-protobuf"})
    Object c(lnm<? super GetConsentResponse> lnmVar);
}

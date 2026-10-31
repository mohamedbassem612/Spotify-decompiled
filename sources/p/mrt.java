package p;

import com.google.protobuf.Empty;
import com.spotify.esperanto.esperanto.ServiceBase;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class mrt implements ServiceBase {
    public final gtt a;

    public mrt(gtt gttVar) {
        this.a = gttVar;
    }

    @Override // com.spotify.esperanto.esperanto.Transport
    public final Single callSingle(String str, String str2, byte[] bArr) {
        if (!str.equals("spotify.device_location_service.proto.DeviceLocationService")) {
            jah.g(f4i1.f("Attempted to access mismatched [", str, "], but this service is [spotify.device_location_service.proto.DeviceLocationService]"));
            return null;
        }
        if (str2.equals("RequestLocationSilently")) {
            Empty.q(bArr).getClass();
            return rqt0.G(new n1o(this, (lnm) null, (byte) 29)).map(bbn.Y0);
        }
        jah.g(cy30.p("Attempted to access unknown method. [", str, ":", str2, "]"));
        return null;
    }

    @Override // com.spotify.esperanto.esperanto.Transport
    public final Observable callStream(String str, String str2, byte[] bArr) {
        if (str.equals("spotify.device_location_service.proto.DeviceLocationService")) {
            throw new RuntimeException(cy30.p("Attempted to access unknown method. [", str, ":", str2, "]"));
        }
        throw new RuntimeException(f4i1.f("Attempted to access mismatched [", str, "], but this service is [spotify.device_location_service.proto.DeviceLocationService]"));
    }

    @Override // com.spotify.esperanto.esperanto.Transport
    public final byte[] callSync(String str, String str2, byte[] bArr) {
        if (str.equals("spotify.device_location_service.proto.DeviceLocationService")) {
            throw new RuntimeException(cy30.p("Attempted to access unknown method. [", str, ":", str2, "]"));
        }
        throw new RuntimeException(f4i1.f("Attempted to access mismatched [", str, "], but this service is [spotify.device_location_service.proto.DeviceLocationService]"));
    }

    @Override // com.spotify.esperanto.esperanto.ServiceBase
    public final String getName() {
        return "spotify.device_location_service.proto.DeviceLocationService";
    }
}

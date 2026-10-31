package p;

import com.spotify.ads.esperanto.proto.SetDeviceVolumeRequest;
import com.spotify.ads.esperanto.proto.SetDeviceVolumeResponse;
import com.spotify.esperanto.esperanto.CoroutineClientBase;
import j$.util.Base64;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class jwt extends CoroutineClientBase {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(SetDeviceVolumeRequest setDeviceVolumeRequest, onm onmVar) {
        iwt iwtVar;
        if (onmVar instanceof iwt) {
            iwtVar = (iwt) onmVar;
            int i = iwtVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                iwtVar.c = i - Integer.MIN_VALUE;
            } else {
                iwtVar = new iwt(this, onmVar);
            }
        } else {
            iwtVar = new iwt(this, onmVar);
        }
        Object objCallSingle = iwtVar.a;
        int i2 = iwtVar.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            iwtVar.c = 1;
            objCallSingle = callSingle("spotify.ads.esperanto.proto.DeviceState", "SetDeviceVolume", setDeviceVolumeRequest, iwtVar);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return SetDeviceVolumeResponse.p(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.spotify.ads.esperanto.proto.SetDeviceVolumeResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }
}

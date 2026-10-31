package p;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class vhf1 implements c1d {
    public final /* synthetic */ uqs a;

    public final boolean a(TotalCaptureResult totalCaptureResult) {
        uqs uqsVar = this.a;
        if (((mzc) uqsVar.e) != null) {
            Integer num = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.FLASH_MODE);
            if ((num != null && num.intValue() == 2) == uqsVar.b) {
                ((mzc) uqsVar.e).b((Object) null);
                uqsVar.e = null;
            }
        }
        return false;
    }
}

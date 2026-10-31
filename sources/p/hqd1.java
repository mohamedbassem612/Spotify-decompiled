package p;

import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hqd1 extends ScanCallback {
    public final /* synthetic */ ssw0 a;

    public hqd1(ssw0 ssw0Var) {
        this.a = ssw0Var;
    }

    @Override // android.bluetooth.le.ScanCallback
    public final void onScanFailed(int i) {
        Logger.d("Tap BLE: Scan failed (errorCode=%d)", new Object[]{Integer.valueOf(i)});
        this.a.H((Throwable) null);
    }

    @Override // android.bluetooth.le.ScanCallback
    public final void onScanResult(int i, ScanResult scanResult) {
        this.a.l(scanResult);
    }
}

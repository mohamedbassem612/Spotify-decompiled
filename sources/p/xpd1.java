package p;

import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.AdvertiseSettings;
import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xpd1 extends AdvertiseCallback {
    @Override // android.bluetooth.le.AdvertiseCallback
    public final void onStartFailure(int i) {
        Logger.d("Tap BLE Peripheral: Advertising failed (errorCode=%d)", new Object[]{Integer.valueOf(i)});
    }

    @Override // android.bluetooth.le.AdvertiseCallback
    public final void onStartSuccess(AdvertiseSettings advertiseSettings) {
    }
}

package p;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothProfile;
import io.reactivex.rxjava3.core.SingleEmitter;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class b84 implements BluetoothProfile.ServiceListener {
    public final /* synthetic */ SingleEmitter a;
    public final /* synthetic */ BluetoothAdapter b;

    public b84(SingleEmitter singleEmitter, BluetoothAdapter bluetoothAdapter) {
        this.a = singleEmitter;
        this.b = bluetoothAdapter;
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public final void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
        Objects.toString(bluetoothProfile.getConnectedDevices());
        SingleEmitter singleEmitter = this.a;
        if (!singleEmitter.isDisposed()) {
            singleEmitter.onSuccess(bluetoothProfile.getConnectedDevices());
        }
        this.b.closeProfileProxy(i, bluetoothProfile);
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public final void onServiceDisconnected(int i) {
    }
}

package p;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sf9 implements ai9 {
    @Override // p.ai9
    public final boolean a(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        throw new IllegalStateException("Should never be called when getService returns null");
    }

    @Override // p.ai9
    public final BluetoothGattService b() {
        return null;
    }

    @Override // p.ai9
    public final boolean c(int i) {
        return false;
    }

    @Override // p.ai9
    public final zh9 d(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        throw new IllegalStateException("Should never be called when getService returns null");
    }

    @Override // p.ai9
    public final boolean e() {
        return false;
    }

    @Override // p.ai9
    public final boolean f() {
        return false;
    }

    @Override // p.ai9
    public final void close() {
    }

    @Override // p.ai9
    public final void disconnect() {
    }
}

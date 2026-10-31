package p;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public interface ai9 {
    boolean a(BluetoothGattCharacteristic bluetoothGattCharacteristic);

    BluetoothGattService b();

    boolean c(int i);

    void close();

    zh9 d(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr);

    void disconnect();

    boolean e();

    boolean f();
}

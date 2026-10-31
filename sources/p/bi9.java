package p;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.os.Build;
import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bi9 implements ai9 {
    public final BluetoothGatt a;

    public bi9(BluetoothGatt bluetoothGatt, gtv0 gtv0Var) {
        this.a = bluetoothGatt;
    }

    @Override // p.ai9
    public final boolean a(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return this.a.readCharacteristic(bluetoothGattCharacteristic);
    }

    @Override // p.ai9
    public final BluetoothGattService b() {
        return this.a.getService(tgl.a);
    }

    @Override // p.ai9
    public final boolean c(int i) {
        return this.a.requestMtu(i);
    }

    @Override // p.ai9
    public final void close() {
        this.a.close();
    }

    @Override // p.ai9
    public final zh9 d(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        String address;
        int i = Build.VERSION.SDK_INT;
        int writeType = i >= 33 ? 2 : bluetoothGattCharacteristic.getWriteType();
        zh9 xh9Var = yh9.a;
        BluetoothGatt bluetoothGatt = this.a;
        if (i >= 33) {
            int iWriteCharacteristic = bluetoothGatt.writeCharacteristic(bluetoothGattCharacteristic, bArr, 2);
            if (iWriteCharacteristic != 0) {
                xh9Var = new xh9(iWriteCharacteristic);
            }
        } else {
            bluetoothGattCharacteristic.setValue(bArr);
            if (!bluetoothGatt.writeCharacteristic(bluetoothGattCharacteristic)) {
                xh9Var = new xh9(-1);
            }
        }
        if (xh9Var instanceof yh9) {
            BluetoothDevice device = bluetoothGatt.getDevice();
            if (device == null || (address = device.getAddress()) == null) {
                address = "unknown";
            }
            Logger.g("BLEConnection: event=write_submitted peer=%s characteristic=%s outcome=%s", new Object[]{address, bluetoothGattCharacteristic.getUuid(), writeType == 1 ? "without_response_unconfirmed" : "with_response"});
        }
        return xh9Var;
    }

    @Override // p.ai9
    public final void disconnect() {
        this.a.disconnect();
    }

    @Override // p.ai9
    public final boolean e() {
        return this.a.discoverServices();
    }

    @Override // p.ai9
    public final boolean f() {
        return this.a.readRemoteRssi();
    }
}

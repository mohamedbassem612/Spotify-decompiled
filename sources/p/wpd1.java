package p;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattServer;
import android.bluetooth.BluetoothGattServerCallback;
import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wpd1 extends BluetoothGattServerCallback {
    public final /* synthetic */ vi11 a;

    public wpd1(vi11 vi11Var) {
        this.a = vi11Var;
    }

    @Override // android.bluetooth.BluetoothGattServerCallback
    public final void onCharacteristicWriteRequest(BluetoothDevice bluetoothDevice, int i, BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z, boolean z2, int i2, byte[] bArr) {
        BluetoothGattServer bluetoothGattServerE;
        BluetoothGattServer bluetoothGattServerE2;
        BluetoothGattServer bluetoothGattServerE3;
        boolean zJ = u890.j(bluetoothGattCharacteristic.getUuid(), bqd1.a());
        vi11 vi11Var = this.a;
        if (!zJ) {
            if (!z2 || (bluetoothGattServerE3 = vi11.e(vi11Var)) == null) {
                return;
            }
            bluetoothGattServerE3.sendResponse(bluetoothDevice, i, 6, i2, null);
            return;
        }
        cqd1 cqd1VarH = bArr != null ? vi11.h(vi11Var, bArr) : null;
        if (cqd1VarH == null) {
            Logger.d("Tap BLE Peripheral: Invalid or missing payload from %s", bluetoothDevice.getAddress());
            if (!z2 || (bluetoothGattServerE2 = vi11.e(vi11Var)) == null) {
                return;
            }
            bluetoothGattServerE2.sendResponse(bluetoothDevice, i, 257, i2, null);
            return;
        }
        vi11.d(vi11Var).l(cqd1VarH);
        if (!z2 || (bluetoothGattServerE = vi11.e(vi11Var)) == null) {
            return;
        }
        bluetoothGattServerE.sendResponse(bluetoothDevice, i, 0, i2, bArr);
    }

    @Override // android.bluetooth.BluetoothGattServerCallback
    public final void onConnectionStateChange(BluetoothDevice bluetoothDevice, int i, int i2) {
        bluetoothDevice.getAddress();
    }
}

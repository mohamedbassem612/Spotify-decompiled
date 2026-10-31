package p;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bf9 extends BluetoothGattCallback {
    public final String a;
    public final iu30 b;

    public bf9(String str, iu30 iu30Var) {
        this.a = str;
        this.b = iu30Var;
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, int i) {
        String str = this.a;
        iu30 iu30Var = this.b;
        if (i == 0) {
            iu30Var.invoke(new df9(str, bluetoothGattCharacteristic.getUuid(), bArr));
        } else {
            iu30Var.invoke(new cf9(str, bluetoothGattCharacteristic.getUuid(), i));
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        String str = this.a;
        iu30 iu30Var = this.b;
        if (i == 0) {
            iu30Var.invoke(new ff9(str, bluetoothGattCharacteristic.getUuid()));
        } else {
            iu30Var.invoke(new ef9(str, bluetoothGattCharacteristic.getUuid(), i));
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
        String str = this.a;
        if (i2 == 0 && i == 0) {
            Logger.g("BLEConnection: event=disconnected peer=%s role=central outcome=ended status=%d", new Object[]{str, Integer.valueOf(i)});
        }
        iu30 iu30Var = this.b;
        if (i != 0) {
            iu30Var.invoke(new gf9(str, i));
        } else if (i2 == 0) {
            iu30Var.invoke(new if9(str));
        } else {
            if (i2 != 2) {
                return;
            }
            iu30Var.invoke(new hf9(str));
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onMtuChanged(BluetoothGatt bluetoothGatt, int i, int i2) {
        this.b.invoke(new jf9(this.a, i, i2));
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onReadRemoteRssi(BluetoothGatt bluetoothGatt, int i, int i2) {
        String str = this.a;
        iu30 iu30Var = this.b;
        if (i2 == 0) {
            iu30Var.invoke(new lf9(str, i));
        } else {
            iu30Var.invoke(new kf9(str, i2));
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onServiceChanged(BluetoothGatt bluetoothGatt) {
        this.b.invoke(new mf9(this.a));
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
        String str = this.a;
        iu30 iu30Var = this.b;
        if (i == 0) {
            iu30Var.invoke(new of9(str));
        } else {
            iu30Var.invoke(new nf9(str));
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        onCharacteristicRead(bluetoothGatt, bluetoothGattCharacteristic, bluetoothGattCharacteristic.getValue(), i);
    }
}

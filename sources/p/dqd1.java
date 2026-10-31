package p;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dqd1 extends BluetoothGattCallback {
    public final /* synthetic */ eqd1 a;

    public dqd1(eqd1 eqd1Var) {
        this.a = eqd1Var;
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        this.a.d(bluetoothGatt, bluetoothGattCharacteristic, bluetoothGattCharacteristic.getValue());
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        this.a.c(bluetoothGatt, bluetoothGattCharacteristic.getUuid(), bluetoothGattCharacteristic.getValue(), i);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
        if (i == 0 && i2 == 2) {
            bluetoothGatt.discoverServices();
        } else if (i2 == 0) {
            this.a.b.H((Throwable) null);
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onMtuChanged(BluetoothGatt bluetoothGatt, int i, int i2) {
        if (i2 == 0) {
            eqd1.e(bluetoothGatt, bqd1.c);
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
        BluetoothGattCharacteristic characteristic;
        if (i != 0) {
            return;
        }
        List<BluetoothGattService> services = bluetoothGatt.getServices();
        services.size();
        List<BluetoothGattService> list = services;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((BluetoothGattService) it.next()).getUuid());
        }
        BluetoothGattService service = bluetoothGatt.getService(bqd1.a);
        if (service == null || (characteristic = service.getCharacteristic(bqd1.b)) == null) {
            return;
        }
        bluetoothGatt.setCharacteristicNotification(characteristic, true);
        bluetoothGatt.requestMtu(517);
        eqd1.b(bluetoothGatt, characteristic);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        this.a.d(bluetoothGatt, bluetoothGattCharacteristic, bArr);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, int i) {
        this.a.c(bluetoothGatt, bluetoothGattCharacteristic.getUuid(), bArr, i);
    }
}

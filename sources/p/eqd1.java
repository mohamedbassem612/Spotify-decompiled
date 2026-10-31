package p;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import android.os.Build;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class eqd1 {
    public final Context a;
    public BluetoothGatt c;
    public String d;
    public String e;
    public String f;
    public final bbc b = mno1.a(16, 0, 6);
    public final dqd1 g = new dqd1(this);

    public eqd1(Context context) {
        this.a = context;
    }

    public static void b(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(bqd1.f);
        if (descriptor == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            bluetoothGatt.writeDescriptor(descriptor, BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
        } else {
            descriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
            bluetoothGatt.writeDescriptor(descriptor);
        }
    }

    public static void e(BluetoothGatt bluetoothGatt, UUID uuid) {
        BluetoothGattCharacteristic characteristic;
        BluetoothGattService service = bluetoothGatt.getService(bqd1.a);
        if (service == null || (characteristic = service.getCharacteristic(uuid)) == null) {
            return;
        }
        bluetoothGatt.readCharacteristic(characteristic);
    }

    public final void a() {
        BluetoothGatt bluetoothGatt = this.c;
        if (bluetoothGatt != null) {
            bluetoothGatt.disconnect();
        }
        BluetoothGatt bluetoothGatt2 = this.c;
        if (bluetoothGatt2 != null) {
            bluetoothGatt2.close();
        }
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }

    public final void c(BluetoothGatt bluetoothGatt, UUID uuid, byte[] bArr, int i) {
        if (i != 0) {
            return;
        }
        if (uuid.equals(bqd1.c)) {
            this.d = new String(bArr, nne.a);
            e(bluetoothGatt, bqd1.d);
        } else if (uuid.equals(bqd1.d)) {
            this.e = new String(bArr, nne.a);
            e(bluetoothGatt, bqd1.e);
        } else if (uuid.equals(bqd1.e)) {
            this.f = new String(bArr, nne.a);
        }
    }

    public final void d(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        if (bArr.length != 0 && bArr[0] == 1) {
            String str = this.d;
            if (str == null) {
                str = "unknown";
            }
            String str2 = this.f;
            if (str2 == null) {
                str2 = "unknown";
            }
            String str3 = this.e;
            this.b.l(new cqd1(str, str2, str3 != null ? str3 : "unknown"));
            byte[] bArr2 = {0};
            if (Build.VERSION.SDK_INT >= 33) {
                bluetoothGatt.writeCharacteristic(bluetoothGattCharacteristic, bArr2, 2);
            } else {
                bluetoothGattCharacteristic.setValue(bArr2);
                bluetoothGatt.writeCharacteristic(bluetoothGattCharacteristic);
            }
        }
    }
}

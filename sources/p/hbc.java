package p;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattServerCallback;
import com.spotify.base.java.logging.Logger;
import java.text.ParseException;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hbc extends BluetoothGattServerCallback {
    public final zk9 a;
    public final xu30 b;
    public final fp8 c;
    public final iu30 d;
    public final boolean e;

    public hbc(zk9 zk9Var, xu30 xu30Var, fp8 fp8Var, qka qkaVar, boolean z) {
        this.a = zk9Var;
        this.b = xu30Var;
        this.c = fp8Var;
        this.d = qkaVar;
        this.e = z;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002b  */
    @Override // android.bluetooth.BluetoothGattServerCallback
    public final void onCharacteristicReadRequest(BluetoothDevice bluetoothDevice, int i, int i2, BluetoothGattCharacteristic bluetoothGattCharacteristic) throws ParseException {
        boolean z;
        boolean z2 = this.e;
        zk9 zk9Var = this.a;
        if (!z2) {
            zk9Var.c1(bluetoothDevice, Integer.valueOf(i), 0, 0, bluetoothGattCharacteristic.getValue());
            return;
        }
        byte[] value = bluetoothGattCharacteristic.getValue();
        if (i2 < 0) {
            z = false;
        } else {
            if (i2 <= (value != null ? value.length : 0)) {
                z = true;
            } else {
                z = false;
            }
        }
        Integer numValueOf = Integer.valueOf(i);
        Integer numValueOf2 = Integer.valueOf(z ? 0 : 7);
        Integer numValueOf3 = Integer.valueOf(i2);
        byte[] bArrZ = null;
        if (z && value != null) {
            bArrZ = f46.Z(i2, value, value.length);
        }
        zk9Var.c1(bluetoothDevice, numValueOf, numValueOf2, numValueOf3, bArrZ);
    }

    @Override // android.bluetooth.BluetoothGattServerCallback
    public final void onCharacteristicWriteRequest(BluetoothDevice bluetoothDevice, int i, BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z, boolean z2, int i2, byte[] bArr) throws ParseException {
        boolean zF;
        byte[] bArrZ;
        List list;
        Logger.g("BLEGattServer: event=write_received peer=%s characteristic=%s outcome=gatt_callback prepared=%s offset=%d", new Object[]{bluetoothDevice.getAddress(), bluetoothGattCharacteristic.getUuid(), Boolean.valueOf(z), Integer.valueOf(i2)});
        int instanceId = bluetoothGattCharacteristic.getInstanceId();
        fp8 fp8Var = this.c;
        String address = bluetoothDevice.getAddress();
        UUID uuid = bluetoothGattCharacteristic.getUuid();
        synchronized (fp8Var) {
            zF = fp8Var.f(address, new ine(uuid, Integer.valueOf(instanceId)), i2, bArr);
        }
        int i3 = 0;
        boolean zBooleanValue = true;
        if (!z && zF) {
            fp8 fp8Var2 = this.c;
            String address2 = bluetoothDevice.getAddress();
            UUID uuid2 = bluetoothGattCharacteristic.getUuid();
            synchronized (fp8Var2) {
                ine ineVar = new ine(uuid2, Integer.valueOf(instanceId));
                Map map = (Map) ((ConcurrentHashMap) fp8Var2.b).get(address2);
                bArrZ = (map == null || (list = (List) map.get(ineVar)) == null) ? null : boo1.z(list);
                fp8Var2.g(address2, ineVar);
            }
            if (this.d != null) {
                zBooleanValue = bArrZ == null ? false : ((Boolean) this.d.invoke(new f80(this, bluetoothDevice, bluetoothGattCharacteristic.getUuid(), bArrZ, (byte) 17))).booleanValue();
            } else if (bArrZ != null) {
                this.b.invoke(bluetoothDevice, bluetoothGattCharacteristic.getUuid(), bArrZ);
            }
        }
        if (z2) {
            if (!zF) {
                i3 = 7;
            } else if (!zBooleanValue) {
                i3 = 257;
            }
            this.a.c1(bluetoothDevice, Integer.valueOf(i), Integer.valueOf(i3), Integer.valueOf(i2), (zF && zBooleanValue) ? bArr : null);
            Logger.g("BLEGattServer: event=write_response peer=%s characteristic=%s outcome=submitted status=%d", new Object[]{bluetoothDevice.getAddress(), bluetoothGattCharacteristic.getUuid(), Integer.valueOf(i3)});
        }
    }

    @Override // android.bluetooth.BluetoothGattServerCallback
    public final void onConnectionStateChange(BluetoothDevice bluetoothDevice, int i, int i2) {
        super.onConnectionStateChange(bluetoothDevice, i, i2);
        if (i2 == 0) {
            Logger.g("BLEGattServer: event=disconnected peer=%s role=peripheral outcome=ended status=%d", new Object[]{bluetoothDevice.getAddress(), Integer.valueOf(i)});
        } else if (i2 == 2) {
            Logger.g("BLEGattServer: event=connected peer=%s role=peripheral outcome=%s status=%d", new Object[]{bluetoothDevice.getAddress(), i == 0 ? "success" : "failed", Integer.valueOf(i)});
        }
        if (i == 0 && i2 == 0) {
            fp8 fp8Var = this.c;
            String address = bluetoothDevice.getAddress();
            synchronized (fp8Var) {
                ((ConcurrentHashMap) fp8Var.b).remove(address);
            }
        }
    }

    @Override // android.bluetooth.BluetoothGattServerCallback
    public final void onExecuteWrite(BluetoothDevice bluetoothDevice, int i, boolean z) throws ParseException {
        LinkedHashSet linkedHashSet;
        boolean zBooleanValue;
        if (!z) {
            this.a.c1(bluetoothDevice, Integer.valueOf(i), 257, 0, null);
            fp8 fp8Var = this.c;
            String address = bluetoothDevice.getAddress();
            synchronized (fp8Var) {
                ((ConcurrentHashMap) fp8Var.b).remove(address);
            }
            return;
        }
        fp8 fp8Var2 = this.c;
        String address2 = bluetoothDevice.getAddress();
        synchronized (fp8Var2) {
            try {
                Map map = (Map) ((ConcurrentHashMap) fp8Var2.b).remove(address2);
                if (map != null) {
                    linkedHashSet = new LinkedHashSet();
                    for (Map.Entry entry : map.entrySet()) {
                        linkedHashSet.add(new mmr0(((ine) entry.getKey()).a, boo1.z((List) entry.getValue())));
                    }
                } else {
                    linkedHashSet = w7x.a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        d1c d1cVar = new d1c(linkedHashSet, this, bluetoothDevice, (byte) 2);
        iu30 iu30Var = this.d;
        if (iu30Var != null) {
            zBooleanValue = ((Boolean) iu30Var.invoke(d1cVar)).booleanValue();
        } else {
            d1cVar.invoke();
            zBooleanValue = true;
        }
        this.a.c1(bluetoothDevice, Integer.valueOf(i), Integer.valueOf(zBooleanValue ? 0 : 257), 0, null);
    }
}

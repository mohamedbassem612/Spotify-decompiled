package p;

import android.bluetooth.BluetoothDevice;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dh9 implements jh9 {
    public final BluetoothDevice a;

    public dh9(BluetoothDevice bluetoothDevice) {
        this.a = bluetoothDevice;
    }

    @Override // p.jh9
    public final String a() {
        return this.a.getAddress();
    }

    public final BluetoothDevice b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (dh9.class.equals(obj != null ? obj.getClass() : null)) {
            return u890.j(this.a.getAddress(), ((dh9) obj).a.getAddress());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.getAddress().hashCode();
    }
}

package p;

import android.bluetooth.BluetoothDevice;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fi41 {
    public final BluetoothDevice a;
    public final Integer b;

    public fi41(BluetoothDevice bluetoothDevice, Integer num) {
        this.a = bluetoothDevice;
        this.b = num;
    }

    public final BluetoothDevice a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fi41)) {
            return false;
        }
        fi41 fi41Var = (fi41) obj;
        return this.a.equals(fi41Var.a) && u890.j(this.b, fi41Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}

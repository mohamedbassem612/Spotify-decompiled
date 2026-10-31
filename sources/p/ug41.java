package p;

import android.bluetooth.BluetoothDevice;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ug41 {
    public final int a;
    public final BluetoothDevice b;
    public final Integer c;
    public final String d;

    public ug41(int i, BluetoothDevice bluetoothDevice, Integer num, String str) {
        this.a = i;
        this.b = bluetoothDevice;
        this.c = num;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ug41)) {
            return false;
        }
        ug41 ug41Var = (ug41) obj;
        return this.a == ug41Var.a && this.b.equals(ug41Var.b) && u890.j(this.c, ug41Var.c) && u890.j(this.d, ug41Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31;
        Integer num = this.c;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.d;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}

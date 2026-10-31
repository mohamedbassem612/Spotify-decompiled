package p;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.os.ParcelUuid;
import com.spotify.tap.go.service.GoBluetoothService;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cy40 implements hgb {
    public final t961 a;

    public cy40(t961 t961Var) {
        this.a = t961Var;
    }

    public final void c(Context context, BluetoothDevice bluetoothDevice) {
        ParcelUuid[] uuids = bluetoothDevice.getUuids();
        if (uuids != null) {
            for (ParcelUuid parcelUuid : uuids) {
                UUID uuid = parcelUuid.getUuid();
                hi.a.getClass();
                if (u890.j(uuid, bi.b)) {
                    int i = GoBluetoothService.h;
                    String address = bluetoothDevice.getAddress();
                    Intent intent = new Intent(context, (Class<?>) GoBluetoothService.class);
                    intent.putExtra("address", address);
                    intent.putExtra("connected", true);
                    this.a.a(context, intent);
                    return;
                }
            }
        }
    }

    public final void e(BluetoothDevice bluetoothDevice) {
    }
}

package p;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import io.reactivex.rxjava3.core.Observer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ifb implements BluetoothProfile.ServiceListener {
    public final /* synthetic */ jfb a;
    public final /* synthetic */ Observer b;
    public final /* synthetic */ BluetoothAdapter c;

    public ifb(jfb jfbVar, Observer observer, BluetoothAdapter bluetoothAdapter) {
        this.a = jfbVar;
        this.b = observer;
        this.c = bluetoothAdapter;
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public final void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
        jfb jfbVar = this.a;
        ArrayList arrayList = jfbVar.b;
        if (jfbVar.c) {
            return;
        }
        List<BluetoothDevice> connectedDevices = bluetoothProfile.getConnectedDevices();
        connectedDevices.getClass();
        boolean zIsEmpty = connectedDevices.isEmpty();
        Observer observer = this.b;
        if (zIsEmpty) {
            observer.onNext(dug.n());
        } else {
            for (BluetoothDevice bluetoothDevice : connectedDevices) {
                bluetoothDevice.getClass();
                arrayList.add(w081.d(bluetoothDevice));
            }
            observer.onNext(dug.i((pfb) arrayList.get(0)));
        }
        this.c.closeProfileProxy(2, bluetoothProfile);
        observer.onComplete();
        jfbVar.c = true;
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public final void onServiceDisconnected(int i) {
    }
}

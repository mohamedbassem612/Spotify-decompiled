package p;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothLeAudio;
import android.bluetooth.BluetoothProfile;
import io.reactivex.rxjava3.core.SingleEmitter;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class c84 implements BluetoothProfile.ServiceListener {
    public final /* synthetic */ SingleEmitter a;
    public final /* synthetic */ BluetoothAdapter b;

    public c84(SingleEmitter singleEmitter, BluetoothAdapter bluetoothAdapter) {
        this.a = singleEmitter;
        this.b = bluetoothAdapter;
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public final void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
        BluetoothDevice connectedGroupLeadDevice;
        Objects.toString(bluetoothProfile.getConnectedDevices());
        SingleEmitter singleEmitter = this.a;
        if (!singleEmitter.isDisposed()) {
            List<BluetoothDevice> connectedDevices = bluetoothProfile.getConnectedDevices();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            BluetoothLeAudio bluetoothLeAudio = bluetoothProfile instanceof BluetoothLeAudio ? (BluetoothLeAudio) bluetoothProfile : null;
            connectedDevices.getClass();
            for (BluetoothDevice bluetoothDevice : connectedDevices) {
                int groupId = bluetoothLeAudio != null ? bluetoothLeAudio.getGroupId(bluetoothDevice) : -1;
                if (groupId == -1) {
                    bluetoothDevice.getClass();
                    linkedHashSet.add(bluetoothDevice);
                } else if (bluetoothLeAudio != null && (connectedGroupLeadDevice = bluetoothLeAudio.getConnectedGroupLeadDevice(groupId)) != null) {
                    linkedHashSet.add(connectedGroupLeadDevice);
                }
            }
            singleEmitter.onSuccess(o7h.l1(linkedHashSet));
        }
        this.b.closeProfileProxy(i, bluetoothProfile);
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public final void onServiceDisconnected(int i) {
    }
}

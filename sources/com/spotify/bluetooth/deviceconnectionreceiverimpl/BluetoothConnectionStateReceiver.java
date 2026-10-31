package com.spotify.bluetooth.deviceconnectionreceiverimpl;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.spotify.messages.BetamaxPlaybackSession;
import java.util.Collections;
import java.util.Iterator;
import kotlin.Metadata;
import p.c7b;
import p.hgb;
import p.l2p;
import p.o7h;
import p.p7h;
import p.t380;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/bluetooth/deviceconnectionreceiverimpl/BluetoothConnectionStateReceiver;", "Lp/l2p;", "<init>", "()V", "src_main_java_com_spotify_bluetooth_deviceconnectionreceiverimpl-deviceconnectionreceiverimpl"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class BluetoothConnectionStateReceiver extends l2p {
    public t380 b;

    public final void b(Context context, Intent intent) {
        boolean z;
        int i = Build.VERSION.SDK_INT;
        if (o7h.i0(i >= 31 ? p7h.M(new String[]{"android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED", "android.bluetooth.action.LE_AUDIO_CONNECTION_STATE_CHANGED"}) : Collections.singletonList("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED"), intent.getAction())) {
            int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
            if (intExtra == 0) {
                z = false;
            } else if (intExtra != 2) {
                return;
            } else {
                z = true;
            }
            BluetoothDevice bluetoothDevice = i >= 33 ? (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE", BluetoothDevice.class) : (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            if (bluetoothDevice == null) {
                return;
            }
            t380 t380Var = this.b;
            if (t380Var == null) {
                u890.C("pluginsSet");
                throw null;
            }
            o7h.y0(t380Var, ", ", (String) null, (String) null, c7b.X, 30);
            t380 t380Var2 = this.b;
            if (z) {
                if (t380Var2 == null) {
                    u890.C("pluginsSet");
                    throw null;
                }
                Iterator it = t380Var2.iterator();
                while (it.hasNext()) {
                    ((hgb) it.next()).c(context, bluetoothDevice);
                }
                return;
            }
            if (t380Var2 == null) {
                u890.C("pluginsSet");
                throw null;
            }
            Iterator it2 = t380Var2.iterator();
            while (it2.hasNext()) {
                ((hgb) it2.next()).e(bluetoothDevice);
            }
        }
    }
}

package p;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.MaybeEmitter;
import io.reactivex.rxjava3.core.MaybeOnSubscribe;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class we90 implements MaybeOnSubscribe {
    public static final UUID b = UUID.fromString("9B26D8C0-A8ED-440B-95B0-C4714A518BCC");
    public final BluetoothDevice a;

    public we90(BluetoothDevice bluetoothDevice) {
        this.a = bluetoothDevice;
    }

    public final void subscribe(MaybeEmitter maybeEmitter) throws IOException {
        Logger.g("Go: Creating socket", new Object[0]);
        BluetoothSocket bluetoothSocketCreateInsecureRfcommSocketToServiceRecord = this.a.createInsecureRfcommSocketToServiceRecord(b);
        if (bluetoothSocketCreateInsecureRfcommSocketToServiceRecord == null) {
            Logger.d("Go: Failed to create a socket.", new Object[0]);
            Throwable th = new Throwable("Socket creation failed");
            if (maybeEmitter.isDisposed()) {
                return;
            }
            maybeEmitter.onError(th);
            return;
        }
        maybeEmitter.setCancellable(new ci0(bluetoothSocketCreateInsecureRfcommSocketToServiceRecord, (byte) 3));
        try {
            bluetoothSocketCreateInsecureRfcommSocketToServiceRecord.connect();
            InputStream inputStream = bluetoothSocketCreateInsecureRfcommSocketToServiceRecord.getInputStream();
            if (maybeEmitter.isDisposed()) {
                return;
            }
            maybeEmitter.onSuccess(inputStream);
        } catch (IOException e) {
            Logger.e(e, "Go: Failed to connect to socket", new Object[0]);
            if (maybeEmitter.isDisposed()) {
                return;
            }
            maybeEmitter.onError(e);
        }
    }
}

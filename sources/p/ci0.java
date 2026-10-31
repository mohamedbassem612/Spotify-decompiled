package p;

import android.bluetooth.BluetoothSocket;
import android.content.Context;
import android.speech.tts.TextToSpeech;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Cancellable;
import java.io.IOException;
import java.net.ServerSocket;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ci0 implements Cancellable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ci0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void cancel() throws IOException {
        switch (this.a) {
            case 0:
                ((eyh0) this.b).c = null;
                break;
            case 1:
                ServerSocket serverSocket = (ServerSocket) this.b;
                if (!serverSocket.isClosed()) {
                    serverSocket.close();
                }
                break;
            case 2:
                pw40 pw40Var = (pw40) this.b;
                if (pw40Var.b.isShowing()) {
                    ((iw40) pw40Var.a.b).cancel();
                }
                break;
            case 3:
                BluetoothSocket bluetoothSocket = (BluetoothSocket) this.b;
                if (!bluetoothSocket.isConnected()) {
                    bluetoothSocket.close();
                    Logger.g("Go: Socket closed", new Object[0]);
                }
                break;
            case 4:
                x7e0 x7e0Var = (x7e0) this.b;
                x7e0Var.f();
                x7e0Var.b.set(w7e0.a);
                x7e0Var.c.set(false);
                x7e0Var.a = y7e0.a;
                break;
            case 5:
                ((Disposable) this.b).dispose();
                break;
            case 6:
                b341 b341Var = (b341) this.b;
                TextToSpeech textToSpeech = b341Var.e;
                if (textToSpeech != null) {
                    textToSpeech.stop();
                    TextToSpeech textToSpeech2 = b341Var.e;
                    textToSpeech2.getClass();
                    textToSpeech2.shutdown();
                }
                break;
            case 7:
                ((xh61) this.b).a = null;
                break;
            case 8:
                ((f6a1) this.b).a.close();
                Logger.g("Go: Stream closed", new Object[0]);
                break;
            case 9:
                c4c1 c4c1Var = (c4c1) this.b;
                c4c1Var.d.b = null;
                c4c1Var.c.setStoryEndListener$src_main_java_com_spotify_campaigns_storytelling_storytelling((iu30) null);
                break;
            case 10:
                ((dxg1) this.b).b = null;
                break;
            default:
                l6s l6sVar = (l6s) this.b;
                l6sVar.b = null;
                ((Context) l6sVar.a).getContentResolver().unregisterContentObserver((p2a) l6sVar.c);
                break;
        }
    }
}

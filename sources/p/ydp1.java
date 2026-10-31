package p;

import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.spotify.wear.wearabledatalayer.SpotifyWearableListenerService;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ydp1 extends Handler {
    public boolean a;
    public final l580 b;
    public final /* synthetic */ SpotifyWearableListenerService c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ydp1(SpotifyWearableListenerService spotifyWearableListenerService, Looper looper) {
        super(looper);
        this.c = spotifyWearableListenerService;
        Looper.getMainLooper();
        this.b = new l580((byte) 1);
    }

    public final synchronized void a(String str) {
        if (this.a) {
            if (Log.isLoggable("WearableLS", 2)) {
                SpotifyWearableListenerService spotifyWearableListenerService = this.c;
                new StringBuilder(str.length() + 17 + String.valueOf(spotifyWearableListenerService.a).length());
            }
            try {
                this.c.unbindService(this.b);
            } catch (RuntimeException unused) {
            }
            this.a = false;
        }
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        synchronized (this) {
            try {
                if (!this.a) {
                    if (Log.isLoggable("WearableLS", 2)) {
                        "bindService: ".concat(String.valueOf(this.c.a));
                    }
                    SpotifyWearableListenerService spotifyWearableListenerService = this.c;
                    spotifyWearableListenerService.bindService(spotifyWearableListenerService.d, (ServiceConnection) this.b, 1);
                    this.a = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            super.dispatchMessage(message);
            if (hasMessages(0)) {
            }
        } finally {
            if (!hasMessages(0)) {
                a("dispatch");
            }
        }
    }
}

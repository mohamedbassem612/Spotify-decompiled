package p;

import com.spotify.androidx.workmanager.SpotifyRxWorker;
import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class n6b1 implements Action {
    public final /* synthetic */ byte a;
    public final /* synthetic */ SpotifyRxWorker b;

    public /* synthetic */ n6b1(SpotifyRxWorker spotifyRxWorker, byte b) {
        this.a = b;
        this.b = spotifyRxWorker;
    }

    public final void run() {
        byte b = this.a;
        SpotifyRxWorker spotifyRxWorker = this.b;
        switch (b) {
            case 0:
                spotifyRxWorker.g.b();
                break;
            default:
                spotifyRxWorker.g.d(ob51.h(spotifyRxWorker));
                break;
        }
    }
}

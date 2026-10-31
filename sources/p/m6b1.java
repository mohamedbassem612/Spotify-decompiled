package p;

import com.spotify.androidx.workmanager.SpotifyRxWorker;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class m6b1 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ SpotifyRxWorker b;

    public /* synthetic */ m6b1(SpotifyRxWorker spotifyRxWorker, byte b) {
        this.a = b;
        this.b = spotifyRxWorker;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        SpotifyRxWorker spotifyRxWorker = this.b;
        switch (b) {
            case 0:
                y8d0 y8d0Var = (y8d0) obj;
                boolean zB = spotifyRxWorker.b();
                zvl1 zvl1Var = spotifyRxWorker.g;
                if (!zB) {
                    zvl1Var.c(ob51.p(y8d0Var));
                } else {
                    zvl1Var.b();
                }
                break;
            default:
                spotifyRxWorker.g.e((Throwable) obj);
                break;
        }
    }
}

package p;

import android.content.Context;
import com.spotify.notifications.notifications.firebaseservice.SpotifyFirebaseMessagingService;
import com.spotify.preload.logger.LoginTimeReporterWorker;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vzp implements dl4 {
    public final /* synthetic */ byte a;
    public final daq b;

    public /* synthetic */ vzp(daq daqVar, byte b) {
        this.a = b;
        this.b = daqVar;
    }

    public void w(Object obj) {
        byte b = this.a;
        daq daqVar = this.b;
        switch (b) {
            case 3:
                LoginTimeReporterWorker loginTimeReporterWorker = (LoginTimeReporterWorker) obj;
                loginTimeReporterWorker.h = (Observable) daqVar.hb.get();
                loginTimeReporterWorker.i = new zsc((yqg) daqVar.J1.get(), (r241) daqVar.R5.get(), (xov0) daqVar.D6.get(), daqVar.x1(), (byte) 18);
                loginTimeReporterWorker.j = (yqg) daqVar.J1.get();
                break;
            default:
                SpotifyFirebaseMessagingService spotifyFirebaseMessagingService = (SpotifyFirebaseMessagingService) obj;
                spotifyFirebaseMessagingService.i = new rp5((Context) daqVar.x1.a, daqVar.R1());
                spotifyFirebaseMessagingService.t = (nfa0) daqVar.b2.get();
                spotifyFirebaseMessagingService.h = (zg4) daqVar.Qh.get();
                spotifyFirebaseMessagingService.g = (xxy0) daqVar.yk.get();
                break;
        }
    }

    public /* synthetic */ vzp(daq daqVar, teq teqVar, byte b) {
        this.a = b;
        this.b = daqVar;
    }
}

package p;

import android.content.Context;
import com.spotify.music.alarmlauncher.SpotifyAlarmLauncherReceiver;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rzp implements dl4 {
    public final /* synthetic */ byte a;
    public final daq b;

    public /* synthetic */ rzp(daq daqVar, byte b) {
        this.a = b;
        this.b = daqVar;
    }

    public void w(Object obj) {
        byte b = this.a;
        daq daqVar = this.b;
        switch (b) {
            case 4:
                w1t0 w1t0Var = (w1t0) obj;
                w1t0Var.V1 = new y1t0((g341) daqVar.Fh.get(), (byte) 0);
                w1t0Var.W1 = (Scheduler) daqVar.z1.get();
                break;
            default:
                ((SpotifyAlarmLauncherReceiver) obj).b = new e4b1(new cfd((Context) daqVar.x1.a, (t961) daqVar.J2.get(), (byte) 25), (byte) 11);
                break;
        }
    }

    public /* synthetic */ rzp(daq daqVar, teq teqVar, byte b) {
        this.a = b;
        this.b = daqVar;
    }
}

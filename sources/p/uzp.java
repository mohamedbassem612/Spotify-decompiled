package p;

import android.content.Context;
import com.spotify.appauthorization.externallogin.LoginRedirectActivity;
import com.spotify.music.alarmlauncher.SpotifyAlarmLauncherService;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class uzp implements dl4 {
    public final /* synthetic */ byte a;
    public final daq b;

    public /* synthetic */ uzp(daq daqVar, byte b) {
        this.a = b;
        this.b = daqVar;
    }

    public hr0 a() {
        return new hr0((t2j0) this.b.f2.get());
    }

    public void w(Object obj) {
        byte b = this.a;
        daq daqVar = this.b;
        switch (b) {
            case 4:
                LoginRedirectActivity loginRedirectActivity = (LoginRedirectActivity) obj;
                ((mzo) loginRedirectActivity).a1 = (jgu) daqVar.a.g0.get();
                loginRedirectActivity.e1 = (nbr) daqVar.io.get();
                loginRedirectActivity.d1 = (u2f0) daqVar.Cf.get();
                break;
            default:
                ((SpotifyAlarmLauncherService) obj).a = new toj0(new gid((Context) daqVar.x1.a, (xs80) daqVar.b3.get(), (byte) 25), (rd30) daqVar.Hh.get(), new mo80((xh61) daqVar.Uj.get(), new isc((iyc0) daqVar.g5.get()), new yt91(new gid((Context) daqVar.x1.a, (xs80) daqVar.b3.get(), (byte) 25), (oo70) daqVar.M2.get(), a(), (byte) 19), (Scheduler) daqVar.z1.get(), a()), new p4t((xh61) daqVar.Uj.get(), new isc((iyc0) daqVar.g5.get()), new yt91(new gid((Context) daqVar.x1.a, (xs80) daqVar.b3.get(), (byte) 25), (oo70) daqVar.M2.get(), a(), (byte) 19), (Scheduler) daqVar.z1.get(), (yqg) daqVar.J1.get(), new hp91((yqg) daqVar.J1.get(), (byte) 13), a()), a());
                break;
        }
    }

    public /* synthetic */ uzp(daq daqVar, teq teqVar, byte b) {
        this.a = b;
        this.b = daqVar;
    }
}

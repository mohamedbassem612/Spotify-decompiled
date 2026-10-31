package p;

import android.content.Context;
import com.spotify.mediasession.mediasession.receiver.MediaButtonReceiver;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class i3q implements dl4 {
    public final daq a;

    @Override // p.dl4
    public void w(Object obj) {
        MediaButtonReceiver mediaButtonReceiver = (MediaButtonReceiver) obj;
        daq daqVar = this.a;
        gio1.v(mediaButtonReceiver, (zn41) daqVar.am.get());
        gio1.s(mediaButtonReceiver, (zce0) daqVar.dj.get());
        gio1.t(mediaButtonReceiver, i7v0.b((Context) daqVar.x1.a, qvh0.z((g420) daqVar.O2.get())));
        gio1.r(mediaButtonReceiver, (Scheduler) daqVar.A2.get());
        gio1.u(mediaButtonReceiver, (Scheduler) daqVar.z1.get());
        gio1.w(mediaButtonReceiver, daqVar.R1());
        gio1.q(mediaButtonReceiver, (oo70) daqVar.M2.get());
    }
}

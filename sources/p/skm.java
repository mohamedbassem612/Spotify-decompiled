package p;

import com.spotify.player.model.PlayOrigin;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class skm {
    public final /* synthetic */ xaq a;

    public skm(xaq xaqVar) {
        this.a = xaqVar;
    }

    public final i6v0 a(ruz ruzVar, PlayOrigin playOrigin, muz muzVar) {
        daq daqVar = (daq) this.a.a.c;
        Flowable flowable = (Flowable) daqVar.D5.get();
        dy4 dy4Var = (dy4) daqVar.Mp.get();
        b7r0 b7r0Var = (b7r0) daqVar.p7.get();
        yqg yqgVar = (yqg) daqVar.J1.get();
        hbq hbqVar = daqVar.a;
        daq daqVar2 = hbqVar.a;
        return new i6v0(new c21(flowable, dy4Var, b7r0Var, yqgVar, new z281((h481) daqVar2.Ip.get(), (x3v0) daqVar2.T9.get(), g7y.m((zdp) hbqVar.a.Op.get())), (Scheduler) daqVar.r3.get(), playOrigin, ruzVar, muzVar));
    }
}

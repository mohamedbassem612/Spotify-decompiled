package p;

import com.spotify.player.model.PlayOrigin;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class c8q implements mxh0 {
    public final /* synthetic */ caq a;

    public c8q(caq caqVar) {
        this.a = caqVar;
    }

    @Override // p.mxh0
    public final /* bridge */ /* synthetic */ lxh0 a(x610 x610Var, PlayOrigin playOrigin) {
        return b(x610Var, playOrigin, 1);
    }

    public final kc9 b(x610 x610Var, PlayOrigin playOrigin, int i) {
        daq daqVar = this.a.a;
        return new kc9(x610Var, playOrigin, i, (Flowable) daqVar.D5.get(), daqVar.Z(), (g510) daqVar.L5.get(), (d8q) daqVar.ef.get(), (r8l) daqVar.ff.get(), daqVar.Y1(), (g0l) daqVar.E5.get(), daqVar.Y(), (Scheduler) daqVar.r3.get(), (phl1) daqVar.gf.get(), (e8q) daqVar.jf.get(), new uic((byte) 18));
    }
}

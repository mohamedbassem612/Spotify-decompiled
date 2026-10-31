package p;

import com.spotify.player.model.PlayOrigin;
import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class f8q implements mxh0 {
    public final /* synthetic */ caq a;

    public f8q(caq caqVar) {
        this.a = caqVar;
    }

    public final /* bridge */ /* synthetic */ lxh0 a(x610 x610Var, PlayOrigin playOrigin) {
        return b(x610Var, playOrigin, 1);
    }

    public final lrd b(x610 x610Var, PlayOrigin playOrigin, int i) {
        daq daqVar = this.a.a;
        oyr oyrVarZ = daqVar.Z();
        g510 g510Var = (g510) daqVar.L5.get();
        d8q d8qVar = (d8q) daqVar.ef.get();
        r8l r8lVar = (r8l) daqVar.ff.get();
        v64 v64Var = (v64) ((ghp) daqVar.qa.get()).b.get();
        c8o.m(v64Var);
        return new lrd(x610Var, playOrigin, i, oyrVarZ, g510Var, d8qVar, r8lVar, v64Var, daqVar.Y1(), daqVar.Y(), (a6h1) daqVar.lf.get(), new y6x0((byte) 28), (phl1) daqVar.gf.get(), (Flowable) daqVar.D5.get(), (g0l) daqVar.E5.get(), (e8q) daqVar.jf.get(), new uic(false));
    }
}

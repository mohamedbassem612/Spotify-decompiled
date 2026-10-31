package p;

import com.spotify.player.model.PlayOrigin;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class g8q implements mxh0 {
    public final /* synthetic */ caq a;

    public g8q(caq caqVar) {
        this.a = caqVar;
    }

    @Override // p.mxh0
    public final /* bridge */ /* synthetic */ lxh0 a(x610 x610Var, PlayOrigin playOrigin) {
        return b(x610Var, playOrigin, 1);
    }

    public final v7s b(x610 x610Var, PlayOrigin playOrigin, int i) {
        daq daqVar = this.a.a;
        return new v7s(x610Var, playOrigin, i, daqVar.Z(), (g510) daqVar.L5.get(), (d8q) daqVar.ef.get(), (r8l) daqVar.ff.get(), daqVar.Y1(), daqVar.Y(), (phl1) daqVar.gf.get(), (e8q) daqVar.jf.get(), new uic((byte) 18));
    }
}

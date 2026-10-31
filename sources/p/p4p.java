package p;

import com.spotify.player.model.PlayOrigin;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class p4p {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ p4p(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final kdy0 a(iac0 iac0Var, PlayOrigin playOrigin) {
        byte b = this.a;
        b2p b2pVar = this.b;
        switch (b) {
            case 0:
                pp11 pp11Var = (pp11) ((fme) ((wzn) b2pVar.c).a).k.get();
                c8o.l(pp11Var);
                return new kdy0(pp11Var, iac0Var, playOrigin);
            default:
                pp11 pp11Var2 = ((eto) ((f0a) ((d7p) b2pVar).c).b).f0;
                c8o.l(pp11Var2);
                return new kdy0(pp11Var2, iac0Var, playOrigin);
        }
    }
}

package p;

import com.spotify.betamax.player.offline.exception.BetamaxDownloadException;
import com.spotify.messages.BetamaxDownloadError;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class uma implements vma {
    public final t2j0 a;

    public uma(t2j0 t2j0Var) {
        this.a = t2j0Var;
    }

    public final void g(swu swuVar, long j, BetamaxDownloadException betamaxDownloadException, long j2) {
        tma tmaVarN = BetamaxDownloadError.n();
        int i = betamaxDownloadException.a;
        int i2 = 1;
        if (i == 1) {
            i2 = 0;
        } else if (i != 2) {
            i2 = 3;
            if (i != 3) {
                throw null;
            }
        }
        tmaVarN.n(i2);
        String message = betamaxDownloadException.getMessage();
        if (message == null) {
            message = "";
        }
        tmaVarN.q(message);
        tmaVarN.r("BetamaxDownloadException");
        tmaVarN.s(v9p1.J(betamaxDownloadException));
        tmaVarN.t(v9p1.I(betamaxDownloadException));
        tmaVarN.w(swuVar.b);
        tmaVarN.u();
        tmaVarN.v(swuVar.a.a);
        this.a.a(tmaVarN.build());
    }
}

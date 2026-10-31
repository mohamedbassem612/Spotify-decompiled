package p;

import com.spotify.connectivity.httpwebgate.WebgateTokenProvider;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class bz81 {
    public final f0f1 a;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final az81 c;

    public bz81(f0f1 f0f1Var, boolean z, q8n q8nVar) {
        this.a = f0f1Var;
        this.c = new az81(null, f0f1Var, z ? er81.f : er81.g, gr81.e, null, q8nVar);
    }

    public final String a() {
        return b(false);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.connectivity.httpwebgate.WebgateTokenProvider$WebgateTokenException */
    public final String b(boolean z) throws WebgateTokenProvider.WebgateTokenException {
        q0f1 q0f1Var;
        String str;
        int i;
        o6x o6xVar = o6x.a;
        boolean z2 = this.b.get();
        az81 az81Var = this.c;
        if (z2) {
            if (az81Var.h == az81Var.g.getAndIncrement()) {
                az81Var.a.cancel();
            }
            throw new WebgateTokenProvider.WebgateTokenException("we intentionally forgot credentials, because of logout");
        }
        Object objT = null;
        if (z) {
            try {
                objT = jo31.t(o6xVar, new wy81(az81Var, null, (byte) 0));
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            q0f1Var = (q0f1) objT;
        } else {
            try {
                objT = jo31.t(o6xVar, new wy81(az81Var, null, (byte) 1));
            } catch (InterruptedException unused2) {
                Thread.currentThread().interrupt();
            }
            q0f1Var = (q0f1) objT;
        }
        if (this.b.get()) {
            az81 az81Var2 = this.c;
            if (az81Var2.h == az81Var2.g.getAndIncrement()) {
                az81Var2.a.cancel();
            }
            throw new WebgateTokenProvider.WebgateTokenException("we intentionally forgot credentials, because of logout");
        }
        if (q0f1Var != null && (i = q0f1Var.f) > 0) {
            throw new WebgateTokenProvider.WebgateTokenException(ab80.n("sp://auth/v2/token responded with an error: ", ", ", i, q0f1Var.g));
        }
        if (q0f1Var == null || (str = q0f1Var.b) == null) {
            throw new WebgateTokenProvider.WebgateTokenException("tokenResponse with null accessToken");
        }
        return str;
    }
}

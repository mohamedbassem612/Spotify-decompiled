package p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.functions.Action;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class i5b1 implements Action {
    public final /* synthetic */ long a;
    public final /* synthetic */ n5b1 b;

    public i5b1(long j, n5b1 n5b1Var) {
        this.a = j;
        this.b = n5b1Var;
    }

    public final void run() {
        n5b1 n5b1Var = this.b;
        long j = n5b1Var.F;
        long j2 = this.a;
        if (j2 != j) {
            Logger.b("MBS: Ignoring stale EIP doFinally (generation=%d, current=%d)", new Object[]{Long.valueOf(j2), Long.valueOf(n5b1Var.F)});
            return;
        }
        Logger.b("MBS: onExternalIntegrationPlatformDisconnected: stopping service (generation=%d)", new Object[]{Long.valueOf(j)});
        if (!n5b1Var.G.isDisposed()) {
            n5b1Var.G.dispose();
        }
        i4m i4mVar = (i4m) n5b1Var.E.getValue();
        xab1 xab1Var = i4mVar.e;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        i4mVar.e = null;
        uhh0 uhh0VarC = n5b1Var.c();
        uhh0VarC.c.b.clear();
        uhh0VarC.a.i(false);
        uhh0VarC.d.c = null;
        n5b1Var.D.g();
        n5b1Var.f.stopSelf();
    }
}

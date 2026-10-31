package p;

import com.spotify.mobius.runners.WorkRunner;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class hgu implements WorkRunner {
    public final llm a;

    public hgu(q8n q8nVar) {
        j0d1 j0d1VarB = guo1.B();
        p8n p8nVar = q8n.b;
        this.a = smo1.e(flo1.l(j0d1VarB, q8nVar.M(1)));
    }

    public final void dispose() {
        smo1.p(this.a, (CancellationException) null);
    }

    public final void post(Runnable runnable) {
        fn31.T(this.a, (o8n) null, 0, new fgu(runnable, null, (byte) 1), 3);
    }
}

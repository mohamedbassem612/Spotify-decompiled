package p;

import android.content.Context;
import com.spotify.base.java.logging.Logger;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class elr {
    public final Context a;
    public final Executor b;
    public final Executor c;
    public final AtomicBoolean d = new AtomicBoolean();
    public final ayh e = sap1.a();

    public elr(Context context, q8n q8nVar, Executor executor) {
        this.a = context;
        this.b = executor;
        this.c = qgo1.l(q8nVar);
    }

    public static int a(int i) {
        b3e b3eVar;
        try {
            try {
                pue0 pue0Var = b3e.l;
                zod.n("Must be called from the main thread.");
                b3eVar = b3e.n;
            } catch (Exception e) {
                Logger.d("CastBasic->%s", "castContext() failed: " + e.getMessage());
                b3eVar = null;
            }
            if (b3eVar == null) {
                return -1;
            }
            q3e q3eVar = b3eVar.k;
            if (q3eVar != null) {
                return q3eVar.b(i);
            }
            b3e.l.c("castReasonCodes hasn't been initialized yet", new Object[0]);
            return 0;
        } catch (Exception e2) {
            Logger.d("CastBasic->%s", l1d.m("getCastReasonCodeForCastStatusCode() failed: ", e2.getMessage()));
            return -1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(onm onmVar) {
        dlr dlrVar;
        if (onmVar instanceof dlr) {
            dlrVar = (dlr) onmVar;
            int i = dlrVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dlrVar.c = i - Integer.MIN_VALUE;
            } else {
                dlrVar = new dlr(this, onmVar);
            }
        } else {
            dlrVar = new dlr(this, onmVar);
        }
        Object obj = dlrVar.a;
        int i2 = dlrVar.c;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
            c();
            ayh ayhVar = this.e;
            dlrVar.c = 1;
            Object objQ = ayhVar.Q(dlrVar);
            d9n d9nVar = d9n.a;
            return objQ == d9nVar ? d9nVar : objQ;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.d("CastBasic->%s", l1d.m("getSessionManager() failed: ", e2.getMessage()));
            return null;
        }
    }

    public final void c() {
        if (this.d.compareAndSet(false, true)) {
            try {
                this.c.execute(new a6n(this, (byte) 4));
            } catch (Exception e) {
                Logger.d("CastBasic->%s", l1d.m("startInitializationOnce() failed: ", e.getMessage()));
                this.e.y0(e);
            }
        }
    }
}

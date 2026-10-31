package p;

import com.spotify.base.java.logging.Logger;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lw5 implements mw5 {
    public final vn8 a;
    public final llm b;
    public final ayh c = sap1.a();
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final AtomicBoolean e = new AtomicBoolean(false);

    public lw5(vn8 vn8Var, q8n q8nVar) {
        this.a = vn8Var;
        this.b = us71.h(q8nVar);
    }

    @Override // p.mw5
    public final void a() {
        if (this.d.compareAndSet(false, true)) {
            long millis = TimeUnit.SECONDS.toMillis(((ut4) this.a.a.get()).a());
            Logger.b("[AppReadiness] App startup settled; delaying observer notification by %d ms", new Object[]{Long.valueOf(millis)});
            fn31.T(this.b, (o8n) null, 0, new kv2(millis, this, (lnm) null, (byte) 2), 3);
        }
    }
}

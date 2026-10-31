package p;

import com.spotify.mobius.functions.Consumer;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class y141 implements Consumer {
    public final /* synthetic */ AtomicBoolean a;
    public final /* synthetic */ ms20 b;

    public /* synthetic */ y141(AtomicBoolean atomicBoolean, ms20 ms20Var) {
        this.a = atomicBoolean;
        this.b = ms20Var;
    }

    public final void accept(Object obj) {
        AtomicBoolean atomicBoolean = this.a;
        ms20 ms20Var = this.b;
        synchronized (atomicBoolean) {
            try {
                if (!atomicBoolean.get()) {
                    ms20Var.accept(obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

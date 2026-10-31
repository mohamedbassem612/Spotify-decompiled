package p;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class v800 implements hnc1, noy0 {
    public final HashMap a = new HashMap();
    public ArrayDeque b = new ArrayDeque();
    public final Executor c;

    public v800(Executor executor) {
        this.c = executor;
    }

    public final synchronized void a(Executor executor, ka00 ka00Var) {
        try {
            executor.getClass();
            if (!this.a.containsKey(rwq.class)) {
                this.a.put(rwq.class, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.a.get(rwq.class)).put(ka00Var, executor);
        } catch (Throwable th) {
            throw th;
        }
    }
}

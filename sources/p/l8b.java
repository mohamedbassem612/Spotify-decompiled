package p;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class l8b extends q6 {
    public final Thread e;
    public final ab00 f;

    public l8b(o8n o8nVar, Thread thread, ab00 ab00Var) {
        super(o8nVar, true, true);
        this.e = thread;
        this.f = ab00Var;
    }

    @Override // p.saa0
    public final void N(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.e;
        if (u890.j(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}

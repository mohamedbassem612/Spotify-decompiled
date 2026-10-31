package p;

import android.os.Looper;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ggu extends csd1 {
    public final q8n a;
    public final q8n b;
    public final llm c;

    public ggu(q8n q8nVar, q8n q8nVar2) {
        this.a = q8nVar2;
        p8n p8nVar = q8n.b;
        this.b = q8nVar.M(4);
        this.c = smo1.e(new z8n("DispatcherTaskExecutor"));
    }

    public final void a(Runnable runnable) {
        c921.y(this.c, this.b, 0, new q82(runnable, (lnm) null, (byte) 7), 2);
    }

    public final boolean c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public final void d(Runnable runnable) {
        c921.y(this.c, this.a, 0, new fgu(runnable, (lnm) null, (byte) 0), 2);
    }
}

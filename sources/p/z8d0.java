package p;

import android.content.Context;
import androidx.work.WorkerParameters;
import io.reactivex.rxjava3.core.Single;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class z8d0 {
    public final Context a;
    public final WorkerParameters b;
    public final AtomicInteger c = new AtomicInteger(-256);
    public boolean d;

    public z8d0(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            hhg1.n("Application Context is null");
            throw null;
        }
        if (workerParameters == null) {
            hhg1.n("WorkerParameters is null");
            throw null;
        }
        this.a = context;
        this.b = workerParameters;
    }

    public pzc a() {
        return upn1.t(new h341(this, Single.error(new IllegalStateException("Expedited WorkRequests require a RxWorker to provide an implementation for `getForegroundInfo()`")), (byte) 0));
    }

    public final boolean b() {
        return this.c.get() != -256;
    }

    public abstract pzc d();

    public final void e(int i) {
        if (this.c.compareAndSet(-256, i)) {
            c();
        }
    }

    public void c() {
    }
}

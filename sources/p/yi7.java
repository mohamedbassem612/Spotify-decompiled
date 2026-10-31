package p;

import android.os.Looper;
import androidx.core.os.OperationCanceledException;
import app.p000rive.semantics.SemanticState;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class yi7 implements Runnable {
    public static final ThreadPoolExecutor h;
    public static jim0 i;
    public final sra a;
    public final pdf0 b;
    public volatile int c = 1;
    public final AtomicBoolean d = new AtomicBoolean();
    public final AtomicBoolean e = new AtomicBoolean();
    public final CountDownLatch f;
    public final /* synthetic */ dan1 g;

    static {
        bus busVar = new bus((byte) 2);
        h = new ThreadPoolExecutor(5, SemanticState.Focused, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(10), busVar);
    }

    public yi7(dan1 dan1Var) {
        this.g = dan1Var;
        sra sraVar = new sra(this, (byte) 9);
        this.a = sraVar;
        this.b = new pdf0(this, sraVar);
        this.f = new CountDownLatch(1);
    }

    public final void a() {
        try {
            dan1 dan1Var = this.g;
            Iterator it = dan1Var.j.iterator();
            if (it.hasNext()) {
                ((j8n1) it.next()).getClass();
                throw new UnsupportedOperationException();
            }
            try {
                dan1Var.i.tryAcquire(0, 5L, TimeUnit.SECONDS);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } catch (OperationCanceledException e) {
            if (!this.d.get()) {
                throw e;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(Object obj) {
        jim0 jim0Var;
        synchronized (yi7.class) {
            try {
                jim0Var = i;
                if (jim0Var == null) {
                    jim0Var = new jim0(Looper.getMainLooper(), (byte) 0, (boolean) (0 == true ? 1 : 0));
                    i = jim0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        jim0Var.obtainMessage(1, new iim0(this, obj)).sendToTarget();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.g.a();
    }
}

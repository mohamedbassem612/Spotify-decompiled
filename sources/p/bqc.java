package p;

import android.os.Process;
import java.util.concurrent.PriorityBlockingQueue;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bqc extends Thread {
    public static final boolean g = vqk1.a;
    public final PriorityBlockingQueue a;
    public final PriorityBlockingQueue b;
    public final d18 c;
    public final ouz d;
    public volatile boolean e = false;
    public final cik1 f;

    public bqc(PriorityBlockingQueue priorityBlockingQueue, PriorityBlockingQueue priorityBlockingQueue2, d18 d18Var, ouz ouzVar) {
        this.a = priorityBlockingQueue;
        this.b = priorityBlockingQueue2;
        this.c = d18Var;
        this.d = ouzVar;
        this.f = new cik1(this, priorityBlockingQueue2, ouzVar);
    }

    private void a() {
        mn21 mn21Var = (mn21) this.a.take();
        mn21Var.addMarker("cache-queue-take");
        mn21Var.sendEvent(1);
        try {
            if (mn21Var.isCanceled()) {
                mn21Var.finish("cache-discard-canceled");
                mn21Var.sendEvent(2);
                return;
            }
            opc opcVarK = this.c.k(mn21Var.getCacheKey());
            if (opcVarK == null) {
                mn21Var.addMarker("cache-miss");
                if (!this.f.k(mn21Var)) {
                    this.b.put(mn21Var);
                }
                mn21Var.sendEvent(2);
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (opcVarK.e < jCurrentTimeMillis) {
                mn21Var.addMarker("cache-hit-expired");
                mn21Var.setCacheEntry(opcVarK);
                if (!this.f.k(mn21Var)) {
                    this.b.put(mn21Var);
                }
                mn21Var.sendEvent(2);
                return;
            }
            mn21Var.addMarker("cache-hit");
            ty21 networkResponse = mn21Var.parseNetworkResponse(new h8o0(opcVarK.a, opcVarK.g));
            mn21Var.addMarker("cache-hit-parsed");
            if (networkResponse.c == null) {
                if (opcVarK.f < jCurrentTimeMillis) {
                    mn21Var.addMarker("cache-hit-refresh-needed");
                    mn21Var.setCacheEntry(opcVarK);
                    networkResponse.d = true;
                    boolean zK = this.f.k(mn21Var);
                    ouz ouzVar = this.d;
                    if (zK) {
                        ouzVar.s(mn21Var, networkResponse, (xwn1) null);
                    } else {
                        ouzVar.s(mn21Var, networkResponse, new xwn1(this, mn21Var, false, (byte) 6));
                    }
                } else {
                    this.d.s(mn21Var, networkResponse, (xwn1) null);
                }
                mn21Var.sendEvent(2);
                return;
            }
            mn21Var.addMarker("cache-parsing-failed");
            d18 d18Var = this.c;
            String cacheKey = mn21Var.getCacheKey();
            synchronized (d18Var) {
                opc opcVarK2 = d18Var.k(cacheKey);
                if (opcVarK2 != null) {
                    opcVarK2.f = 0L;
                    opcVarK2.e = 0L;
                    d18Var.p(cacheKey, opcVarK2);
                }
            }
            mn21Var.setCacheEntry(null);
            if (!this.f.k(mn21Var)) {
                this.b.put(mn21Var);
            }
            mn21Var.sendEvent(2);
        } catch (Throwable th) {
            mn21Var.sendEvent(2);
            throw th;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (g) {
            vqk1.b("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.c.n();
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                vqk1.a("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}

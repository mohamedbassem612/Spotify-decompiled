package p;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import com.android.volley.VolleyError;
import java.util.concurrent.PriorityBlockingQueue;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class f7o0 extends Thread {
    public final PriorityBlockingQueue a;
    public final it8 b;
    public final d18 c;
    public final ouz d;
    public volatile boolean e = false;

    public f7o0(PriorityBlockingQueue priorityBlockingQueue, it8 it8Var, d18 d18Var, ouz ouzVar) {
        this.a = priorityBlockingQueue;
        this.b = it8Var;
        this.c = d18Var;
        this.d = ouzVar;
    }

    private void a() {
        mn21 mn21Var = (mn21) this.a.take();
        ouz ouzVar = this.d;
        vi7 vi7Var = (vi7) ouzVar.b;
        SystemClock.elapsedRealtime();
        mn21Var.sendEvent(3);
        try {
            mn21Var.addMarker("network-queue-take");
            if (mn21Var.isCanceled()) {
                mn21Var.finish("network-discard-cancelled");
                mn21Var.notifyListenerResponseNotUsable();
                return;
            }
            TrafficStats.setThreadStatsTag(mn21Var.getTrafficStatsTag());
            h8o0 h8o0VarQ = this.b.q(mn21Var);
            mn21Var.addMarker("network-http-complete");
            if (h8o0VarQ.d && mn21Var.hasHadResponseDelivered()) {
                mn21Var.finish("not-modified");
                mn21Var.notifyListenerResponseNotUsable();
                return;
            }
            ty21 networkResponse = mn21Var.parseNetworkResponse(h8o0VarQ);
            mn21Var.addMarker("network-parse-complete");
            if (mn21Var.shouldCache() && networkResponse.b != null) {
                this.c.p(mn21Var.getCacheKey(), networkResponse.b);
                mn21Var.addMarker("network-cache-written");
            }
            mn21Var.markDelivered();
            ouzVar.s(mn21Var, networkResponse, (xwn1) null);
            mn21Var.notifyListenerResponseReceived(networkResponse);
        } catch (VolleyError e) {
            SystemClock.elapsedRealtime();
            VolleyError networkError = mn21Var.parseNetworkError(e);
            mn21Var.addMarker("post-error");
            vi7Var.execute(new uu1(mn21Var, new ty21(networkError), null, (byte) 13));
            mn21Var.notifyListenerResponseNotUsable();
        } catch (Exception e2) {
            vqk1.a("Unhandled exception %s", e2.toString());
            VolleyError volleyError = new VolleyError(e2);
            SystemClock.elapsedRealtime();
            mn21Var.addMarker("post-error");
            vi7Var.execute(new uu1(mn21Var, new ty21(volleyError), null, (byte) 13));
            mn21Var.notifyListenerResponseNotUsable();
        } finally {
            mn21Var.sendEvent(4);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                vqk1.a("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}

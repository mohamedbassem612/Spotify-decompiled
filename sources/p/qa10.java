package p;

import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class qa10 implements qoj1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sa10 b;

    public /* synthetic */ qa10(sa10 sa10Var, byte b) {
        this.a = b;
        this.b = sa10Var;
    }

    @Override // p.qoj1
    public final void run() {
        byte b = this.a;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        byte b2 = 21;
        sa10 sa10Var = this.b;
        switch (b) {
            case 0:
                if (sa10Var.S0) {
                    sa10Var.V0 = true;
                }
                if (sa10Var.X.isEmpty() && sa10Var.Q0 == null) {
                    dos dosVar = sa10Var.f;
                    dosVar.getClass();
                    dosVar.a();
                    x8r.a();
                    ScheduledFuture scheduledFuture = sa10Var.T0;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    sa10Var.T0 = null;
                } else {
                    sa10Var.P0 = true;
                    ScheduledFuture scheduledFuture2 = sa10Var.T0;
                    if (scheduledFuture2 != null) {
                        scheduledFuture2.cancel(false);
                    }
                    sa10Var.T0 = null;
                    sa10Var.T0 = sa10Var.Y.schedule(new fss(sa10Var, b2), sa10.Z0, timeUnit);
                }
                break;
            case 1:
                sa10Var.V0 = false;
                break;
            case 2:
                try {
                    sa10Var.S();
                } catch (RuntimeException e) {
                    sa10Var.W0 = e;
                    oon1.w("Failed to remove texture frames", e);
                    CountDownLatch countDownLatch = sa10Var.U0;
                    if (countDownLatch != null) {
                        countDownLatch.countDown();
                        return;
                    }
                    return;
                }
                break;
            case 3:
                sa10Var.Q0 = null;
                if (sa10Var.P0 && sa10Var.X.isEmpty()) {
                    sa10Var.P0 = false;
                    dos dosVar2 = sa10Var.f;
                    dosVar2.getClass();
                    dosVar2.a();
                    x8r.a();
                    ScheduledFuture scheduledFuture3 = sa10Var.T0;
                    if (scheduledFuture3 != null) {
                        scheduledFuture3.cancel(false);
                    }
                    sa10Var.T0 = null;
                } else {
                    sa10Var.R();
                }
                break;
            case 4:
                x8r.a();
                if (sa10Var.S0) {
                    ConcurrentLinkedQueue concurrentLinkedQueue = sa10Var.X;
                    xj30 xj30Var = sa10Var.R0;
                    xj30Var.getClass();
                    concurrentLinkedQueue.add(xj30Var);
                }
                if (!sa10Var.V0) {
                    if (sa10Var.P0) {
                        ScheduledFuture scheduledFuture4 = sa10Var.T0;
                        if (scheduledFuture4 != null) {
                            scheduledFuture4.cancel(false);
                        }
                        sa10Var.T0 = null;
                        sa10Var.T0 = sa10Var.Y.schedule(new fss(sa10Var, b2), sa10.Z0, timeUnit);
                    }
                    sa10Var.O0++;
                    sa10Var.R();
                    break;
                } else {
                    sa10Var.i.updateTexImage();
                    sa10Var.X.poll();
                    if (sa10Var.U0 != null && sa10Var.X.isEmpty()) {
                        sa10Var.U0.countDown();
                        break;
                    }
                }
                break;
            default:
                if (sa10Var.O0 != sa10Var.X.size()) {
                    int size = sa10Var.X.size();
                    long j = sa10.Z0;
                    int i = sa10Var.O0;
                    Locale locale = Locale.US;
                    oon1.H("Forcing EOS after missing " + size + " frames for " + j + " ms, with available frame count: " + i);
                    sa10Var.P0 = false;
                    sa10Var.Q0 = null;
                    sa10Var.V0 = true;
                    sa10Var.S();
                    sa10Var.X.clear();
                    sa10Var.L();
                    break;
                }
                break;
        }
    }
}

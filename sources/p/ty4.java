package p;

import android.os.Trace;
import android.view.Choreographer;
import android.view.View;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ty4 implements mov0, View.OnAttachStateChangeListener, Runnable, Choreographer.FrameCallback {
    public static long h;
    public final View a;
    public boolean c;
    public boolean f;
    public long g;
    public final PriorityQueue b = new PriorityQueue(11, new m((byte) 1));
    public final Choreographer d = Choreographer.getInstance();
    public final kqc1 e = new kqc1();

    static {
        new n9x0((byte) 28);
    }

    public ty4(View view) {
        this.a = view;
        n9x0.a(view);
        view.addOnAttachStateChangeListener(this);
        if (view.isAttachedToWindow()) {
            this.f = true;
        }
    }

    @Override // p.mov0
    public final void a(kov0 kov0Var) {
        this.b.add(new gow0(1, kov0Var));
        if (this.c) {
            return;
        }
        this.c = true;
        this.a.post(this);
    }

    public final boolean b() {
        kqc1 kqc1Var = this.e;
        long jA = kqc1Var.a();
        d55.k(jA, "compose:lazy:prefetch:available_time_nanos");
        boolean z = true;
        if (jA > 0) {
            PriorityQueue priorityQueue = this.b;
            Object objPeek = priorityQueue.peek();
            objPeek.getClass();
            if (!((gow0) objPeek).a().c(kqc1Var)) {
                priorityQueue.poll();
                z = false;
            }
            kqc1Var.c(false);
        }
        return z;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.f) {
            this.g = j;
            this.a.post(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f = false;
        this.a.removeCallbacks(this);
        this.d.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        PriorityQueue priorityQueue = this.b;
        if (!priorityQueue.isEmpty() && this.c && this.f) {
            View view = this.a;
            if (view.getWindowVisibility() == 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime());
                boolean z = System.nanoTime() > (2 * h) + nanos;
                kqc1 kqc1Var = this.e;
                kqc1Var.c(z);
                kqc1Var.d(Math.max(this.g, nanos) + h);
                boolean zB = false;
                while (!priorityQueue.isEmpty() && !zB) {
                    if (kqc1Var.b()) {
                        Trace.beginSection("compose:lazy:prefetch:idle_frame");
                        try {
                            zB = b();
                            Trace.endSection();
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    } else {
                        zB = b();
                    }
                }
                if (zB) {
                    this.d.postFrameCallback(this);
                } else {
                    this.c = false;
                }
                d55.k(0L, "compose:lazy:prefetch:available_time_nanos");
                return;
            }
        }
        this.c = false;
    }
}

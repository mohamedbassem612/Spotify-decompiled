package p;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class op21 {
    public final AtomicInteger a;
    public final HashSet b;
    public final PriorityBlockingQueue c;
    public final PriorityBlockingQueue d;
    public final d18 e;
    public final it8 f;
    public final ouz g;
    public final f7o0[] h;
    public bqc i;
    public final ArrayList j;
    public final ArrayList k;

    public op21(d18 d18Var, it8 it8Var) {
        ouz ouzVar = new ouz(new Handler(Looper.getMainLooper()));
        this.a = new AtomicInteger();
        this.b = new HashSet();
        this.c = new PriorityBlockingQueue();
        this.d = new PriorityBlockingQueue();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.e = d18Var;
        this.f = it8Var;
        this.h = new f7o0[4];
        this.g = ouzVar;
    }

    public final void a(mn21 mn21Var) {
        mn21Var.setRequestQueue(this);
        synchronized (this.b) {
            this.b.add(mn21Var);
        }
        mn21Var.setSequence(this.a.incrementAndGet());
        mn21Var.addMarker("add-to-queue");
        b();
        if (mn21Var.shouldCache()) {
            this.c.add(mn21Var);
        } else {
            this.d.add(mn21Var);
        }
    }

    public final void b() {
        synchronized (this.k) {
            try {
                Iterator it = this.k.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

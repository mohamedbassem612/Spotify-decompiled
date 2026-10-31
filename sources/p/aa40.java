package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class aa40 implements dwo {
    public static final List b;
    public final List a;

    static {
        z940 z940Var = new z940("art.gc.gc-count", "device.gc.count", new hqj0("gc"));
        jqj0 jqj0Var = jqj0.a;
        b = p7h.M(new z940[]{z940Var, new z940("art.gc.gc-time", "device.gc.time", jqj0Var, 1000.0d), new z940("art.gc.blocking-gc-count", "device.gc.count_blocking", new hqj0("gc")), new z940("art.gc.blocking-gc-time", "device.gc.time_blocking", jqj0Var, 1000.0d), new z940("art.gc.pre-oome-gc-count", "device.gc.count_pre_oom_error", new hqj0("gc")), new z940("art.gc.total-time-waiting-for-gc", "device.gc.time_threads_blocked", jqj0Var, 1.0E9d), new z940("art.gc.bytes-allocated", "device.memory.bytes_allocated", gqj0.a)});
    }

    public aa40() {
        ArrayList arrayList;
        ba40 ba40Var = new ba40();
        hhp0 hhp0Var = hhp0.a;
        if (hhp0.y()) {
            List<z940> list = b;
            arrayList = new ArrayList(q7h.U(list, 10));
            for (z940 z940Var : list) {
                arrayList.add(hhp0.a.r(z940Var.b, z940Var.c, new hs20(z940Var, ba40Var, (byte) 8)));
            }
        } else {
            arrayList = z6x.a;
        }
        this.a = arrayList;
    }

    public final void shutdown() {
        Iterator it = b.iterator();
        while (it.hasNext()) {
            hhp0.a.unregisterObservableMetric(((z940) it.next()).b);
        }
    }
}

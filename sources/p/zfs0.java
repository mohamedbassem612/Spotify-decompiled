package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zfs0 {
    public final lbc0 a;
    public final yfs0 b = new yfs0(new AtomicBoolean(true));

    public zfs0(lbc0 lbc0Var) {
        this.a = lbc0Var;
    }

    public final void a(g700 g700Var) {
        yfs0 yfs0Var = this.b;
        List list = yfs0Var.b;
        if (yfs0Var.a.get()) {
            list.add(g700Var);
        } else {
            this.a.invoke(g700Var);
        }
    }

    public final void b(g700 g700Var) {
        lbc0 lbc0Var = this.a;
        lbc0Var.invoke(g700Var);
        yfs0 yfs0Var = this.b;
        AtomicBoolean atomicBoolean = yfs0Var.a;
        List list = yfs0Var.b;
        if (!atomicBoolean.getAndSet(false) || list.isEmpty()) {
            return;
        }
        Iterator it = new ArrayList(list).iterator();
        while (it.hasNext()) {
            lbc0Var.invoke(it.next());
        }
        list.clear();
    }
}

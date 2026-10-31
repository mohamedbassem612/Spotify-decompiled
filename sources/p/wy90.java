package p;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wy90 implements yt90 {
    public final List a;

    /* JADX WARN: Multi-variable type inference failed */
    public wy90(wx90 wx90Var, wr60 wr60Var, r3a0 r3a0Var, t2a0 t2a0Var, or90 or90Var) {
        this.a = p7h.M(new yt90[]{wx90Var, wr60Var, r3a0Var, t2a0Var, or90Var});
    }

    public final void start() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((yt90) it.next()).start();
        }
    }

    public final void stop() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((yt90) it.next()).stop();
        }
    }
}

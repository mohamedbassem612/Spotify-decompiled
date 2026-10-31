package p;

import com.spotify.base.java.logging.Logger;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class m7p0 {
    public final ien0 a = new ien0(new k7p0(null, f7p0.a));
    public final ArrayDeque b = new ArrayDeque();
    public final AtomicInteger c = new AtomicInteger(0);

    public final synchronized void a(l7p0 l7p0Var) {
        try {
            boolean zJ = u890.j(((k7p0) this.a.getValue()).a, l7p0Var);
            if (zJ) {
                this.a.c(new k7p0(null, f7p0.a));
            }
            this.b.removeIf(new l61(l7p0Var, (byte) 3));
            if (zJ) {
                ArrayDeque arrayDeque = this.b;
                if (!arrayDeque.isEmpty()) {
                    this.a.c(arrayDeque.remove());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(l7p0 l7p0Var, j7p0 j7p0Var) {
        try {
            ien0 ien0Var = this.a;
            if (((k7p0) ien0Var.getValue()).a == null || u890.j(((k7p0) ien0Var.getValue()).a, l7p0Var)) {
                this.a.c(new k7p0(l7p0Var, j7p0Var));
            } else {
                if (this.b.size() >= 10) {
                    Logger.k("NowPlayingVisibility: Dropped pending state due to queue overflow: " + ((k7p0) this.b.remove()), new Object[0]);
                }
                ArrayDeque arrayDeque = this.b;
                k7p0 k7p0Var = new k7p0(l7p0Var, j7p0Var);
                r7h.Z(arrayDeque, new y3o0(k7p0Var, (byte) 25), true);
                arrayDeque.add(k7p0Var);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}

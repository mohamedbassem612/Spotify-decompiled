package p;

import io.reactivex.rxjava3.functions.Consumer;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class hq51 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iq51 b;

    public /* synthetic */ hq51(iq51 iq51Var, byte b) {
        this.a = b;
        this.b = iq51Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        iq51 iq51Var = this.b;
        switch (b) {
            case 0:
                iq51Var.o = (Integer) obj;
                return;
            default:
                g1r g1rVar = (g1r) obj;
                boolean z = g1rVar.d;
                ReentrantLock reentrantLock = iq51Var.p;
                vku vkuVar = iq51Var.j;
                n36 n36Var = iq51Var.r;
                reentrantLock.lock();
                try {
                    n36Var.addLast(new h520(g1rVar));
                    mgc mgcVar = iq51Var.g;
                    if (mgcVar != null) {
                        mgcVar.c(iq51Var.c, new g1r(g1rVar.a, g1rVar.b, g1rVar.c, g1rVar.d, g1rVar.e, 0L, g1rVar.g));
                    }
                    iq51Var.n = g1rVar.g;
                    if (n36Var.c == 1) {
                        iq51Var.q.signal();
                        break;
                    }
                    return;
                } finally {
                    if (z) {
                        vkuVar.c();
                    }
                    reentrantLock.unlock();
                }
        }
    }
}

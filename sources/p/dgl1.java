package p;

import java.lang.ref.WeakReference;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dgl1 extends cc90 {
    public final ec90 b;
    public final WeakReference c;

    public dgl1(ec90 ec90Var, kn31 kn31Var) {
        super(kn31Var.a);
        this.b = ec90Var;
        this.c = new WeakReference(kn31Var);
    }

    @Override // p.cc90
    public final void b(Set set) {
        cc90 cc90Var = (cc90) this.c.get();
        if (cc90Var != null) {
            cc90Var.b(set);
            return;
        }
        ec90 ec90Var = this.b;
        ReentrantLock reentrantLock = ec90Var.d;
        reentrantLock.lock();
        try {
            vjp0 vjp0Var = (vjp0) ec90Var.c.remove(this);
            reentrantLock.unlock();
            if (vjp0Var != null) {
                bvg1 bvg1Var = ec90Var.b;
                if (bvg1Var.h.b(vjp0Var.a())) {
                    yah0.x(new dc90(ec90Var, null, (byte) 0));
                }
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}

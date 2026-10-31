package p;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public class fj7 extends gve1 {
    public static final up20 h;
    public static fj7 i;
    public static final ReentrantLock j;
    public static final Condition k;
    public static final char l;
    public static final long m;
    public byte e;
    public int f = -1;
    public long g;

    static {
        up20 up20Var = new up20();
        up20Var.b = new fj7[8];
        h = up20Var;
        ReentrantLock reentrantLock = new ReentrantLock();
        j = reentrantLock;
        k = reentrantLock.newCondition();
        l = (char) 60000;
        m = 60000000000L;
    }

    public final void i() {
        long j2 = this.c;
        boolean z = this.a;
        if (j2 != 0 || z) {
            ReentrantLock reentrantLock = j;
            reentrantLock.lock();
            try {
                if (this.e != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.e = (byte) 1;
                hm5.y(this);
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public final boolean j() {
        ReentrantLock reentrantLock = j;
        reentrantLock.lock();
        try {
            byte b = this.e;
            this.e = (byte) 0;
            if (b != 1) {
                return b == 2;
            }
            h.j(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void k() {
    }
}

package p;

import android.os.SystemClock;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zre0 {
    public final xre0 a;
    public final Object b = new Object();

    public zre0(xre0 xre0Var) {
        this.a = xre0Var;
    }

    public final void a(char c, String str, String str2, Throwable th) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (this.b) {
            ArrayDeque arrayDeque = this.a.a;
            nse0 nse0Var = arrayDeque.size() >= 500 ? (nse0) arrayDeque.removeFirst() : null;
            while (true) {
                nse0 nse0Var2 = (nse0) arrayDeque.peekFirst();
                if (nse0Var2 == null || nse0Var2.f >= jElapsedRealtime - 10000) {
                    break;
                    break;
                }
                nse0Var = (nse0) arrayDeque.removeFirst();
            }
            if (nse0Var == null) {
                nse0Var = new nse0();
            }
            nse0Var.f = jElapsedRealtime;
            arrayDeque.addLast(nse0Var);
            nse0Var.a = c;
            nse0Var.b = str;
            nse0Var.c = str2;
            nse0Var.d = th;
            nse0Var.e = jCurrentTimeMillis;
        }
    }
}

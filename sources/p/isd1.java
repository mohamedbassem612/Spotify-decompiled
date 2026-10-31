package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class isd1 {
    public static final Logger k = Logger.getLogger(isd1.class.getName());
    public static final isd1 l;
    public final utw0 a;
    public boolean d;
    public long e;
    public int f;
    public int g;
    public final Logger b = k;
    public int c = 10000;
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();
    public final g54 j = new g54(this, 16);

    static {
        y4n1 y4n1Var = new y4n1(l1d.n(z4n1.b, " TaskRunner", new StringBuilder()), true);
        utw0 utw0Var = new utw0();
        utw0Var.a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, (BlockingQueue<Runnable>) new SynchronousQueue(), (ThreadFactory) y4n1Var);
        l = new isd1(utw0Var);
    }

    public isd1(utw0 utw0Var) {
        this.a = utw0Var;
    }

    public final void a(yrd1 yrd1Var, long j, boolean z) {
        TimeZone timeZone = z4n1.a;
        hsd1 hsd1Var = yrd1Var.c;
        hsd1Var.getClass();
        if (hsd1Var.d != yrd1Var) {
            eg.m("Check failed.");
            return;
        }
        boolean z2 = hsd1Var.f;
        hsd1Var.f = false;
        hsd1Var.d = null;
        this.h.remove(hsd1Var);
        if (j != -1 && !z2 && !hsd1Var.c) {
            hsd1Var.f(yrd1Var, j, true);
        }
        if (hsd1Var.e.isEmpty()) {
            return;
        }
        this.i.add(hsd1Var);
        if (z) {
            return;
        }
        e();
    }

    public final yrd1 b() {
        boolean z;
        TimeZone timeZone = z4n1.a;
        while (true) {
            ArrayList arrayList = this.i;
            if (arrayList.isEmpty()) {
                break;
            }
            long jNanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long jMin = Long.MAX_VALUE;
            yrd1 yrd1Var = null;
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                yrd1 yrd1Var2 = (yrd1) ((hsd1) it.next()).e.get(0);
                long jMax = Math.max(0L, yrd1Var2.d - jNanoTime);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (yrd1Var != null) {
                        z = true;
                        break;
                    }
                    yrd1Var = yrd1Var2;
                }
            }
            ArrayList arrayList2 = this.h;
            if (yrd1Var != null) {
                TimeZone timeZone2 = z4n1.a;
                yrd1Var.d = -1L;
                hsd1 hsd1Var = yrd1Var.c;
                hsd1Var.getClass();
                hsd1Var.e.remove(yrd1Var);
                arrayList.remove(hsd1Var);
                hsd1Var.d = yrd1Var;
                arrayList2.add(hsd1Var);
                if (z || (!this.d && !arrayList.isEmpty())) {
                    e();
                }
                return yrd1Var;
            }
            if (this.d) {
                if (jMin >= this.e - jNanoTime) {
                    break;
                }
                notify();
                break;
            }
            this.d = true;
            this.e = jNanoTime + jMin;
            try {
                try {
                    TimeZone timeZone3 = z4n1.a;
                    if (jMin > 0) {
                        long j = jMin / 1000000;
                        long j2 = jMin - (1000000 * j);
                        if (j > 0 || jMin > 0) {
                            wait(j, (int) j2);
                        }
                    }
                } catch (InterruptedException unused) {
                    TimeZone timeZone4 = z4n1.a;
                    for (int size = arrayList2.size() - 1; -1 < size; size--) {
                        ((hsd1) arrayList2.get(size)).b();
                    }
                    for (int size2 = arrayList.size() - 1; -1 < size2; size2--) {
                        hsd1 hsd1Var2 = (hsd1) arrayList.get(size2);
                        hsd1Var2.b();
                        if (hsd1Var2.e.isEmpty()) {
                            arrayList.remove(size2);
                        }
                    }
                }
                this.d = false;
            } catch (Throwable th) {
                this.d = false;
                throw th;
            }
        }
        return null;
    }

    public final void c(hsd1 hsd1Var) {
        TimeZone timeZone = z4n1.a;
        if (hsd1Var.d == null) {
            boolean zIsEmpty = hsd1Var.e.isEmpty();
            ArrayList arrayList = this.i;
            if (zIsEmpty) {
                arrayList.remove(hsd1Var);
            } else {
                byte[] bArr = w4n1.a;
                if (!arrayList.contains(hsd1Var)) {
                    arrayList.add(hsd1Var);
                }
            }
        }
        if (this.d) {
            notify();
        } else {
            e();
        }
    }

    public final hsd1 d() {
        int i;
        synchronized (this) {
            i = this.c;
            this.c = i + 1;
        }
        return new hsd1(this, f4i1.c(i, "Q"));
    }

    public final void e() {
        TimeZone timeZone = z4n1.a;
        int i = this.f;
        if (i > this.g) {
            return;
        }
        this.f = i + 1;
        ((ThreadPoolExecutor) this.a.a).execute(this.j);
    }
}

package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hsd1 {
    public final isd1 a;
    public final String b;
    public boolean c;
    public yrd1 d;
    public final ArrayList e = new ArrayList();
    public boolean f;

    public hsd1(isd1 isd1Var, String str) {
        this.a = isd1Var;
        this.b = str;
    }

    public static void c(hsd1 hsd1Var, String str, long j, Function0 function0, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        boolean z = (i & 4) != 0;
        hsd1Var.getClass();
        hsd1Var.d(new gsd1(str, z, function0), j);
    }

    public final void a() {
        isd1 isd1Var = this.a;
        TimeZone timeZone = z4n1.a;
        synchronized (isd1Var) {
            if (b()) {
                this.a.c(this);
            }
        }
    }

    public final boolean b() {
        yrd1 yrd1Var = this.d;
        if (yrd1Var != null && yrd1Var.b) {
            this.f = true;
        }
        ArrayList arrayList = this.e;
        boolean z = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((yrd1) arrayList.get(size)).b) {
                Logger logger = this.a.b;
                yrd1 yrd1Var2 = (yrd1) arrayList.get(size);
                if (logger.isLoggable(Level.FINE)) {
                    o0p1.j(logger, yrd1Var2, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }

    public final void d(yrd1 yrd1Var, long j) {
        synchronized (this.a) {
            if (!this.c) {
                if (f(yrd1Var, j, false)) {
                    this.a.c(this);
                }
                return;
            }
            boolean z = yrd1Var.b;
            Logger logger = this.a.b;
            if (z) {
                if (logger.isLoggable(Level.FINE)) {
                    o0p1.j(logger, yrd1Var, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (logger.isLoggable(Level.FINE)) {
                    o0p1.j(logger, yrd1Var, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0040  */
    /* JADX WARN: Code duplicated, block: B:20:0x004c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    /* JADX WARN: Code duplicated, block: B:28:0x0073 A[LOOP:0: B:23:0x005f->B:28:0x0073, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0079  */
    /* JADX WARN: Code duplicated, block: B:34:0x0082 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x0076 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0077 A[EDGE_INSN: B:40:0x0077->B:30:0x0077 BREAK  A[LOOP:0: B:23:0x005f->B:28:0x0073], SYNTHETIC] */
    public final boolean f(yrd1 yrd1Var, long j, boolean z) {
        Iterator it;
        int size;
        String strConcat;
        Logger logger = this.a.b;
        hsd1 hsd1Var = yrd1Var.c;
        if (hsd1Var != this) {
            if (hsd1Var != null) {
                eg.m("task is in multiple queues");
                return false;
            }
            yrd1Var.c = this;
        }
        long jNanoTime = System.nanoTime();
        long j2 = jNanoTime + j;
        ArrayList arrayList = this.e;
        int iIndexOf = arrayList.indexOf(yrd1Var);
        if (iIndexOf == -1) {
            yrd1Var.d = j2;
            if (logger.isLoggable(Level.FINE)) {
                if (z) {
                    strConcat = "run again after ".concat(o0p1.m(j2 - jNanoTime));
                } else {
                    strConcat = "scheduled after ".concat(o0p1.m(j2 - jNanoTime));
                }
                o0p1.j(logger, yrd1Var, this, strConcat);
            }
            it = arrayList.iterator();
            size = 0;
            while (true) {
                if (it.hasNext()) {
                    size = -1;
                    break;
                }
                if (((yrd1) it.next()).d - jNanoTime > j) {
                    break;
                }
                size++;
            }
            if (size == -1) {
                size = arrayList.size();
            }
            arrayList.add(size, yrd1Var);
            if (size == 0) {
                return true;
            }
        } else if (yrd1Var.d > j2) {
            arrayList.remove(iIndexOf);
            yrd1Var.d = j2;
            if (logger.isLoggable(Level.FINE)) {
                if (z) {
                    strConcat = "run again after ".concat(o0p1.m(j2 - jNanoTime));
                } else {
                    strConcat = "scheduled after ".concat(o0p1.m(j2 - jNanoTime));
                }
                o0p1.j(logger, yrd1Var, this, strConcat);
            }
            it = arrayList.iterator();
            size = 0;
            while (true) {
                if (it.hasNext()) {
                    size = -1;
                    break;
                }
                if (((yrd1) it.next()).d - jNanoTime > j) {
                    break;
                    break;
                }
                size++;
            }
            if (size == -1) {
                size = arrayList.size();
            }
            arrayList.add(size, yrd1Var);
            if (size == 0) {
                return true;
            }
        } else if (logger.isLoggable(Level.FINE)) {
            o0p1.j(logger, yrd1Var, this, "already scheduled");
            return false;
        }
        return false;
    }

    public final void g() {
        isd1 isd1Var = this.a;
        TimeZone timeZone = z4n1.a;
        synchronized (isd1Var) {
            this.c = true;
            if (b()) {
                this.a.c(this);
            }
        }
    }

    public final String toString() {
        return this.b;
    }
}

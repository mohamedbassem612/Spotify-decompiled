package p;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class eb00 implements Runnable, Comparable, qku {
    private volatile Object _heap;
    public long a;
    public int b = -1;

    public eb00(long j) {
        this.a = j;
    }

    public final int b(long j, fb00 fb00Var, gb00 gb00Var) {
        synchronized (this) {
            if (this._heap == bwp0.a) {
                return 2;
            }
            synchronized (fb00Var) {
                try {
                    eb00[] eb00VarArr = fb00Var.a;
                    eb00 eb00Var = eb00VarArr != null ? eb00VarArr[0] : null;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = gb00.g;
                    if (avg.a.getIntVolatile(gb00Var, gb00.t) == 1) {
                        return 1;
                    }
                    if (eb00Var == null) {
                        fb00Var.c = j;
                    } else {
                        long j2 = eb00Var.a;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        long j3 = fb00Var.c;
                        if (j - j3 > 0) {
                            fb00Var.c = j;
                        } else {
                            j = j3;
                        }
                    }
                    if (this.a - j < 0) {
                        this.a = j;
                    }
                    fb00Var.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void c(fb00 fb00Var) {
        if (this._heap != bwp0.a) {
            this._heap = fb00Var;
        } else {
            hhg1.n("Failed requirement.");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.a - ((eb00) obj).a;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    @Override // p.qku
    public final void dispose() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                jm jmVar = bwp0.a;
                if (obj == jmVar) {
                    return;
                }
                fb00 fb00Var = obj instanceof fb00 ? (fb00) obj : null;
                if (fb00Var != null) {
                    synchronized (fb00Var) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof nge1 ? (nge1) obj2 : null) != null) {
                            fb00Var.c(this.b);
                        }
                    }
                }
                this._heap = jmVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.a + ']';
    }
}

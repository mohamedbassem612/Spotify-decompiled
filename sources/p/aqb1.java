package p;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class aqb1 implements Runnable {
    public static final Object h = new Object();
    public final Executor a;
    public final xfp0 b;
    public final AtomicReference d;
    public final AtomicBoolean c = new AtomicBoolean(true);
    public Object e = h;
    public int f = -1;
    public boolean g = false;

    public aqb1(AtomicReference atomicReference, Executor executor, xfp0 xfp0Var) {
        this.d = atomicReference;
        this.a = executor;
        this.b = xfp0Var;
    }

    public final void a(int i) {
        synchronized (this) {
            try {
                if (this.c.get()) {
                    if (i <= this.f) {
                        return;
                    }
                    this.f = i;
                    if (this.g) {
                        return;
                    }
                    this.g = true;
                    try {
                        this.a.execute(this);
                    } catch (Throwable unused) {
                        synchronized (this) {
                            this.g = false;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this) {
            try {
                if (!this.c.get()) {
                    this.g = false;
                    return;
                }
                Object obj = this.d.get();
                int i = this.f;
                while (true) {
                    if (!Objects.equals(this.e, obj)) {
                        this.e = obj;
                        boolean z = obj instanceof d29;
                        xfp0 xfp0Var = this.b;
                        if (z) {
                            xfp0Var.onError((Throwable) null);
                        } else {
                            xfp0Var.d(obj);
                        }
                    }
                    synchronized (this) {
                        try {
                            if (i == this.f || !this.c.get()) {
                                break;
                                break;
                            } else {
                                obj = this.d.get();
                                i = this.f;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                this.g = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

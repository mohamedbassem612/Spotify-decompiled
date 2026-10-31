package p;

import com.google.android.gms.tasks.DuplicateTaskCompletionException;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hfp1 extends Task {
    public final Object a = new Object();
    public final l1q0 b = new l1q0((byte) 2);
    public boolean c;
    public volatile boolean d;
    public Object e;
    public Exception f;

    @Override // com.google.android.gms.tasks.Task
    public final hfp1 a(Executor executor, z1q0 z1q0Var) {
        this.b.c(new afo1(executor, z1q0Var));
        u();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final hfp1 b(i2q0 i2q0Var) {
        this.b.c(new afo1(dsd1.a, i2q0Var));
        u();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final hfp1 c(Executor executor, d5q0 d5q0Var) {
        this.b.c(new afo1(executor, d5q0Var));
        u();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final hfp1 d(Executor executor, h8q0 h8q0Var) {
        this.b.c(new afo1(executor, h8q0Var));
        u();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final hfp1 e(Executor executor, mnm mnmVar) {
        hfp1 hfp1Var = new hfp1();
        this.b.c(new pxn1(executor, mnmVar, hfp1Var, (byte) 1));
        u();
        return hfp1Var;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Exception f() {
        Exception exc;
        synchronized (this.a) {
            exc = this.f;
        }
        return exc;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object g() {
        Object obj;
        synchronized (this.a) {
            try {
                zod.v("Task is not yet complete", this.c);
                if (this.d) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f;
                if (exc != null) {
                    throw new RuntimeExecutionException(exc);
                }
                obj = this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object h(Class cls) {
        Object obj;
        synchronized (this.a) {
            try {
                zod.v("Task is not yet complete", this.c);
                if (this.d) {
                    throw new CancellationException("Task is already canceled.");
                }
                boolean zIsInstance = cls.isInstance(this.f);
                Exception exc = this.f;
                if (zIsInstance) {
                    throw ((Throwable) cls.cast(exc));
                }
                if (exc != null) {
                    throw new RuntimeExecutionException(exc);
                }
                obj = this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean i() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean j() {
        boolean z;
        synchronized (this.a) {
            try {
                z = false;
                if (this.c && !this.d && this.f == null) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.Task
    public final hfp1 k(Executor executor, fsc1 fsc1Var) {
        hfp1 hfp1Var = new hfp1();
        this.b.c(new afo1(executor, fsc1Var, hfp1Var));
        u();
        return hfp1Var;
    }

    public final hfp1 l(Executor executor, i2q0 i2q0Var) {
        this.b.c(new afo1(executor, i2q0Var));
        u();
        return this;
    }

    public final hfp1 m(d5q0 d5q0Var) {
        c(dsd1.a, d5q0Var);
        return this;
    }

    public final hfp1 n(h8q0 h8q0Var) {
        d(dsd1.a, h8q0Var);
        return this;
    }

    public final hfp1 o(Executor executor, mnm mnmVar) {
        hfp1 hfp1Var = new hfp1();
        this.b.c(new pxn1(executor, mnmVar, hfp1Var, (byte) 0));
        u();
        return hfp1Var;
    }

    public final hfp1 p(fsc1 fsc1Var) {
        ve90 ve90Var = dsd1.a;
        hfp1 hfp1Var = new hfp1();
        this.b.c(new afo1(ve90Var, fsc1Var, hfp1Var));
        u();
        return hfp1Var;
    }

    public final void q(Exception exc) {
        zod.t(exc, "Exception must not be null");
        synchronized (this.a) {
            if (this.c) {
                throw DuplicateTaskCompletionException.a(this);
            }
            this.c = true;
            this.f = exc;
        }
        this.b.d(this);
    }

    public final void r(Object obj) {
        synchronized (this.a) {
            if (this.c) {
                throw DuplicateTaskCompletionException.a(this);
            }
            this.c = true;
            this.e = obj;
        }
        this.b.d(this);
    }

    public final void s() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    return;
                }
                this.c = true;
                this.d = true;
                this.b.d(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean t(Object obj) {
        synchronized (this.a) {
            try {
                if (this.c) {
                    return false;
                }
                this.c = true;
                this.e = obj;
                this.b.d(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void u() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    this.b.d(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

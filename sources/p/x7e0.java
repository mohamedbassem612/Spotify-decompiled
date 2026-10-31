package p;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class x7e0 {
    public volatile bkl a = y7e0.a;
    public final AtomicReference b = new AtomicReference(w7e0.a);
    public final AtomicBoolean c = new AtomicBoolean(false);

    public final boolean d() {
        return this.b.get() == w7e0.c;
    }

    public void e() {
        i();
    }

    public final void g() {
        if (g5d0.o(this.b)) {
            this.a.accept(dj20.a(this));
        }
    }

    public final void h(Throwable th) {
        if (g5d0.o(this.b)) {
            this.a.accept(q3p1.o(th));
        }
    }

    public final void i() {
        if (g5d0.k(this.b)) {
            this.a.accept(dj20.k(this));
        }
    }

    public final void j() {
        if (this.b.get() == w7e0.b && this.c.compareAndSet(false, true)) {
            bkl bklVar = this.a;
            dj20.l();
            bklVar.accept(h5e0.a);
        }
    }

    public void f() {
    }
}

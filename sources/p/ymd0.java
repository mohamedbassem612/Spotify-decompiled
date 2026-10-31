package p;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class ymd0 {
    public static final Object X = new Object();
    public final Object a;
    public final r441 b;
    public int c;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;
    public final g54 t;

    public ymd0() {
        this.a = new Object();
        this.b = new r441();
        this.c = 0;
        Object obj = X;
        this.f = obj;
        this.t = new g54(this, (byte) 8);
        this.e = obj;
        this.g = -1;
    }

    public static void b(String str) {
        if (q26.e().a.c()) {
            return;
        }
        eg.m(f4i1.f("Cannot invoke ", str, " on a background thread"));
    }

    public final void c(xmd0 xmd0Var) {
        if (xmd0Var.b) {
            if (!xmd0Var.d()) {
                xmd0Var.a(false);
                return;
            }
            int i = xmd0Var.c;
            int i2 = this.g;
            if (i >= i2) {
                return;
            }
            xmd0Var.c = i2;
            xmd0Var.a.b(this.e);
        }
    }

    public final void d(xmd0 xmd0Var) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (xmd0Var != null) {
                c(xmd0Var);
                xmd0Var = null;
            } else {
                r441 r441Var = this.b;
                p441 p441Var = new p441(r441Var);
                r441Var.c.put(p441Var, Boolean.FALSE);
                while (p441Var.hasNext()) {
                    c((xmd0) ((Map.Entry) p441Var.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.h = false;
    }

    public Object e() {
        Object obj = this.e;
        if (obj != X) {
            return obj;
        }
        return null;
    }

    public final void f(iac0 iac0Var, rjp0 rjp0Var) {
        b("observe");
        if (iac0Var.getLifecycle().b() == w8c0.a) {
            return;
        }
        wmd0 wmd0Var = new wmd0(this, iac0Var, rjp0Var);
        xmd0 xmd0Var = (xmd0) this.b.b(rjp0Var, wmd0Var);
        if (xmd0Var != null && !xmd0Var.c(iac0Var)) {
            hhg1.n("Cannot add the same observer with different lifecycles");
        } else {
            if (xmd0Var != null) {
                return;
            }
            iac0Var.getLifecycle().a(wmd0Var);
        }
    }

    public final void g(rjp0 rjp0Var) {
        b("observeForever");
        vmd0 vmd0Var = new vmd0(this, rjp0Var);
        xmd0 xmd0Var = (xmd0) this.b.b(rjp0Var, vmd0Var);
        if (xmd0Var instanceof wmd0) {
            hhg1.n("Cannot add the same observer with different lifecycles");
        } else {
            if (xmd0Var != null) {
                return;
            }
            vmd0Var.a(true);
        }
    }

    public void j(Object obj) {
        boolean z;
        synchronized (this.a) {
            z = this.f == X;
            this.f = obj;
        }
        if (z) {
            q26.e().d(this.t);
        }
    }

    public void k(rjp0 rjp0Var) {
        b("removeObserver");
        xmd0 xmd0Var = (xmd0) this.b.c(rjp0Var);
        if (xmd0Var == null) {
            return;
        }
        xmd0Var.b();
        xmd0Var.a(false);
    }

    public final void l(iac0 iac0Var) {
        b("removeObservers");
        Iterator it = this.b.iterator();
        while (true) {
            n441 n441Var = (n441) it;
            if (!n441Var.hasNext()) {
                return;
            }
            Map.Entry entry = (Map.Entry) n441Var.next();
            if (((xmd0) entry.getValue()).c(iac0Var)) {
                k((rjp0) entry.getKey());
            }
        }
    }

    public void m(Object obj) {
        b("setValue");
        this.g++;
        this.e = obj;
        d(null);
    }

    public void h() {
    }

    public void i() {
    }

    public ymd0(Object obj) {
        this.a = new Object();
        this.b = new r441();
        this.c = 0;
        this.f = X;
        this.t = new g54(this, (byte) 8);
        this.e = obj;
        this.g = 0;
    }
}

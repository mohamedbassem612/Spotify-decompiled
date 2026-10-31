package p;

import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xen0 implements yfp0 {
    public int a;
    public boolean b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public xen0() {
        this.c = new Object();
        this.d = new y36(0);
    }

    public void a(xfp0 xfp0Var) {
        synchronized (this.c) {
            aqb1 aqb1Var = (aqb1) ((HashMap) this.e).remove(xfp0Var);
            if (aqb1Var != null) {
                aqb1Var.c.set(false);
                ((CopyOnWriteArraySet) this.f).remove(aqb1Var);
            }
        }
    }

    public boolean b(int i, int i2) {
        return y4o1.s((oim0) ((wdn0) this.d).g(this.a + i), (oim0) ((wdn0) this.e).g(this.a + i2)) != 0;
    }

    public w561 c(Object obj) {
        w561 w561Var;
        synchronized (this.c) {
            try {
                int iD = d();
                w561Var = new w561(iD, obj);
                if (this.b) {
                    w561Var.y();
                } else {
                    ((y36) this.d).put(Integer.valueOf(iD), w561Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return w561Var;
    }

    public int d() {
        int i;
        synchronized (this.c) {
            i = this.a;
            this.a = i + 1;
        }
        return i;
    }

    public void e() {
        ArrayList arrayList;
        synchronized (this.c) {
            try {
                this.b = true;
                arrayList = new ArrayList(((y36) this.d).values());
                ((y36) this.d).clear();
                if (((klh0) this.e) != null) {
                    Handler handler = (Handler) this.f;
                    handler.getClass();
                    handler.post((klh0) this.e);
                    this.e = null;
                    this.f = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((w561) it.next()).y();
        }
    }

    public void f(Executor executor, xfp0 xfp0Var) {
        aqb1 aqb1Var;
        synchronized (this.c) {
            aqb1 aqb1Var2 = (aqb1) ((HashMap) this.e).remove(xfp0Var);
            if (aqb1Var2 != null) {
                aqb1Var2.c.set(false);
                ((CopyOnWriteArraySet) this.f).remove(aqb1Var2);
            }
            aqb1Var = new aqb1((AtomicReference) this.d, executor, xfp0Var);
            ((HashMap) this.e).put(xfp0Var, aqb1Var);
            ((CopyOnWriteArraySet) this.f).add(aqb1Var);
        }
        aqb1Var.a(0);
    }

    public void g(wdn0 wdn0Var) {
        this.e = wdn0Var;
    }

    public void h(wdn0 wdn0Var) {
        this.d = wdn0Var;
    }

    public void i(int i, Object obj) {
        synchronized (this.c) {
            try {
                w561 w561Var = (w561) ((y36) this.d).remove(Integer.valueOf(i));
                if (w561Var != null) {
                    if (w561Var.f.getClass() == obj.getClass()) {
                        w561Var.u(obj);
                    } else {
                        oon1.H("Type mismatch, expected " + w561Var.f.getClass() + ", but was " + obj.getClass());
                    }
                }
                if (((klh0) this.e) != null && ((y36) this.d).isEmpty()) {
                    e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j(pim0 pim0Var) {
        this.c = pim0Var;
    }

    public void k(int i) {
        this.a = i;
    }

    public void l(boolean z) {
        this.b = z;
    }

    public xen0(jdo0 jdo0Var, pim0 pim0Var, int i, wdn0 wdn0Var, wdn0 wdn0Var2, boolean z) {
        this.f = jdo0Var;
        this.c = pim0Var;
        this.a = i;
        this.d = wdn0Var;
        this.e = wdn0Var2;
        this.b = z;
    }
}

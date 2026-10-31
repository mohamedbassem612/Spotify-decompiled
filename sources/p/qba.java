package p;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class qba {
    public final ArrayList a = new ArrayList(1);
    public final HashSet b = new HashSet(1);
    public final mgc c = new mgc(new CopyOnWriteArrayList(), 0, (p2i0) null);
    public final b9v d = new b9v();
    public Looper e;
    public sqe1 f;
    public dbu0 g;
    public o4a h;

    public final void a(Handler handler, c9v c9vVar) {
        handler.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = this.d.c;
        a9v a9vVar = new a9v();
        a9vVar.a = handler;
        a9vVar.b = c9vVar;
        copyOnWriteArrayList.add(a9vVar);
    }

    public final void b(Handler handler, w2i0 w2i0Var) {
        handler.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.c.d;
        v2i0 v2i0Var = new v2i0();
        v2i0Var.a = handler;
        v2i0Var.b = w2i0Var;
        copyOnWriteArrayList.add(v2i0Var);
    }

    public boolean c(yoh0 yoh0Var) {
        return false;
    }

    public final mgc e(p2i0 p2i0Var) {
        return new mgc((CopyOnWriteArrayList) this.c.d, 0, p2i0Var);
    }

    public abstract arh0 f(p2i0 p2i0Var, hw3 hw3Var, long j);

    public final void g(q2i0 q2i0Var) {
        HashSet hashSet = this.b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(q2i0Var);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        i();
    }

    public final void j(q2i0 q2i0Var) {
        this.e.getClass();
        HashSet hashSet = this.b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(q2i0Var);
        if (zIsEmpty) {
            k();
        }
    }

    public sqe1 l() {
        return null;
    }

    public abstract yoh0 m();

    public boolean n() {
        return true;
    }

    public void p(sqe1 sqe1Var) {
        s(sqe1Var);
    }

    public final void q(q2i0 q2i0Var, dbu0 dbu0Var, o4a o4aVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.e;
        dm5.m(looper == null || looper == looperMyLooper);
        this.g = dbu0Var;
        this.h = o4aVar;
        sqe1 sqe1Var = this.f;
        this.a.add(q2i0Var);
        if (this.e == null) {
            this.e = looperMyLooper;
            this.b.add(q2i0Var);
            r(o4aVar.d());
        } else if (sqe1Var != null) {
            j(q2i0Var);
            q2i0Var.a(this, sqe1Var);
        }
    }

    public abstract void r(yeg1 yeg1Var);

    public final void s(sqe1 sqe1Var) {
        this.f = sqe1Var;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((q2i0) it.next()).a(this, sqe1Var);
        }
    }

    public void t(arh0 arh0Var) {
        if (arh0Var instanceof c2b1) {
            for (cbg cbgVar : f46.i0(((c2b1) arh0Var).t)) {
                n541 n541Var = cbgVar.Y;
                n541Var.j();
                y8v y8vVar = n541Var.h;
                if (y8vVar != null) {
                    y8vVar.c(n541Var.e);
                    n541Var.h = null;
                    n541Var.g = null;
                }
                for (n541 n541Var2 : cbgVar.Z) {
                    n541Var2.j();
                    y8v y8vVar2 = n541Var2.h;
                    if (y8vVar2 != null) {
                        y8vVar2.c(n541Var2.e);
                        n541Var2.h = null;
                        n541Var2.g = null;
                    }
                }
                cbgVar.h.x(cbgVar);
            }
        }
    }

    public final void u(q2i0 q2i0Var) {
        ArrayList arrayList = this.a;
        arrayList.remove(q2i0Var);
        if (!arrayList.isEmpty()) {
            g(q2i0Var);
            return;
        }
        this.e = null;
        this.f = null;
        this.g = null;
        this.b.clear();
        w();
    }

    public abstract void w();

    public final void x(c9v c9vVar) {
        CopyOnWriteArrayList<a9v> copyOnWriteArrayList = this.d.c;
        for (a9v a9vVar : copyOnWriteArrayList) {
            if (a9vVar.b == c9vVar) {
                copyOnWriteArrayList.remove(a9vVar);
            }
        }
    }

    public final void y(w2i0 w2i0Var) {
        CopyOnWriteArrayList<v2i0> copyOnWriteArrayList = (CopyOnWriteArrayList) this.c.d;
        for (v2i0 v2i0Var : copyOnWriteArrayList) {
            if (v2i0Var.b == w2i0Var) {
                copyOnWriteArrayList.remove(v2i0Var);
            }
        }
    }

    public void i() {
    }

    public void k() {
    }

    public void o() {
    }

    public void z(yoh0 yoh0Var) {
    }
}

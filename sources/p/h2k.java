package p;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class h2k extends qba {
    public final HashMap i = new HashMap();
    public Handler t;

    public abstract p2i0 A(Object obj, p2i0 p2i0Var);

    public abstract void G(Object obj, qba qbaVar, sqe1 sqe1Var);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [p.e2k, p.q2i0] */
    public final void H(final Object obj, qba qbaVar) {
        HashMap map = this.i;
        dm5.m(!map.containsKey(obj));
        ?? r1 = new q2i0() { // from class: p.e2k
            @Override // p.q2i0
            public final void a(qba qbaVar2, sqe1 sqe1Var) {
                this.a.G(obj, qbaVar2, sqe1Var);
            }
        };
        f2k f2kVar = new f2k(this, obj);
        map.put(obj, new g2k(qbaVar, r1, f2kVar));
        Handler handler = this.t;
        handler.getClass();
        qbaVar.b(handler, f2kVar);
        Handler handler2 = this.t;
        handler2.getClass();
        qbaVar.a(handler2, f2kVar);
        dbu0 dbu0Var = this.g;
        dbu0Var.getClass();
        o4a o4aVar = this.h;
        o4aVar.getClass();
        qbaVar.q(r1, dbu0Var, o4aVar);
        if (this.b.isEmpty()) {
            qbaVar.g(r1);
        }
    }

    @Override // p.qba
    public final void i() {
        for (g2k g2kVar : this.i.values()) {
            g2kVar.a.g(g2kVar.b);
        }
    }

    @Override // p.qba
    public final void k() {
        for (g2k g2kVar : this.i.values()) {
            g2kVar.a.j(g2kVar.b);
        }
    }

    @Override // p.qba
    public void o() {
        Iterator it = this.i.values().iterator();
        while (it.hasNext()) {
            ((g2k) it.next()).a.o();
        }
    }

    @Override // p.qba
    public void w() {
        HashMap map = this.i;
        for (g2k g2kVar : map.values()) {
            qba qbaVar = g2kVar.a;
            f2k f2kVar = g2kVar.c;
            qbaVar.u(g2kVar.b);
            qbaVar.y(f2kVar);
            qbaVar.x(f2kVar);
        }
        map.clear();
    }

    public long B(long j, Object obj) {
        return j;
    }

    public int C(int i, Object obj) {
        return i;
    }
}

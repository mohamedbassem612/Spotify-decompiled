package p;

import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class b9e1 implements vdt0 {
    public final View a;
    public final st60 b;
    public final r94 c;
    public boolean d;
    public iu30 e;
    public iu30 f;
    public c8e1 g;
    public x180 h;
    public final ArrayList i;
    public final znb0 j;
    public Rect k;
    public final noo l;
    public final bfn0 m;
    public v241 n;

    public b9e1(View view, ha4 ha4Var, r94 r94Var) {
        st60 st60Var = new st60(view);
        this.a = view;
        this.b = st60Var;
        this.c = r94Var;
        this.e = new p5e1((byte) 9);
        this.f = new p5e1((byte) 10);
        int i = nbe1.c;
        this.g = new c8e1(b6p1.k(), 4, "");
        x180 x180Var = x180.g;
        this.h = n3p1.m();
        this.i = new ArrayList();
        this.j = dm5.S(3, new ww21(this, (byte) 22));
        this.l = new noo(ha4Var, st60Var);
        this.m = new bfn0(0, new a9e1[16]);
    }

    @Override // p.vdt0
    public final void a() {
        i(a9e1.a);
    }

    @Override // p.vdt0
    public final void b() {
        this.d = false;
        this.e = new p5e1((byte) 11);
        this.f = new p5e1((byte) 12);
        this.k = null;
        i(a9e1.b);
    }

    @Override // p.vdt0
    public final void c() {
        i(a9e1.d);
    }

    @Override // p.vdt0
    public final void d(c8e1 c8e1Var, hyp0 hyp0Var, y9e1 y9e1Var, gqb0 gqb0Var, n511 n511Var, n511 n511Var2) {
        noo nooVar = this.l;
        synchronized (nooVar.c) {
            try {
                nooVar.j = c8e1Var;
                nooVar.l = hyp0Var;
                nooVar.k = y9e1Var;
                nooVar.m = gqb0Var;
                nooVar.n = n511Var;
                nooVar.o = n511Var2;
                if (nooVar.e || nooVar.d) {
                    nooVar.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p.vdt0
    public final void e() {
        i(a9e1.c);
    }

    @Override // p.vdt0
    public final void f(n511 n511Var) {
        Rect rect;
        this.k = new Rect(jch0.U(n511Var.a), jch0.U(n511Var.b), jch0.U(n511Var.c), jch0.U(n511Var.d));
        if (!this.i.isEmpty() || (rect = this.k) == null) {
            return;
        }
        this.a.requestRectangleOnScreen(new Rect(rect));
    }

    @Override // p.vdt0
    public final void g(c8e1 c8e1Var, c8e1 c8e1Var2) {
        boolean z = (nbe1.c(this.g.b, c8e1Var2.b) && u890.j(this.g.c, c8e1Var2.c)) ? false : true;
        this.g = c8e1Var2;
        int size = this.i.size();
        for (int i = 0; i < size; i++) {
            w311 w311Var = (w311) ((WeakReference) this.i.get(i)).get();
            if (w311Var != null) {
                w311Var.d(c8e1Var2);
            }
        }
        noo nooVar = this.l;
        synchronized (nooVar.c) {
            nooVar.j = null;
            nooVar.l = null;
            nooVar.k = null;
            nooVar.m = ye3.c1;
            nooVar.n = null;
            nooVar.o = null;
        }
        if (u890.j(c8e1Var, c8e1Var2)) {
            if (z) {
                st60 st60Var = this.b;
                int iG = nbe1.g(c8e1Var2.b);
                int iF = nbe1.f(c8e1Var2.b);
                nbe1 nbe1Var = this.g.c;
                int iG2 = nbe1Var != null ? nbe1.g(nbe1Var.a) : -1;
                nbe1 nbe1Var2 = this.g.c;
                st60Var.N(iG, iF, iG2, nbe1Var2 != null ? nbe1.f(nbe1Var2.a) : -1);
                return;
            }
            return;
        }
        if (c8e1Var != null && (!u890.j(c8e1Var.a.b, c8e1Var2.a.b) || (nbe1.c(c8e1Var.b, c8e1Var2.b) && !u890.j(c8e1Var.c, c8e1Var2.c)))) {
            this.b.E();
            return;
        }
        int size2 = this.i.size();
        for (int i2 = 0; i2 < size2; i2++) {
            w311 w311Var2 = (w311) ((WeakReference) this.i.get(i2)).get();
            if (w311Var2 != null) {
                w311Var2.e(this.g, this.b);
            }
        }
    }

    @Override // p.vdt0
    public final void h(c8e1 c8e1Var, x180 x180Var, d5e1 d5e1Var, l7n l7nVar) {
        this.d = true;
        this.g = c8e1Var;
        this.h = x180Var;
        this.e = d5e1Var;
        this.f = l7nVar;
        i(a9e1.a);
    }

    public final void i(a9e1 a9e1Var) {
        this.m.b(a9e1Var);
        if (this.n == null) {
            Runnable v241Var = new v241(this, (byte) 15);
            this.c.execute(v241Var);
            this.n = v241Var;
        }
    }
}

package p;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import defpackage.d;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class dtw {
    public static final tka0 C;
    public static final tka0 D;
    public kku A;
    public final zsw B;
    public final laa a;
    public ipb1 b;
    public final Object c;
    public final vik1 d;
    public koa0 e;
    public Object f;
    public final iu30 g;
    public final xcn0 h;
    public final px20 i;
    public final r1t j;
    public final r1t k;
    public final sqw l;
    public final isw m;
    public final ArrayList n;
    public Object o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object f27p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public iac0 u;
    public final atw v;
    public final View w;
    public t8r0 x;
    public nml y;
    public nml z;

    static {
        new mhc((byte) 8);
        jd11 jd11Var = rc11.a;
        C = jd11Var.b(tsw.class);
        D = jd11Var.b(usw.class);
    }

    public dtw(Context context, ViewGroup viewGroup, laa laaVar, ipb1 ipb1Var, Object obj, drw drwVar, o8n o8nVar, int i) {
        o8n o8nVar2;
        Object obj2 = (i & 16) != 0 ? null : obj;
        vik1 vik1Var = new vik1();
        if ((i & 128) != 0) {
            fns fnsVar = igu.a;
            o8nVar2 = pyf0.a;
        } else {
            o8nVar2 = o8nVar;
        }
        this.a = laaVar;
        this.b = ipb1Var;
        this.c = obj2;
        this.d = vik1Var;
        this.f = obj2;
        this.g = c(laaVar);
        xcn0 xcn0Var = new xcn0();
        this.h = xcn0Var;
        px20 px20Var = new px20(new r1t(this, (byte) 20), true);
        this.i = px20Var;
        this.j = new r1t(this, (byte) 16);
        this.k = new r1t(px20Var);
        System.identityHashCode(this);
        this.l = new sqw(laaVar, o8nVar2, new btw(this, (byte) 0), new ctw(this, (byte) 0), new ctw(this, (byte) 1), new ctw(this, (byte) 2), new ctw(this, (byte) 3));
        try {
            isw iswVarA = laaVar.c().a(context, viewGroup, new lsw(xcn0Var), new s20(this, (byte) 18));
            this.m = iswVarA;
            this.n = new ArrayList();
            atw atwVar = new atw(this);
            this.v = atwVar;
            View view = iswVarA.getView();
            xhk1.e(view, atwVar);
            view.addOnAttachStateChangeListener(new y22(this, (byte) 10));
            y3o1.b0(drwVar, view, new yfu(view, this, (byte) 3));
            this.w = view;
            this.B = new zsw(this);
        } catch (Exception e) {
            a(this, e);
            throw null;
        }
    }

    public static void a(dtw dtwVar, Exception exc) {
        Object obj = dtwVar.f;
        t8r0 t8r0Var = dtwVar.x;
        loo1.o(exc, obj, t8r0Var != null ? ((rl1) t8r0Var.b).x() : null, dtwVar.a.b());
        throw null;
    }

    public static iu30 c(laa laaVar) {
        boolean z = laaVar instanceof jpg0;
        if (!z) {
            return z ? c(((jpg0) laaVar).a) : vrw.g;
        }
        jpg0 jpg0Var = (jpg0) laaVar;
        iu30 iu30VarC = c(jpg0Var.a);
        iu30 iu30Var = jpg0Var.b;
        w0h1.o(1, iu30Var);
        return new d((Object) iu30Var, (Object) iu30VarC, (byte) 7);
    }

    public final void b(ipb1 ipb1Var) {
        if (!this.q) {
            this.b = ipb1Var;
            return;
        }
        Object obj = this.f;
        obj.getClass();
        t8r0 t8r0VarH = bwp0.h(this.a, obj, ipb1Var, new r1t(this, (byte) 17));
        j();
        this.x = t8r0VarH;
        h();
        i(this.w);
    }

    public final void d(nml nmlVar) {
        if (nmlVar == this.z) {
            return;
        }
        kku kkuVar = this.A;
        if (kkuVar != null) {
            kkuVar.dispose();
        }
        this.z = nmlVar;
        this.A = nmlVar != null ? nmlVar.b(this.B) : null;
    }

    public final void e(Object obj, ipb1 ipb1Var) {
        j();
        this.h.b.clear();
        this.b = ipb1Var;
        f(obj);
        if (this.x == null && this.c == null) {
            return;
        }
        b(ipb1Var);
    }

    public final void f(Object obj) {
        t8r0 t8r0Var;
        this.f = obj;
        if (this.c == null && this.x == null && obj != null) {
            b(this.b);
            return;
        }
        t8r0 t8r0Var2 = this.x;
        if (t8r0Var2 == null || ((rl1) t8r0Var2.b).w() || obj == null || (t8r0Var = this.x) == null) {
            return;
        }
        ((rl1) t8r0Var.b).C(obj);
    }

    public final void g(View view) {
        Bundle bundleC;
        SparseArray<Parcelable> sparseParcelableArray;
        t8r0 t8r0Var;
        otu otuVarS;
        if (this.q) {
            return;
        }
        this.q = true;
        laa laaVar = this.a;
        laaVar.b();
        this.b.h();
        this.m.getView();
        if (this.f == null || !((t8r0Var = this.x) == null || ((rl1) t8r0Var.b).w())) {
            h();
        } else {
            dts dtsVarK = this.b.k();
            if (dtsVarK != null) {
                String strH = this.b.h();
                Object obj = this.f;
                obj.getClass();
                this.b = dtsVarK.a(strH, obj, laaVar.getBehavior().c(), new ctw(this, (byte) 4));
            }
            Object obj2 = this.f;
            obj2.getClass();
            t8r0 t8r0VarH = bwp0.h(laaVar, obj2, this.b, new r1t(this, (byte) 19));
            j();
            this.x = t8r0VarH;
            xhk1.e(view, this.v);
            h();
            op80 op80VarB = this.l.b();
            if (op80VarB != null && (otuVarS = z8p1.s(op80VarB)) != null) {
                otuVarS.h(laaVar.b(), this.b.h());
            }
        }
        View view2 = this.w;
        if (view2.isSaveEnabled() && (bundleC = this.b.c()) != null && (sparseParcelableArray = bundleC.getSparseParcelableArray("view_state")) != null) {
            view2.restoreHierarchyState(sparseParcelableArray);
        }
        i(view);
    }

    public final void h() {
        View view = this.w;
        if (!view.isAttachedToWindow()) {
            this.t = true;
            return;
        }
        this.t = false;
        sqw sqwVar = this.l;
        llm llmVar = sqwVar.k;
        if (llmVar != null) {
            smo1.q(llmVar);
        }
        llm llmVarE = smo1.e(sqwVar.b);
        ien0 ien0Var = xhk1.a;
        sqwVar.l = xhk1.b(llmVarE, view);
        c921.y(llmVarE, (o8n) null, 0, new ett(sqwVar, (lnm) null, (byte) 9), 3);
        sqwVar.k = llmVarE;
    }

    public final void i(View view) {
        if (view.isAttachedToWindow() && this.q && !this.r) {
            if (view.getParent() == null) {
                view.postOnAnimation(new wr3(view, this));
                return;
            }
            sqw sqwVar = this.l;
            sqwVar.h = null;
            sqwVar.i = false;
            t8r0 t8r0Var = this.x;
            if (t8r0Var != null) {
                t8r0 t8r0Var2 = ((rl1) t8r0Var.b).w() ? null : t8r0Var;
                if (t8r0Var2 != null) {
                    l(t8r0Var2);
                }
            }
        }
    }

    public final void j() {
        this.d.b();
        d(null);
        sqw sqwVar = this.l;
        llm llmVar = sqwVar.k;
        if (llmVar != null) {
            smo1.q(llmVar);
        }
        sqwVar.k = null;
        ArrayList arrayList = this.n;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((kku) it.next()).dispose();
        }
        arrayList.clear();
        t8r0 t8r0Var = this.x;
        if (t8r0Var != null) {
            t8r0 t8r0Var2 = ((rl1) t8r0Var.b).w() ? null : t8r0Var;
            if (t8r0Var2 != null) {
                ((rl1) t8r0Var2.b).s();
            }
        }
        this.r = false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void k(Object obj, koa0 koa0Var, vu30 vu30Var) throws NoWhenBranchMatchedException {
        koa0 koa0Var2 = this.e;
        boolean z = false;
        boolean z2 = koa0Var2 == null;
        if (!z2 && !u890.j(koa0Var2, koa0Var)) {
            z = true;
        }
        this.e = koa0Var;
        if (koa0Var instanceof goa0) {
            f(obj);
            return;
        }
        boolean z3 = koa0Var instanceof hoa0;
        laa laaVar = this.a;
        if (z3) {
            hoa0 hoa0Var = (hoa0) koa0Var;
            ipb1 ipb1VarA = hoa0Var.a.a(hoa0Var.b, laaVar.getBehavior().c(), null, new jzm(this, obj, koa0Var, vu30Var, (byte) 13));
            if (z || !u890.j(ipb1VarA.h(), this.b.h())) {
                e(obj, ipb1VarA);
                return;
            } else {
                f(obj);
                return;
            }
        }
        if (!(koa0Var instanceof joa0)) {
            if (koa0Var instanceof ioa0) {
                e(obj, this.b);
                return;
            } else {
                eg.o();
                return;
            }
        }
        if (z2 || z) {
            e(obj, laaVar.getBehavior().b(laaVar.getBehavior().d(obj), null, String.valueOf(((joa0) koa0Var).a)));
        } else {
            f(obj);
        }
    }

    public final void l(t8r0 t8r0Var) {
        rl1 rl1Var = (rl1) t8r0Var.b;
        if (rl1Var.w()) {
            loo1.q(rc11.a.b(((laa) t8r0Var.a).getClass()));
            throw null;
        }
        this.r = true;
        this.n.add(rl1Var.D(new m3n(this, t8r0Var, new ysw(new ctw(this, (byte) 6), this.b.h(), this.b), t8r0Var)));
    }
}

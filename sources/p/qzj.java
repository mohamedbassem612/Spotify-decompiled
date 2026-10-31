package p;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qzj {
    public final View a;
    public boolean b;
    public v3k c;
    public iac0 d;
    public qe41 e;
    public sck1 f;
    public final e180 g;
    public final ax21 h;
    public final Configuration i;
    public final ven0 j;
    public final t34 k;
    public final f65 l;
    public final g94 m;
    public final ung n;
    public final y830 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ven0 f104p;
    public final ss50 q;
    public final c75 r;
    public final jmb0 s;
    public final uvb0 t;
    public final ljd u;
    public int v;
    public final hx4 w;
    public w15 x;
    public final pzj y;

    public qzj(qzj qzjVar, View view, v3k v3kVar, iac0 iac0Var, qe41 qe41Var, sck1 sck1Var) {
        e180 e180Var;
        Configuration configuration;
        ven0 ven0VarT;
        t34 t34Var;
        f65 f65Var;
        g94 g94Var;
        ung f94Var;
        y830 gtv0Var;
        ven0 ven0VarS;
        c75 c75Var;
        boolean zJ = u890.j(qzjVar != null ? qzjVar.a.getContext() : null, view.getContext());
        this.a = view;
        this.c = v3kVar;
        this.d = iac0Var;
        this.e = qe41Var;
        this.f = sck1Var;
        if (zJ) {
            qzjVar.getClass();
            e180Var = qzjVar.g;
        } else {
            e180Var = new e180();
        }
        this.g = e180Var;
        this.h = qzjVar != null ? qzjVar.h : new ax21();
        if (zJ) {
            qzjVar.getClass();
            configuration = qzjVar.i;
        } else {
            configuration = new Configuration(view.getContext().getResources().getConfiguration());
        }
        this.i = configuration;
        if (zJ) {
            qzjVar.getClass();
            ven0VarT = qzjVar.j;
        } else {
            ven0VarT = xto.t(new Configuration(configuration));
        }
        this.j = ven0VarT;
        if (zJ) {
            qzjVar.getClass();
            t34Var = qzjVar.k;
        } else {
            t34Var = new t34(view.getContext());
        }
        this.k = t34Var;
        if (zJ) {
            qzjVar.getClass();
            f65Var = qzjVar.l;
        } else {
            f65Var = new f65(view.getContext());
        }
        this.l = f65Var;
        if (zJ) {
            qzjVar.getClass();
            g94Var = qzjVar.m;
        } else {
            g94Var = new g94(view.getContext());
        }
        this.m = g94Var;
        if (zJ) {
            qzjVar.getClass();
            f94Var = qzjVar.n;
        } else {
            f94Var = new f94(g94Var);
        }
        this.n = f94Var;
        if (zJ) {
            qzjVar.getClass();
            gtv0Var = qzjVar.o;
        } else {
            view.getContext();
            gtv0Var = new gtv0((byte) 10);
        }
        this.o = gtv0Var;
        if (zJ) {
            qzjVar.getClass();
            ven0VarS = qzjVar.f104p;
        } else {
            ven0VarS = xto.s(n8p1.i(view.getContext()), c4x0.f);
        }
        this.f104p = ven0VarS;
        this.q = view == (qzjVar != null ? qzjVar.a : null) ? qzjVar.q : new sct0(view);
        if (zJ) {
            qzjVar.getClass();
            c75Var = qzjVar.r;
        } else {
            c75Var = new c75(ViewConfiguration.get(view.getContext()));
        }
        this.r = c75Var;
        this.s = qzjVar != null ? qzjVar.s : new jmb0();
        this.t = new uvb0();
        this.u = qzjVar != null ? qzjVar.u : new ljd();
        this.w = new hx4(this, (byte) 18);
        this.y = new pzj(this);
    }

    public final void a(ha4 ha4Var, vu30 vu30Var, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(123858079);
        int i2 = (x340Var.i(ha4Var) ? 4 : 2) | i | (x340Var.i(vu30Var) ? 32 : 16) | (x340Var.i(this) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            Object tag = ha4Var.getTag(2131429653);
            Set set = null;
            Set set2 = (!(tag instanceof Set) || ((tag instanceof ola0) && !(tag instanceof ama0))) ? null : (Set) tag;
            if (set2 == null) {
                Object parent = ha4Var.getParent();
                View view = parent instanceof View ? (View) parent : null;
                Object tag2 = view != null ? view.getTag(2131429653) : null;
                if ((tag2 instanceof Set) && (!(tag2 instanceof ola0) || (tag2 instanceof ama0))) {
                    set = (Set) tag2;
                }
            } else {
                set = set2;
            }
            if (set != null) {
                set.add(x340Var.B());
                x340Var.q = true;
                x340Var.C = true;
                x340Var.c.c();
                x340Var.H.c();
                hf91 hf91Var = x340Var.I;
                ze91 ze91Var = hf91Var.a;
                hf91Var.e = ze91Var.t;
                hf91Var.f = ze91Var.X;
            }
            boolean zG = x340Var.g(ha4Var.getView());
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                objT = new vhk1(ha4Var.getView());
                x340Var.s0(objT);
            }
            vhk1 vhk1Var = (vhk1) objT;
            ely0 ely0VarA = jfe0.a.a(d());
            xky0 xky0Var = lge0.a;
            g();
            qe41 qe41Var = this.e;
            qe41Var.getClass();
            ely0 ely0VarA2 = xky0Var.a(qe41Var);
            ely0 ely0VarA3 = AndroidCompositionLocals_androidKt.d.a(this.g);
            ely0 ely0VarA4 = AndroidCompositionLocals_androidKt.e.a(this.h);
            kiv kivVar = t4k.v;
            boolean zI = x340Var.i(this);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new j6(this, (byte) 15);
                x340Var.s0(objT2);
            }
            ely0 ely0VarC = kivVar.c((iu30) objT2);
            ely0 ely0VarA5 = AndroidCompositionLocals_androidKt.b.a(ha4Var.getContext());
            ely0 ely0VarA6 = dn80.a.a(set);
            ely0 ely0VarA7 = AndroidCompositionLocals_androidKt.a.a(ha4Var.getConfiguration());
            kiv kivVar2 = pd41.a;
            boolean zI2 = x340Var.i(ha4Var);
            Object objT3 = x340Var.T();
            if (zI2 || objT3 == m4cVar) {
                objT3 = new u94(ha4Var, (byte) 1);
                x340Var.s0(objT3);
            }
            ely0 ely0VarC2 = kivVar2.c((iu30) objT3);
            ely0 ely0VarA8 = AndroidCompositionLocals_androidKt.f.a(ha4Var.getView());
            kiv kivVar3 = t4k.x;
            boolean zI3 = x340Var.i(ha4Var);
            Object objT4 = x340Var.T();
            if (zI3 || objT4 == m4cVar) {
                objT4 = new u94(ha4Var, (byte) 2);
                x340Var.s0(objT4);
            }
            mod.c(new ely0[]{ely0VarA, ely0VarA2, ely0VarA3, ely0VarA4, ely0VarC, ely0VarA5, ely0VarA6, ely0VarA7, ely0VarC2, ely0VarA8, kivVar3.c((iu30) objT4), t4k.t.a(ha4Var.getViewConfiguration()), qw60.a.a(vhk1Var)}, apo.r(1317454175, new ozj(ha4Var, this, vu30Var), x340Var), x340Var, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ozj(this, ha4Var, vu30Var, i);
        }
    }

    public final void b() {
        int i = this.v - 1;
        this.v = i;
        if (i < 0) {
            i = 0;
            this.v = 0;
        }
        if (i == 0) {
            View view = this.a;
            Context context = view.getContext();
            pzj pzjVar = this.y;
            context.unregisterComponentCallbacks(pzjVar);
            uvb0 uvb0Var = this.t;
            if (uvb0Var.b == null) {
                uvb0Var.a = null;
            }
            view.getViewTreeObserver().removeOnWindowFocusChangeListener(pzjVar);
        }
    }

    public final v3k c() {
        g();
        v3k v3kVar = this.c;
        v3kVar.getClass();
        return v3kVar;
    }

    public final iac0 d() {
        g();
        iac0 iac0Var = this.d;
        iac0Var.getClass();
        return iac0Var;
    }

    public final void e() {
        int i = this.v + 1;
        this.v = i;
        if (i == 1) {
            View view = this.a;
            Context context = view.getContext();
            pzj pzjVar = this.y;
            context.registerComponentCallbacks(pzjVar);
            f(view.getResources().getConfiguration());
            boolean zHasWindowFocus = view.hasWindowFocus();
            uvb0 uvb0Var = this.t;
            uvb0Var.c.setValue(Boolean.valueOf(zHasWindowFocus));
            hrr0 hrr0Var = uvb0Var.b;
            hx4 hx4Var = this.w;
            if (hrr0Var == null) {
                uvb0Var.a = hx4Var;
            }
            if (hrr0Var != null) {
                hrr0Var.setValue(hx4Var.invoke());
            }
            view.getViewTreeObserver().addOnWindowFocusChangeListener(pzjVar);
        }
    }

    public final void f(Configuration configuration) {
        int iUpdateFrom = this.i.updateFrom(configuration);
        if (iUpdateFrom != 0) {
            Iterator it = this.g.a.entrySet().iterator();
            while (it.hasNext()) {
                c180 c180Var = (c180) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (c180Var == null || Configuration.needNewResources(iUpdateFrom, c180Var.b)) {
                    it.remove();
                }
            }
            this.j.setValue(new Configuration(configuration));
            ax21 ax21Var = this.h;
            synchronized (ax21Var) {
                ax21Var.a.c();
            }
            if ((268435456 & iUpdateFrom) != 0) {
                this.f104p.setValue(n8p1.i(this.a.getContext()));
            }
            if ((805248384 & iUpdateFrom) != 0) {
                uvb0 uvb0Var = this.t;
                hx4 hx4Var = this.w;
                hrr0 hrr0Var = uvb0Var.b;
                if (hrr0Var != null) {
                    hrr0Var.setValue(hx4Var.invoke());
                }
            }
        }
    }

    public final void g() {
        if (this.b) {
            return;
        }
        this.b = true;
        v3k v3kVar = this.c;
        View view = this.a;
        if (v3kVar == null) {
            v3k v3kVarA = gtl1.a(view);
            if (v3kVarA == null) {
                Object parent = view.getParent();
                while (v3kVarA == null && (parent instanceof View)) {
                    View view2 = (View) parent;
                    v3kVarA = gtl1.a(view2);
                    parent = dm5.P(view2);
                }
            }
            if (v3kVarA == null) {
                v3kVarA = gtl1.b(view);
            }
            this.c = v3kVarA;
        }
        if (this.d == null) {
            iac0 iac0VarH = x9p1.h(view);
            if (iac0VarH == null) {
                eg.m("Composed into a View which doesn't propagate ViewTreeLifecycleOwner!");
                return;
            }
            this.d = iac0VarH;
        }
        if (this.e == null) {
            qe41 qe41VarW = hm5.w(view);
            if (qe41VarW == null) {
                eg.m("Composed into a View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
                return;
            }
            this.e = qe41VarW;
        }
        if (this.f == null) {
            this.f = lap1.k(view);
        }
    }
}

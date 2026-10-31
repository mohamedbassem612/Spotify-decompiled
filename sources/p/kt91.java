package p;

import android.app.Application;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kt91 implements s4j0 {
    public final e4j0 a;
    public final q8n b;
    public final ar91 c;
    public final d9q d;
    public final dp5 e;
    public final ArrayList f = new ArrayList();
    public ft91 g;
    public final bpb1 h;
    public final xe01 i;
    public final nev0 j;
    public final llm k;

    public kt91(e4j0 e4j0Var, ar91 ar91Var, d9q d9qVar, dp5 dp5Var, q8n q8nVar) {
        this.a = e4j0Var;
        this.b = q8nVar;
        this.c = ar91Var;
        this.d = d9qVar;
        this.e = dp5Var;
        bpb1 bpb1VarB = gio1.b((Object) null);
        this.h = bpb1VarB;
        xe01 xe01VarH = d5p1.h(bpb1VarB);
        this.i = xe01VarH;
        this.j = new nev0(xe01VarH, (byte) 7);
        this.k = smo1.e(ha71.A(op71.f(), q8nVar));
        ar91Var.d = new hbz0(this, (byte) 20);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static View d(View view) {
        View viewD;
        View snackbarContainer;
        fr91 fr91Var = view instanceof fr91 ? (fr91) view : null;
        if (fr91Var != null && (snackbarContainer = fr91Var.getSnackbarContainer()) != null) {
            return snackbarContainer;
        }
        View view2 = view.getId() == 2131431013 ? view : null;
        if (view2 != null) {
            return view2;
        }
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            d7 it = new i46(viewGroup, (byte) 8).iterator();
            do {
                d7 d7Var = it;
                if (d7Var.hasNext()) {
                    viewD = d((View) d7Var.next());
                }
            } while (viewD == null);
            return viewD;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v14, types: [p.z6x] */
    public static View f(g0i g0iVar, int i) {
        View viewFindViewById;
        ?? H;
        View viewD;
        th30 th30VarE0;
        View view = null;
        dg30 dg30Var = g0iVar instanceof dg30 ? (dg30) g0iVar : null;
        if (dg30Var == null || (th30VarE0 = dg30Var.e0()) == null) {
            viewFindViewById = null;
            break;
        }
        List listT0 = o7h.T0(th30VarE0.c.u());
        ArrayList arrayList = new ArrayList();
        for (Object obj : listT0) {
            if (obj instanceof t2u) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                viewFindViewById = null;
                break;
            }
            View view2 = ((zf30) ((t2u) it.next())).j1;
            viewFindViewById = view2 != null ? view2.findViewById(2131431013) : null;
        } while (viewFindViewById == null);
        if (viewFindViewById != null) {
            return viewFindViewById;
        }
        Window window = g0iVar.getWindow();
        View decorView = window != null ? window.getDecorView() : null;
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            d7 d7Var = new d7(viewGroup, (byte) 8);
            if (d7Var.hasNext()) {
                Object next = d7Var.next();
                if (d7Var.hasNext()) {
                    H = ydh.h(next);
                    while (d7Var.hasNext()) {
                        H.add(d7Var.next());
                    }
                } else {
                    H = k4p1.x(next);
                }
            } else {
                H = z6x.a;
            }
            ud31 it2 = new wd31(H).iterator();
            do {
                ud31 ud31Var = it2;
                if (ud31Var.hasNext()) {
                    viewD = d((View) ud31Var.next());
                }
            } while (viewD == null);
            view = viewD;
        }
        return view == null ? g0iVar.findViewById(i) : view;
    }

    public static void m(kt91 kt91Var, cu91 cu91Var, q4j0 q4j0Var, d3j0 d3j0Var, g0i g0iVar, iu30 iu30Var, tox0 tox0Var, lr91 lr91Var, int i) {
        iu30 iv81Var = (i & 16) != 0 ? new iv81(kt91Var, g0iVar, (byte) 6) : iu30Var;
        tox0 tox0Var2 = (i & 32) != 0 ? dw81.f : tox0Var;
        kt91Var.getClass();
        j0d1 j0d1VarB = guo1.B();
        gaa0 gaa0VarF = op71.f();
        j0d1VarB.L(new dr91(gaa0VarF, (byte) 1));
        llm llmVar = kt91Var.k;
        fns fnsVar = igu.a;
        c921.y(llmVar, ha71.A(gaa0VarF, pyf0.a.f), 0, new sb91(g0iVar, j0d1VarB, (lnm) null, (byte) 7), 2);
        c921.y(smo1.e(ilo1.B(kt91Var.b, j0d1VarB)), (o8n) null, 0, new yn0(kt91Var, q4j0Var, d3j0Var, tox0Var2, iv81Var, cu91Var, lr91Var, g0iVar, (lnm) null, (byte) 11), 3);
    }

    public final void a(xq91 xq91Var) {
        j(new gt91(this, xq91Var, (byte) 0));
    }

    public final void b() {
        m6w0 m6w0Var = (m6w0) this.i.a.getValue();
        if (m6w0Var != null) {
            m6w0Var.a().g();
        }
    }

    @Override // p.s4j0
    public final mr20 c() {
        return this.j;
    }

    public final View e(iu30 iu30Var) {
        View view = (View) iu30Var.invoke(2131431013);
        return view == null ? (View) iu30Var.invoke(2131428203) : view;
    }

    public final boolean g() {
        g0i g0iVar = (g0i) this.c.c.a.getValue();
        return (g0iVar != null ? e(new d061(g0iVar)) : null) != null;
    }

    public final void h(er91 er91Var) {
        if (er91Var.i) {
            return;
        }
        this.e.o(er91Var);
        mr91 mr91Var = new mr91("Snackbar is not shown because no resumed activity could be found! Was the Snackbar shown from the background?", e9k.q());
        n57.t(mr91Var.getMessage(), mr91Var);
    }

    public final void i(xq91 xq91Var) {
        j(new gt91(this, xq91Var, (byte) 1));
    }

    public final void j(Function0 function0) {
        if (u890.j(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            function0.invoke();
            return;
        }
        n57.e("This method should be called from the UI Thread.");
        c921.y(this.k, (o8n) null, 0, new q82(function0, null, (byte) 11), 3);
    }

    public final void k(er91 er91Var) {
        g0i g0iVar = (g0i) this.c.c.a.getValue();
        if (g0iVar == null) {
            h(er91Var);
            return;
        }
        int i = mr91.b;
        l(er91Var, g0iVar, new dr91(this, g0iVar), e9k.q());
    }

    public final void l(er91 er91Var, g0i g0iVar, iu30 iu30Var, lr91 lr91Var) {
        daq daqVar = this.d.a.a;
        m(this, new uqs((gw70) daqVar.d8.get(), er91Var, j991.D((Application) daqVar.x1.a)), o4j0.a, new d3j0(new b3j0(true), x2j0.a), g0iVar, iu30Var, null, lr91Var, 32);
    }

    public final void n(er91 er91Var, View view) {
        g0i g0iVar = (g0i) this.c.c.a.getValue();
        if (g0iVar == null) {
            h(er91Var);
            return;
        }
        d061 d061Var = new d061(view, (byte) 16);
        int i = mr91.b;
        l(er91Var, g0iVar, d061Var, e9k.q());
    }

    public final void o(er91 er91Var) {
        ft91 ft91Var;
        if (er91Var != null) {
            int i = mr91.b;
            ft91Var = new ft91(er91Var, e9k.q());
        } else {
            ft91Var = null;
        }
        this.g = ft91Var;
    }
}

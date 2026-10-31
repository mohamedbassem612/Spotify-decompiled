package p;

import android.view.ViewGroup;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tte0 implements rdo0 {
    public final ute0 a;
    public final iu30 b;
    public boolean c;
    public boolean d;
    public final xm41 e;
    public final xm41 f;
    public final t4t g;
    public final ViewGroup h;
    public final gj5 i;
    public final Set j;
    public final Set k;
    public final llm l;
    public boolean m;
    public final rte0 n;

    public tte0(ute0 ute0Var, iu30 iu30Var, boolean z, boolean z2) {
        this.a = ute0Var;
        this.b = iu30Var;
        this.c = z;
        this.d = z2;
        this.e = ute0Var.a;
        this.f = ute0Var.b;
        this.g = ute0Var.f.p0();
        this.h = ute0Var.l;
        gj5 gj5Var = ute0Var.e;
        this.i = gj5Var;
        this.j = ute0Var.i;
        this.k = ute0Var.j;
        fns fnsVar = igu.a;
        bs50 bs50Var = pyf0.a;
        j0d1 j0d1VarB = guo1.B();
        bs50Var.getClass();
        this.l = smo1.e(flo1.l(bs50Var, j0d1VarB));
        rte0 rte0Var = new rte0(this);
        this.n = rte0Var;
        ute0Var.m.i();
        ((f0i) gj5Var).a.a(rte0Var);
    }

    public final void a() {
        ute0 ute0Var = this.a;
        i94 i94Var = ute0Var.g;
        i94Var.e("session_ui_plugins_on_ui_visible");
        Iterator it = ute0Var.c.iterator();
        while (it.hasNext()) {
            ((iyf0) it.next()).c();
        }
        i94Var.a("session_ui_plugins_on_ui_visible");
        ute0Var.d.b(b4t.a);
    }

    @Override // p.rdo0
    public final void dispose() {
        ((f0i) this.a.e).a.d(this.n);
        smo1.p(this.l, (CancellationException) null);
    }
}

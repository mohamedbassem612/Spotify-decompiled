package p;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ht91 extends gda {
    public final /* synthetic */ kt91 a;
    public final /* synthetic */ yq91 b;
    public final /* synthetic */ yq91 c;
    public final /* synthetic */ fe81 d;

    public ht91(kt91 kt91Var, yq91 yq91Var, yq91 yq91Var2, fe81 fe81Var) {
        this.a = kt91Var;
        this.b = yq91Var;
        this.c = yq91Var2;
        this.d = fe81Var;
    }

    public final void a(kda kdaVar, int i) {
        kt91 kt91Var = this.a;
        Iterator it = o7h.l1(kt91Var.f).iterator();
        while (it.hasNext()) {
            ((xq91) it.next()).b();
        }
        ArrayList arrayList = ((kda) this.b).l;
        if (arrayList != null) {
            arrayList.remove(this);
        }
        m6w0 m6w0Var = (m6w0) kt91Var.i.a.getValue();
        if (u890.j(m6w0Var != null ? m6w0Var.a : null, this.c)) {
            this.d.invoke();
        }
    }

    public final void b(kda kdaVar) {
        Iterator it = o7h.l1(this.a.f).iterator();
        while (it.hasNext()) {
            ((xq91) it.next()).a(this.c);
        }
    }
}
